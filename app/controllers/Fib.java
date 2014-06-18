package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Fib {
    public int fib(int num) {
        return num < 2 ? 1 : fib(num-2) + fib(num-1);
    }
}
