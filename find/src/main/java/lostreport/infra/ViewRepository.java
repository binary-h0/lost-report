package lostreport.infra;

import java.util.List;
import lostreport.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "views", path = "views")
public interface ViewRepository
    extends PagingAndSortingRepository<View, Long> {}
