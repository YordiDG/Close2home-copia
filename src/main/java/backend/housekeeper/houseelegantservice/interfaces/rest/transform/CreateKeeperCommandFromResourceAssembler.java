package backend.housekeeper.houseelegantservice.interfaces.rest.transform;

import backend.housekeeper.houseelegantservice.domain.model.command.CreateKeeperCommand;
import backend.housekeeper.houseelegantservice.interfaces.rest.resources.CreateKeeperResource;

public class CreateKeeperCommandFromResourceAssembler {
    public static CreateKeeperCommand toCommandFromResource(CreateKeeperResource resource){
        return new CreateKeeperCommand(resource.name(), resource.country(), resource.city(),
                resource.streetAddress(), resource.description(), resource.photoUrl(), resource.rating());
    }
}
