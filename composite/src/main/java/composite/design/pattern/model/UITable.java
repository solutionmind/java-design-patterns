package composite.design.pattern.model;

import java.util.List;

/**
 * @author rajesh
 * 
 * UITable can not be leaf.It can have children.
 *
 */
public class UITable implements UIComponent {

	private List<UIComponent> children;
	private UIComponent parent;
	
	public UITable(){
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
		return "UITable";
	}

}
