package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.House;
import backend.housekeeper.houseelegantservice.domain.model.query.GetAllHousesQuery;
import backend.housekeeper.houseelegantservice.domain.model.query.GetHouseByIdQuery;

import java.util.List;
import java.util.Optional;

public interface HouseQueryService {
    Optional<House> handle(GetHouseByIdQuery query);
    List<House> handle(GetAllHousesQuery query);
}
