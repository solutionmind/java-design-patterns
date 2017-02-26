package composite.design.pattern.model;

import java.util.List;

/**
 * @author rajesh
 * 
 * UIInputBox is a leaf in tree.
 *
 */
public class UIInputBox implements UIComponent {

	private List<UIComponent> children;
	private UIComponent parent;
	
	public UIInputBox(){
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
		return "UIInputBox";
	}

}
