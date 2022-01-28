import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.staticfiles.Location;

public class Main {

    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {config.addStaticFiles("", Location.CLASSPATH);}).start(4100);
        app.get("/", ctx -> ctx.result("Hello World!"));

        app.get("/jtestring", ctx -> {
            ctx.render("challenge.jte", Collections.singletonMap("name", "Viktor"));
        });

    }
}
