package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e53 implements dk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f148507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f148508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f148509c;

    public e53(MediaCodec mediaCodec) {
        this.f148507a = mediaCodec;
        if (ib3.f150516a < 21) {
            this.f148508b = mediaCodec.getInputBuffers();
            this.f148509c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // yads.dk1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f148507a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && ib3.f150516a < 21) {
                this.f148509c = this.f148507a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // yads.dk1
    public final int b() {
        return this.f148507a.dequeueInputBuffer(0L);
    }

    @Override // yads.dk1
    public final void flush() {
        this.f148507a.flush();
    }

    @Override // yads.dk1
    public final void release() {
        this.f148508b = null;
        this.f148509c = null;
        this.f148507a.release();
    }

    @Override // yads.dk1
    public final void setVideoScalingMode(int i10) {
        this.f148507a.setVideoScalingMode(i10);
    }

    @Override // yads.dk1
    public final ByteBuffer b(int i10) {
        return ib3.f150516a >= 21 ? this.f148507a.getOutputBuffer(i10) : this.f148509c[i10];
    }

    @Override // yads.dk1
    public final MediaFormat a() {
        return this.f148507a.getOutputFormat();
    }

    public final void a(ck1 ck1Var, MediaCodec mediaCodec, long j10, long j11) {
        al1 al1Var = (al1) ck1Var;
        al1Var.getClass();
        if (ib3.f150516a < 30) {
            al1Var.f146845b.sendMessageAtFrontOfQueue(Message.obtain(al1Var.f146845b, 0, (int) (j10 >> 32), (int) j10));
            return;
        }
        bl1 bl1Var = al1Var.f146846c;
        if (al1Var != bl1Var.f147251n1) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            bl1Var.f152518z0 = true;
            return;
        }
        try {
            bl1Var.b(j10);
            bl1Var.D();
            bl1Var.B0.f153834e++;
            bl1Var.V0 = true;
            if (!bl1Var.T0) {
                bl1Var.T0 = true;
                bl1Var.I0.a(bl1Var.P0);
                bl1Var.R0 = true;
            }
            bl1Var.a(j10);
        } catch (pn0 e10) {
            al1Var.f146846c.A0 = e10;
        }
    }

    @Override // yads.dk1
    public final void a(int i10, int i11, long j10, int i12) {
        this.f148507a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // yads.dk1
    public final void a(int i10, m20 m20Var, long j10) {
        this.f148507a.queueSecureInputBuffer(i10, 0, m20Var.f152276i, j10, 0);
    }

    @Override // yads.dk1
    public final void a(int i10, long j10) {
        this.f148507a.releaseOutputBuffer(i10, j10);
    }

    @Override // yads.dk1
    public final void a(boolean z10, int i10) {
        this.f148507a.releaseOutputBuffer(i10, z10);
    }

    @Override // yads.dk1
    public final void a(final ck1 ck1Var, Handler handler) {
        this.f148507a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: yads.vz3
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f157149a.a(ck1Var, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // yads.dk1
    public final void a(Surface surface) {
        this.f148507a.setOutputSurface(surface);
    }

    @Override // yads.dk1
    public final void a(Bundle bundle) {
        this.f148507a.setParameters(bundle);
    }

    @Override // yads.dk1
    public final ByteBuffer a(int i10) {
        if (ib3.f150516a >= 21) {
            return this.f148507a.getInputBuffer(i10);
        }
        return this.f148508b[i10];
    }
}
