package f6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Long, h> f83493a = new LinkedHashMap();

    public void a(h hVar) {
        long[] jArr = hVar.f83486e;
        if (jArr.length <= 0 || this.f83493a.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.f83493a.put(Long.valueOf(hVar.f83486e[0]), hVar);
    }

    public void b() {
        this.f83493a.clear();
    }

    public h c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (h hVar : this.f83493a.values()) {
            arrayList.add(hVar.f83483b);
            arrayList2.add(hVar.f83484c);
            arrayList3.add(hVar.f83485d);
            arrayList4.add(hVar.f83486e);
        }
        return new h(lj.l.g((int[][]) arrayList.toArray(new int[arrayList.size()][])), lj.n.f((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), lj.n.f((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), lj.n.f((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int d() {
        return this.f83493a.size();
    }
}
