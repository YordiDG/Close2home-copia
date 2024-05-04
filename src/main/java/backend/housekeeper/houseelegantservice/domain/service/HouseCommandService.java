package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.command.CreateHouseCommand;

public interface HouseCommandService {
    Long handle(CreateHouseCommand command);
}
