package px;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@ly.p
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@ly.c(qualifier = i.class)
public @interface b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @ly.p
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @ly.c(qualifier = i.class)
    public @interface a {
        b[] value();
    }

    String[] expression();

    @ly.a0("offset")
    @ly.r
    String[] offset() default {};

    boolean result();

    @ly.a0("value")
    @ly.r
    String[] targetValue();
}
