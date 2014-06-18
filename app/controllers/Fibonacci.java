package controllers;

        import play.*;
        import play.mvc.*;

        import views.html.*;

public class Fibonacci extends Controller {

    public static Result index() {
        /*
        int answer = fib(4);
        return ok(index.render(answer));
        */
        return ok(index.render("something"));
    }

    public int fib(int num) {
        return num < 2 ? 1 : fib(num-2) + fib(num-1);
    }
}
