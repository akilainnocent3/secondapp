package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class or1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f153597a;

    public final ArrayList a(List list) {
        com.monetization.ads.mediation.base.a aVar;
        ar1 ar1Var;
        ArrayList arrayList = new ArrayList(fr.i0.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pq1 pq1Var = (pq1) it.next();
            List<oq1> list2 = pq1Var.f154072c;
            ArrayList arrayList2 = new ArrayList(fr.i0.d0(list2, 10));
            for (oq1 oq1Var : list2) {
                try {
                    aVar = (com.monetization.ads.mediation.base.a) om2.a(oq1Var.f153589b, new Object[0]);
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar == null) {
                    ar1Var = new ar1(oq1Var.f153588a, null, false);
                } else {
                    fo1 fo1Var = new fo1(aVar);
                    if (this.f153597a == null) {
                        this.f153597a = fo1Var.b().getNetworkSdkVersion();
                    }
                    ar1Var = new ar1(oq1Var.f153588a, fo1Var.b().getAdapterVersion(), true);
                }
                arrayList2.add(ar1Var);
            }
            String str = this.f153597a;
            this.f153597a = null;
            arrayList.add(new br1(pq1Var.f154070a, pq1Var.f154071b.f150252b, str, arrayList2));
        }
        return arrayList;
    }
}
