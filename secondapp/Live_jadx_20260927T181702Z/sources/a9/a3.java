package a9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@er.e(er.a.BINARY)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
@er.f(allowedTargets = {er.b.FUNCTION, er.b.VALUE_PARAMETER, er.b.FIELD, er.b.CLASS})
public @interface a3 {
    i builtInTypeConverters() default @i;

    Class<?>[] value() default {};
}
