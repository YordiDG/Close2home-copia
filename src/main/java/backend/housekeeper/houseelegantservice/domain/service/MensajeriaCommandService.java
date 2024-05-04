package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.command.CreateMensajeriaCommand;

public interface MensajeriaCommandService {
    Long handle(CreateMensajeriaCommand command);

}
