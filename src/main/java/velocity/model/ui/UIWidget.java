package velocity.model.ui;

import velocity.model.ColunmType;
import velocity.model.ValidateRule;

public class UIWidget {

	protected String id;
    protected String name;
    protected String defaultValue;
    protected String express;
    protected ColunmType colunmType;
    protected boolean required;
    protected ValidateRule validateRule;
    protected String validateExpress;
    
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
