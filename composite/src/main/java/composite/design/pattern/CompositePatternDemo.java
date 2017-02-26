package composite.design.pattern;

import composite.design.pattern.model.UIButton;
import composite.design.pattern.model.UIComponent;
import composite.design.pattern.model.UIForm;
import composite.design.pattern.model.UIInputBox;
import composite.design.pattern.model.UIRoot;
import composite.design.pattern.model.UITable;

/**
 * @author rajesh
 * 
 * Composite Design Pattern Compose objects into tree structures to represent part-whole hierarchies. 
 * Composite lets clients treat individual objects and compositions of objects uniformly.
 * 
 * practically all over JSF UI
 *
 */
public class CompositePatternDemo {

	public static void main(String[] args) {
		
		UIComponent root = constructUIComponentTree(); //client knows only about UIComponent.
		
		for(UIComponent component :  root.getChildren()){
			System.out.println(component);
		}

	}
	
	private static UIComponent constructUIComponentTree(){
		UIComponent root = new UIRoot();
		
		UIComponent form = new UIForm();
		form.setParent(root);
		
		UIComponent inputBox = new UIInputBox();
		inputBox.setParent(form);
		
		UIComponent button = new UIButton();
		button.setParent(form);
		
		form.addChildren(inputBox);
		form.addChildren(button);
		
		UIComponent table = new UITable();
		table.setParent(root);
		
		root.addChildren(form);
		root.addChildren(table);
		
		return root;
	}

}
