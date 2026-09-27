package dr;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k1<T> implements i0<T>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final a f79468e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<k1<?>, Object> f79469f = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "c");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public volatile ds.a<? extends T> f79470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public volatile Object f79471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final Object f79472d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    public k1(@oy.l ds.a<? extends T> initializer) {
        kotlin.jvm.internal.m0.p(initializer, "initializer");
        this.f79470b = initializer;
        p2 p2Var = p2.f79496a;
        this.f79471c = p2Var;
        this.f79472d = p2Var;
    }

    public final void e(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public final Object g() {
        return new d0(getValue());
    }

    @Override // dr.i0
    public T getValue() {
        T t10 = (T) this.f79471c;
        p2 p2Var = p2.f79496a;
        if (t10 != p2Var) {
            return t10;
        }
        ds.a<? extends T> aVar = this.f79470b;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (h0.b.a(f79469f, this, p2Var, tInvoke)) {
                this.f79470b = null;
                return tInvoke;
            }
        }
        return (T) this.f79471c;
    }

    @Override // dr.i0
    public boolean isInitialized() {
        return this.f79471c != p2.f79496a;
    }

    @oy.l
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public static /* synthetic */ void d() {
    }
}
