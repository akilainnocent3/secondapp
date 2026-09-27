package nj;

import cj.q9;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public final class w1<L> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f117327b = new s1(w1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b<L>> f117328a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<L> {
        void a(L listener);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<L> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final L f117329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f117330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @rj.a("this")
        public final Queue<a<L>> f117331d = q9.d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @rj.a("this")
        public final Queue<Object> f117332e = q9.d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @rj.a("this")
        public boolean f117333f;

        public b(L l10, Executor executor) {
            this.f117329b = (L) zi.l0.E(l10);
            this.f117330c = (Executor) zi.l0.E(executor);
        }

        public synchronized void a(a<L> event, Object label) {
            this.f117331d.add(event);
            this.f117332e.add(label);
        }

        public void b() throws Exception {
            boolean z10;
            synchronized (this) {
                try {
                    if (this.f117333f) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.f117333f = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                try {
                    this.f117330c.execute(this);
                } catch (Exception e10) {
                    synchronized (this) {
                        this.f117333f = false;
                        w1.f117327b.a().log(Level.SEVERE, "Exception while running callbacks for " + this.f117329b + " on " + this.f117330c, (Throwable) e10);
                        throw e10;
                    }
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x005e */
        /* JADX WARN: Code duplicated, block: B:28:0x0062  */
        /* JADX WARN: Code duplicated, block: B:38:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            r2.a(r9.f117329b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        
            nj.w1.f117327b.a().log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.f117329b + " " + r3, (java.lang.Throwable) r2);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r9 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L2b
                boolean r2 = r9.f117333f     // Catch: java.lang.Throwable -> L1f
                zi.l0.g0(r2)     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<nj.w1$a<L>> r2 = r9.f117331d     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L1f
                nj.w1$a r2 = (nj.w1.a) r2     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<java.lang.Object> r3 = r9.f117332e     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1f
                if (r2 != 0) goto L24
                r9.f117333f = r0     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = r0
                goto L57
            L1f:
                r2 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L57
            L24:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1f
                L r4 = r9.f117329b     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                r2.a(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                goto L0
            L2b:
                r2 = move-exception
                goto L60
            L2d:
                r2 = move-exception
                nj.s1 r4 = nj.w1.a()     // Catch: java.lang.Throwable -> L2b
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L2b
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L2b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r6.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = "Exception while executing callback: "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                L r7 = r9.f117329b     // Catch: java.lang.Throwable -> L2b
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = " "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                r6.append(r3)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L2b
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L2b
                goto L0
            L57:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L5e
                throw r1     // Catch: java.lang.Throwable -> L59
            L59:
                r1 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L60
            L5e:
                r1 = move-exception
                goto L57
            L60:
                if (r1 == 0) goto L6a
                monitor-enter(r9)
                r9.f117333f = r0     // Catch: java.lang.Throwable -> L67
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
                goto L6a
            L67:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
                throw r0
            L6a:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: nj.w1.b.run():void");
        }
    }

    public void b(L listener, Executor executor) {
        zi.l0.F(listener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        zi.l0.F(executor, "executor");
        this.f117328a.add(new b<>(listener, executor));
    }

    public void c() throws Exception {
        for (int i10 = 0; i10 < this.f117328a.size(); i10++) {
            this.f117328a.get(i10).b();
        }
    }

    public void d(a<L> event) {
        f(event, event);
    }

    public void e(a<L> event, String label) {
        f(event, label);
    }

    public final void f(a<L> event, Object label) {
        zi.l0.F(event, "event");
        zi.l0.F(label, "label");
        synchronized (this.f117328a) {
            try {
                Iterator<b<L>> it = this.f117328a.iterator();
                while (it.hasNext()) {
                    it.next().a(event, label);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
