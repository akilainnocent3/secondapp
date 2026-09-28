package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ys7 {
    public final AtomicInteger a = new AtomicInteger(0);
    public final AtomicBoolean b = new AtomicBoolean(false);

    public ys7(lv50.e eVar) {
    }

    public final boolean a() {
        synchronized (this) {
            if (this.b.get()) {
                return false;
            }
            this.a.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            this.a.decrementAndGet();
            if (this.a.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            Unit unit = Unit.a;
        }
    }
}
