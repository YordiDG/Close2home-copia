package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Keeper;
import backend.housekeeper.houseelegantservice.domain.model.query.GetAllKeepersQuery;
import backend.housekeeper.houseelegantservice.domain.model.query.GetKeeperByIdQuery;

import java.util.List;
import java.util.Optional;

public interface KeeperQueryService {
    Optional<Keeper> handle(GetKeeperByIdQuery query);
    List<Keeper> handle(GetAllKeepersQuery query);
}
