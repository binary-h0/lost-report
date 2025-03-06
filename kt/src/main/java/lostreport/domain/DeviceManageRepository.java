package lostreport.domain;

import lostreport.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "deviceManages",
    path = "deviceManages"
)
public interface DeviceManageRepository
    extends PagingAndSortingRepository<DeviceManage, String> {}
