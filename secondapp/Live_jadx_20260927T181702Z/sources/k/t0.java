package k;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@er.e(er.a.BINARY)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@er.c
@Documented
@Retention(RetentionPolicy.CLASS)
@er.f(allowedTargets = {er.b.ANNOTATION_CLASS, er.b.CLASS, er.b.FUNCTION, er.b.PROPERTY_GETTER, er.b.PROPERTY_SETTER, er.b.CONSTRUCTOR, er.b.FIELD, er.b.FILE})
public @interface t0 {
    int api() default 1;

    int value() default 1;
}
