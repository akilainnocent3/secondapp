package k;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@er.e(er.a.BINARY)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@er.c
@Documented
@Retention(RetentionPolicy.CLASS)
@er.f(allowedTargets = {er.b.FUNCTION, er.b.PROPERTY_GETTER, er.b.PROPERTY_SETTER, er.b.VALUE_PARAMETER, er.b.FIELD, er.b.LOCAL_VARIABLE, er.b.ANNOTATION_CLASS})
public @interface q {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @oy.l
    public static final a f101449g1 = a.f101453a;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f101450h1 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f101451i1 = 1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f101452j1 = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f101453a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f101454b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f101455c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f101456d = 2;
    }

    int unit() default 1;
}
