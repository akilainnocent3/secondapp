package i0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f90146l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f90147m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static float f90148n = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f90150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f90151c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90149a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90152d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f90153e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f90154f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f90155g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f90156h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f90157i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f90158j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f90159k = false;

    public a(b bVar, c cVar) {
        this.f90150b = bVar;
        this.f90151c = cVar;
    }

    public int a() {
        return this.f90157i;
    }

    public final int b(int i10) {
        return this.f90154f[i10];
    }

    public final int c(int i10) {
        return this.f90155g[i10];
    }

    @Override // i0.b.a
    public final void clear() {
        int i10 = this.f90157i;
        for (int i11 = 0; i10 != -1 && i11 < this.f90149a; i11++) {
            i iVar = this.f90151c.f90171d[this.f90154f[i10]];
            if (iVar != null) {
                iVar.g(this.f90150b);
            }
            i10 = this.f90155g[i10];
        }
        this.f90157i = -1;
        this.f90158j = -1;
        this.f90159k = false;
        this.f90149a = 0;
    }

    @Override // i0.b.a
    public int d() {
        return this.f90149a;
    }

    @Override // i0.b.a
    public final float e(i iVar, boolean z10) {
        if (this.f90153e == iVar) {
            this.f90153e = null;
        }
        int i10 = this.f90157i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f90149a) {
            if (this.f90154f[i10] == iVar.f90250d) {
                if (i10 == this.f90157i) {
                    this.f90157i = this.f90155g[i10];
                } else {
                    int[] iArr = this.f90155g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.g(this.f90150b);
                }
                iVar.f90260n--;
                this.f90149a--;
                this.f90154f[i10] = -1;
                if (this.f90159k) {
                    this.f90158j = i10;
                }
                return this.f90156h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f90155g[i10];
        }
        return 0.0f;
    }

    @Override // i0.b.a
    public i f(int i10) {
        int i11 = this.f90157i;
        for (int i12 = 0; i11 != -1 && i12 < this.f90149a; i12++) {
            if (i12 == i10) {
                return this.f90151c.f90171d[this.f90154f[i11]];
            }
            i11 = this.f90155g[i11];
        }
        return null;
    }

    @Override // i0.b.a
    public float g(b bVar, boolean z10) {
        float fN = n(bVar.f90162a);
        e(bVar.f90162a, z10);
        b.a aVar = bVar.f90166e;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i iVarF = aVar.f(i10);
            l(iVarF, aVar.n(iVarF) * fN, z10);
        }
        return fN;
    }

    @Override // i0.b.a
    public boolean h(i iVar) {
        int i10 = this.f90157i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f90149a; i11++) {
            if (this.f90154f[i10] == iVar.f90250d) {
                return true;
            }
            i10 = this.f90155g[i10];
        }
        return false;
    }

    @Override // i0.b.a
    public final void i(i iVar, float f10) {
        if (f10 == 0.0f) {
            e(iVar, true);
            return;
        }
        int i10 = this.f90157i;
        if (i10 == -1) {
            this.f90157i = 0;
            this.f90156h[0] = f10;
            this.f90154f[0] = iVar.f90250d;
            this.f90155g[0] = -1;
            iVar.f90260n++;
            iVar.a(this.f90150b);
            this.f90149a++;
            if (this.f90159k) {
                return;
            }
            int i11 = this.f90158j + 1;
            this.f90158j = i11;
            int[] iArr = this.f90154f;
            if (i11 >= iArr.length) {
                this.f90159k = true;
                this.f90158j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f90149a; i13++) {
            int i14 = this.f90154f[i10];
            int i15 = iVar.f90250d;
            if (i14 == i15) {
                this.f90156h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f90155g[i10];
        }
        int length = this.f90158j;
        int i16 = length + 1;
        if (this.f90159k) {
            int[] iArr2 = this.f90154f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f90154f;
        if (length >= iArr3.length && this.f90149a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f90154f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f90154f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f90152d * 2;
            this.f90152d = i18;
            this.f90159k = false;
            this.f90158j = length - 1;
            this.f90156h = Arrays.copyOf(this.f90156h, i18);
            this.f90154f = Arrays.copyOf(this.f90154f, this.f90152d);
            this.f90155g = Arrays.copyOf(this.f90155g, this.f90152d);
        }
        this.f90154f[length] = iVar.f90250d;
        this.f90156h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f90155g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f90155g[length] = this.f90157i;
            this.f90157i = length;
        }
        iVar.f90260n++;
        iVar.a(this.f90150b);
        int i19 = this.f90149a + 1;
        this.f90149a = i19;
        if (!this.f90159k) {
            this.f90158j++;
        }
        int[] iArr7 = this.f90154f;
        if (i19 >= iArr7.length) {
            this.f90159k = true;
        }
        if (this.f90158j >= iArr7.length) {
            this.f90159k = true;
            this.f90158j = iArr7.length - 1;
        }
    }

    @Override // i0.b.a
    public int j(i iVar) {
        int i10 = this.f90157i;
        if (i10 == -1) {
            return -1;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f90149a; i11++) {
            if (this.f90154f[i10] == iVar.f90250d) {
                return i10;
            }
            i10 = this.f90155g[i10];
        }
        return -1;
    }

    @Override // i0.b.a
    public void k(float f10) {
        int i10 = this.f90157i;
        for (int i11 = 0; i10 != -1 && i11 < this.f90149a; i11++) {
            float[] fArr = this.f90156h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f90155g[i10];
        }
    }

    @Override // i0.b.a
    public void l(i iVar, float f10, boolean z10) {
        float f11 = f90148n;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f90157i;
            if (i10 == -1) {
                this.f90157i = 0;
                this.f90156h[0] = f10;
                this.f90154f[0] = iVar.f90250d;
                this.f90155g[0] = -1;
                iVar.f90260n++;
                iVar.a(this.f90150b);
                this.f90149a++;
                if (this.f90159k) {
                    return;
                }
                int i11 = this.f90158j + 1;
                this.f90158j = i11;
                int[] iArr = this.f90154f;
                if (i11 >= iArr.length) {
                    this.f90159k = true;
                    this.f90158j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f90149a; i13++) {
                int i14 = this.f90154f[i10];
                int i15 = iVar.f90250d;
                if (i14 == i15) {
                    float[] fArr = this.f90156h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f90148n;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f90157i) {
                            this.f90157i = this.f90155g[i10];
                        } else {
                            int[] iArr2 = this.f90155g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.g(this.f90150b);
                        }
                        if (this.f90159k) {
                            this.f90158j = i10;
                        }
                        iVar.f90260n--;
                        this.f90149a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f90155g[i10];
            }
            int length = this.f90158j;
            int i16 = length + 1;
            if (this.f90159k) {
                int[] iArr3 = this.f90154f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f90154f;
            if (length >= iArr4.length && this.f90149a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f90154f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f90154f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f90152d * 2;
                this.f90152d = i18;
                this.f90159k = false;
                this.f90158j = length - 1;
                this.f90156h = Arrays.copyOf(this.f90156h, i18);
                this.f90154f = Arrays.copyOf(this.f90154f, this.f90152d);
                this.f90155g = Arrays.copyOf(this.f90155g, this.f90152d);
            }
            this.f90154f[length] = iVar.f90250d;
            this.f90156h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f90155g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f90155g[length] = this.f90157i;
                this.f90157i = length;
            }
            iVar.f90260n++;
            iVar.a(this.f90150b);
            this.f90149a++;
            if (!this.f90159k) {
                this.f90158j++;
            }
            int i19 = this.f90158j;
            int[] iArr8 = this.f90154f;
            if (i19 >= iArr8.length) {
                this.f90159k = true;
                this.f90158j = iArr8.length - 1;
            }
        }
    }

    @Override // i0.b.a
    public void m() {
        int i10 = this.f90157i;
        for (int i11 = 0; i10 != -1 && i11 < this.f90149a; i11++) {
            float[] fArr = this.f90156h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f90155g[i10];
        }
    }

    @Override // i0.b.a
    public final float n(i iVar) {
        int i10 = this.f90157i;
        for (int i11 = 0; i10 != -1 && i11 < this.f90149a; i11++) {
            if (this.f90154f[i10] == iVar.f90250d) {
                return this.f90156h[i10];
            }
            i10 = this.f90155g[i10];
        }
        return 0.0f;
    }

    @Override // i0.b.a
    public int o() {
        return (this.f90154f.length * 12) + 36;
    }

    @Override // i0.b.a
    public void p() {
        int i10 = this.f90149a;
        System.out.print("{ ");
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarF = f(i11);
            if (iVarF != null) {
                System.out.print(iVarF + " = " + q(i11) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // i0.b.a
    public float q(int i10) {
        int i11 = this.f90157i;
        for (int i12 = 0; i11 != -1 && i12 < this.f90149a; i12++) {
            if (i12 == i10) {
                return this.f90156h[i11];
            }
            i11 = this.f90155g[i11];
        }
        return 0.0f;
    }

    public i r() {
        i iVar = this.f90153e;
        if (iVar != null) {
            return iVar;
        }
        int i10 = this.f90157i;
        i iVar2 = null;
        for (int i11 = 0; i10 != -1 && i11 < this.f90149a; i11++) {
            if (this.f90156h[i10] < 0.0f) {
                i iVar3 = this.f90151c.f90171d[this.f90154f[i10]];
                if (iVar2 == null || iVar2.f90252f < iVar3.f90252f) {
                    iVar2 = iVar3;
                }
            }
            i10 = this.f90155g[i10];
        }
        return iVar2;
    }

    public final float s(int i10) {
        return this.f90156h[i10];
    }

    public boolean t() {
        int i10 = this.f90157i;
        for (int i11 = 0; i10 != -1 && i11 < this.f90149a; i11++) {
            if (this.f90156h[i10] > 0.0f) {
                return true;
            }
            i10 = this.f90155g[i10];
        }
        return false;
    }

    public String toString() {
        int i10 = this.f90157i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f90149a; i11++) {
            str = ((str + " -> ") + this.f90156h[i10] + " : ") + this.f90151c.f90171d[this.f90154f[i10]];
            i10 = this.f90155g[i10];
        }
        return str;
    }
}
