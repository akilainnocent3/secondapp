package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
public final class y740 implements cc5 {
    public final zpa0 a;
    public final lb5 b;
    public boolean c;

    public y740(zpa0 zpa0Var) {
        zpa0Var.getClass();
        this.a = zpa0Var;
        this.b = new lb5();
    }

    @Override // defpackage.cc5
    public final rl5 B0(long j) {
        q0(j);
        return this.b.B0(j);
    }

    @Override // defpackage.cc5
    public final long G1() {
        lb5 lb5Var;
        q0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zRequest = request(i2);
            lb5Var = this.b;
            if (!zRequest) {
                break;
            }
            byte bM = lb5Var.m(i);
            if ((bM < 48 || bM > 57) && ((bM < 97 || bM > 102) && (bM < 65 || bM > 70))) {
                if (i != 0) {
                    break;
                }
                String string = Integer.toString(bM, CharsKt.checkRadix(16));
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return lb5Var.G1();
    }

    @Override // defpackage.cc5
    public final int H0(t2z t2zVar) throws EOFException {
        lb5 lb5Var;
        t2zVar.getClass();
        if (this.c) {
            ib5.a("closed");
            return 0;
        }
        do {
            lb5Var = this.b;
            int iD = b.d(lb5Var, t2zVar, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                lb5Var.skip(t2zVar.b[iD].d());
                return iD;
            }
        } while (this.a.read(lb5Var, 8192L) != -1);
        return -1;
    }

    @Override // defpackage.cc5
    public final InputStream I1() {
        return new a();
    }

    @Override // defpackage.cc5
    public final long K(long j, rl5 rl5Var) {
        rl5Var.getClass();
        return j.a(this, rl5Var, rl5Var.d(), 0L, j);
    }

    @Override // defpackage.cc5
    public final byte[] L0() {
        zpa0 zpa0Var = this.a;
        lb5 lb5Var = this.b;
        lb5Var.R0(zpa0Var);
        return lb5Var.J(lb5Var.b);
    }

    @Override // defpackage.cc5
    public final String M(long j) throws EOFException {
        if (j < 0) {
            kb5.a(avg.a(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jD = d((byte) 10, 0L, j2);
        lb5 lb5Var = this.b;
        if (jD != -1) {
            return b.c(lb5Var, jD);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && lb5Var.m(j2 - 1) == 13 && request(j2 + 1) && lb5Var.m(j2) == 10) {
            return b.c(lb5Var, j2);
        }
        lb5 lb5Var2 = new lb5();
        lb5Var.l(0L, lb5Var2, Math.min(32L, lb5Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(lb5Var.b, j) + " content=" + lb5Var2.B0(lb5Var2.b).e() + (char) 8230);
    }

    @Override // defpackage.cc5
    public final boolean N0() {
        if (this.c) {
            ib5.a("closed");
            return false;
        }
        lb5 lb5Var = this.b;
        return lb5Var.N0() && this.a.read(lb5Var, 8192L) == -1;
    }

    @Override // defpackage.cc5
    public final long S(rl5 rl5Var) {
        rl5Var.getClass();
        long jMax = 0;
        if (this.c) {
            ib5.a("closed");
            return 0L;
        }
        while (true) {
            lb5 lb5Var = this.b;
            long jU = lb5Var.u(jMax, rl5Var);
            if (jU != -1) {
                return jU;
            }
            long j = lb5Var.b;
            if (this.a.read(lb5Var, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // defpackage.cc5
    public final long S0() {
        lb5 lb5Var;
        q0(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zRequest = request(j2);
            lb5Var = this.b;
            if (!zRequest) {
                break;
            }
            byte bM = lb5Var.m(j);
            if ((bM < 48 || bM > 57) && !(j == 0 && bM == 45)) {
                if (j != 0) {
                    break;
                }
                String string = Integer.toString(bM, CharsKt.checkRadix(16));
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            j = j2;
        }
        return lb5Var.S0();
    }

    @Override // defpackage.cc5
    public final long V0(bc5 bc5Var) {
        lb5 lb5Var;
        long j = 0;
        while (true) {
            zpa0 zpa0Var = this.a;
            lb5Var = this.b;
            if (zpa0Var.read(lb5Var, 8192L) == -1) {
                break;
            }
            long jF = lb5Var.f();
            if (jF > 0) {
                j += jF;
                bc5Var.write(lb5Var, jF);
            }
        }
        long j2 = lb5Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        bc5Var.write(lb5Var, j2);
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.d();
    }

    public final long d(byte b, long j, long j2) {
        if (this.c) {
            ib5.a("closed");
            return 0L;
        }
        if (0 > j2) {
            kb5.a(avg.a(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            lb5 lb5Var = this.b;
            byte b2 = b;
            long j3 = j2;
            long jO = lb5Var.o(b2, jMax, j3);
            if (jO != -1) {
                return jO;
            }
            long j4 = lb5Var.b;
            if (j4 >= j3 || this.a.read(lb5Var, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // defpackage.cc5, defpackage.bc5
    public final lb5 e() {
        return this.b;
    }

    public final int f() {
        q0(4L);
        return l.c(this.b.readInt());
    }

    public final long g() throws EOFException {
        q0(8L);
        long j = this.b.readLong();
        lb5.c cVar = l.a;
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // defpackage.cc5
    public final String i0() {
        return M(Long.MAX_VALUE);
    }

    @Override // defpackage.cc5
    public final String i1(Charset charset) {
        charset.getClass();
        zpa0 zpa0Var = this.a;
        lb5 lb5Var = this.b;
        lb5Var.R0(zpa0Var);
        return lb5Var.V(lb5Var.b, charset);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final short l() {
        q0(2L);
        return this.b.P();
    }

    @Override // defpackage.cc5
    public final rl5 l1() {
        zpa0 zpa0Var = this.a;
        lb5 lb5Var = this.b;
        lb5Var.R0(zpa0Var);
        return lb5Var.B0(lb5Var.b);
    }

    public final String m(long j) {
        q0(j);
        return this.b.V(j, Charsets.UTF_8);
    }

    @Override // defpackage.cc5
    public final long m0(rl5 rl5Var) {
        rl5Var.getClass();
        return K(Long.MAX_VALUE, rl5Var);
    }

    @Override // defpackage.cc5
    public final y740 peek() {
        return new y740(new bb00(this));
    }

    @Override // defpackage.cc5
    public final void q0(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.zpa0
    public final long read(lb5 lb5Var, long j) {
        lb5Var.getClass();
        if (j < 0) {
            kb5.a(avg.a(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            ib5.a("closed");
            return 0L;
        }
        lb5 lb5Var2 = this.b;
        if (lb5Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.read(lb5Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return lb5Var2.read(lb5Var, Math.min(j, lb5Var2.b));
    }

    @Override // defpackage.cc5
    public final byte readByte() {
        q0(1L);
        return this.b.readByte();
    }

    @Override // defpackage.cc5
    public final void readFully(byte[] bArr) throws EOFException {
        lb5 lb5Var = this.b;
        bArr.getClass();
        try {
            q0(bArr.length);
            lb5Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = lb5Var.b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = lb5Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    x01.a();
                    return;
                }
                i += i2;
            }
        }
    }

    @Override // defpackage.cc5
    public final int readInt() {
        q0(4L);
        return this.b.readInt();
    }

    @Override // defpackage.cc5
    public final long readLong() {
        q0(8L);
        return this.b.readLong();
    }

    @Override // defpackage.cc5
    public final short readShort() {
        q0(2L);
        return this.b.readShort();
    }

    @Override // defpackage.cc5
    public final boolean request(long j) {
        lb5 lb5Var;
        if (j < 0) {
            kb5.a(avg.a(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            ib5.a("closed");
            return false;
        }
        do {
            lb5Var = this.b;
            if (lb5Var.b >= j) {
                return true;
            }
        } while (this.a.read(lb5Var, 8192L) != -1);
        return false;
    }

    @Override // defpackage.cc5
    public final void skip(long j) throws EOFException {
        if (this.c) {
            ib5.a("closed");
            return;
        }
        while (j > 0) {
            lb5 lb5Var = this.b;
            if (lb5Var.b == 0 && this.a.read(lb5Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, lb5Var.b);
            lb5Var.skip(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.zpa0
    public final sxf0 timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.cc5
    public final void v0(lb5 lb5Var, long j) throws EOFException {
        lb5 lb5Var2 = this.b;
        lb5Var.getClass();
        try {
            q0(j);
            lb5Var2.v0(lb5Var, j);
        } catch (EOFException e) {
            lb5Var.R0(lb5Var2);
            throw e;
        }
    }

    @Override // defpackage.cc5
    public final boolean y(long j, rl5 rl5Var) {
        rl5Var.getClass();
        int iD = rl5Var.d();
        if (!this.c) {
            return iD >= 0 && j >= 0 && iD <= rl5Var.d() && (iD == 0 || j.a(this, rl5Var, iD, j, j + 1) != -1);
        }
        ib5.a("closed");
        return false;
    }

    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            y740 y740Var = y740.this;
            if (!y740Var.c) {
                return (int) Math.min(y740Var.b.b, 2147483647L);
            }
            i08.a("closed");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            y740.this.close();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            bArr.getClass();
            y740 y740Var = y740.this;
            lb5 lb5Var = y740Var.b;
            if (y740Var.c) {
                i08.a("closed");
                return 0;
            }
            l.b(bArr.length, i, i2);
            if (lb5Var.b == 0 && y740Var.a.read(lb5Var, 8192L) == -1) {
                return -1;
            }
            return lb5Var.read(bArr, i, i2);
        }

        public final String toString() {
            return y740.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final long transferTo(OutputStream outputStream) throws IOException {
            outputStream.getClass();
            y740 y740Var = y740.this;
            lb5 lb5Var = y740Var.b;
            if (y740Var.c) {
                i08.a("closed");
                return 0L;
            }
            long j = 0;
            while (true) {
                if (lb5Var.b == 0 && y740Var.a.read(lb5Var, 8192L) == -1) {
                    return j;
                }
                long j2 = lb5Var.b;
                j += j2;
                l.b(j2, 0L, j2);
                e580 e580Var = lb5Var.a;
                while (j2 > 0) {
                    e580Var.getClass();
                    int iMin = (int) Math.min(j2, e580Var.c - e580Var.b);
                    outputStream.write(e580Var.a, e580Var.b, iMin);
                    int i = e580Var.b + iMin;
                    e580Var.b = i;
                    long j3 = iMin;
                    lb5Var.b -= j3;
                    j2 -= j3;
                    if (i == e580Var.c) {
                        e580 e580VarA = e580Var.a();
                        lb5Var.a = e580VarA;
                        h580.a(e580Var);
                        e580Var = e580VarA;
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            y740 y740Var = y740.this;
            lb5 lb5Var = y740Var.b;
            if (y740Var.c) {
                i08.a("closed");
                return 0;
            }
            if (lb5Var.b == 0 && y740Var.a.read(lb5Var, 8192L) == -1) {
                return -1;
            }
            return lb5Var.readByte() & 255;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        lb5 lb5Var = this.b;
        if (lb5Var.b == 0 && this.a.read(lb5Var, 8192L) == -1) {
            return -1;
        }
        return lb5Var.read(byteBuffer);
    }
}
