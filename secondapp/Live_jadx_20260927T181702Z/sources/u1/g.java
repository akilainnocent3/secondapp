package u1;

import android.os.OutcomeReceiver;
import dr.i1;
import dr.j1;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(31)
public final class g<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final or.f<R> f137540b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@oy.l or.f<? super R> fVar) {
        super(false);
        this.f137540b = fVar;
    }

    public void onError(@oy.l E e10) {
        if (compareAndSet(false, true)) {
            or.f<R> fVar = this.f137540b;
            i1.a aVar = i1.f79460c;
            fVar.resumeWith(i1.b(j1.a(e10)));
        }
    }

    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            or.f<R> fVar = this.f137540b;
            i1.a aVar = i1.f79460c;
            fVar.resumeWith(i1.b(r10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @oy.l
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
