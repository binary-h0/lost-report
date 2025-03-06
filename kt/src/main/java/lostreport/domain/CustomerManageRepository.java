package lostreport.domain;

import lostreport.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "customerManages",
    path = "customerManages"
)
public interface CustomerManageRepository
    extends PagingAndSortingRepository<CustomerManage, String> {}
