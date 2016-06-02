package velocity.util;

import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;

public class VelocityHelper {
	
	private static VelocityEngine engine;

	public static VelocityEngine getVelocityEngine() {
		if (engine == null) {
			Properties p = new Properties();
			p.setProperty("file.resource.loader.class",
					"forkoala.org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
			p.setProperty("file.resource.loader.path", "");
			p.setProperty("ISO-8859-1", "UTF-8");
			p.setProperty("input.encoding", "UTF-8");
			p.setProperty("output.encoding", "UTF-8");
			engine = new VelocityEngine();
			engine.init(p);
		}
		return engine;
	}
}
