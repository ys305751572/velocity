package velocity.analysis;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
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

	public EntityModel analysis(String srcJava) {
		if (this.entityMap.containsKey(srcJava)) {
			return (EntityModel) this.entityMap.get(srcJava);
		}
		logger.info("==============对" + srcJava + "进行建模工作============");
		EntityModel entity = new EntityModel();
		this.entityMap.put(srcJava, entity);
		
		File file = new File(srcJava);
		URLClassLoader classLoad = null;
		Class<?> classEntity = null;
		try {
			URL url = file.toURI().toURL();
			classLoad = new URLClassLoader(new URL[]{url});
			classEntity = classLoad.loadClass(srcJava);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		entity.setName(classEntity.getSimpleName());
		entity.setClassName(classEntity.getName());
		logger.info("==============对" + srcJava + "进行建模完成=============");
		return entity;
	}

}
