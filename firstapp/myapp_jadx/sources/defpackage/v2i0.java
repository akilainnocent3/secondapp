package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v2i0 extends gw6 {
    @Override // defpackage.wil, defpackage.rwa, defpackage.eq40, defpackage.e6h
    public final void apply() {
        rwd0 rwd0Var;
        rwd0.b bVar;
        ArrayList<Object> arrayList = this.m0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            rwd0Var = this.k0;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            rwd0Var.b(obj).h();
        }
        int size2 = arrayList.size();
        rwa rwaVar = null;
        int i2 = 0;
        rwa rwaVar2 = null;
        while (true) {
            bVar = rwd0.b.A;
            if (i2 >= size2) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            i2++;
            rwa rwaVarB = rwd0Var.b(obj2);
            rwd0.b bVar2 = rwd0.b.y;
            if (rwaVar2 == null) {
                Object obj3 = this.R;
                if (obj3 != null) {
                    rwaVarB.p(obj3);
                    rwaVarB.k(this.n).m(this.t);
                } else {
                    Object obj4 = this.S;
                    if (obj4 != null) {
                        rwaVarB.d0 = bVar2;
                        rwaVarB.S = obj4;
                        rwaVarB.k(this.n).m(this.t);
                    } else {
                        String string = rwaVarB.a.toString();
                        rwaVarB.p(0);
                        rwaVarB.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                    }
                }
                rwaVar2 = rwaVarB;
            }
            if (rwaVar != null) {
                String string2 = rwaVar.a.toString();
                String string3 = rwaVarB.a.toString();
                Object obj5 = rwaVarB.a;
                rwaVar.d0 = bVar;
                rwaVar.U = obj5;
                rwaVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj6 = rwaVar.a;
                rwaVarB.d0 = bVar2;
                rwaVarB.S = obj6;
                rwaVarB.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj2.toString();
            HashMap<String, Float> map = this.o0;
            float fFloatValue = map.containsKey(string4) ? map.get(string4).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                rwaVarB.g = fFloatValue;
            }
            rwaVar = rwaVarB;
        }
        if (rwaVar != null) {
            Object obj7 = this.U;
            if (obj7 != null) {
                rwaVar.d0 = bVar;
                rwaVar.U = obj7;
                rwaVar.k(this.o).m(this.u);
            } else {
                Object obj8 = this.V;
                if (obj8 != null) {
                    rwaVar.e(obj8);
                    rwaVar.k(this.o).m(this.u);
                } else {
                    String string5 = rwaVar.a.toString();
                    rwaVar.e(0);
                    rwaVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                }
            }
        }
        if (rwaVar2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            rwaVar2.i = f;
        }
        int iOrdinal = this.t0.ordinal();
        if (iOrdinal == 0) {
            rwaVar2.e = 0;
        } else if (iOrdinal == 1) {
            rwaVar2.e = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            rwaVar2.e = 2;
        }
    }
}
