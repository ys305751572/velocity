package velocity.file;

import java.io.IOException;
import java.text.MessageFormat;

import org.apache.velocity.VelocityContext;

import velocity.model.EntityModel;
import velocity.util.VelocityContextUtils;
import velocity.util.VelocityUtil;

public class ServiceNewFile extends NewFile {

	private static final String TEMPLATE_PATH = "serviceTemplate.vm";

	private EntityModel entityModel;

	public ServiceNewFile(String name, String projectPath, String packageName, EntityModel entityModel) {
		super(name, projectPath, packageName);
		this.entityModel = entityModel;
	}

	public String getPath() {
		String targetPath = MessageFormat.format("{0}/src/main/java/{1}/{2}.java", new Object[] { this.projectPath,
				getPackageName().replaceAll("\\.", "/").replaceAll("/dto", ""), getName() });
		return targetPath;
	}

	@Override
	public void process() {
		VelocityContext context = VelocityContextUtils.getVelocityContext();
		context.put("facadeClass", this);
		try {
			VelocityUtil.vmToFile(context, TEMPLATE_PATH, getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
