package defpackage;

import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class qfl0 extends ufl0 {
    public final byte[] d;
    public final int e;
    public int f;

    public qfl0(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            hb5.a(whs.b(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    @Override // defpackage.ufl0
    public final int e() {
        return this.e - this.f;
    }

    public final void g(int i, int i2) throws sfl0 {
        t((i << 3) | i2);
    }

    public final void h(int i, int i2) throws sfl0 {
        t(i << 3);
        s(i2);
    }

    public final void i(int i, int i2) throws sfl0 {
        t(i << 3);
        t(i2);
    }

    public final void j(int i, int i2) throws sfl0 {
        t((i << 3) | 5);
        u(i2);
    }

    public final void k(int i, long j) throws sfl0 {
        t(i << 3);
        v(j);
    }

    public final void l(int i, long j) throws sfl0 {
        t((i << 3) | 1);
        w(j);
    }

    public final void m(int i, boolean z) throws sfl0 {
        t(i << 3);
        r(z ? (byte) 1 : (byte) 0);
    }

    public final void n(int i, String str) throws sfl0 {
        t((i << 3) | 2);
        y(str);
    }

    public final void o(int i, lfl0 lfl0Var) throws sfl0 {
        t((i << 3) | 2);
        p(lfl0Var);
    }

    public final void p(lfl0 lfl0Var) throws sfl0 {
        t(lfl0Var.c());
        lfl0Var.e(this);
    }

    public final void q(lkl0 lkl0Var) throws sfl0 {
        t(lkl0Var.a());
        lkl0Var.c(this);
    }

    public final void r(byte b) throws sfl0 {
        int i = this.f;
        try {
            int i2 = i + 1;
            try {
                this.d[i] = b;
                this.f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new sfl0(i, this.e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void s(int i) throws sfl0 {
        if (i >= 0) {
            t(i);
        } else {
            v(i);
        }
    }

    public final void t(int i) throws sfl0 {
        int i2;
        int i3 = this.f;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.d;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new sfl0(i2, this.e, 1, e);
                }
            }
            throw new sfl0(i2, this.e, 1, e);
        }
    }

    public final void u(int i) throws sfl0 {
        int i2 = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new sfl0(i2, this.e, 4, e);
        }
    }

    public final void v(long j) throws sfl0 {
        int i;
        int i2 = this.f;
        byte[] bArr = this.d;
        int i3 = this.e;
        if (!ufl0.c || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new sfl0(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new sfl0(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                rml0.c.g0(bArr, rml0.f + ((long) i2), (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            rml0.c.g0(bArr, rml0.f + ((long) i2), (byte) j);
        }
        this.f = i;
    }

    public final void w(long j) throws sfl0 {
        int i = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new sfl0(i, this.e, 8, e);
        }
    }

    public final void x(int i, byte[] bArr) throws sfl0 {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i);
            this.f += i;
        } catch (IndexOutOfBoundsException e) {
            throw new sfl0(this.f, this.e, i, e);
        }
    }

    public final void y(String str) throws sfl0 {
        int i = this.f;
        try {
            int iF = ufl0.f(str.length() * 3);
            int iF2 = ufl0.f(str.length());
            int i2 = this.e;
            byte[] bArr = this.d;
            if (iF2 != iF) {
                t(wml0.b(str));
                int i3 = this.f;
                this.f = wml0.c(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + iF2;
                this.f = i4;
                int iC = wml0.c(str, bArr, i4, i2 - i4);
                this.f = i;
                t((iC - i) - iF2);
                this.f = iC;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new sfl0(e);
        } catch (uml0 e2) {
            this.f = i;
            ufl0.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(kil0.a);
            try {
                int length = bytes.length;
                t(length);
                x(length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new sfl0(e3);
            }
        }
    }
}
