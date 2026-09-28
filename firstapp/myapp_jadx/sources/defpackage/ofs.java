package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import mw20.b;

/* JADX INFO: loaded from: classes.dex */
public final class ofs {
    public static boolean q = false;
    public final mw20 d;
    public final dr5 m;
    public rx0 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public uoa0[] n = new uoa0[1000];
    public int o = 0;
    public rx0[] g = new rx0[32];

    public interface a {
        uoa0 a(boolean[] zArr);
    }

    public ofs() {
        s();
        dr5 dr5Var = new dr5();
        dr5Var.a = new d220();
        dr5Var.b = new d220();
        dr5Var.c = new uoa0[32];
        this.m = dr5Var;
        mw20 mw20Var = new mw20(dr5Var);
        mw20Var.f = new uoa0[128];
        mw20Var.g = new uoa0[128];
        mw20Var.h = 0;
        mw20Var.i = mw20Var.new b();
        this.d = mw20Var;
        this.p = new rx0(dr5Var);
    }

    public static int n(Object obj) {
        uoa0 uoa0Var = ((ewa) obj).i;
        if (uoa0Var != null) {
            return (int) (uoa0Var.e + 0.5f);
        }
        return 0;
    }

    public final uoa0 a(uoa0.a aVar) {
        d220 d220Var = this.m.b;
        int i = d220Var.b;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = d220Var.a;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            d220Var.b = i2;
            obj = obj2;
        }
        uoa0 uoa0Var = (uoa0) obj;
        if (uoa0Var == null) {
            uoa0Var = new uoa0(aVar);
            uoa0Var.w = aVar;
        } else {
            uoa0Var.c();
            uoa0Var.w = aVar;
        }
        int i3 = this.o;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.a = i5;
            this.n = (uoa0[]) Arrays.copyOf(this.n, i5);
        }
        uoa0[] uoa0VarArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        uoa0VarArr[i6] = uoa0Var;
        return uoa0Var;
    }

    public final void b(uoa0 uoa0Var, uoa0 uoa0Var2, int i, float f, uoa0 uoa0Var3, uoa0 uoa0Var4, int i2, int i3) {
        rx0 rx0VarL = l();
        if (uoa0Var2 == uoa0Var3) {
            rx0VarL.d.k(uoa0Var, 1.0f);
            rx0VarL.d.k(uoa0Var4, 1.0f);
            rx0VarL.d.k(uoa0Var2, -2.0f);
        } else {
            rx0.a aVar = rx0VarL.d;
            if (f == 0.5f) {
                aVar.k(uoa0Var, 1.0f);
                rx0VarL.d.k(uoa0Var2, -1.0f);
                rx0VarL.d.k(uoa0Var3, -1.0f);
                rx0VarL.d.k(uoa0Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    rx0VarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                aVar.k(uoa0Var, -1.0f);
                rx0VarL.d.k(uoa0Var2, 1.0f);
                rx0VarL.b = i;
            } else if (f >= 1.0f) {
                aVar.k(uoa0Var4, -1.0f);
                rx0VarL.d.k(uoa0Var3, 1.0f);
                rx0VarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                aVar.k(uoa0Var, f2 * 1.0f);
                rx0VarL.d.k(uoa0Var2, f2 * (-1.0f));
                rx0VarL.d.k(uoa0Var3, (-1.0f) * f);
                rx0VarL.d.k(uoa0Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    rx0VarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            rx0VarL.b(this, i3);
        }
        c(rx0VarL);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0197  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    public final void c(rx0 rx0Var) {
        boolean z;
        uoa0.a aVar;
        boolean z2;
        uoa0 uoa0VarF;
        boolean z3 = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (rx0Var.e) {
            z = false;
        } else {
            ArrayList<uoa0> arrayList = rx0Var.c;
            if (this.g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iF = rx0Var.d.f();
                    for (int i = 0; i < iF; i++) {
                        uoa0 uoa0VarB = rx0Var.d.b(i);
                        if (uoa0VarB.c != -1 || uoa0VarB.f) {
                            arrayList.add(uoa0VarB);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            uoa0 uoa0Var = arrayList.get(i2);
                            if (uoa0Var.f) {
                                rx0Var.h(this, uoa0Var, true);
                            } else {
                                rx0Var.i(this, this.g[uoa0Var.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (rx0Var.a != null && rx0Var.d.f() == 0) {
                    rx0Var.e = true;
                    this.b = true;
                }
            }
            if (rx0Var.e()) {
                return;
            }
            float f = rx0Var.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                rx0Var.b = f * (-1.0f);
                rx0Var.d.c();
            }
            int iF2 = rx0Var.d.f();
            float f3 = 0.0f;
            float f4 = 0.0f;
            uoa0 uoa0Var2 = null;
            uoa0 uoa0Var3 = null;
            int i3 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (true) {
                aVar = uoa0.a.a;
                if (i3 >= iF2) {
                    break;
                }
                float fH = rx0Var.d.h(i3);
                float f5 = f2;
                uoa0 uoa0VarB2 = rx0Var.d.b(i3);
                if (uoa0VarB2.w == aVar) {
                    if (uoa0Var2 == null) {
                        if (uoa0VarB2.A <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        f3 = fH;
                        uoa0Var2 = uoa0VarB2;
                    } else {
                        if (f3 > fH) {
                            if (uoa0VarB2.A > 1) {
                                z5 = false;
                            }
                            f3 = fH;
                            uoa0Var2 = uoa0VarB2;
                        } else if (z5 || uoa0VarB2.A > 1) {
                        }
                        z5 = true;
                        f3 = fH;
                        uoa0Var2 = uoa0VarB2;
                    }
                } else if (uoa0Var2 == null && fH < f5) {
                    if (uoa0Var3 == null) {
                        if (uoa0VarB2.A <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        f4 = fH;
                        uoa0Var3 = uoa0VarB2;
                    } else {
                        if (f4 > fH) {
                            if (uoa0VarB2.A > 1) {
                                z6 = false;
                            }
                            f4 = fH;
                            uoa0Var3 = uoa0VarB2;
                        } else if (z6 || uoa0VarB2.A > 1) {
                        }
                        z6 = true;
                        f4 = fH;
                        uoa0Var3 = uoa0VarB2;
                    }
                }
                i3++;
                f2 = f5;
            }
            float f6 = f2;
            if (uoa0Var2 == null) {
                uoa0Var2 = uoa0Var3;
            }
            if (uoa0Var2 == null) {
                z2 = true;
            } else {
                rx0Var.g(uoa0Var2);
                z2 = false;
            }
            if (rx0Var.d.f() == 0) {
                rx0Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                uoa0 uoa0VarA = a(uoa0.a.b);
                int i4 = this.c + 1;
                this.c = i4;
                this.j++;
                uoa0VarA.b = i4;
                dr5 dr5Var = this.m;
                dr5Var.c[i4] = uoa0VarA;
                rx0Var.a = uoa0VarA;
                int i5 = this.k;
                h(rx0Var);
                if (this.k == i5 + 1) {
                    rx0 rx0Var2 = this.p;
                    rx0Var2.a = null;
                    rx0Var2.d.clear();
                    for (int i6 = 0; i6 < rx0Var.d.f(); i6++) {
                        rx0Var2.d.g(rx0Var.d.b(i6), rx0Var.d.h(i6), true);
                    }
                    r(this.p);
                    if (uoa0VarA.c == -1) {
                        if (rx0Var.a == uoa0VarA && (uoa0VarF = rx0Var.f(null, uoa0VarA)) != null) {
                            rx0Var.g(uoa0VarF);
                        }
                        if (!rx0Var.e) {
                            rx0Var.a.e(this, rx0Var);
                        }
                        dr5Var.a.a(rx0Var);
                        this.k--;
                    }
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            uoa0 uoa0Var4 = rx0Var.a;
            if (uoa0Var4 == null) {
                return;
            }
            if (uoa0Var4.w != aVar && rx0Var.b < f6) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        h(rx0Var);
    }

    public final void d(uoa0 uoa0Var, int i) {
        int i2 = uoa0Var.c;
        if (i2 == -1) {
            uoa0Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                uoa0 uoa0Var2 = this.m.c[i3];
            }
            return;
        }
        if (i2 == -1) {
            rx0 rx0VarL = l();
            rx0VarL.a = uoa0Var;
            float f = i;
            uoa0Var.e = f;
            rx0VarL.b = f;
            rx0VarL.e = true;
            c(rx0VarL);
            return;
        }
        rx0 rx0Var = this.g[i2];
        if (rx0Var.e) {
            rx0Var.b = i;
            return;
        }
        if (rx0Var.d.f() == 0) {
            rx0Var.e = true;
            rx0Var.b = i;
            return;
        }
        rx0 rx0VarL2 = l();
        if (i < 0) {
            rx0VarL2.b = i * (-1);
            rx0VarL2.d.k(uoa0Var, 1.0f);
        } else {
            rx0VarL2.b = i;
            rx0VarL2.d.k(uoa0Var, -1.0f);
        }
        c(rx0VarL2);
    }

    public final void e(uoa0 uoa0Var, uoa0 uoa0Var2, int i, int i2) {
        if (i2 == 8 && uoa0Var2.f && uoa0Var.c == -1) {
            uoa0Var.d(this, uoa0Var2.e + i);
            return;
        }
        rx0 rx0VarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            rx0VarL.b = i;
        }
        rx0.a aVar = rx0VarL.d;
        if (z) {
            aVar.k(uoa0Var, 1.0f);
            rx0VarL.d.k(uoa0Var2, -1.0f);
        } else {
            aVar.k(uoa0Var, -1.0f);
            rx0VarL.d.k(uoa0Var2, 1.0f);
        }
        if (i2 != 8) {
            rx0VarL.b(this, i2);
        }
        c(rx0VarL);
    }

    public final void f(uoa0 uoa0Var, uoa0 uoa0Var2, int i, int i2) {
        rx0 rx0VarL = l();
        uoa0 uoa0VarM = m();
        uoa0VarM.d = 0;
        rx0VarL.c(uoa0Var, uoa0Var2, uoa0VarM, i);
        if (i2 != 8) {
            rx0VarL.d.k(j(i2), (int) (rx0VarL.d.e(uoa0VarM) * (-1.0f)));
        }
        c(rx0VarL);
    }

    public final void g(uoa0 uoa0Var, uoa0 uoa0Var2, int i, int i2) {
        rx0 rx0VarL = l();
        uoa0 uoa0VarM = m();
        uoa0VarM.d = 0;
        rx0VarL.d(uoa0Var, uoa0Var2, uoa0VarM, i);
        if (i2 != 8) {
            rx0VarL.d.k(j(i2), (int) (rx0VarL.d.e(uoa0VarM) * (-1.0f)));
        }
        c(rx0VarL);
    }

    public final void h(rx0 rx0Var) {
        int i;
        if (rx0Var.e) {
            rx0Var.a.d(this, rx0Var.b);
        } else {
            rx0[] rx0VarArr = this.g;
            int i2 = this.k;
            rx0VarArr[i2] = rx0Var;
            uoa0 uoa0Var = rx0Var.a;
            uoa0Var.c = i2;
            this.k = i2 + 1;
            uoa0Var.e(this, rx0Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                rx0 rx0Var2 = this.g[i3];
                if (rx0Var2 != null && rx0Var2.e) {
                    rx0Var2.a.d(this, rx0Var2.b);
                    this.m.a.a(rx0Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        rx0[] rx0VarArr2 = this.g;
                        int i6 = i4 - 1;
                        rx0 rx0Var3 = rx0VarArr2[i4];
                        rx0VarArr2[i6] = rx0Var3;
                        uoa0 uoa0Var2 = rx0Var3.a;
                        if (uoa0Var2.c == i4) {
                            uoa0Var2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            rx0 rx0Var = this.g[i];
            rx0Var.a.e = rx0Var.b;
        }
    }

    public final uoa0 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        uoa0 uoa0VarA = a(uoa0.a.c);
        float[] fArr = uoa0VarA.v;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        uoa0VarA.b = i2;
        uoa0VarA.d = i;
        this.m.c[i2] = uoa0VarA;
        mw20 mw20Var = this.d;
        mw20Var.i.a = uoa0VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[uoa0VarA.d] = 1.0f;
        mw20Var.j(uoa0VarA);
        return uoa0VarA;
    }

    public final uoa0 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof ewa)) {
            return null;
        }
        ewa ewaVar = (ewa) obj;
        uoa0 uoa0Var = ewaVar.i;
        if (uoa0Var == null) {
            ewaVar.k();
            uoa0Var = ewaVar.i;
        }
        int i = uoa0Var.b;
        dr5 dr5Var = this.m;
        if (i != -1 && i <= this.c && dr5Var.c[i] != null) {
            return uoa0Var;
        }
        if (i != -1) {
            uoa0Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        uoa0Var.b = i2;
        uoa0Var.w = uoa0.a.a;
        dr5Var.c[i2] = uoa0Var;
        return uoa0Var;
    }

    public final rx0 l() {
        Object obj;
        dr5 dr5Var = this.m;
        d220 d220Var = dr5Var.a;
        int i = d220Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = d220Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            d220Var.b = i2;
        } else {
            obj = null;
        }
        rx0 rx0Var = (rx0) obj;
        if (rx0Var == null) {
            return new rx0(dr5Var);
        }
        rx0Var.a = null;
        rx0Var.d.clear();
        rx0Var.b = 0.0f;
        rx0Var.e = false;
        return rx0Var;
    }

    public final uoa0 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        uoa0 uoa0VarA = a(uoa0.a.b);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        uoa0VarA.b = i;
        this.m.c[i] = uoa0VarA;
        return uoa0VarA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (rx0[]) Arrays.copyOf(this.g, i);
        dr5 dr5Var = this.m;
        dr5Var.c = (uoa0[]) Arrays.copyOf(dr5Var.c, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        mw20 mw20Var = this.d;
        if (mw20Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(mw20Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(mw20Var);
                return;
            }
        }
        i();
    }

    public final void q(mw20 mw20Var) {
        for (int i = 0; i < this.k; i++) {
            rx0 rx0Var = this.g[i];
            uoa0.a aVar = rx0Var.a.w;
            uoa0.a aVar2 = uoa0.a.a;
            if (aVar != aVar2) {
                float f = 0.0f;
                if (rx0Var.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.k) {
                            rx0 rx0Var2 = this.g[i3];
                            if (rx0Var2.a.w != aVar2 && !rx0Var2.e && rx0Var2.b < f) {
                                int iF = rx0Var2.d.f();
                                int i7 = 0;
                                while (i7 < iF) {
                                    uoa0 uoa0VarB = rx0Var2.d.b(i7);
                                    float f3 = f;
                                    float fE = rx0Var2.d.e(uoa0VarB);
                                    if (fE > f3) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f4 = uoa0VarB.i[i8] / fE;
                                            if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = uoa0VarB.b;
                                                i4 = i3;
                                                f2 = f4;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = f3;
                                }
                            }
                            i3++;
                            f = f;
                        }
                        float f5 = f;
                        if (i4 != -1) {
                            rx0 rx0Var3 = this.g[i4];
                            rx0Var3.a.c = -1;
                            rx0Var3.g(this.m.c[i5]);
                            uoa0 uoa0Var = rx0Var3.a;
                            uoa0Var.c = i4;
                            uoa0Var.e(this, rx0Var3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f = f5;
                    }
                    break;
                }
            }
        }
        r(mw20Var);
        i();
    }

    public final void r(a aVar) {
        for (int i = 0; i < this.j; i++) {
            this.i[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.j * 2) {
                return;
            }
            if (((rx0) aVar).a != null) {
                this.i[((rx0) aVar).a.b] = true;
            }
            uoa0 uoa0VarA = aVar.a(this.i);
            if (uoa0VarA != null) {
                boolean[] zArr = this.i;
                int i3 = uoa0VarA.b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (uoa0VarA != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.k; i5++) {
                    rx0 rx0Var = this.g[i5];
                    if (rx0Var.a.w != uoa0.a.a && !rx0Var.e && rx0Var.d.a(uoa0VarA)) {
                        float fE = rx0Var.d.e(uoa0VarA);
                        if (fE < 0.0f) {
                            float f2 = (-rx0Var.b) / fE;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    rx0 rx0Var2 = this.g[i4];
                    rx0Var2.a.c = -1;
                    rx0Var2.g(uoa0VarA);
                    uoa0 uoa0Var = rx0Var2.a;
                    uoa0Var.c = i4;
                    uoa0Var.e(this, rx0Var2);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            rx0 rx0Var = this.g[i];
            if (rx0Var != null) {
                this.m.a.a(rx0Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        dr5 dr5Var;
        int i = 0;
        while (true) {
            dr5Var = this.m;
            uoa0[] uoa0VarArr = dr5Var.c;
            if (i >= uoa0VarArr.length) {
                break;
            }
            uoa0 uoa0Var = uoa0VarArr[i];
            if (uoa0Var != null) {
                uoa0Var.c();
            }
            i++;
        }
        d220 d220Var = dr5Var.b;
        uoa0[] uoa0VarArr2 = this.n;
        int length = this.o;
        d220Var.getClass();
        if (length > uoa0VarArr2.length) {
            length = uoa0VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            uoa0 uoa0Var2 = uoa0VarArr2[i2];
            int i3 = d220Var.b;
            Object[] objArr = d220Var.a;
            if (i3 < objArr.length) {
                objArr[i3] = uoa0Var2;
                d220Var.b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill(dr5Var.c, (Object) null);
        this.c = 0;
        mw20 mw20Var = this.d;
        mw20Var.h = 0;
        mw20Var.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            rx0 rx0Var = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new rx0(dr5Var);
    }
}
