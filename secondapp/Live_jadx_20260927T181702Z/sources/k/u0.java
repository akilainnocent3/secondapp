package k;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.o1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
@er.e(er.a.BINARY)
@er.d
@er.c
@Documented
@Repeatable(a.class)
@er.f(allowedTargets = {er.b.ANNOTATION_CLASS, er.b.CLASS, er.b.FUNCTION, er.b.PROPERTY_GETTER, er.b.PROPERTY_SETTER, er.b.CONSTRUCTOR, er.b.FIELD, er.b.FILE})
public @interface u0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @er.e(er.a.BINARY)
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @o1
    @Retention(RetentionPolicy.CLASS)
    @er.f(allowedTargets = {er.b.ANNOTATION_CLASS, er.b.CLASS, er.b.FUNCTION, er.b.PROPERTY_GETTER, er.b.PROPERTY_SETTER, er.b.CONSTRUCTOR, er.b.FIELD, er.b.FILE})
    public @interface a {
        u0[] value();
    }

    int extension();

    int version();
}
