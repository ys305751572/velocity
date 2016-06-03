package velocity.test;

import java.util.List;
import velocity.analysis.CURDCoreAnalysis;
import velocity.analysis.CURDDefaultUIView;
import velocity.analysis.CURDFileCreateAnalysis;
import velocity.core.CodeGenerator;
import velocity.file.NewFile;
import velocity.model.EntityModel;
import velocity.model.ui.EntityViewUI;

public class Test {

	public static void main(String[] args) {

		String path = "F:/workspace_velocity/velocity/src/main/java/velocity/book/entity/Book.java";

		CURDCoreAnalysis util = CURDCoreAnalysis.getInstance();
		EntityModel entity = util.analysis(path);

		EntityViewUI entityViewUI = CURDDefaultUIView.getDefaultEntityViewUI(entity);
		String projectPath = path.substring(0, path.indexOf("/src/main/java/"));
		List<NewFile> createFiles = CURDFileCreateAnalysis.getCreateFileList(projectPath, entityViewUI);
		try {
			CodeGenerator.generateCode(createFiles, entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
