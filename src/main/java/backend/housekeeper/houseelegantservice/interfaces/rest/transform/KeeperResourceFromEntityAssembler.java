package backend.housekeeper.houseelegantservice.interfaces.rest.transform;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Keeper;
import backend.housekeeper.houseelegantservice.interfaces.rest.resources.KeeperResource;

public class KeeperResourceFromEntityAssembler {
    public static KeeperResource toResourceFromEntity(Keeper keeper){
        return new KeeperResource(keeper.getId(), keeper.getName(), keeper.getCountry(), keeper.getCity(),
                keeper.getStreetAddress(), keeper.getDescription(), keeper.getPhotoUrl(), keeper.getRating());
    }
}
