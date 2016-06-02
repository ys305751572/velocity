package velocity.file;

import java.io.IOException;
import java.text.MessageFormat;

import org.apache.velocity.VelocityContext;

import velocity.model.EntityModel;
import velocity.model.ui.EntityViewUI;
import velocity.util.VelocityContextUtils;
import velocity.util.VelocityUtil;

public class ControllerNewFile extends NewFile {

	private static final String TEMPLATE_PATH = "controllerTemplate.vm";

	private EntityModel entityModel;

	public ControllerNewFile(String name, String projectName, String packageName, EntityViewUI entityViewUI) {
		super(name, projectName, packageName);
		entityModel = entityViewUI.getEntityModel();
	}

	public String getPath() {
		String[] temparr = this.entityModel.getClassName().split("\\.");
		String lastPackageName = temparr[(temparr.length - 2)];
		String targetPath = MessageFormat.format("{0}/src/main/java/{1}/{2}/{3}.java",
				new Object[] { this.projectPath, getPackageName().replaceAll("\\.", "/"), lastPackageName, getName() });
		return targetPath;
	}

	@Override
	public void process() {
		
		VelocityContext context = VelocityContextUtils.getVelocityContext();
		context.put("controllerClass", this);
		try {
			VelocityUtil.vmToFile(context, TEMPLATE_PATH, getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
