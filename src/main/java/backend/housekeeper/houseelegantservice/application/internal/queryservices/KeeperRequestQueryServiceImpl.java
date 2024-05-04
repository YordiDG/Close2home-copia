package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import backend.housekeeper.houseelegantservice.domain.model.query.GetKeeperRequestAllQuery;
import backend.housekeeper.houseelegantservice.domain.model.query.GetKeeperRequestByIdQuery;
import backend.housekeeper.houseelegantservice.domain.service.KeeperRequestQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.KeeperRequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KeeperRequestQueryServiceImpl implements KeeperRequestQueryService {

    private final KeeperRequestRepository keeperRequestRepository;

    public KeeperRequestQueryServiceImpl(KeeperRequestRepository keeperRequestRepository) {
        this.keeperRequestRepository = keeperRequestRepository;
    }

    @Override
    public Optional<KeeperRequest> handle(GetKeeperRequestByIdQuery query) {
        return keeperRequestRepository.findById(query.requestId());
    }

    @Override
    public List<KeeperRequest> handle(GetKeeperRequestAllQuery query) {
        return keeperRequestRepository.findAll();
    }
}