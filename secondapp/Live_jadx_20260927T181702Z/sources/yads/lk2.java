package yads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lk2 {
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    public static ArrayList a(jb2 jb2Var) {
        ArrayList arrayList;
        boolean z10;
        int i10;
        Object ik2Var;
        jb2 jb2Var2 = jb2Var;
        ArrayList arrayList2 = null;
        if (jb2Var2.m() != 0) {
            return null;
        }
        jb2Var2.e(jb2Var2.f151002b + 7);
        int iB = jb2Var2.b();
        boolean z11 = true;
        if (iB == 1684433976) {
            jb2 jb2Var3 = new jb2();
            Inflater inflater = new Inflater(true);
            try {
                if (!ib3.a(jb2Var2, jb2Var3, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                jb2Var2 = jb2Var3;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (iB != 1918990112) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        int i11 = jb2Var2.f151002b;
        int i12 = jb2Var2.f151003c;
        while (i11 < i12) {
            int iB2 = jb2Var2.b() + i11;
            if (iB2 <= i11 || iB2 > i12) {
                return arrayList2;
            }
            if (jb2Var2.b() == 1835365224) {
                int iB3 = jb2Var2.b();
                if (iB3 > 10000) {
                    arrayList = arrayList2;
                    z10 = z11;
                    i10 = i12;
                    ik2Var = arrayList;
                } else {
                    float[] fArr = new float[iB3];
                    for (int i13 = 0; i13 < iB3; i13++) {
                        fArr[i13] = Float.intBitsToFloat(jb2Var2.b());
                    }
                    int iB4 = jb2Var2.b();
                    if (iB4 > 32000) {
                        arrayList = arrayList2;
                        z10 = z11;
                    } else {
                        double dLog = Math.log(2.0d);
                        int iCeil = (int) Math.ceil(Math.log(((double) iB3) * 2.0d) / dLog);
                        arrayList = arrayList2;
                        byte[] bArr = jb2Var2.f151001a;
                        z10 = z11;
                        ib2 ib2Var = new ib2(bArr.length, bArr);
                        ib2Var.b(jb2Var2.f151002b * 8);
                        float[] fArr2 = new float[iB4 * 5];
                        int i14 = 5;
                        int[] iArr = new int[5];
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            if (i15 < iB4) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 < i14) {
                                        int i18 = iArr[i17];
                                        int iA = ib2Var.a(iCeil);
                                        int i19 = ((iA >> 1) ^ (-(iA & 1))) + i18;
                                        if (i19 < iB3 && i19 >= 0) {
                                            fArr2[i16] = fArr[i19];
                                            iArr[i17] = i19;
                                            i17++;
                                            i16++;
                                            i14 = 5;
                                        }
                                    } else {
                                        i15++;
                                        i14 = 5;
                                    }
                                }
                            } else {
                                ib2Var.b((ib2Var.d() + 7) & (-8));
                                int i20 = 32;
                                int iA2 = ib2Var.a(32);
                                jk2[] jk2VarArr = new jk2[iA2];
                                int i21 = 0;
                                while (true) {
                                    if (i21 < iA2) {
                                        int iA3 = ib2Var.a(8);
                                        int iA4 = ib2Var.a(8);
                                        int iA5 = ib2Var.a(i20);
                                        if (iA5 <= 128000) {
                                            float[] fArr3 = fArr2;
                                            int iCeil2 = (int) Math.ceil(Math.log(((double) iB4) * 2.0d) / dLog);
                                            float[] fArr4 = new float[iA5 * 3];
                                            int i22 = iA2;
                                            float[] fArr5 = new float[iA5 * 2];
                                            i10 = i12;
                                            int i23 = 0;
                                            int i24 = 0;
                                            while (true) {
                                                if (i23 < iA5) {
                                                    int iA6 = ib2Var.a(iCeil2);
                                                    int i25 = iCeil2;
                                                    int i26 = ((iA6 >> 1) ^ (-(iA6 & 1))) + i24;
                                                    if (i26 >= 0 && i26 < iB4) {
                                                        int i27 = i23 * 3;
                                                        int i28 = i26 * 5;
                                                        fArr4[i27] = fArr3[i28];
                                                        fArr4[i27 + 1] = fArr3[i28 + 1];
                                                        fArr4[i27 + 2] = fArr3[i28 + 2];
                                                        int i29 = i23 * 2;
                                                        fArr5[i29] = fArr3[i28 + 3];
                                                        fArr5[i29 + 1] = fArr3[i28 + 4];
                                                        i23++;
                                                        i24 = i26;
                                                        iCeil2 = i25;
                                                    }
                                                } else {
                                                    jk2VarArr[i21] = new jk2(iA3, fArr4, fArr5, iA4);
                                                    i21++;
                                                    fArr2 = fArr3;
                                                    iA2 = i22;
                                                    i12 = i10;
                                                    i20 = 32;
                                                }
                                            }
                                        }
                                        ik2Var = arrayList;
                                    } else {
                                        i10 = i12;
                                        ik2Var = new ik2(jk2VarArr);
                                    }
                                }
                            }
                        }
                    }
                    i10 = i12;
                    ik2Var = arrayList;
                }
                if (ik2Var == null) {
                    return arrayList;
                }
                arrayList3.add(ik2Var);
            } else {
                arrayList = arrayList2;
                z10 = z11;
                i10 = i12;
            }
            jb2Var2.e(iB2);
            i11 = iB2;
            arrayList2 = arrayList;
            z11 = z10;
            i12 = i10;
        }
        return arrayList3;
    }
}
