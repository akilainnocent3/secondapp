package dr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@er.e(er.a.BINARY)
@Target({ElementType.ANNOTATION_TYPE})
@l1(version = "1.3")
@Retention(RetentionPolicy.CLASS)
@er.f(allowedTargets = {er.b.ANNOTATION_CLASS})
public @interface h1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        WARNING,
        ERROR;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ sr.a f79453e = sr.c.c(d());

        @oy.l
        public static sr.a<a> g() {
            return f79453e;
        }
    }

    a level() default a.ERROR;

    String message() default "";
}
