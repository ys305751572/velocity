package velocity.analysis;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import velocity.model.EntityModel;

public class CURDCoreAnalysis {

	private static final Logger logger = LoggerFactory.getLogger(CURDCoreAnalysis.class);
	private Map<String, EntityModel> entityMap = new HashMap<String, EntityModel>();

	public static CURDCoreAnalysis getInstance() {
		return new CURDCoreAnalysis();
	}

	public EntityModel analysis(String srcPath) {
		String srcJava = srcPath.substring(srcPath.indexOf("/src/main/java") + 1 + "/src/main/java".length(),
				srcPath.lastIndexOf(".java"));
		srcJava = srcJava.replaceAll("/", ".");

		if (this.entityMap.containsKey(srcJava)) {
			return (EntityModel) this.entityMap.get(srcJava);
		}
		logger.info("==============对" + srcJava + "进行建模工作============");
		EntityModel entity = new EntityModel();
		this.entityMap.put(srcJava, entity);

		File file = new File(srcPath);
		ClassLoader classLoad = null;
		Class<?> classEntity = null;
		try {
//			URL url = file.toURI().toURL();
//			classLoad = new URLClassLoader(new URL[] { url });
			classLoad = Thread.currentThread().getContextClassLoader();
			classEntity = classLoad.loadClass(srcJava);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		entity.setPackpageName(classEntity.getPackage().getName());
		entity.setName(classEntity.getSimpleName());
		entity.setClassName(classEntity.getName());
		logger.info("==============对" + srcJava + "进行建模完成=============");
		return entity;
	}

}
