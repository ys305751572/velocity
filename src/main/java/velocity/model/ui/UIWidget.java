package velocity.model.ui;

import velocity.model.ColunmType;
import velocity.model.ValidateRule;

public class UIWidget {

	protected String id;                     // id
    protected String name;                   // 字段名字
    protected String defaultValue;           // 默认值
    protected String express;                
    protected ColunmType colunmType;         // 字段类型  defualtText,image,richText
    protected boolean required;              // 是否必填
    protected ValidateRule validateRule;     // 验证表达式
    protected String validateExpress;        // 自定义表达式
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getExpress() {
		return express;
	}
	public void setExpress(String express) {
		this.express = express;
	}
	public ColunmType getColunmType() {
		return colunmType;
	}
	public void setColunmType(ColunmType colunmType) {
		this.colunmType = colunmType;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public ValidateRule getValidateRule() {
		return validateRule;
	}
	public void setValidateRule(ValidateRule validateRule) {
		this.validateRule = validateRule;
	}
	public String getValidateExpress() {
		return validateExpress;
	}
	public void setValidateExpress(String validateExpress) {
		this.validateExpress = validateExpress;
	}
	  
	  
}
