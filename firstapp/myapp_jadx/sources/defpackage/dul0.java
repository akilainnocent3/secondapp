package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dul0 {
    public final String a;
    public final boolean b;
    public final x8l0 c;
    public final BitSet d;
    public final BitSet e;
    public final ox0 f;
    public final ox0 g;
    public final /* synthetic */ knk0 h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dul0(knk0 knk0Var, String str, x8l0 x8l0Var, BitSet bitSet, BitSet bitSet2, ox0 ox0Var, ox0 ox0Var2) {
        this.h = knk0Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = ox0Var;
        this.g = new ox0();
        for (Integer num : (ox0.c) ox0Var2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) ox0Var2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = x8l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ymk0 ymk0Var) {
        int iA = ymk0Var.a();
        if (ymk0Var.c != null) {
            this.e.set(iA, true);
        }
        Boolean bool = ymk0Var.d;
        if (bool != null) {
            this.d.set(iA, bool.booleanValue());
        }
        if (ymk0Var.e != null) {
            Integer numValueOf = Integer.valueOf(iA);
            ox0 ox0Var = this.f;
            Long l = (Long) ox0Var.get(numValueOf);
            long jLongValue = ymk0Var.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                ox0Var.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (ymk0Var.f != null) {
            Integer numValueOf2 = Integer.valueOf(iA);
            ox0 ox0Var2 = this.g;
            List arrayList = (List) ox0Var2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ox0Var2.put(numValueOf2, arrayList);
            }
            if (ymk0Var.b()) {
                arrayList.clear();
            }
            epl0.a();
            k8l0 k8l0Var = this.h.a;
            wok0 wok0Var = k8l0Var.d;
            t2l0 t2l0Var = v2l0.F0;
            String str = this.a;
            if (wok0Var.q(str, t2l0Var) && ymk0Var.c()) {
                arrayList.clear();
            }
            epl0.a();
            boolean zQ = k8l0Var.d.q(str, t2l0Var);
            Long l2 = ymk0Var.f;
            if (!zQ) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i6l0 b(int i) {
        List list;
        g6l0 g6l0VarX = i6l0.x();
        g6l0VarX.g();
        ((i6l0) g6l0VarX.b).y(i);
        g6l0VarX.g();
        ((i6l0) g6l0VarX.b).B(this.b);
        x8l0 x8l0Var = this.c;
        if (x8l0Var != null) {
            g6l0VarX.g();
            ((i6l0) g6l0VarX.b).A(x8l0Var);
        }
        v8l0 v8l0VarY = x8l0.y();
        ArrayList arrayListJ = pol0.J(this.d);
        v8l0VarY.g();
        ((x8l0) v8l0VarY.b).C(arrayListJ);
        ArrayList arrayListJ2 = pol0.J(this.e);
        v8l0VarY.g();
        ((x8l0) v8l0VarY.b).A(arrayListJ2);
        ox0 ox0Var = this.f;
        ArrayList arrayList = new ArrayList(ox0Var.c);
        for (Integer num : (ox0.c) ox0Var.keySet()) {
            int iIntValue = num.intValue();
            Long l = (Long) ox0Var.get(num);
            if (l != null) {
                x6l0 x6l0VarU = z6l0.u();
                x6l0VarU.g();
                ((z6l0) x6l0VarU.b).v(iIntValue);
                long jLongValue = l.longValue();
                x6l0VarU.g();
                ((z6l0) x6l0VarU.b).w(jLongValue);
                arrayList.add((z6l0) x6l0VarU.i());
            }
        }
        v8l0VarY.g();
        ((x8l0) v8l0VarY.b).E(arrayList);
        ox0 ox0Var2 = this.g;
        if (ox0Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(ox0Var2.c);
            for (Integer num2 : (ox0.c) ox0Var2.keySet()) {
                z8l0 z8l0VarV = b9l0.v();
                int iIntValue2 = num2.intValue();
                z8l0VarV.g();
                ((b9l0) z8l0VarV.b).w(iIntValue2);
                List list2 = (List) ox0Var2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    z8l0VarV.g();
                    ((b9l0) z8l0VarV.b).x(list2);
                }
                arrayList2.add((b9l0) z8l0VarV.i());
            }
            list = arrayList2;
        }
        v8l0VarY.g();
        ((x8l0) v8l0VarY.b).G(list);
        g6l0VarX.g();
        ((i6l0) g6l0VarX.b).z((x8l0) v8l0VarY.i());
        return (i6l0) g6l0VarX.i();
    }

    public /* synthetic */ dul0(knk0 knk0Var, String str) {
        this.h = knk0Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new ox0();
        this.g = new ox0();
    }
}
