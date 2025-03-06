package lostreport.domain;

import lostreport.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "remoteManages",
    path = "remoteManages"
)
public interface RemoteManageRepository
    extends PagingAndSortingRepository<RemoteManage, String> {}
