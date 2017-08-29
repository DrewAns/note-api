package notes;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "notes", path = "notes")
public interface NoteRepository extends PagingAndSortingRepository<Note, Integer> {

}
