package x4;

import androidx.annotation.Nullable;
import cj.k7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@qj.b
@m1
public final class v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f144464d = 1114112;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f144465e = {'\r', '\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f144466f = {'\n'};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k7<Charset> f144467g = k7.G(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f144468h = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f144469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f144470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144471c;

    public v0() {
        this.f144469a = b2.f144214f;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return lj.l.l((byte) 0, lj.u.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), lj.u.a(((((byte) i11) & zi.c.f161639q) << 4) | ((b10 & 60) >> 2)), lj.u.a(((b10 & 3) << 6) | (((byte) i13) & 63)));
    }

    public static int h(Charset charset) {
        zi.l0.u(f144467g.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean i(byte b10) {
        return (b10 & l3.a.f103436o7) == 128;
    }

    @k.h1
    public static void k0(boolean z10) {
        f144468h.set(z10);
    }

    public float A() {
        return Float.intBitsToFloat(B());
    }

    public int B() {
        k(4);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f144470b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f144470b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f144470b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int C() {
        k(3);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.f144470b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f144470b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    @Nullable
    public String D() {
        return E(StandardCharsets.UTF_8);
    }

    @Nullable
    public String E(Charset charset) {
        zi.l0.u(f144467g.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            e0();
        }
        String strS = S(e(charset) - this.f144470b, charset);
        if (this.f144470b == this.f144471c) {
            return strS;
        }
        n0(charset);
        return strS;
    }

    public int F() {
        k(4);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f144470b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f144470b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f144470b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public int G() {
        k(3);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f144470b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f144470b = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public long H() {
        k(8);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f144470b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f144470b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f144470b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f144470b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f144470b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f144470b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f144470b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public short I() {
        k(2);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = bArr[i10] & 255;
        this.f144470b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long J() {
        k(4);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f144470b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f144470b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f144470b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int K() {
        k(3);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f144470b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f144470b = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public int L() {
        int iF = F();
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException("Top bit not zero: " + iF);
    }

    public int M() {
        k(2);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = bArr[i10] & 255;
        this.f144470b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long N() {
        k(8);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f144470b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f144470b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f144470b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f144470b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f144470b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f144470b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f144470b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    @Nullable
    public String O() {
        return y((char) 0);
    }

    public String P(int i10) {
        k(i10);
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f144470b;
        int i12 = (i11 + i10) - 1;
        String strX = b2.X(this.f144469a, i11, (i12 >= this.f144471c || this.f144469a[i12] != 0) ? i10 : i10 - 1);
        this.f144470b += i10;
        return strX;
    }

    public short Q() {
        k(2);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f144470b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String R(int i10) {
        return S(i10, StandardCharsets.UTF_8);
    }

    public String S(int i10, Charset charset) {
        k(i10);
        String str = new String(this.f144469a, this.f144470b, i10, charset);
        this.f144470b += i10;
        return str;
    }

    public int T() {
        return (U() << 21) | (U() << 14) | (U() << 7) | U();
    }

    public int U() {
        k(1);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        this.f144470b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int V() {
        k(4);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f144470b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f144470b = i10 + 4;
        return i13;
    }

    public long W() {
        k(4);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f144470b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f144470b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f144470b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int X() {
        k(3);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f144470b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f144470b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int Y() {
        int iB = B();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException("Top bit not zero: " + iB);
    }

    public int Z() {
        return lj.l.e(a0());
    }

    public int a() {
        return Math.max(this.f144471c - this.f144470b, 0);
    }

    public long a0() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f144470b == this.f144471c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jU = U();
            j10 |= (127 & jU) << (i10 * 7);
            if ((jU & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public int b() {
        return this.f144469a.length;
    }

    public long b0() {
        long jN = N();
        if (jN >= 0) {
            return jN;
        }
        throw new IllegalStateException("Top bit not zero: " + jN);
    }

    public int c0() {
        k(2);
        byte[] bArr = this.f144469a;
        int i10 = this.f144470b;
        int i11 = i10 + 1;
        this.f144470b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f144470b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public void d(int i10) {
        if (i10 > b()) {
            this.f144469a = Arrays.copyOf(this.f144469a, i10);
        }
    }

    public long d0() {
        int i10;
        k(1);
        long j10 = this.f144469a[this.f144470b];
        int i11 = 7;
        while (true) {
            if (i11 >= 0) {
                int i12 = 1 << i11;
                if ((((long) i12) & j10) == 0) {
                    if (i11 < 6) {
                        j10 &= (long) (i12 - 1);
                        i10 = 7 - i11;
                        break;
                    }
                    if (i11 == 7) {
                        i10 = 1;
                        break;
                    }
                } else {
                    i11--;
                }
            }
            i10 = 0;
            break;
        }
        if (i10 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        k(i10);
        for (int i13 = 1; i13 < i10; i13++) {
            byte b10 = this.f144469a[this.f144470b + i13];
            if ((b10 & l3.a.f103436o7) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f144470b += i10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    public final int e(Charset charset) {
        int i10;
        byte[] bArr;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f144470b;
        while (true) {
            int i12 = this.f144471c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) || !b2.r1(this.f144469a[i11])) {
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr2 = this.f144469a;
                    if (bArr2[i11] != 0 || !b2.r1(bArr2[i11 + 1])) {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr = this.f144469a;
                            if (bArr[i11 + 1] != 0 || !b2.r1(bArr[i11])) {
                            }
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr = this.f144469a;
                        if (bArr[i11 + 1] != 0) {
                            continue;
                        }
                    }
                    i11 += i10;
                }
            }
            return i11;
        }
    }

    @Nullable
    public Charset e0() {
        if (a() >= 3) {
            byte[] bArr = this.f144469a;
            int i10 = this.f144470b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f144470b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f144469a;
        int i11 = this.f144470b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f144470b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f144470b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public byte[] f() {
        return this.f144469a;
    }

    public void f0(int i10) {
        h0(b() < i10 ? new byte[i10] : this.f144469a, i10);
    }

    public int g() {
        return this.f144470b;
    }

    public void g0(byte[] bArr) {
        h0(bArr, bArr.length);
    }

    public void h0(byte[] bArr, int i10) {
        this.f144469a = bArr;
        this.f144471c = i10;
        this.f144470b = 0;
    }

    public void i0(int i10) {
        zi.l0.d(i10 >= 0 && i10 <= this.f144469a.length);
        this.f144471c = i10;
    }

    public int j() {
        return this.f144471c;
    }

    public void j0(int i10) {
        zi.l0.d(i10 >= 0 && i10 <= this.f144471c);
        this.f144470b = i10;
    }

    public final void k(int i10) {
        if (!f144468h.get() || a() >= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("bytesNeeded= " + i10 + ", bytesLeft=" + a());
    }

    public char l() {
        return m(ByteOrder.BIG_ENDIAN, 0);
    }

    public void l0(int i10) {
        j0(this.f144470b + i10);
    }

    public final char m(ByteOrder byteOrder, int i10) {
        k(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f144469a;
            int i11 = this.f144470b;
            return lj.c.l(bArr[i11 + i10], bArr[i11 + i10 + 1]);
        }
        byte[] bArr2 = this.f144469a;
        int i12 = this.f144470b;
        return lj.c.l(bArr2[i12 + i10 + 1], bArr2[i12 + i10]);
    }

    public void m0() {
        while ((U() & 128) != 0) {
        }
    }

    @Deprecated
    public char n(Charset charset) {
        int iR;
        zi.l0.u(f144467g.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return (char) 0;
        }
        if (charset.equals(StandardCharsets.US_ASCII)) {
            iR = r();
        } else {
            if (!charset.equals(StandardCharsets.UTF_8)) {
                if (a() < 2) {
                    return (char) 0;
                }
                return m(charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN, 0);
            }
            if ((this.f144469a[this.f144470b] & 128) != 0) {
                return (char) 0;
            }
            iR = r();
        }
        return (char) iR;
    }

    public final void n0(Charset charset) {
        if (x(charset, f144465e) == '\r') {
            x(charset, f144466f);
        }
    }

    public int o(Charset charset) {
        int iP = p(charset);
        return iP != 0 ? lj.l.e(iP >>> 8) : f144464d;
    }

    public final int p(Charset charset) {
        int codePoint;
        int iP;
        zi.l0.u(f144467g.contains(charset), "Unsupported charset: %s", charset);
        if (a() < h(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f144470b + ", limit=" + this.f144471c);
        }
        byte b10 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b11 = this.f144469a[this.f144470b];
            if ((b11 & 128) != 0) {
                return 0;
            }
            codePoint = lj.u.p(b11);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte bT = t();
            if (bT == 1) {
                iP = lj.u.p(this.f144469a[this.f144470b]);
            } else if (bT == 2) {
                byte[] bArr = this.f144469a;
                int i10 = this.f144470b;
                iP = c(0, 0, bArr[i10], bArr[i10 + 1]);
            } else if (bT == 3) {
                byte[] bArr2 = this.f144469a;
                int i11 = this.f144470b;
                iP = c(0, bArr2[i11] & zi.c.f161639q, bArr2[i11 + 1], bArr2[i11 + 2]);
            } else {
                if (bT != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f144469a;
                int i12 = this.f144470b;
                iP = c(bArr3[i12], bArr3[i12 + 1], bArr3[i12 + 2], bArr3[i12 + 3]);
            }
            b10 = bT;
            codePoint = iP;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM = m(byteOrder, 0);
            if (!Character.isHighSurrogate(cM) || a() < 4) {
                codePoint = cM;
                b10 = 2;
            } else {
                codePoint = Character.toCodePoint(cM, m(byteOrder, 2));
                b10 = 4;
            }
        }
        return (codePoint << 8) | b10;
    }

    public int q() {
        if (a() >= 4) {
            int iB = B();
            this.f144470b -= 4;
            return iB;
        }
        throw new IndexOutOfBoundsException("position=" + this.f144470b + ", limit=" + this.f144471c);
    }

    public int r() {
        k(1);
        return this.f144469a[this.f144470b] & 255;
    }

    public int s() {
        if (a() >= 3) {
            int iX = X();
            this.f144470b -= 3;
            return iX;
        }
        throw new IndexOutOfBoundsException("position=" + this.f144470b + ", limit=" + this.f144471c);
    }

    public final byte t() {
        byte b10 = this.f144469a[this.f144470b];
        if ((b10 & 128) == 0) {
            return (byte) 1;
        }
        if ((b10 & 224) == 192 && a() >= 2 && i(this.f144469a[this.f144470b + 1])) {
            return (byte) 2;
        }
        if ((this.f144469a[this.f144470b] & 240) == 224 && a() >= 3 && i(this.f144469a[this.f144470b + 1]) && i(this.f144469a[this.f144470b + 2])) {
            return (byte) 3;
        }
        return ((this.f144469a[this.f144470b] & 248) == 240 && a() >= 4 && i(this.f144469a[this.f144470b + 1]) && i(this.f144469a[this.f144470b + 2]) && i(this.f144469a[this.f144470b + 3])) ? (byte) 4 : (byte) 0;
    }

    public void u(ByteBuffer byteBuffer, int i10) {
        k(i10);
        byteBuffer.put(this.f144469a, this.f144470b, i10);
        this.f144470b += i10;
    }

    public void v(u0 u0Var, int i10) {
        w(u0Var.f144456a, 0, i10);
        u0Var.q(0);
    }

    public void w(byte[] bArr, int i10, int i11) {
        k(i11);
        System.arraycopy(this.f144469a, this.f144470b, bArr, i10, i11);
        this.f144470b += i11;
    }

    public final char x(Charset charset, char[] cArr) {
        int iP;
        if (a() < h(charset) || (iP = p(charset)) == 0) {
            return (char) 0;
        }
        int iA = lj.w.a(iP >>> 8);
        if (Character.isSupplementaryCodePoint(iA)) {
            return (char) 0;
        }
        char cE = lj.c.e(iA);
        if (!lj.c.i(cArr, cE)) {
            return (char) 0;
        }
        this.f144470b += lj.l.e(iP & 255);
        return cE;
    }

    @Nullable
    public String y(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f144470b;
        while (i10 < this.f144471c && this.f144469a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f144469a;
        int i11 = this.f144470b;
        String strX = b2.X(bArr, i11, i10 - i11);
        this.f144470b = i10;
        if (i10 < this.f144471c) {
            this.f144470b = i10 + 1;
        }
        return strX;
    }

    public double z() {
        return Double.longBitsToDouble(N());
    }

    public v0(int i10) {
        this.f144469a = new byte[i10];
        this.f144471c = i10;
    }

    public v0(byte[] bArr) {
        this.f144469a = bArr;
        this.f144471c = bArr.length;
    }

    public v0(byte[] bArr, int i10) {
        this.f144469a = bArr;
        this.f144471c = i10;
    }
}
