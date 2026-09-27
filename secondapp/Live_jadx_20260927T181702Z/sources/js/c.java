package js;

import kotlin.jvm.internal.m0;
import ns.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c<V> implements f<Object, V> {
    private V value;

    public c(V v10) {
        this.value = v10;
    }

    public void afterChange(@l o<?> property, V v10, V v11) {
        m0.p(property, "property");
    }

    public boolean beforeChange(@l o<?> property, V v10, V v11) {
        m0.p(property, "property");
        return true;
    }

    @Override // js.f, js.e
    public V getValue(@m Object obj, @l o<?> property) {
        m0.p(property, "property");
        return this.value;
    }

    @Override // js.f
    public void setValue(@m Object obj, @l o<?> property, V v10) {
        m0.p(property, "property");
        V v11 = this.value;
        if (beforeChange(property, v11, v10)) {
            this.value = v10;
            afterChange(property, v11, v10);
        }
    }

    @l
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
