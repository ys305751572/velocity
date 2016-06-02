package velocity.analysis;

import java.util.ArrayList;
import java.util.List;

import velocity.model.AddModel;
import velocity.model.EntityModel;
import velocity.model.FieldModel;
import velocity.model.ListModel;
import velocity.model.PersistenceFieldModel;
import velocity.model.QueryModel;
import velocity.model.UpdateModel;
import velocity.model.ViewModel;
import velocity.model.ui.EntityViewUI;
import velocity.model.ui.UIWidget;

public class CURDDefaultUIView {
	
	public static EntityViewUI getDefaultEntityViewUI(EntityModel entity) {
		EntityViewUI ui = new EntityViewUI(entity);

//		List<PersistenceFieldModel> persistenceFieldModels = entity.getPersistenceFieldModel();
//
//		List<UIWidget> queryViews = new ArrayList();
//		for (FieldModel persistenceFieldModel : persistenceFieldModels) {
//			UIWidget view = getDefaultActionView(persistenceFieldModel);
//			queryViews.add(view);
//		}
//		QueryModel queryModel = new QueryModel(queryViews);
//		ui.setQueryModel(queryModel);
//
//		List<UIWidget> displayViews = new ArrayList();
//		for (FieldModel persistenceFieldModel : persistenceFieldModels) {
//			UIWidget view = getDefaultDisplayView(persistenceFieldModel);
//			displayViews.add(view);
//		}
//		ListModel listModel = new ListModel(displayViews);
//		ui.setListModel(listModel);
//
//		List<UIWidget> addViews = new ArrayList();
//		for (FieldModel persistenceFieldModel : persistenceFieldModels) {
//			UIWidget view = getDefaultActionView(persistenceFieldModel);
//			addViews.add(view);
//		}
//		AddModel addModel = new AddModel(addViews);
//		ui.setAddModel(addModel);
//
//		List<UIWidget> updatesViews = new ArrayList();
//		for (FieldModel persistenceFieldModel : persistenceFieldModels) {
//			UIWidget view = getDefaultActionView(persistenceFieldModel);
//			updatesViews.add(view);
//		}
//		UpdateModel updateModel = new UpdateModel(updatesViews);
//		ui.setUpdateModel(updateModel);
//
//		List<UIWidget> detailViews = new ArrayList();
//		for (FieldModel persistenceFieldModel : persistenceFieldModels) {
//			UIWidget view = getDefaultDisplayView(persistenceFieldModel);
//			detailViews.add(view);
//		}
//		ViewModel viewModel = new ViewModel(detailViews);
		
		return ui;
	}

//	private static TabModel getDefaultView(EntityModel entity) {
//		List<PersistenceFieldModel> persistenceFieldModels = entity.getPersistenceFieldModel();
//
//		List<UIWidget> displayViews = new ArrayList();
//		for (FieldModel persistenceFieldModel : persistenceFieldModels) {
//			UIWidget view = getDefaultDisplayView(persistenceFieldModel);
//			displayViews.add(view);
//		}
//		return new TabModel(displayViews);
//	}
//
//	private static UIWidget getDefaultDisplayView(FieldModel fieldModel) {
//		ReadOnlyView readOnlyView = ReadOnlyView.createDateViewFromFieldModel(fieldModel);
//		return readOnlyView;
//	}
//
//	private static UIWidget getDefaultActionView(FieldModel fieldModel) {
//		String type = fieldModel.getType();
//		if ((Date.class.getName().equals(type)) || (Timestamp.class.getName().equals(type))) {
//			DateView dateView = DateView.createDateViewFromFieldModel(fieldModel);
//			return dateView;
//		}
//		TextView textView = TextView.createDateViewFromFieldModel(fieldModel);
//		return textView;
//	}
}
