import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //<-for class
@Retention(RetentionPolicy.RUNTIME) //label is fixed on the jar
public @interface DevelopedBy { //<--label
    String name(); //<--details on the label
}
