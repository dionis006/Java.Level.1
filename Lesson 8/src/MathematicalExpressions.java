import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MathematicalExpressions {
    public static void main(String[] args) throws Exception {
    }

    public MathematicalExpressions() {
    }

    public String expressions(String val, String last) throws ScriptException {
        String result = val;
        if (last.equals("=")) {
            val = val.substring(0, val.length() - 1);
            String one = val;
            ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
            ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
            Object expResult = scriptEngine.eval(one);
            result = expResult.toString();
        }
        if (last.equals("C")){
            result = null;
        }
        return result;
    }
}