package k;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@er.e(er.a.BINARY)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@er.f(allowedTargets = {er.b.CLASS, er.b.PROPERTY, er.b.LOCAL_VARIABLE, er.b.VALUE_PARAMETER, er.b.CONSTRUCTOR, er.b.FUNCTION, er.b.PROPERTY_GETTER, er.b.PROPERTY_SETTER, er.b.FILE, er.b.TYPEALIAS})
public @interface o0 {
    Class<? extends Annotation>[] markerClass();
}
