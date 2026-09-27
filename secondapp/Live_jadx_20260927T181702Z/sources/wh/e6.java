package wh;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class e6 implements z5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f143053g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f143054h = 33;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f143055i = 35937;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f143056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f143057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f143058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f143059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double[] f143060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f143061f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143062a;

        static {
            int[] iArr = new int[d.values().length];
            f143062a = iArr;
            try {
                iArr[d.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f143062a[d.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f143062a[d.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143070a;

        public c(int i10, int i11) {
            this.f143070a = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d {
        RED,
        GREEN,
        BLUE
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f143076b;

        public e(int i10, double d10) {
            this.f143075a = i10;
            this.f143076b = d10;
        }
    }

    public static int b(b bVar, d dVar, int[] iArr) {
        int i10;
        int i11;
        int i12 = a.f143062a[dVar.ordinal()];
        if (i12 == 1) {
            i10 = (-iArr[h(bVar.f143063a, bVar.f143066d, bVar.f143068f)]) + iArr[h(bVar.f143063a, bVar.f143066d, bVar.f143067e)] + iArr[h(bVar.f143063a, bVar.f143065c, bVar.f143068f)];
            i11 = iArr[h(bVar.f143063a, bVar.f143065c, bVar.f143067e)];
        } else if (i12 == 2) {
            i10 = (-iArr[h(bVar.f143064b, bVar.f143065c, bVar.f143068f)]) + iArr[h(bVar.f143064b, bVar.f143065c, bVar.f143067e)] + iArr[h(bVar.f143063a, bVar.f143065c, bVar.f143068f)];
            i11 = iArr[h(bVar.f143063a, bVar.f143065c, bVar.f143067e)];
        } else {
            if (i12 != 3) {
                throw new IllegalArgumentException("unexpected direction " + dVar);
            }
            i10 = (-iArr[h(bVar.f143064b, bVar.f143066d, bVar.f143067e)]) + iArr[h(bVar.f143064b, bVar.f143065c, bVar.f143067e)] + iArr[h(bVar.f143063a, bVar.f143066d, bVar.f143067e)];
            i11 = iArr[h(bVar.f143063a, bVar.f143065c, bVar.f143067e)];
        }
        return i10 - i11;
    }

    public static int h(int i10, int i11, int i12) {
        return (i10 << 10) + (i10 << 6) + i10 + (i11 << 5) + i11 + i12;
    }

    public static int j(b bVar, d dVar, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13 = a.f143062a[dVar.ordinal()];
        if (i13 == 1) {
            i11 = (iArr[h(i10, bVar.f143066d, bVar.f143068f)] - iArr[h(i10, bVar.f143066d, bVar.f143067e)]) - iArr[h(i10, bVar.f143065c, bVar.f143068f)];
            i12 = iArr[h(i10, bVar.f143065c, bVar.f143067e)];
        } else if (i13 == 2) {
            i11 = (iArr[h(bVar.f143064b, i10, bVar.f143068f)] - iArr[h(bVar.f143064b, i10, bVar.f143067e)]) - iArr[h(bVar.f143063a, i10, bVar.f143068f)];
            i12 = iArr[h(bVar.f143063a, i10, bVar.f143067e)];
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException("unexpected direction " + dVar);
            }
            i11 = (iArr[h(bVar.f143064b, bVar.f143066d, i10)] - iArr[h(bVar.f143064b, bVar.f143065c, i10)]) - iArr[h(bVar.f143063a, bVar.f143066d, i10)];
            i12 = iArr[h(bVar.f143063a, bVar.f143065c, i10)];
        }
        return i11 + i12;
    }

    public static int l(b bVar, int[] iArr) {
        return ((((((iArr[h(bVar.f143064b, bVar.f143066d, bVar.f143068f)] - iArr[h(bVar.f143064b, bVar.f143066d, bVar.f143067e)]) - iArr[h(bVar.f143064b, bVar.f143065c, bVar.f143068f)]) + iArr[h(bVar.f143064b, bVar.f143065c, bVar.f143067e)]) - iArr[h(bVar.f143063a, bVar.f143066d, bVar.f143068f)]) + iArr[h(bVar.f143063a, bVar.f143066d, bVar.f143067e)]) + iArr[h(bVar.f143063a, bVar.f143065c, bVar.f143068f)]) - iArr[h(bVar.f143063a, bVar.f143065c, bVar.f143067e)];
    }

    @Override // wh.z5
    public c6 a(int[] iArr, int i10) {
        c(new b6().a(iArr, i10).f143036a);
        e();
        List<Integer> listF = f(d(i10).f143070a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listF) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new c6(linkedHashMap);
    }

    public void c(Map<Integer, Integer> map) {
        this.f143056a = new int[f143055i];
        this.f143057b = new int[f143055i];
        this.f143058c = new int[f143055i];
        this.f143059d = new int[f143055i];
        this.f143060e = new double[f143055i];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iQ = wh.c.q(iIntValue);
            int i10 = wh.c.i(iIntValue);
            int iG = wh.c.g(iIntValue);
            int iH = h((iQ >> 3) + 1, (i10 >> 3) + 1, (iG >> 3) + 1);
            int[] iArr = this.f143056a;
            iArr[iH] = iArr[iH] + iIntValue2;
            int[] iArr2 = this.f143057b;
            iArr2[iH] = iArr2[iH] + (iQ * iIntValue2);
            int[] iArr3 = this.f143058c;
            iArr3[iH] = iArr3[iH] + (i10 * iIntValue2);
            int[] iArr4 = this.f143059d;
            iArr4[iH] = iArr4[iH] + (iG * iIntValue2);
            double[] dArr = this.f143060e;
            dArr[iH] = dArr[iH] + ((double) (iIntValue2 * ((iQ * iQ) + (i10 * i10) + (iG * iG))));
        }
    }

    public c d(int i10) {
        int i11;
        this.f143061f = new b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            this.f143061f[i12] = new b(null);
        }
        double[] dArr = new double[i10];
        b bVar = this.f143061f[0];
        bVar.f143064b = 32;
        bVar.f143066d = 32;
        bVar.f143068f = 32;
        int i13 = 0;
        int i14 = 1;
        while (i14 < i10) {
            b[] bVarArr = this.f143061f;
            if (g(bVarArr[i13], bVarArr[i14]).booleanValue()) {
                b bVar2 = this.f143061f[i13];
                dArr[i13] = bVar2.f143069g > 1 ? k(bVar2) : 0.0d;
                b bVar3 = this.f143061f[i14];
                dArr[i14] = bVar3.f143069g > 1 ? k(bVar3) : 0.0d;
            } else {
                dArr[i13] = 0.0d;
                i14--;
            }
            double d10 = dArr[0];
            int i15 = 0;
            for (int i16 = 1; i16 <= i14; i16++) {
                double d11 = dArr[i16];
                if (d11 > d10) {
                    i15 = i16;
                    d10 = d11;
                }
            }
            if (d10 <= 0.0d) {
                i11 = i14 + 1;
                return new c(i10, i11);
            }
            i14++;
            i13 = i15;
        }
        i11 = i10;
        return new c(i10, i11);
    }

    public void e() {
        int i10 = 1;
        while (true) {
            int i11 = 33;
            if (i10 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i12 = 1;
            while (i12 < i11) {
                int i13 = 0;
                int i14 = 0;
                double d10 = 0.0d;
                int i15 = 1;
                int i16 = 0;
                int i17 = 0;
                while (i15 < i11) {
                    int iH = h(i10, i12, i15);
                    i13 += this.f143056a[iH];
                    i16 += this.f143057b[iH];
                    i17 += this.f143058c[iH];
                    i14 += this.f143059d[iH];
                    d10 += this.f143060e[iH];
                    iArr[i15] = iArr[i15] + i13;
                    iArr2[i15] = iArr2[i15] + i16;
                    iArr3[i15] = iArr3[i15] + i17;
                    iArr4[i15] = iArr4[i15] + i14;
                    dArr[i15] = dArr[i15] + d10;
                    int iH2 = h(i10 - 1, i12, i15);
                    int i18 = i15;
                    int[] iArr5 = this.f143056a;
                    iArr5[iH] = iArr5[iH2] + iArr[i18];
                    int[] iArr6 = this.f143057b;
                    iArr6[iH] = iArr6[iH2] + iArr2[i18];
                    int[] iArr7 = this.f143058c;
                    iArr7[iH] = iArr7[iH2] + iArr3[i18];
                    int[] iArr8 = this.f143059d;
                    iArr8[iH] = iArr8[iH2] + iArr4[i18];
                    double[] dArr2 = this.f143060e;
                    dArr2[iH] = dArr2[iH2] + dArr[i18];
                    i15 = i18 + 1;
                    i11 = 33;
                }
                i12++;
                i11 = 33;
            }
            i10++;
        }
    }

    public List<Integer> f(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = this.f143061f[i11];
            int iL = l(bVar, this.f143056a);
            if (iL > 0) {
                int iL2 = l(bVar, this.f143057b) / iL;
                int iL3 = l(bVar, this.f143058c) / iL;
                arrayList.add(Integer.valueOf(((l(bVar, this.f143059d) / iL) & 255) | ((iL2 & 255) << 16) | (-16777216) | ((iL3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean g(b bVar, b bVar2) {
        int iL = l(bVar, this.f143057b);
        int iL2 = l(bVar, this.f143058c);
        int iL3 = l(bVar, this.f143059d);
        int iL4 = l(bVar, this.f143056a);
        d dVar = d.RED;
        e eVarI = i(bVar, dVar, bVar.f143063a + 1, bVar.f143064b, iL, iL2, iL3, iL4);
        d dVar2 = d.GREEN;
        e eVarI2 = i(bVar, dVar2, bVar.f143065c + 1, bVar.f143066d, iL, iL2, iL3, iL4);
        d dVar3 = d.BLUE;
        e eVarI3 = i(bVar, dVar3, bVar.f143067e + 1, bVar.f143068f, iL, iL2, iL3, iL4);
        double d10 = eVarI.f143076b;
        double d11 = eVarI2.f143076b;
        double d12 = eVarI3.f143076b;
        if (d10 < d11 || d10 < d12) {
            if (d11 >= d10 && d11 >= d12) {
                dVar3 = dVar2;
            }
        } else {
            if (eVarI.f143075a < 0) {
                return Boolean.FALSE;
            }
            dVar3 = dVar;
        }
        bVar2.f143064b = bVar.f143064b;
        bVar2.f143066d = bVar.f143066d;
        bVar2.f143068f = bVar.f143068f;
        int i10 = a.f143062a[dVar3.ordinal()];
        if (i10 == 1) {
            int i11 = eVarI.f143075a;
            bVar.f143064b = i11;
            bVar2.f143063a = i11;
            bVar2.f143065c = bVar.f143065c;
            bVar2.f143067e = bVar.f143067e;
        } else if (i10 == 2) {
            int i12 = eVarI2.f143075a;
            bVar.f143066d = i12;
            bVar2.f143063a = bVar.f143063a;
            bVar2.f143065c = i12;
            bVar2.f143067e = bVar.f143067e;
        } else if (i10 == 3) {
            int i13 = eVarI3.f143075a;
            bVar.f143068f = i13;
            bVar2.f143063a = bVar.f143063a;
            bVar2.f143065c = bVar.f143065c;
            bVar2.f143067e = i13;
        }
        bVar.f143069g = (bVar.f143064b - bVar.f143063a) * (bVar.f143066d - bVar.f143065c) * (bVar.f143068f - bVar.f143067e);
        bVar2.f143069g = (bVar2.f143064b - bVar2.f143063a) * (bVar2.f143066d - bVar2.f143065c) * (bVar2.f143068f - bVar2.f143067e);
        return Boolean.TRUE;
    }

    public e i(b bVar, d dVar, int i10, int i11, int i12, int i13, int i14, int i15) {
        e6 e6Var = this;
        b bVar2 = bVar;
        int iB = b(bVar2, dVar, e6Var.f143057b);
        int iB2 = b(bVar2, dVar, e6Var.f143058c);
        int iB3 = b(bVar2, dVar, e6Var.f143059d);
        int iB4 = b(bVar2, dVar, e6Var.f143056a);
        int i16 = -1;
        double d10 = 0.0d;
        int i17 = i10;
        while (i17 < i11) {
            int iJ = j(bVar2, dVar, i17, e6Var.f143057b) + iB;
            int iJ2 = j(bVar2, dVar, i17, e6Var.f143058c) + iB2;
            int iJ3 = j(bVar2, dVar, i17, e6Var.f143059d) + iB3;
            int iJ4 = j(bVar2, dVar, i17, e6Var.f143056a) + iB4;
            if (iJ4 != 0) {
                double d11 = ((double) (((iJ * iJ) + (iJ2 * iJ2)) + (iJ3 * iJ3))) / ((double) iJ4);
                int i18 = i12 - iJ;
                int i19 = i13 - iJ2;
                int i20 = i14 - iJ3;
                int i21 = i15 - iJ4;
                if (i21 != 0) {
                    double d12 = d11 + (((double) (((i18 * i18) + (i19 * i19)) + (i20 * i20))) / ((double) i21));
                    if (d12 > d10) {
                        d10 = d12;
                        i16 = i17;
                    }
                }
            }
            i17++;
            e6Var = this;
            bVar2 = bVar;
        }
        return new e(i16, d10);
    }

    public double k(b bVar) {
        int iL = l(bVar, this.f143057b);
        int iL2 = l(bVar, this.f143058c);
        int iL3 = l(bVar, this.f143059d);
        return (((((((this.f143060e[h(bVar.f143064b, bVar.f143066d, bVar.f143068f)] - this.f143060e[h(bVar.f143064b, bVar.f143066d, bVar.f143067e)]) - this.f143060e[h(bVar.f143064b, bVar.f143065c, bVar.f143068f)]) + this.f143060e[h(bVar.f143064b, bVar.f143065c, bVar.f143067e)]) - this.f143060e[h(bVar.f143063a, bVar.f143066d, bVar.f143068f)]) + this.f143060e[h(bVar.f143063a, bVar.f143066d, bVar.f143067e)]) + this.f143060e[h(bVar.f143063a, bVar.f143065c, bVar.f143068f)]) - this.f143060e[h(bVar.f143063a, bVar.f143065c, bVar.f143067e)]) - (((double) (((iL * iL) + (iL2 * iL2)) + (iL3 * iL3))) / ((double) l(bVar, this.f143056a)));
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f143064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f143065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f143066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f143067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f143068f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f143069g;

        public b() {
            this.f143063a = 0;
            this.f143064b = 0;
            this.f143065c = 0;
            this.f143066d = 0;
            this.f143067e = 0;
            this.f143068f = 0;
            this.f143069g = 0;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }
}
