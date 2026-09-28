package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xjs<T> implements tcy<T> {
    public final ssw<a<T>> a = new ssw<>();
    public final HashMap b = new HashMap();
    public rjs c;

    public static final class a<T> {
        public final T a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj) {
            this.a = obj;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[Result: <");
            sb.append("Value: " + this.a);
            sb.append(">]");
            return sb.toString();
        }
    }

    @Override // defpackage.tcy
    public final qis<T> a() {
        return nv5.a(new osd(this));
    }

    @Override // defpackage.tcy
    public final void b(tcy.a<? super T> aVar) {
        synchronized (this.b) {
            this.b.remove(aVar);
            if (this.b.isEmpty()) {
                ((adl) mku.a()).execute(new Runnable() { // from class: ujs
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        xjs xjsVar = this.a;
                        rjs rjsVar = xjsVar.c;
                        if (rjsVar != null) {
                            xjsVar.a.k(rjsVar);
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.tcy
    public final void c(Executor executor, final tcy.a<? super T> aVar) {
        synchronized (this.b) {
            boolean zIsEmpty = this.b.isEmpty();
            this.b.put(aVar, executor);
            if (zIsEmpty) {
                ((adl) mku.a()).execute(new Runnable() { // from class: vjs
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        xjs xjsVar = this.a;
                        rjs rjsVar = xjsVar.c;
                        if (rjsVar == null) {
                            rjsVar = new rjs(xjsVar, 0);
                            xjsVar.c = rjsVar;
                        }
                        xjsVar.a.g(rjsVar);
                    }
                });
            } else {
                executor.execute(new Runnable() { // from class: tjs
                    @Override // java.lang.Runnable
                    public final void run() {
                        xjs.a aVar2 = (xjs.a) this.a.a.d();
                        if (aVar2 == null) {
                            return;
                        }
                        aVar.a(aVar2.a);
                    }
                });
            }
        }
    }
}
