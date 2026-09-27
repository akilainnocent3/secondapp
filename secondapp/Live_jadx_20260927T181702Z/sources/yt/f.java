package yt;

import androidx.datastore.preferences.protobuf.b0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f159884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159885b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OutputStream f159888e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f159887d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f159886c = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends IOException {
        public a() {
            super(b0.f.f9586c);
        }
    }

    public f(OutputStream outputStream, byte[] bArr) {
        this.f159888e = outputStream;
        this.f159884a = bArr;
        this.f159885b = bArr.length;
    }

    public static int A(int i10, long j10) {
        return D(i10) + B(j10);
    }

    public static int B(long j10) {
        return w(H(j10));
    }

    public static int C(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported.", e10);
        }
    }

    public static int D(int i10) {
        return v(z.c(i10, 0));
    }

    public static int E(int i10) {
        return v(i10);
    }

    public static int F(long j10) {
        return w(j10);
    }

    public static int G(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long H(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static f J(OutputStream outputStream, int i10) {
        return new f(outputStream, new byte[i10]);
    }

    public static int a(int i10, boolean z10) {
        return D(i10) + b(z10);
    }

    public static int b(boolean z10) {
        return 1;
    }

    public static int c(byte[] bArr) {
        return v(bArr.length) + bArr.length;
    }

    public static int d(int i10, d dVar) {
        return D(i10) + e(dVar);
    }

    public static int e(d dVar) {
        return v(dVar.size()) + dVar.size();
    }

    public static int f(int i10, double d10) {
        return D(i10) + g(d10);
    }

    public static int g(double d10) {
        return 8;
    }

    public static int h(int i10, int i11) {
        return D(i10) + i(i11);
    }

    public static int i(int i10) {
        return p(i10);
    }

    public static int j(int i10) {
        return 4;
    }

    public static int k(long j10) {
        return 8;
    }

    public static int l(int i10, float f10) {
        return D(i10) + m(f10);
    }

    public static int m(float f10) {
        return 4;
    }

    public static int n(q qVar) {
        return qVar.getSerializedSize();
    }

    public static int o(int i10, int i11) {
        return D(i10) + p(i11);
    }

    public static int p(int i10) {
        if (i10 >= 0) {
            return v(i10);
        }
        return 10;
    }

    public static int q(long j10) {
        return w(j10);
    }

    public static int r(m mVar) {
        int iB = mVar.b();
        return v(iB) + iB;
    }

    public static int s(int i10, q qVar) {
        return D(i10) + t(qVar);
    }

    public static int t(q qVar) {
        int serializedSize = qVar.getSerializedSize();
        return v(serializedSize) + serializedSize;
    }

    public static int u(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int v(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int w(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if ((sv.a.f135551y & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int x(int i10) {
        return 4;
    }

    public static int y(long j10) {
        return 8;
    }

    public static int z(int i10) {
        return v(G(i10));
    }

    public void I() throws IOException {
        if (this.f159888e != null) {
            K();
        }
    }

    public final void K() throws IOException {
        OutputStream outputStream = this.f159888e;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f159884a, 0, this.f159886c);
        this.f159886c = 0;
    }

    public void L(int i10, boolean z10) throws IOException {
        w0(i10, 0);
        M(z10);
    }

    public void M(boolean z10) throws IOException {
        h0(z10 ? 1 : 0);
    }

    public void N(byte[] bArr) throws IOException {
        o0(bArr.length);
        k0(bArr);
    }

    public void O(int i10, d dVar) throws IOException {
        w0(i10, 2);
        P(dVar);
    }

    public void P(d dVar) throws IOException {
        o0(dVar.size());
        i0(dVar);
    }

    public void Q(int i10, double d10) throws IOException {
        w0(i10, 1);
        R(d10);
    }

    public void R(double d10) throws IOException {
        n0(Double.doubleToRawLongBits(d10));
    }

    public void S(int i10, int i11) throws IOException {
        w0(i10, 0);
        T(i11);
    }

    public void T(int i10) throws IOException {
        b0(i10);
    }

    public void U(int i10) throws IOException {
        m0(i10);
    }

    public void V(long j10) throws IOException {
        n0(j10);
    }

    public void W(int i10, float f10) throws IOException {
        w0(i10, 5);
        X(f10);
    }

    public void X(float f10) throws IOException {
        m0(Float.floatToRawIntBits(f10));
    }

    public void Y(int i10, q qVar) throws IOException {
        w0(i10, 3);
        Z(qVar);
        w0(i10, 4);
    }

    public void Z(q qVar) throws IOException {
        qVar.a(this);
    }

    public void a0(int i10, int i11) throws IOException {
        w0(i10, 0);
        b0(i11);
    }

    public void b0(int i10) throws IOException {
        if (i10 >= 0) {
            o0(i10);
        } else {
            p0(i10);
        }
    }

    public void c0(long j10) throws IOException {
        p0(j10);
    }

    public void d0(int i10, q qVar) throws IOException {
        w0(i10, 2);
        e0(qVar);
    }

    public void e0(q qVar) throws IOException {
        o0(qVar.getSerializedSize());
        qVar.a(this);
    }

    public void f0(int i10, q qVar) throws IOException {
        w0(1, 3);
        x0(2, i10);
        d0(3, qVar);
        w0(1, 4);
    }

    public void g0(byte b10) throws IOException {
        if (this.f159886c == this.f159885b) {
            K();
        }
        byte[] bArr = this.f159884a;
        int i10 = this.f159886c;
        this.f159886c = i10 + 1;
        bArr[i10] = b10;
        this.f159887d++;
    }

    public void h0(int i10) throws IOException {
        g0((byte) i10);
    }

    public void i0(d dVar) throws IOException {
        j0(dVar, 0, dVar.size());
    }

    public void j0(d dVar, int i10, int i11) throws IOException {
        int i12 = this.f159885b;
        int i13 = this.f159886c;
        if (i12 - i13 >= i11) {
            dVar.h(this.f159884a, i10, i13, i11);
            this.f159886c += i11;
            this.f159887d += i11;
            return;
        }
        int i14 = i12 - i13;
        dVar.h(this.f159884a, i10, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f159886c = this.f159885b;
        this.f159887d += i14;
        K();
        if (i16 <= this.f159885b) {
            dVar.h(this.f159884a, i15, 0, i16);
            this.f159886c = i16;
        } else {
            dVar.w(this.f159888e, i15, i16);
        }
        this.f159887d += i16;
    }

    public void k0(byte[] bArr) throws IOException {
        l0(bArr, 0, bArr.length);
    }

    public void l0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f159885b;
        int i13 = this.f159886c;
        if (i12 - i13 >= i11) {
            System.arraycopy(bArr, i10, this.f159884a, i13, i11);
            this.f159886c += i11;
            this.f159887d += i11;
            return;
        }
        int i14 = i12 - i13;
        System.arraycopy(bArr, i10, this.f159884a, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f159886c = this.f159885b;
        this.f159887d += i14;
        K();
        if (i16 <= this.f159885b) {
            System.arraycopy(bArr, i15, this.f159884a, 0, i16);
            this.f159886c = i16;
        } else {
            this.f159888e.write(bArr, i15, i16);
        }
        this.f159887d += i16;
    }

    public void m0(int i10) throws IOException {
        h0(i10 & 255);
        h0((i10 >> 8) & 255);
        h0((i10 >> 16) & 255);
        h0((i10 >> 24) & 255);
    }

    public void n0(long j10) throws IOException {
        h0(((int) j10) & 255);
        h0(((int) (j10 >> 8)) & 255);
        h0(((int) (j10 >> 16)) & 255);
        h0(((int) (j10 >> 24)) & 255);
        h0(((int) (j10 >> 32)) & 255);
        h0(((int) (j10 >> 40)) & 255);
        h0(((int) (j10 >> 48)) & 255);
        h0(((int) (j10 >> 56)) & 255);
    }

    public void o0(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            h0((i10 & 127) | 128);
            i10 >>>= 7;
        }
        h0(i10);
    }

    public void p0(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            h0((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        h0((int) j10);
    }

    public void q0(int i10) throws IOException {
        m0(i10);
    }

    public void r0(long j10) throws IOException {
        n0(j10);
    }

    public void s0(int i10) throws IOException {
        o0(G(i10));
    }

    public void t0(int i10, long j10) throws IOException {
        w0(i10, 0);
        u0(j10);
    }

    public void u0(long j10) throws IOException {
        p0(H(j10));
    }

    public void v0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        o0(bytes.length);
        k0(bytes);
    }

    public void w0(int i10, int i11) throws IOException {
        o0(z.c(i10, i11));
    }

    public void x0(int i10, int i11) throws IOException {
        w0(i10, 0);
        y0(i11);
    }

    public void y0(int i10) throws IOException {
        o0(i10);
    }

    public void z0(long j10) throws IOException {
        p0(j10);
    }
}
