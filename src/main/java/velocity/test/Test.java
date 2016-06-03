package velocity.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import velocity.analysis.CURDCoreAnalysis;
import velocity.analysis.CURDDefaultUIView;
import velocity.analysis.CURDFileCreateAnalysis;
import velocity.core.CodeGenerator;
import velocity.file.NewFile;
import velocity.model.EntityModel;
import velocity.model.ui.EntityViewUI;
import velocity.model.ui.UIWidget;

public class Test {

	public static void main(String[] args) {
		
		String path = "F:/workspace_velocity/velocity/src/main/java/velocity/book/entity/Book.java";

		List<UIWidget> queryList = initQuery();
		List<UIWidget> listList = initList();
		List<UIWidget> addList = initAdd();
		
		Map<String,List<UIWidget>> map = new HashMap<String,List<UIWidget>>();
		map.put("query", queryList);
		map.put("list", listList);
		map.put("add", addList);
		
		CURDCoreAnalysis util = CURDCoreAnalysis.getInstance();
		EntityModel entity = util.analysis(path);

		EntityViewUI entityViewUI = CURDDefaultUIView.getDefaultEntityViewUI(entity,map);
		String projectPath = path.substring(0, path.indexOf("/src/main/java/"));
		List<NewFile> createFiles = CURDFileCreateAnalysis.getCreateFileList(projectPath, entityViewUI);
		try {
			CodeGenerator.generateCode(createFiles, entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<UIWidget> initQuery(){
		List<UIWidget> list = new ArrayList<UIWidget>();
		return list;
	}
		
	public static List<UIWidget> initList(){
		List<UIWidget> list = new ArrayList<UIWidget>();
		return list;
	}
	
	public static List<UIWidget> initAdd(){
		List<UIWidget> list = new ArrayList<UIWidget>();
		return list;
	}
}