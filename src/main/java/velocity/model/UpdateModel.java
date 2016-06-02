package velocity.model;

import java.util.List;

import velocity.model.ui.Model;
import velocity.model.ui.UIWidget;

public class UpdateModel implements Model{

	private List<UIWidget> list;
	
	public UpdateModel(List<UIWidget> list) {
		this.list = list;
	}
	
	public List<UIWidget> getUIWidget() {
		return list;
	}

	public void setList(List<UIWidget> list) {
		this.list = list;
	}
}
