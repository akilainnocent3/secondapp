package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f150411a;

    public i3(List list) {
        this.f150411a = a(list);
    }

    public static LinkedHashMap a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((o00) it.next(), h3.f149879b);
        }
        return linkedHashMap;
    }

    public final h3 a(o00 o00Var) {
        h3 h3Var = (h3) this.f150411a.get(o00Var);
        return h3Var == null ? h3.f149883f : h3Var;
    }
}
