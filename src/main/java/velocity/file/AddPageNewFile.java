package velocity.file;

import java.io.IOException;
import java.text.MessageFormat;

import org.apache.velocity.VelocityContext;

import velocity.model.AddModel;
import velocity.model.ListModel;
import velocity.model.QueryModel;
import velocity.model.ui.EntityViewUI;
import velocity.util.VelocityContextUtils;
import velocity.util.VelocityUtil;

public class AddPageNewFile extends NewFile {

	private static final String TEMPLATE_PATH = "add.jsp.vm";

	private AddModel addModel;

	public AddPageNewFile(String name, String projectPath, String packageName, EntityViewUI ui) {
		super(name, projectPath, packageName);
		this.addModel = ui.getAddModel();
	}

	@Override
	public void process() {
		VelocityContext context = VelocityContextUtils.getVelocityContext();
		context.put("addClass", this);
		try {
			VelocityUtil.vmToFile(context, TEMPLATE_PATH, getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getPath() {
		String packageName = getPackageName().replaceAll("\\.", "/");
		
		packageName = packageName.substring(0, packageName.indexOf("/entity"));
		String targetPath = MessageFormat.format("{0}/src/main/java/{1}/{2}/{3}.jsp",
				new Object[] { this.projectPath, packageName, this.name, "add" });
		return targetPath;
	}
}
