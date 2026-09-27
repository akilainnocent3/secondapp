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
public @interface i {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        ENABLED,
        DISABLED,
        INHERITED;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ sr.a f4144f = sr.c.c(d());

        @oy.l
        public static sr.a<a> g() {
            return f4144f;
        }
    }

    a byteBuffer() default a.INHERITED;

    a enums() default a.INHERITED;

    a uuid() default a.INHERITED;
}
