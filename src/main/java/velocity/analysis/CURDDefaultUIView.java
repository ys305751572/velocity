package velocity.analysis;

import java.util.List;
import java.util.Map;

import velocity.model.AddModel;
import velocity.model.EntityModel;
import velocity.model.ListModel;
import velocity.model.QueryModel;
import velocity.model.ui.EntityViewUI;
import velocity.model.ui.UIWidget;

public class CURDDefaultUIView {
	
	public static EntityViewUI getDefaultEntityViewUI(EntityModel entity, Map<String, List<UIWidget>> map) {
		EntityViewUI ui = new EntityViewUI(entity);
		createListPage(ui,map.get("list"));
		createQueryPage(ui,map.get("query"));
		createAddPage(ui,map.get("add"));
		return ui;
	}

	private static void createAddPage(EntityViewUI ui, List<UIWidget> list) {
		ui.setAddModel(new AddModel(list));
	}

	private static void createQueryPage(EntityViewUI ui, List<UIWidget> list) {
		ui.setQueryModel(new QueryModel(list));
	}

	private static void createListPage(EntityViewUI ui, List<UIWidget> list) {
		ui.setListModel(new ListModel(list));
	}
}
