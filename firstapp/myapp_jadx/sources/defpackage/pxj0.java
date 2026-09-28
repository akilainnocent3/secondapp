package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pxj0 {
    public static final String e = jgt.g("WorkTimer");
    public final lfd a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public interface a {
        void a(ivj0 ivj0Var);
    }

    public static class b implements Runnable {
        public final pxj0 a;
        public final ivj0 b;

        public b(pxj0 pxj0Var, ivj0 ivj0Var) {
            this.a = pxj0Var;
            this.b = ivj0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.a.d) {
                try {
                    if (((b) this.a.b.remove(this.b)) != null) {
                        a aVar = (a) this.a.c.remove(this.b);
                        if (aVar != null) {
                            aVar.a(this.b);
                        }
                    } else {
                        jgt.e().a("WrkTimerRunnable", "Timer with " + this.b + " is already marked as complete.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public pxj0(lfd lfdVar) {
        this.a = lfdVar;
    }

    public final void a(ivj0 ivj0Var) {
        synchronized (this.d) {
            try {
                if (((b) this.b.remove(ivj0Var)) != null) {
                    jgt.e().a(e, "Stopping timer for " + ivj0Var);
                    this.c.remove(ivj0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
