package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class spe0 implements viv {
    public final MediaCodec a;
    public final dpt b;

    public static class a implements viv.b {
        public static MediaCodec b(viv.a aVar) throws IOException {
            String str = aVar.a.a;
            Trace.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0041  */
        @Override // viv.b
        public final viv a(viv.a aVar) throws Throwable {
            MediaCodec mediaCodecB = null;
            try {
                mediaCodecB = b(aVar);
                Trace.beginSection("configureCodec");
                Surface surface = aVar.d;
                mediaCodecB.configure(aVar.b, surface, aVar.e, (surface == null && aVar.a.h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecB.start();
                Trace.endSection();
                return new spe0(mediaCodecB, aVar.f);
            } catch (IOException e) {
                e = e;
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e;
            }
        }
    }

    public spe0(MediaCodec mediaCodec, dpt dptVar) {
        this.a = mediaCodec;
        this.b = dptVar;
        if (Build.VERSION.SDK_INT < 35 || dptVar == null) {
            return;
        }
        dptVar.a(mediaCodec);
    }

    @Override // defpackage.viv
    public final void a(int i, v3c v3cVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, v3cVar.i, j, i2);
    }

    @Override // defpackage.viv
    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.viv
    public final void c(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.viv
    public final MediaFormat e() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.viv
    public final void f() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.viv
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.viv
    public final void g(final ljv.e eVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: rpe0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                ljv.e eVar2 = eVar;
                Handler handler2 = eVar2.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                } else {
                    eVar2.a(j);
                }
            }
        }, handler);
    }

    @Override // defpackage.viv
    public final void h(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.viv
    public final ByteBuffer i(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.viv
    public final void j(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.viv
    public final void k(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.viv
    public final void l(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.viv
    public final int m() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.viv
    public final int n(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.viv
    public final ByteBuffer o(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.viv
    public final void release() {
        dpt dptVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && dptVar != null) {
                dptVar.c(mediaCodec);
            }
            mediaCodec.release();
        }
    }
}
