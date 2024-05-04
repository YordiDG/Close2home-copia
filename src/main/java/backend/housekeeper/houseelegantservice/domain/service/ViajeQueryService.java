package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.query.GetViajeAllQuery;
import backend.housekeeper.houseelegantservice.domain.model.query.GetViajeByIdQuery;

import java.util.List;
import java.util.Optional;

public interface ViajeQueryService {
    Optional<Viaje> handle(GetViajeByIdQuery query);
    List<Viaje> handle(GetViajeAllQuery query);
}
