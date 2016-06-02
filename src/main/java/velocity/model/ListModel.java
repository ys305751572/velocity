package velocity.model;

import java.util.List;

import velocity.model.ui.Model;
import velocity.model.ui.UIWidget;

public class ListModel implements Model{

	private List<UIWidget> list;
	
	public ListModel(List<UIWidget> list) {
		this.list = list;
	}
	
	public List<UIWidget> getUIWidget() {
		return list;
	}

	public void setList(List<UIWidget> list) {
		this.list = list;
	}
}
