package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r08 extends b3 {
    public static final Logger d = Logger.getLogger(r08.class.getName());
    public static final boolean e = chh0.e;
    public t08 c;

    public static class a extends r08 {
        public final byte[] f;
        public final int i;
        public int v;

        public a(int i, byte[] bArr) {
            if (((bArr.length - i) | i) < 0) {
                ljh.a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
                throw null;
            }
            this.f = bArr;
            this.v = 0;
            this.i = i;
        }

        public final int j0() {
            return this.i - this.v;
        }

        public final void k0(byte b) throws b {
            try {
                byte[] bArr = this.f;
                int i = this.v;
                this.v = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.i), 1), e);
            }
        }

        public final void l0(int i, boolean z) throws b {
            v0(i, 0);
            k0(z ? (byte) 1 : (byte) 0);
        }

        public final void m0(int i, ql5 ql5Var) throws b {
            v0(i, 2);
            x0(ql5Var.size());
            ql5Var.m(this);
        }

        public final void n0(int i, int i2) throws b {
            v0(i, 5);
            o0(i2);
        }

        public final void o0(int i) throws b {
            try {
                byte[] bArr = this.f;
                int i2 = this.v;
                int i3 = i2 + 1;
                this.v = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.v = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.v = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.v = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.i), 1), e);
            }
        }

        public final void p0(int i, long j) throws b {
            v0(i, 1);
            q0(j);
        }

        public final void q0(long j) throws b {
            try {
                byte[] bArr = this.f;
                int i = this.v;
                int i2 = i + 1;
                this.v = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.v = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.v = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.v = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.v = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.v = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.v = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.v = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.i), 1), e);
            }
        }

        public final void r0(int i, int i2) throws b {
            v0(i, 0);
            s0(i2);
        }

        public final void s0(int i) throws b {
            if (i >= 0) {
                x0(i);
            } else {
                z0(i);
            }
        }

        public final void t0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f, this.v, i2);
                this.v += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.i), Integer.valueOf(i2)), e);
            }
        }

        public final void u0(int i, String str) throws b {
            v0(i, 2);
            int i2 = this.v;
            try {
                int iH0 = r08.h0(str.length() * 3);
                int iH1 = r08.h0(str.length());
                byte[] bArr = this.f;
                if (iH1 != iH0) {
                    x0(yqh0.a(str));
                    this.v = yqh0.a.b(str, bArr, this.v, j0());
                    return;
                }
                int i3 = i2 + iH1;
                this.v = i3;
                int iB = yqh0.a.b(str, bArr, i3, j0());
                this.v = i2;
                x0((iB - i2) - iH1);
                this.v = iB;
            } catch (IndexOutOfBoundsException e) {
                throw new b(e);
            } catch (yqh0.d e2) {
                this.v = i2;
                r08.d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                byte[] bytes = str.getBytes(gyo.a);
                try {
                    x0(bytes.length);
                    t0(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e3) {
                    throw new b(e3);
                }
            }
        }

        public final void v0(int i, int i2) throws b {
            x0((i << 3) | i2);
        }

        public final void w0(int i, int i2) throws b {
            v0(i, 0);
            x0(i2);
        }

        public final void x0(int i) throws b {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.v;
                byte[] bArr = this.f;
                if (i2 == 0) {
                    this.v = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        this.v = i3 + 1;
                        bArr[i3] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.i), 1), e);
                    }
                }
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.i), 1), e);
            }
        }

        public final void y0(int i, long j) throws b {
            v0(i, 0);
            z0(j);
        }

        public final void z0(long j) throws b {
            boolean z = r08.e;
            byte[] bArr = this.f;
            if (!z || j0() < 10) {
                while (true) {
                    long j2 = j & (-128);
                    int i = this.v;
                    if (j2 == 0) {
                        this.v = i + 1;
                        bArr[i] = (byte) j;
                        return;
                    } else {
                        try {
                            this.v = i + 1;
                            bArr[i] = (byte) ((((int) j) & 127) | 128);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.i), 1), e);
                        }
                    }
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.i), 1), e);
                }
            }
            while (true) {
                long j3 = j & (-128);
                int i2 = this.v;
                if (j3 == 0) {
                    this.v = i2 + 1;
                    chh0.l(bArr, i2, (byte) j);
                    return;
                } else {
                    this.v = i2 + 1;
                    chh0.l(bArr, i2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }
    }

    public r08() {
        super(2);
    }

    public static int X(int i, ql5 ql5Var) {
        return Y(ql5Var) + f0(i);
    }

    public static int Y(ql5 ql5Var) {
        int size = ql5Var.size();
        return h0(size) + size;
    }

    public static int Z(int i) {
        return f0(i) + 4;
    }

    public static int a0(int i) {
        return f0(i) + 8;
    }

    @Deprecated
    public static int b0(int i, wnv wnvVar, an70 an70Var) {
        return ((d4) wnvVar).c(an70Var) + (f0(i) * 2);
    }

    public static int c0(int i) {
        if (i >= 0) {
            return h0(i);
        }
        return 10;
    }

    public static int d0(dur durVar) {
        int serializedSize;
        if (durVar.b != null) {
            serializedSize = durVar.b.size();
        } else {
            serializedSize = durVar.a != null ? durVar.a.getSerializedSize() : 0;
        }
        return h0(serializedSize) + serializedSize;
    }

    public static int e0(String str) {
        int length;
        try {
            length = yqh0.a(str);
        } catch (yqh0.d unused) {
            length = str.getBytes(gyo.a).length;
        }
        return h0(length) + length;
    }

    public static int f0(int i) {
        return h0(i << 3);
    }

    public static int g0(int i, int i2) {
        return h0(i2) + f0(i);
    }

    public static int h0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int i0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static class b extends IOException {
        public b(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }

        public b(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
