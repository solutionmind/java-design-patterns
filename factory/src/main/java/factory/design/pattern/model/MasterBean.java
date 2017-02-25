package factory.design.pattern.model;

public class MasterBean {
	private int id;
	
	private String message;
	
	private ChildBean childBean;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ChildBean getChildBean() {
		return childBean;
	}

	public void setChildBean(ChildBean childBean) {
		this.childBean = childBean;
	}
}
