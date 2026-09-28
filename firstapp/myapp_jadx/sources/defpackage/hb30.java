package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public abstract class hb30<T, U, V> extends ib30 implements n3i<T> {
    public final AtomicInteger a = new AtomicInteger();
    public final AtomicLong b = new AtomicLong();
    public final je80 c;
    public final r8w d;
    public volatile boolean e;
    public volatile boolean f;

    public hb30(je80 je80Var, r8w r8wVar) {
        this.c = je80Var;
        this.d = r8wVar;
    }

    public abstract void e(je80 je80Var, Object obj);

    public final boolean f() {
        return this.a.getAndIncrement() == 0;
    }

    public final void g(Object obj, pse pseVar) {
        je80 je80Var = this.c;
        r8w r8wVar = this.d;
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            long j = this.b.get();
            if (j == 0) {
                this.e = true;
                pseVar.dispose();
                je80Var.onError(new sqv("Could not emit buffer due to lack of requests"));
                return;
            } else if (r8wVar.isEmpty()) {
                e(je80Var, obj);
                if (j != Long.MAX_VALUE) {
                    this.b.addAndGet(-1L);
                }
                if (this.a.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                r8wVar.offer(obj);
            }
        } else {
            r8wVar.offer(obj);
            if (!f()) {
                return;
            }
        }
        k1l.a(r8wVar, je80Var, pseVar, this);
    }
}
