package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j760 implements ydy {
    public final /* synthetic */ CoroutineContext a;
    public final /* synthetic */ lyh b;

    public /* synthetic */ j760(lyh lyhVar, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = lyhVar;
    }

    @Override // defpackage.ydy
    public final void a(ycy.a aVar) {
        ec6 ec6Var = new ec6(new i760(ej5.b(q2l.a, fse.b.plus(this.a), a6b.c, new l760(this.b, aVar, null))));
        while (true) {
            pse pseVar = aVar.get();
            if (pseVar == xse.a) {
                ec6Var.dispose();
                return;
            }
            do {
                if (aVar.compareAndSet(pseVar, ec6Var)) {
                    if (pseVar != null) {
                        pseVar.dispose();
                        return;
                    }
                    return;
                }
            } while (aVar.get() == pseVar);
        }
    }
}
