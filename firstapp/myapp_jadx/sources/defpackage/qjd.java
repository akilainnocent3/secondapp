package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class qjd extends cui {
    @Override // defpackage.cui
    public final qjd a(cui cuiVar, CoroutineContext coroutineContext) {
        int i = qsh0.b;
        k5b.a aVar = k5b.a;
        k5b k5bVar = (k5b) cuiVar.get(aVar);
        k5b k5bVar2 = (k5b) coroutineContext.get(aVar);
        if ((k5bVar instanceof rjd) && k5bVar != k5bVar2) {
            ((rjd) k5bVar).c = 0;
        }
        return new qjd(coroutineContext);
    }
}
