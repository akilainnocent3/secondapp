package a9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@er.e(er.a.BINARY)
@Target({})
@Retention(RetentionPolicy.CLASS)
@er.f(allowedTargets = {})
public @interface q0 {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
