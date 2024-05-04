package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.housekeeper.houseelegantservice.domain.model.query.GetAllMensajesQuery;
import backend.housekeeper.houseelegantservice.domain.model.query.GetMensajeriaByIdQuery;
import java.util.List;
import java.util.Optional;

public interface MensajeriaQueryService {
    Optional<Mensajeria> handle(GetMensajeriaByIdQuery query);
    List<Mensajeria> handle(GetAllMensajesQuery query);
}
