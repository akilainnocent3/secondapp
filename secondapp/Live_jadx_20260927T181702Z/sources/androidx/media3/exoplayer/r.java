package androidx.media3.exoplayer;

import d5.h0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface r {
    public static final int A9 = 0;
    public static final int B9 = 64;
    public static final int C9 = 64;
    public static final int D9 = 0;
    public static final int E9 = 384;
    public static final int F9 = 256;
    public static final int G9 = 128;
    public static final int H9 = 0;
    public static final int I9 = 3584;
    public static final int J9 = 2048;
    public static final int K9 = 1024;
    public static final int L9 = 512;
    public static final int M9 = 0;

    /* JADX INFO: renamed from: t9, reason: collision with root package name */
    public static final int f14457t9 = 7;

    /* JADX INFO: renamed from: u9, reason: collision with root package name */
    public static final int f14458u9 = 24;

    /* JADX INFO: renamed from: v9, reason: collision with root package name */
    public static final int f14459v9 = 16;

    /* JADX INFO: renamed from: w9, reason: collision with root package name */
    public static final int f14460w9 = 8;

    /* JADX INFO: renamed from: x9, reason: collision with root package name */
    public static final int f14461x9 = 0;

    /* JADX INFO: renamed from: y9, reason: collision with root package name */
    public static final int f14462y9 = 32;

    /* JADX INFO: renamed from: z9, reason: collision with root package name */
    public static final int f14463z9 = 32;

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
        void b(q qVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    int a(androidx.media3.common.a aVar) throws h0;

    void d();

    String getName();

    int getTrackType();

    void p(f fVar);

    int supportsMixedMimeTypeAdaptation() throws h0;
}
