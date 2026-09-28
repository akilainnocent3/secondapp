package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes.dex */
public final class lh0 {
    public final String a;
    public final mw0<m0> b;
    public final ncy<String> c;
    public final float d;

    public static class a extends c implements l0 {
        public final int d;

        public a(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "9|"));
            this.d = i3;
        }

        @Override // lh0.l0
        public final int a() {
            return this.d;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            g1a0 g1a0Var = mx90Var.c.get(this.d);
            lh4 lh4Var = g1a0Var.b;
            h1a0 h1a0Var = g1a0Var.a;
            if (lh4Var.A) {
                i58 i58Var = g1a0Var.c;
                if (f2 >= this.b[0]) {
                    float fL = l(f2);
                    if (f3 == 1.0f) {
                        i58Var.d = fL;
                        return;
                    }
                    if (kVar == k.a) {
                        i58Var.d = h1a0Var.d.d;
                    }
                    float f4 = i58Var.d;
                    i58Var.d = hxa.a(fL, f4, f3, f4);
                    return;
                }
                i58 i58Var2 = h1a0Var.d;
                int iOrdinal = kVar.ordinal();
                if (iOrdinal == 0) {
                    i58Var.d = i58Var2.d;
                } else {
                    if (iOrdinal != 1) {
                        return;
                    }
                    float f5 = i58Var.d;
                    i58Var.d = hxa.a(i58Var2.d, f5, f3, f5);
                }
            }
        }
    }

    public static class a0 extends e implements l0 {
        public final int d;

        public a0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "8|"), hce0.a(i3, "9|"), hce0.a(i3, "10|"));
            this.d = i3;
        }

        @Override // lh0.l0
        public final int a() {
            return this.d;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fA;
            float fG;
            float fG2;
            float fG3;
            float fG4;
            float fG5;
            float fG6;
            g1a0 g1a0Var = mx90Var.c.get(this.d);
            lh4 lh4Var = g1a0Var.b;
            h1a0 h1a0Var = g1a0Var.a;
            if (lh4Var.A) {
                i58 i58Var = g1a0Var.c;
                i58 i58Var2 = g1a0Var.d;
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    i58 i58Var3 = h1a0Var.d;
                    i58 i58Var4 = h1a0Var.e;
                    int iOrdinal = kVar.ordinal();
                    if (iOrdinal == 0) {
                        i58Var.e(i58Var3);
                        i58Var2.a = i58Var4.a;
                        i58Var2.b = i58Var4.b;
                        i58Var2.c = i58Var4.c;
                        return;
                    }
                    if (iOrdinal != 1) {
                        return;
                    }
                    i58Var.a((i58Var3.a - i58Var.a) * f3, (i58Var3.b - i58Var.b) * f3, (i58Var3.c - i58Var.c) * f3, (i58Var3.d - i58Var.d) * f3);
                    float f4 = i58Var2.a;
                    i58Var2.a = hxa.a(i58Var4.a, f4, f3, f4);
                    float f5 = i58Var2.b;
                    i58Var2.b = hxa.a(i58Var4.b, f5, f3, f5);
                    float f6 = i58Var2.c;
                    i58Var2.c = hxa.a(i58Var4.c, f6, f3, f6);
                    return;
                }
                int iE = m0.e(f2, 8, fArr);
                int i = (int) this.c[iE >> 3];
                if (i == 0) {
                    float f7 = fArr[iE];
                    float f8 = fArr[iE + 1];
                    float f9 = fArr[iE + 2];
                    float f10 = fArr[iE + 3];
                    float f11 = fArr[iE + 4];
                    float f12 = fArr[iE + 5];
                    float f13 = fArr[iE + 6];
                    float f14 = fArr[iE + 7];
                    float f15 = (f2 - f7) / (fArr[iE + 8] - f7);
                    float fA2 = hxa.a(fArr[iE + 9], f8, f15, f8);
                    fA = hxa.a(fArr[iE + 10], f9, f15, f9);
                    float fA3 = hxa.a(fArr[iE + 11], f10, f15, f10);
                    float fA4 = hxa.a(fArr[iE + 12], f11, f15, f11);
                    float fA5 = hxa.a(fArr[iE + 13], f12, f15, f12);
                    float fA6 = hxa.a(fArr[iE + 14], f13, f15, f13);
                    float fA7 = hxa.a(fArr[iE + 15], f14, f15, f14);
                    fG = fA2;
                    fG2 = fA7;
                    fG3 = fA5;
                    fG4 = fA6;
                    fG5 = fA3;
                    fG6 = fA4;
                } else if (i != 1) {
                    fG = g(f2, iE, 1, i - 2);
                    fA = g(f2, iE, 2, i + 16);
                    fG5 = g(f2, iE, 3, i + 34);
                    fG6 = g(f2, iE, 4, i + 52);
                    fG3 = g(f2, iE, 5, i + 70);
                    fG4 = g(f2, iE, 6, i + 88);
                    fG2 = g(f2, iE, 7, i + 106);
                } else {
                    float f16 = fArr[iE + 1];
                    fA = fArr[iE + 2];
                    fG5 = fArr[iE + 3];
                    fG6 = fArr[iE + 4];
                    fG3 = fArr[iE + 5];
                    fG4 = fArr[iE + 6];
                    float f17 = fArr[iE + 7];
                    fG = f16;
                    fG2 = f17;
                }
                if (f3 == 1.0f) {
                    i58Var.a = fG;
                    i58Var.b = fA;
                    i58Var.c = fG5;
                    i58Var.d = fG6;
                    i58Var.b();
                    i58Var2.a = fG3;
                    i58Var2.b = fG4;
                    i58Var2.c = fG2;
                    return;
                }
                if (kVar == k.a) {
                    i58Var.e(h1a0Var.d);
                    i58 i58Var5 = h1a0Var.e;
                    i58Var2.a = i58Var5.a;
                    i58Var2.b = i58Var5.b;
                    i58Var2.c = i58Var5.c;
                }
                i58Var.a((fG - i58Var.a) * f3, (fA - i58Var.b) * f3, (fG5 - i58Var.c) * f3, (fG6 - i58Var.d) * f3);
                float f18 = i58Var2.a;
                i58Var2.a = hxa.a(fG3, f18, f3, f18);
                float f19 = i58Var2.b;
                i58Var2.b = hxa.a(fG4, f19, f3, f19);
                float f20 = i58Var2.c;
                i58Var2.c = hxa.a(fG2, f20, f3, f20);
            }
        }

        @Override // lh0.m0
        public final int d() {
            return 8;
        }

        public final void k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
            int i2 = i << 3;
            float[] fArr = this.b;
            fArr[i2] = f;
            fArr[i2 + 1] = f2;
            fArr[i2 + 2] = f3;
            fArr[i2 + 3] = f4;
            fArr[i2 + 4] = f5;
            fArr[i2 + 5] = f6;
            fArr[i2 + 6] = f7;
            fArr[i2 + 7] = f8;
        }
    }

    public static class b extends m0 implements l0 {
        public final int c;
        public final String[] d;

        public b(int i, int i2) {
            super(new String[]{hce0.a(i2, "11|")}, i);
            this.c = i2;
            this.d = new String[i];
        }

        @Override // lh0.l0
        public final int a() {
            return this.c;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            mw0<g1a0> mw0Var2 = mx90Var.c;
            int i = this.c;
            g1a0 g1a0Var = mw0Var2.get(i);
            lh4 lh4Var = g1a0Var.b;
            h1a0 h1a0Var = g1a0Var.a;
            if (lh4Var.A) {
                l lVar2 = l.b;
                k kVar2 = k.a;
                if (lVar == lVar2) {
                    if (kVar == kVar2) {
                        String str = h1a0Var.f;
                        g1a0Var.a(str != null ? mx90Var.a(i, str) : null);
                        return;
                    }
                    return;
                }
                float[] fArr = this.b;
                if (f2 >= fArr[0]) {
                    String str2 = this.d[m0.f(f2, fArr)];
                    g1a0Var.a(str2 != null ? mx90Var.a(i, str2) : null);
                } else if (kVar == kVar2 || kVar == k.b) {
                    String str3 = h1a0Var.f;
                    g1a0Var.a(str3 != null ? mx90Var.a(i, str3) : null);
                }
            }
        }
    }

    public static class b0 extends e implements l0 {
        public final int d;

        public b0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "8|"), hce0.a(i3, "9|"));
            this.d = i3;
        }

        @Override // lh0.l0
        public final int a() {
            return this.d;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fA;
            float fG;
            float fG2;
            float fG3;
            g1a0 g1a0Var = mx90Var.c.get(this.d);
            lh4 lh4Var = g1a0Var.b;
            h1a0 h1a0Var = g1a0Var.a;
            if (lh4Var.A) {
                i58 i58Var = g1a0Var.c;
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    i58 i58Var2 = h1a0Var.d;
                    int iOrdinal = kVar.ordinal();
                    if (iOrdinal == 0) {
                        i58Var.e(i58Var2);
                        return;
                    } else {
                        if (iOrdinal != 1) {
                            return;
                        }
                        i58Var.a((i58Var2.a - i58Var.a) * f3, (i58Var2.b - i58Var.b) * f3, (i58Var2.c - i58Var.c) * f3, (i58Var2.d - i58Var.d) * f3);
                        return;
                    }
                }
                int iE = m0.e(f2, 5, fArr);
                int i = (int) this.c[iE / 5];
                if (i == 0) {
                    float f4 = fArr[iE];
                    float f5 = fArr[iE + 1];
                    float f6 = fArr[iE + 2];
                    float f7 = fArr[iE + 3];
                    float f8 = fArr[iE + 4];
                    float f9 = (f2 - f4) / (fArr[iE + 5] - f4);
                    float fA2 = hxa.a(fArr[iE + 6], f5, f9, f5);
                    fA = hxa.a(fArr[iE + 7], f6, f9, f6);
                    float fA3 = hxa.a(fArr[iE + 8], f7, f9, f7);
                    float fA4 = hxa.a(fArr[iE + 9], f8, f9, f8);
                    fG = fA2;
                    fG2 = fA4;
                    fG3 = fA3;
                } else if (i != 1) {
                    fG = g(f2, iE, 1, i - 2);
                    fA = g(f2, iE, 2, i + 16);
                    fG3 = g(f2, iE, 3, i + 34);
                    fG2 = g(f2, iE, 4, i + 52);
                } else {
                    float f10 = fArr[iE + 1];
                    fA = fArr[iE + 2];
                    fG3 = fArr[iE + 3];
                    float f11 = fArr[iE + 4];
                    fG = f10;
                    fG2 = f11;
                }
                if (f3 != 1.0f) {
                    if (kVar == k.a) {
                        i58Var.e(h1a0Var.d);
                    }
                    i58Var.a((fG - i58Var.a) * f3, (fA - i58Var.b) * f3, (fG3 - i58Var.c) * f3, (fG2 - i58Var.d) * f3);
                } else {
                    i58Var.a = fG;
                    i58Var.b = fA;
                    i58Var.c = fG3;
                    i58Var.d = fG2;
                    i58Var.b();
                }
            }
        }

        @Override // lh0.m0
        public final int d() {
            return 5;
        }
    }

    public static abstract class c extends e {
        public c(int i, int i2, String str) {
            super(i, i2, str);
        }

        @Override // lh0.m0
        public final int d() {
            return 2;
        }

        public final float k(float f, float f2, k kVar, float f3, float f4) {
            if (f >= this.b[0]) {
                float fL = l(f);
                return kVar == k.a ? hxa.a(fL, f4, f2, f4) : hxa.a(fL, f3, f2, f3);
            }
            int iOrdinal = kVar.ordinal();
            if (iOrdinal != 0) {
                return iOrdinal != 1 ? f3 : hxa.a(f4, f3, f2, f3);
            }
            return f4;
        }

        public final float l(float f) {
            float[] fArr = this.b;
            int length = fArr.length - 2;
            for (int i = 2; i <= length; i += 2) {
                if (fArr[i] > f) {
                    length = i - 2;
                    break;
                }
            }
            int i2 = (int) this.c[length >> 1];
            if (i2 != 0) {
                return i2 != 1 ? g(f, length, 1, i2 - 2) : fArr[length + 1];
            }
            float f2 = fArr[length];
            float f3 = fArr[length + 1];
            return hxa.a(fArr[length + 3], f3, (f - f2) / (fArr[length + 2] - f2), f3);
        }

        public final float m(float f, float f2, k kVar, float f3, float f4) {
            if (f < this.b[0]) {
                int iOrdinal = kVar.ordinal();
                if (iOrdinal != 0) {
                    return iOrdinal != 1 ? f3 : hxa.a(f4, f3, f2, f3);
                }
                return f4;
            }
            float fL = l(f);
            int iOrdinal2 = kVar.ordinal();
            if (iOrdinal2 == 0) {
                return (fL * f2) + f4;
            }
            if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                fL += f4 - f3;
            }
            return (fL * f2) + f3;
        }

        public final float n(float f, float f2, k kVar, l lVar, float f3, float f4) {
            if (f < this.b[0]) {
                int iOrdinal = kVar.ordinal();
                if (iOrdinal != 0) {
                    return iOrdinal != 1 ? f3 : hxa.a(f4, f3, f2, f3);
                }
                return f4;
            }
            float fL = l(f) * f4;
            if (f2 == 1.0f) {
                return kVar == k.d ? (f3 + fL) - f4 : fL;
            }
            if (lVar == l.b) {
                int iOrdinal2 = kVar.ordinal();
                if (iOrdinal2 == 0) {
                    return (((Math.signum(f4) * Math.abs(fL)) - f4) * f2) + f4;
                }
                if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                    return (((Math.signum(f3) * Math.abs(fL)) - f3) * f2) + f3;
                }
            } else {
                int iOrdinal3 = kVar.ordinal();
                if (iOrdinal3 == 0) {
                    float fSignum = Math.signum(fL) * Math.abs(f4);
                    return hxa.a(fL, fSignum, f2, fSignum);
                }
                if (iOrdinal3 == 1 || iOrdinal3 == 2) {
                    float fSignum2 = Math.signum(fL) * Math.abs(f3);
                    return hxa.a(fL, fSignum2, f2, fSignum2);
                }
            }
            return hxa.a(fL, f4, f2, f3);
        }
    }

    public static class c0 extends e implements l0 {
        public final int d;

        public c0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "8|"));
            this.d = i3;
        }

        @Override // lh0.l0
        public final int a() {
            return this.d;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fA;
            float fA2;
            float fA3;
            float fG;
            float fG2;
            g1a0 g1a0Var = mx90Var.c.get(this.d);
            lh4 lh4Var = g1a0Var.b;
            h1a0 h1a0Var = g1a0Var.a;
            if (lh4Var.A) {
                i58 i58Var = g1a0Var.c;
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    i58 i58Var2 = h1a0Var.d;
                    int iOrdinal = kVar.ordinal();
                    if (iOrdinal == 0) {
                        i58Var.a = i58Var2.a;
                        i58Var.b = i58Var2.b;
                        i58Var.c = i58Var2.c;
                        return;
                    } else {
                        if (iOrdinal != 1) {
                            return;
                        }
                        float f4 = i58Var.a;
                        i58Var.a = hxa.a(i58Var2.a, f4, f3, f4);
                        float f5 = i58Var.b;
                        i58Var.b = hxa.a(i58Var2.b, f5, f3, f5);
                        float f6 = i58Var.c;
                        i58Var.c = hxa.a(i58Var2.c, f6, f3, f6);
                        return;
                    }
                }
                int iE = m0.e(f2, 4, fArr);
                int i = (int) this.c[iE >> 2];
                if (i != 0) {
                    if (i != 1) {
                        fG = g(f2, iE, 1, i - 2);
                        fA2 = g(f2, iE, 2, i + 16);
                        fG2 = g(f2, iE, 3, i + 34);
                    } else {
                        fA = fArr[iE + 1];
                        fA2 = fArr[iE + 2];
                        fA3 = fArr[iE + 3];
                    }
                    if (f3 == 1.0f) {
                        i58Var.a = fG;
                        i58Var.b = fA2;
                        i58Var.c = fG2;
                        return;
                    }
                    if (kVar == k.a) {
                        i58 i58Var3 = h1a0Var.d;
                        i58Var.a = i58Var3.a;
                        i58Var.b = i58Var3.b;
                        i58Var.c = i58Var3.c;
                    }
                    float f7 = i58Var.a;
                    i58Var.a = hxa.a(fG, f7, f3, f7);
                    float f8 = i58Var.b;
                    i58Var.b = hxa.a(fA2, f8, f3, f8);
                    float f9 = i58Var.c;
                    i58Var.c = hxa.a(fG2, f9, f3, f9);
                }
                float f10 = fArr[iE];
                float f11 = fArr[iE + 1];
                float f12 = fArr[iE + 2];
                float f13 = fArr[iE + 3];
                float f14 = (f2 - f10) / (fArr[iE + 4] - f10);
                fA = hxa.a(fArr[iE + 5], f11, f14, f11);
                fA2 = hxa.a(fArr[iE + 6], f12, f14, f12);
                fA3 = hxa.a(fArr[iE + 7], f13, f14, f13);
                fG = fA;
                fG2 = fA3;
                if (f3 == 1.0f) {
                    i58Var.a = fG;
                    i58Var.b = fA2;
                    i58Var.c = fG2;
                    return;
                }
                if (kVar == k.a) {
                    i58 i58Var4 = h1a0Var.d;
                    i58Var.a = i58Var4.a;
                    i58Var.b = i58Var4.b;
                    i58Var.c = i58Var4.c;
                }
                float f15 = i58Var.a;
                i58Var.a = hxa.a(fG, f15, f3, f15);
                float f16 = i58Var.b;
                i58Var.b = hxa.a(fA2, f16, f3, f16);
                float f17 = i58Var.c;
                i58Var.c = hxa.a(fG2, f17, f3, f17);
            }
        }

        @Override // lh0.m0
        public final int d() {
            return 4;
        }
    }

    public static abstract class d extends e {
        public d(int i, int i2, String str, String str2) {
            super(i, i2, str, str2);
        }

        @Override // lh0.m0
        public final int d() {
            return 3;
        }
    }

    public static class d0 extends c {
        public final int d;

        public d0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "0|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            lh4 lh4Var = mx90Var.b.get(this.d);
            if (lh4Var.A) {
                lh4Var.g = m(f2, f3, kVar, lh4Var.g, lh4Var.a.g);
            }
        }
    }

    public static abstract class e extends m0 {
        public float[] c;

        public e(int i, int i2, String... strArr) {
            super(strArr, i);
            float[] fArr = new float[(i2 * 18) + i];
            this.c = fArr;
            fArr[i - 1] = 1.0f;
        }

        public final float g(float f, int i, int i2, int i3) {
            float[] fArr = this.c;
            float f2 = fArr[i3];
            float[] fArr2 = this.b;
            if (f2 > f) {
                float f3 = fArr2[i];
                float f4 = fArr2[i + i2];
                return hxa.a(fArr[i3 + 1], f4, (f - f3) / (f2 - f3), f4);
            }
            int i4 = i3 + 18;
            for (int i5 = i3 + 2; i5 < i4; i5 += 2) {
                float f5 = fArr[i5];
                if (f5 >= f) {
                    float f6 = fArr[i5 - 2];
                    float f7 = fArr[i5 - 1];
                    return hxa.a(fArr[i5 + 1], f7, (f - f6) / (f5 - f6), f7);
                }
            }
            int iD = d() + i;
            float f8 = fArr[i3 + 16];
            float f9 = fArr[i3 + 17];
            return hxa.a(fArr2[iD + i2], f9, (f - f8) / (fArr2[iD] - f8), f9);
        }

        public void h(int i, int i2, int i3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float[] fArr = this.c;
            int iC = (i * 18) + c();
            if (i3 == 0) {
                fArr[i2] = iC + 2;
            }
            float f9 = ((f - (f3 * 2.0f)) + f5) * 0.03f;
            float f10 = ((f2 - (f4 * 2.0f)) + f6) * 0.03f;
            float f11 = ((((f3 - f5) * 3.0f) - f) + f7) * 0.006f;
            float f12 = ((((f4 - f6) * 3.0f) - f2) + f8) * 0.006f;
            float f13 = (f9 * 2.0f) + f11;
            float f14 = (2.0f * f10) + f12;
            float fA = (f11 * 0.16666667f) + hxa.a(f3, f, 0.3f, f9);
            float fA2 = (0.16666667f * f12) + hxa.a(f4, f2, 0.3f, f10);
            float f15 = f + fA;
            float f16 = f2 + fA2;
            int i4 = iC + 18;
            while (iC < i4) {
                fArr[iC] = f15;
                fArr[iC + 1] = f16;
                fA += f13;
                fA2 += f14;
                f13 += f11;
                f14 += f12;
                f15 += fA;
                f16 += fA2;
                iC += 2;
            }
        }

        public final void i(int i) {
            this.c[i] = 1.0f;
        }

        public final void j(int i) {
            int iC = (i * 18) + c();
            float[] fArr = this.c;
            if (fArr.length > iC) {
                float[] fArr2 = new float[iC];
                tpf.a(fArr, 0, iC, fArr2);
                this.c = fArr2;
            }
        }
    }

    public static class e0 extends d {
        public final int d;

        public e0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "3|"), hce0.a(i3, "4|"));
            this.d = i3;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x009a  */
        /* JADX WARN: Code duplicated, block: B:26:0x009e  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:44:0x0118  */
        /* JADX WARN: Code duplicated, block: B:46:0x011e  */
        /* JADX WARN: Code duplicated, block: B:54:0x015d  */
        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fA;
            float fA2;
            float fG;
            float fG2;
            float f4;
            float f5;
            float f6;
            float f7;
            int iOrdinal;
            int iOrdinal2;
            lh4 lh4Var = mx90Var.b.get(this.d);
            boolean z = lh4Var.A;
            mh4 mh4Var = lh4Var.a;
            if (z) {
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    int iOrdinal3 = kVar.ordinal();
                    if (iOrdinal3 == 0) {
                        lh4Var.h = mh4Var.h;
                        lh4Var.i = mh4Var.i;
                        return;
                    } else {
                        if (iOrdinal3 != 1) {
                            return;
                        }
                        float f8 = lh4Var.h;
                        lh4Var.h = hxa.a(mh4Var.h, f8, f3, f8);
                        float f9 = lh4Var.i;
                        lh4Var.i = hxa.a(mh4Var.i, f9, f3, f9);
                        return;
                    }
                }
                int iE = m0.e(f2, 3, fArr);
                int i = (int) this.c[iE / 3];
                if (i != 0) {
                    if (i != 1) {
                        fG = g(f2, iE, 1, i - 2);
                        fG2 = g(f2, iE, 2, i + 16);
                    } else {
                        fA = fArr[iE + 1];
                        fA2 = fArr[iE + 2];
                    }
                    f4 = mh4Var.h;
                    f5 = fG * f4;
                    f6 = mh4Var.i;
                    f7 = fG2 * f6;
                    if (f3 == 1.0f) {
                        if (kVar == k.d) {
                            lh4Var.h = f5;
                            lh4Var.i = f7;
                            return;
                        } else {
                            lh4Var.h = (f5 - f4) + lh4Var.h;
                            lh4Var.i = (f7 - f6) + lh4Var.i;
                            return;
                        }
                    }
                    if (lVar == l.b) {
                        iOrdinal2 = kVar.ordinal();
                        if (iOrdinal2 != 0) {
                            float f10 = mh4Var.h;
                            float f11 = mh4Var.i;
                            lh4Var.h = (((Math.signum(f10) * Math.abs(f5)) - f10) * f3) + f10;
                            lh4Var.i = (((Math.signum(f11) * Math.abs(f7)) - f11) * f3) + f11;
                            return;
                        }
                        if (iOrdinal2 != 1 || iOrdinal2 == 2) {
                            float f12 = lh4Var.h;
                            float f13 = lh4Var.i;
                            lh4Var.h = (((Math.signum(f12) * Math.abs(f5)) - f12) * f3) + f12;
                            lh4Var.i = (((Math.signum(f13) * Math.abs(f7)) - f13) * f3) + f13;
                            return;
                        }
                        if (iOrdinal2 != 3) {
                            return;
                        }
                        lh4Var.h = hxa.a(f5, mh4Var.h, f3, lh4Var.h);
                        lh4Var.i = hxa.a(f7, mh4Var.i, f3, lh4Var.i);
                        return;
                    }
                    iOrdinal = kVar.ordinal();
                    if (iOrdinal != 0) {
                        float fSignum = Math.signum(f5) * Math.abs(mh4Var.h);
                        float fSignum2 = Math.signum(f7) * Math.abs(mh4Var.i);
                        lh4Var.h = hxa.a(f5, fSignum, f3, fSignum);
                        lh4Var.i = hxa.a(f7, fSignum2, f3, fSignum2);
                        return;
                    }
                    if (iOrdinal != 1 || iOrdinal == 2) {
                        float fSignum3 = Math.signum(f5) * Math.abs(lh4Var.h);
                        float fSignum4 = Math.signum(f7) * Math.abs(lh4Var.i);
                        lh4Var.h = hxa.a(f5, fSignum3, f3, fSignum3);
                        lh4Var.i = hxa.a(f7, fSignum4, f3, fSignum4);
                    }
                    if (iOrdinal != 3) {
                        return;
                    }
                    lh4Var.h = hxa.a(f5, mh4Var.h, f3, lh4Var.h);
                    lh4Var.i = hxa.a(f7, mh4Var.i, f3, lh4Var.i);
                    return;
                }
                float f14 = fArr[iE];
                float f15 = fArr[iE + 1];
                float f16 = fArr[iE + 2];
                float f17 = (f2 - f14) / (fArr[iE + 3] - f14);
                fA = hxa.a(fArr[iE + 4], f15, f17, f15);
                fA2 = hxa.a(fArr[iE + 5], f16, f17, f16);
                fG = fA;
                fG2 = fA2;
                f4 = mh4Var.h;
                f5 = fG * f4;
                f6 = mh4Var.i;
                f7 = fG2 * f6;
                if (f3 == 1.0f) {
                    if (kVar == k.d) {
                        lh4Var.h = f5;
                        lh4Var.i = f7;
                        return;
                    } else {
                        lh4Var.h = (f5 - f4) + lh4Var.h;
                        lh4Var.i = (f7 - f6) + lh4Var.i;
                        return;
                    }
                }
                if (lVar == l.b) {
                    iOrdinal2 = kVar.ordinal();
                    if (iOrdinal2 != 0) {
                        float f18 = mh4Var.h;
                        float f19 = mh4Var.i;
                        lh4Var.h = (((Math.signum(f18) * Math.abs(f5)) - f18) * f3) + f18;
                        lh4Var.i = (((Math.signum(f19) * Math.abs(f7)) - f19) * f3) + f19;
                        return;
                    }
                    if (iOrdinal2 != 1) {
                    }
                    float f110 = lh4Var.h;
                    float f111 = lh4Var.i;
                    lh4Var.h = (((Math.signum(f110) * Math.abs(f5)) - f110) * f3) + f110;
                    lh4Var.i = (((Math.signum(f111) * Math.abs(f7)) - f111) * f3) + f111;
                    return;
                }
                iOrdinal = kVar.ordinal();
                if (iOrdinal != 0) {
                    float fSignum5 = Math.signum(f5) * Math.abs(mh4Var.h);
                    float fSignum6 = Math.signum(f7) * Math.abs(mh4Var.i);
                    lh4Var.h = hxa.a(f5, fSignum5, f3, fSignum5);
                    lh4Var.i = hxa.a(f7, fSignum6, f3, fSignum6);
                    return;
                }
                if (iOrdinal != 1) {
                }
                float fSignum7 = Math.signum(f5) * Math.abs(lh4Var.h);
                float fSignum8 = Math.signum(f7) * Math.abs(lh4Var.i);
                lh4Var.h = hxa.a(f5, fSignum7, f3, fSignum7);
                lh4Var.i = hxa.a(f7, fSignum8, f3, fSignum8);
            }
        }
    }

    public static class f extends e implements l0 {
        public final int d;
        public final r2i0 e;
        public final float[][] f;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(int i, int i2, int i3, r2i0 r2i0Var) {
            StringBuilder sbA = efe0.a(i3, "12|", "|");
            sbA.append(r2i0Var.c);
            super(i, i2, sbA.toString());
            this.d = i3;
            this.e = r2i0Var;
            this.f = new float[i][];
        }

        @Override // lh0.l0
        public final int a() {
            return this.d;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float f4;
            float fA;
            g1a0 g1a0Var = mx90Var.c.get(this.d);
            if (g1a0Var.b.A) {
                b21 b21Var = g1a0Var.e;
                if (b21Var instanceof r2i0) {
                    r2i0 r2i0Var = (r2i0) b21Var;
                    if (r2i0Var.d != this.e) {
                        return;
                    }
                    owh owhVar = g1a0Var.g;
                    k kVar2 = owhVar.b == 0 ? k.a : kVar;
                    float[][] fArr = this.f;
                    int i = 0;
                    int length = fArr[0].length;
                    float[] fArr2 = this.b;
                    if (f2 < fArr2[0]) {
                        int iOrdinal = kVar2.ordinal();
                        if (iOrdinal == 0) {
                            owhVar.b = 0;
                            return;
                        }
                        if (iOrdinal != 1) {
                            return;
                        }
                        if (f3 == 1.0f) {
                            owhVar.b = 0;
                            return;
                        }
                        float[] fArrD = owhVar.d(length);
                        if (r2i0Var.e != null) {
                            float f5 = 1.0f - f3;
                            while (i < length) {
                                fArrD[i] = fArrD[i] * f5;
                                i++;
                            }
                            return;
                        }
                        float[] fArr3 = r2i0Var.f;
                        while (i < length) {
                            float f6 = fArrD[i];
                            fArrD[i] = hxa.a(fArr3[i], f6, f3, f6);
                            i++;
                        }
                        return;
                    }
                    float[] fArrD2 = owhVar.d(length);
                    float f7 = fArr2[fArr2.length - 1];
                    k kVar3 = k.d;
                    if (f2 >= f7) {
                        float[] fArr4 = fArr[fArr2.length - 1];
                        if (f3 == 1.0f) {
                            if (kVar2 != kVar3) {
                                tpf.a(fArr4, 0, length, fArrD2);
                                return;
                            }
                            if (r2i0Var.e != null) {
                                while (i < length) {
                                    fArrD2[i] = fArrD2[i] + fArr4[i];
                                    i++;
                                }
                                return;
                            } else {
                                float[] fArr5 = r2i0Var.f;
                                while (i < length) {
                                    fArrD2[i] = (fArr4[i] - fArr5[i]) + fArrD2[i];
                                    i++;
                                }
                                return;
                            }
                        }
                        int iOrdinal2 = kVar2.ordinal();
                        if (iOrdinal2 == 0) {
                            if (r2i0Var.e != null) {
                                while (i < length) {
                                    fArrD2[i] = fArr4[i] * f3;
                                    i++;
                                }
                                return;
                            } else {
                                float[] fArr6 = r2i0Var.f;
                                while (i < length) {
                                    float f8 = fArr6[i];
                                    fArrD2[i] = hxa.a(fArr4[i], f8, f3, f8);
                                    i++;
                                }
                                return;
                            }
                        }
                        if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                            while (i < length) {
                                float f9 = fArrD2[i];
                                fArrD2[i] = hxa.a(fArr4[i], f9, f3, f9);
                                i++;
                            }
                            return;
                        }
                        if (iOrdinal2 != 3) {
                            return;
                        }
                        if (r2i0Var.e != null) {
                            while (i < length) {
                                fArrD2[i] = (fArr4[i] * f3) + fArrD2[i];
                                i++;
                            }
                            return;
                        } else {
                            float[] fArr7 = r2i0Var.f;
                            while (i < length) {
                                fArrD2[i] = hxa.a(fArr4[i], fArr7[i], f3, fArrD2[i]);
                                i++;
                            }
                            return;
                        }
                    }
                    int iF = m0.f(f2, fArr2);
                    float[] fArr8 = this.c;
                    int i2 = (int) fArr8[iF];
                    if (i2 == 0) {
                        f4 = 1.0f;
                        float f10 = fArr2[iF];
                        fA = (f2 - f10) / (fArr2[iF + 1] - f10);
                    } else if (i2 != 1) {
                        float f11 = fArr8[i2 - 2];
                        if (f11 <= f2) {
                            f4 = 1.0f;
                            int i3 = i2 + 16;
                            int i4 = i2;
                            while (true) {
                                if (i4 >= i3) {
                                    float f12 = fArr8[i2 + 14];
                                    float f13 = fArr8[i2 + 15];
                                    fA = (((f2 - f12) * (1.0f - f13)) / (fArr2[iF + 1] - f12)) + f13;
                                    break;
                                } else {
                                    float f14 = fArr8[i4];
                                    if (f14 >= f2) {
                                        float f15 = fArr8[i4 - 2];
                                        float f16 = fArr8[i4 - 1];
                                        fA = hxa.a(fArr8[i4 + 1], f16, (f2 - f15) / (f14 - f15), f16);
                                        break;
                                    }
                                    i4 += 2;
                                }
                            }
                        } else {
                            float f17 = fArr2[iF];
                            fA = ((f2 - f17) * fArr8[i2 - 1]) / (f11 - f17);
                            f4 = 1.0f;
                        }
                    } else {
                        f4 = 1.0f;
                        fA = 0.0f;
                    }
                    float[] fArr9 = fArr[iF];
                    float[] fArr10 = fArr[iF + 1];
                    if (f3 == f4) {
                        if (kVar2 != kVar3) {
                            for (int i5 = 0; i5 < length; i5++) {
                                float f18 = fArr9[i5];
                                fArrD2[i5] = hxa.a(fArr10[i5], f18, fA, f18);
                            }
                            return;
                        }
                        if (r2i0Var.e != null) {
                            for (int i6 = 0; i6 < length; i6++) {
                                float f19 = fArr9[i6];
                                fArrD2[i6] = ((fArr10[i6] - f19) * fA) + f19 + fArrD2[i6];
                            }
                            return;
                        }
                        float[] fArr11 = r2i0Var.f;
                        for (int i7 = 0; i7 < length; i7++) {
                            float f20 = fArr9[i7];
                            fArrD2[i7] = (hxa.a(fArr10[i7], f20, fA, f20) - fArr11[i7]) + fArrD2[i7];
                        }
                        return;
                    }
                    int iOrdinal3 = kVar2.ordinal();
                    if (iOrdinal3 == 0) {
                        if (r2i0Var.e != null) {
                            for (int i8 = 0; i8 < length; i8++) {
                                float f21 = fArr9[i8];
                                fArrD2[i8] = (((fArr10[i8] - f21) * fA) + f21) * f3;
                            }
                            return;
                        }
                        float[] fArr12 = r2i0Var.f;
                        for (int i9 = 0; i9 < length; i9++) {
                            float f22 = fArr9[i9];
                            float f23 = fArr12[i9];
                            fArrD2[i9] = (((((fArr10[i9] - f22) * fA) + f22) - f23) * f3) + f23;
                        }
                        return;
                    }
                    if (iOrdinal3 == 1 || iOrdinal3 == 2) {
                        for (int i10 = 0; i10 < length; i10++) {
                            float f24 = fArr9[i10];
                            float f25 = fArrD2[i10];
                            fArrD2[i10] = (((((fArr10[i10] - f24) * fA) + f24) - f25) * f3) + f25;
                        }
                        return;
                    }
                    if (iOrdinal3 != 3) {
                        return;
                    }
                    if (r2i0Var.e != null) {
                        for (int i11 = 0; i11 < length; i11++) {
                            float f26 = fArr9[i11];
                            fArrD2[i11] = ((((fArr10[i11] - f26) * fA) + f26) * f3) + fArrD2[i11];
                        }
                        return;
                    }
                    float[] fArr13 = r2i0Var.f;
                    for (int i12 = 0; i12 < length; i12++) {
                        float f27 = fArr9[i12];
                        fArrD2[i12] = hxa.a(hxa.a(fArr10[i12], f27, fA, f27), fArr13[i12], f3, fArrD2[i12]);
                    }
                }
            }
        }

        @Override // lh0.m0
        public final int c() {
            return this.b.length;
        }

        @Override // lh0.e
        public final void h(int i, int i2, int i3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float[] fArr = this.c;
            int length = (i * 18) + this.b.length;
            if (i3 == 0) {
                fArr[i2] = length + 2;
            }
            float f9 = ((f - (f3 * 2.0f)) + f5) * 0.03f;
            float f10 = (0.03f * f6) - (0.06f * f4);
            float f11 = ((((f3 - f5) * 3.0f) - f) + f7) * 0.006f;
            float f12 = ((f4 - f6) + 0.33333334f) * 0.018f;
            float f13 = (f9 * 2.0f) + f11;
            float f14 = (2.0f * f10) + f12;
            float fA = (f11 * 0.16666667f) + hxa.a(f3, f, 0.3f, f9);
            float f15 = (0.16666667f * f12) + (f4 * 0.3f) + f10;
            float f16 = f + fA;
            int i4 = length + 18;
            float f17 = f15;
            while (length < i4) {
                fArr[length] = f16;
                fArr[length + 1] = f15;
                fA += f13;
                f17 += f14;
                f13 += f11;
                f14 += f12;
                f16 += fA;
                f15 += f17;
                length += 2;
            }
        }
    }

    public static class f0 extends c {
        public final int d;

        public f0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "3|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            lh4 lh4Var = mx90Var.b.get(this.d);
            if (lh4Var.A) {
                lh4Var.h = n(f2, f3, kVar, lVar, lh4Var.h, lh4Var.a.h);
            }
        }
    }

    public static class g extends m0 {
        public static final String[] d = {Integer.toString(14)};
        public final int[][] c;

        public g(int i) {
            super(d, i);
            this.c = new int[i][];
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            mw0<g1a0> mw0Var2 = mx90Var.c;
            mw0<g1a0> mw0Var3 = mx90Var.d;
            l lVar2 = l.b;
            k kVar2 = k.a;
            if (lVar == lVar2) {
                if (kVar == kVar2) {
                    tpf.a(mw0Var2.a, 0, mw0Var2.b, mw0Var3.a);
                    return;
                }
                return;
            }
            float[] fArr = this.b;
            if (f2 < fArr[0]) {
                if (kVar == kVar2 || kVar == k.b) {
                    tpf.a(mw0Var2.a, 0, mw0Var2.b, mw0Var3.a);
                    return;
                }
                return;
            }
            int[] iArr = this.c[m0.f(f2, fArr)];
            if (iArr == null) {
                tpf.a(mw0Var2.a, 0, mw0Var2.b, mw0Var3.a);
            } else {
                g1a0[] g1a0VarArr = mw0Var2.a;
                g1a0[] g1a0VarArr2 = mw0Var3.a;
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    g1a0VarArr2[i] = g1a0VarArr[iArr[i]];
                }
            }
        }
    }

    public static class g0 extends c {
        public final int d;

        public g0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "4|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            lh4 lh4Var = mx90Var.b.get(this.d);
            if (lh4Var.A) {
                lh4Var.i = n(f2, f3, kVar, lVar, lh4Var.i, lh4Var.a.i);
            }
        }
    }

    public static class h extends m0 {
        public static final String[] d = {Integer.toString(13)};
        public final whg[] c;

        public h(int i) {
            super(d, i);
            this.c = new whg[i];
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float f4;
            if (mw0Var == null) {
                return;
            }
            float[] fArr = this.b;
            int length = fArr.length;
            if (f > f2) {
                b(mx90Var, f, 2.1474836E9f, mw0Var, f3, kVar, lVar);
                f4 = -1.0f;
            } else if (f >= fArr[length - 1]) {
                return;
            } else {
                f4 = f;
            }
            int i = 0;
            float f5 = fArr[0];
            if (f2 < f5) {
                return;
            }
            if (f4 >= f5) {
                int iF = m0.f(f4, fArr) + 1;
                float f6 = fArr[iF];
                while (iF > 0 && fArr[iF - 1] == f6) {
                    iF--;
                }
                i = iF;
            }
            while (i < length && f2 >= fArr[i]) {
                mw0Var.a(this.c[i]);
                i++;
            }
        }
    }

    public static class h0 extends m0 implements l0 {
        public final int c;
        public final jel d;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public h0(int i, int i2, b21 b21Var) {
            StringBuilder sbA = efe0.a(i2, "28|", "|");
            jel jelVar = (jel) b21Var;
            sbA.append(jelVar.a().a);
            super(new String[]{sbA.toString()}, i);
            this.c = i2;
            this.d = jelVar;
        }

        @Override // lh0.l0
        public final int a() {
            return this.c;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x008a A[PHI: r1 r5
          0x008a: PHI (r1v8 int) = (r1v6 int), (r1v10 int) binds: [B:47:0x00a6, B:38:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r5v7 int) = (r5v4 int), (r5v8 int) binds: [B:47:0x00a6, B:38:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x008d A[PHI: r5
          0x008d: PHI (r5v6 int) = (r5v4 int), (r5v8 int) binds: [B:47:0x00a6, B:38:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            uc80 uc80VarA;
            int i;
            int i2;
            g1a0 g1a0Var = mx90Var.c.get(this.c);
            if (g1a0Var.b.A) {
                Object obj = g1a0Var.e;
                Object obj2 = this.d;
                if ((obj == obj2 || ((obj instanceof r2i0) && ((r2i0) obj).d == obj2)) && (uc80VarA = ((jel) obj).a()) != null) {
                    l lVar2 = l.b;
                    k kVar2 = k.a;
                    if (lVar == lVar2) {
                        if (kVar == kVar2) {
                            g1a0Var.f = -1;
                            return;
                        }
                        return;
                    }
                    float[] fArr = this.b;
                    if (f2 < fArr[0]) {
                        if (kVar == kVar2 || kVar == k.b) {
                            g1a0Var.f = -1;
                            return;
                        }
                        return;
                    }
                    int iE = m0.e(f2, 3, fArr);
                    float f4 = fArr[iE];
                    int i3 = (int) fArr[iE + 1];
                    float f5 = fArr[iE + 2];
                    int iMin = i3 >> 4;
                    int length = uc80VarA.b.length;
                    uc80.a aVar = uc80.a.b[i3 & 15];
                    if (aVar != uc80.a.a) {
                        iMin = (int) (((f2 - f4) / f5) + 1.0E-4f + iMin);
                        switch (aVar.ordinal()) {
                            case 1:
                                iMin = Math.min(length - 1, iMin);
                                break;
                            case 2:
                                iMin %= length;
                                break;
                            case 3:
                                i = (length << 1) - 2;
                                i2 = i != 0 ? iMin % i : 0;
                                if (i2 < length) {
                                    iMin = i2;
                                } else {
                                    iMin = i - i2;
                                }
                                break;
                            case 4:
                                iMin = Math.max((length - 1) - iMin, 0);
                                break;
                            case 5:
                                iMin = (length - 1) - (iMin % length);
                                break;
                            case 6:
                                i = (length << 1) - 2;
                                i2 = i != 0 ? ((iMin + length) - 1) % i : 0;
                                if (i2 < length) {
                                    iMin = i2;
                                } else {
                                    iMin = i - i2;
                                }
                                break;
                        }
                    }
                    g1a0Var.f = iMin;
                }
            }
        }

        @Override // lh0.m0
        public final int d() {
            return 3;
        }
    }

    public static class i extends e {
        public final int d;

        public i(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "15|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fG;
            float fG2;
            p7n p7nVar = mx90Var.e.get(this.d);
            boolean z = p7nVar.i;
            q7n q7nVar = p7nVar.a;
            if (z) {
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    int iOrdinal = kVar.ordinal();
                    if (iOrdinal == 0) {
                        p7nVar.g = q7nVar.j;
                        p7nVar.h = q7nVar.k;
                        p7nVar.d = q7nVar.f;
                        p7nVar.e = q7nVar.g;
                        p7nVar.f = q7nVar.h;
                        return;
                    }
                    if (iOrdinal != 1) {
                        return;
                    }
                    float f4 = p7nVar.g;
                    p7nVar.g = hxa.a(q7nVar.j, f4, f3, f4);
                    float f5 = p7nVar.h;
                    p7nVar.h = hxa.a(q7nVar.k, f5, f3, f5);
                    p7nVar.d = q7nVar.f;
                    p7nVar.e = q7nVar.g;
                    p7nVar.f = q7nVar.h;
                    return;
                }
                int iE = m0.e(f2, 6, fArr);
                int i = (int) this.c[iE / 6];
                if (i == 0) {
                    float f6 = fArr[iE];
                    float f7 = fArr[iE + 1];
                    float f8 = fArr[iE + 2];
                    float f9 = (f2 - f6) / (fArr[iE + 6] - f6);
                    float fA = hxa.a(fArr[iE + 7], f7, f9, f7);
                    float fA2 = hxa.a(fArr[iE + 8], f8, f9, f8);
                    fG = fA;
                    fG2 = fA2;
                } else if (i != 1) {
                    fG = g(f2, iE, 1, i - 2);
                    fG2 = g(f2, iE, 2, i + 16);
                } else {
                    fG = fArr[iE + 1];
                    fG2 = fArr[iE + 2];
                }
                if (kVar != k.a) {
                    float f10 = p7nVar.g;
                    p7nVar.g = hxa.a(fG, f10, f3, f10);
                    float f11 = p7nVar.h;
                    p7nVar.h = hxa.a(fG2, f11, f3, f11);
                    if (lVar == l.a) {
                        p7nVar.d = (int) fArr[iE + 3];
                        p7nVar.e = fArr[iE + 4] != 0.0f;
                        p7nVar.f = fArr[iE + 5] != 0.0f;
                        return;
                    }
                    return;
                }
                float f12 = q7nVar.j;
                p7nVar.g = hxa.a(fG, f12, f3, f12);
                float f13 = q7nVar.k;
                p7nVar.h = hxa.a(fG2, f13, f3, f13);
                if (lVar == l.b) {
                    p7nVar.d = q7nVar.f;
                    p7nVar.e = q7nVar.g;
                    p7nVar.f = q7nVar.h;
                } else {
                    p7nVar.d = (int) fArr[iE + 3];
                    p7nVar.e = fArr[iE + 4] != 0.0f;
                    p7nVar.f = fArr[iE + 5] != 0.0f;
                }
            }
        }

        @Override // lh0.m0
        public final int d() {
            return 6;
        }

        public final void k(int i, float f, float f2, float f3, int i2, boolean z, boolean z2) {
            int i3 = i * 6;
            float[] fArr = this.b;
            fArr[i3] = f;
            fArr[i3 + 1] = f2;
            fArr[i3 + 2] = f3;
            fArr[i3 + 3] = i2;
            fArr[i3 + 4] = z ? 1.0f : 0.0f;
            fArr[i3 + 5] = z2 ? 1.0f : 0.0f;
        }
    }

    public static class i0 extends d {
        public final int d;

        public i0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "5|"), hce0.a(i3, "6|"));
            this.d = i3;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0094  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fA;
            float fA2;
            float fG;
            float fG2;
            int iOrdinal;
            lh4 lh4Var = mx90Var.b.get(this.d);
            boolean z = lh4Var.A;
            mh4 mh4Var = lh4Var.a;
            if (z) {
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    int iOrdinal2 = kVar.ordinal();
                    if (iOrdinal2 == 0) {
                        lh4Var.j = mh4Var.j;
                        lh4Var.k = mh4Var.k;
                        return;
                    } else {
                        if (iOrdinal2 != 1) {
                            return;
                        }
                        float f4 = lh4Var.j;
                        lh4Var.j = hxa.a(mh4Var.j, f4, f3, f4);
                        float f5 = lh4Var.k;
                        lh4Var.k = hxa.a(mh4Var.k, f5, f3, f5);
                        return;
                    }
                }
                int iE = m0.e(f2, 3, fArr);
                int i = (int) this.c[iE / 3];
                if (i != 0) {
                    if (i != 1) {
                        fG = g(f2, iE, 1, i - 2);
                        fG2 = g(f2, iE, 2, i + 16);
                    } else {
                        fA = fArr[iE + 1];
                        fA2 = fArr[iE + 2];
                    }
                    iOrdinal = kVar.ordinal();
                    if (iOrdinal != 0) {
                        lh4Var.j = (fG * f3) + mh4Var.j;
                        lh4Var.k = (fG2 * f3) + mh4Var.k;
                        return;
                    }
                    if (iOrdinal != 1 || iOrdinal == 2) {
                        float f6 = lh4Var.j;
                        lh4Var.j = (((mh4Var.j + fG) - f6) * f3) + f6;
                        float f7 = lh4Var.k;
                        lh4Var.k = (((mh4Var.k + fG2) - f7) * f3) + f7;
                    }
                    if (iOrdinal != 3) {
                        return;
                    }
                    lh4Var.j = (fG * f3) + lh4Var.j;
                    lh4Var.k = (fG2 * f3) + lh4Var.k;
                    return;
                }
                float f8 = fArr[iE];
                float f9 = fArr[iE + 1];
                float f10 = fArr[iE + 2];
                float f11 = (f2 - f8) / (fArr[iE + 3] - f8);
                fA = hxa.a(fArr[iE + 4], f9, f11, f9);
                fA2 = hxa.a(fArr[iE + 5], f10, f11, f10);
                fG = fA;
                fG2 = fA2;
                iOrdinal = kVar.ordinal();
                if (iOrdinal != 0) {
                    lh4Var.j = (fG * f3) + mh4Var.j;
                    lh4Var.k = (fG2 * f3) + mh4Var.k;
                    return;
                }
                if (iOrdinal != 1) {
                }
                float f12 = lh4Var.j;
                lh4Var.j = (((mh4Var.j + fG) - f12) * f3) + f12;
                float f13 = lh4Var.k;
                lh4Var.k = (((mh4Var.k + fG2) - f13) * f3) + f13;
            }
        }
    }

    public static class j extends m0 {
        public final int c;

        public j(int i, int i2) {
            super(new String[]{hce0.a(i2, "7|")}, i);
            this.c = i2;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            lh4 lh4Var = mx90Var.b.get(this.c);
            boolean z = lh4Var.A;
            mh4 mh4Var = lh4Var.a;
            if (z) {
                l lVar2 = l.b;
                k kVar2 = k.a;
                if (lVar == lVar2) {
                    if (kVar == kVar2) {
                        lh4Var.y = mh4Var.l;
                        return;
                    }
                    return;
                }
                float[] fArr = this.b;
                if (f2 >= fArr[0]) {
                    lh4Var.y = mh4.a.d[(int) fArr[m0.e(f2, 2, fArr) + 1]];
                } else if (kVar == kVar2 || kVar == k.b) {
                    lh4Var.y = mh4Var.l;
                }
            }
        }

        @Override // lh0.m0
        public final int d() {
            return 2;
        }
    }

    public static class j0 extends c {
        public final int d;

        public j0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "5|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            lh4 lh4Var = mx90Var.b.get(this.d);
            if (lh4Var.A) {
                lh4Var.j = m(f2, f3, kVar, lh4Var.j, lh4Var.a.j);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class k {
        public static final k a;
        public static final k b;
        public static final k c;
        public static final k d;
        public static final /* synthetic */ k[] e;

        static {
            k kVar = new k("setup", 0);
            a = kVar;
            k kVar2 = new k("first", 1);
            b = kVar2;
            k kVar3 = new k("replace", 2);
            c = kVar3;
            k kVar4 = new k("add", 3);
            d = kVar4;
            e = new k[]{kVar, kVar2, kVar3, kVar4};
        }

        public k() {
            throw null;
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) e.clone();
        }
    }

    public static class k0 extends c {
        public final int d;

        public k0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "6|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            lh4 lh4Var = mx90Var.b.get(this.d);
            if (lh4Var.A) {
                lh4Var.k = m(f2, f3, kVar, lh4Var.k, lh4Var.a.k);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class l {
        public static final l a;
        public static final l b;
        public static final /* synthetic */ l[] c;

        static {
            l lVar = new l("in", 0);
            a = lVar;
            l lVar2 = new l("out", 1);
            b = lVar2;
            c = new l[]{lVar, lVar2};
        }

        public l() {
            throw null;
        }

        public static l valueOf(String str) {
            return (l) Enum.valueOf(l.class, str);
        }

        public static l[] values() {
            return (l[]) c.clone();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public interface l0 {
        int a();
    }

    public static class m extends e {
        public final int d;

        public m(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "19|"));
            this.d = i3;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fA;
            float fA2;
            float fA3;
            float fG;
            float fG2;
            hxz hxzVar = mx90Var.g.get(this.d);
            boolean z = hxzVar.i;
            ixz ixzVar = hxzVar.a;
            if (z) {
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    int iOrdinal = kVar.ordinal();
                    if (iOrdinal == 0) {
                        hxzVar.f = ixzVar.l;
                        hxzVar.g = ixzVar.m;
                        hxzVar.h = ixzVar.n;
                        return;
                    } else {
                        if (iOrdinal != 1) {
                            return;
                        }
                        float f4 = hxzVar.f;
                        hxzVar.f = hxa.a(ixzVar.l, f4, f3, f4);
                        float f5 = hxzVar.g;
                        hxzVar.g = hxa.a(ixzVar.m, f5, f3, f5);
                        float f6 = hxzVar.h;
                        hxzVar.h = hxa.a(ixzVar.n, f6, f3, f6);
                        return;
                    }
                }
                int iE = m0.e(f2, 4, fArr);
                int i = (int) this.c[iE >> 2];
                if (i != 0) {
                    if (i != 1) {
                        fG = g(f2, iE, 1, i - 2);
                        fA2 = g(f2, iE, 2, i + 16);
                        fG2 = g(f2, iE, 3, i + 34);
                    } else {
                        fA = fArr[iE + 1];
                        fA2 = fArr[iE + 2];
                        fA3 = fArr[iE + 3];
                    }
                    if (kVar == k.a) {
                        float f7 = ixzVar.l;
                        hxzVar.f = hxa.a(fG, f7, f3, f7);
                        float f8 = ixzVar.m;
                        hxzVar.g = hxa.a(fA2, f8, f3, f8);
                        float f9 = ixzVar.n;
                        hxzVar.h = hxa.a(fG2, f9, f3, f9);
                        return;
                    }
                    float f10 = hxzVar.f;
                    hxzVar.f = hxa.a(fG, f10, f3, f10);
                    float f11 = hxzVar.g;
                    hxzVar.g = hxa.a(fA2, f11, f3, f11);
                    float f12 = hxzVar.h;
                    hxzVar.h = hxa.a(fG2, f12, f3, f12);
                }
                float f13 = fArr[iE];
                float f14 = fArr[iE + 1];
                float f15 = fArr[iE + 2];
                float f16 = fArr[iE + 3];
                float f17 = (f2 - f13) / (fArr[iE + 4] - f13);
                fA = hxa.a(fArr[iE + 5], f14, f17, f14);
                fA2 = hxa.a(fArr[iE + 6], f15, f17, f15);
                fA3 = hxa.a(fArr[iE + 7], f16, f17, f16);
                fG = fA;
                fG2 = fA3;
                if (kVar == k.a) {
                    float f18 = ixzVar.l;
                    hxzVar.f = hxa.a(fG, f18, f3, f18);
                    float f19 = ixzVar.m;
                    hxzVar.g = hxa.a(fA2, f19, f3, f19);
                    float f20 = ixzVar.n;
                    hxzVar.h = hxa.a(fG2, f20, f3, f20);
                    return;
                }
                float f110 = hxzVar.f;
                hxzVar.f = hxa.a(fG, f110, f3, f110);
                float f111 = hxzVar.g;
                hxzVar.g = hxa.a(fA2, f111, f3, f111);
                float f112 = hxzVar.h;
                hxzVar.h = hxa.a(fG2, f112, f3, f112);
            }
        }

        @Override // lh0.m0
        public final int d() {
            return 4;
        }
    }

    public static abstract class m0 {
        public final String[] a;
        public final float[] b;

        public m0(String[] strArr, int i) {
            if (strArr == null) {
                hb5.a("propertyIds cannot be null.");
                throw null;
            }
            this.a = strArr;
            this.b = new float[d() * i];
        }

        public static int e(float f, int i, float[] fArr) {
            int length = fArr.length;
            int i2 = i;
            while (i2 < length) {
                if (fArr[i2] > f) {
                    return i2 - i;
                }
                i2 += i;
            }
            return length - i;
        }

        public static int f(float f, float[] fArr) {
            int length = fArr.length;
            for (int i = 1; i < length; i++) {
                if (fArr[i] > f) {
                    return i - 1;
                }
            }
            return length - 1;
        }

        public abstract void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar);

        public int c() {
            return this.b.length / d();
        }

        public int d() {
            return 1;
        }
    }

    public static class n extends c {
        public final int d;

        public n(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "17|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            hxz hxzVar = mx90Var.g.get(this.d);
            if (hxzVar.i) {
                hxzVar.d = k(f2, f3, kVar, hxzVar.d, hxzVar.a.j);
            }
        }
    }

    public static class n0 extends e {
        public final int d;

        public n0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "16|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fA;
            float fG;
            float fG2;
            float fG3;
            float fG4;
            float fG5;
            dsg0 dsg0Var = mx90Var.f.get(this.d);
            boolean z = dsg0Var.j;
            esg0 esg0Var = dsg0Var.a;
            if (z) {
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    int iOrdinal = kVar.ordinal();
                    if (iOrdinal == 0) {
                        dsg0Var.d = esg0Var.f;
                        dsg0Var.e = esg0Var.g;
                        dsg0Var.f = esg0Var.h;
                        dsg0Var.g = esg0Var.i;
                        dsg0Var.h = esg0Var.j;
                        dsg0Var.i = esg0Var.k;
                        return;
                    }
                    if (iOrdinal != 1) {
                        return;
                    }
                    float f4 = dsg0Var.d;
                    dsg0Var.d = hxa.a(esg0Var.f, f4, f3, f4);
                    float f5 = dsg0Var.e;
                    dsg0Var.e = hxa.a(esg0Var.g, f5, f3, f5);
                    float f6 = dsg0Var.f;
                    dsg0Var.f = hxa.a(esg0Var.h, f6, f3, f6);
                    float f7 = dsg0Var.g;
                    dsg0Var.g = hxa.a(esg0Var.i, f7, f3, f7);
                    float f8 = dsg0Var.h;
                    dsg0Var.h = hxa.a(esg0Var.j, f8, f3, f8);
                    float f9 = dsg0Var.i;
                    dsg0Var.i = hxa.a(esg0Var.k, f9, f3, f9);
                    return;
                }
                int iE = m0.e(f2, 7, fArr);
                int i = (int) this.c[iE / 7];
                if (i == 0) {
                    float f10 = fArr[iE];
                    float f11 = fArr[iE + 1];
                    float f12 = fArr[iE + 2];
                    float f13 = fArr[iE + 3];
                    float f14 = fArr[iE + 4];
                    float f15 = fArr[iE + 5];
                    float f16 = fArr[iE + 6];
                    float f17 = (f2 - f10) / (fArr[iE + 7] - f10);
                    float fA2 = hxa.a(fArr[iE + 8], f11, f17, f11);
                    fA = hxa.a(fArr[iE + 9], f12, f17, f12);
                    float fA3 = hxa.a(fArr[iE + 10], f13, f17, f13);
                    float fA4 = hxa.a(fArr[iE + 11], f14, f17, f14);
                    float fA5 = hxa.a(fArr[iE + 12], f15, f17, f15);
                    float fA6 = hxa.a(fArr[iE + 13], f16, f17, f16);
                    fG = fA2;
                    fG2 = fA6;
                    fG3 = fA4;
                    fG4 = fA5;
                    fG5 = fA3;
                } else if (i != 1) {
                    fG = g(f2, iE, 1, i - 2);
                    fA = g(f2, iE, 2, i + 16);
                    fG5 = g(f2, iE, 3, i + 34);
                    fG3 = g(f2, iE, 4, i + 52);
                    fG4 = g(f2, iE, 5, i + 70);
                    fG2 = g(f2, iE, 6, i + 88);
                } else {
                    float f18 = fArr[iE + 1];
                    fA = fArr[iE + 2];
                    fG5 = fArr[iE + 3];
                    fG3 = fArr[iE + 4];
                    fG4 = fArr[iE + 5];
                    float f19 = fArr[iE + 6];
                    fG = f18;
                    fG2 = f19;
                }
                if (kVar == k.a) {
                    float f20 = esg0Var.f;
                    dsg0Var.d = hxa.a(fG, f20, f3, f20);
                    float f21 = esg0Var.g;
                    dsg0Var.e = hxa.a(fA, f21, f3, f21);
                    float f22 = esg0Var.h;
                    dsg0Var.f = hxa.a(fG5, f22, f3, f22);
                    float f23 = esg0Var.i;
                    dsg0Var.g = hxa.a(fG3, f23, f3, f23);
                    float f24 = esg0Var.j;
                    dsg0Var.h = hxa.a(fG4, f24, f3, f24);
                    float f25 = esg0Var.k;
                    dsg0Var.i = hxa.a(fG2, f25, f3, f25);
                    return;
                }
                float f26 = dsg0Var.d;
                dsg0Var.d = hxa.a(fG, f26, f3, f26);
                float f27 = dsg0Var.e;
                dsg0Var.e = hxa.a(fA, f27, f3, f27);
                float f28 = dsg0Var.f;
                dsg0Var.f = hxa.a(fG5, f28, f3, f28);
                float f29 = dsg0Var.g;
                dsg0Var.g = hxa.a(fG3, f29, f3, f29);
                float f30 = dsg0Var.h;
                dsg0Var.h = hxa.a(fG4, f30, f3, f30);
                float f31 = dsg0Var.i;
                dsg0Var.i = hxa.a(fG2, f31, f3, f31);
            }
        }

        @Override // lh0.m0
        public final int d() {
            return 7;
        }

        public final void k(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            int i2 = i * 7;
            float[] fArr = this.b;
            fArr[i2] = f;
            fArr[i2 + 1] = f2;
            fArr[i2 + 2] = f3;
            fArr[i2 + 3] = f4;
            fArr[i2 + 4] = f5;
            fArr[i2 + 5] = f6;
            fArr[i2 + 6] = f7;
        }
    }

    public static class o extends c {
        public final int d;

        public o(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "18|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            hxz hxzVar = mx90Var.g.get(this.d);
            if (hxzVar.i) {
                hxzVar.e = k(f2, f3, kVar, hxzVar.e, hxzVar.a.k);
            }
        }
    }

    public static class o0 extends d {
        public final int d;

        public o0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "1|"), hce0.a(i3, "2|"));
            this.d = i3;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0094  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fA;
            float fA2;
            float fG;
            float fG2;
            int iOrdinal;
            lh4 lh4Var = mx90Var.b.get(this.d);
            boolean z = lh4Var.A;
            mh4 mh4Var = lh4Var.a;
            if (z) {
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    int iOrdinal2 = kVar.ordinal();
                    if (iOrdinal2 == 0) {
                        lh4Var.e = mh4Var.e;
                        lh4Var.f = mh4Var.f;
                        return;
                    } else {
                        if (iOrdinal2 != 1) {
                            return;
                        }
                        float f4 = lh4Var.e;
                        lh4Var.e = hxa.a(mh4Var.e, f4, f3, f4);
                        float f5 = lh4Var.f;
                        lh4Var.f = hxa.a(mh4Var.f, f5, f3, f5);
                        return;
                    }
                }
                int iE = m0.e(f2, 3, fArr);
                int i = (int) this.c[iE / 3];
                if (i != 0) {
                    if (i != 1) {
                        fG = g(f2, iE, 1, i - 2);
                        fG2 = g(f2, iE, 2, i + 16);
                    } else {
                        fA = fArr[iE + 1];
                        fA2 = fArr[iE + 2];
                    }
                    iOrdinal = kVar.ordinal();
                    if (iOrdinal != 0) {
                        lh4Var.e = (fG * f3) + mh4Var.e;
                        lh4Var.f = (fG2 * f3) + mh4Var.f;
                        return;
                    }
                    if (iOrdinal != 1 || iOrdinal == 2) {
                        float f6 = lh4Var.e;
                        lh4Var.e = (((mh4Var.e + fG) - f6) * f3) + f6;
                        float f7 = lh4Var.f;
                        lh4Var.f = (((mh4Var.f + fG2) - f7) * f3) + f7;
                    }
                    if (iOrdinal != 3) {
                        return;
                    }
                    lh4Var.e = (fG * f3) + lh4Var.e;
                    lh4Var.f = (fG2 * f3) + lh4Var.f;
                    return;
                }
                float f8 = fArr[iE];
                float f9 = fArr[iE + 1];
                float f10 = fArr[iE + 2];
                float f11 = (f2 - f8) / (fArr[iE + 3] - f8);
                fA = hxa.a(fArr[iE + 4], f9, f11, f9);
                fA2 = hxa.a(fArr[iE + 5], f10, f11, f10);
                fG = fA;
                fG2 = fA2;
                iOrdinal = kVar.ordinal();
                if (iOrdinal != 0) {
                    lh4Var.e = (fG * f3) + mh4Var.e;
                    lh4Var.f = (fG2 * f3) + mh4Var.f;
                    return;
                }
                if (iOrdinal != 1) {
                }
                float f12 = lh4Var.e;
                lh4Var.e = (((mh4Var.e + fG) - f12) * f3) + f12;
                float f13 = lh4Var.f;
                lh4Var.f = (((mh4Var.f + fG2) - f13) * f3) + f13;
            }
        }
    }

    public static class p extends w {
        public p(int i, int i2, int i3) {
            super(i, i2, i3, y.c);
        }

        @Override // lh0.w
        public final float o(et00 et00Var) {
            return et00Var.e;
        }

        @Override // lh0.w
        public final boolean p(ft00 ft00Var) {
            return ft00Var.u;
        }

        @Override // lh0.w
        public final void q(et00 et00Var, float f) {
            et00Var.e = f;
        }

        @Override // lh0.w
        public final float r(et00 et00Var) {
            return et00Var.a.n;
        }
    }

    public static class p0 extends c {
        public final int d;

        public p0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "1|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            lh4 lh4Var = mx90Var.b.get(this.d);
            if (lh4Var.A) {
                lh4Var.e = m(f2, f3, kVar, lh4Var.e, lh4Var.a.e);
            }
        }
    }

    public static class q extends w {
        public q(int i, int i2, int i3) {
            super(i, i2, i3, y.f);
        }

        @Override // lh0.w
        public final float o(et00 et00Var) {
            return et00Var.h;
        }

        @Override // lh0.w
        public final boolean p(ft00 ft00Var) {
            return ft00Var.x;
        }

        @Override // lh0.w
        public final void q(et00 et00Var, float f) {
            et00Var.h = f;
        }

        @Override // lh0.w
        public final float r(et00 et00Var) {
            return et00Var.a.q;
        }
    }

    public static class q0 extends c {
        public final int d;

        public q0(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "2|"));
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            lh4 lh4Var = mx90Var.b.get(this.d);
            if (lh4Var.A) {
                lh4Var.f = m(f2, f3, kVar, lh4Var.f, lh4Var.a.f);
            }
        }
    }

    public static class r extends w {
        public r(int i, int i2, int i3) {
            super(i, i2, i3, y.a);
        }

        @Override // lh0.w
        public final float o(et00 et00Var) {
            return et00Var.c;
        }

        @Override // lh0.w
        public final boolean p(ft00 ft00Var) {
            return ft00Var.s;
        }

        @Override // lh0.w
        public final void q(et00 et00Var, float f) {
            et00Var.c = f;
        }

        @Override // lh0.w
        public final float r(et00 et00Var) {
            return et00Var.a.l;
        }
    }

    public static class s extends w {
        public s(int i, int i2, int i3) {
            super(i, i2, i3, y.d);
        }

        @Override // lh0.w
        public final float o(et00 et00Var) {
            return 1.0f / et00Var.f;
        }

        @Override // lh0.w
        public final boolean p(ft00 ft00Var) {
            return ft00Var.v;
        }

        @Override // lh0.w
        public final void q(et00 et00Var, float f) {
            et00Var.f = 1.0f / f;
        }

        @Override // lh0.w
        public final float r(et00 et00Var) {
            return 1.0f / et00Var.a.o;
        }
    }

    public static class t extends w {
        public t(int i, int i2, int i3) {
            super(i, i2, i3, y.i);
        }

        @Override // lh0.w
        public final float o(et00 et00Var) {
            return et00Var.i;
        }

        @Override // lh0.w
        public final boolean p(ft00 ft00Var) {
            return ft00Var.y;
        }

        @Override // lh0.w
        public final void q(et00 et00Var, float f) {
            et00Var.i = f;
        }

        @Override // lh0.w
        public final float r(et00 et00Var) {
            return et00Var.a.r;
        }
    }

    public static class u extends m0 {
        public static final String[] d = {Integer.toString(27)};
        public final int c;

        public u(int i, int i2) {
            super(d, i);
            this.c = i2;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            et00 et00Var;
            mw0<et00> mw0Var2 = mx90Var.h;
            int i = this.c;
            if (i != -1) {
                et00Var = mw0Var2.get(i);
                if (!et00Var.y) {
                    return;
                }
            } else {
                et00Var = null;
            }
            float[] fArr = this.b;
            if (f > f2) {
                b(mx90Var, f, 2.1474836E9f, null, f3, kVar, lVar);
                f = -1.0f;
            } else if (f >= fArr[fArr.length - 1]) {
                return;
            }
            float f4 = fArr[0];
            if (f2 < f4) {
                return;
            }
            if (f < f4 || f2 >= fArr[m0.f(f, fArr) + 1]) {
                if (et00Var != null) {
                    et00Var.b();
                    return;
                }
                et00[] et00VarArr = mw0Var2.a;
                int i2 = mw0Var2.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    et00 et00Var2 = et00VarArr[i3];
                    if (et00Var2.y) {
                        et00Var2.b();
                    }
                }
            }
        }
    }

    public static class v extends w {
        public v(int i, int i2, int i3) {
            super(i, i2, i3, y.b);
        }

        @Override // lh0.w
        public final float o(et00 et00Var) {
            return et00Var.d;
        }

        @Override // lh0.w
        public final boolean p(ft00 ft00Var) {
            return ft00Var.t;
        }

        @Override // lh0.w
        public final void q(et00 et00Var, float f) {
            et00Var.d = f;
        }

        @Override // lh0.w
        public final float r(et00 et00Var) {
            return et00Var.a.m;
        }
    }

    public static abstract class w extends c {
        public final int d;

        public w(int i, int i2, int i3, y yVar) {
            super(i, i2, yVar.ordinal() + "|" + i3);
            this.d = i3;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            mw0<et00> mw0Var2 = mx90Var.h;
            int i = this.d;
            if (i != -1) {
                et00 et00Var = mw0Var2.get(i);
                if (et00Var.y) {
                    q(et00Var, k(f2, f3, kVar, o(et00Var), r(et00Var)));
                    return;
                }
                return;
            }
            float[] fArr = this.b;
            float fL = f2 >= fArr[0] ? l(f2) : 0.0f;
            et00[] et00VarArr = mw0Var2.a;
            int i2 = mw0Var2.b;
            for (int i3 = 0; i3 < i2; i3++) {
                et00 et00Var2 = et00VarArr[i3];
                if (et00Var2.y && p(et00Var2.a)) {
                    float fO = o(et00Var2);
                    float fR = r(et00Var2);
                    if (f2 < fArr[0]) {
                        int iOrdinal = kVar.ordinal();
                        if (iOrdinal == 0) {
                            fO = fR;
                        } else if (iOrdinal == 1) {
                            fO = hxa.a(fR, fO, f3, fO);
                        }
                    } else {
                        fO = kVar == k.a ? hxa.a(fL, fR, f3, fR) : hxa.a(fL, fO, f3, fO);
                    }
                    q(et00Var2, fO);
                }
            }
        }

        public abstract float o(et00 et00Var);

        public abstract boolean p(ft00 ft00Var);

        public abstract void q(et00 et00Var, float f);

        public abstract float r(et00 et00Var);
    }

    public static class x extends w {
        public x(int i, int i2, int i3) {
            super(i, i2, i3, y.e);
        }

        @Override // lh0.w
        public final float o(et00 et00Var) {
            return et00Var.g;
        }

        @Override // lh0.w
        public final boolean p(ft00 ft00Var) {
            return ft00Var.w;
        }

        @Override // lh0.w
        public final void q(et00 et00Var, float f) {
            et00Var.g = f;
        }

        @Override // lh0.w
        public final float r(et00 et00Var) {
            return et00Var.a.p;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class y {
        public static final y a;
        public static final y b;
        public static final y c;
        public static final y d;
        public static final y e;
        public static final y f;
        public static final y i;
        public static final /* synthetic */ y[] v;

        /* JADX INFO: Fake field, exist only in values array */
        y EF1;

        static {
            y yVar = new y("rotate", 0);
            y yVar2 = new y("x", 1);
            y yVar3 = new y("y", 2);
            y yVar4 = new y("scaleX", 3);
            y yVar5 = new y("scaleY", 4);
            y yVar6 = new y("shearX", 5);
            y yVar7 = new y("shearY", 6);
            y yVar8 = new y("inherit", 7);
            y yVar9 = new y("rgb", 8);
            y yVar10 = new y("alpha", 9);
            y yVar11 = new y("rgb2", 10);
            y yVar12 = new y("attachment", 11);
            y yVar13 = new y("deform", 12);
            y yVar14 = new y(AnalyticsEvent.BI_TRACKING_KIND_EVENT, 13);
            y yVar15 = new y("drawOrder", 14);
            y yVar16 = new y("ikConstraint", 15);
            y yVar17 = new y("transformConstraint", 16);
            y yVar18 = new y("pathConstraintPosition", 17);
            y yVar19 = new y("pathConstraintSpacing", 18);
            y yVar20 = new y("pathConstraintMix", 19);
            y yVar21 = new y("physicsConstraintInertia", 20);
            a = yVar21;
            y yVar22 = new y("physicsConstraintStrength", 21);
            b = yVar22;
            y yVar23 = new y("physicsConstraintDamping", 22);
            c = yVar23;
            y yVar24 = new y("physicsConstraintMass", 23);
            d = yVar24;
            y yVar25 = new y("physicsConstraintWind", 24);
            e = yVar25;
            y yVar26 = new y("physicsConstraintGravity", 25);
            f = yVar26;
            y yVar27 = new y("physicsConstraintMix", 26);
            i = yVar27;
            v = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10, yVar11, yVar12, yVar13, yVar14, yVar15, yVar16, yVar17, yVar18, yVar19, yVar20, yVar21, yVar22, yVar23, yVar24, yVar25, yVar26, yVar27, new y("physicsConstraintReset", 27), new y("sequence", 28)};
        }

        public y() {
            throw null;
        }

        public static y valueOf(String str) {
            return (y) Enum.valueOf(y.class, str);
        }

        public static y[] values() {
            return (y[]) v.clone();
        }
    }

    public static class z extends e implements l0 {
        public final int d;

        public z(int i, int i2, int i3) {
            super(i, i2, hce0.a(i3, "8|"), hce0.a(i3, "10|"));
            this.d = i3;
        }

        @Override // lh0.l0
        public final int a() {
            return this.d;
        }

        @Override // lh0.m0
        public final void b(mx90 mx90Var, float f, float f2, mw0<whg> mw0Var, float f3, k kVar, l lVar) {
            float fA;
            float fG;
            float fG2;
            float fG3;
            float fG4;
            float fG5;
            g1a0 g1a0Var = mx90Var.c.get(this.d);
            lh4 lh4Var = g1a0Var.b;
            h1a0 h1a0Var = g1a0Var.a;
            if (lh4Var.A) {
                i58 i58Var = g1a0Var.c;
                i58 i58Var2 = g1a0Var.d;
                float[] fArr = this.b;
                if (f2 < fArr[0]) {
                    i58 i58Var3 = h1a0Var.d;
                    i58 i58Var4 = h1a0Var.e;
                    int iOrdinal = kVar.ordinal();
                    if (iOrdinal == 0) {
                        i58Var.a = i58Var3.a;
                        i58Var.b = i58Var3.b;
                        i58Var.c = i58Var3.c;
                        i58Var2.a = i58Var4.a;
                        i58Var2.b = i58Var4.b;
                        i58Var2.c = i58Var4.c;
                        return;
                    }
                    if (iOrdinal != 1) {
                        return;
                    }
                    float f4 = i58Var.a;
                    i58Var.a = hxa.a(i58Var3.a, f4, f3, f4);
                    float f5 = i58Var.b;
                    i58Var.b = hxa.a(i58Var3.b, f5, f3, f5);
                    float f6 = i58Var.c;
                    i58Var.c = hxa.a(i58Var3.c, f6, f3, f6);
                    float f7 = i58Var2.a;
                    i58Var2.a = hxa.a(i58Var4.a, f7, f3, f7);
                    float f8 = i58Var2.b;
                    i58Var2.b = hxa.a(i58Var4.b, f8, f3, f8);
                    float f9 = i58Var2.c;
                    i58Var2.c = hxa.a(i58Var4.c, f9, f3, f9);
                    return;
                }
                int iE = m0.e(f2, 7, fArr);
                int i = (int) this.c[iE / 7];
                if (i == 0) {
                    float f10 = fArr[iE];
                    float f11 = fArr[iE + 1];
                    float f12 = fArr[iE + 2];
                    float f13 = fArr[iE + 3];
                    float f14 = fArr[iE + 4];
                    float f15 = fArr[iE + 5];
                    float f16 = fArr[iE + 6];
                    float f17 = (f2 - f10) / (fArr[iE + 7] - f10);
                    float fA2 = hxa.a(fArr[iE + 8], f11, f17, f11);
                    fA = hxa.a(fArr[iE + 9], f12, f17, f12);
                    float fA3 = hxa.a(fArr[iE + 10], f13, f17, f13);
                    float fA4 = hxa.a(fArr[iE + 11], f14, f17, f14);
                    float fA5 = hxa.a(fArr[iE + 12], f15, f17, f15);
                    float fA6 = hxa.a(fArr[iE + 13], f16, f17, f16);
                    fG = fA2;
                    fG2 = fA6;
                    fG3 = fA4;
                    fG4 = fA5;
                    fG5 = fA3;
                } else if (i != 1) {
                    fG = g(f2, iE, 1, i - 2);
                    fA = g(f2, iE, 2, i + 16);
                    fG5 = g(f2, iE, 3, i + 34);
                    fG3 = g(f2, iE, 4, i + 52);
                    fG4 = g(f2, iE, 5, i + 70);
                    fG2 = g(f2, iE, 6, i + 88);
                } else {
                    float f18 = fArr[iE + 1];
                    fA = fArr[iE + 2];
                    fG5 = fArr[iE + 3];
                    fG3 = fArr[iE + 4];
                    fG4 = fArr[iE + 5];
                    float f19 = fArr[iE + 6];
                    fG = f18;
                    fG2 = f19;
                }
                if (f3 == 1.0f) {
                    i58Var.a = fG;
                    i58Var.b = fA;
                    i58Var.c = fG5;
                    i58Var2.a = fG3;
                    i58Var2.b = fG4;
                    i58Var2.c = fG2;
                    return;
                }
                if (kVar == k.a) {
                    i58 i58Var5 = h1a0Var.d;
                    i58 i58Var6 = h1a0Var.e;
                    i58Var.a = i58Var5.a;
                    i58Var.b = i58Var5.b;
                    i58Var.c = i58Var5.c;
                    i58Var2.a = i58Var6.a;
                    i58Var2.b = i58Var6.b;
                    i58Var2.c = i58Var6.c;
                }
                float f20 = i58Var.a;
                i58Var.a = hxa.a(fG, f20, f3, f20);
                float f21 = i58Var.b;
                i58Var.b = hxa.a(fA, f21, f3, f21);
                float f22 = i58Var.c;
                i58Var.c = hxa.a(fG5, f22, f3, f22);
                float f23 = i58Var2.a;
                i58Var2.a = hxa.a(fG3, f23, f3, f23);
                float f24 = i58Var2.b;
                i58Var2.b = hxa.a(fG4, f24, f3, f24);
                float f25 = i58Var2.c;
                i58Var2.c = hxa.a(fG2, f25, f3, f25);
            }
        }

        @Override // lh0.m0
        public final int d() {
            return 7;
        }

        public final void k(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            int i2 = i * 7;
            float[] fArr = this.b;
            fArr[i2] = f;
            fArr[i2 + 1] = f2;
            fArr[i2 + 2] = f3;
            fArr[i2 + 3] = f4;
            fArr[i2 + 4] = f5;
            fArr[i2 + 5] = f6;
            fArr[i2 + 6] = f7;
        }
    }

    public lh0(String str, mw0<m0> mw0Var, float f2) {
        if (str == null) {
            hb5.a("name cannot be null.");
            throw null;
        }
        this.a = str;
        this.d = f2;
        ncy<String> ncyVar = new ncy<>(mw0Var.b);
        this.c = ncyVar;
        this.b = mw0Var;
        int i2 = mw0Var.b;
        ncyVar.b(i2);
        m0[] m0VarArr = mw0Var.a;
        for (int i3 = 0; i3 < i2; i3++) {
            ncyVar.a(m0VarArr[i3].a);
        }
    }

    public final String toString() {
        return this.a;
    }
}
