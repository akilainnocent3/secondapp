package k;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@er.e(er.a.BINARY)
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
@er.f(allowedTargets = {er.b.ANNOTATION_CLASS})
public @interface w0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        WARNING,
        ERROR;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ sr.a f101460e = sr.c.c(d());

        @oy.l
        public static sr.a<a> g() {
            return f101460e;
        }
    }

    a level() default a.ERROR;

    String message() default "";
}
