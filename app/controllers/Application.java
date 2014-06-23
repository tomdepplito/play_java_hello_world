package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import models.Answers;

public class Application extends Controller {
    public static Result index() {
        Answers newAnswer = new Answers();
        Answers.create(newAnswer);
        int answer = newAnswer.fib(4);
        String response = "Answer: " + newAnswer.result;//answer;
        return ok(index.render(response));
    }

}