import java.util.HashMap;
import java.util.Map;

/**
 * File  : Template
 * Author: Ujwal Bharat Nagumantri
 * Desc  :
 */
public class Template {

  private HashMap<String, String> variables;
  private String templateText;

  public Template(String templateText) {
    this.variables = new HashMap<String, String>();
    this.templateText = templateText;
  }

  public void set(String variableName, String value) {
    this.variables.put(variableName,value);
  }

  public String evaluate() {
    String result = templateText;
    for(Map.Entry<String, String> entry: variables.entrySet()){
      String regex = "\\$\\{" + entry.getKey() + "\\}";
      result = result.replaceAll(regex,entry.getValue());
    }
    return result;
  }
}
