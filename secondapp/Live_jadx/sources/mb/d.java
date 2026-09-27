package mb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface d {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f107177p1 = 0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f107178q1 = 1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f107179r1 = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
