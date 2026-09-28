package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gmv {
    public final Runnable a;
    public final CopyOnWriteArrayList<bnv> b = new CopyOnWriteArrayList<>();
    public final HashMap c = new HashMap();

    public static class a {
        public final s9s a;
        public cbs b;

        public a(s9s s9sVar, cbs cbsVar) {
            this.a = s9sVar;
            this.b = cbsVar;
            s9sVar.a(cbsVar);
        }
    }

    public gmv(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(bnv bnvVar) {
        this.b.remove(bnvVar);
        a aVar = (a) this.c.remove(bnvVar);
        if (aVar != null) {
            aVar.a.d(aVar.b);
            aVar.b = null;
        }
        this.a.run();
    }
}
