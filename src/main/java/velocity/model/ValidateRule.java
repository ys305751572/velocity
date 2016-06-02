package velocity.model;

public enum ValidateRule {
	Email("邮箱"), Mobile("手机号码"), TelePhone("电话号码"), IdCard("身份证"), Number("数字类型"), URL(
			"URL链接"), English("英文字符"), Chinese("中文字符"), Regex("正则表达式");

	private final String ruleName;

	private ValidateRule(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public static ValidateRule string2Enum(String ruleName) {
		if ((ruleName == null) || ("".equals(ruleName))) {
			return null;
		}
		ValidateRule[] rules = values();
		for (ValidateRule validateRule : rules) {
			if (validateRule.getRuleName().equals(ruleName)) {
				return validateRule;
			}
		}
		return null;
	}
}
