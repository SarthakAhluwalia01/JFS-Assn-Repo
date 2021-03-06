package com.company;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD})

@interface Info{
    int AuthorID();
    String Author() default "Sarthak";
    String Supervisor() default "Martin";
    String Date();
    String Time();
    int version();
    String description() default "Displaying Method";
}

class Devloper{
    @Info(AuthorID = 108806, Date = "07-12-1999", Time = "5:00pm", version = 6)
    public void displayMethod(){System.out.println("Author Info");}
}
public class AnnotationsQ2 {
    public static void main(String[] args)throws Exception{
        Devloper devloper = new Devloper();
        Method m=devloper.getClass().getMethod("displayMethod");

        Info d1 = m.getAnnotation(Info.class);
        System.out.println("Author ID is: "+d1.AuthorID());
        System.out.println("Author Name is: "+d1.Author());
        System.out.println("Supervisor is: "+d1.Supervisor());
    }

}
