package defpackage;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class no50 implements a7l {
    public float A;
    public float B;
    public long C;
    public qx80 D;
    public boolean E;
    public int F;
    public long G;
    public mmd H;
    public asr I;
    public m750 J;
    public int K;
    public b9z L;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float i;
    public long v;
    public long w;
    public float y;
    public float z;

    @Override // defpackage.a7l
    public final void A1(qx80 qx80Var) {
        if (Intrinsics.g(this.D, qx80Var)) {
            return;
        }
        this.a |= 8192;
        this.D = qx80Var;
    }

    @Override // defpackage.a7l
    public final void B(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    @Override // defpackage.a7l
    public final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    @Override // defpackage.a7l
    public final void c(int i) {
        if (this.K == i) {
            return;
        }
        this.a |= 524288;
        this.K = i;
    }

    @Override // defpackage.a7l
    public final void c0(int i) {
        if (this.F == i) {
            return;
        }
        this.a |= 32768;
        this.F = i;
    }

    @Override // defpackage.a7l
    public final long d() {
        return this.G;
    }

    @Override // defpackage.a7l
    public final void f(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.H.getDensity();
    }

    @Override // defpackage.a7l
    public final void h(long j) {
        long j2 = this.v;
        int i = j58.n;
        if (nbh0.a(j2, j)) {
            return;
        }
        this.a |= 64;
        this.v = j;
    }

    @Override // defpackage.a7l
    public final void k(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    @Override // defpackage.a7l
    public final void l(boolean z) {
        if (this.E != z) {
            this.a |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.E = z;
        }
    }

    @Override // defpackage.a7l
    public final void n(long j) {
        long j2 = this.w;
        int i = j58.n;
        if (nbh0.a(j2, j)) {
            return;
        }
        this.a |= 128;
        this.w = j;
    }

    @Override // defpackage.a7l
    public final void p(float f) {
        if (this.B == f) {
            return;
        }
        this.a |= 2048;
        this.B = f;
    }

    @Override // defpackage.a7l
    public final void q(float f) {
        if (this.y == f) {
            return;
        }
        this.a |= 256;
        this.y = f;
    }

    @Override // defpackage.a7l
    public final void r(float f) {
        if (this.z == f) {
            return;
        }
        this.a |= 512;
        this.z = f;
    }

    @Override // defpackage.a7l
    public final void t(float f) {
        if (this.i == f) {
            return;
        }
        this.a |= 32;
        this.i = f;
    }

    @Override // defpackage.a7l
    public final void u(float f) {
        if (this.A == f) {
            return;
        }
        this.a |= 1024;
        this.A = f;
    }

    @Override // defpackage.a7l
    public final void v(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    @Override // defpackage.a7l
    public final void v0(hg4 hg4Var) {
        if (Intrinsics.g(this.J, hg4Var)) {
            return;
        }
        this.a |= 131072;
        this.J = hg4Var;
    }

    @Override // defpackage.a7l
    public final float y() {
        return this.f;
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.H.y1();
    }

    @Override // defpackage.a7l
    public final float z() {
        return this.e;
    }

    @Override // defpackage.a7l
    public final void z0(long j) {
        if (jsg0.a(this.C, j)) {
            return;
        }
        this.a |= 4096;
        this.C = j;
    }

    @Override // defpackage.a7l
    public final void j() {
    }
}
