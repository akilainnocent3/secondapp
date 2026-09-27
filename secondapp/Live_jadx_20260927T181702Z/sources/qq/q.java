package qq;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@s
@er.e(er.a.RUNTIME)
@er.c
@Documented
@Repeatable(r.class)
@er.f(allowedTargets = {er.b.CLASS})
public @interface q {
    Class<?>[] onlyIn() default {};

    Class<? extends Annotation>[] value() default {};
}
