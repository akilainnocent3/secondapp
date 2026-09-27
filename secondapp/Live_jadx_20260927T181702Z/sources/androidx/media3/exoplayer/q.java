package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import d5.h0;
import d5.s3;
import d5.z4;
import e5.k4;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s5.s0;
import s5.t1;
import u4.y4;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface q extends p.b {
    public static final long R8 = 10000;
    public static final long S8 = 1000000;
    public static final int T8 = 1;
    public static final int U8 = 2;
    public static final int V8 = 3;
    public static final int W8 = 4;
    public static final int X8 = 5;
    public static final int Y8 = 6;
    public static final int Z8 = 7;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f14438a9 = 8;

    /* JADX INFO: renamed from: b9, reason: collision with root package name */
    public static final int f14439b9 = 9;

    /* JADX INFO: renamed from: c9, reason: collision with root package name */
    public static final int f14440c9 = 10;

    /* JADX INFO: renamed from: d9, reason: collision with root package name */
    public static final int f14441d9 = 11;

    /* JADX INFO: renamed from: e9, reason: collision with root package name */
    public static final int f14442e9 = 12;

    /* JADX INFO: renamed from: f9, reason: collision with root package name */
    public static final int f14443f9 = 13;

    /* JADX INFO: renamed from: g9, reason: collision with root package name */
    public static final int f14444g9 = 14;

    /* JADX INFO: renamed from: h9, reason: collision with root package name */
    public static final int f14445h9 = 15;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final int f14446i9 = 16;

    /* JADX INFO: renamed from: j9, reason: collision with root package name */
    public static final int f14447j9 = 17;

    /* JADX INFO: renamed from: k9, reason: collision with root package name */
    public static final int f14448k9 = 18;

    /* JADX INFO: renamed from: l9, reason: collision with root package name */
    public static final int f14449l9 = 19;

    /* JADX INFO: renamed from: m9, reason: collision with root package name */
    public static final int f14450m9 = 20;

    /* JADX INFO: renamed from: n9, reason: collision with root package name */
    public static final int f14451n9 = 21;

    /* JADX INFO: renamed from: o9, reason: collision with root package name */
    public static final int f14452o9 = 22;

    /* JADX INFO: renamed from: p9, reason: collision with root package name */
    public static final int f14453p9 = 10000;

    /* JADX INFO: renamed from: q9, reason: collision with root package name */
    public static final int f14454q9 = 0;

    /* JADX INFO: renamed from: r9, reason: collision with root package name */
    public static final int f14455r9 = 1;

    /* JADX INFO: renamed from: s9, reason: collision with root package name */
    public static final int f14456s9 = 2;

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
    public interface c {
        void a();

        void b();
    }

    long b();

    void disable();

    void e(float f10, float f11) throws h0;

    void f(y4 y4Var);

    r getCapabilities();

    @Nullable
    s3 getMediaClock();

    String getName();

    int getState();

    @Nullable
    t1 getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void i(long j10, boolean z10) throws h0;

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void k();

    boolean l(long j10);

    void maybeThrowStreamError() throws IOException;

    long n(long j10, long j11);

    void o(z4 z4Var, androidx.media3.common.a[] aVarArr, t1 t1Var, long j10, boolean z10, boolean z11, long j11, long j12, s0.b bVar) throws h0;

    void q(int i10, k4 k4Var, x4.l lVar);

    void r(androidx.media3.common.a[] aVarArr, t1 t1Var, long j10, long j11, s0.b bVar) throws h0;

    void release();

    void render(long j10, long j11) throws h0;

    void reset();

    void setCurrentStreamFinal();

    void start() throws h0;

    void stop();
}
