package sample.data.jest.aws;

import java.io.FileNotFoundException;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;



@SpringBootApplication(exclude = {ElasticsearchAutoConfiguration.class, ElasticsearchDataAutoConfiguration.class})
public class ImageLoaderApplication implements CommandLineRunner {

	@Autowired
	private ImageRepository repository;

	@Override
	public void run(String... args) throws Exception {
		//this.repository.deleteAll();
		saveImages();

	}

	private void saveImages() throws FileNotFoundException {
		/**
		CSVToImageMapper loader= new CSVToImageMapper();
		Iterator<Image> itr=loader.getImages().iterator();

		while(itr.hasNext()){
			this.repository.save(itr.next());
		}
		 */
		this.repository.save(new Image("3000","Allstar Red Geometric Thick Area Rug (4' 11\" x 6' 11\")","http://allstarrugs.com/media/Watermark/358656-redd_1.jpg","20","10"));
		this.repository.save(new Image("2000","Blue Shirt","http://www.merchmethod.com/prod_images/xlarge/AJ019.jpg", "20","10"));
		this.repository.save(new Image("1000","Dallas Cowboys Basic Wool Logo Cap","http://nflshop.frgimages.com/FFImage/thumb.aspx?i=/productImages%2f_72000%2fFF_72206_xl.jpg&w=600","25","15"));
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ImageLoaderApplication.class).close();
	}

}
