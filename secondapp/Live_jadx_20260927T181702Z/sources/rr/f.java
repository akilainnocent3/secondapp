package rr;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.G5;
import dr.l1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE})
@l1(version = "1.3")
@Retention(RetentionPolicy.RUNTIME)
@er.f(allowedTargets = {er.b.CLASS})
public @interface f {
    @cs.j(name = "c")
    String c() default "";

    @cs.j(name = InneractiveMediationDefs.GENDER_FEMALE)
    String f() default "";

    @cs.j(name = "i")
    int[] i() default {};

    @cs.j(name = "l")
    int[] l() default {};

    @cs.j(name = "m")
    String m() default "";

    @cs.j(name = G5.f59045q)
    String[] n() default {};

    @cs.j(name = "s")
    String[] s() default {};

    @cs.j(name = "v")
    int v() default 1;
}
