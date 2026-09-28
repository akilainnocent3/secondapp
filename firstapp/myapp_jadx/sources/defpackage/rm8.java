package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class rm8 {
    public static final rm8 e;
    public static final rm8 f;
    public Boolean a = null;
    public Throwable b = null;
    public final ArrayList c = new ArrayList();
    public final Object d = new Object();

    static {
        rm8 rm8Var = new rm8();
        rm8Var.f();
        e = rm8Var;
        rm8 rm8Var2 = new rm8();
        rm8Var2.a(null);
        f = rm8Var2;
    }

    public static rm8 e(Collection<rm8> collection) {
        if (collection.isEmpty()) {
            return e;
        }
        final rm8 rm8Var = new rm8();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final AtomicReference atomicReference = new AtomicReference();
        for (final rm8 rm8Var2 : collection) {
            rm8Var2.g(new Runnable() { // from class: pm8
                @Override // java.lang.Runnable
                public final void run() {
                    rm8 rm8Var3 = this.a;
                    boolean zC = rm8Var3.c();
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    AtomicReference atomicReference2 = atomicReference;
                    if (!zC) {
                        atomicBoolean2.set(true);
                        Throwable thB = rm8Var3.b();
                        if (thB != null) {
                            while (!atomicReference2.compareAndSet(null, thB) && atomicReference2.get() == null) {
                            }
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        boolean z = atomicBoolean2.get();
                        rm8 rm8Var4 = rm8Var;
                        if (z) {
                            rm8Var4.a((Throwable) atomicReference2.get());
                        } else {
                            rm8Var4.f();
                        }
                    }
                }
            });
        }
        return rm8Var;
    }

    public final void a(Throwable th) {
        synchronized (this.d) {
            try {
                if (this.a == null) {
                    this.a = Boolean.FALSE;
                    this.b = th;
                    ArrayList arrayList = this.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Throwable b() {
        Throwable th;
        synchronized (this.d) {
            th = this.b;
        }
        return th;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.d) {
            try {
                Boolean bool = this.a;
                z = bool != null && bool.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void d(long j, TimeUnit timeUnit) {
        boolean z;
        synchronized (this.d) {
            z = this.a != null;
        }
        if (z) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        g(new Runnable() { // from class: qm8
            @Override // java.lang.Runnable
            public final void run() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void f() {
        synchronized (this.d) {
            try {
                if (this.a == null) {
                    this.a = Boolean.TRUE;
                    ArrayList arrayList = this.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Runnable runnable) {
        boolean z;
        synchronized (this.d) {
            if (this.a != null) {
                z = true;
            } else {
                this.c.add(runnable);
                z = false;
            }
        }
        if (z) {
            runnable.run();
        }
    }
}
