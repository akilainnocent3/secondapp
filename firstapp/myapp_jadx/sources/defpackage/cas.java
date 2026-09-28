package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cas implements Runnable {
    public final /* synthetic */ fas a;

    @Override // java.lang.Runnable
    public final void run() {
        fas fasVar = this.a;
        fasVar.e();
        gas gasVar = fasVar.d;
        Set<gas.a> setKeySet = fasVar.h;
        synchronized (gasVar.a) {
            if (setKeySet == null) {
                try {
                    setKeySet = gasVar.b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (gas.a aVar : setKeySet) {
                if (gasVar.b.containsKey(aVar)) {
                    gasVar.j((z9s) gasVar.b.get(aVar));
                }
            }
        }
    }
}
