package db;

public class Exercise {
	
	private int id, categoryId;
	private String name;
	
	

	public Exercise(int id, int categoryId, String name) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Exercise() {
		// TODO Auto-generated constructor stub
	}

}
