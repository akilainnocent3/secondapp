package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class sk90 implements fra0 {
    public static final fo8.a f = new fo8.a("simple_span_processor");
    public static final Logger i = Logger.getLogger(sk90.class.getName());
    public final ugt a;
    public final gra0 d;
    public final Set<rm8> b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final Object e = new Object();

    public sk90(ugt ugtVar, ks70 ks70Var) {
        this.a = ugtVar;
        this.d = new pa80(f, ks70Var);
    }

    @Override // defpackage.fra0
    public final boolean B1() {
        return true;
    }

    @Override // defpackage.fra0
    public final boolean C() {
        return false;
    }

    @Override // defpackage.fra0
    public final rm8 j() {
        return rm8.e(this.b);
    }

    @Override // defpackage.fra0
    public final void r0(at70 at70Var) {
        final rm8 rm8VarK0;
        if ((at70Var.b.b().b & 1) != 0) {
            try {
                List listSingletonList = Collections.singletonList(at70Var.e());
                synchronized (this.e) {
                    rm8VarK0 = this.a.k0(listSingletonList);
                }
                this.b.add(rm8VarK0);
                rm8VarK0.g(new Runnable() { // from class: rk90
                    @Override // java.lang.Runnable
                    public final void run() {
                        String name;
                        sk90 sk90Var = this.a;
                        Set<rm8> set = sk90Var.b;
                        rm8 rm8Var = rm8VarK0;
                        set.remove(rm8Var);
                        if (rm8Var.c()) {
                            name = null;
                        } else {
                            sk90.i.log(Level.FINE, "Exporter failed");
                            name = rm8Var.b() != null ? rm8Var.b().getClass().getName() : "export_failed";
                        }
                        sk90Var.d.c(1, name);
                    }
                });
            } catch (RuntimeException e) {
                i.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e);
            }
        }
    }

    @Override // defpackage.fra0
    public final void r1(m0b m0bVar, at70 at70Var) {
    }

    @Override // defpackage.fra0
    public final rm8 shutdown() {
        if (this.c.getAndSet(true)) {
            return rm8.e;
        }
        final rm8 rm8Var = new rm8();
        final rm8 rm8VarE = rm8.e(this.b);
        rm8VarE.g(new Runnable() { // from class: pk90
            @Override // java.lang.Runnable
            public final void run() {
                final rm8 rm8VarShutdown = this.a.a.shutdown();
                final rm8 rm8Var2 = rm8VarE;
                final rm8 rm8Var3 = rm8Var;
                rm8VarShutdown.g(new Runnable() { // from class: qk90
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zC = rm8Var2.c();
                        rm8 rm8Var4 = rm8Var3;
                        if (zC && rm8VarShutdown.c()) {
                            rm8Var4.f();
                        } else {
                            rm8Var4.a(null);
                        }
                    }
                });
            }
        });
        return rm8Var;
    }

    public final String toString() {
        return "SimpleSpanProcessor{spanExporter=" + this.a + lobGSRIlnSGJY.smSk;
    }
}
