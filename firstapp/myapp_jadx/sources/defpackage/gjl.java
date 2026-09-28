package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gjl {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final qbx.k o;

    public gjl(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, qbx.k kVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = kVar;
    }

    public static gjl a(nsz nszVar, boolean z, qbx.k kVar) {
        boolean z2;
        qbx.g gVarG;
        int i = 4;
        try {
            if (z) {
                nszVar.J(4);
            } else {
                nszVar.J(21);
            }
            int iW = nszVar.w() & 3;
            int iW2 = nszVar.w();
            int i2 = nszVar.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iW2) {
                    break;
                }
                nszVar.J(1);
                int iC = nszVar.C();
                for (int i6 = 0; i6 < iC; i6++) {
                    int iC2 = nszVar.C();
                    i5 += iC2 + 4;
                    nszVar.J(iC2);
                }
                i4++;
            }
            nszVar.I(i2);
            byte[] bArr = new byte[i5];
            qbx.k kVar2 = kVar;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iW2) {
                int iW3 = nszVar.w() & 63;
                int iC3 = nszVar.C();
                int i19 = i3;
                qbx.k kVarI = kVar2;
                while (i19 < iC3) {
                    boolean z3 = z2;
                    int iC4 = nszVar.C();
                    int i20 = iW;
                    System.arraycopy(qbx.a, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(nszVar.a, nszVar.b, bArr, i21, iC4);
                    if (iW3 == 32 && i19 == 0) {
                        kVarI = qbx.i(bArr, i21, i21 + iC4);
                    } else {
                        if (iW3 == 33 && i19 == 0) {
                            qbx.h hVarH = qbx.h(bArr, i21, i21 + iC4, kVarI);
                            i7 = hVarH.a + 1;
                            i8 = hVarH.g;
                            int i22 = hVarH.h;
                            i10 = hVarH.c + 8;
                            i11 = hVarH.d + 8;
                            int i23 = hVarH.k;
                            i9 = i22;
                            int i24 = hVarH.l;
                            int i25 = hVarH.m;
                            float f2 = hVarH.i;
                            int i26 = hVarH.j;
                            qbx.c cVar = hVarH.b;
                            if (cVar != null) {
                                strA = j08.a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iW3 == 39 && i19 == 0 && (gVarG = qbx.g(bArr, i21, i21 + iC4)) != null && kVarI != null) {
                            i3 = 0;
                            i15 = gVarG.a == kVarI.a.get(0).b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iC4;
                    nszVar.J(iC4);
                    i19++;
                    z2 = z3;
                    iW = i20;
                    i = 4;
                }
                i17++;
                kVar2 = kVarI;
                i = 4;
            }
            return new gjl(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iW + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strA, kVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ssz.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
