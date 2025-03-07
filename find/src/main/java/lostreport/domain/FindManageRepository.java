package lostreport.domain;

import java.util.Date;
import java.util.List;
import lostreport.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "findManages",
    path = "findManages"
)
public interface FindManageRepository
    extends PagingAndSortingRepository<FindManage, String> {}
