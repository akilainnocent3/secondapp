package e2;

import dr.i1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(24)
public final class h<T> extends AtomicBoolean implements Consumer<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final or.f<T> f79791b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@oy.l or.f<? super T> fVar) {
        super(false);
        this.f79791b = fVar;
    }

    @Override // java.util.function.Consumer
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            or.f<T> fVar = this.f79791b;
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
