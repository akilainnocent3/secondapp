package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f153888a;

    public pc2(w5 w5Var) {
        this.f153888a = w5Var;
    }

    public final LinkedHashMap a(Set set) {
        List listA6;
        w5 w5Var = this.f153888a;
        synchronized (w5Var.f157205a) {
            listA6 = fr.r0.a6(w5Var.f157208d);
        }
        zu.m<u5> mVarP0 = zu.k0.P0(fr.r0.E1(listA6), new oc2(set));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (u5 u5Var : mVarP0) {
            String str = u5Var.f156276a.f156768b;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(u5Var.f156277b);
        }
        return linkedHashMap;
    }
}
