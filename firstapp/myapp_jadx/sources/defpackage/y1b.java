package defpackage;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class y1b<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final v1b<R> a;

    public y1b(bc6 bc6Var) {
        super(false);
        this.a = bc6Var;
    }

    public final void onError(E e) {
        if (compareAndSet(false, true)) {
            v1b<R> v1bVar = this.a;
            zi50.a aVar = zi50.b;
            v1bVar.resumeWith(uj50.a(e));
        }
    }

    public final void onResult(R r) {
        if (compareAndSet(false, true)) {
            v1b<R> v1bVar = this.a;
            zi50.a aVar = zi50.b;
            v1bVar.resumeWith(r);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
