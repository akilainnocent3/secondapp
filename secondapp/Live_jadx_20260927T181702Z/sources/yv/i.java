package yv;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.o1;
import yv.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@er.e(er.a.SOURCE)
@Target({ElementType.TYPE})
@er.d
@Repeatable(a.class)
@Retention(RetentionPolicy.SOURCE)
@er.f(allowedTargets = {er.b.CLASS, er.b.PROPERTY})
public @interface i<T, P extends f<? super T>> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @er.e(er.a.SOURCE)
    @Target({ElementType.TYPE})
    @o1
    @Retention(RetentionPolicy.SOURCE)
    @er.f(allowedTargets = {er.b.CLASS, er.b.PROPERTY})
    public @interface a {
        i[] value();
    }
}
