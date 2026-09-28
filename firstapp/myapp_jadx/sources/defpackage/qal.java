package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qal extends ixa {
    public boolean A0;
    public float v0 = -1.0f;
    public int w0 = -1;
    public int x0 = -1;
    public ewa y0 = this.L;
    public int z0 = 0;

    public qal() {
        this.T.clear();
        this.T.add(this.y0);
        int length = this.S.length;
        for (int i = 0; i < length; i++) {
            this.S[i] = this.y0;
        }
    }

    @Override // defpackage.ixa
    public final boolean C() {
        return this.A0;
    }

    @Override // defpackage.ixa
    public final boolean D() {
        return this.A0;
    }

    @Override // defpackage.ixa
    public final void V(ofs ofsVar, boolean z) {
        if (this.W == null) {
            return;
        }
        ewa ewaVar = this.y0;
        ofsVar.getClass();
        int iN = ofs.n(ewaVar);
        if (this.z0 == 1) {
            this.b0 = iN;
            this.c0 = 0;
            O(this.W.m());
            T(0);
            return;
        }
        this.b0 = 0;
        this.c0 = iN;
        T(this.W.s());
        O(0);
    }

    public final void W(int i) {
        this.y0.l(i);
        this.A0 = true;
    }

    public final void X(int i) {
        ewa ewaVar;
        if (this.z0 == i) {
            return;
        }
        this.z0 = i;
        ArrayList<ewa> arrayList = this.T;
        arrayList.clear();
        if (this.z0 == 1) {
            ewaVar = this.K;
            this.y0 = ewaVar;
        } else {
            ewaVar = this.L;
            this.y0 = ewaVar;
        }
        arrayList.add(ewaVar);
        ewa[] ewaVarArr = this.S;
        int length = ewaVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ewaVarArr[i2] = this.y0;
        }
    }

    @Override // defpackage.ixa
    public final void c(ofs ofsVar, boolean z) {
        jxa jxaVar = (jxa) this.W;
        if (jxaVar == null) {
            return;
        }
        Object objK = jxaVar.k(ewa.a.a);
        Object objK2 = jxaVar.k(ewa.a.c);
        ixa ixaVar = this.W;
        ixa.a aVar = ixa.a.b;
        boolean z2 = ixaVar != null && ixaVar.V[0] == aVar;
        if (this.z0 == 0) {
            objK = jxaVar.k(ewa.a.b);
            objK2 = jxaVar.k(ewa.a.d);
            ixa ixaVar2 = this.W;
            z2 = ixaVar2 != null && ixaVar2.V[1] == aVar;
        }
        if (this.A0) {
            ewa ewaVar = this.y0;
            if (ewaVar.c) {
                uoa0 uoa0VarK = ofsVar.k(ewaVar);
                ofsVar.d(uoa0VarK, this.y0.d());
                if (this.w0 != -1) {
                    if (z2) {
                        ofsVar.f(ofsVar.k(objK2), uoa0VarK, 0, 5);
                    }
                } else if (this.x0 != -1 && z2) {
                    uoa0 uoa0VarK2 = ofsVar.k(objK2);
                    ofsVar.f(uoa0VarK, ofsVar.k(objK), 0, 5);
                    ofsVar.f(uoa0VarK2, uoa0VarK, 0, 5);
                }
                this.A0 = false;
                return;
            }
        }
        if (this.w0 != -1) {
            uoa0 uoa0VarK3 = ofsVar.k(this.y0);
            ofsVar.e(uoa0VarK3, ofsVar.k(objK), this.w0, 8);
            if (z2) {
                ofsVar.f(ofsVar.k(objK2), uoa0VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.x0 != -1) {
            uoa0 uoa0VarK4 = ofsVar.k(this.y0);
            uoa0 uoa0VarK5 = ofsVar.k(objK2);
            ofsVar.e(uoa0VarK4, uoa0VarK5, -this.x0, 8);
            if (z2) {
                ofsVar.f(uoa0VarK4, ofsVar.k(objK), 0, 5);
                ofsVar.f(uoa0VarK5, uoa0VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.v0 != -1.0f) {
            uoa0 uoa0VarK6 = ofsVar.k(this.y0);
            uoa0 uoa0VarK7 = ofsVar.k(objK2);
            float f = this.v0;
            rx0 rx0VarL = ofsVar.l();
            rx0VarL.d.k(uoa0VarK6, -1.0f);
            rx0VarL.d.k(uoa0VarK7, f);
            ofsVar.c(rx0VarL);
        }
    }

    @Override // defpackage.ixa
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ixa
    public final void h(ixa ixaVar, HashMap<ixa, ixa> map) {
        super.h(ixaVar, map);
        qal qalVar = (qal) ixaVar;
        this.v0 = qalVar.v0;
        this.w0 = qalVar.w0;
        this.x0 = qalVar.x0;
        X(qalVar.z0);
    }

    @Override // defpackage.ixa
    public final ewa k(ewa.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.z0 == 0) {
                return this.y0;
            }
            return null;
        }
        if (this.z0 == 1) {
            return this.y0;
        }
        return null;
    }
}
