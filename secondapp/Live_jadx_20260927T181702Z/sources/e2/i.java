package e2;

import dr.i1;
import dr.w2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AtomicBoolean implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final or.f<w2> f79792b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@oy.l or.f<? super w2> fVar) {
        super(false);
        this.f79792b = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            or.f<w2> fVar = this.f79792b;
            i1.a aVar = i1.f79460c;
            fVar.resumeWith(i1.b(w2.f79517a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @oy.l
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
