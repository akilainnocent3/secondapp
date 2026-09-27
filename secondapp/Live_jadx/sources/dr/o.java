package dr;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@er.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
@er.f(allowedTargets = {er.b.CLASS, er.b.FUNCTION, er.b.PROPERTY, er.b.ANNOTATION_CLASS, er.b.CONSTRUCTOR, er.b.PROPERTY_SETTER, er.b.PROPERTY_GETTER, er.b.TYPEALIAS})
public @interface o {
    q level() default q.WARNING;

    String message();

    g1 replaceWith() default @g1(expression = "", imports = {});
}
