package composite.design.pattern.model;

import java.util.List;

/**
 * @author rajesh
 * 
 * UIButton is a leaf in tree.
 *
 */
public class UIButton implements UIComponent{

	private List<UIComponent> children;
	private UIComponent parent;
	
	public UIButton(){
		children = null;
	}

	@Override
	public void addChildren(UIComponent children) {
		
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
		this.parent = parent;
		
	}

	@Override
	public UIComponent getParent() {
		return parent;
	}
	
	@Override
	public String toString(){
		return "UIButton";
	}

}
