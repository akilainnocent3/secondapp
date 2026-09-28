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
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class ld2 implements fra0 {
    public static final Logger c;
    public static final String d;
    public final a a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public static final class a implements Runnable {
        public final ArrayList<rqa0> A;
        public final long B;
        public final gra0 a;
        public final tqa0 b;
        public final long c;
        public final int d;
        public long e;
        public final n8w f;
        public final AtomicInteger i = new AtomicInteger();
        public final AtomicInteger v = new AtomicInteger(Reader.READ_DONE);
        public final AtomicReference<rm8> y = new AtomicReference<>();
        public volatile boolean z = true;
        public final ArrayBlockingQueue w = new ArrayBlockingQueue(1);

        public a(tqa0 tqa0Var, ks70 ks70Var, long j, int i, n8w n8wVar, long j2) {
            this.b = tqa0Var;
            this.c = j;
            this.d = i;
            this.f = n8wVar;
            Logger logger = ld2.c;
            this.a = new g6s(ks70Var);
            this.B = j2;
            this.A = new ArrayList<>(i);
        }

        public final void a() {
            gra0 gra0Var = this.a;
            ArrayList<rqa0> arrayList = this.A;
            if (arrayList.isEmpty()) {
                return;
            }
            String name = null;
            try {
                rm8 rm8VarK0 = this.b.k0(Collections.unmodifiableList(arrayList));
                rm8VarK0.d(30000000000L, TimeUnit.NANOSECONDS);
                if (!rm8VarK0.c()) {
                    ld2.c.log(Level.FINE, "Exporter failed");
                    if (rm8VarK0.b() != null) {
                        name = rm8VarK0.b().getClass().getName();
                    } else {
                        name = "export_failed";
                    }
                }
                gra0Var.c(arrayList.size(), name);
            } catch (Throwable th) {
                try {
                    if (th instanceof VirtualMachineError) {
                        throw ((VirtualMachineError) th);
                    }
                    if (th instanceof ThreadDeath) {
                        throw ((ThreadDeath) th);
                    }
                    if (th instanceof LinkageError) {
                        throw ((LinkageError) th);
                    }
                    ld2.c.log(Level.WARNING, "Exporter threw an Exception", th);
                    gra0Var.c(arrayList.size(), th.getClass().getName());
                } catch (Throwable th2) {
                    gra0Var.c(arrayList.size(), name);
                    arrayList.clear();
                    throw th2;
                }
            }
            arrayList.clear();
        }

        public final rm8 b() {
            AtomicReference<rm8> atomicReference;
            rm8 rm8Var = new rm8();
            do {
                atomicReference = this.y;
                if (atomicReference.compareAndSet(null, rm8Var)) {
                    this.w.offer(Boolean.TRUE);
                    break;
                }
            } while (atomicReference.get() == null);
            rm8 rm8Var2 = atomicReference.get();
            return rm8Var2 == null ? rm8.e : rm8Var2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j;
            int i;
            this.e = System.nanoTime() + this.c;
            while (this.z) {
                if (this.y.get() != null) {
                    AtomicReference<rm8> atomicReference = this.y;
                    ArrayList<rqa0> arrayList = this.A;
                    int i2 = this.d;
                    int i3 = this.i.get();
                    while (i3 > 0) {
                        int size = i2 - arrayList.size();
                        n8w n8wVar = this.f;
                        if (size < 0) {
                            hb5.a(hce0.a(size, "limit is negative: "));
                            return;
                        }
                        if (size == 0) {
                            size = 0;
                        } else {
                            AtomicReferenceArray<E> atomicReferenceArray = n8wVar.a;
                            int i4 = n8wVar.b;
                            long j2 = n8wVar.i;
                            int i5 = 0;
                            while (i5 < size) {
                                long j3 = ((long) i5) + j2;
                                int i6 = (int) (j3 & ((long) i4));
                                Object obj = atomicReferenceArray.get(i6);
                                if (obj == null) {
                                    size = i5;
                                    break;
                                }
                                atomicReferenceArray.lazySet(i6, null);
                                int i7 = i5;
                                o8w.v.lazySet(n8wVar, j3 + 1);
                                this.A.add(((r340) obj).e());
                                i5 = i7 + 1;
                            }
                        }
                        this.i.addAndGet(-size);
                        i3 -= size;
                        if (arrayList.size() >= i2) {
                            a();
                        }
                    }
                    j = 1;
                    a();
                    rm8 rm8Var = atomicReference.get();
                    if (rm8Var != null) {
                        rm8Var.f();
                        atomicReference.set(null);
                    }
                } else {
                    j = 1;
                }
                int size2 = this.d - this.A.size();
                n8w n8wVar2 = this.f;
                if (size2 < 0) {
                    hb5.a(hce0.a(size2, "limit is negative: "));
                    return;
                }
                if (size2 != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray2 = n8wVar2.a;
                    int i8 = n8wVar2.b;
                    long j4 = n8wVar2.i;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size2) {
                            i = size2;
                            break;
                        }
                        long j5 = ((long) i9) + j4;
                        int i10 = (int) (((long) i8) & j5);
                        Object obj2 = atomicReferenceArray2.get(i10);
                        if (obj2 == null) {
                            i = i9;
                            break;
                        }
                        atomicReferenceArray2.lazySet(i10, null);
                        o8w.v.lazySet(n8wVar2, j5 + j);
                        this.A.add(((r340) obj2).e());
                        i9++;
                    }
                } else {
                    i = 0;
                }
                this.i.addAndGet(-i);
                if (this.A.size() >= this.d || System.nanoTime() >= this.e) {
                    a();
                    this.e = System.nanoTime() + this.c;
                }
                if (this.f.isEmpty()) {
                    try {
                        long jNanoTime = this.e - System.nanoTime();
                        if (jNanoTime > 0) {
                            this.v.set(this.d - this.A.size());
                            this.w.poll(jNanoTime, TimeUnit.NANOSECONDS);
                            this.v.set(Reader.READ_DONE);
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
        new fo8.a("batching_span_processor");
        c = Logger.getLogger(ld2.class.getName());
        d = ld2.class.getSimpleName().concat("_WorkerThread");
    }

    public ld2(tqa0 tqa0Var, ks70 ks70Var, long j, int i) {
        n8w n8wVar = new n8w();
        n8wVar.e = 2048L;
        a aVar = new a(tqa0Var, ks70Var, j, i, n8wVar, 2048L);
        this.a = aVar;
        String str = d;
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
        return this.a.b();
    }

    @Override // defpackage.fra0
    public final void r0(at70 at70Var) {
        if ((at70Var.b.b().b & 1) != 0) {
            a aVar = this.a;
            gra0 gra0Var = aVar.a;
            long j = aVar.B;
            n8w n8wVar = aVar.f;
            gra0Var.b(j, new kd2());
            if (!n8wVar.offer(at70Var)) {
                gra0Var.a();
            } else if (aVar.i.incrementAndGet() >= aVar.v.get()) {
                aVar.w.offer(Boolean.TRUE);
            }
        }
    }

    @Override // defpackage.fra0
    public final rm8 shutdown() {
        if (this.b.getAndSet(true)) {
            return rm8.e;
        }
        final a aVar = this.a;
        aVar.getClass();
        final rm8 rm8Var = new rm8();
        final rm8 rm8VarB = aVar.b();
        rm8VarB.g(new Runnable() { // from class: id2
            @Override // java.lang.Runnable
            public final void run() {
                ld2.a aVar2 = aVar;
                final rm8 rm8Var2 = rm8VarB;
                final rm8 rm8Var3 = rm8Var;
                aVar2.z = false;
                final rm8 rm8VarShutdown = aVar2.b.shutdown();
                rm8VarShutdown.g(new Runnable() { // from class: jd2
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
        StringBuilder sb = new StringBuilder("BatchSpanProcessor{spanExporter=");
        a aVar = this.a;
        sb.append(aVar.b);
        sb.append(", exportUnsampledSpans=false, scheduleDelayNanos=");
        sb.append(aVar.c);
        sb.append(", maxExportBatchSize=");
        return zk1.a(aVar.d, ", exporterTimeoutNanos=30000000000}", sb);
    }

    @Override // defpackage.fra0
    public final void r1(m0b m0bVar, at70 at70Var) {
    }
}
