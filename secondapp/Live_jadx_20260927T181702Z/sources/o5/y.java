package o5;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface y {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f118803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f118804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.a f118805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Surface f118806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final MediaCrypto f118807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final u f118808f;

        public a(d0 d0Var, MediaFormat mediaFormat, androidx.media3.common.a aVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable u uVar) {
            this.f118803a = d0Var;
            this.f118804b = mediaFormat;
            this.f118805c = aVar;
            this.f118806d = surface;
            this.f118807e = mediaCrypto;
            this.f118808f = uVar;
        }

        public static a a(d0 d0Var, MediaFormat mediaFormat, androidx.media3.common.a aVar, @Nullable MediaCrypto mediaCrypto, @Nullable u uVar) {
            return new a(d0Var, mediaFormat, aVar, null, mediaCrypto, uVar);
        }

        public static a b(d0 d0Var, MediaFormat mediaFormat, androidx.media3.common.a aVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            return new a(d0Var, mediaFormat, aVar, surface, mediaCrypto, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public static final b f118809a = new o();

        y a(a aVar) throws IOException;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(y yVar, long j10, long j11);
    }

    void a(Bundle bundle);

    @k.t0(26)
    PersistableBundle b();

    void c(int i10, int i11, int i12, long j10, int i13);

    boolean d();

    void e(int i10, long j10);

    int f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    void g(int i10, boolean z10);

    MediaFormat h();

    @Nullable
    ByteBuffer i(int i10);

    void j(Surface surface);

    int k();

    void l(int i10, int i11, c5.d dVar, long j10, int i12);

    @Nullable
    ByteBuffer m(int i10);

    @k.t0(31)
    void n(List<String> list);

    boolean o(c cVar);

    void p(Runnable runnable);

    void q(d dVar, Handler handler);

    @k.t0(35)
    void r();

    void release();

    @k.t0(31)
    void s(List<String> list);

    void setVideoScalingMode(int i10);
}
