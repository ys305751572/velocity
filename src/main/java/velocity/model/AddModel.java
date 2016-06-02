package velocity.model;

import java.util.List;

import velocity.model.ui.Model;
import velocity.model.ui.UIWidget;

public class AddModel implements Model{

	private List<UIWidget> list;
	
	public AddModel(List<UIWidget> list) {
		this.list = list;
	}
	
	public List<UIWidget> getUIWidget() {
		return list;
	}
	
	public void setUIWidget(List<UIWidget> list) {
		this.list = list;
	}
}
