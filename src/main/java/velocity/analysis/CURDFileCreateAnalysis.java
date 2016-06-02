package velocity.analysis;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import velocity.file.ControllerNewFile;
import velocity.file.DaoNewFile;
import velocity.file.NewFile;
import velocity.file.ServiceImplNewfile;
import velocity.file.ServiceNewFile;
import velocity.model.EntityModel;
import velocity.model.ui.EntityViewUI;

public class CURDFileCreateAnalysis {

	private static final Logger logger = LoggerFactory.getLogger(CURDFileCreateAnalysis.class);

	public static List<NewFile> getCreateFileList(String projectPath, EntityViewUI entityUI) {
		List<NewFile> newFiles = new ArrayList();
		createDaoImplFile(projectPath, entityUI, entityUI.getEntityModel(), newFiles);
		createServiceFile(projectPath, entityUI, entityUI.getEntityModel(), newFiles);
		createServiceImplFile(projectPath, entityUI, entityUI.getEntityModel(), newFiles);
		createControllerFile(projectPath, entityUI, entityUI.getEntityModel(), newFiles);
		return newFiles;
	}

	private static void createControllerFile(String projectPath, EntityViewUI entityUI, EntityModel entityModel,
			List<NewFile> newFiles) {
		ControllerNewFile controllerNewFile = new ControllerNewFile(entityModel.getName(), projectPath, entityModel.getPackpageName(), entityUI);
		newFiles.add(controllerNewFile);
	}

	private static void createDaoImplFile(String projectPath, EntityViewUI entityUI, EntityModel entityModel,
			List<NewFile> newFiles) {
		DaoNewFile daoNewFile = new DaoNewFile(entityModel.getName(), projectPath, entityModel.getPackpageName(), entityModel);
		newFiles.add(daoNewFile);
	}

	private static void createServiceFile(String projectPath, EntityViewUI entityUI, EntityModel entityModel,
			List<NewFile> newFiles) {
		ServiceNewFile serviceNewFile = new ServiceNewFile(entityModel.getName(), projectPath, entityModel.getPackpageName(), entityModel);
		newFiles.add(serviceNewFile);
	}

	private static void createServiceImplFile(String projectPath, EntityViewUI entityUI, EntityModel entity,
			List<NewFile> newFiles) {
		ServiceImplNewfile serviceImplNewfile = new ServiceImplNewfile(entity.getName() + "ServiceImpl", projectPath, entity.getPackpageName(), entity, entityUI);
		newFiles.add(serviceImplNewfile);
	}
}