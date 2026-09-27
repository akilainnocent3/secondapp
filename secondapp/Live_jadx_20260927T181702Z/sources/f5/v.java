package f5;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import e5.k4;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface v {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void b(long j10);

        void c();

        void d();

        void e();

        void onReleased();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f83147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f83148c;

        public b(int i10, boolean z10) {
            super("AudioOutput write failed: " + i10);
            this.f83148c = z10;
            this.f83147b = i10;
        }
    }

    void c(u4.s1 s1Var);

    @x4.m1
    void e(k4 k4Var);

    void flush();

    int getAudioSessionId();

    u4.s1 getPlaybackParameters();

    long getPositionUs();

    void i(int i10, int i11);

    boolean j();

    @x4.m1
    boolean k(x.g gVar, x.c cVar, x.g gVar2);

    void l(int i10);

    void m();

    void n(a aVar);

    boolean o(ByteBuffer byteBuffer, int i10, long j10) throws b;

    void p(a aVar);

    void pause();

    void play();

    int q();

    void r(float f10);

    void release();

    boolean s();

    void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f10);

    void stop();

    long t();
}
