package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.command.CreateKeeperCommand;

public interface KeeperCommandService {
    Long handle(CreateKeeperCommand command);
}
