package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class dy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f148408a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f148409b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f148410c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f148411d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0123  */
    /* JADX WARN: Code duplicated, block: B:72:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0129  */
    /* JADX WARN: Code duplicated, block: B:91:0x0171  */
    public static cy1 b(byte[] bArr, int i10, int i11) {
        int iD;
        boolean zC;
        int i12;
        int iD2;
        boolean z10;
        boolean zC2;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17 = 1;
        kb2 kb2Var = new kb2(bArr, i10 + 1, i11);
        int i18 = 8;
        int iB = kb2Var.b(8);
        int iB2 = kb2Var.b(8);
        int iB3 = kb2Var.b(8);
        int iD3 = kb2Var.d();
        if (iB == 100 || iB == 110 || iB == 122 || iB == 244 || iB == 44 || iB == 83 || iB == 86 || iB == 118 || iB == 128 || iB == 138) {
            iD = kb2Var.d();
            zC = iD == 3 ? kb2Var.c() : false;
            kb2Var.d();
            kb2Var.d();
            kb2Var.f();
            if (kb2Var.c()) {
                int i19 = iD != 3 ? 8 : 12;
                int i20 = 0;
                while (i20 < i19) {
                    if (kb2Var.c()) {
                        int i21 = i20 < 6 ? 16 : 64;
                        int iE = 8;
                        int i22 = 8;
                        for (int i23 = 0; i23 < i21; i23++) {
                            if (iE != 0) {
                                iE = ((kb2Var.e() + i22) + 256) % 256;
                            }
                            if (iE != 0) {
                                i22 = iE;
                            }
                        }
                    }
                    i20++;
                }
            }
        } else {
            iD = 1;
            zC = false;
        }
        int iD4 = kb2Var.d() + 4;
        int iD5 = kb2Var.d();
        if (iD5 != 0) {
            if (iD5 == 1) {
                boolean zC3 = kb2Var.c();
                kb2Var.e();
                kb2Var.e();
                i12 = 16;
                long jD = kb2Var.d();
                kb2Var = kb2Var;
                for (int i24 = 0; i24 < jD; i24++) {
                    kb2Var.d();
                }
                z10 = zC3;
                i18 = 8;
                iD2 = 0;
            } else {
                i12 = 16;
                iD2 = 0;
            }
            kb2Var.d();
            kb2Var.f();
            int iD6 = kb2Var.d() + 1;
            int iD7 = kb2Var.d() + 1;
            zC2 = kb2Var.c();
            i13 = 2 - (zC2 ? 1 : 0);
            int i25 = iD7 * i13;
            if (!zC2) {
                kb2Var.f();
            }
            kb2Var.f();
            i14 = iD6 * 16;
            i15 = i25 * 16;
            if (kb2Var.c()) {
                int iD8 = kb2Var.d();
                int iD9 = kb2Var.d();
                int iD10 = kb2Var.d();
                int iD11 = kb2Var.d();
                if (iD != 0) {
                    if (iD == 3) {
                        i16 = 1;
                    } else {
                        i16 = 2;
                    }
                    i13 *= iD == 1 ? 2 : 1;
                    i17 = i16;
                }
                i14 -= (iD8 + iD9) * i17;
                i15 -= (iD10 + iD11) * i13;
            }
            int i26 = i14;
            if (kb2Var.c() || !kb2Var.c()) {
                f10 = 1.0f;
            } else {
                int iB4 = kb2Var.b(i18);
                if (iB4 == 255) {
                    int i27 = i12;
                    int iB5 = kb2Var.b(i27);
                    int iB6 = kb2Var.b(i27);
                    if (iB5 == 0 || iB6 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = iB5 / iB6;
                    }
                } else {
                    float[] fArr = f148409b;
                    if (iB4 < 17) {
                        f10 = fArr[iB4];
                    } else {
                        kf1.a("Unexpected aspect_ratio_idc value: ", iB4, "NalUnitUtil");
                        f10 = 1.0f;
                    }
                }
            }
            return new cy1(iB, iB2, iB3, iD3, i26, i15, f10, zC, zC2, iD4, iD5, iD2, z10);
        }
        iD2 = kb2Var.d() + 4;
        i12 = 16;
        z10 = false;
        kb2Var.d();
        kb2Var.f();
        int iD12 = kb2Var.d() + 1;
        int iD13 = kb2Var.d() + 1;
        zC2 = kb2Var.c();
        i13 = 2 - (zC2 ? 1 : 0);
        int i28 = iD13 * i13;
        if (!zC2) {
            kb2Var.f();
        }
        kb2Var.f();
        i14 = iD12 * 16;
        i15 = i28 * 16;
        if (kb2Var.c()) {
            int iD14 = kb2Var.d();
            int iD15 = kb2Var.d();
            int iD16 = kb2Var.d();
            int iD17 = kb2Var.d();
            if (iD != 0) {
                if (iD == 3) {
                    i16 = 1;
                } else {
                    i16 = 2;
                }
                i13 *= iD == 1 ? 2 : 1;
                i17 = i16;
            }
            i14 -= (iD14 + iD15) * i17;
            i15 -= (iD16 + iD17) * i13;
        }
        int i29 = i14;
        if (kb2Var.c()) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
        }
        return new cy1(iB, iB2, iB3, iD3, i29, i15, f10, zC, zC2, iD4, iD5, iD2, z10);
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalStateException();
        }
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static ay1 a(byte[] bArr, int i10, int i11) {
        int i12 = 2;
        kb2 kb2Var = new kb2(bArr, i10 + 2, i11);
        int i13 = 4;
        kb2Var.d(4);
        int iB = kb2Var.b(3);
        kb2Var.f();
        int iB2 = kb2Var.b(2);
        boolean zC = kb2Var.c();
        int iB3 = kb2Var.b(5);
        int i14 = 0;
        for (int i15 = 0; i15 < 32; i15++) {
            if (kb2Var.c()) {
                i14 |= 1 << i15;
            }
        }
        int i16 = 6;
        int[] iArr = new int[6];
        for (int i17 = 0; i17 < 6; i17++) {
            iArr[i17] = kb2Var.b(8);
        }
        int i18 = i14;
        int iB4 = kb2Var.b(8);
        int i19 = 0;
        for (int i20 = 0; i20 < iB; i20++) {
            if (kb2Var.c()) {
                i19 += 89;
            }
            if (kb2Var.c()) {
                i19 += 8;
            }
        }
        kb2Var.d(i19);
        if (iB > 0) {
            kb2Var.d((8 - iB) * 2);
        }
        kb2Var.d();
        int iD = kb2Var.d();
        if (iD == 3) {
            kb2Var.f();
        }
        int iD2 = kb2Var.d();
        int iD3 = kb2Var.d();
        if (kb2Var.c()) {
            int iD4 = kb2Var.d();
            int iD5 = kb2Var.d();
            int iD6 = kb2Var.d();
            int iD7 = kb2Var.d();
            iD2 -= (iD4 + iD5) * ((iD == 1 || iD == 2) ? 2 : 1);
            iD3 -= (iD6 + iD7) * (iD == 1 ? 2 : 1);
        }
        kb2Var.d();
        kb2Var.d();
        int iD8 = kb2Var.d();
        for (int i21 = kb2Var.c() ? 0 : iB; i21 <= iB; i21++) {
            kb2Var.d();
            kb2Var.d();
            kb2Var.d();
        }
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        if (kb2Var.c() && kb2Var.c()) {
            int i22 = 0;
            while (i22 < i13) {
                int i23 = 0;
                while (i23 < i16) {
                    if (!kb2Var.c()) {
                        kb2Var.d();
                    } else {
                        int iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                        if (i22 > 1) {
                            kb2Var.e();
                        }
                        for (int i24 = 0; i24 < iMin; i24++) {
                            kb2Var.e();
                        }
                    }
                    i23 += i22 == 3 ? 3 : 1;
                    i16 = 6;
                }
                i22++;
                i13 = 4;
                i16 = 6;
            }
        }
        kb2Var.d(2);
        if (kb2Var.c()) {
            kb2Var.d(8);
            kb2Var.d();
            kb2Var.d();
            kb2Var.f();
        }
        int iD9 = kb2Var.d();
        int[] iArrCopyOf = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i25 = -1;
        int i26 = 0;
        int i27 = -1;
        while (i26 < iD9) {
            if (i26 != 0 && kb2Var.c()) {
                int i28 = i25 + i27;
                int iD10 = (1 - ((kb2Var.c() ? 1 : 0) * 2)) * (kb2Var.d() + 1);
                int i29 = i28 + 1;
                int[] iArr2 = iArrCopyOf;
                boolean[] zArr = new boolean[i29];
                for (int i30 = 0; i30 <= i28; i30++) {
                    if (!kb2Var.c()) {
                        zArr[i30] = kb2Var.c();
                    } else {
                        zArr[i30] = true;
                    }
                }
                int[] iArr3 = new int[i29];
                int[] iArr4 = new int[i29];
                int i31 = 0;
                for (int i32 = i27 - 1; i32 >= 0; i32--) {
                    int i33 = iArrCopyOf2[i32] + iD10;
                    if (i33 < 0 && zArr[i25 + i32]) {
                        iArr3[i31] = i33;
                        i31++;
                    }
                }
                if (iD10 < 0 && zArr[i28]) {
                    iArr3[i31] = iD10;
                    i31++;
                }
                int i34 = i31;
                for (int i35 = 0; i35 < i25; i35++) {
                    int i36 = iArr2[i35] + iD10;
                    if (i36 < 0 && zArr[i35]) {
                        iArr3[i34] = i36;
                        i34++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i34);
                int i37 = 0;
                for (int i38 = i25 - 1; i38 >= 0; i38--) {
                    int i39 = iArr2[i38] + iD10;
                    if (i39 > 0 && zArr[i38]) {
                        iArr4[i37] = i39;
                        i37++;
                    }
                }
                if (iD10 > 0 && zArr[i28]) {
                    iArr4[i37] = iD10;
                    i37++;
                }
                int i40 = i34;
                int i41 = i37;
                for (int i42 = 0; i42 < i27; i42++) {
                    int i43 = iArrCopyOf2[i42] + iD10;
                    if (i43 > 0 && zArr[i25 + i42]) {
                        iArr4[i41] = i43;
                        i41++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr4, i41);
                i27 = i41;
                i25 = i40;
            } else {
                int iD11 = kb2Var.d();
                int iD12 = kb2Var.d();
                int[] iArr5 = new int[iD11];
                for (int i44 = 0; i44 < iD11; i44++) {
                    iArr5[i44] = kb2Var.d() + 1;
                    kb2Var.f();
                }
                int[] iArr6 = new int[iD12];
                for (int i45 = 0; i45 < iD12; i45++) {
                    iArr6[i45] = kb2Var.d() + 1;
                    kb2Var.f();
                }
                i25 = iD11;
                iArrCopyOf2 = iArr6;
                iArrCopyOf = iArr5;
                i27 = iD12;
            }
            i26++;
            i12 = i12;
            iD9 = iD9;
            iD8 = iD8;
        }
        int i46 = i12;
        int i47 = iD8;
        if (kb2Var.c()) {
            for (int i48 = 0; i48 < kb2Var.d(); i48++) {
                kb2Var.d(i47 + 5);
            }
        }
        kb2Var.d(i46);
        float f10 = 1.0f;
        if (kb2Var.c()) {
            if (kb2Var.c()) {
                int iB5 = kb2Var.b(8);
                if (iB5 == 255) {
                    int iB6 = kb2Var.b(16);
                    int iB7 = kb2Var.b(16);
                    if (iB6 != 0 && iB7 != 0) {
                        f10 = iB6 / iB7;
                    }
                } else {
                    float[] fArr = f148409b;
                    if (iB5 < 17) {
                        f10 = fArr[iB5];
                    } else {
                        kf1.a("Unexpected aspect_ratio_idc value: ", iB5, "NalUnitUtil");
                    }
                }
            }
            if (kb2Var.c()) {
                kb2Var.f();
            }
            if (kb2Var.c()) {
                kb2Var.d(4);
                if (kb2Var.c()) {
                    kb2Var.d(24);
                }
            }
            if (kb2Var.c()) {
                kb2Var.d();
                kb2Var.d();
            }
            kb2Var.f();
            if (kb2Var.c()) {
                iD3 *= 2;
            }
        }
        return new ay1(iB2, zC, iB3, i18, iArr, iB4, iD2, iD3, f10);
    }

    public static int a(int i10, byte[] bArr) {
        int i11;
        synchronized (f148410c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f148411d;
                    if (iArr.length <= i13) {
                        f148411d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f148411d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f148411d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
