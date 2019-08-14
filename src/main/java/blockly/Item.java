package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Item {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// item
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/x-www-form-urlencoded"), Var.valueOf("https://my-api-strapi.herokuapp.com/produtos"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
    return cronapi.json.Operations.toList(item);
   }
 }.call();
}

}

