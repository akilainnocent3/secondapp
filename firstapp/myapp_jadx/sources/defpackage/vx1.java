package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vx1 extends yil {
    public int x0 = 0;
    public boolean y0 = true;
    public int z0 = 0;
    public boolean A0 = false;

    @Override // defpackage.ixa
    public final boolean C() {
        return this.A0;
    }

    @Override // defpackage.ixa
    public final boolean D() {
        return this.A0;
    }

    public final boolean a0() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.w0;
            if (i4 >= i) {
                break;
            }
            ixa ixaVar = this.v0[i4];
            if ((this.y0 || ixaVar.d()) && ((((i2 = this.x0) == 0 || i2 == 1) && !ixaVar.C()) || (((i3 = this.x0) == 2 || i3 == 3) && !ixaVar.D()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.w0; i5++) {
            ixa ixaVar2 = this.v0[i5];
            if (this.y0 || ixaVar2.d()) {
                ewa.a aVar = ewa.a.d;
                ewa.a aVar2 = ewa.a.b;
                ewa.a aVar3 = ewa.a.c;
                ewa.a aVar4 = ewa.a.a;
                if (!z2) {
                    int i6 = this.x0;
                    if (i6 == 0) {
                        iMax = ixaVar2.k(aVar4).d();
                    } else if (i6 == 1) {
                        iMax = ixaVar2.k(aVar3).d();
                    } else if (i6 == 2) {
                        iMax = ixaVar2.k(aVar2).d();
                    } else if (i6 == 3) {
                        iMax = ixaVar2.k(aVar).d();
                    }
                    z2 = true;
                }
                int i7 = this.x0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, ixaVar2.k(aVar4).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, ixaVar2.k(aVar3).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, ixaVar2.k(aVar2).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, ixaVar2.k(aVar).d());
                }
            }
        }
        int i8 = iMax + this.z0;
        int i9 = this.x0;
        if (i9 == 0 || i9 == 1) {
            M(i8, i8);
        } else {
            N(i8, i8);
        }
        this.A0 = true;
        return true;
    }

    public final int b0() {
        int i = this.x0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.ixa
    public final void c(ofs ofsVar, boolean z) {
        boolean z2;
        int i;
        ewa[] ewaVarArr = this.S;
        ewa ewaVar = this.K;
        ewaVarArr[0] = ewaVar;
        int i2 = 2;
        ewa ewaVar2 = this.L;
        ewaVarArr[2] = ewaVar2;
        ewa ewaVar3 = this.M;
        ewaVarArr[1] = ewaVar3;
        ewa ewaVar4 = this.N;
        ewaVarArr[3] = ewaVar4;
        for (ewa ewaVar5 : ewaVarArr) {
            ewaVar5.i = ofsVar.k(ewaVar5);
        }
        int i3 = this.x0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        ewa ewaVar6 = ewaVarArr[i3];
        if (!this.A0) {
            a0();
        }
        if (this.A0) {
            this.A0 = false;
            int i4 = this.x0;
            if (i4 == 0 || i4 == 1) {
                ofsVar.d(ewaVar.i, this.b0);
                ofsVar.d(ewaVar3.i, this.b0);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    ofsVar.d(ewaVar2.i, this.c0);
                    ofsVar.d(ewaVar4.i, this.c0);
                    return;
                }
                return;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.w0) {
                z2 = false;
                break;
            }
            ixa ixaVar = this.v0[i5];
            if (this.y0 || ixaVar.d()) {
                int i6 = this.x0;
                ixa.a aVar = ixa.a.c;
                if (((i6 == 0 || i6 == 1) && ixaVar.V[0] == aVar && ixaVar.K.f != null && ixaVar.M.f != null) || ((i6 == 2 || i6 == 3) && ixaVar.V[1] == aVar && ixaVar.L.f != null && ixaVar.N.f != null)) {
                    z2 = true;
                    break;
                }
            }
            i5++;
        }
        boolean z3 = ewaVar.g() || ewaVar3.g();
        boolean z4 = ewaVar2.g() || ewaVar4.g();
        int i7 = !(!z2 && (((i = this.x0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.w0) {
            ixa ixaVar2 = this.v0[i8];
            if (this.y0 || ixaVar2.d()) {
                uoa0 uoa0VarK = ofsVar.k(ixaVar2.S[this.x0]);
                ewa[] ewaVarArr2 = ixaVar2.S;
                int i9 = this.x0;
                ewa ewaVar7 = ewaVarArr2[i9];
                ewaVar7.i = uoa0VarK;
                ewa ewaVar8 = ewaVar7.f;
                int i10 = (ewaVar8 == null || ewaVar8.d != this) ? 0 : ewaVar7.g;
                if (i9 == 0 || i9 == i2) {
                    uoa0 uoa0Var = ewaVar6.i;
                    int i11 = this.z0 - i10;
                    rx0 rx0VarL = ofsVar.l();
                    uoa0 uoa0VarM = ofsVar.m();
                    uoa0VarM.d = 0;
                    rx0VarL.d(uoa0Var, uoa0VarK, uoa0VarM, i11);
                    ofsVar.c(rx0VarL);
                } else {
                    uoa0 uoa0Var2 = ewaVar6.i;
                    int i12 = this.z0 + i10;
                    rx0 rx0VarL2 = ofsVar.l();
                    uoa0 uoa0VarM2 = ofsVar.m();
                    uoa0VarM2.d = 0;
                    rx0VarL2.c(uoa0Var2, uoa0VarK, uoa0VarM2, i12);
                    ofsVar.c(rx0VarL2);
                }
                ofsVar.e(ewaVar6.i, uoa0VarK, this.z0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.x0;
        if (i13 == 0) {
            ofsVar.e(ewaVar3.i, ewaVar.i, 0, 8);
            ofsVar.e(ewaVar.i, this.W.M.i, 0, 4);
            ofsVar.e(ewaVar.i, this.W.K.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            ofsVar.e(ewaVar.i, ewaVar3.i, 0, 8);
            ofsVar.e(ewaVar.i, this.W.K.i, 0, 4);
            ofsVar.e(ewaVar.i, this.W.M.i, 0, 0);
        } else if (i13 == 2) {
            ofsVar.e(ewaVar4.i, ewaVar2.i, 0, 8);
            ofsVar.e(ewaVar2.i, this.W.N.i, 0, 4);
            ofsVar.e(ewaVar2.i, this.W.L.i, 0, 0);
        } else if (i13 == 3) {
            ofsVar.e(ewaVar2.i, ewaVar4.i, 0, 8);
            ofsVar.e(ewaVar2.i, this.W.L.i, 0, 4);
            ofsVar.e(ewaVar2.i, this.W.N.i, 0, 0);
        }
    }

    @Override // defpackage.ixa
    public final boolean d() {
        return true;
    }

    @Override // defpackage.yil, defpackage.ixa
    public final void h(ixa ixaVar, HashMap<ixa, ixa> map) {
        super.h(ixaVar, map);
        vx1 vx1Var = (vx1) ixaVar;
        this.x0 = vx1Var.x0;
        this.y0 = vx1Var.y0;
        this.z0 = vx1Var.z0;
    }

    @Override // defpackage.ixa
    public final String toString() {
        String strA = uf80.a(new StringBuilder("[Barrier] "), this.l0, " {");
        for (int i = 0; i < this.w0; i++) {
            ixa ixaVar = this.v0[i];
            if (i > 0) {
                strA = strA.concat(", ");
            }
            strA = strA + ixaVar.l0;
        }
        return strA.concat("}");
    }
}
