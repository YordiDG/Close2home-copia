package backend.housekeeper.houseelegantservice.application.internal.commandservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.House;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateHouseCommand;
import backend.housekeeper.houseelegantservice.domain.service.HouseCommandService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.HouseRepository;
import org.springframework.stereotype.Service;

@Service
public class HouseCommandServiceImpl implements HouseCommandService {
    private final HouseRepository houseRepository;

    public HouseCommandServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public Long handle(CreateHouseCommand command) {
        var house = new House(command.country(), command.city(), command.streetAddress(),
                command.price(), command.capacity(), command.rating(), command.photoUrl());
        houseRepository.save(house);
        return house.getId();
    }
}
