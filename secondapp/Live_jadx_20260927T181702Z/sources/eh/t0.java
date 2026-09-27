package eh;

import androidx.annotation.Nullable;
import cj.k7;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f81191d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f81192e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k7<Charset> f81193f = k7.G(zi.f.f161718a, zi.f.f161720c, zi.f.f161723f, zi.f.f161721d, zi.f.f161722e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f81194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81196c;

    public t0() {
        this.f81194a = o1.f81147f;
    }

    public long A() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f81195b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f81195b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f81195b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int B() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f81195b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f81195b = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public int C() {
        int iW = w();
        if (iW >= 0) {
            return iW;
        }
        throw new IllegalStateException("Top bit not zero: " + iW);
    }

    public int D() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = bArr[i10] & 255;
        this.f81195b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long E() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f81195b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f81195b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f81195b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f81195b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f81195b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f81195b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f81195b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    @Nullable
    public String F() {
        return p((char) 0);
    }

    public String G(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f81195b;
        int i12 = (i11 + i10) - 1;
        String strO = o1.O(this.f81194a, i11, (i12 >= this.f81196c || this.f81194a[i12] != 0) ? i10 : i10 - 1);
        this.f81195b += i10;
        return strO;
    }

    public short H() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f81195b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String I(int i10) {
        return J(i10, zi.f.f161720c);
    }

    public String J(int i10, Charset charset) {
        String str = new String(this.f81194a, this.f81195b, i10, charset);
        this.f81195b += i10;
        return str;
    }

    public int K() {
        return (L() << 21) | (L() << 14) | (L() << 7) | L();
    }

    public int L() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        this.f81195b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int M() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f81195b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f81195b = i10 + 4;
        return i13;
    }

    public long N() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f81195b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f81195b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f81195b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int O() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f81195b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f81195b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int P() {
        int iS = s();
        if (iS >= 0) {
            return iS;
        }
        throw new IllegalStateException("Top bit not zero: " + iS);
    }

    public long Q() {
        long jE = E();
        if (jE >= 0) {
            return jE;
        }
        throw new IllegalStateException("Top bit not zero: " + jE);
    }

    public int R() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f81195b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long S() {
        int i10;
        int i11;
        long j10 = this.f81194a[this.f81195b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f81194a[this.f81195b + i10];
            if ((b10 & l3.a.f103436o7) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f81195b += i11;
        return j10;
    }

    @Nullable
    public Charset T() {
        if (a() >= 3) {
            byte[] bArr = this.f81194a;
            int i10 = this.f81195b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f81195b = i10 + 3;
                return zi.f.f161720c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f81194a;
        int i11 = this.f81195b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f81195b = i11 + 2;
            return zi.f.f161721d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f81195b = i11 + 2;
        return zi.f.f161722e;
    }

    public void U(int i10) {
        W(b() < i10 ? new byte[i10] : this.f81194a, i10);
    }

    public void V(byte[] bArr) {
        W(bArr, bArr.length);
    }

    public void W(byte[] bArr, int i10) {
        this.f81194a = bArr;
        this.f81196c = i10;
        this.f81195b = 0;
    }

    public void X(int i10) {
        a.a(i10 >= 0 && i10 <= this.f81194a.length);
        this.f81196c = i10;
    }

    public void Y(int i10) {
        a.a(i10 >= 0 && i10 <= this.f81196c);
        this.f81195b = i10;
    }

    public void Z(int i10) {
        Y(this.f81195b + i10);
    }

    public int a() {
        return this.f81196c - this.f81195b;
    }

    public final void a0(Charset charset) {
        if (o(charset, f81191d) == '\r') {
            o(charset, f81192e);
        }
    }

    public int b() {
        return this.f81194a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f81194a = Arrays.copyOf(this.f81194a, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    public final int d(Charset charset) {
        int i10;
        byte[] bArr;
        if (charset.equals(zi.f.f161720c) || charset.equals(zi.f.f161718a)) {
            i10 = 1;
        } else {
            if (!charset.equals(zi.f.f161723f) && !charset.equals(zi.f.f161722e) && !charset.equals(zi.f.f161721d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f81195b;
        while (true) {
            int i12 = this.f81196c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((!charset.equals(zi.f.f161720c) && !charset.equals(zi.f.f161718a)) || !o1.V0(this.f81194a[i11])) {
                if (charset.equals(zi.f.f161723f) || charset.equals(zi.f.f161721d)) {
                    byte[] bArr2 = this.f81194a;
                    if (bArr2[i11] != 0 || !o1.V0(bArr2[i11 + 1])) {
                        if (charset.equals(zi.f.f161722e)) {
                            bArr = this.f81194a;
                            if (bArr[i11 + 1] != 0 || !o1.V0(bArr[i11])) {
                            }
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(zi.f.f161722e)) {
                        bArr = this.f81194a;
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

    public byte[] e() {
        return this.f81194a;
    }

    public int f() {
        return this.f81195b;
    }

    public int g() {
        return this.f81196c;
    }

    public char h() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public char i(Charset charset) {
        a.b(f81193f.contains(charset), "Unsupported charset: " + charset);
        return (char) (j(charset) >> 16);
    }

    public final int j(Charset charset) {
        byte bE;
        char cL;
        int i10 = 1;
        if ((charset.equals(zi.f.f161720c) || charset.equals(zi.f.f161718a)) && a() >= 1) {
            bE = (byte) lj.c.e(lj.u.p(this.f81194a[this.f81195b]));
        } else {
            if ((charset.equals(zi.f.f161723f) || charset.equals(zi.f.f161721d)) && a() >= 2) {
                byte[] bArr = this.f81194a;
                int i11 = this.f81195b;
                cL = lj.c.l(bArr[i11], bArr[i11 + 1]);
            } else {
                if (!charset.equals(zi.f.f161722e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f81194a;
                int i12 = this.f81195b;
                cL = lj.c.l(bArr2[i12 + 1], bArr2[i12]);
            }
            bE = (byte) cL;
            i10 = 2;
        }
        return (lj.c.e(bE) << 16) + i10;
    }

    public int k() {
        return this.f81194a[this.f81195b] & 255;
    }

    public void l(s0 s0Var, int i10) {
        n(s0Var.f81187a, 0, i10);
        s0Var.q(0);
    }

    public void m(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.f81194a, this.f81195b, i10);
        this.f81195b += i10;
    }

    public void n(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f81194a, this.f81195b, bArr, i10, i11);
        this.f81195b += i11;
    }

    public final char o(Charset charset, char[] cArr) {
        int iJ = j(charset);
        if (iJ == 0) {
            return (char) 0;
        }
        char c10 = (char) (iJ >> 16);
        if (!lj.c.i(cArr, c10)) {
            return (char) 0;
        }
        this.f81195b += iJ & 65535;
        return c10;
    }

    @Nullable
    public String p(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f81195b;
        while (i10 < this.f81196c && this.f81194a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f81194a;
        int i11 = this.f81195b;
        String strO = o1.O(bArr, i11, i10 - i11);
        this.f81195b = i10;
        if (i10 < this.f81196c) {
            this.f81195b = i10 + 1;
        }
        return strO;
    }

    public double q() {
        return Double.longBitsToDouble(E());
    }

    public float r() {
        return Float.intBitsToFloat(s());
    }

    public int s() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f81195b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f81195b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f81195b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int t() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.f81195b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f81195b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    @Nullable
    public String u() {
        return v(zi.f.f161720c);
    }

    @Nullable
    public String v(Charset charset) {
        a.b(f81193f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(zi.f.f161718a)) {
            T();
        }
        String strJ = J(d(charset) - this.f81195b, charset);
        if (this.f81195b == this.f81196c) {
            return strJ;
        }
        a0(charset);
        return strJ;
    }

    public int w() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f81195b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f81195b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f81195b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public int x() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f81195b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f81195b = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public long y() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f81195b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f81195b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f81195b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f81195b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f81195b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f81195b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f81195b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public short z() {
        byte[] bArr = this.f81194a;
        int i10 = this.f81195b;
        int i11 = i10 + 1;
        this.f81195b = i11;
        int i12 = bArr[i10] & 255;
        this.f81195b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public t0(int i10) {
        this.f81194a = new byte[i10];
        this.f81196c = i10;
    }

    public t0(byte[] bArr) {
        this.f81194a = bArr;
        this.f81196c = bArr.length;
    }

    public t0(byte[] bArr, int i10) {
        this.f81194a = bArr;
        this.f81196c = i10;
    }
}
