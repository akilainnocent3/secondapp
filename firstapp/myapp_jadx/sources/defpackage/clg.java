package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class clg implements aee0, n830 {
    public final HashMap a;
    public ArrayDeque b;

    public clg() {
        ich0 ich0Var = ich0.a;
        this.a = new HashMap();
        this.b = new ArrayDeque();
    }

    @Override // defpackage.aee0
    public final void a(fqh fqhVar) {
        b(ich0.a, fqhVar);
    }

    @Override // defpackage.aee0
    public final synchronized void b(Executor executor, gpg gpgVar) {
        try {
            if (!this.a.containsKey(voc.class)) {
                this.a.put(voc.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(voc.class)).put(gpgVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
