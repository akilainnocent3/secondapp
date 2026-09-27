package js;

import kotlin.jvm.internal.m0;
import ns.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b<T> implements f<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @m
    public T f100688a;

    @Override // js.f, js.e
    @l
    public T getValue(@m Object obj, @l o<?> property) {
        m0.p(property, "property");
        T t10 = this.f100688a;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // js.f
    public void setValue(@m Object obj, @l o<?> property, @l T value) {
        m0.p(property, "property");
        m0.p(value, "value");
        this.f100688a = value;
    }

    @l
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NotNullProperty(");
        if (this.f100688a != null) {
            str = "value=" + this.f100688a;
        } else {
            str = "value not initialized yet";
        }
        sb2.append(str);
        sb2.append(')');
        return sb2.toString();
    }
}
