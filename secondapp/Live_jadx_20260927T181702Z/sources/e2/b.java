package e2;

import dr.i1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends AtomicBoolean implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final or.f<T> f79781b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@oy.l or.f<? super T> fVar) {
        super(false);
        this.f79781b = fVar;
    }

    @Override // e2.e
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            or.f<T> fVar = this.f79781b;
            i1.a aVar = i1.f79460c;
            fVar.resumeWith(i1.b(t10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @oy.l
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
