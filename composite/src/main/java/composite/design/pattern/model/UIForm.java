package composite.design.pattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajesh
 * 
 * UIForm can not be leaf.It can have children.
 *
 */
public class UIForm implements UIComponent{
	
	private List<UIComponent> children;
	private UIComponent parent;
	
	public UIForm(){
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
		this.parent = parent;
		
	}

	@Override
	public UIComponent getParent() {
		return parent;
	}
	
	@Override
	public String toString(){
		return "UIForm";
	}

}
