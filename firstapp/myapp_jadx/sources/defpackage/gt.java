package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gt extends wil {
    public float n0;

    @Override // defpackage.wil, defpackage.rwa, defpackage.eq40, defpackage.e6h
    public final void apply() {
        int i = 0;
        ArrayList<Object> arrayList = this.m0;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rwa rwaVarB = this.k0.b(obj);
            rwaVarB.h();
            Object obj2 = this.R;
            if (obj2 != null) {
                rwaVarB.p(obj2);
            } else {
                Object obj3 = this.S;
                if (obj3 != null) {
                    rwaVarB.d0 = rwd0.b.y;
                    rwaVarB.S = obj3;
                } else {
                    rwaVarB.p(0);
                }
            }
            Object obj4 = this.U;
            if (obj4 != null) {
                rwaVarB.d0 = rwd0.b.A;
                rwaVarB.U = obj4;
            } else {
                Object obj5 = this.V;
                if (obj5 != null) {
                    rwaVarB.e(obj5);
                } else {
                    rwaVarB.e(0);
                }
            }
            float f = this.n0;
            if (f != 0.5f) {
                rwaVarB.i = f;
            }
        }
    }
}
