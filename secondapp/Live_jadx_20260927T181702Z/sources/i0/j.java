package i0;

import com.ironsource.C4235d4;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f90271n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f90272o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static float f90273p = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90274a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90275b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90276c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f90277d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f90278e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f90279f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f90280g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f90281h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f90282i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f90283j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f90284k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f90285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f90286m;

    public j(b bVar, c cVar) {
        this.f90285l = bVar;
        this.f90286m = cVar;
        clear();
    }

    public final void a(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f90250d % this.f90276c;
        int[] iArr2 = this.f90277d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f90278e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f90278e[i10] = -1;
    }

    public final void b(int i10, i iVar, float f10) {
        this.f90279f[i10] = iVar.f90250d;
        this.f90280g[i10] = f10;
        this.f90281h[i10] = -1;
        this.f90282i[i10] = -1;
        iVar.a(this.f90285l);
        iVar.f90260n++;
        this.f90283j++;
    }

    public final void c() {
        for (int i10 = 0; i10 < this.f90276c; i10++) {
            if (this.f90277d[i10] != -1) {
                String str = hashCode() + " hash [" + i10 + "] => ";
                int i11 = this.f90277d[i10];
                boolean z10 = false;
                while (!z10) {
                    str = str + " " + this.f90279f[i11];
                    int i12 = this.f90278e[i11];
                    if (i12 != -1) {
                        i11 = i12;
                    } else {
                        z10 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    @Override // i0.b.a
    public void clear() {
        int i10 = this.f90283j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarF = f(i11);
            if (iVarF != null) {
                iVarF.g(this.f90285l);
            }
        }
        for (int i12 = 0; i12 < this.f90275b; i12++) {
            this.f90279f[i12] = -1;
            this.f90278e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f90276c; i13++) {
            this.f90277d[i13] = -1;
        }
        this.f90283j = 0;
        this.f90284k = -1;
    }

    @Override // i0.b.a
    public int d() {
        return this.f90283j;
    }

    @Override // i0.b.a
    public float e(i iVar, boolean z10) {
        int iJ = j(iVar);
        if (iJ == -1) {
            return 0.0f;
        }
        u(iVar);
        float f10 = this.f90280g[iJ];
        if (this.f90284k == iJ) {
            this.f90284k = this.f90282i[iJ];
        }
        this.f90279f[iJ] = -1;
        int[] iArr = this.f90281h;
        int i10 = iArr[iJ];
        if (i10 != -1) {
            int[] iArr2 = this.f90282i;
            iArr2[i10] = iArr2[iJ];
        }
        int i11 = this.f90282i[iJ];
        if (i11 != -1) {
            iArr[i11] = iArr[iJ];
        }
        this.f90283j--;
        iVar.f90260n--;
        if (z10) {
            iVar.g(this.f90285l);
        }
        return f10;
    }

    @Override // i0.b.a
    public i f(int i10) {
        int i11 = this.f90283j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f90284k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f90286m.f90171d[this.f90279f[i12]];
            }
            i12 = this.f90282i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // i0.b.a
    public float g(b bVar, boolean z10) {
        float fN = n(bVar.f90162a);
        e(bVar.f90162a, z10);
        j jVar = (j) bVar.f90166e;
        int iD = jVar.d();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iD) {
            int i12 = jVar.f90279f[i11];
            if (i12 != -1) {
                l(this.f90286m.f90171d[i12], jVar.f90280g[i11] * fN, z10);
                i10++;
            }
            i11++;
        }
        return fN;
    }

    @Override // i0.b.a
    public boolean h(i iVar) {
        return j(iVar) != -1;
    }

    @Override // i0.b.a
    public void i(i iVar, float f10) {
        float f11 = f90273p;
        if (f10 > (-f11) && f10 < f11) {
            e(iVar, true);
            return;
        }
        if (this.f90283j == 0) {
            b(0, iVar, f10);
            a(iVar, 0);
            this.f90284k = 0;
            return;
        }
        int iJ = j(iVar);
        if (iJ != -1) {
            this.f90280g[iJ] = f10;
            return;
        }
        if (this.f90283j + 1 >= this.f90275b) {
            s();
        }
        int i10 = this.f90283j;
        int i11 = this.f90284k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f90279f[i11];
            int i15 = iVar.f90250d;
            if (i14 == i15) {
                this.f90280g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f90282i[i11];
            if (i11 == -1) {
                break;
            }
        }
        t(i12, iVar, f10);
    }

    @Override // i0.b.a
    public int j(i iVar) {
        if (this.f90283j != 0 && iVar != null) {
            int i10 = iVar.f90250d;
            int i11 = this.f90277d[i10 % this.f90276c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f90279f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f90278e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f90279f[i11] != i10);
            if (i11 != -1 && this.f90279f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // i0.b.a
    public void k(float f10) {
        int i10 = this.f90283j;
        int i11 = this.f90284k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f90280g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f90282i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // i0.b.a
    public void l(i iVar, float f10, boolean z10) {
        float f11 = f90273p;
        if (f10 <= (-f11) || f10 >= f11) {
            int iJ = j(iVar);
            if (iJ == -1) {
                i(iVar, f10);
                return;
            }
            float[] fArr = this.f90280g;
            float f12 = fArr[iJ] + f10;
            fArr[iJ] = f12;
            float f13 = f90273p;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iJ] = 0.0f;
            e(iVar, z10);
        }
    }

    @Override // i0.b.a
    public void m() {
        int i10 = this.f90283j;
        int i11 = this.f90284k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f90280g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f90282i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // i0.b.a
    public float n(i iVar) {
        int iJ = j(iVar);
        if (iJ != -1) {
            return this.f90280g[iJ];
        }
        return 0.0f;
    }

    @Override // i0.b.a
    public int o() {
        return 0;
    }

    @Override // i0.b.a
    public void p() {
        int i10 = this.f90283j;
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
        int i11 = this.f90283j;
        int i12 = this.f90284k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f90280g[i12];
            }
            i12 = this.f90282i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public final int r() {
        for (int i10 = 0; i10 < this.f90275b; i10++) {
            if (this.f90279f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        int i10 = this.f90275b * 2;
        this.f90279f = Arrays.copyOf(this.f90279f, i10);
        this.f90280g = Arrays.copyOf(this.f90280g, i10);
        this.f90281h = Arrays.copyOf(this.f90281h, i10);
        this.f90282i = Arrays.copyOf(this.f90282i, i10);
        this.f90278e = Arrays.copyOf(this.f90278e, i10);
        for (int i11 = this.f90275b; i11 < i10; i11++) {
            this.f90279f[i11] = -1;
            this.f90278e[i11] = -1;
        }
        this.f90275b = i10;
    }

    public final void t(int i10, i iVar, float f10) {
        int iR = r();
        b(iR, iVar, f10);
        if (i10 != -1) {
            this.f90281h[iR] = i10;
            int[] iArr = this.f90282i;
            iArr[iR] = iArr[i10];
            iArr[i10] = iR;
        } else {
            this.f90281h[iR] = -1;
            if (this.f90283j > 0) {
                this.f90282i[iR] = this.f90284k;
                this.f90284k = iR;
            } else {
                this.f90282i[iR] = -1;
            }
        }
        int i11 = this.f90282i[iR];
        if (i11 != -1) {
            this.f90281h[i11] = iR;
        }
        a(iVar, iR);
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f90283j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarF = f(i11);
            if (iVarF != null) {
                String str2 = str + iVarF + " = " + q(i11) + " ";
                int iJ = j(iVarF);
                String str3 = str2 + "[p: ";
                String str4 = (this.f90281h[iJ] != -1 ? str3 + this.f90286m.f90171d[this.f90279f[this.f90281h[iJ]]] : str3 + "none") + ", n: ";
                str = (this.f90282i[iJ] != -1 ? str4 + this.f90286m.f90171d[this.f90279f[this.f90282i[iJ]]] : str4 + "none") + C4235d4.j.f61462e;
            }
        }
        return str + " }";
    }

    public final void u(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f90250d;
        int i12 = i11 % this.f90276c;
        int[] iArr2 = this.f90277d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f90279f[i13] == i11) {
            int[] iArr3 = this.f90278e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f90278e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f90279f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f90279f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }
}
