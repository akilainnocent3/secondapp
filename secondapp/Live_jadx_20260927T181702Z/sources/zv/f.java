package zv;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Target({})
@er.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
@g
@er.f(allowedTargets = {er.b.PROPERTY})
public @interface f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @g
    public enum a {
        ALWAYS,
        NEVER;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ sr.a f162663e = sr.c.c(d());

        @oy.l
        public static sr.a<a> g() {
            return f162663e;
        }
    }

    a mode() default a.ALWAYS;
}
