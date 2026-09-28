package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class mw20 extends rx0 {
    public uoa0[] f;
    public uoa0[] g;
    public int h;
    public b i;

    public class a implements Comparator<uoa0> {
        @Override // java.util.Comparator
        public final int compare(uoa0 uoa0Var, uoa0 uoa0Var2) {
            return uoa0Var.b - uoa0Var2.b;
        }
    }

    public class b {
        public uoa0 a;

        public b() {
        }

        public final String toString() {
            String strA = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    strA = wi1.a(this.a.v[i], " ", new StringBuilder(strA));
                }
            }
            StringBuilder sbB = mq0.b(strA, "] ");
            sbB.append(this.a);
            return sbB.toString();
        }
    }

    @Override // defpackage.rx0, ofs.a
    public final uoa0 a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            uoa0[] uoa0VarArr = this.f;
            uoa0 uoa0Var = uoa0VarArr[i2];
            if (!zArr[uoa0Var.b]) {
                b bVar = this.i;
                bVar.a = uoa0Var;
                int i3 = 8;
                if (i != -1) {
                    uoa0 uoa0Var2 = uoa0VarArr[i];
                    while (i3 >= 0) {
                        float f = uoa0Var2.v[i3];
                        float f2 = bVar.a.v[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = bVar.a.v[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.rx0
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.rx0
    public final void i(ofs ofsVar, rx0 rx0Var, boolean z) {
        uoa0 uoa0Var = rx0Var.a;
        if (uoa0Var == null) {
            return;
        }
        float[] fArr = uoa0Var.v;
        rx0.a aVar = rx0Var.d;
        int iF = aVar.f();
        for (int i = 0; i < iF; i++) {
            uoa0 uoa0VarB = aVar.b(i);
            float fH = aVar.h(i);
            b bVar = this.i;
            bVar.a = uoa0VarB;
            if (uoa0VarB.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = bVar.a.v;
                    float f = (fArr[i2] * fH) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        bVar.a.v[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    mw20.this.k(bVar.a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fH;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bVar.a.v[i3] = f3;
                    } else {
                        bVar.a.v[i3] = 0.0f;
                    }
                }
                j(uoa0VarB);
            }
            this.b = (rx0Var.b * fH) + this.b;
        }
        k(uoa0Var);
    }

    public final void j(uoa0 uoa0Var) {
        int i;
        uoa0[] uoa0VarArr;
        int i2 = this.h + 1;
        uoa0[] uoa0VarArr2 = this.f;
        if (i2 > uoa0VarArr2.length) {
            uoa0[] uoa0VarArr3 = (uoa0[]) Arrays.copyOf(uoa0VarArr2, uoa0VarArr2.length * 2);
            this.f = uoa0VarArr3;
            this.g = (uoa0[]) Arrays.copyOf(uoa0VarArr3, uoa0VarArr3.length * 2);
        }
        uoa0[] uoa0VarArr4 = this.f;
        int i3 = this.h;
        uoa0VarArr4[i3] = uoa0Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && uoa0VarArr4[i3].b > uoa0Var.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                uoa0VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                uoa0VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(uoa0VarArr, 0, i, new a());
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        uoa0Var.a = true;
        uoa0Var.a(this);
    }

    public final void k(uoa0 uoa0Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == uoa0Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        uoa0Var.a = false;
                        return;
                    } else {
                        uoa0[] uoa0VarArr = this.f;
                        int i3 = i + 1;
                        uoa0VarArr[i] = uoa0VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.rx0
    public final String toString() {
        b bVar = this.i;
        String strA = wi1.a(this.b, ") : ", new StringBuilder(" goal -> ("));
        for (int i = 0; i < this.h; i++) {
            bVar.a = this.f[i];
            strA = strA + bVar + " ";
        }
        return strA;
    }
}
