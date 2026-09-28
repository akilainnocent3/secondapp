package defpackage;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class u430 {
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<t430.a> a(nsz nszVar) {
        char c;
        ArrayList<t430.a> arrayList;
        boolean z;
        int i;
        Object aVar;
        nsz nszVar2 = nszVar;
        ArrayList<t430.a> arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (nszVar2.w() == 0) {
            char c2 = 7;
            nszVar2.J(7);
            int iJ = nszVar2.j();
            boolean z2 = true;
            if (iJ == 1684433976) {
                nsz nszVar3 = new nsz();
                Inflater inflater = new Inflater(true);
                try {
                    if (!jrh0.I(nszVar2, nszVar3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    nszVar2 = nszVar3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iJ == 1918990112) {
            }
            ArrayList<t430.a> arrayList3 = new ArrayList<>();
            int i2 = nszVar2.b;
            int i3 = nszVar2.c;
            while (i2 < i3) {
                int iJ2 = nszVar2.j() + i2;
                if (iJ2 > i2 && iJ2 <= i3) {
                    if (nszVar2.j() == 1835365224) {
                        int iJ3 = nszVar2.j();
                        if (iJ3 > 10000) {
                            c = c2;
                            ArrayList<t430.a> arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z = z2;
                            i = i3;
                            aVar = arrayList4;
                        } else {
                            float[] fArr = new float[iJ3];
                            for (int i4 = 0; i4 < iJ3; i4++) {
                                fArr[i4] = Float.intBitsToFloat(nszVar2.j());
                            }
                            int iJ4 = nszVar2.j();
                            if (iJ4 > 32000) {
                                c = c2;
                                ArrayList<t430.a> arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z = z2;
                                i = i3;
                                aVar = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c = c2;
                                ArrayList<t430.a> arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iJ3) * 2.0d) / dLog);
                                z = z2;
                                byte[] bArr = nszVar2.a;
                                msz mszVar = new msz(bArr.length, bArr);
                                mszVar.m(nszVar2.b * 8);
                                float[] fArr2 = new float[iJ4 * 5];
                                int i5 = 5;
                                int[] iArr = new int[5];
                                ArrayList<t430.a> arrayList7 = arrayList6;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < iJ4) {
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 < i5) {
                                                int i9 = iArr[i8];
                                                int iG = mszVar.g(iCeil);
                                                int i10 = ((iG >> 1) ^ (-(iG & 1))) + i9;
                                                if (i10 < iJ3 && i10 >= 0) {
                                                    fArr2[i7] = fArr[i10];
                                                    iArr[i8] = i10;
                                                    i8++;
                                                    i7++;
                                                    i5 = 5;
                                                }
                                            } else {
                                                i6++;
                                                i5 = 5;
                                            }
                                        }
                                    } else {
                                        mszVar.m((mszVar.e() + 7) & (-8));
                                        int i11 = 32;
                                        int iG2 = mszVar.g(32);
                                        t430.b[] bVarArr = new t430.b[iG2];
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < iG2) {
                                                int iG3 = mszVar.g(8);
                                                int iG4 = mszVar.g(8);
                                                int iG5 = mszVar.g(i11);
                                                if (iG5 <= 128000) {
                                                    int i13 = iG2;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iJ4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[iG5 * 3];
                                                    float[] fArr5 = new float[iG5 * 2];
                                                    i = i3;
                                                    int i14 = 0;
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i14 < iG5) {
                                                            int iG6 = mszVar.g(iCeil2);
                                                            msz mszVar2 = mszVar;
                                                            int i16 = ((iG6 >> 1) ^ (-(iG6 & 1))) + i15;
                                                            if (i16 >= 0 && i16 < iJ4) {
                                                                int i17 = i14 * 3;
                                                                int i18 = i16 * 5;
                                                                fArr4[i17] = fArr3[i18];
                                                                fArr4[i17 + 1] = fArr3[i18 + 1];
                                                                fArr4[i17 + 2] = fArr3[i18 + 2];
                                                                int i19 = i14 * 2;
                                                                fArr5[i19] = fArr3[i18 + 3];
                                                                fArr5[i19 + 1] = fArr3[i18 + 4];
                                                                i14++;
                                                                i15 = i16;
                                                                mszVar = mszVar2;
                                                            }
                                                        } else {
                                                            bVarArr[i12] = new t430.b(iG3, iG4, fArr4, fArr5);
                                                            i12++;
                                                            iG2 = i13;
                                                            fArr2 = fArr3;
                                                            i3 = i;
                                                            mszVar = mszVar;
                                                            i11 = 32;
                                                        }
                                                    }
                                                }
                                                aVar = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i = i3;
                                                aVar = new t430.a(bVarArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i = i3;
                                    aVar = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (aVar == null) {
                            return arrayList;
                        }
                        arrayList3.add(aVar);
                    } else {
                        c = c2;
                        arrayList = arrayList2;
                        z = z2;
                        i = i3;
                    }
                    nszVar2.I(iJ2);
                    i2 = iJ2;
                    c2 = c;
                    z2 = z;
                    arrayList2 = arrayList;
                    i3 = i;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }
}
