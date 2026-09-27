package dr;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class s1<T> implements i0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public ds.a<? extends T> f79508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public volatile Object f79509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final Object f79510d;

    public s1(@oy.l ds.a<? extends T> initializer, @oy.m Object obj) {
        kotlin.jvm.internal.m0.p(initializer, "initializer");
        this.f79508b = initializer;
        this.f79509c = p2.f79496a;
        this.f79510d = obj == null ? this : obj;
    }

    private final Object d() {
        return new d0(getValue());
    }

    @Override // dr.i0
    public T getValue() {
        T tInvoke;
        T t10 = (T) this.f79509c;
        p2 p2Var = p2.f79496a;
        if (t10 != p2Var) {
            return t10;
        }
        synchronized (this.f79510d) {
            tInvoke = (T) this.f79509c;
            if (tInvoke == p2Var) {
                ds.a<? extends T> aVar = this.f79508b;
                kotlin.jvm.internal.m0.m(aVar);
                tInvoke = aVar.invoke();
                this.f79509c = tInvoke;
                this.f79508b = null;
            }
        }
        return tInvoke;
    }

    @Override // dr.i0
    public boolean isInitialized() {
        return this.f79509c != p2.f79496a;
    }

    @oy.l
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ s1(ds.a aVar, Object obj, int i10, kotlin.jvm.internal.x xVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
