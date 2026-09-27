package ak;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f5510g = Logger.getLogger(n0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k.a0("queue")
    public final Deque<Runnable> f5512c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.a0("queue")
    public c f5513d = c.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @k.a0("queue")
    public long f5514e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f5515f = new b(this, null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f5516b;

        public a(Runnable runnable) {
            this.f5516b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5516b.run();
        }

        public String toString() {
            return this.f5516b.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @zq.a
        public Runnable f5518b;

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
        
            r8.f5518b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            ak.n0.f5510g.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f5518b, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f5518b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
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
                ak.n0 r2 = ak.n0.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = ak.n0.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                ak.n0 r0 = ak.n0.this     // Catch: java.lang.Throwable -> L20
                ak.n0$c r0 = ak.n0.b(r0)     // Catch: java.lang.Throwable -> L20
                ak.n0$c r3 = ak.n0.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L7d
            L22:
                ak.n0 r0 = ak.n0.this     // Catch: java.lang.Throwable -> L20
                ak.n0.d(r0)     // Catch: java.lang.Throwable -> L20
                ak.n0 r0 = ak.n0.this     // Catch: java.lang.Throwable -> L20
                ak.n0.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                ak.n0 r3 = ak.n0.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = ak.n0.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f5518b = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                ak.n0 r0 = ak.n0.this     // Catch: java.lang.Throwable -> L20
                ak.n0$c r3 = ak.n0.c.IDLE     // Catch: java.lang.Throwable -> L20
                ak.n0.c(r0, r3)     // Catch: java.lang.Throwable -> L20
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
                java.lang.Runnable r3 = r8.f5518b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            L55:
                r8.f5518b = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L7f
            L5a:
                r0 = move-exception
                goto L7a
            L5c:
                r3 = move-exception
                java.util.logging.Logger r4 = ak.n0.e()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f5518b     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7a:
                r8.f5518b = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L7d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L7f:
                if (r1 == 0) goto L88
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L88:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ak.n0.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (n0.this.f5512c) {
                    n0.this.f5513d = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f5518b;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + n0.this.f5513d + "}";
        }

        public /* synthetic */ b(n0 n0Var, a aVar) {
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

    public n0(Executor executor) {
        this.f5511b = (Executor) Preconditions.checkNotNull(executor);
    }

    public static /* synthetic */ long d(n0 n0Var) {
        long j10 = n0Var.f5514e;
        n0Var.f5514e = 1 + j10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f5512c) {
            c cVar2 = this.f5513d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f5514e;
                a aVar = new a(runnable);
                this.f5512c.add(aVar);
                c cVar3 = c.QUEUING;
                this.f5513d = cVar3;
                try {
                    this.f5511b.execute(this.f5515f);
                    if (this.f5513d != cVar3) {
                        return;
                    }
                    synchronized (this.f5512c) {
                        try {
                            if (this.f5514e == j10 && this.f5513d == cVar3) {
                                this.f5513d = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f5512c) {
                        try {
                            c cVar4 = this.f5513d;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z10 = false;
                            } else if (this.f5512c.removeLastOccurrence(aVar)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            }
            this.f5512c.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f5511b + "}";
    }
}
