package defpackage;

import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class pxd0<T> implements tcy<T> {
    public final AtomicReference<Object> b;
    public final Object a = new Object();
    public int c = 0;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final CopyOnWriteArraySet<b<T>> f = new CopyOnWriteArraySet<>();

    public static abstract class a {
        public abstract Throwable a();
    }

    public static final class b<T> implements Runnable {
        public static final Object v = new Object();
        public final Executor a;
        public final tcy.a<? super T> b;
        public final AtomicReference<Object> d;
        public final AtomicBoolean c = new AtomicBoolean(true);
        public Object e = v;
        public int f = -1;
        public boolean i = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, tcy.a<? super T> aVar) {
            this.d = atomicReference;
            this.a = executor;
            this.b = aVar;
        }

        public final void a(int i) {
            synchronized (this) {
                try {
                    if (this.c.get()) {
                        if (i <= this.f) {
                            return;
                        }
                        this.f = i;
                        if (this.i) {
                            return;
                        }
                        this.i = true;
                        try {
                            this.a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.i = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                try {
                    if (!this.c.get()) {
                        this.i = false;
                        return;
                    }
                    Object obj = this.d.get();
                    int i = this.f;
                    while (true) {
                        if (!Objects.equals(this.e, obj)) {
                            this.e = obj;
                            boolean z = obj instanceof a;
                            tcy.a<? super T> aVar = this.b;
                            if (z) {
                                aVar.onError(((a) obj).a());
                            } else {
                                aVar.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i == this.f || !this.c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.d.get();
                                    i = this.f;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    this.i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public pxd0(Object obj) {
        this.b = new AtomicReference<>(obj);
    }

    @Override // defpackage.tcy
    public final qis<T> a() {
        Object obj = this.b.get();
        return obj instanceof a ? new fcn.a(((a) obj).a()) : obj.c(obj);
    }

    @Override // defpackage.tcy
    public final void b(tcy.a<? super T> aVar) {
        synchronized (this.a) {
            b bVar = (b) this.e.remove(aVar);
            if (bVar != null) {
                bVar.c.set(false);
                this.f.remove(bVar);
            }
        }
    }

    @Override // defpackage.tcy
    public final void c(Executor executor, tcy.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.a) {
            b bVar2 = (b) this.e.remove(aVar);
            if (bVar2 != null) {
                bVar2.c.set(false);
                this.f.remove(bVar2);
            }
            bVar = new b<>(this.b, executor, aVar);
            this.e.put(aVar, bVar);
            this.f.add(bVar);
        }
        bVar.a(0);
    }
}
