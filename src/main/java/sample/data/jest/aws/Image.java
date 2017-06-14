package sample.data.jest.aws;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "image", type = "image", shards = 1, replicas = 0, refreshInterval = "-1")
public class Image {

	@Id
	private String id;

	private String caption;

	private String height;

	private String width;

	private String imageURL;

	public Image(){
		
	}

	public Image(String id, String caption,String imageURL, String height, String width){
		this.id = id;
		this.caption = caption;
		this.imageURL = imageURL;
		this.height = height;
		this.width =width;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) Math.random();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", imageURL=" + imageURL + ", caption=" + caption+ ", height=" + height + ", width=" + width +"]";
	}


}
