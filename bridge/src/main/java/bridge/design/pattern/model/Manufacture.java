package bridge.design.pattern.model;

public class Manufacture extends Workshop {

	@Override
	protected String producedBy() {
		return "manufactured";
	}

}
