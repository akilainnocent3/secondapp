package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.OddsFilterData;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rec0 extends pf implements Function2<bkc0, v1b<? super Unit>, Object> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bkc0 bkc0Var, v1b<? super Unit> v1bVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        bkc0 bkc0Var2 = bkc0Var;
        oec0 oec0Var = (oec0) this.a;
        ihy ihyVar = oec0Var.a;
        wwd0 wwd0Var = oec0Var.h;
        wwd0 wwd0Var2 = oec0Var.i;
        ?? arrayList = 0;
        bkc0.c cVar = bkc0Var2 instanceof bkc0.c ? (bkc0.c) bkc0Var2 : null;
        if ((cVar != null ? cVar.b : null) != uhc0.b) {
            do {
                value3 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value3, n1a0.c));
            do {
                value4 = wwd0Var.getValue();
                ((Boolean) value4).getClass();
            } while (!wwd0Var.g(value4, Boolean.FALSE));
        } else {
            pjc0 pjc0Var = cVar.a;
            hcc0 hcc0Var = pjc0Var.c;
            List<icc0> list = hcc0Var != null ? hcc0Var.b : null;
            OddsFilterData oddsFilterData = pjc0Var.a.f;
            if (!Intrinsics.g(oec0Var.k, oddsFilterData)) {
                ihyVar.O0(oddsFilterData);
                oec0Var.k = oddsFilterData;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    p48.w(((icc0) it.next()).d, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    p48.w(((sdc0) obj).i, arrayList3);
                }
                arrayList = new ArrayList(l48.r(arrayList3, 10));
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    gfc0 gfc0Var = (gfc0) obj2;
                    gfc0Var.getClass();
                    arrayList.add(new Outcome(gfc0Var.a, gfc0Var.b.toPlainString(), gfc0Var.c, gfc0Var.d, gfc0Var.e, null));
                }
            }
            if (arrayList == 0) {
                arrayList = m2g.a;
            }
            qcn qcnVarB = a4h.b(arrayList);
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, qcnVarB));
            do {
                value2 = wwd0Var.getValue();
                ((Boolean) value2).getClass();
            } while (!wwd0Var.g(value2, Boolean.valueOf(!qcnVarB.isEmpty() && ihyVar.d0())));
        }
        return Unit.a;
    }
}
