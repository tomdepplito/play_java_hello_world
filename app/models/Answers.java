package models;

import play.*;
import play.mvc.*;
import views.html.*;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class Answers extends Model {

    /*
    public Answers() {
        int result = fib(3);
    }
    */

    public int result;

    public int fib(int num) {
        return num < 2 ? 1 : fib(num-2) + fib(num-1);
    }

    public static void create(Answers answer) {
        answer.save();
    }
}
