package backend.housekeeper.houseelegantservice.interfaces.rest;

import backend.housekeeper.houseelegantservice.domain.model.command.CreateKeeperCommand;
import backend.housekeeper.houseelegantservice.domain.model.query.GetAllKeepersQuery;
import backend.housekeeper.houseelegantservice.domain.model.query.GetKeeperByIdQuery;
import backend.housekeeper.houseelegantservice.domain.service.KeeperCommandService;
import backend.housekeeper.houseelegantservice.domain.service.KeeperQueryService;
import backend.housekeeper.houseelegantservice.interfaces.rest.resources.CreateKeeperResource;
import backend.housekeeper.houseelegantservice.interfaces.rest.resources.KeeperResource;
import backend.housekeeper.houseelegantservice.interfaces.rest.transform.CreateKeeperCommandFromResourceAssembler;
import backend.housekeeper.houseelegantservice.interfaces.rest.transform.KeeperResourceFromEntityAssembler;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/keepers", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Keepers", description = "Keepers Management Endpoints")
public class KeepersController {
    private final KeeperCommandService keeperCommandService;
    private final KeeperQueryService keeperQueryService;

    public KeepersController(KeeperCommandService keeperCommandService, KeeperQueryService keeperQueryService) {
        this.keeperCommandService = keeperCommandService;
        this.keeperQueryService = keeperQueryService;
    }

    @PostMapping
    public ResponseEntity<KeeperResource> createKeeperResource(CreateKeeperResource resource){
        var createKeeperCommand = CreateKeeperCommandFromResourceAssembler.toCommandFromResource(resource);
        var keeperId = keeperCommandService.handle(createKeeperCommand);
        if(keeperId == 0L){
            return ResponseEntity.badRequest().build();
        }
        var getKeeperByIdQuery = new GetKeeperByIdQuery(keeperId);
        var keeper = keeperQueryService.handle(getKeeperByIdQuery);
        if(keeper.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        var keeperResoruce = KeeperResourceFromEntityAssembler.toResourceFromEntity(keeper.get());
        return new ResponseEntity<>(keeperResoruce, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<KeeperResource>> getAllKeepers(){
        var getAllKeepersQuery = new GetAllKeepersQuery();
        var keepers = keeperQueryService.handle(getAllKeepersQuery);
        var keeperResources = keepers.stream().map(KeeperResourceFromEntityAssembler::toResourceFromEntity).toList();
        return ResponseEntity.ok(keeperResources);
    }
}
