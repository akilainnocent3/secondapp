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
public @interface f0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oy.l
    public static final b f4094o = b.f4100a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f4095p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f4096q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f4097r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f4098s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f4099t = 5;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @er.e(er.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f4100a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f4101b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f4102c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f4103d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f4104e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f4105f = 5;
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @a
    int onDelete() default 1;

    @a
    int onUpdate() default 1;

    String[] parentColumns();
}
