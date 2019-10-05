import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Scanner;

public class JavaxscriptCalc {
  public static void main() throws ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a mathematical expression:");
    String foo = in.nextLine();
    System.out.println(engine.eval(foo));
    } 
}