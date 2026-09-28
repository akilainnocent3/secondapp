package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ii50 extends pz1 {
    public ii50(v1b<Object> v1bVar) {
        super(v1bVar);
        if (v1bVar == null || v1bVar.getContext() == e.a) {
            return;
        }
        hb5.a("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.v1b
    public final CoroutineContext getContext() {
        return e.a;
    }
}
