package defpackage;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qbx {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;

        public c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = iArr;
            this.f = i4;
        }
    }

    public static final class d {
        public final pcn<c> a;
        public final int[] b;

        public d(c150 c150Var, int[] iArr) {
            this.a = pcn.j(c150Var);
            this.b = iArr;
        }
    }

    public static final class e {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static final class f {
        public final pcn<e> a;
        public final int[] b;

        public f(c150 c150Var, int[] iArr) {
            this.a = pcn.j(c150Var);
            this.b = iArr;
        }
    }

    public static final class g {
        public final int a;

        public g(int i) {
            this.a = i;
        }
    }

    public static final class h {
        public final int a;
        public final c b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final float i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;

        public h(int i, c cVar, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, int i10, int i11) {
            this.a = i;
            this.b = cVar;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.i = f;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = i11;
            this.g = i6;
            this.h = i7;
        }
    }

    public static final class i {
        public final int a;
        public final int b;
        public final int c;

        public i(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static final class j {
        public final pcn<i> a;
        public final int[] b;

        public j(c150 c150Var, int[] iArr) {
            this.a = pcn.j(c150Var);
            this.b = iArr;
        }
    }

    public static final class k {
        public final pcn<a> a;
        public final d b;
        public final f c;
        public final j d;

        public k(c150 c150Var, d dVar, f fVar, j jVar) {
            pcn<a> pcnVarJ;
            if (c150Var != null) {
                pcnVarJ = pcn.j(c150Var);
            } else {
                pcn.b bVar = pcn.b;
                pcnVarJ = c150.e;
            }
            this.a = pcnVarJ;
            this.b = dVar;
            this.c = fVar;
            this.d = jVar;
        }
    }

    public static final class l {
        public final int a;
        public final boolean b;

        public l(int i, int i2, boolean z) {
            this.a = i2;
            this.b = z;
        }
    }

    public static final class m {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final int h;
        public final int i;
        public final boolean j;
        public final boolean k;
        public final int l;
        public final int m;
        public final int n;
        public final boolean o;
        public final int p;
        public final int q;
        public final int r;
        public final int s;

        public m(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, int i8, boolean z, boolean z2, int i9, int i10, int i11, boolean z3, int i12, int i13, int i14, int i15) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = f;
            this.h = i7;
            this.i = i8;
            this.j = z;
            this.k = z2;
            this.l = i9;
            this.m = i10;
            this.n = i11;
            this.o = z3;
            this.p = i12;
            this.q = i13;
            this.r = i14;
            this.s = i15;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        ly0.f(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static boolean c(byte[] bArr, int i2, androidx.media3.common.a aVar) {
        int i3;
        if (Objects.equals(aVar.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(aVar.n, "video/hevc")) {
            b bVarE = e(new osz(bArr, 4, i2 + 4));
            int i4 = bVarE.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && bVarE.c == aVar.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(androidx.media3.common.a aVar) {
        if (Objects.equals(aVar.n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(aVar.n, "video/hevc") || gqv.b(aVar.k, "video/hevc") != null) ? 2 : 0;
    }

    public static b e(osz oszVar) {
        oszVar.i();
        return new b(oszVar.e(6), oszVar.e(6), oszVar.e(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static c f(osz oszVar, boolean z, int i2, c cVar) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean zD;
        int iE;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (!z) {
            if (cVar != null) {
                int i8 = cVar.a;
                zD = cVar.b;
                iE = cVar.c;
                i6 = cVar.d;
                iArr2 = cVar.e;
                i3 = i8;
            } else {
                iArr = iArr2;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
            }
            int iE2 = oszVar.e(8);
            i7 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                if (oszVar.d()) {
                    i7 += 88;
                }
                if (oszVar.d()) {
                    i7 += 8;
                }
            }
            oszVar.j(i7);
            if (i2 > 0) {
                oszVar.j((8 - i2) * 2);
            }
            return new c(i3, z2, i4, i5, iArr, iE2);
        }
        int iE3 = oszVar.e(2);
        zD = oszVar.d();
        iE = oszVar.e(5);
        i6 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (oszVar.d()) {
                i6 |= 1 << i10;
            }
        }
        for (int i11 = 0; i11 < 6; i11++) {
            iArr2[i11] = oszVar.e(8);
        }
        i3 = iE3;
        iArr = iArr2;
        z2 = zD;
        i4 = iE;
        i5 = i6;
        int iE4 = oszVar.e(8);
        i7 = 0;
        while (i9 < i2) {
            if (oszVar.d()) {
                i7 += 88;
            }
            if (oszVar.d()) {
                i7 += 8;
            }
        }
        oszVar.j(i7);
        if (i2 > 0) {
            oszVar.j((8 - i2) * 2);
        }
        return new c(i3, z2, i4, i5, iArr, iE4);
    }

    public static g g(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        osz oszVar = new osz(bArr, i4, i3 + 1);
        while (oszVar.b(16)) {
            int iE = oszVar.e(8);
            int i5 = 0;
            while (iE == 255) {
                i5 += 255;
                iE = oszVar.e(8);
            }
            int i6 = i5 + iE;
            int iE2 = oszVar.e(8);
            int i7 = 0;
            while (iE2 == 255) {
                i7 += 255;
                iE2 = oszVar.e(8);
            }
            int i8 = i7 + iE2;
            if (i8 == 0 || !oszVar.b(i8)) {
                return null;
            }
            if (i6 == 176) {
                int iF = oszVar.f();
                boolean zD = oszVar.d();
                int iF2 = zD ? oszVar.f() : 0;
                int iF3 = oszVar.f();
                int iF4 = -1;
                for (int i9 = 0; i9 <= iF3; i9++) {
                    iF4 = oszVar.f();
                    oszVar.f();
                    int iE3 = oszVar.e(6);
                    if (iE3 == 63) {
                        return null;
                    }
                    oszVar.e(iE3 == 0 ? Math.max(0, iF - 30) : Math.max(0, (iE3 + iF) - 31));
                    if (zD) {
                        int iE4 = oszVar.e(6);
                        if (iE4 == 63) {
                            return null;
                        }
                        oszVar.e(iE4 == 0 ? Math.max(0, iF2 - 30) : Math.max(0, (iE4 + iF2) - 31));
                    }
                    if (oszVar.d()) {
                        oszVar.j(10);
                    }
                }
                return new g(iF4);
            }
            oszVar.j(i8 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:202:0x039e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    public static h h(byte[] bArr, int i2, int i3, k kVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iF;
        int i8;
        int iF2;
        int i9;
        int i10;
        int iMax;
        int i11;
        int i12;
        int i13;
        int iF3;
        int iG;
        int i14;
        j jVar;
        f fVar;
        b bVarE = e(new osz(bArr, i2, i3));
        osz oszVar = new osz(bArr, i2 + 2, i3);
        int i15 = 4;
        oszVar.j(4);
        int iE = oszVar.e(3);
        int i16 = bVarE.b;
        boolean z = i16 != 0 && iE == 7;
        if (kVar != null) {
            pcn<a> pcnVar = kVar.a;
            if (pcnVar.isEmpty()) {
                i4 = 0;
            } else {
                i4 = pcnVar.get(Math.min(i16, pcnVar.size() - 1)).a;
            }
        } else {
            i4 = 0;
        }
        c cVarF = null;
        if (!z) {
            oszVar.i();
            cVarF = f(oszVar, true, iE, null);
        } else if (kVar != null) {
            d dVar = kVar.b;
            int[] iArr = dVar.b;
            pcn<c> pcnVar2 = dVar.a;
            int i17 = iArr[i4];
            if (pcnVar2.size() > i17) {
                cVarF = pcnVar2.get(i17);
            }
        }
        oszVar.f();
        if (z) {
            int iE2 = oszVar.d() ? oszVar.e(8) : -1;
            if (kVar == null || (fVar = kVar.c) == null) {
                iF = 0;
                iF2 = 0;
                i8 = 0;
                i10 = 0;
                i7 = 0;
                i9 = 0;
            } else {
                pcn<e> pcnVar3 = fVar.a;
                if (iE2 == -1) {
                    iE2 = fVar.b[i4];
                }
                if (iE2 == -1 || pcnVar3.size() <= iE2) {
                    iF = 0;
                    iF2 = 0;
                    i8 = 0;
                    i10 = 0;
                    i7 = 0;
                    i9 = 0;
                } else {
                    e eVar = pcnVar3.get(iE2);
                    int i18 = eVar.a;
                    i8 = eVar.d;
                    int i19 = eVar.e;
                    iF = eVar.b;
                    iF2 = eVar.c;
                    i7 = i19;
                    i9 = i7;
                    i10 = i8;
                }
            }
        } else {
            int iF4 = oszVar.f();
            if (iF4 == 3) {
                oszVar.i();
            }
            int iF5 = oszVar.f();
            int iF6 = oszVar.f();
            if (oszVar.d()) {
                int iF7 = oszVar.f();
                int iF8 = oszVar.f();
                int iF9 = oszVar.f();
                int iF10 = oszVar.f();
                i5 = iF5 - ((iF7 + iF8) * ((iF4 == 1 || iF4 == 2) ? 2 : 1));
                i6 = iF6 - ((iF9 + iF10) * (iF4 == 1 ? 2 : 1));
            } else {
                i5 = iF5;
                i6 = iF6;
            }
            i7 = i6;
            iF = oszVar.f();
            i8 = i5;
            iF2 = oszVar.f();
            i9 = iF6;
            i10 = iF5;
        }
        int iF11 = oszVar.f();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i20 = oszVar.d() ? 0 : iE; i20 <= iE; i20++) {
                oszVar.f();
                iMax = Math.max(oszVar.f(), iMax);
                oszVar.f();
            }
        }
        oszVar.f();
        oszVar.f();
        oszVar.f();
        oszVar.f();
        oszVar.f();
        oszVar.f();
        if (oszVar.d()) {
            int i21 = 6;
            if (z ? oszVar.d() : false) {
                oszVar.j(6);
            } else if (oszVar.d()) {
                int i22 = 0;
                while (i22 < i15) {
                    int i23 = 0;
                    while (i23 < i21) {
                        if (oszVar.d()) {
                            int iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                            if (i22 > 1) {
                                oszVar.g();
                            }
                            for (int i24 = 0; i24 < iMin; i24++) {
                                oszVar.g();
                            }
                        } else {
                            oszVar.f();
                        }
                        i23 += i22 == 3 ? 3 : 1;
                        i21 = 6;
                    }
                    i22++;
                    i15 = 4;
                    i21 = 6;
                }
            }
        }
        oszVar.j(2);
        if (oszVar.d()) {
            oszVar.j(8);
            oszVar.f();
            oszVar.f();
            oszVar.i();
        }
        int iF12 = oszVar.f();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i25 = 0;
        int iF13 = -1;
        int i26 = -1;
        while (i25 < iF12) {
            if (i25 == 0 || !oszVar.d()) {
                int iF14 = oszVar.f();
                iF13 = oszVar.f();
                int[] iArr3 = new int[iF14];
                int i27 = 0;
                while (i27 < iF14) {
                    iArr3[i27] = (i27 > 0 ? iArr3[i27 - 1] : 0) - (oszVar.f() + 1);
                    oszVar.i();
                    i27++;
                }
                int[] iArr4 = new int[iF13];
                int i28 = 0;
                while (i28 < iF13) {
                    iArr4[i28] = oszVar.f() + 1 + (i28 > 0 ? iArr4[i28 - 1] : 0);
                    oszVar.i();
                    i28++;
                }
                i26 = iF14;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i29 = i26 + iF13;
                int iF15 = (1 - ((oszVar.d() ? 1 : 0) * 2)) * (oszVar.f() + 1);
                int i30 = i29 + 1;
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 <= i29; i31++) {
                    if (oszVar.d()) {
                        zArr[i31] = true;
                    } else {
                        zArr[i31] = oszVar.d();
                    }
                }
                int[] iArr5 = new int[i30];
                int[] iArr6 = new int[i30];
                int i32 = 0;
                for (int i33 = iF13 - 1; i33 >= 0; i33--) {
                    int i34 = iArrCopyOf[i33] + iF15;
                    if (i34 < 0 && zArr[i26 + i33]) {
                        iArr5[i32] = i34;
                        i32++;
                    }
                }
                if (iF15 < 0 && zArr[i29]) {
                    iArr5[i32] = iF15;
                    i32++;
                }
                int i35 = i32;
                int[] iArr7 = iArr2;
                for (int i36 = 0; i36 < i26; i36++) {
                    int i37 = iArr7[i36] + iF15;
                    if (i37 < 0 && zArr[i36]) {
                        iArr5[i35] = i37;
                        i35++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i35);
                int i38 = 0;
                for (int i39 = i26 - 1; i39 >= 0; i39--) {
                    int i40 = iArr7[i39] + iF15;
                    if (i40 > 0 && zArr[i39]) {
                        iArr6[i38] = i40;
                        i38++;
                    }
                }
                if (iF15 > 0 && zArr[i29]) {
                    iArr6[i38] = iF15;
                    i38++;
                }
                int i41 = i35;
                int i42 = i38;
                for (int i43 = 0; i43 < iF13; i43++) {
                    int i44 = iArrCopyOf[i43] + iF15;
                    if (i44 > 0 && zArr[i26 + i43]) {
                        iArr6[i42] = i44;
                        i42++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i42);
                iF13 = i42;
                i26 = i41;
                iArr2 = iArrCopyOf2;
            }
            i25++;
            iF12 = iF12;
            i4 = i4;
        }
        int i45 = i4;
        if (oszVar.d()) {
            int iF16 = oszVar.f();
            for (int i46 = 0; i46 < iF16; i46++) {
                oszVar.j(iF11 + 5);
            }
        }
        oszVar.j(2);
        float f2 = 1.0f;
        if (oszVar.d()) {
            if (oszVar.d()) {
                int iE3 = oszVar.e(8);
                if (iE3 == 255) {
                    int iE4 = oszVar.e(16);
                    int iE5 = oszVar.e(16);
                    if (iE4 != 0 && iE5 != 0) {
                        f2 = iE4 / iE5;
                    }
                } else if (iE3 < 17) {
                    f2 = b[iE3];
                } else {
                    h08.a(iE3, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (oszVar.d()) {
                oszVar.i();
            }
            if (oszVar.d()) {
                oszVar.j(3);
                i14 = oszVar.d() ? 1 : 2;
                if (oszVar.d()) {
                    int iE6 = oszVar.e(8);
                    int iE7 = oszVar.e(8);
                    oszVar.j(8);
                    iF3 = n58.f(iE6);
                    iG = n58.g(iE7);
                } else {
                    iF3 = -1;
                    iG = -1;
                }
            } else if (kVar == null || (jVar = kVar.d) == null) {
                iF3 = -1;
                iG = -1;
                i14 = -1;
            } else {
                pcn<i> pcnVar4 = jVar.a;
                int i47 = jVar.b[i45];
                if (pcnVar4.size() > i47) {
                    i iVar = pcnVar4.get(i47);
                    int i48 = iVar.a;
                    int i49 = iVar.b;
                    iG = iVar.c;
                    iF3 = i48;
                    i14 = i49;
                } else {
                    iF3 = -1;
                    iG = -1;
                    i14 = -1;
                }
            }
            if (oszVar.d()) {
                oszVar.f();
                oszVar.f();
            }
            oszVar.i();
            if (oszVar.d()) {
                i7 *= 2;
            }
            i11 = iF3;
            i13 = iG;
            i12 = i14;
        } else {
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new h(iE, cVarF, iF, iF2, i8, i7, i10, i9, f2, iMax, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:482:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static k i(byte[] bArr, int i2, int i3) {
        int[] iArr;
        j jVar;
        int iE;
        int iE2;
        int iE3;
        boolean z;
        int i4;
        c150 c150Var;
        boolean[][] zArr;
        int i5;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i6;
        boolean zD;
        int i7;
        int i8;
        int i9;
        boolean zD2;
        boolean zD3;
        int iF;
        int i10;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        osz oszVar = new osz(bArr, i2, i3);
        e(oszVar);
        oszVar.j(4);
        boolean zD4 = oszVar.d();
        boolean zD5 = oszVar.d();
        int iE4 = oszVar.e(6);
        int i13 = iE4 + 1;
        int iE5 = oszVar.e(3);
        oszVar.j(17);
        c cVarF = f(oszVar, true, iE5, null);
        for (int i14 = oszVar.d() ? 0 : iE5; i14 <= iE5; i14++) {
            oszVar.f();
            oszVar.f();
            oszVar.f();
        }
        int iE6 = oszVar.e(6);
        int iF2 = oszVar.f() + 1;
        int i15 = 6;
        d dVar = new d(pcn.n(cVarF), new int[1]);
        boolean z4 = i13 >= 2 && iF2 >= 2;
        boolean z5 = zD4 && zD5;
        int i16 = iE6 + 1;
        boolean z6 = i16 >= i13;
        if (!z4 || !z5 || !z6) {
            return new k(null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iF2, i16);
        int i17 = 1;
        int[] iArr5 = new int[iF2];
        int[] iArr6 = new int[iF2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i18 = 1; i18 < iF2; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iE6; i20++) {
                if (oszVar.d()) {
                    iArr4[i18][i19] = i20;
                    iArr6[i18] = i20;
                    i19++;
                }
                iArr5[i18] = i19;
            }
        }
        if (oszVar.d()) {
            oszVar.j(64);
            if (oszVar.d()) {
                oszVar.f();
            }
            int iF3 = oszVar.f();
            int i21 = 0;
            while (i21 < iF3) {
                oszVar.f();
                if (i21 == 0 || oszVar.d()) {
                    boolean zD6 = oszVar.d();
                    boolean zD7 = oszVar.d();
                    z3 = zD6;
                    z2 = zD7;
                    if (zD6 || zD7) {
                        zD = oszVar.d();
                        if (zD) {
                            oszVar.j(19);
                        }
                        oszVar.j(8);
                        if (zD) {
                            oszVar.j(4);
                        }
                        oszVar.j(15);
                        i8 = zD6;
                        i7 = zD7;
                    }
                    i9 = 0;
                    while (i9 <= iE5) {
                        zD2 = oszVar.d();
                        if (!zD2) {
                            zD2 = oszVar.d();
                        }
                        if (zD2) {
                            oszVar.f();
                            zD3 = false;
                        } else {
                            zD3 = oszVar.d();
                        }
                        if (zD3) {
                            iF = 0;
                        } else {
                            iF = oszVar.f();
                        }
                        int[][] iArr7 = iArr4;
                        i10 = i8 + i7;
                        int[] iArr8 = iArr6;
                        i11 = 0;
                        while (i11 < i10) {
                            int i22 = i10;
                            for (i12 = 0; i12 <= iF; i12++) {
                                oszVar.f();
                                oszVar.f();
                                if (zD) {
                                    oszVar.f();
                                    oszVar.f();
                                }
                                oszVar.i();
                            }
                            i11++;
                            i10 = i22;
                        }
                        i9++;
                        i21 = i21;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i21++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zD = false;
                i8 = z3;
                i7 = z2;
                i9 = 0;
                while (i9 <= iE5) {
                    zD2 = oszVar.d();
                    if (!zD2) {
                        zD2 = oszVar.d();
                    }
                    if (zD2) {
                        oszVar.f();
                        zD3 = false;
                    } else {
                        zD3 = oszVar.d();
                    }
                    if (zD3) {
                        iF = oszVar.f();
                    } else {
                        iF = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i10 = i8 + i7;
                    int[] iArr10 = iArr6;
                    i11 = 0;
                    while (i11 < i10) {
                        int i23 = i10;
                        while (i12 <= iF) {
                            oszVar.f();
                            oszVar.f();
                            if (zD) {
                                oszVar.f();
                                oszVar.f();
                            }
                            oszVar.i();
                        }
                        i11++;
                        i10 = i23;
                    }
                    i9++;
                    i21 = i21;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i21++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!oszVar.d()) {
            return new k(null, dVar, null, null);
        }
        int i24 = oszVar.d;
        if (i24 > 0) {
            oszVar.j(8 - i24);
        }
        c cVarF2 = f(oszVar, false, iE5, cVarF);
        boolean zD8 = oszVar.d();
        boolean[] zArr3 = new boolean[16];
        int i25 = 0;
        for (int i26 = 0; i26 < 16; i26++) {
            boolean zD9 = oszVar.d();
            zArr3[i26] = zD9;
            if (zD9) {
                i25++;
            }
        }
        if (i25 == 0 || !zArr3[1]) {
            return new k(null, dVar, null, null);
        }
        int[] iArr13 = new int[i25];
        for (int i27 = 0; i27 < i25 - (zD8 ? 1 : 0); i27++) {
            iArr13[i27] = oszVar.e(3);
        }
        int[] iArr14 = new int[i25 + 1];
        if (zD8) {
            int i28 = 1;
            while (i28 < i25) {
                int[] iArr15 = iArr14;
                for (int i29 = 0; i29 < i28; i29++) {
                    iArr15[i28] = iArr13[i29] + 1 + iArr15[i28];
                }
                i28++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i25] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i13, i25);
        int[] iArr17 = new int[i13];
        iArr17[0] = 0;
        boolean zD10 = oszVar.d();
        int i30 = 1;
        while (i30 < i13) {
            if (zD10) {
                i6 = i30;
                iArr17[i6] = oszVar.e(i15);
            } else {
                i6 = i30;
                iArr17[i6] = i6;
            }
            if (zD8) {
                int i31 = 0;
                while (i31 < i25) {
                    int i32 = i31 + 1;
                    iArr16[i6][i31] = (iArr17[i6] & ((1 << iArr[i32]) - 1)) >> iArr[i31];
                    i31 = i32;
                }
            } else {
                int i33 = 0;
                while (i33 < i25) {
                    int i34 = i33;
                    iArr16[i6][i34] = oszVar.e(iArr13[i33] + 1);
                    i33 = i34 + 1;
                }
            }
            i30 = i6 + 1;
            i15 = 6;
        }
        int[] iArr18 = new int[i16];
        int i35 = 1;
        int i36 = 0;
        while (i36 < i13) {
            iArr18[iArr17[i36]] = -1;
            int[] iArr19 = iArr18;
            int i37 = 0;
            int i38 = 0;
            while (i37 < 16) {
                if (zArr3[i37]) {
                    if (i37 == i17) {
                        iArr19[iArr17[i36]] = iArr16[i36][i38];
                    }
                    i38++;
                }
                i37++;
                i17 = 1;
            }
            if (i36 > 0) {
                int i39 = 0;
                while (true) {
                    if (i39 >= i36) {
                        i35++;
                        break;
                    }
                    int i40 = i39;
                    if (iArr19[iArr17[i36]] == iArr19[iArr17[i39]]) {
                        break;
                    }
                    i39 = i40 + 1;
                }
            }
            i36++;
            iArr18 = iArr19;
            i17 = 1;
        }
        int[] iArr20 = iArr18;
        int iE7 = oszVar.e(4);
        if (i35 < 2 || iE7 == 0) {
            return new k(null, dVar, null, null);
        }
        int[] iArr21 = new int[i35];
        for (int i41 = 0; i41 < i35; i41++) {
            iArr21[i41] = oszVar.e(iE7);
        }
        int[] iArr22 = new int[i16];
        for (int i42 = 0; i42 < i13; i42++) {
            iArr22[Math.min(iArr17[i42], iE6)] = i42;
        }
        pcn.a aVar = new pcn.a();
        int i43 = 0;
        while (i43 <= iE6) {
            int[] iArr23 = iArr22;
            int i44 = i35;
            int iMin = Math.min(iArr20[i43], i44 - 1);
            aVar.c(new a(iArr23[i43], iMin >= 0 ? iArr21[iMin] : -1));
            i43++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i35 = i44;
        }
        int[] iArr24 = iArr17;
        c150 c150VarG = aVar.g();
        if (((a) c150VarG.get(0)).b == -1) {
            return new k(null, dVar, null, null);
        }
        int i45 = 1;
        while (true) {
            if (i45 > iE6) {
                i45 = -1;
                break;
            }
            if (((a) c150VarG.get(i45)).b != -1) {
                break;
            }
            i45++;
        }
        if (i45 == -1) {
            return new k(null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        for (int i46 = 1; i46 < i13; i46++) {
            for (int i47 = 0; i47 < i46; i47++) {
                boolean[] zArr6 = zArr4[i46];
                boolean[] zArr7 = zArr5[i46];
                boolean zD11 = oszVar.d();
                zArr7[i47] = zD11;
                zArr6[i47] = zD11;
            }
        }
        for (int i48 = 1; i48 < i13; i48++) {
            int i49 = 0;
            while (i49 < iE4) {
                boolean[][] zArr8 = zArr4;
                for (int i50 = 0; i50 < i48; i50++) {
                    boolean[] zArr9 = zArr5[i48];
                    if (zArr9[i50] && zArr5[i50][i49]) {
                        zArr9[i49] = true;
                        break;
                    }
                }
                i49++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i16];
        for (int i51 = 0; i51 < i13; i51++) {
            int i52 = 0;
            for (int i53 = 0; i53 < i51; i53++) {
                i52 += zArr10[i51][i53] ? 1 : 0;
            }
            iArr25[iArr24[i51]] = i52;
        }
        int i54 = 0;
        for (int i55 = 0; i55 < i13; i55++) {
            if (iArr25[iArr24[i55]] == 0) {
                i54++;
            }
        }
        if (i54 > 1) {
            return new k(null, dVar, null, null);
        }
        int[] iArr26 = new int[i13];
        int[] iArr27 = new int[iF2];
        if (oszVar.d()) {
            int i56 = 0;
            while (i56 < i13) {
                int i57 = i56;
                iArr26[i57] = oszVar.e(3);
                i56 = i57 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i13, iE5);
        }
        int i58 = 0;
        while (i58 < iF2) {
            int i59 = i58;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i60 = 0; i60 < iArr5[i59]; i60++) {
                iMax = Math.max(iMax, iArr28[((a) c150VarG.get(iArr11[i59][i60])).a]);
            }
            iArr27[i59] = iMax + 1;
            i58 = i59 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (oszVar.d()) {
            int i61 = 0;
            while (i61 < iE4) {
                int i62 = i61 + 1;
                int i63 = i62;
                while (i63 < i13) {
                    if (zArr10[i63][i61]) {
                        oszVar.j(3);
                    }
                    i63++;
                    iE4 = iE4;
                }
                i61 = i62;
            }
        }
        oszVar.i();
        int iF4 = oszVar.f() + 1;
        pcn.a aVar2 = new pcn.a();
        aVar2.c(cVarF);
        if (iF4 > 1) {
            aVar2.c(cVarF2);
            for (int i64 = 2; i64 < iF4; i64++) {
                cVarF2 = f(oszVar, oszVar.d(), iE5, cVarF2);
                aVar2.c(cVarF2);
            }
        }
        c150 c150VarG2 = aVar2.g();
        int iF5 = oszVar.f() + iF2;
        if (iF5 > iF2) {
            return new k(null, dVar, null, null);
        }
        int iE8 = oszVar.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iF5, i16);
        int[] iArr29 = new int[iF5];
        int i65 = 0;
        int[] iArr30 = new int[iF5];
        int i66 = 0;
        while (i66 < iF2) {
            iArr29[i66] = i65;
            iArr30[i66] = iArr12[i66];
            if (iE8 == 0) {
                i5 = i66;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i5], i65, iArr5[i5], true);
                iArr2[i5] = iArr5[i5];
            } else {
                i5 = i66;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iE8 == 1) {
                    int i67 = iArr12[i5];
                    for (int i68 = 0; i68 < iArr5[i5]; i68++) {
                        zArr2[i5][i68] = iArr11[i5][i68] == i67;
                    }
                    iArr2[i5] = 1;
                } else {
                    i65 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i66 = i5 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i65 = 0;
            i66 = i5 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i16];
        int i69 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i16;
        iArr34[i65] = iF5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i70 = 1;
        int i71 = 0;
        while (i70 < iF5) {
            if (iE8 == i69) {
                for (int i72 = 0; i72 < iArr5[i70]; i72++) {
                    zArr14[i70][i72] = oszVar.d();
                    int i73 = iArr31[i70];
                    boolean z7 = zArr14[i70][i72];
                    iArr31[i70] = i73 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr30[i70] = iArr11[i70][i72];
                    }
                }
            }
            if (i71 == 0) {
                i4 = 0;
                if (iArr11[i70][0] == 0 && zArr14[i70][0]) {
                    for (int i74 = 1; i74 < iArr5[i70]; i74++) {
                        if (iArr11[i70][i74] == i45 && zArr14[i70][i45]) {
                            i71 = i70;
                        }
                    }
                }
            } else {
                i4 = 0;
            }
            int i75 = i4;
            while (i75 < iArr5[i70]) {
                if (iF4 > 1) {
                    zArr15[i70][i75] = zArr14[i70][i75];
                    c150Var = c150VarG2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = tze.c(iF4);
                    if (!zArr[i70][i75]) {
                        int i76 = ((a) c150VarG.get(iArr11[i70][i75])).a;
                        int i77 = i4;
                        while (i77 < i75) {
                            int i78 = i77;
                            if (zArr12[i76][((a) c150VarG.get(iArr11[i70][i78])).a]) {
                                zArr[i70][i75] = true;
                                break;
                            }
                            i77 = i78 + 1;
                        }
                    }
                    if (zArr[i70][i75]) {
                        if (i71 <= 0 || i70 != i71) {
                            oszVar.j(iC);
                        } else {
                            iArr33[i75] = oszVar.e(iC);
                        }
                    }
                } else {
                    c150Var = c150VarG2;
                    zArr = zArr15;
                }
                i75++;
                c150VarG2 = c150Var;
                zArr15 = zArr;
            }
            c150 c150Var2 = c150VarG2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i70] == 1 && iArr25[iArr30[i70]] > 0) {
                oszVar.i();
            }
            i70++;
            c150VarG2 = c150Var2;
            zArr15 = zArr16;
            i69 = 2;
        }
        c150 c150Var3 = c150VarG2;
        boolean[][] zArr17 = zArr15;
        if (i71 == 0) {
            return new k(null, dVar, null, null);
        }
        int iF6 = oszVar.f();
        int i79 = iF6 + 1;
        s38.b(i79, "expectedSize");
        s38.b(i79, "initialCapacity");
        int[] iArr35 = new int[i13];
        Object[] objArrCopyOf = new Object[i79];
        int i80 = 0;
        int i81 = 0;
        boolean z8 = false;
        while (i80 < i79) {
            int i82 = i80;
            int iE9 = oszVar.e(16);
            int iE10 = oszVar.e(16);
            boolean z9 = z8;
            if (oszVar.d()) {
                iE = oszVar.e(2);
                if (iE == 3) {
                    oszVar.i();
                }
                iE2 = oszVar.e(4);
                iE3 = oszVar.e(4);
            } else {
                iE = 0;
                iE2 = 0;
                iE3 = 0;
            }
            if (oszVar.d()) {
                int iF7 = oszVar.f();
                int iF8 = oszVar.f();
                int iF9 = oszVar.f();
                int iF10 = oszVar.f();
                iE9 -= (iF7 + iF8) * ((iE == 1 || iE == 2) ? 2 : 1);
                iE10 -= (iF9 + iF10) * (iE == 1 ? 2 : 1);
            }
            e eVar = new e(iE, iE2, iE3, iE9, iE10);
            int iB = jcn.b.b(objArrCopyOf.length, i81 + 1);
            if (iB > objArrCopyOf.length || z9) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                z = false;
            } else {
                z = z9;
            }
            objArrCopyOf[i81] = eVar;
            i81++;
            i80 = i82 + 1;
            z8 = z;
        }
        if (i79 <= 1 || !oszVar.d()) {
            for (int i83 = 1; i83 < i13; i83++) {
                iArr35[i83] = Math.min(i83, iF6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = tze.c(i79);
            for (int i84 = 1; i84 < i13; i84++) {
                iArr35[i84] = oszVar.e(iC2);
            }
        }
        f fVar = new f(pcn.i(i81, objArrCopyOf), iArr35);
        oszVar.j(2);
        for (int i85 = 1; i85 < i13; i85++) {
            if (iArr25[iArr24[i85]] == 0) {
                oszVar.i();
            }
        }
        for (int i86 = 1; i86 < iF5; i86++) {
            boolean zD12 = oszVar.d();
            int i87 = 0;
            while (i87 < iArr32[i86]) {
                if ((i87 <= 0 || !zD12) ? i87 == 0 : oszVar.d()) {
                    for (int i88 = 0; i88 < iArr5[i86]; i88++) {
                        if (zArr17[i86][i88]) {
                            oszVar.f();
                        }
                    }
                    oszVar.f();
                    oszVar.f();
                }
                i87++;
            }
        }
        int iF11 = oszVar.f() + 2;
        if (oszVar.d()) {
            oszVar.j(iF11);
        } else {
            for (int i89 = 1; i89 < i13; i89++) {
                for (int i90 = 0; i90 < i89; i90++) {
                    if (zArr10[i89][i90]) {
                        oszVar.j(iF11);
                    }
                }
            }
        }
        int iF12 = oszVar.f();
        for (int i91 = 1; i91 <= iF12; i91++) {
            oszVar.j(8);
        }
        if (oszVar.d()) {
            int i92 = oszVar.d;
            if (i92 > 0) {
                oszVar.j(8 - i92);
            }
            if (!oszVar.d() ? oszVar.d() : true) {
                oszVar.i();
            }
            boolean zD13 = oszVar.d();
            boolean zD14 = oszVar.d();
            if (zD13 || zD14) {
                for (int i93 = 0; i93 < iF2; i93++) {
                    for (int i94 = 0; i94 < iArr32[i93]; i94++) {
                        boolean zD15 = zD13 ? oszVar.d() : false;
                        boolean zD16 = zD14 ? oszVar.d() : false;
                        if (zD15) {
                            oszVar.j(32);
                        }
                        if (zD16) {
                            oszVar.j(18);
                        }
                    }
                }
            }
            boolean zD17 = oszVar.d();
            int iE11 = zD17 ? oszVar.e(4) + 1 : i13;
            s38.b(iE11, "expectedSize");
            s38.b(iE11, "initialCapacity");
            int[] iArr36 = new int[i13];
            Object[] objArrCopyOf2 = new Object[iE11];
            int i95 = 0;
            int i96 = 0;
            boolean z10 = false;
            while (i95 < iE11) {
                oszVar.j(3);
                int i97 = oszVar.d() ? 1 : 2;
                int iF13 = n58.f(oszVar.e(8));
                boolean z11 = zD17;
                int iG = n58.g(oszVar.e(8));
                oszVar.j(8);
                i iVar = new i(iF13, i97, iG);
                int iB2 = jcn.b.b(objArrCopyOf2.length, i96 + 1);
                if (iB2 > objArrCopyOf2.length || z10) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iB2);
                    z10 = false;
                }
                objArrCopyOf2[i96] = iVar;
                i95++;
                i96++;
                zD17 = z11;
                z10 = z10;
            }
            if (zD17 && iE11 > 1) {
                for (int i98 = 0; i98 < i13; i98++) {
                    iArr36[i98] = oszVar.e(4);
                }
            }
            jVar = new j(pcn.i(i96, objArrCopyOf2), iArr36);
        } else {
            jVar = null;
        }
        return new k(c150VarG, new d(c150Var3, iArr33), fVar, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
      0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static m j(byte[] bArr, int i2, int i3) {
        int iF;
        int iF2;
        int i4;
        boolean z;
        int i5;
        int iF3;
        boolean z2;
        boolean zD;
        int i6;
        int i7;
        int i8;
        int iF4;
        int iF5;
        float f2;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        int i13;
        int iG;
        boolean zD2;
        boolean zD3;
        int iE;
        int iE2;
        int iE3;
        int i14;
        int i15;
        osz oszVar = new osz(bArr, i2 + 1, i3);
        int iE4 = oszVar.e(8);
        int iE5 = oszVar.e(8);
        int iE6 = oszVar.e(8);
        int iF6 = oszVar.f();
        if (iE4 == 100 || iE4 == 110 || iE4 == 122 || iE4 == 244 || iE4 == 44 || iE4 == 83 || iE4 == 86 || iE4 == 118 || iE4 == 128 || iE4 == 138) {
            iF = oszVar.f();
            boolean zD4 = iF == 3 ? oszVar.d() : false;
            int iF7 = oszVar.f();
            iF2 = oszVar.f();
            oszVar.i();
            if (oszVar.d()) {
                int i16 = iF != 3 ? 8 : 12;
                i4 = 16;
                int i17 = 0;
                while (i17 < i16) {
                    if (oszVar.d()) {
                        int i18 = i17 < 6 ? 16 : 64;
                        int iG2 = 8;
                        int i19 = 8;
                        for (int i20 = 0; i20 < i18; i20++) {
                            if (iG2 != 0) {
                                iG2 = ((oszVar.g() + i19) + 256) % 256;
                            }
                            if (iG2 != 0) {
                                i19 = iG2;
                            }
                        }
                    }
                    i17++;
                }
            } else {
                i4 = 16;
            }
            z = zD4;
            i5 = iF7;
        } else {
            iF = 1;
            i4 = 16;
            i5 = 0;
            z = false;
            iF2 = 0;
        }
        int iF8 = oszVar.f() + 4;
        int iF9 = oszVar.f();
        if (iF9 != 0) {
            if (iF9 == 1) {
                boolean zD5 = oszVar.d();
                oszVar.g();
                oszVar.g();
                iE4 = iE4;
                long jF = oszVar.f();
                iF9 = iF9;
                for (int i21 = 0; i21 < jF; i21++) {
                    oszVar.f();
                }
                iF2 = iF2;
                z2 = zD5;
                iF3 = 0;
            } else {
                iF3 = 0;
            }
            oszVar.f();
            oszVar.i();
            int iF10 = oszVar.f() + 1;
            int iF11 = oszVar.f() + 1;
            zD = oszVar.d();
            i6 = 2 - (zD ? 1 : 0);
            int i22 = iF11 * i6;
            if (!zD) {
                oszVar.i();
            }
            oszVar.i();
            i7 = iF10 * 16;
            i8 = i22 * 16;
            if (oszVar.d()) {
                int iF12 = oszVar.f();
                int iF13 = oszVar.f();
                int iF14 = oszVar.f();
                int iF15 = oszVar.f();
                if (iF == 0) {
                    i14 = 1;
                } else {
                    if (iF == 3) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    if (iF == 1) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    i6 *= i15;
                }
                i7 -= (iF12 + iF13) * i14;
                i8 -= (iF14 + iF15) * i6;
            }
            int i23 = i8;
            int i24 = i7;
            int i25 = iE4;
            iF4 = ((i25 != 44 || i25 == 86 || i25 == 100 || i25 == 110 || i25 == 122 || i25 == 244) && (iE5 & 16) != 0) ? 0 : i4;
            iF5 = -1;
            f2 = 1.0f;
            if (oszVar.d()) {
                if (!oszVar.d()) {
                    iE = oszVar.e(8);
                    if (iE == 255) {
                        int i26 = i4;
                        iE2 = oszVar.e(i26);
                        iE3 = oszVar.e(i26);
                        if (iE2 != 0 && iE3 != 0) {
                            f2 = iE2 / iE3;
                        }
                    } else if (iE < 17) {
                        f2 = b[iE];
                    } else {
                        h08.a(iE, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (oszVar.d()) {
                    oszVar.i();
                }
                if (oszVar.d()) {
                    oszVar.j(3);
                    if (oszVar.d()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (oszVar.d()) {
                        int iE7 = oszVar.e(8);
                        int iE8 = oszVar.e(8);
                        oszVar.j(8);
                        iF5 = n58.f(iE7);
                        iG = n58.g(iE8);
                    } else {
                        iG = -1;
                    }
                } else {
                    i13 = -1;
                    iG = -1;
                }
                if (oszVar.d()) {
                    oszVar.f();
                    oszVar.f();
                }
                if (oszVar.d()) {
                    oszVar.j(65);
                }
                zD2 = oszVar.d();
                if (zD2) {
                    k(oszVar);
                }
                zD3 = oszVar.d();
                if (zD3) {
                    k(oszVar);
                }
                if (zD2 || zD3) {
                    oszVar.i();
                }
                oszVar.i();
                if (oszVar.d()) {
                    oszVar.i();
                    oszVar.f();
                    oszVar.f();
                    oszVar.f();
                    oszVar.f();
                    iF4 = oszVar.f();
                    oszVar.f();
                }
                f3 = f2;
                i12 = iF5;
                i10 = i13;
                i11 = iG;
                i9 = iF4;
            } else {
                iF8 = iF8;
                i9 = iF4;
                i10 = -1;
                i11 = -1;
                f3 = 1.0f;
                i12 = -1;
            }
            return new m(i25, iE5, iE6, iF6, i24, i23, f3, i5, iF2, z, zD, iF8, iF9, iF3, z2, i12, i10, i11, i9);
        }
        iF3 = oszVar.f() + 4;
        z2 = false;
        oszVar.f();
        oszVar.i();
        int iF16 = oszVar.f() + 1;
        int iF17 = oszVar.f() + 1;
        zD = oszVar.d();
        i6 = 2 - (zD ? 1 : 0);
        int i27 = iF17 * i6;
        if (!zD) {
            oszVar.i();
        }
        oszVar.i();
        i7 = iF16 * 16;
        i8 = i27 * 16;
        if (oszVar.d()) {
            int iF18 = oszVar.f();
            int iF19 = oszVar.f();
            int iF110 = oszVar.f();
            int iF111 = oszVar.f();
            if (iF == 0) {
                i14 = 1;
            } else {
                if (iF == 3) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                if (iF == 1) {
                    i15 = 2;
                } else {
                    i15 = 1;
                }
                i6 *= i15;
            }
            i7 -= (iF18 + iF19) * i14;
            i8 -= (iF110 + iF111) * i6;
        }
        int i28 = i8;
        int i29 = i7;
        int i210 = iE4;
        if (i210 != 44) {
        }
        iF5 = -1;
        f2 = 1.0f;
        if (oszVar.d()) {
            if (!oszVar.d()) {
                iE = oszVar.e(8);
                if (iE == 255) {
                    int i211 = i4;
                    iE2 = oszVar.e(i211);
                    iE3 = oszVar.e(i211);
                    if (iE2 != 0) {
                        f2 = iE2 / iE3;
                    }
                } else if (iE < 17) {
                    f2 = b[iE];
                } else {
                    h08.a(iE, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (oszVar.d()) {
                oszVar.i();
            }
            if (oszVar.d()) {
                oszVar.j(3);
                if (oszVar.d()) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (oszVar.d()) {
                    int iE9 = oszVar.e(8);
                    int iE10 = oszVar.e(8);
                    oszVar.j(8);
                    iF5 = n58.f(iE9);
                    iG = n58.g(iE10);
                } else {
                    iG = -1;
                }
            } else {
                i13 = -1;
                iG = -1;
            }
            if (oszVar.d()) {
                oszVar.f();
                oszVar.f();
            }
            if (oszVar.d()) {
                oszVar.j(65);
            }
            zD2 = oszVar.d();
            if (zD2) {
                k(oszVar);
            }
            zD3 = oszVar.d();
            if (zD3) {
                k(oszVar);
            }
            if (zD2) {
                oszVar.i();
            } else {
                oszVar.i();
            }
            oszVar.i();
            if (oszVar.d()) {
                oszVar.i();
                oszVar.f();
                oszVar.f();
                oszVar.f();
                oszVar.f();
                iF4 = oszVar.f();
                oszVar.f();
            }
            f3 = f2;
            i12 = iF5;
            i10 = i13;
            i11 = iG;
            i9 = iF4;
        } else {
            iF8 = iF8;
            i9 = iF4;
            i10 = -1;
            i11 = -1;
            f3 = 1.0f;
            i12 = -1;
        }
        return new m(i210, iE5, iE6, iF6, i29, i28, f3, i5, iF2, z, zD, iF8, iF9, iF3, z2, i12, i10, i11, i9);
    }

    public static void k(osz oszVar) {
        int iF = oszVar.f() + 1;
        oszVar.j(8);
        for (int i2 = 0; i2 < iF; i2++) {
            oszVar.f();
            oszVar.f();
            oszVar.i();
        }
        oszVar.j(20);
    }

    public static int l(int i2, byte[] bArr) {
        int i3;
        synchronized (c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArrCopyOf = d;
                    if (iArrCopyOf.length <= i5) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                        d = iArrCopyOf;
                    }
                    iArrCopyOf[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }
}
