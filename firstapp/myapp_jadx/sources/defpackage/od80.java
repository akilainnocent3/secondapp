package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class od80 implements Executor {
    public final Executor b;
    public final ArrayDeque a = new ArrayDeque();
    public final b c = new b();
    public c d = c.a;
    public long e = 0;

    public class a implements Runnable {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.run();
        }
    }

    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0034 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            defpackage.pgt.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                od80 r2 = defpackage.od80.this     // Catch: java.lang.Throwable -> L49
                java.util.ArrayDeque r2 = r2.a     // Catch: java.lang.Throwable -> L49
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L28
                od80 r0 = defpackage.od80.this     // Catch: java.lang.Throwable -> L1c
                od80$c r3 = r0.d     // Catch: java.lang.Throwable -> L1c
                od80$c r4 = od80.c.d     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
            L14:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                r9.interrupt()
                goto L3e
            L1c:
                r9 = move-exception
                goto L63
            L1e:
                long r5 = r0.e     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.e = r5     // Catch: java.lang.Throwable -> L1c
                r0.d = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                od80 r3 = defpackage.od80.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.a     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L3f
                od80 r9 = defpackage.od80.this     // Catch: java.lang.Throwable -> L1c
                od80$c r0 = od80.c.a     // Catch: java.lang.Throwable -> L1c
                r9.d = r0     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
                goto L14
            L3e:
                return
            L3f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L49
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4b
                goto L2
            L49:
                r9 = move-exception
                goto L65
            L4b:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                r5.<init>()     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L49
                r5.append(r3)     // Catch: java.lang.Throwable -> L49
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L49
                defpackage.pgt.d(r4, r3, r2)     // Catch: java.lang.Throwable -> L49
                goto L2
            L63:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r9     // Catch: java.lang.Throwable -> L49
            L65:
                if (r1 == 0) goto L6e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L6e:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: od80.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (od80.this.a) {
                    od80.this.d = c.a;
                    throw e;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final /* synthetic */ c[] e;

        static {
            c cVar = new c("IDLE", 0);
            a = cVar;
            c cVar2 = new c("QUEUING", 1);
            b = cVar2;
            c cVar3 = new c("QUEUED", 2);
            c = cVar3;
            c cVar4 = new c("RUNNING", 3);
            d = cVar4;
            e = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }
    }

    public od80(Executor executor) {
        executor.getClass();
        this.b = executor;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z;
        runnable.getClass();
        synchronized (this.a) {
            c cVar2 = this.d;
            if (cVar2 != c.d && cVar2 != (cVar = c.c)) {
                long j = this.e;
                a aVar = new a(runnable);
                this.a.add(aVar);
                c cVar3 = c.b;
                this.d = cVar3;
                try {
                    this.b.execute(this.c);
                    if (this.d != cVar3) {
                        return;
                    }
                    synchronized (this.a) {
                        try {
                            if (this.e == j && this.d == cVar3) {
                                this.d = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.a) {
                        try {
                            c cVar4 = this.d;
                            if (cVar4 != c.a && cVar4 != c.b) {
                                z = false;
                            } else if (this.a.removeLastOccurrence(aVar)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.a.add(runnable);
        }
    }
}
