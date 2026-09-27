package qq;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@s
@er.e(er.a.RUNTIME)
@er.c
@Documented
@er.f(allowedTargets = {er.b.ANNOTATION_CLASS})
public @interface p {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({})
    @Retention(RetentionPolicy.RUNTIME)
    @s
    @er.e(er.a.RUNTIME)
    @er.c
    @Documented
    @er.f(allowedTargets = {})
    public @interface a {
        String alias();

        Class<?> value();
    }

    a[] importAs() default {};

    Class<?>[] imports();

    String value();
}
