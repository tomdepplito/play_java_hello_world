package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    public static Result index() {
        Fib newFib = new Fib();
        int answer = newFib.fib(4);
        String response = "Answer: " + answer;
        return ok(index.render(response));
    }

}