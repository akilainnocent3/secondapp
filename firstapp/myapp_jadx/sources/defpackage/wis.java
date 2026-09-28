package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wis {
    public static nv5.d a(final CoroutineContext coroutineContext, final Function2 function2) {
        final a6b a6bVar = a6b.a;
        coroutineContext.getClass();
        return nv5.a(new nv5.c() { // from class: ris
            @Override // nv5.c
            public final Object a(nv5.a aVar) {
                c9p.b bVar = c9p.b.a;
                CoroutineContext coroutineContext2 = coroutineContext;
                final c9p c9pVar = (c9p) coroutineContext2.get(bVar);
                aVar.a(new Runnable() { // from class: sis
                    @Override // java.lang.Runnable
                    public final void run() {
                        c9p c9pVar2 = c9pVar;
                        if (c9pVar2 != null) {
                            c9pVar2.cancel((CancellationException) null);
                        }
                    }
                }, kqe.a);
                return ej5.c(w5b.a(coroutineContext2), null, a6bVar, new vis(function2, aVar, null), 1);
            }
        });
    }
}
