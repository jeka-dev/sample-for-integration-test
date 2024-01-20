import dev.jeka.core.tool.JkDoc;
import dev.jeka.core.tool.KBean;

class App extends KBean {

    @JkDoc("Print 'ok'' on console")
    public void ok() {
        System.out.println("ok");
    }

}