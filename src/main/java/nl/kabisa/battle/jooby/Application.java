package nl.kabisa.battle.jooby;

import org.jooby.Jooby;

public class Application extends Jooby {

    {
        get("/", () -> "Hello world");
    }

    public static void main(String[] args) {
        run(Application::new, args);
    }
}