package sx;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ly.f0;
import ly.h0;
import ly.i0;
import ly.k0;
import ly.r;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@ly.h
@ly.e(typeKinds = {h0.BOOLEAN, h0.BYTE, h0.CHAR, h0.DOUBLE, h0.FLOAT, h0.INT, h0.LONG, h0.SHORT}, types = {String.class, Void.class}, value = {i0.EXCEPTION_PARAMETER, i0.UPPER_BOUND})
@k0(typeKinds = {h0.BOOLEAN, h0.BYTE, h0.CHAR, h0.DOUBLE, h0.FLOAT, h0.INT, h0.LONG, h0.SHORT}, types = {String.class})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@f0({f.class})
public @interface d {
    @r
    String[] value() default {};
}
