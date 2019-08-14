package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Arq {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// arq
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input4693")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

