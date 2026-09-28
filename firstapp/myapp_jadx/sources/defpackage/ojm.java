package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ojm extends gw6 {
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
            rwd0Var.b(obj).g();
        }
        int size2 = arrayList.size();
        rwa rwaVar = null;
        int i2 = 0;
        rwa rwaVar2 = null;
        while (true) {
            bVar = rwd0.b.i;
            if (i2 >= size2) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            i2++;
            rwa rwaVarB = rwd0Var.b(obj2);
            rwd0.b bVar2 = rwd0.b.f;
            if (rwaVar2 == null) {
                Object obj3 = this.N;
                if (obj3 != null) {
                    rwaVarB.o(obj3);
                    rwaVarB.k(this.l).m(this.r);
                } else {
                    Object obj4 = this.O;
                    if (obj4 != null) {
                        rwaVarB.d0 = bVar2;
                        rwaVarB.O = obj4;
                        rwaVarB.k(this.l).m(this.r);
                    } else {
                        Object obj5 = this.J;
                        if (obj5 != null) {
                            rwaVarB.o(obj5);
                            rwaVarB.k(this.j).m(this.p);
                        } else {
                            Object obj6 = this.K;
                            if (obj6 != null) {
                                rwaVarB.d0 = bVar2;
                                rwaVarB.O = obj6;
                                rwaVarB.k(this.j).m(this.p);
                            } else {
                                String string = rwaVarB.a.toString();
                                rwaVarB.o(0);
                                rwaVarB.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                            }
                        }
                    }
                }
                rwaVar2 = rwaVarB;
            }
            if (rwaVar != null) {
                String string2 = rwaVar.a.toString();
                String string3 = rwaVarB.a.toString();
                Object obj7 = rwaVarB.a;
                rwaVar.d0 = bVar;
                rwaVar.P = obj7;
                rwaVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj8 = rwaVar.a;
                rwaVarB.d0 = bVar2;
                rwaVarB.O = obj8;
                rwaVarB.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj2.toString();
            HashMap<String, Float> map = this.o0;
            float fFloatValue = map.containsKey(string4) ? map.get(string4).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                rwaVarB.f = fFloatValue;
            }
            rwaVar = rwaVarB;
        }
        if (rwaVar != null) {
            Object obj9 = this.P;
            if (obj9 != null) {
                rwaVar.d0 = bVar;
                rwaVar.P = obj9;
                rwaVar.k(this.m).m(this.s);
            } else {
                Object obj10 = this.Q;
                if (obj10 != null) {
                    rwaVar.i(obj10);
                    rwaVar.k(this.m).m(this.s);
                } else {
                    Object obj11 = this.L;
                    if (obj11 != null) {
                        rwaVar.d0 = bVar;
                        rwaVar.P = obj11;
                        rwaVar.k(this.k).m(this.q);
                    } else {
                        Object obj12 = this.M;
                        if (obj12 != null) {
                            rwaVar.i(obj12);
                            rwaVar.k(this.k).m(this.q);
                        } else {
                            String string5 = rwaVar.a.toString();
                            rwaVar.i(0);
                            rwaVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                        }
                    }
                }
            }
        }
        if (rwaVar2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            rwaVar2.h = f;
        }
        int iOrdinal = this.t0.ordinal();
        if (iOrdinal == 0) {
            rwaVar2.d = 0;
        } else if (iOrdinal == 1) {
            rwaVar2.d = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            rwaVar2.d = 2;
        }
    }
}
