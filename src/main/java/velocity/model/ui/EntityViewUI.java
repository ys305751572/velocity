package velocity.model.ui;

import velocity.model.AddModel;
import velocity.model.EntityModel;
import velocity.model.ListModel;
import velocity.model.QueryModel;
import velocity.model.UpdateModel;
import velocity.model.ViewModel;

public class EntityViewUI {

	private EntityModel entityModel;
	private ListModel listModel;
	private QueryModel queryModel;
	private AddModel addModel;
	private UpdateModel updateModel;
	private ViewModel viewModel;

	public EntityViewUI(EntityModel entityModel) {
		this.entityModel = entityModel;
	}

	public EntityModel getEntityModel() {
		return entityModel;
	}

	public void setEntityModel(EntityModel entityModel) {
		this.entityModel = entityModel;
	}

	public ListModel getListModel() {
		return listModel;
	}

	public void setListModel(ListModel listModel) {
		this.listModel = listModel;
	}

	public QueryModel getQueryModel() {
		return queryModel;
	}

	public void setQueryModel(QueryModel queryModel) {
		this.queryModel = queryModel;
	}

	public AddModel getAddModel() {
		return addModel;
	}

	public void setAddModel(AddModel addModel) {
		this.addModel = addModel;
	}

	public UpdateModel getUpdateModel() {
		return updateModel;
	}

	public void setUpdateModel(UpdateModel updateModel) {
		this.updateModel = updateModel;
	}

	public ViewModel getViewModel() {
		return viewModel;
	}

	public void setViewModel(ViewModel viewModel) {
		this.viewModel = viewModel;
	}

}
