package nj;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public final class q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s1 f117252c = new s1(q0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @zq.a
    @rj.a("this")
    public a f117253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @rj.a("this")
    public boolean f117254b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f117255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f117256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @zq.a
        public a f117257c;

        public a(Runnable runnable, Executor executor, @zq.a a next) {
            this.f117255a = runnable;
            this.f117256b = executor;
            this.f117257c = next;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f117252c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        zi.l0.F(runnable, "Runnable was null.");
        zi.l0.F(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (this.f117254b) {
                    c(runnable, executor);
                } else {
                    this.f117253a = new a(runnable, executor, this.f117253a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (this) {
            try {
                if (this.f117254b) {
                    return;
                }
                this.f117254b = true;
                a aVar = this.f117253a;
                a aVar2 = null;
                this.f117253a = null;
                while (aVar != null) {
                    a aVar3 = aVar.f117257c;
                    aVar.f117257c = aVar2;
                    aVar2 = aVar;
                    aVar = aVar3;
                }
                while (aVar2 != null) {
                    c(aVar2.f117255a, aVar2.f117256b);
                    aVar2 = aVar2.f117257c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
