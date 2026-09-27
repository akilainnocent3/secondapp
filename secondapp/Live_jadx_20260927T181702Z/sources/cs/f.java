package cs;

import dr.l1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
@er.e(er.a.BINARY)
@l1(version = "2.2")
@er.c
@dr.v
@Documented
@er.f(allowedTargets = {er.b.FUNCTION, er.b.CONSTRUCTOR, er.b.PROPERTY_GETTER, er.b.PROPERTY_SETTER, er.b.CLASS})
public @interface f {
    String jvmName() default "";
}
