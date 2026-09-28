package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class woa0 implements j31 {
    public float b;
    public float c;
    public j31.a d;
    public j31.a e;
    public j31.a f;
    public j31.a g;
    public boolean h;
    public voa0 i;
    public ByteBuffer j;
    public ShortBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // defpackage.j31
    public final boolean b() {
        if (this.o) {
            voa0 voa0Var = this.i;
            if (voa0Var != null) {
                ly0.f(voa0Var.m >= 0);
                if (voa0Var.m * voa0Var.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.j31
    public final ByteBuffer c() {
        voa0 voa0Var = this.i;
        if (voa0Var != null) {
            int i = voa0Var.b;
            ly0.f(voa0Var.m >= 0);
            int i2 = voa0Var.m * i * 2;
            if (i2 > 0) {
                if (this.j.capacity() < i2) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.j = byteBufferOrder;
                    this.k = byteBufferOrder.asShortBuffer();
                } else {
                    this.j.clear();
                    this.k.clear();
                }
                ShortBuffer shortBuffer = this.k;
                ly0.f(voa0Var.m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i, voa0Var.m);
                int i3 = iMin * i;
                shortBuffer.put(voa0Var.l, 0, i3);
                int i4 = voa0Var.m - iMin;
                voa0Var.m = i4;
                short[] sArr = voa0Var.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.n += (long) i2;
                this.j.limit(i2);
                this.l = this.j;
            }
        }
        ByteBuffer byteBuffer = this.l;
        this.l = j31.a;
        return byteBuffer;
    }

    @Override // defpackage.j31
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            voa0 voa0Var = this.i;
            voa0Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.m += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = voa0Var.b;
            int i2 = iRemaining2 / i;
            short[] sArrC = voa0Var.c(voa0Var.j, voa0Var.k, i2);
            voa0Var.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, voa0Var.k * i, ((i2 * i) * 2) / 2);
            voa0Var.k += i2;
            voa0Var.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.j31
    public final j31.a e(j31.a aVar) throws j31.b {
        if (aVar.c != 2) {
            throw new j31.b(aVar);
        }
        int i = aVar.a;
        this.d = aVar;
        j31.a aVar2 = new j31.a(i, aVar.b, 2);
        this.e = aVar2;
        this.h = true;
        return aVar2;
    }

    @Override // defpackage.j31
    public final void f() {
        voa0 voa0Var = this.i;
        if (voa0Var != null) {
            int i = voa0Var.k;
            float f = voa0Var.c;
            float f2 = voa0Var.d;
            double d = f / f2;
            double d2 = voa0Var.e * f2;
            int i2 = voa0Var.r;
            int i3 = voa0Var.m + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + voa0Var.w) + ((double) voa0Var.o)) / d2) + 0.5d));
            voa0Var.w = 0.0d;
            short[] sArr = voa0Var.j;
            int i4 = voa0Var.h * 2;
            voa0Var.j = voa0Var.c(sArr, i, i4 + i);
            int i5 = 0;
            while (true) {
                int i6 = voa0Var.b;
                if (i5 >= i4 * i6) {
                    break;
                }
                voa0Var.j[(i6 * i) + i5] = 0;
                i5++;
            }
            voa0Var.k = i4 + voa0Var.k;
            voa0Var.f();
            if (voa0Var.m > i3) {
                voa0Var.m = Math.max(i3, 0);
            }
            voa0Var.k = 0;
            voa0Var.r = 0;
            voa0Var.o = 0;
        }
        this.o = true;
    }

    @Override // defpackage.j31
    public final void flush() {
        if (isActive()) {
            j31.a aVar = this.d;
            this.f = aVar;
            j31.a aVar2 = this.e;
            this.g = aVar2;
            if (this.h) {
                this.i = new voa0(aVar.a, aVar.b, this.b, this.c, aVar2.a);
            } else {
                voa0 voa0Var = this.i;
                if (voa0Var != null) {
                    voa0Var.k = 0;
                    voa0Var.m = 0;
                    voa0Var.o = 0;
                    voa0Var.p = 0;
                    voa0Var.q = 0;
                    voa0Var.r = 0;
                    voa0Var.s = 0;
                    voa0Var.t = 0;
                    voa0Var.u = 0;
                    voa0Var.v = 0;
                    voa0Var.w = 0.0d;
                }
            }
        }
        this.l = j31.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // defpackage.j31
    public final boolean isActive() {
        if (this.e.a != -1) {
            return Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.a != this.d.a;
        }
        return false;
    }

    @Override // defpackage.j31
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        j31.a aVar = j31.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        ByteBuffer byteBuffer = j31.a;
        this.j = byteBuffer;
        this.k = byteBuffer.asShortBuffer();
        this.l = byteBuffer;
        this.h = false;
        this.i = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
