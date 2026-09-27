package dr;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d0<T> implements i0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f79439b;

    public d0(T t10) {
        this.f79439b = t10;
    }

    @Override // dr.i0
    public T getValue() {
        return this.f79439b;
    }

    @Override // dr.i0
    public boolean isInitialized() {
        return true;
    }

    @oy.l
    public String toString() {
        return String.valueOf(getValue());
    }
}
