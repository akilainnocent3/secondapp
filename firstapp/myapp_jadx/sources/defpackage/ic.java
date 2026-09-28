package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ic {
    public final ExecutorService a;
    public final HashMap b;
    public final ReferenceQueue<c7g<?>> c;
    public n6g d;

    public static final class a extends WeakReference<c7g<?>> {
        public final nlp a;
        public final boolean b;
        public qg50<?> c;

        public a(nlp nlpVar, c7g c7gVar, ReferenceQueue referenceQueue) {
            super(c7gVar, referenceQueue);
            gm20.c(nlpVar, "Argument must not be null");
            this.a = nlpVar;
            boolean z = c7gVar.a;
            this.c = null;
            this.b = z;
        }
    }

    public ic() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new gc());
        this.b = new HashMap();
        this.c = new ReferenceQueue<>();
        this.a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new hc(this));
    }

    public final synchronized void a(nlp nlpVar, c7g<?> c7gVar) {
        a aVar = (a) this.b.put(nlpVar, new a(nlpVar, c7gVar, this.c));
        if (aVar != null) {
            aVar.c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        qg50<?> qg50Var;
        synchronized (this) {
            this.b.remove(aVar.a);
            if (aVar.b && (qg50Var = aVar.c) != null) {
                this.d.a(aVar.a, new c7g<>(qg50Var, true, false, aVar.a, this.d));
            }
        }
    }
}
