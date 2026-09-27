package sx;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ly.f0;
import ly.g0;
import ly.i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE_USE})
@g0({i0.RECEIVER, i0.PARAMETER, i0.RETURN})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@f0({f.class})
public @interface c {
    int value() default -1;
}
