package backend.housekeeper.houseelegantservice.interfaces.rest.transform;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.House;
import backend.housekeeper.houseelegantservice.interfaces.rest.resources.HouseResource;

public class HouseResourceFromEntityAssembler {
    public static HouseResource toResourceFromEntity(House house){
        return new HouseResource(house.getId(), house.getCountry(), house.getCity(), house.getStreetAddress(),
                house.getPrice(), house.getCapacity(), house.getRating(), house.getPhotoUrl());
    }
}
