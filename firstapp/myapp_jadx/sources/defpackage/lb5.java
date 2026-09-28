package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
public final class lb5 implements cc5, bc5, Cloneable, ByteChannel {
    public e580 a;
    public long b;

    public static final class c implements Closeable {
        public lb5 a;
        public boolean b;
        public e580 c;
        public byte[] e;
        public long d = -1;
        public int f = -1;
        public int i = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.a == null) {
                ib5.a("not attached to a buffer");
                return;
            }
            this.a = null;
            this.c = null;
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.i = -1;
        }

        public final void d(long j) {
            lb5 lb5Var = this.a;
            if (lb5Var == null) {
                ib5.a("not attached to a buffer");
                return;
            }
            if (!this.b) {
                ib5.a("resizeBuffer() only permitted for read/write buffers");
                return;
            }
            long j2 = lb5Var.b;
            if (j <= j2) {
                if (j < 0) {
                    kb5.a(avg.a(j, "newSize < 0: "));
                    return;
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    e580 e580Var = lb5Var.a;
                    e580Var.getClass();
                    e580 e580Var2 = e580Var.g;
                    e580Var2.getClass();
                    int i = e580Var2.c;
                    long j4 = i - e580Var2.b;
                    if (j4 > j3) {
                        e580Var2.c = i - ((int) j3);
                        break;
                    } else {
                        lb5Var.a = e580Var2.a();
                        h580.a(e580Var2);
                        j3 -= j4;
                    }
                }
                this.c = null;
                this.d = j;
                this.e = null;
                this.f = -1;
                this.i = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    e580 e580VarB0 = lb5Var.b0(i2);
                    int iMin = (int) Math.min(j5, 8192 - e580VarB0.c);
                    int i3 = e580VarB0.c + iMin;
                    e580VarB0.c = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.c = e580VarB0;
                        this.d = j2;
                        this.e = e580VarB0.a;
                        this.f = i3 - iMin;
                        this.i = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            lb5Var.b = j;
        }

        public final int f(long j) {
            lb5 lb5Var = this.a;
            if (lb5Var == null) {
                ib5.a("not attached to a buffer");
                return 0;
            }
            if (j >= -1) {
                long j2 = lb5Var.b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.c = null;
                        this.d = j;
                        this.e = null;
                        this.f = -1;
                        this.i = -1;
                        return -1;
                    }
                    e580 e580Var = lb5Var.a;
                    e580 e580Var2 = this.c;
                    long j3 = 0;
                    if (e580Var2 != null) {
                        long j4 = this.d - ((long) (this.f - e580Var2.b));
                        if (j4 > j) {
                            e580Var2 = e580Var;
                            e580Var = e580Var2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        e580Var2 = e580Var;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            e580Var2.getClass();
                            long j5 = ((long) (e580Var2.c - e580Var2.b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            e580Var2 = e580Var2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            e580Var.getClass();
                            e580Var = e580Var.g;
                            e580Var.getClass();
                            j2 -= (long) (e580Var.c - e580Var.b);
                        }
                        e580Var2 = e580Var;
                        j3 = j2;
                    }
                    if (this.b) {
                        e580Var2.getClass();
                        if (e580Var2.d) {
                            byte[] bArr = e580Var2.a;
                            e580 e580Var3 = new e580(Arrays.copyOf(bArr, bArr.length), e580Var2.b, e580Var2.c, false, true);
                            if (lb5Var.a == e580Var2) {
                                lb5Var.a = e580Var3;
                            }
                            e580Var2.b(e580Var3);
                            e580 e580Var4 = e580Var3.g;
                            e580Var4.getClass();
                            e580Var4.a();
                            e580Var2 = e580Var3;
                        }
                    }
                    this.c = e580Var2;
                    this.d = j;
                    e580Var2.getClass();
                    this.e = e580Var2.a;
                    int i = e580Var2.b + ((int) (j - j3));
                    this.f = i;
                    int i2 = e580Var2.c;
                    this.i = i2;
                    return i2 - i;
                }
            }
            StringBuilder sbA = q6a0.a(j, "offset=", " > size=");
            sbA.append(lb5Var.b);
            throw new ArrayIndexOutOfBoundsException(sbA.toString());
        }
    }

    public final void A0(int i) {
        if (i < 128) {
            d0(i);
            return;
        }
        if (i < 2048) {
            e580 e580VarB0 = b0(2);
            byte[] bArr = e580VarB0.a;
            int i2 = e580VarB0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            e580VarB0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            d0(63);
            return;
        }
        if (i < 65536) {
            e580 e580VarB1 = b0(3);
            byte[] bArr2 = e580VarB1.a;
            int i3 = e580VarB1.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            e580VarB1.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            hb5.a("Unexpected code point: 0x".concat(l.e(i)));
            return;
        }
        e580 e580VarB2 = b0(4);
        byte[] bArr3 = e580VarB2.a;
        int i4 = e580VarB2.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        e580VarB2.c = i4 + 4;
        this.b += 4;
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 B(int i) {
        A0(i);
        return this;
    }

    @Override // defpackage.cc5
    public final rl5 B0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            kb5.a(avg.a(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new rl5(J(j));
        }
        rl5 rl5VarA0 = a0((int) j);
        skip(j);
        return rl5VarA0;
    }

    public final boolean F(int i, rl5 rl5Var, long j) {
        rl5Var.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.b && i <= rl5Var.d()) {
            return i == 0 || defpackage.b.a(this, rl5Var, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // defpackage.bc5
    public final OutputStream F1() {
        return new b();
    }

    @Override // defpackage.cc5
    public final long G1() throws EOFException {
        int i;
        if (this.b == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            e580 e580Var = this.a;
            e580Var.getClass();
            byte[] bArr = e580Var.a;
            int i3 = e580Var.b;
            int i4 = e580Var.c;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else {
                    if (b2 < 65 || b2 > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(l.d(b2)));
                        }
                        z = true;
                        break;
                    }
                    i = b2 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    lb5 lb5Var = new lb5();
                    lb5Var.f0(j);
                    lb5Var.d0(b2);
                    throw new NumberFormatException("Number too large: ".concat(lb5Var.Y()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.a = e580Var.a();
                h580.a(e580Var);
            } else {
                e580Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.a != null);
        this.b -= (long) i2;
        return j;
    }

    public final c H(c cVar) {
        cVar.getClass();
        byte[] bArr = defpackage.b.a;
        cVar.getClass();
        if (cVar == l.a) {
            cVar = new c();
        }
        if (cVar.a != null) {
            ib5.a("already attached to a buffer");
            return null;
        }
        cVar.a = this;
        cVar.b = true;
        return cVar;
    }

    @Override // defpackage.cc5
    public final int H0(t2z t2zVar) throws EOFException {
        t2zVar.getClass();
        int iD = defpackage.b.d(this, t2zVar, false);
        if (iD == -1) {
            return -1;
        }
        skip(t2zVar.b[iD].d());
        return iD;
    }

    @Override // defpackage.cc5
    public final InputStream I1() {
        return new a();
    }

    public final byte[] J(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            kb5.a(avg.a(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // defpackage.cc5
    public final long K(long j, rl5 rl5Var) {
        rl5Var.getClass();
        byte[] bArr = defpackage.b.a;
        return defpackage.b.a(this, rl5Var, 0L, j, rl5Var.d());
    }

    @Override // defpackage.cc5
    public final byte[] L0() {
        return J(this.b);
    }

    @Override // defpackage.cc5
    public final String M(long j) throws EOFException {
        if (j < 0) {
            kb5.a(avg.a(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jO = o((byte) 10, 0L, j2);
        if (jO != -1) {
            return defpackage.b.c(this, jO);
        }
        if (j2 < this.b && m(j2 - 1) == 13 && m(j2) == 10) {
            return defpackage.b.c(this, j2);
        }
        lb5 lb5Var = new lb5();
        l(0L, lb5Var, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + lb5Var.B0(lb5Var.b).e() + (char) 8230);
    }

    @Override // defpackage.cc5
    public final boolean N0() {
        return this.b == 0;
    }

    public final short P() throws EOFException {
        short s = readShort();
        c cVar = l.a;
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 R(String str) {
        z0(str);
        return this;
    }

    @Override // defpackage.bc5
    public final long R0(zpa0 zpa0Var) {
        zpa0Var.getClass();
        long j = 0;
        while (true) {
            long j2 = zpa0Var.read(this, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // defpackage.cc5
    public final long S(rl5 rl5Var) {
        rl5Var.getClass();
        return u(0L, rl5Var);
    }

    @Override // defpackage.cc5
    public final long S0() throws EOFException {
        long j;
        byte b2;
        long j2 = 0;
        if (this.b == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            e580 e580Var = this.a;
            e580Var.getClass();
            byte[] bArr = e580Var.a;
            int i2 = e580Var.b;
            int i3 = e580Var.c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b2 = bArr[i2];
                if (b2 >= 48 && b2 <= 57) {
                    int i4 = 48 - b2;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b2 != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.a = e580Var.a();
                h580.a(e580Var);
            } else {
                e580Var.b = i2;
            }
            if (z2 || this.a == null) {
                long j5 = this.b - ((long) i);
                this.b = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                StringBuilder sbB = mq0.b(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbB.append(l.d(m(j)));
                throw new NumberFormatException(sbB.toString());
            }
            j2 = j;
        }
        lb5 lb5Var = new lb5();
        lb5Var.e0(j3);
        lb5Var.d0(b2);
        if (!z) {
            lb5Var.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(lb5Var.Y()));
    }

    public final String V(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            kb5.a(avg.a(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        e580 e580Var = this.a;
        e580Var.getClass();
        int i = e580Var.b;
        if (((long) i) + j > e580Var.c) {
            return new String(J(j), charset);
        }
        int i2 = (int) j;
        String str = new String(e580Var.a, i, i2, charset);
        int i3 = e580Var.b + i2;
        e580Var.b = i3;
        this.b -= j;
        if (i3 == e580Var.c) {
            this.a = e580Var.a();
            h580.a(e580Var);
        }
        return str;
    }

    @Override // defpackage.cc5
    public final long V0(bc5 bc5Var) {
        long j = this.b;
        if (j > 0) {
            bc5Var.write(this, j);
        }
        return j;
    }

    public final String Y() {
        return V(this.b, Charsets.UTF_8);
    }

    public final int Z() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            throw new EOFException();
        }
        byte bM = m(0L);
        if ((bM & 128) == 0) {
            i = bM & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bM & 224) == 192) {
            i = bM & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bM & 240) == 224) {
            i = bM & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bM & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder sbA = efe0.a(i2, "size < ", ": ");
            sbA.append(this.b);
            sbA.append(" (to read code point prefixed 0x");
            sbA.append(l.d(bM));
            sbA.append(')');
            throw new EOFException(sbA.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bM2 = m(j2);
            if ((bM2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bM2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final rl5 a0(int i) {
        if (i == 0) {
            return rl5.d;
        }
        l.b(this.b, 0L, i);
        e580 e580Var = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            e580Var.getClass();
            int i5 = e580Var.c;
            int i6 = e580Var.b;
            if (i5 == i6) {
                jb5.a("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            e580Var = e580Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        e580 e580Var2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            e580Var2.getClass();
            bArr[i7] = e580Var2.a;
            i2 += e580Var2.c - e580Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = e580Var2.b;
            e580Var2.d = true;
            i7++;
            e580Var2 = e580Var2.f;
        }
        return new s580(bArr, iArr);
    }

    public final e580 b0(int i) {
        if (i < 1 || i > 8192) {
            hb5.a("unexpected capacity");
            return null;
        }
        e580 e580Var = this.a;
        if (e580Var == null) {
            e580 e580VarB = h580.b();
            this.a = e580VarB;
            e580VarB.g = e580VarB;
            e580VarB.f = e580VarB;
            return e580VarB;
        }
        e580 e580Var2 = e580Var.g;
        e580Var2.getClass();
        if (e580Var2.c + i <= 8192 && e580Var2.e) {
            return e580Var2;
        }
        e580 e580VarB2 = h580.b();
        e580Var2.b(e580VarB2);
        return e580VarB2;
    }

    public final void c0(rl5 rl5Var) {
        rl5Var.getClass();
        rl5Var.t(rl5Var.d(), this);
    }

    public final Object clone() {
        return g();
    }

    public final void d() throws EOFException {
        skip(this.b);
    }

    public final void d0(int i) {
        e580 e580VarB0 = b0(1);
        byte[] bArr = e580VarB0.a;
        int i2 = e580VarB0.c;
        e580VarB0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void e0(long j) {
        boolean z;
        if (j == 0) {
            d0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                z0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = defpackage.b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > defpackage.b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        e580 e580VarB0 = b0(i);
        byte[] bArr2 = e580VarB0.a;
        int i2 = e580VarB0.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = defpackage.b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        e580VarB0.c += i;
        this.b += (long) i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb5)) {
            return false;
        }
        long j = this.b;
        lb5 lb5Var = (lb5) obj;
        if (j != lb5Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        e580 e580Var = this.a;
        e580Var.getClass();
        e580 e580Var2 = lb5Var.a;
        e580Var2.getClass();
        int i = e580Var.b;
        int i2 = e580Var2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(e580Var.c - i, e580Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (e580Var.a[i] != e580Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == e580Var.c) {
                e580Var = e580Var.f;
                e580Var.getClass();
                i = e580Var.b;
            }
            if (i2 == e580Var2.c) {
                e580Var2 = e580Var2.f;
                e580Var2.getClass();
                i2 = e580Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final long f() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        e580 e580Var = this.a;
        e580Var.getClass();
        e580 e580Var2 = e580Var.g;
        e580Var2.getClass();
        int i = e580Var2.c;
        return (i >= 8192 || !e580Var2.e) ? j : j - ((long) (i - e580Var2.b));
    }

    public final void f0(long j) {
        if (j == 0) {
            d0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        e580 e580VarB0 = b0(i);
        byte[] bArr = e580VarB0.a;
        int i2 = e580VarB0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = defpackage.b.a[(int) (15 & j)];
            j >>>= 4;
        }
        e580VarB0.c += i;
        this.b += (long) i;
    }

    public final lb5 g() {
        lb5 lb5Var = new lb5();
        if (this.b == 0) {
            return lb5Var;
        }
        e580 e580Var = this.a;
        e580Var.getClass();
        e580 e580VarC = e580Var.c();
        lb5Var.a = e580VarC;
        e580VarC.g = e580VarC;
        e580VarC.f = e580VarC;
        for (e580 e580Var2 = e580Var.f; e580Var2 != e580Var; e580Var2 = e580Var2.f) {
            e580 e580Var3 = e580VarC.g;
            e580Var3.getClass();
            e580Var2.getClass();
            e580Var3.b(e580Var2.c());
        }
        lb5Var.b = this.b;
        return lb5Var;
    }

    public final void g0(int i) {
        e580 e580VarB0 = b0(4);
        byte[] bArr = e580VarB0.a;
        int i2 = e580VarB0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        e580VarB0.c = i2 + 4;
        this.b += 4;
    }

    public final void h0(long j) {
        e580 e580VarB0 = b0(8);
        byte[] bArr = e580VarB0.a;
        int i = e580VarB0.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        e580VarB0.c = i + 8;
        this.b += 8;
    }

    public final int hashCode() {
        e580 e580Var = this.a;
        if (e580Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = e580Var.c;
            for (int i3 = e580Var.b; i3 < i2; i3++) {
                i = (i * 31) + e580Var.a[i3];
            }
            e580Var = e580Var.f;
            e580Var.getClass();
        } while (e580Var != this.a);
        return i;
    }

    @Override // defpackage.cc5
    public final String i0() {
        return M(Long.MAX_VALUE);
    }

    @Override // defpackage.cc5
    public final String i1(Charset charset) {
        charset.getClass();
        return V(this.b, charset);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 j1(long j) {
        f0(j);
        return this;
    }

    public final void l(long j, lb5 lb5Var, long j2) {
        lb5Var.getClass();
        long j3 = j;
        l.b(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        lb5Var.b += j2;
        e580 e580Var = this.a;
        while (true) {
            e580Var.getClass();
            long j4 = e580Var.c - e580Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            e580Var = e580Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            e580Var.getClass();
            e580 e580VarC = e580Var.c();
            int i = e580VarC.b + ((int) j3);
            e580VarC.b = i;
            e580VarC.c = Math.min(i + ((int) j5), e580VarC.c);
            e580 e580Var2 = lb5Var.a;
            if (e580Var2 == null) {
                e580VarC.g = e580VarC;
                e580VarC.f = e580VarC;
                lb5Var.a = e580VarC;
            } else {
                e580 e580Var3 = e580Var2.g;
                e580Var3.getClass();
                e580Var3.b(e580VarC);
            }
            j5 -= (long) (e580VarC.c - e580VarC.b);
            e580Var = e580Var.f;
            j3 = 0;
        }
    }

    public final void l0(int i) {
        e580 e580VarB0 = b0(2);
        byte[] bArr = e580VarB0.a;
        int i2 = e580VarB0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        e580VarB0.c = i2 + 2;
        this.b += 2;
    }

    @Override // defpackage.cc5
    public final rl5 l1() {
        return B0(this.b);
    }

    public final byte m(long j) {
        l.b(this.b, j, 1L);
        e580 e580Var = this.a;
        e580Var.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                e580Var = e580Var.g;
                e580Var.getClass();
                j2 -= (long) (e580Var.c - e580Var.b);
            }
            return e580Var.a[(int) ((((long) e580Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = e580Var.c;
            int i2 = e580Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return e580Var.a[(int) ((((long) i2) + j) - j3)];
            }
            e580Var = e580Var.f;
            e580Var.getClass();
            j3 = j4;
        }
    }

    @Override // defpackage.cc5
    public final long m0(rl5 rl5Var) {
        rl5Var.getClass();
        return K(Long.MAX_VALUE, rl5Var);
    }

    public final void n0(String str, int i, int i2, Charset charset) {
        if (i < 0) {
            kb5.a(hce0.a(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            kb5.a(whs.b(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            gb5.a(str.length(), efe0.a(i2, "endIndex > string.length: ", " > "));
        } else {
            if (charset.equals(Charsets.UTF_8)) {
                u0(i, i2, str);
                return;
            }
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            bytes.getClass();
            m104write(bytes, 0, bytes.length);
        }
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 n1(int i, int i2, String str) {
        u0(i, i2, str);
        return this;
    }

    public final long o(byte b2, long j, long j2) {
        e580 e580Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            g41.a(j3, " fromIndex=", " toIndex=", sb);
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (e580Var = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                e580Var = e580Var.g;
                e580Var.getClass();
                j6 -= (long) (e580Var.c - e580Var.b);
            }
            while (j6 < j4) {
                byte[] bArr = e580Var.a;
                long j8 = j7;
                int iMin = (int) Math.min(e580Var.c, (((long) e580Var.b) + j4) - j6);
                for (int i = (int) ((((long) e580Var.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b2) {
                        return ((long) (i - e580Var.b)) + j6;
                    }
                }
                j6 += (long) (e580Var.c - e580Var.b);
                e580Var = e580Var.f;
                e580Var.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (e580Var.c - e580Var.b)) + j5;
            if (j9 > j3) {
                break;
            }
            e580Var = e580Var.f;
            e580Var.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = e580Var.a;
            int iMin2 = (int) Math.min(e580Var.c, (((long) e580Var.b) + j4) - j5);
            for (int i2 = (int) ((((long) e580Var.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b2) {
                    return ((long) (i2 - e580Var.b)) + j5;
                }
            }
            j5 += (long) (e580Var.c - e580Var.b);
            e580Var = e580Var.f;
            e580Var.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 o0(rl5 rl5Var) {
        c0(rl5Var);
        return this;
    }

    @Override // defpackage.cc5
    public final y740 peek() {
        return new y740(new bb00(this));
    }

    @Override // defpackage.cc5
    public final void q0(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        l.b(bArr.length, i, i2);
        e580 e580Var = this.a;
        if (e580Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, e580Var.c - e580Var.b);
        byte[] bArr2 = e580Var.a;
        int i3 = e580Var.b;
        xx0.f(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = e580Var.b + iMin;
        e580Var.b = i4;
        this.b -= (long) iMin;
        if (i4 == e580Var.c) {
            this.a = e580Var.a();
            h580.a(e580Var);
        }
        return iMin;
    }

    @Override // defpackage.cc5
    public final byte readByte() throws EOFException {
        if (this.b == 0) {
            throw new EOFException();
        }
        e580 e580Var = this.a;
        e580Var.getClass();
        int i = e580Var.b;
        int i2 = e580Var.c;
        int i3 = i + 1;
        byte b2 = e580Var.a[i];
        this.b--;
        if (i3 != i2) {
            e580Var.b = i3;
            return b2;
        }
        this.a = e580Var.a();
        h580.a(e580Var);
        return b2;
    }

    @Override // defpackage.cc5
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // defpackage.cc5
    public final int readInt() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        e580 e580Var = this.a;
        e580Var.getClass();
        int i = e580Var.b;
        int i2 = e580Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = e580Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            e580Var.b = i5;
            return i6;
        }
        this.a = e580Var.a();
        h580.a(e580Var);
        return i6;
    }

    @Override // defpackage.cc5
    public final long readLong() throws EOFException {
        if (this.b < 8) {
            throw new EOFException();
        }
        e580 e580Var = this.a;
        e580Var.getClass();
        int i = e580Var.b;
        int i2 = e580Var.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = e580Var.a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.b -= 8;
        if (i4 != i2) {
            e580Var.b = i4;
            return j2;
        }
        this.a = e580Var.a();
        h580.a(e580Var);
        return j2;
    }

    @Override // defpackage.cc5
    public final short readShort() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        e580 e580Var = this.a;
        e580Var.getClass();
        int i = e580Var.b;
        int i2 = e580Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = e580Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = e580Var.a();
            h580.a(e580Var);
        } else {
            e580Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.cc5
    public final boolean request(long j) {
        return this.b >= j;
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 s0(long j) {
        e0(j);
        return this;
    }

    @Override // defpackage.cc5
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            e580 e580Var = this.a;
            if (e580Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, e580Var.c - e580Var.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = e580Var.b + iMin;
            e580Var.b = i;
            if (i == e580Var.c) {
                this.a = e580Var.a();
                h580.a(e580Var);
            }
        }
    }

    @Override // defpackage.zpa0
    public final sxf0 timeout() {
        return sxf0.NONE;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return a0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final long u(long j, rl5 rl5Var) {
        rl5Var.getClass();
        long j2 = 0;
        if (j < 0) {
            kb5.a(avg.a(j, "fromIndex < 0: "));
            return 0L;
        }
        e580 e580Var = this.a;
        if (e580Var == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                e580Var = e580Var.g;
                e580Var.getClass();
                j3 -= (long) (e580Var.c - e580Var.b);
            }
            if (rl5Var.d() == 2) {
                byte bJ = rl5Var.j(0);
                byte bJ2 = rl5Var.j(1);
                while (j3 < this.b) {
                    byte[] bArr = e580Var.a;
                    int i = e580Var.c;
                    for (int i2 = (int) ((((long) e580Var.b) + j) - j3); i2 < i; i2++) {
                        byte b2 = bArr[i2];
                        if (b2 == bJ || b2 == bJ2) {
                            return ((long) (i2 - e580Var.b)) + j3;
                        }
                    }
                    j3 += (long) (e580Var.c - e580Var.b);
                    e580Var = e580Var.f;
                    e580Var.getClass();
                    j = j3;
                }
            } else {
                byte[] bArrI = rl5Var.i();
                while (j3 < this.b) {
                    byte[] bArr2 = e580Var.a;
                    int i3 = e580Var.c;
                    for (int i4 = (int) ((((long) e580Var.b) + j) - j3); i4 < i3; i4++) {
                        byte b3 = bArr2[i4];
                        for (byte b4 : bArrI) {
                            if (b3 == b4) {
                                return ((long) (i4 - e580Var.b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (e580Var.c - e580Var.b);
                    e580Var = e580Var.f;
                    e580Var.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (e580Var.c - e580Var.b)) + j2;
            if (j4 > j) {
                break;
            }
            e580Var = e580Var.f;
            e580Var.getClass();
            j2 = j4;
        }
        if (rl5Var.d() == 2) {
            byte bJ3 = rl5Var.j(0);
            byte bJ4 = rl5Var.j(1);
            while (j2 < this.b) {
                byte[] bArr3 = e580Var.a;
                int i5 = e580Var.c;
                for (int i6 = (int) ((((long) e580Var.b) + j) - j2); i6 < i5; i6++) {
                    byte b5 = bArr3[i6];
                    if (b5 == bJ3 || b5 == bJ4) {
                        return ((long) (i6 - e580Var.b)) + j2;
                    }
                }
                j2 += (long) (e580Var.c - e580Var.b);
                e580Var = e580Var.f;
                e580Var.getClass();
                j = j2;
            }
        } else {
            byte[] bArrI2 = rl5Var.i();
            while (j2 < this.b) {
                byte[] bArr4 = e580Var.a;
                int i7 = e580Var.c;
                for (int i8 = (int) ((((long) e580Var.b) + j) - j2); i8 < i7; i8++) {
                    byte b6 = bArr4[i8];
                    for (byte b7 : bArrI2) {
                        if (b6 == b7) {
                            return ((long) (i8 - e580Var.b)) + j2;
                        }
                    }
                }
                j2 += (long) (e580Var.c - e580Var.b);
                e580Var = e580Var.f;
                e580Var.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    public final void u0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            kb5.a(hce0.a(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            kb5.a(whs.b(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            gb5.a(str.length(), efe0.a(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                e580 e580VarB0 = b0(1);
                byte[] bArr = e580VarB0.a;
                int i3 = e580VarB0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = e580VarB0.c;
                int i6 = (i3 + i) - i5;
                e580VarB0.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    e580 e580VarB1 = b0(2);
                    byte[] bArr2 = e580VarB1.a;
                    int i7 = e580VarB1.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    e580VarB1.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    e580 e580VarB2 = b0(3);
                    byte[] bArr3 = e580VarB2.a;
                    int i8 = e580VarB2.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    e580VarB2.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        d0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        e580 e580VarB3 = b0(4);
                        byte[] bArr4 = e580VarB3.a;
                        int i11 = e580VarB3.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        e580VarB3.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // defpackage.cc5
    public final void v0(lb5 lb5Var, long j) throws EOFException {
        lb5Var.getClass();
        long j2 = this.b;
        if (j2 >= j) {
            lb5Var.write(this, j);
        } else {
            lb5Var.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // defpackage.uw90
    public final void write(lb5 lb5Var, long j) {
        e580 e580VarB;
        lb5Var.getClass();
        if (lb5Var == this) {
            hb5.a("source == this");
            return;
        }
        l.b(lb5Var.b, 0L, j);
        while (j > 0) {
            e580 e580Var = lb5Var.a;
            e580Var.getClass();
            int i = e580Var.c;
            e580 e580Var2 = lb5Var.a;
            e580Var2.getClass();
            long j2 = i - e580Var2.b;
            int i2 = 0;
            if (j < j2) {
                e580 e580Var3 = this.a;
                e580 e580Var4 = e580Var3 != null ? e580Var3.g : null;
                if (e580Var4 != null && e580Var4.e) {
                    if ((((long) e580Var4.c) + j) - ((long) (e580Var4.d ? 0 : e580Var4.b)) <= 8192) {
                        e580 e580Var5 = lb5Var.a;
                        e580Var5.getClass();
                        e580Var5.d(e580Var4, (int) j);
                        lb5Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                e580 e580Var6 = lb5Var.a;
                e580Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > e580Var6.c - e580Var6.b) {
                    hb5.a("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    e580VarB = e580Var6.c();
                } else {
                    e580VarB = h580.b();
                    byte[] bArr = e580Var6.a;
                    byte[] bArr2 = e580VarB.a;
                    int i4 = e580Var6.b;
                    xx0.f(bArr, 0, bArr2, i4, i4 + i3);
                }
                e580VarB.c = e580VarB.b + i3;
                e580Var6.b += i3;
                e580 e580Var7 = e580Var6.g;
                e580Var7.getClass();
                e580Var7.b(e580VarB);
                lb5Var.a = e580VarB;
            }
            e580 e580Var8 = lb5Var.a;
            e580Var8.getClass();
            long j3 = e580Var8.c - e580Var8.b;
            lb5Var.a = e580Var8.a();
            e580 e580Var9 = this.a;
            if (e580Var9 == null) {
                this.a = e580Var8;
                e580Var8.g = e580Var8;
                e580Var8.f = e580Var8;
            } else {
                e580 e580Var10 = e580Var9.g;
                e580Var10.getClass();
                e580Var10.b(e580Var8);
                e580 e580Var11 = e580Var8.g;
                if (e580Var11 == e580Var8) {
                    ib5.a("cannot compact");
                    return;
                }
                e580Var11.getClass();
                if (e580Var11.e) {
                    int i5 = e580Var8.c - e580Var8.b;
                    e580 e580Var12 = e580Var8.g;
                    e580Var12.getClass();
                    int i6 = 8192 - e580Var12.c;
                    e580 e580Var13 = e580Var8.g;
                    e580Var13.getClass();
                    if (!e580Var13.d) {
                        e580 e580Var14 = e580Var8.g;
                        e580Var14.getClass();
                        i2 = e580Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        e580 e580Var15 = e580Var8.g;
                        e580Var15.getClass();
                        e580Var8.d(e580Var15, i5);
                        e580Var8.a();
                        h580.a(e580Var8);
                    }
                }
            }
            lb5Var.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 writeByte(int i) {
        d0(i);
        return this;
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 writeInt(int i) {
        g0(i);
        return this;
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 writeShort(int i) {
        l0(i);
        return this;
    }

    @Override // defpackage.cc5
    public final boolean y(long j, rl5 rl5Var) {
        rl5Var.getClass();
        return F(rl5Var.d(), rl5Var, j);
    }

    public final void z0(String str) {
        str.getClass();
        u0(0, str.length(), str);
    }

    public static final class b extends OutputStream {
        public b() {
        }

        public final String toString() {
            return lb5.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            bArr.getClass();
            lb5.this.m104write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            lb5.this.d0(i);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }
    }

    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(lb5.this.b, 2147483647L);
        }

        @Override // java.io.InputStream
        public final int read() {
            lb5 lb5Var = lb5.this;
            if (lb5Var.b > 0) {
                return lb5Var.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return lb5.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            return lb5.this.read(bArr, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.uw90
    public final void close() {
    }

    @Override // defpackage.cc5, defpackage.bc5
    public final lb5 e() {
        return this;
    }

    @Override // defpackage.bc5, defpackage.uw90, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        e580 e580Var = this.a;
        if (e580Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), e580Var.c - e580Var.b);
        byteBuffer.put(e580Var.a, e580Var.b, iMin);
        int i = e580Var.b + iMin;
        e580Var.b = i;
        this.b -= (long) iMin;
        if (i == e580Var.c) {
            this.a = e580Var.a();
            h580.a(e580Var);
        }
        return iMin;
    }

    @Override // defpackage.zpa0
    public final long read(lb5 lb5Var, long j) {
        lb5Var.getClass();
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            lb5Var.write(this, j);
            return j;
        }
        kb5.a(avg.a(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 write(byte[] bArr, int i, int i2) {
        m104write(bArr, i, i2);
        return this;
    }

    @Override // defpackage.bc5
    public final /* bridge */ /* synthetic */ bc5 write(byte[] bArr) {
        m103write(bArr);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            e580 e580VarB0 = b0(1);
            int iMin = Math.min(i, 8192 - e580VarB0.c);
            byteBuffer.get(e580VarB0.a, e580VarB0.c, iMin);
            i -= iMin;
            e580VarB0.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m103write(byte[] bArr) {
        bArr.getClass();
        m104write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m104write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        l.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            e580 e580VarB0 = b0(1);
            int iMin = Math.min(i3 - i, 8192 - e580VarB0.c);
            int i4 = i + iMin;
            xx0.f(bArr, e580VarB0.c, e580VarB0.a, i, i4);
            e580VarB0.c += iMin;
            i = i4;
        }
        this.b += j;
    }
}
