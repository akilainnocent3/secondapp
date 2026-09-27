package jy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ly.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@ly.p
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@ly.c(qualifier = o.class)
public @interface g {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @ly.p
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @ly.c(qualifier = o.class)
    public @interface a {
        g[] value();
    }

    String[] expression();

    boolean result();

    @a0("value")
    int targetValue() default 0;
}
