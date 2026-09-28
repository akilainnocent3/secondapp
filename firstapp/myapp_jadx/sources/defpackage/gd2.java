package defpackage;

import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class gd2 implements tft {
    public static final String c;
    public final a a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public static final class a implements Runnable {
        public static final Logger B = Logger.getLogger(a.class.getName());
        public final long A;
        public final uft a;
        public final l4z b;
        public final long c;
        public final int d;
        public long e;
        public final ArrayBlockingQueue f;
        public final ArrayList<rft> z;
        public final AtomicInteger i = new AtomicInteger(Reader.READ_DONE);
        public final AtomicReference<rm8> w = new AtomicReference<>();
        public volatile boolean y = true;
        public final ArrayBlockingQueue v = new ArrayBlockingQueue(1);

        public a(l4z l4zVar, ks70 ks70Var, long j, int i, ArrayBlockingQueue arrayBlockingQueue, long j2) {
            this.b = l4zVar;
            this.c = j;
            this.d = i;
            this.f = arrayBlockingQueue;
            String str = gd2.c;
            this.a = new k5s(ks70Var);
            this.A = j2;
            this.z = new ArrayList<>(i);
        }

        public final void a() {
            Logger logger = B;
            uft uftVar = this.a;
            ArrayList<rft> arrayList = this.z;
            if (arrayList.isEmpty()) {
                return;
            }
            String name = null;
            try {
                try {
                    rm8 rm8VarK0 = this.b.k0(Collections.unmodifiableList(arrayList));
                    rm8VarK0.d(30000000000L, TimeUnit.NANOSECONDS);
                    if (!rm8VarK0.c()) {
                        logger.log(Level.FINE, "Exporter failed");
                        if (rm8VarK0.b() != null) {
                            name = rm8VarK0.b().getClass().getName();
                        } else {
                            name = "export_failed";
                        }
                    }
                    uftVar.b(arrayList.size(), name);
                } catch (RuntimeException e) {
                    logger.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e);
                    uftVar.b(arrayList.size(), e.getClass().getName());
                }
            } finally {
                uftVar.b(arrayList.size(), name);
                arrayList.clear();
            }
        }

        public final rm8 b() {
            AtomicReference<rm8> atomicReference;
            rm8 rm8Var = new rm8();
            do {
                atomicReference = this.w;
                if (atomicReference.compareAndSet(null, rm8Var)) {
                    this.v.offer(Boolean.TRUE);
                    break;
                }
            } while (atomicReference.get() == null);
            rm8 rm8Var2 = atomicReference.get();
            return rm8Var2 == null ? rm8.e : rm8Var2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.e = System.nanoTime() + this.c;
            while (this.y) {
                if (this.w.get() != null) {
                    AtomicReference<rm8> atomicReference = this.w;
                    ArrayList<rft> arrayList = this.z;
                    ArrayBlockingQueue arrayBlockingQueue = this.f;
                    int size = arrayBlockingQueue.size();
                    while (size > 0) {
                        arrayList.add(((p340) arrayBlockingQueue.poll()).a());
                        size--;
                        if (arrayList.size() >= this.d) {
                            a();
                        }
                    }
                    a();
                    rm8 rm8Var = atomicReference.get();
                    if (rm8Var != null) {
                        rm8Var.f();
                        atomicReference.set(null);
                    }
                }
                while (!this.f.isEmpty() && this.z.size() < this.d) {
                    this.z.add(((p340) this.f.poll()).a());
                }
                if (this.z.size() >= this.d || System.nanoTime() >= this.e) {
                    a();
                    this.e = System.nanoTime() + this.c;
                }
                if (this.f.isEmpty()) {
                    try {
                        long jNanoTime = this.e - System.nanoTime();
                        if (jNanoTime > 0) {
                            this.i.set(this.d - this.z.size());
                            this.v.poll(jNanoTime, TimeUnit.NANOSECONDS);
                            this.i.set(Reader.READ_DONE);
                        } else {
                            continue;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }
    }

    static {
        new fo8.a("batching_log_processor");
        c = gd2.class.getSimpleName().concat("_WorkerThread");
    }

    public gd2(l4z l4zVar, ks70 ks70Var, long j, int i) {
        a aVar = new a(l4zVar, ks70Var, j, i, new ArrayBlockingQueue(2048), 2048L);
        this.a = aVar;
        String str = c;
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        AtomicInteger atomicInteger = new AtomicInteger();
        Thread threadNewThread = threadFactoryDefaultThreadFactory.newThread(aVar);
        threadNewThread.setUncaughtExceptionHandler(new bmc.a(threadNewThread.getUncaughtExceptionHandler()));
        try {
            threadNewThread.setDaemon(true);
            threadNewThread.setName(str + "-" + atomicInteger.incrementAndGet());
            threadNewThread.setContextClassLoader(null);
        } catch (SecurityException unused) {
        }
        threadNewThread.start();
    }

    @Override // defpackage.tft
    public final rm8 j() {
        Logger logger = a.B;
        return this.a.b();
    }

    @Override // defpackage.tft
    public final void s1(m0b m0bVar, p340 p340Var) {
        if (p340Var == null) {
            return;
        }
        Logger logger = a.B;
        a aVar = this.a;
        uft uftVar = aVar.a;
        long j = aVar.A;
        ArrayBlockingQueue arrayBlockingQueue = aVar.f;
        uftVar.c(j, new dd2(arrayBlockingQueue));
        if (!arrayBlockingQueue.offer(p340Var)) {
            uftVar.a();
        } else if (arrayBlockingQueue.size() >= aVar.i.get()) {
            aVar.v.offer(Boolean.TRUE);
        }
    }

    @Override // defpackage.tft
    public final rm8 shutdown() {
        if (this.b.getAndSet(true)) {
            return rm8.e;
        }
        Logger logger = a.B;
        final a aVar = this.a;
        aVar.getClass();
        final rm8 rm8Var = new rm8();
        final rm8 rm8VarB = aVar.b();
        rm8VarB.g(new Runnable() { // from class: ed2
            @Override // java.lang.Runnable
            public final void run() {
                gd2.a aVar2 = aVar;
                final rm8 rm8Var2 = rm8VarB;
                final rm8 rm8Var3 = rm8Var;
                aVar2.y = false;
                final rm8 rm8VarA = aVar2.b.b.a();
                rm8VarA.g(new Runnable() { // from class: fd2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zC = rm8Var2.c();
                        rm8 rm8Var4 = rm8Var3;
                        if (zC && rm8VarA.c()) {
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
        StringBuilder sb = new StringBuilder("BatchLogRecordProcessor{logRecordExporter=");
        a aVar = this.a;
        sb.append(aVar.b);
        sb.append(", scheduleDelayNanos=");
        sb.append(aVar.c);
        sb.append(", maxExportBatchSize=");
        return zk1.a(aVar.d, ", exporterTimeoutNanos=30000000000}", sb);
    }
}
