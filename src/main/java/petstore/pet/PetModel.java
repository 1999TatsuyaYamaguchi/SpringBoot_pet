package petstore.pet;

public class PetModel {
	Long id;
	Category category;
	String name;
	String photoUrl;
	Tag tag;
	String status;

	public PetModel(Long id, Category category, String name, String photoUrl, Tag tag, String status) {
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrl = photoUrl;
		this.tag = tag;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
