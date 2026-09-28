package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kx0 implements rx0.a {
    public final rx0 b;
    public final dr5 c;
    public int a = 0;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public kx0(rx0 rx0Var, dr5 dr5Var) {
        this.b = rx0Var;
        this.c = dr5Var;
    }

    @Override // rx0.a
    public final boolean a(uoa0 uoa0Var) {
        int i = this.h;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                if (this.e[i] == uoa0Var.b) {
                    return true;
                }
                i = this.f[i];
            }
        }
        return false;
    }

    @Override // rx0.a
    public final uoa0 b(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.c.c[this.e[i2]];
            }
            i2 = this.f[i2];
        }
        return null;
    }

    @Override // rx0.a
    public final void c() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f[i];
        }
    }

    @Override // rx0.a
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            uoa0 uoa0Var = this.c.c[this.e[i]];
            if (uoa0Var != null) {
                uoa0Var.b(this.b);
            }
            i = this.f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    @Override // rx0.a
    public final float d(rx0 rx0Var, boolean z) {
        float fE = e(rx0Var.a);
        i(rx0Var.a, z);
        rx0.a aVar = rx0Var.d;
        int iF = aVar.f();
        for (int i = 0; i < iF; i++) {
            uoa0 uoa0VarB = aVar.b(i);
            g(uoa0VarB, aVar.e(uoa0VarB) * fE, z);
        }
        return fE;
    }

    @Override // rx0.a
    public final float e(uoa0 uoa0Var) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.e[i] == uoa0Var.b) {
                return this.g[i];
            }
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // rx0.a
    public final int f() {
        return this.a;
    }

    @Override // rx0.a
    public final void g(uoa0 uoa0Var, float f, boolean z) {
        int[] iArr;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.h;
            rx0 rx0Var = this.b;
            if (i == -1) {
                this.h = 0;
                this.g[0] = f;
                this.e[0] = uoa0Var.b;
                this.f[0] = -1;
                uoa0Var.A++;
                uoa0Var.a(rx0Var);
                this.a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr2 = this.e;
                if (i2 >= iArr2.length) {
                    this.j = true;
                    this.i = iArr2.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.e[i];
                int i6 = uoa0Var.b;
                if (i5 == i6) {
                    float[] fArr = this.g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.h;
                        int[] iArr3 = this.f;
                        if (i == i7) {
                            this.h = iArr3[i];
                        } else {
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            uoa0Var.b(rx0Var);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        uoa0Var.A--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f[i];
            }
            int length = this.i;
            int i8 = length + 1;
            if (this.j) {
                int[] iArr4 = this.e;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i8;
            }
            int[] iArr5 = this.e;
            if (length < iArr5.length || this.a >= iArr5.length) {
                iArr = iArr5;
                break;
            }
            int i9 = 0;
            while (true) {
                iArr = this.e;
                if (i9 >= iArr.length) {
                    iArr5 = iArr;
                    iArr = iArr5;
                    break;
                } else {
                    if (iArr[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            if (length >= iArr.length) {
                length = iArr.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.j = false;
                this.i = length - 1;
                this.g = Arrays.copyOf(this.g, i10);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[length] = uoa0Var.b;
            this.g[length] = f;
            int[] iArr6 = this.f;
            if (i3 != -1) {
                iArr6[length] = iArr6[i3];
                iArr6[i3] = length;
            } else {
                iArr6[length] = this.h;
                this.h = length;
            }
            uoa0Var.A++;
            uoa0Var.a(rx0Var);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr7 = this.e;
            if (i11 >= iArr7.length) {
                this.j = true;
                this.i = iArr7.length - 1;
            }
        }
    }

    @Override // rx0.a
    public final float h(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    @Override // rx0.a
    public final float i(uoa0 uoa0Var, boolean z) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.e[i] == uoa0Var.b) {
                int i4 = this.h;
                int[] iArr = this.f;
                if (i == i4) {
                    this.h = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    uoa0Var.b(this.b);
                }
                uoa0Var.A--;
                this.a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.g[i];
            }
            i2++;
            i3 = i;
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // rx0.a
    public final void j(float f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] / f;
            i = this.f[i];
        }
    }

    @Override // rx0.a
    public final void k(uoa0 uoa0Var, float f) {
        int[] iArr;
        if (f == 0.0f) {
            i(uoa0Var, true);
            return;
        }
        int i = this.h;
        rx0 rx0Var = this.b;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = uoa0Var.b;
            this.f[0] = -1;
            uoa0Var.A++;
            uoa0Var.a(rx0Var);
            this.a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr2 = this.e;
            if (i2 >= iArr2.length) {
                this.j = true;
                this.i = iArr2.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.e[i];
            int i6 = uoa0Var.b;
            if (i5 == i6) {
                this.g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int length = this.i;
        int i7 = length + 1;
        if (this.j) {
            int[] iArr3 = this.e;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.e;
        if (length < iArr4.length || this.a >= iArr4.length) {
            iArr = iArr4;
            break;
        }
        int i8 = 0;
        while (true) {
            iArr = this.e;
            if (i8 >= iArr.length) {
                iArr4 = iArr;
                iArr = iArr4;
                break;
            } else {
                if (iArr[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        if (length >= iArr.length) {
            length = iArr.length;
            int i9 = this.d * 2;
            this.d = i9;
            this.j = false;
            this.i = length - 1;
            this.g = Arrays.copyOf(this.g, i9);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[length] = uoa0Var.b;
        this.g[length] = f;
        int[] iArr5 = this.f;
        if (i3 != -1) {
            iArr5[length] = iArr5[i3];
            iArr5[i3] = length;
        } else {
            iArr5[length] = this.h;
            this.h = length;
        }
        uoa0Var.A++;
        uoa0Var.a(rx0Var);
        int i10 = this.a + 1;
        this.a = i10;
        if (!this.j) {
            this.i++;
        }
        int[] iArr6 = this.e;
        if (i10 >= iArr6.length) {
            this.j = true;
        }
        if (this.i >= iArr6.length) {
            this.j = true;
            this.i = iArr6.length - 1;
        }
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = wi1.a(this.g[i], " : ", new StringBuilder(str.concat(" -> "))) + this.c.c[this.e[i]];
            i = this.f[i];
        }
        return str;
    }
}
