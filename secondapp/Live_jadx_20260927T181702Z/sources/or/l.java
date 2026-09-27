package or;

import dr.l1;
import ds.p;
import java.io.Serializable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
public final class l implements j, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final l f119535b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f119536c = 0;

    public final Object d() {
        return f119535b;
    }

    @Override // or.j
    public <R> R fold(R r10, @oy.l p<? super R, ? super j.b, ? extends R> operation) {
        m0.p(operation, "operation");
        return r10;
    }

    @Override // or.j
    @oy.m
    public <E extends j.b> E get(@oy.l j.c<E> key) {
        m0.p(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // or.j
    @oy.l
    public j minusKey(@oy.l j.c<?> key) {
        m0.p(key, "key");
        return this;
    }

    @Override // or.j
    @oy.l
    public j plus(@oy.l j context) {
        m0.p(context, "context");
        return context;
    }

    @oy.l
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
