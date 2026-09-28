package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface viv {

    public static final class a {
        public final ziv a;
        public final MediaFormat b;
        public final androidx.media3.common.a c;
        public final Surface d;
        public final MediaCrypto e;
        public final dpt f;

        public a(ziv zivVar, MediaFormat mediaFormat, androidx.media3.common.a aVar, Surface surface, MediaCrypto mediaCrypto, dpt dptVar) {
            this.a = zivVar;
            this.b = mediaFormat;
            this.c = aVar;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = dptVar;
        }
    }

    public interface b {
        viv a(a aVar);
    }

    void a(int i, v3c v3cVar, long j, int i2);

    void b(Bundle bundle);

    void c(int i, int i2, int i3, long j);

    default boolean d(ejv.c cVar) {
        return false;
    }

    MediaFormat e();

    void f();

    void flush();

    void g(ljv.e eVar, Handler handler);

    void h(int i);

    ByteBuffer i(int i);

    void j(Surface surface);

    void k(int i);

    void l(int i, long j);

    int m();

    int n(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer o(int i);

    void release();
}
