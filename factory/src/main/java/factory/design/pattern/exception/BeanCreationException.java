package factory.design.pattern.exception;

public class BeanCreationException extends RuntimeException {
	
	private static String message = "Exception occured while creating bean";

	private static final long serialVersionUID = 1L;
	
	public BeanCreationException(Exception e){
		super(message);
		e.printStackTrace();
	}

}
