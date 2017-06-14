package sample.data.jest.aws;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ImageRepository extends ElasticsearchRepository<Image, String> {
	
	List<Image> findByCaptionContainingIgnoreCase(String caption,Pageable page);
	
	List<Image> findByCaptionContainingIgnoreCase(String caption);

}
