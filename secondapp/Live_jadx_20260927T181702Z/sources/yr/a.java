package yr;

import dr.a3;
import dr.l1;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "2.2")
@a3(markerClass = {f.class})
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f159807g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f159808h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f159809i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f159810j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte f159811k = 61;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f159812l = 76;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f159813m = 64;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l
    public static final a f159815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l
    public static final a f159816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @l
    public static final a f159817q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f159820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public final b f159821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f159822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    public static final C1557a f159806f = new C1557a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l
    public static final byte[] f159814n = {13, 10};

    /* JADX INFO: renamed from: yr.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1557a extends a {
        public /* synthetic */ C1557a(x xVar) {
            this();
        }

        @l
        public final a M() {
            return a.f159816p;
        }

        @l
        public final byte[] N() {
            return a.f159814n;
        }

        @l
        public final a O() {
            return a.f159817q;
        }

        @l
        public final a P() {
            return a.f159815o;
        }

        public C1557a() {
            super(false, false, -1, b.PRESENT, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @l1(version = "2.0")
    public enum b {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ sr.a f159828g = sr.c.c(d());

        @l
        public static sr.a<b> g() {
            return f159828g;
        }
    }

    static {
        b bVar = b.PRESENT;
        f159815o = new a(true, false, -1, bVar);
        f159816p = new a(false, true, 76, bVar);
        f159817q = new a(false, true, 64, bVar);
    }

    public /* synthetic */ a(boolean z10, boolean z11, int i10, b bVar, x xVar) {
        this(z10, z11, i10, bVar);
    }

    public static /* synthetic */ Appendable A(a aVar, byte[] bArr, Appendable appendable, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        return aVar.z(bArr, appendable, i10, i11);
    }

    public static /* synthetic */ byte[] C(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return aVar.B(bArr, i10, i11);
    }

    public static /* synthetic */ byte[] l(a aVar, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return aVar.j(charSequence, i10, i11);
    }

    public static /* synthetic */ byte[] m(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return aVar.k(bArr, i10, i11);
    }

    public static /* synthetic */ int q(a aVar, CharSequence charSequence, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = charSequence.length();
        }
        return aVar.o(charSequence, bArr, i10, i11, i12);
    }

    public static /* synthetic */ int r(a aVar, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = bArr.length;
        }
        return aVar.p(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ String u(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return aVar.t(bArr, i10, i11);
    }

    public static /* synthetic */ int w(a aVar, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = bArr.length;
        }
        return aVar.v(bArr, bArr2, i10, i11, i12);
    }

    @l
    public final byte[] B(@l byte[] source, int i10, int i11) {
        m0.p(source, "source");
        return D(source, i10, i11);
    }

    @l
    public final byte[] D(@l byte[] source, int i10, int i11) {
        m0.p(source, "source");
        i(source.length, i10, i11);
        byte[] bArr = new byte[y(i11 - i10)];
        x(source, bArr, 0, i10, i11);
        return bArr;
    }

    public final int E() {
        return this.f159820c;
    }

    @l
    public final b F() {
        return this.f159821d;
    }

    public final int G(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i10);
        }
        if (i12 == -6) {
            h(i10);
            return i10 + 1;
        }
        if (i12 != -4) {
            if (i12 == -2) {
                return i10 + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        h(i10);
        int iK = K(bArr, i10 + 1, i11);
        if (iK != i11 && bArr[iK] == 61) {
            return iK + 1;
        }
        throw new IllegalArgumentException("Missing one pad character at index " + iK);
    }

    public final boolean H() {
        return this.f159819b;
    }

    public final boolean I() {
        return this.f159818a;
    }

    public final boolean J() {
        b bVar = this.f159821d;
        return bVar == b.PRESENT || bVar == b.PRESENT_OPTIONAL;
    }

    public final int K(byte[] bArr, int i10, int i11) {
        if (!this.f159819b) {
            return i10;
        }
        while (i10 < i11) {
            if (c.f159830b[bArr[i10] & 255] != -1) {
                break;
            }
            i10++;
        }
        return i10;
    }

    @l
    @l1(version = "2.0")
    public final a L(@l b option) {
        m0.p(option, "option");
        return this.f159821d == option ? this : new a(this.f159818a, this.f159819b, this.f159820c, option);
    }

    @l
    public final String e(@l byte[] source) {
        m0.p(source, "source");
        StringBuilder sb2 = new StringBuilder(source.length);
        for (byte b10 : source) {
            sb2.append((char) b10);
        }
        return sb2.toString();
    }

    @l
    public final byte[] f(@l CharSequence source, int i10, int i11) {
        m0.p(source, "source");
        i(source.length(), i10, i11);
        byte[] bArr = new byte[i11 - i10];
        int i12 = 0;
        while (i10 < i11) {
            char cCharAt = source.charAt(i10);
            if (cCharAt <= 255) {
                bArr[i12] = (byte) cCharAt;
                i12++;
            } else {
                bArr[i12] = 63;
                i12++;
            }
            i10++;
        }
        return bArr;
    }

    public final void g(int i10, int i11, int i12) {
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException("destination offset: " + i11 + ", destination size: " + i10);
        }
        int i13 = i11 + i12;
        if (i13 < 0 || i13 > i10) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i11 + ", destination size: " + i10 + ", capacity needed: " + i12);
        }
    }

    public final void h(int i10) {
        if (this.f159821d != b.ABSENT) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i10);
    }

    public final void i(int i10, int i11, int i12) {
        fr.d.Companion.a(i11, i12, i10);
    }

    @l
    public final byte[] j(@l CharSequence source, int i10, int i11) {
        byte[] bArrF;
        m0.p(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            i(str.length(), i10, i11);
            String strSubstring = str.substring(i10, i11);
            m0.o(strSubstring, "substring(...)");
            Charset charset = cv.g.f77207g;
            m0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrF = strSubstring.getBytes(charset);
            m0.o(bArrF, "getBytes(...)");
        } else {
            bArrF = f(source, i10, i11);
        }
        return m(this, bArrF, 0, 0, 6, null);
    }

    @l
    public final byte[] k(@l byte[] source, int i10, int i11) {
        m0.p(source, "source");
        i(source.length, i10, i11);
        int iS = s(source, i10, i11);
        byte[] bArr = new byte[iS];
        if (n(source, bArr, 0, i10, i11) == iS) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int n(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int[] iArr = this.f159818a ? c.f159832d : c.f159830b;
        int i16 = -8;
        int i17 = i10;
        int iG = i11;
        int i18 = -8;
        int i19 = 0;
        while (true) {
            if (iG >= i12) {
                i13 = 8;
                i14 = 0;
                break;
            }
            if (i18 != i16 || iG + 3 >= i12) {
                i13 = 8;
                i15 = 1;
            } else {
                i13 = 8;
                i15 = 1;
                int i20 = iG + 4;
                int i21 = (iArr[bArr[iG + 1] & 255] << 12) | (iArr[bArr[iG] & 255] << 18) | (iArr[bArr[iG + 2] & 255] << 6) | iArr[bArr[iG + 3] & 255];
                if (i21 >= 0) {
                    bArr2[i17] = (byte) (i21 >> 16);
                    int i22 = i17 + 2;
                    bArr2[i17 + 1] = (byte) (i21 >> 8);
                    i17 += 3;
                    bArr2[i22] = (byte) i21;
                    iG = i20;
                }
                i16 = -8;
            }
            int i23 = bArr[iG] & 255;
            int i24 = iArr[i23];
            if (i24 >= 0) {
                iG++;
                i19 = (i19 << 6) | i24;
                int i25 = i18 + 6;
                if (i25 >= 0) {
                    bArr2[i17] = (byte) (i19 >>> i25);
                    i19 &= (i15 << i25) - 1;
                    i18 -= 2;
                    i17++;
                } else {
                    i18 = i25;
                }
            } else {
                if (i24 == -2) {
                    iG = G(bArr, iG, i12, i18);
                    i14 = i15;
                    break;
                }
                if (!this.f159819b) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid symbol '");
                    sb2.append((char) i23);
                    sb2.append("'(");
                    String string = Integer.toString(i23, cv.e.a(i13));
                    m0.o(string, "toString(...)");
                    sb2.append(string);
                    sb2.append(") at index ");
                    sb2.append(iG);
                    throw new IllegalArgumentException(sb2.toString());
                }
                iG++;
            }
            i16 = -8;
        }
        if (i18 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i18 != -8 && i14 == 0 && this.f159821d == b.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i19 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int iK = K(bArr, iG, i12);
        if (iK >= i12) {
            return i17 - i10;
        }
        int i26 = bArr[iK] & 255;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Symbol '");
        sb3.append((char) i26);
        sb3.append("'(");
        String string2 = Integer.toString(i26, cv.e.a(i13));
        m0.o(string2, "toString(...)");
        sb3.append(string2);
        sb3.append(") at index ");
        sb3.append(iK - 1);
        sb3.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb3.toString());
    }

    public final int o(@l CharSequence source, @l byte[] destination, int i10, int i11, int i12) {
        byte[] bArrF;
        m0.p(source, "source");
        m0.p(destination, "destination");
        if (source instanceof String) {
            String str = (String) source;
            i(str.length(), i11, i12);
            String strSubstring = str.substring(i11, i12);
            m0.o(strSubstring, "substring(...)");
            Charset charset = cv.g.f77207g;
            m0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrF = strSubstring.getBytes(charset);
            m0.o(bArrF, "getBytes(...)");
        } else {
            bArrF = f(source, i11, i12);
        }
        return r(this, bArrF, destination, i10, 0, 0, 24, null);
    }

    public final int p(@l byte[] source, @l byte[] destination, int i10, int i11, int i12) {
        m0.p(source, "source");
        m0.p(destination, "destination");
        i(source.length, i11, i12);
        g(destination.length, i10, s(source, i11, i12));
        return n(source, destination, i10, i11, i12);
    }

    public final int s(@l byte[] source, int i10, int i11) {
        m0.p(source, "source");
        int i12 = i11 - i10;
        if (i12 == 0) {
            return 0;
        }
        if (i12 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i10 + ", endIndex: " + i11);
        }
        if (this.f159819b) {
            while (i10 < i11) {
                int i13 = c.f159830b[source[i10] & 255];
                if (i13 < 0) {
                    if (i13 == -2) {
                        i12 -= i11 - i10;
                        break;
                    }
                    i12--;
                }
                i10++;
            }
        } else if (source[i11 - 1] == 61) {
            i12 = source[i11 + (-2)] == 61 ? i12 - 2 : i12 - 1;
        }
        return (int) ((((long) i12) * ((long) 6)) / ((long) 8));
    }

    @l
    public final String t(@l byte[] source, int i10, int i11) {
        m0.p(source, "source");
        return new String(D(source, i10, i11), cv.g.f77207g);
    }

    public final int v(@l byte[] source, @l byte[] destination, int i10, int i11, int i12) {
        m0.p(source, "source");
        m0.p(destination, "destination");
        return x(source, destination, i10, i11, i12);
    }

    public final int x(@l byte[] source, @l byte[] destination, int i10, int i11, int i12) {
        int i13 = i11;
        m0.p(source, "source");
        m0.p(destination, "destination");
        i(source.length, i13, i12);
        g(destination.length, i10, y(i12 - i13));
        byte[] bArr = this.f159818a ? c.f159831c : c.f159829a;
        int i14 = this.f159819b ? this.f159822e : Integer.MAX_VALUE;
        int i15 = i10;
        while (i13 + 2 < i12) {
            int iMin = Math.min((i12 - i13) / 3, i14);
            for (int i16 = 0; i16 < iMin; i16++) {
                int i17 = source[i13] & 255;
                int i18 = i13 + 2;
                int i19 = source[i13 + 1] & 255;
                i13 += 3;
                int i20 = (i19 << 8) | (i17 << 16) | (source[i18] & 255);
                destination[i15] = bArr[i20 >>> 18];
                destination[i15 + 1] = bArr[(i20 >>> 12) & 63];
                int i21 = i15 + 3;
                destination[i15 + 2] = bArr[(i20 >>> 6) & 63];
                i15 += 4;
                destination[i21] = bArr[i20 & 63];
            }
            if (iMin == i14 && i13 != i12) {
                int i22 = i15 + 1;
                byte[] bArr2 = f159814n;
                destination[i15] = bArr2[0];
                i15 += 2;
                destination[i22] = bArr2[1];
            }
        }
        int i23 = i12 - i13;
        if (i23 == 1) {
            int i24 = i13 + 1;
            int i25 = (source[i13] & 255) << 4;
            destination[i15] = bArr[i25 >>> 6];
            int i26 = i15 + 2;
            destination[i15 + 1] = bArr[i25 & 63];
            if (J()) {
                int i27 = i15 + 3;
                destination[i26] = f159811k;
                i15 += 4;
                destination[i27] = f159811k;
                i13 = i24;
            } else {
                i13 = i24;
                i15 = i26;
            }
        } else if (i23 == 2) {
            int i28 = i13 + 1;
            int i29 = source[i13] & 255;
            i13 += 2;
            int i30 = ((source[i28] & 255) << 2) | (i29 << 10);
            destination[i15] = bArr[i30 >>> 12];
            destination[i15 + 1] = bArr[(i30 >>> 6) & 63];
            int i31 = i15 + 3;
            destination[i15 + 2] = bArr[i30 & 63];
            if (J()) {
                i15 += 4;
                destination[i31] = f159811k;
            } else {
                i15 = i31;
            }
        }
        if (i13 == i12) {
            return i15 - i10;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int y(int i10) {
        int i11 = i10 / 3;
        int i12 = i10 % 3;
        int i13 = i11 * 4;
        if (i12 != 0) {
            i13 += J() ? 4 : i12 + 1;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.f159819b) {
            i13 += ((i13 - 1) / this.f159820c) * 2;
        }
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @l
    public final <A extends Appendable> A z(@l byte[] source, @l A destination, int i10, int i11) throws IOException {
        m0.p(source, "source");
        m0.p(destination, "destination");
        destination.append(new String(D(source, i10, i11), cv.g.f77207g));
        return destination;
    }

    public a(boolean z10, boolean z11, int i10, b bVar) {
        this.f159818a = z10;
        this.f159819b = z11;
        this.f159820c = i10;
        this.f159821d = bVar;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f159822e = i10 / 4;
    }
}
