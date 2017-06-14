package sample.data.jest.aws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

public class CSVToImageMapper {

	@SuppressWarnings({"rawtypes", "unchecked"})
	public List<Image> getImages() throws FileNotFoundException {
		CsvToBean csv = new CsvToBean();
        
        String csvFilename = "/Users/vvijayarangan/Documents/ProductListing.csv";
           CSVReader csvReader = new CSVReader(new FileReader(csvFilename), ',', '"', 2);
        
        //Set column mapping strategy
        List<Image> list = (List<Image> )csv.parse(setColumMapping(), csvReader);
        //System.out.println("No of Images = "+list.size());
        Iterator imgItr=list.iterator();
        while(imgItr.hasNext()){
        	//System.out.println(imgItr.next().toString());
        }
        return list;
        
     }
     
     @SuppressWarnings({"rawtypes", "unchecked"})
     private ColumnPositionMappingStrategy setColumMapping()
     {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Image.class);
        String[] columns = new String[] {"id", "caption", "imageURL", "height", "width"};
               strategy.setColumnMapping(columns);
        return strategy;
     }

}
