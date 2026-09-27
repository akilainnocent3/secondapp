package l;

import dr.g1;
import dr.o;
import er.e;
import er.f;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@e(er.a.BINARY)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
@o(message = "This annotation has been replaced by `@OptIn`", replaceWith = @g1(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@f(allowedTargets = {er.b.CLASS, er.b.PROPERTY, er.b.LOCAL_VARIABLE, er.b.VALUE_PARAMETER, er.b.CONSTRUCTOR, er.b.FUNCTION, er.b.PROPERTY_GETTER, er.b.PROPERTY_SETTER, er.b.FILE, er.b.TYPEALIAS})
public @interface c {
    Class<? extends Annotation>[] markerClass();
}
