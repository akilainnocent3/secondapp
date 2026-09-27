package re;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface x4 {
    public static final int Ta = 7;

    @Deprecated
    public static final int Ua = 4;

    @Deprecated
    public static final int Va = 3;

    @Deprecated
    public static final int Wa = 2;

    @Deprecated
    public static final int Xa = 1;

    @Deprecated
    public static final int Ya = 0;
    public static final int Za = 24;

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    public static final int f127170bb = 16;

    /* JADX INFO: renamed from: cb, reason: collision with root package name */
    public static final int f127171cb = 8;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final int f127172fb = 0;

    /* JADX INFO: renamed from: gb, reason: collision with root package name */
    public static final int f127173gb = 32;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final int f127174hb = 32;

    /* JADX INFO: renamed from: ib, reason: collision with root package name */
    public static final int f127175ib = 0;

    /* JADX INFO: renamed from: jb, reason: collision with root package name */
    public static final int f127176jb = 64;

    /* JADX INFO: renamed from: kb, reason: collision with root package name */
    public static final int f127177kb = 64;

    /* JADX INFO: renamed from: mb, reason: collision with root package name */
    public static final int f127178mb = 0;

    /* JADX INFO: renamed from: nb, reason: collision with root package name */
    public static final int f127179nb = 384;

    /* JADX INFO: renamed from: ob, reason: collision with root package name */
    public static final int f127180ob = 256;

    /* JADX INFO: renamed from: pb, reason: collision with root package name */
    public static final int f127181pb = 128;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    public static final int f127182qb = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void b(v4 v4Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    int a(n2 n2Var) throws s;

    void d();

    void f(f fVar);

    String getName();

    int getTrackType();

    int supportsMixedMimeTypeAdaptation() throws s;
}
