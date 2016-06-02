package velocity.file;

import java.io.IOException;
import java.text.MessageFormat;

import org.apache.velocity.VelocityContext;

import velocity.model.EntityModel;
import velocity.model.ui.EntityViewUI;
import velocity.util.VelocityContextUtils;
import velocity.util.VelocityUtil;

public class ServiceImplNewfile extends NewFile {

	private EntityModel entityModel;
	private EntityViewUI entityViewUI;

	 private static final String TEMPLATE_PATH = "serviceImplTemplate.vm";
	
	public ServiceImplNewfile(String name, String projectPath, String packageName, EntityModel entityModel,
			EntityViewUI entityViewUI) {
		super(name, projectPath, packageName);
		this.entityModel = entityModel;
		this.entityViewUI = entityViewUI;
	}

	public String getPath() {
		String targetPath = MessageFormat.format("{0}/src/main/java/{1}/{2}.java",
				new Object[] { this.projectPath, getPackageName().replaceAll("\\.", "/"), getName() });
		return targetPath;
	}

	@Override
	public void process() {
		VelocityContext context = VelocityContextUtils.getVelocityContext();
		context.put("facadeImplClass", this);
		try {
			VelocityUtil.vmToFile(context, TEMPLATE_PATH, getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
