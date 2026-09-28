package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class puw {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final tuw b = uuw.a();

    public static final class a {
        public final huw a;
        public final c9p b;

        public a(huw huwVar, c9p c9pVar) {
            this.a = huwVar;
            this.b = c9pVar;
        }
    }

    public static Object a(puw puwVar, Function1 function1, v1b v1bVar) {
        huw huwVar = huw.a;
        puwVar.getClass();
        return w5b.d(new muw(huwVar, puwVar, function1, null), v1bVar);
    }

    public final void b(a aVar) {
        while (true) {
            AtomicReference<a> atomicReference = this.a;
            a aVar2 = atomicReference.get();
            if (aVar2 != null && aVar.a.compareTo(aVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(aVar2, aVar)) {
                    if (aVar2 != null) {
                        aVar2.b.cancel((CancellationException) new juw("Mutation interrupted"));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVar2);
        }
    }
}
