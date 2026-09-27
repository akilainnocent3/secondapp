package nj;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public final class k2 implements Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s1 f117098g = new s1(k2.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f117099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @rj.a("queue")
    public final Deque<Runnable> f117100c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @rj.a("queue")
    @rj.b
    public c f117101d = c.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @rj.a("queue")
    public long f117102e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @km.j
    public final b f117103f = new b(this, null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f117104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k2 f117105c;

        public a(final k2 this$0, final Runnable val$task) {
            this.f117104b = val$task;
            this.f117105c = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f117104b.run();
        }

        public String toString() {
            return this.f117104b.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @zq.a
        public Runnable f117106b;

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f117106b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            nj.k2.f117098g.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f117106b, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
        
            r8.f117106b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                nj.k2 r2 = nj.k2.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = nj.k2.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                nj.k2 r0 = nj.k2.this     // Catch: java.lang.Throwable -> L20
                nj.k2$c r0 = nj.k2.b(r0)     // Catch: java.lang.Throwable -> L20
                nj.k2$c r3 = nj.k2.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L81
            L22:
                nj.k2 r0 = nj.k2.this     // Catch: java.lang.Throwable -> L20
                nj.k2.d(r0)     // Catch: java.lang.Throwable -> L20
                nj.k2 r0 = nj.k2.this     // Catch: java.lang.Throwable -> L20
                nj.k2.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                nj.k2 r3 = nj.k2.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = nj.k2.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f117106b = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                nj.k2 r0 = nj.k2.this     // Catch: java.lang.Throwable -> L20
                nj.k2$c r3 = nj.k2.c.IDLE     // Catch: java.lang.Throwable -> L20
                nj.k2.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f117106b     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            L55:
                r8.f117106b = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L83
            L5a:
                r0 = move-exception
                goto L7e
            L5c:
                r3 = move-exception
                nj.s1 r4 = nj.k2.e()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f117106b     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7e:
                r8.f117106b = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L81:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L83:
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: nj.k2.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k2.this.f117100c) {
                    k2.this.f117101d = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f117106b;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + k2.this.f117101d + "}";
        }

        public /* synthetic */ b(k2 k2Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public k2(Executor executor) {
        this.f117099b = (Executor) zi.l0.E(executor);
    }

    public static /* synthetic */ long d(k2 k2Var) {
        long j10 = k2Var.f117102e;
        k2Var.f117102e = 1 + j10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable task) {
        c cVar;
        boolean z10;
        zi.l0.E(task);
        synchronized (this.f117100c) {
            c cVar2 = this.f117101d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f117102e;
                a aVar = new a(this, task);
                this.f117100c.add(aVar);
                c cVar3 = c.QUEUING;
                this.f117101d = cVar3;
                try {
                    this.f117099b.execute(this.f117103f);
                    if (this.f117101d != cVar3) {
                        return;
                    }
                    synchronized (this.f117100c) {
                        try {
                            if (this.f117102e == j10 && this.f117101d == cVar3) {
                                this.f117101d = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    synchronized (this.f117100c) {
                        try {
                            c cVar4 = this.f117101d;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z10 = false;
                            } else if (this.f117100c.removeLastOccurrence(aVar)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!(th3 instanceof RejectedExecutionException) || z10) {
                                throw th3;
                            }
                            return;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            this.f117100c.add(task);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f117099b + "}";
    }
}
