package wo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface g {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f143517x2 = "\u0000";

    boolean ignore() default false;

    String name() default "\u0000";
}
