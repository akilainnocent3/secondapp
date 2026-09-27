package qq;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@s
@er.e(er.a.RUNTIME)
@er.c
@cr.d
@Documented
@er.f(allowedTargets = {er.b.PROPERTY_SETTER, er.b.FUNCTION, er.b.VALUE_PARAMETER})
public @interface f0 {
    p value();
}
