package composite.design.pattern.model;

import java.util.List;

public interface UIComponent {
	
	public void addChildren(UIComponent children);
	
	public List<UIComponent> getChildren();
	
	public int getChildrenCount();
	
	public void setParent(UIComponent parent);
	
	public UIComponent getParent();

}
