package defpackage;

import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class p6n extends y3l {
    public static final o6n e = new o6n();
    public final a d;

    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int i, int i2, boolean z) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public p6n(a aVar) {
        this.d = aVar;
    }

    public static a98 A(int i, nsz nszVar) {
        if (i < 4) {
            return null;
        }
        int iW = nszVar.w();
        Charset charsetM = M(iW);
        byte[] bArr = new byte[3];
        nszVar.h(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        nszVar.h(bArr2, 0, i2);
        int iO = O(bArr2, 0, iW);
        String str2 = new String(bArr2, 0, iO, charsetM);
        int iL = L(iW) + iO;
        return new a98(str, str2, F(bArr2, iL, O(bArr2, iL, iW), charsetM));
    }

    public static c2k C(int i, nsz nszVar) {
        int iW = nszVar.w();
        Charset charsetM = M(iW);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nszVar.h(bArr, 0, i2);
        int iP = P(0, bArr);
        String strM = gqv.m(new String(bArr, 0, iP, StandardCharsets.ISO_8859_1));
        int i3 = iP + 1;
        int iO = O(bArr, i3, iW);
        String strF = F(bArr, i3, iO, charsetM);
        int iL = L(iW) + iO;
        int iO2 = O(bArr, iL, iW);
        String strF2 = F(bArr, iL, iO2, charsetM);
        int iL2 = L(iW) + iO2;
        return new c2k(strM, strF, strF2, i2 <= iL2 ? jrh0.b : Arrays.copyOfRange(bArr, iL2, i2));
    }

    public static kxv D(int i, nsz nszVar) {
        int iC = nszVar.C();
        int iZ = nszVar.z();
        int iZ2 = nszVar.z();
        int iW = nszVar.w();
        int iW2 = nszVar.w();
        msz mszVar = new msz();
        mszVar.l(nszVar);
        int i2 = ((i - 10) * 8) / (iW + iW2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG = mszVar.g(iW);
            int iG2 = mszVar.g(iW2);
            iArr[i3] = iG;
            iArr2[i3] = iG2;
        }
        return new kxv(iC, iZ, iZ2, iArr, iArr2);
    }

    public static rw20 E(int i, nsz nszVar) {
        byte[] bArr = new byte[i];
        nszVar.h(bArr, 0, i);
        int iP = P(0, bArr);
        String str = new String(bArr, 0, iP, StandardCharsets.ISO_8859_1);
        int i2 = iP + 1;
        return new rw20(str, i <= i2 ? jrh0.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String F(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static qjf0 G(int i, nsz nszVar, String str) {
        if (i < 1) {
            return null;
        }
        int iW = nszVar.w();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nszVar.h(bArr, 0, i2);
        return new qjf0(str, null, H(bArr, iW, 0));
    }

    public static c150 H(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return pcn.n("");
        }
        pcn.b bVar = pcn.b;
        pcn.a aVar = new pcn.a();
        int iO = O(bArr, i2, i);
        while (i2 < iO) {
            aVar.c(new String(bArr, i2, iO - i2, M(i)));
            i2 = L(i) + iO;
            iO = O(bArr, i2, i);
        }
        c150 c150VarG = aVar.g();
        return c150VarG.isEmpty() ? pcn.n("") : c150VarG;
    }

    public static qjf0 I(int i, nsz nszVar) {
        if (i < 1) {
            return null;
        }
        int iW = nszVar.w();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nszVar.h(bArr, 0, i2);
        int iO = O(bArr, 0, iW);
        return new qjf0("TXXX", new String(bArr, 0, iO, M(iW)), H(bArr, iW, L(iW) + iO));
    }

    public static dnh0 J(int i, nsz nszVar, String str) {
        byte[] bArr = new byte[i];
        nszVar.h(bArr, 0, i);
        return new dnh0(str, null, new String(bArr, 0, P(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static dnh0 K(int i, nsz nszVar) {
        if (i < 1) {
            return null;
        }
        int iW = nszVar.w();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nszVar.h(bArr, 0, i2);
        int iO = O(bArr, 0, iW);
        String str = new String(bArr, 0, iO, M(iW));
        int iL = L(iW) + iO;
        return new dnh0("WXXX", str, F(bArr, iL, P(iL, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int L(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset M(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String N(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int O(byte[] bArr, int i, int i2) {
        int iP = P(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iP;
        }
        while (iP < bArr.length - 1) {
            if ((iP - i) % 2 == 0 && bArr[iP + 1] == 0) {
                return iP;
            }
            iP = P(iP + 1, bArr);
        }
        return bArr.length;
    }

    public static int P(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int Q(int i, nsz nszVar) {
        byte[] bArr = nszVar.a;
        int i2 = nszVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean R(nsz nszVar, int i, int i2, boolean z) {
        int iZ;
        long jZ;
        int iC;
        int i3;
        int i4 = nszVar.b;
        while (true) {
            try {
                boolean z2 = true;
                if (nszVar.a() < i2) {
                    nszVar.I(i4);
                    return true;
                }
                if (i >= 3) {
                    iZ = nszVar.j();
                    jZ = nszVar.y();
                    iC = nszVar.C();
                } else {
                    iZ = nszVar.z();
                    jZ = nszVar.z();
                    iC = 0;
                }
                if (iZ == 0 && jZ == 0 && iC == 0) {
                    nszVar.I(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jZ) != 0) {
                        nszVar.I(i4);
                        return false;
                    }
                    jZ = (((jZ >> 24) & 255) << 21) | (jZ & 255) | (((jZ >> 8) & 255) << 7) | (((jZ >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iC & 64) != 0 ? 1 : 0;
                    if ((iC & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iC & 32) != 0 ? 1 : 0;
                    if ((iC & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jZ < i3) {
                    nszVar.I(i4);
                    return false;
                }
                if (nszVar.a() < jZ) {
                    nszVar.I(i4);
                    return false;
                }
                nszVar.J((int) jZ);
            } catch (Throwable th) {
                nszVar.I(i4);
                throw th;
            }
        }
    }

    public static ep0 x(nsz nszVar, int i, int i2) {
        int iP;
        String strConcat;
        int iW = nszVar.w();
        Charset charsetM = M(iW);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        nszVar.h(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + fy0.b(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iP = 2;
        } else {
            iP = P(0, bArr);
            String strB = fy0.b(new String(bArr, 0, iP, StandardCharsets.ISO_8859_1));
            strConcat = strB.indexOf(47) == -1 ? "image/".concat(strB) : strB;
        }
        int i4 = bArr[iP + 1] & 255;
        int i5 = iP + 2;
        int iO = O(bArr, i5, iW);
        String str = new String(bArr, i5, iO - i5, charsetM);
        int iL = L(iW) + iO;
        return new ep0(i4, strConcat, str, i3 <= iL ? jrh0.b : Arrays.copyOfRange(bArr, iL, i3));
    }

    public static r77 y(nsz nszVar, int i, int i2, boolean z, int i3, a aVar) throws Throwable {
        int i4 = nszVar.b;
        int iP = P(i4, nszVar.a);
        String str = new String(nszVar.a, i4, iP - i4, StandardCharsets.ISO_8859_1);
        nszVar.I(iP + 1);
        int iJ = nszVar.j();
        int iJ2 = nszVar.j();
        long jY = nszVar.y();
        if (jY == 4294967295L) {
            jY = -1;
        }
        long jY2 = nszVar.y();
        long j = jY2 == 4294967295L ? -1L : jY2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (nszVar.b < i5) {
            q6n q6nVarB = B(i2, nszVar, z, i3, aVar);
            if (q6nVarB != null) {
                arrayList.add(q6nVarB);
            }
        }
        return new r77(str, iJ, iJ2, jY, j, (q6n[]) arrayList.toArray(new q6n[0]));
    }

    public static s77 z(nsz nszVar, int i, int i2, boolean z, int i3, a aVar) throws Throwable {
        int i4 = nszVar.b;
        int iP = P(i4, nszVar.a);
        String str = new String(nszVar.a, i4, iP - i4, StandardCharsets.ISO_8859_1);
        nszVar.I(iP + 1);
        int iW = nszVar.w();
        boolean z2 = (iW & 2) != 0;
        boolean z3 = (iW & 1) != 0;
        int iW2 = nszVar.w();
        String[] strArr = new String[iW2];
        for (int i5 = 0; i5 < iW2; i5++) {
            int i6 = nszVar.b;
            int iP2 = P(i6, nszVar.a);
            strArr[i5] = new String(nszVar.a, i6, iP2 - i6, StandardCharsets.ISO_8859_1);
            nszVar.I(iP2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (nszVar.b < i7) {
            q6n q6nVarB = B(i2, nszVar, z, i3, aVar);
            if (q6nVarB != null) {
                arrayList.add(q6nVarB);
            }
        }
        return new s77(str, z2, z3, strArr, (q6n[]) arrayList.toArray(new q6n[0]));
    }

    @Override // defpackage.y3l
    public final uov d(apv apvVar, ByteBuffer byteBuffer) {
        return w(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final uov w(int i, byte[] bArr) throws Throwable {
        boolean z;
        b bVar;
        int i2;
        int i3;
        int iQ;
        q6n q6nVarB;
        ArrayList arrayList = new ArrayList();
        nsz nszVar = new nsz(i, bArr);
        boolean z2 = false;
        if (nszVar.a() < 10) {
            cft.g("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZ = nszVar.z();
            if (iZ == 4801587) {
                int iW = nszVar.w();
                nszVar.J(1);
                int iW2 = nszVar.w();
                int iV = nszVar.v();
                if (iW != 2) {
                    if (iW == 3) {
                        if ((iW2 & 64) != 0) {
                            int iJ = nszVar.j();
                            nszVar.J(iJ);
                            iV -= iJ + 4;
                        }
                    } else if (iW == 4) {
                        if ((iW2 & 64) != 0) {
                            int iV2 = nszVar.v();
                            nszVar.J(iV2 - 4);
                            iV -= iV2;
                        }
                        if ((iW2 & 16) != 0) {
                            iV -= 10;
                        }
                    } else {
                        h08.a(iW, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iW < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    bVar = new b(iW, iV, z);
                } else if ((iW2 & 64) != 0) {
                    cft.g("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iW < 4 || (iW2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bVar = new b(iW, iV, z);
                }
                if (bVar == null) {
                    return null;
                }
                i2 = bVar.a;
                int i4 = nszVar.b;
                i3 = i2 == 2 ? 6 : 10;
                iQ = bVar.c;
                if (bVar.b) {
                    iQ = Q(iQ, nszVar);
                }
                nszVar.H(i4 + iQ);
                if (!R(nszVar, i2, i3, false)) {
                    if (i2 == 4 || !R(nszVar, 4, i3, true)) {
                        h08.a(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (nszVar.a() >= i3) {
                    q6nVarB = B(i2, nszVar, z2, i3, this.d);
                    if (q6nVarB != null) {
                        arrayList.add(q6nVarB);
                    }
                }
                return new uov(arrayList);
            }
            cft.g("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iZ))));
        }
        bVar = null;
        if (bVar == null) {
            return null;
        }
        i2 = bVar.a;
        int i5 = nszVar.b;
        if (i2 == 2) {
        }
        iQ = bVar.c;
        if (bVar.b) {
            iQ = Q(iQ, nszVar);
        }
        nszVar.H(i5 + iQ);
        if (!R(nszVar, i2, i3, false)) {
            if (i2 == 4) {
            }
            h08.a(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (nszVar.a() >= i3) {
            q6nVarB = B(i2, nszVar, z2, i3, this.d);
            if (q6nVarB != null) {
                arrayList.add(q6nVarB);
            }
        }
        return new uov(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0251, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [q6n] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [nsz] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [nsz] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [nsz] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static q6n B(int i, nsz nszVar, boolean z, int i2, a aVar) throws Throwable {
        int iA;
        int i3;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r9;
        int i4;
        int i5;
        ?? r2;
        Throwable th;
        ?? r3;
        ?? r12;
        ?? r10;
        ?? r11;
        nsz nszVar2;
        Object z54Var;
        int i6 = i;
        int iW = nszVar.w();
        int iW2 = nszVar.w();
        int iW3 = nszVar.w();
        int iW4 = i6 >= 3 ? nszVar.w() : 0;
        if (i6 == 4) {
            iA = nszVar.A();
            if (!z) {
                iA = (((iA >> 24) & 255) << 21) | (iA & 255) | (((iA >> 8) & 255) << 7) | (((iA >> 16) & 255) << 14);
            }
        } else {
            iA = i6 == 3 ? nszVar.A() : nszVar.z();
        }
        int iQ = iA;
        int iC = i6 >= 3 ? nszVar.C() : 0;
        if (iW == 0 && iW2 == 0 && iW3 == 0 && iW4 == 0 && iQ == 0 && iC == 0) {
            nszVar.I(nszVar.c);
            return null;
        }
        int i7 = nszVar.b + iQ;
        if (i7 > nszVar.c) {
            cft.g("Id3Decoder", "Frame size exceeds remaining tag data");
            nszVar.I(nszVar.c);
            return null;
        }
        if (aVar != null) {
            boolean zA = aVar.a(i6, iW, iW2, iW3, iW4);
            r1 = iW;
            i3 = iW2;
            if (!zA) {
                i6 = i6;
                nszVar.I(i7);
                return null;
            }
        } else {
            i3 = iW2;
            r1 = iW;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (iC & 128) != 0;
            z5 = (iC & 64) != 0;
            z6 = false;
            z4 = (iC & 32) != 0;
            z3 = z2;
        } else if (i6 == 4) {
            boolean z7 = (iC & 64) != 0;
            boolean z8 = (iC & 8) != 0;
            z5 = (iC & 4) != 0;
            z6 = (iC & 2) != 0;
            z3 = (iC & 1) != 0;
            boolean z9 = z8;
            z4 = z7;
            z2 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            cft.g("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            nszVar.I(i7);
            return null;
        }
        if (z4) {
            iQ--;
            nszVar.J(1);
        }
        if (z3) {
            iQ -= 4;
            nszVar.J(4);
        }
        if (z6) {
            iQ = Q(iQ, nszVar);
        }
        try {
            try {
                if (r1 == 84 && i3 == 88 && iW3 == 88 && (i6 == 2 || iW4 == 88)) {
                    z54Var = I(iQ, nszVar);
                } else if (r1 == 84) {
                    z54Var = G(iQ, nszVar, N(i6, r1, i3, iW3, iW4));
                } else if (r1 == 87 && i3 == 88 && iW3 == 88 && (i6 == 2 || iW4 == 88)) {
                    z54Var = K(iQ, nszVar);
                } else {
                    if (r1 != 87) {
                        if (r1 == 80 && i3 == 82 && iW3 == 73 && iW4 == 86) {
                            z54Var = E(iQ, nszVar);
                        } else {
                            th = null;
                            try {
                                if (r1 != 71 || i3 != 69 || iW3 != 79 || (iW4 != 66 && i6 != 2)) {
                                    if (i6 == 2) {
                                        if (r1 == 80 && i3 == 73 && iW3 == 67) {
                                            z54Var = x(nszVar, iQ, i6);
                                        } else if (r1 != 67 && i3 == 79 && iW3 == 77 && (iW4 == 77 || i6 == 2)) {
                                            z54Var = A(iQ, nszVar);
                                        } else if (r1 != 67 && i3 == 72 && iW3 == 65 && iW4 == 80) {
                                            int i8 = iQ;
                                            iQ = i3;
                                            i3 = i8;
                                            r11 = r1;
                                            i4 = iW3;
                                            i5 = iW4;
                                            try {
                                                z54Var = y(nszVar, i3, i6, z, i2, aVar);
                                                i6 = i;
                                                r1 = nszVar;
                                            } catch (Exception e2) {
                                                e = e2;
                                                i6 = i;
                                                r2 = nszVar;
                                                r9 = r11;
                                                r2.I(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e3) {
                                                e = e3;
                                                i6 = i;
                                                r2 = nszVar;
                                                r9 = r11;
                                                r2.I(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = nszVar;
                                                r3.I(i7);
                                                throw th;
                                            }
                                        } else {
                                            int i9 = iQ;
                                            iQ = i3;
                                            i3 = i9;
                                            r11 = r1;
                                            i4 = iW3;
                                            i5 = iW4;
                                            try {
                                                if (r11 != 67 && iQ == 84 && i4 == 79 && i5 == 67) {
                                                    i6 = i;
                                                    nsz nszVar3 = nszVar;
                                                    z54Var = z(nszVar3, i3, i6, z, i2, aVar);
                                                    r1 = nszVar3;
                                                } else {
                                                    i6 = i;
                                                    nszVar2 = nszVar;
                                                    if (r11 != 77 && iQ == 76 && i4 == 76 && i5 == 84) {
                                                        z54Var = D(i3, nszVar2);
                                                        r1 = nszVar2;
                                                    } else {
                                                        String strN = N(i6, r11 == true ? 1 : 0, iQ, i4, i5);
                                                        byte[] bArr = new byte[i3];
                                                        nszVar2.h(bArr, 0, i3);
                                                        z54Var = new z54(strN, bArr);
                                                        r1 = nszVar2;
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.I(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e5) {
                                                e = e5;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.I(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r3 = r1;
                                                r3.I(i7);
                                                throw th;
                                            }
                                        }
                                    } else if (r1 == 65 && i3 == 80 && iW3 == 73 && iW4 == 67) {
                                        z54Var = x(nszVar, iQ, i6);
                                    } else {
                                        if (r1 != 67) {
                                        }
                                        if (r1 != 67) {
                                            int i10 = iQ;
                                            iQ = i3;
                                            i3 = i10;
                                            r11 = r1;
                                            i4 = iW3;
                                            i5 = iW4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                nszVar2 = nszVar;
                                                if (r11 != 77) {
                                                    String strN2 = N(i6, r11 == true ? 1 : 0, iQ, i4, i5);
                                                    byte[] bArr2 = new byte[i3];
                                                    nszVar2.h(bArr2, 0, i3);
                                                    z54Var = new z54(strN2, bArr2);
                                                    r1 = nszVar2;
                                                } else {
                                                    String strN3 = N(i6, r11 == true ? 1 : 0, iQ, i4, i5);
                                                    byte[] bArr3 = new byte[i3];
                                                    nszVar2.h(bArr3, 0, i3);
                                                    z54Var = new z54(strN3, bArr3);
                                                    r1 = nszVar2;
                                                }
                                            } else {
                                                i6 = i;
                                                nszVar2 = nszVar;
                                                if (r11 != 77) {
                                                    String strN4 = N(i6, r11 == true ? 1 : 0, iQ, i4, i5);
                                                    byte[] bArr4 = new byte[i3];
                                                    nszVar2.h(bArr4, 0, i3);
                                                    z54Var = new z54(strN4, bArr4);
                                                    r1 = nszVar2;
                                                } else {
                                                    String strN5 = N(i6, r11 == true ? 1 : 0, iQ, i4, i5);
                                                    byte[] bArr5 = new byte[i3];
                                                    nszVar2.h(bArr5, 0, i3);
                                                    z54Var = new z54(strN5, bArr5);
                                                    r1 = nszVar2;
                                                }
                                            }
                                        } else {
                                            int i11 = iQ;
                                            iQ = i3;
                                            i3 = i11;
                                            r11 = r1;
                                            i4 = iW3;
                                            i5 = iW4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                nszVar2 = nszVar;
                                                if (r11 != 77) {
                                                    String strN6 = N(i6, r11 == true ? 1 : 0, iQ, i4, i5);
                                                    byte[] bArr6 = new byte[i3];
                                                    nszVar2.h(bArr6, 0, i3);
                                                    z54Var = new z54(strN6, bArr6);
                                                    r1 = nszVar2;
                                                } else {
                                                    String strN7 = N(i6, r11 == true ? 1 : 0, iQ, i4, i5);
                                                    byte[] bArr7 = new byte[i3];
                                                    nszVar2.h(bArr7, 0, i3);
                                                    z54Var = new z54(strN7, bArr7);
                                                    r1 = nszVar2;
                                                }
                                            } else {
                                                i6 = i;
                                                nszVar2 = nszVar;
                                                if (r11 != 77) {
                                                    String strN8 = N(i6, r11 == true ? 1 : 0, iQ, i4, i5);
                                                    byte[] bArr8 = new byte[i3];
                                                    nszVar2.h(bArr8, 0, i3);
                                                    z54Var = new z54(strN8, bArr8);
                                                    r1 = nszVar2;
                                                } else {
                                                    String strN9 = N(i6, r11 == true ? 1 : 0, iQ, i4, i5);
                                                    byte[] bArr9 = new byte[i3];
                                                    nszVar2.h(bArr9, 0, i3);
                                                    z54Var = new z54(strN9, bArr9);
                                                    r1 = nszVar2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        cft.h("Id3Decoder", "Failed to decode frame: id=" + N(i6, r10, iQ, i4, i5) + QQWMbKFOuTf.pjwILEWCH + i3, e);
                                    }
                                    return r12;
                                }
                                z54Var = C(iQ, nszVar);
                                int i12 = iQ;
                                iQ = i3;
                                i3 = i12;
                                r11 = r1;
                                i4 = iW3;
                                i5 = iW4;
                                r1 = nszVar;
                            } catch (Exception e6) {
                                e = e6;
                                int i13 = iQ;
                                iQ = i3;
                                i3 = i13;
                                r9 = r1;
                                i4 = iW3;
                                i5 = iW4;
                                r2 = nszVar;
                                r2.I(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    cft.h("Id3Decoder", "Failed to decode frame: id=" + N(i6, r10, iQ, i4, i5) + QQWMbKFOuTf.pjwILEWCH + i3, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e7) {
                                e = e7;
                                int i14 = iQ;
                                iQ = i3;
                                i3 = i14;
                                r9 = r1;
                                i4 = iW3;
                                i5 = iW4;
                                r2 = nszVar;
                                r2.I(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    cft.h("Id3Decoder", "Failed to decode frame: id=" + N(i6, r10, iQ, i4, i5) + QQWMbKFOuTf.pjwILEWCH + i3, e);
                                }
                                return r12;
                            }
                        }
                        r1.I(i7);
                        r12 = z54Var;
                        e = th;
                        r10 = r11;
                        if (r12 == 0) {
                            cft.h("Id3Decoder", "Failed to decode frame: id=" + N(i6, r10, iQ, i4, i5) + QQWMbKFOuTf.pjwILEWCH + i3, e);
                        }
                        return r12;
                    }
                    z54Var = J(iQ, nszVar, N(i6, r1, i3, iW3, iW4));
                }
                int i15 = iQ;
                iQ = i3;
                i3 = i15;
                r11 = r1;
                i4 = iW3;
                i5 = iW4;
                r1 = nszVar;
                th = null;
                r1.I(i7);
                r12 = z54Var;
                e = th;
                r10 = r11;
            } catch (Throwable th4) {
                th = th4;
                r3 = nszVar;
            }
        } catch (Exception e8) {
            e = e8;
            int i16 = iQ;
            iQ = i3;
            i3 = i16;
            r9 = r1;
            i4 = iW3;
            i5 = iW4;
            r2 = nszVar;
            th = null;
            r2.I(i7);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                cft.h("Id3Decoder", "Failed to decode frame: id=" + N(i6, r10, iQ, i4, i5) + QQWMbKFOuTf.pjwILEWCH + i3, e);
            }
            return r12;
        } catch (OutOfMemoryError e9) {
            e = e9;
            int i17 = iQ;
            iQ = i3;
            i3 = i17;
            r9 = r1;
            i4 = iW3;
            i5 = iW4;
            r2 = nszVar;
            th = null;
            r2.I(i7);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                cft.h("Id3Decoder", "Failed to decode frame: id=" + N(i6, r10, iQ, i4, i5) + QQWMbKFOuTf.pjwILEWCH + i3, e);
            }
            return r12;
        }
        if (r12 == 0) {
            cft.h("Id3Decoder", "Failed to decode frame: id=" + N(i6, r10, iQ, i4, i5) + QQWMbKFOuTf.pjwILEWCH + i3, e);
        }
        return r12;
    }
}
