package te;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import re.k4;
import re.n2;
import se.b2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f136886a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f136887b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f136888c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f136889d = Long.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f136891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f136892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n2 f136893d;

        public b(int i10, int i11, int i12, int i13, n2 n2Var, boolean z10, @Nullable Exception exc) {
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
            sb2.append(gi.j.f86771d);
            sb2.append(" ");
            sb2.append(n2Var);
            sb2.append(z10 ? " (recoverable)" : "");
            super(sb2.toString(), exc);
            this.f136891b = i10;
            this.f136892c = z10;
            this.f136893d = n2Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(Exception exc);

        void b(long j10);

        void d();

        void e();

        void f();

        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z10);

        void onUnderrun(int i10, long j10, long j11);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f136894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f136895c;

        public e(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f136894b = j10;
            this.f136895c = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f136896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f136897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n2 f136898d;

        public f(int i10, n2 n2Var, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f136897c = z10;
            this.f136896b = i10;
            this.f136898d = n2Var;
        }
    }

    boolean a(n2 n2Var);

    @Nullable
    te.e b();

    void c(k4 k4Var);

    boolean d();

    void disableTunneling();

    void e(te.e eVar);

    void f(boolean z10);

    void flush();

    void g();

    long getCurrentPositionUs(boolean z10);

    k4 getPlaybackParameters();

    boolean h(ByteBuffer byteBuffer, long j10, int i10) throws b, f;

    void handleDiscontinuity();

    boolean hasPendingData();

    int i(n2 n2Var);

    boolean isEnded();

    void j(long j10);

    void k(@Nullable b2 b2Var);

    void l();

    void m(c cVar);

    void n(n2 n2Var, int i10, @Nullable int[] iArr) throws a;

    void pause();

    void play();

    void playToEndOfStream() throws f;

    void release();

    void reset();

    void setAudioSessionId(int i10);

    @k.t0(23)
    void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f10);

    void t(b0 b0Var);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n2 f136890b;

        public a(Throwable th2, n2 n2Var) {
            super(th2);
            this.f136890b = n2Var;
        }

        public a(String str, n2 n2Var) {
            super(str);
            this.f136890b = n2Var;
        }
    }
}
