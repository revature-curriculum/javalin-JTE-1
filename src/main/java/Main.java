import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import io.javalin.http.staticfiles.Location;
import objects.*;

public class Main {

  static WaterBottle waterBottle = new WaterBottle("CamelBak", 60);

  static Animal animal = new Animal("dog", "brown");

    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {config.addStaticFiles("", Location.CLASSPATH);}).start(4100);
        app.get("/", ctx -> ctx.result("Hello World!"));

        app.get("/animal", ctx -> {
            ctx.render("animal.jte", Collections.singletonMap("animal", animal));
        });

        app.get("/waterBottle", wbHandler);

    }

    public static Handler wbHandler = ctx -> {
      ctx.render("waterBottle.jte", Collections.singletonMap("waterBottle", waterBottle));
    };
}
