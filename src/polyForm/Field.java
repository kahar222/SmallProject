package polyForm;

public class Field {
	private String label = "undefined";
	  private Object value = "";
	  private Object defaultValue = "undefined";
	  
	  int labelDisplayLength = 20;
	  int valueDisplayLength = 30;
	  
	  static String nOf(String str, int nTimes) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < nTimes; i++) {
	      sb.append(str);
	    }
	    return sb.toString();    
	  }
	  
	  Field(String label) {
	    this.label = label;
	  }
	  
	  void setValue(Object value) {
	    this.value = value;
	  }
	  
	  void setDefaultValue(Object defaultValue) {
	    this.defaultValue = defaultValue;
	  }
	  
	  String getType() {
	    return "Field";
	  }
	  
	  String getLabel() {
	    return label;
	  }
	  
	  String getDefaultValue() {
	    return defaultValue.toString();
	  }
	  
	  String getValue() {
	    String strValue = value.toString();
	    
	    if (strValue.equals(""))
	      return getDefaultValue();
	    else
	      return strValue;
	  }
	  
	  String getFieldDefinition() {
	    return getType() + "[label = " + getLabel() + ", default_value = " 
	             + getDefaultValue() + ", value = " + getValue() + "]";
	  }
	  
	  String displayLabel() {
	    return getLabel() + Field.nOf( " ", labelDisplayLength - getLabel().length() ) + ":"; 
	  }
	  
	  String displayValue() {
	    return getValue();
	  }
	  
	  boolean isValid() {
	    return false;
	  }
	}

	class TextField extends Field {
	  TextField(String label) {
	    super(label);
	  }
	  
	  String getType() {
	    return "TextField";
	  }

	}

	class EmailField extends TextField {
	  EmailField(String label) {
	    super(label);
	  }
	  
	  String getType() {
	    return "EmailField";
	  }
	}

	class PasswordField extends TextField {
	  PasswordField(String label) {
	    super(label);
	  }
	  
	  String getType() {
	    return "PasswordField";
	  }
	  
	}

	class NumberField extends Field {
	  NumberField(String label) {
	    super(label);
	  }
	  
	  String getType() {
	    return "NumberField";
	  }

	}

	class PhoneField extends NumberField {
	  PhoneField(String label) {
	    super(label);
	  }
	  
	  String getType() {
	    return "PhoneField";
	  }
	}

	class PercentField extends NumberField {
	  PercentField(String label) {
	    super(label);
	  }
	  
	  String getType() {
	    return "PercentField";
	  }
}
