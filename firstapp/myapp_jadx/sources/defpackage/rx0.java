package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class rx0 implements ofs.a {
    public final a d;
    public uoa0 a = null;
    public float b = 0.0f;
    public final ArrayList<uoa0> c = new ArrayList<>();
    public boolean e = false;

    public interface a {
        boolean a(uoa0 uoa0Var);

        uoa0 b(int i);

        void c();

        void clear();

        float d(rx0 rx0Var, boolean z);

        float e(uoa0 uoa0Var);

        int f();

        void g(uoa0 uoa0Var, float f, boolean z);

        float h(int i);

        float i(uoa0 uoa0Var, boolean z);

        void j(float f);

        void k(uoa0 uoa0Var, float f);
    }

    public rx0(dr5 dr5Var) {
        this.d = new kx0(this, dr5Var);
    }

    @Override // ofs.a
    public uoa0 a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(ofs ofsVar, int i) {
        uoa0 uoa0VarJ = ofsVar.j(i);
        a aVar = this.d;
        aVar.k(uoa0VarJ, 1.0f);
        aVar.k(ofsVar.j(i), -1.0f);
    }

    public final void c(uoa0 uoa0Var, uoa0 uoa0Var2, uoa0 uoa0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a aVar = this.d;
        if (z) {
            aVar.k(uoa0Var, 1.0f);
            aVar.k(uoa0Var2, -1.0f);
            aVar.k(uoa0Var3, -1.0f);
        } else {
            aVar.k(uoa0Var, -1.0f);
            aVar.k(uoa0Var2, 1.0f);
            aVar.k(uoa0Var3, 1.0f);
        }
    }

    public final void d(uoa0 uoa0Var, uoa0 uoa0Var2, uoa0 uoa0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a aVar = this.d;
        if (z) {
            aVar.k(uoa0Var, 1.0f);
            aVar.k(uoa0Var2, -1.0f);
            aVar.k(uoa0Var3, 1.0f);
        } else {
            aVar.k(uoa0Var, -1.0f);
            aVar.k(uoa0Var2, 1.0f);
            aVar.k(uoa0Var3, -1.0f);
        }
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.f() == 0;
    }

    public final uoa0 f(boolean[] zArr, uoa0 uoa0Var) {
        uoa0.a aVar;
        a aVar2 = this.d;
        int iF = aVar2.f();
        uoa0 uoa0Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < iF; i++) {
            float fH = aVar2.h(i);
            if (fH < 0.0f) {
                uoa0 uoa0VarB = aVar2.b(i);
                if ((zArr == null || !zArr[uoa0VarB.b]) && uoa0VarB != uoa0Var && (((aVar = uoa0VarB.w) == uoa0.a.b || aVar == uoa0.a.c) && fH < f)) {
                    f = fH;
                    uoa0Var2 = uoa0VarB;
                }
            }
        }
        return uoa0Var2;
    }

    public final void g(uoa0 uoa0Var) {
        uoa0 uoa0Var2 = this.a;
        a aVar = this.d;
        if (uoa0Var2 != null) {
            aVar.k(uoa0Var2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fI = aVar.i(uoa0Var, true) * (-1.0f);
        this.a = uoa0Var;
        if (fI == 1.0f) {
            return;
        }
        this.b /= fI;
        aVar.j(fI);
    }

    public final void h(ofs ofsVar, uoa0 uoa0Var, boolean z) {
        if (uoa0Var.f) {
            a aVar = this.d;
            float fE = aVar.e(uoa0Var);
            this.b = (uoa0Var.e * fE) + this.b;
            aVar.i(uoa0Var, z);
            if (z) {
                uoa0Var.b(this);
            }
            if (aVar.f() == 0) {
                this.e = true;
                ofsVar.b = true;
            }
        }
    }

    public void i(ofs ofsVar, rx0 rx0Var, boolean z) {
        a aVar = this.d;
        float fD = aVar.d(rx0Var, z);
        this.b = (rx0Var.b * fD) + this.b;
        if (z) {
            rx0Var.a.b(this);
        }
        if (this.a == null || aVar.f() != 0) {
            return;
        }
        this.e = true;
        ofsVar.b = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            strConcat = strConcat + this.b;
            z = true;
        } else {
            z = false;
        }
        a aVar = this.d;
        int iF = aVar.f();
        for (int i = 0; i < iF; i++) {
            uoa0 uoa0VarB = aVar.b(i);
            if (uoa0VarB != null) {
                float fH = aVar.h(i);
                if (fH != 0.0f) {
                    String string = uoa0VarB.toString();
                    if (z) {
                        if (fH > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            fH *= -1.0f;
                        }
                    } else if (fH < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        fH *= -1.0f;
                    }
                    strConcat = fH == 1.0f ? strConcat.concat(string) : strConcat + fH + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }

    public rx0() {
    }
}
