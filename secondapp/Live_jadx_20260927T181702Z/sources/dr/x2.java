package dr;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class x2<T> implements i0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public ds.a<? extends T> f79518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public Object f79519c;

    public x2(@oy.l ds.a<? extends T> initializer) {
        kotlin.jvm.internal.m0.p(initializer, "initializer");
        this.f79518b = initializer;
        this.f79519c = p2.f79496a;
    }

    private final void a(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object d() {
        return new d0(getValue());
    }

    @Override // dr.i0
    public T getValue() {
        if (this.f79519c == p2.f79496a) {
            ds.a<? extends T> aVar = this.f79518b;
            kotlin.jvm.internal.m0.m(aVar);
            this.f79519c = aVar.invoke();
            this.f79518b = null;
        }
        return (T) this.f79519c;
    }

    @Override // dr.i0
    public boolean isInitialized() {
        return this.f79519c != p2.f79496a;
    }

    @oy.l
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
