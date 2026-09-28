package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class wxj0 {
    public static final nv5.d a(ExecutorService executorService, final Function0 function0) {
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            aVar.a(new Runnable() { // from class: uxj0
                @Override // java.lang.Runnable
                public final void run() {
                    atomicBoolean.set(true);
                }
            }, kqe.a);
            executorService.execute(new Runnable() { // from class: vxj0
                @Override // java.lang.Runnable
                public final void run() {
                    nv5.a aVar2 = aVar;
                    Function0 function1 = function0;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    try {
                        aVar2.b(function1.invoke());
                    } catch (Throwable th) {
                        aVar2.d(th);
                    }
                }
            });
            Unit unit = Unit.a;
            if (unit == null) {
                return dVar;
            }
            aVar.a = unit;
            return dVar;
        } catch (Exception e) {
            dVar.a(e);
            return dVar;
        }
    }
}
