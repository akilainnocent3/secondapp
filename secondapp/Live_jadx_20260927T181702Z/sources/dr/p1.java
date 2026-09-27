package dr;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@er.e(er.a.BINARY)
@Target({ElementType.TYPE})
@l1(version = "2.1")
@Retention(RetentionPolicy.CLASS)
@a3(markerClass = {w.class})
@er.f(allowedTargets = {er.b.CLASS})
public @interface p1 {
    Class<? extends Annotation>[] markerClass();
}
