package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pg3 {
    public static og3 a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((ud3) obj).f156366a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        dr.z0 z0Var = new dr.z0(arrayList, arrayList2);
        return new og3((List) z0Var.g(), (List) z0Var.d());
    }
}
