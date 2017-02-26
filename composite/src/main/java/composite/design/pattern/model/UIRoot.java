package composite.design.pattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajesh
 * 
 * UIRoot can not be leaf.It can have children.It is parents for all UIComponents.
 *
 */
public class UIRoot implements UIComponent {
	
	private UIComponent parent;
	private List<UIComponent> children;
	
	public UIRoot(){
		this.parent = null;
		children = new ArrayList<>();
	}

	@Override
	public void addChildren(UIComponent children) {
		this.children.add(children);
		
	}

	@Override
	public List<UIComponent> getChildren() {
		return children;
	}

	@Override
	public int getChildrenCount() {
		return children.size();
	}

	@Override
	public void setParent(UIComponent parent) {
		
	}

	@Override
	public UIComponent getParent() {
		return parent;
	}
	
	@Override
	public String toString(){
		return "UIRoot";
	}

}
