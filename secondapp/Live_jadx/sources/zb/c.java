package zb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<d, Integer> f160963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d> f160964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f160966d;

    public c(Map<d, Integer> map) {
        this.f160963a = map;
        this.f160964b = new ArrayList(map.keySet());
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            this.f160965c += it.next().intValue();
        }
    }

    public int a() {
        return this.f160965c;
    }

    public boolean b() {
        return this.f160965c == 0;
    }

    public d c() {
        d dVar = this.f160964b.get(this.f160966d);
        Integer num = this.f160963a.get(dVar);
        if (num.intValue() == 1) {
            this.f160963a.remove(dVar);
            this.f160964b.remove(this.f160966d);
        } else {
            this.f160963a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f160965c--;
        this.f160966d = this.f160964b.isEmpty() ? 0 : (this.f160966d + 1) % this.f160964b.size();
        return dVar;
    }
}
