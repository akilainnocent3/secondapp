package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.l;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class w26 extends b {
    public final g5d H;
    public final nsz I;
    public v26 J;
    public long K;

    public w26() {
        super(6);
        this.H = new g5d(1);
        this.I = new nsz();
    }

    @Override // androidx.media3.exoplayer.b
    public final void E() {
        v26 v26Var = this.J;
        if (v26Var != null) {
            v26Var.d();
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        this.K = Long.MIN_VALUE;
        v26 v26Var = this.J;
        if (v26Var != null) {
            v26Var.d();
        }
    }

    @Override // androidx.media3.exoplayer.l
    public final int d(a aVar) {
        return "application/x-camera-motion".equals(aVar.n) ? l.k(4, 0, 0, 0) : l.k(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void h(long j, long j2) {
        float[] fArr;
        while (!f() && this.K < 100000 + j) {
            g5d g5dVar = this.H;
            g5dVar.j();
            yti ytiVar = this.c;
            ytiVar.a();
            if (M(ytiVar, g5dVar, 0) != -4 || g5dVar.i(4)) {
                return;
            }
            long j3 = g5dVar.f;
            this.K = j3;
            boolean z = j3 < this.A;
            if (this.J != null && !z) {
                g5dVar.m();
                ByteBuffer byteBuffer = g5dVar.d;
                String str = jrh0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    nsz nszVar = this.I;
                    nszVar.G(iLimit, bArrArray);
                    nszVar.I(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(nszVar.l());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.J.c(fArr, this.K - this.z);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.j.b
    public final void m(int i, Object obj) {
        if (i == 8) {
            this.J = (v26) obj;
        }
    }
}
