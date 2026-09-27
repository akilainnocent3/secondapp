package ab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p<V, O> implements o<V, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<hb.a<V>> f4677a;

    public p(V v10) {
        this(Collections.singletonList(new hb.a(v10)));
    }

    @Override // ab.o
    public boolean e() {
        return this.f4677a.isEmpty() || (this.f4677a.size() == 1 && this.f4677a.get(0).i());
    }

    @Override // ab.o
    public List<hb.a<V>> g() {
        return this.f4677a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f4677a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f4677a.toArray()));
        }
        return sb2.toString();
    }

    public p(List<hb.a<V>> list) {
        this.f4677a = list;
    }
}
