package backend.housekeeper.houseelegantservice.interfaces.rest.transform;

import backend.housekeeper.houseelegantservice.domain.model.command.CreateHouseCommand;
import backend.housekeeper.houseelegantservice.interfaces.rest.resources.CreateHouseResource;

public class CreateHouseCommandFromResourceAssembler {
    public static CreateHouseCommand toCommandFromResource(CreateHouseResource resource){
        return new CreateHouseCommand(resource.country(), resource.city(), resource.streetAddress(),
                resource.price(), resource.capacity(), resource.rating(), resource.photoUrl());
    }
}
