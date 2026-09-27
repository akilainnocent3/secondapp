package f5;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import e5.k4;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public interface p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f83061a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83062b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83063c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f83064d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83065e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f83066f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83067g = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f83068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f83069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f83070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f83071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f83072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f83073f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f83068a = i10;
            this.f83069b = i11;
            this.f83070c = i12;
            this.f83071d = z10;
            this.f83072e = z11;
            this.f83073f = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(Exception exc);

        void b(long j10);

        void c(int i10);

        void d();

        void e();

        void f();

        void g();

        void l(a aVar);

        void m(a aVar);

        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z10);

        void onUnderrun(int i10, long j10, long j11);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f83078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f83079c;

        public g(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f83078b = j10;
            this.f83079c = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f83080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f83081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.common.a f83082d;

        public h(int i10, androidx.media3.common.a aVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f83081c = z10;
            this.f83080b = i10;
            this.f83082d = aVar;
        }
    }

    boolean a(androidx.media3.common.a aVar);

    @Nullable
    u4.i b();

    void c(u4.s1 s1Var);

    boolean d();

    void disableTunneling();

    void e(@Nullable k4 k4Var);

    void f(boolean z10);

    void flush();

    void g();

    long getCurrentPositionUs(boolean z10);

    u4.s1 getPlaybackParameters();

    boolean h(ByteBuffer byteBuffer, long j10, int i10) throws c, h;

    void handleDiscontinuity();

    boolean hasPendingData();

    @k.t0(29)
    void i(int i10, int i11);

    boolean isEnded();

    void j(long j10);

    void k(x4.l lVar);

    long l();

    @k.t0(29)
    void m(int i10);

    void n(androidx.media3.common.a aVar, int i10, @Nullable int[] iArr) throws b;

    void n0(int i10);

    void o(u4.i iVar);

    @Nullable
    f5.e p();

    void pause();

    void play();

    void playToEndOfStream() throws h;

    int q(androidx.media3.common.a aVar);

    void r(d dVar);

    void release();

    void reset();

    t s(androidx.media3.common.a aVar);

    void setAudioSessionId(int i10);

    void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f10);

    void t(x xVar);

    void x0(u4.n nVar);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.a f83074b;

        public b(Throwable th2, androidx.media3.common.a aVar) {
            super(th2);
            this.f83074b = aVar;
        }

        public b(String str, androidx.media3.common.a aVar) {
            super(str);
            this.f83074b = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f83075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f83076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.common.a f83077d;

        public c(String str, int i10, androidx.media3.common.a aVar, boolean z10, @Nullable Throwable th2) {
            super(str, th2);
            this.f83075b = i10;
            this.f83076c = z10;
            this.f83077d = aVar;
        }

        public c(int i10, int i11, int i12, int i13, int i14, androidx.media3.common.a aVar, boolean z10, @Nullable Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(", ");
            sb2.append(i14);
            sb2.append(gi.j.f86771d);
            sb2.append(" ");
            sb2.append(aVar);
            sb2.append(z10 ? " (recoverable)" : "");
            this(sb2.toString(), i10, aVar, z10, exc);
        }
    }
}
