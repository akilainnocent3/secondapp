package dr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@er.e(er.a.SOURCE)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
@er.f(allowedTargets = {er.b.CLASS, er.b.ANNOTATION_CLASS, er.b.TYPE_PARAMETER, er.b.PROPERTY, er.b.FIELD, er.b.LOCAL_VARIABLE, er.b.VALUE_PARAMETER, er.b.CONSTRUCTOR, er.b.FUNCTION, er.b.PROPERTY_GETTER, er.b.PROPERTY_SETTER, er.b.TYPE, er.b.EXPRESSION, er.b.FILE, er.b.TYPEALIAS})
public @interface q1 {
    String[] names();
}
