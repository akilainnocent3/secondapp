package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class w<T> implements i0<T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements i0.b<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f19064f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f19065g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f19066h = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f19067a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f19068b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f19069c = new RunnableC0153a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0.b f19070d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.w$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC0153a implements Runnable {
            public RunnableC0153a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVarA = a.this.f19067a.a();
                while (dVarA != null) {
                    int i10 = dVarA.f19089b;
                    if (i10 == 1) {
                        a.this.f19070d.a(dVarA.f19090c, dVarA.f19091d);
                    } else if (i10 == 2) {
                        a.this.f19070d.c(dVarA.f19090c, (j0.a) dVarA.f19095h);
                    } else if (i10 != 3) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + dVarA.f19089b);
                    } else {
                        a.this.f19070d.b(dVarA.f19090c, dVarA.f19091d);
                    }
                    dVarA = a.this.f19067a.a();
                }
            }
        }

        public a(i0.b bVar) {
            this.f19070d = bVar;
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void a(int i10, int i11) {
            d(d.a(1, i10, i11));
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void b(int i10, int i11) {
            d(d.a(3, i10, i11));
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void c(int i10, j0.a<T> aVar) {
            d(d.c(2, i10, aVar));
        }

        public final void d(d dVar) {
            this.f19067a.c(dVar);
            this.f19068b.post(this.f19069c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements i0.a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f19073g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f19074h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f19075i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f19076j = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f19077a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f19078b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AtomicBoolean f19079c = new AtomicBoolean(false);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Runnable f19080d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i0.a f19081e;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d dVarA = b.this.f19077a.a();
                    if (dVarA == null) {
                        b.this.f19079c.set(false);
                        return;
                    }
                    int i10 = dVarA.f19089b;
                    if (i10 == 1) {
                        b.this.f19077a.b(1);
                        b.this.f19081e.c(dVarA.f19090c);
                    } else if (i10 == 2) {
                        b.this.f19077a.b(2);
                        b.this.f19077a.b(3);
                        b.this.f19081e.a(dVarA.f19090c, dVarA.f19091d, dVarA.f19092e, dVarA.f19093f, dVarA.f19094g);
                    } else if (i10 == 3) {
                        b.this.f19081e.b(dVarA.f19090c, dVarA.f19091d);
                    } else if (i10 != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + dVarA.f19089b);
                    } else {
                        b.this.f19081e.d((j0.a) dVarA.f19095h);
                    }
                }
            }
        }

        public b(i0.a aVar) {
            this.f19081e = aVar;
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void a(int i10, int i11, int i12, int i13, int i14) {
            g(d.b(2, i10, i11, i12, i13, i14, null));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void b(int i10, int i11) {
            f(d.a(3, i10, i11));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void c(int i10) {
            g(d.c(1, i10, null));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void d(j0.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }

        public final void e() {
            if (this.f19079c.compareAndSet(false, true)) {
                this.f19078b.execute(this.f19080d);
            }
        }

        public final void f(d dVar) {
            this.f19077a.c(dVar);
            e();
        }

        public final void g(d dVar) {
            this.f19077a.d(dVar);
            e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f19084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f19085b = new Object();

        public d a() {
            synchronized (this.f19085b) {
                try {
                    d dVar = this.f19084a;
                    if (dVar == null) {
                        return null;
                    }
                    this.f19084a = dVar.f19088a;
                    return dVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void b(int i10) {
            d dVar;
            synchronized (this.f19085b) {
                while (true) {
                    try {
                        dVar = this.f19084a;
                        if (dVar == null || dVar.f19089b != i10) {
                            break;
                        }
                        this.f19084a = dVar.f19088a;
                        dVar.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (dVar != null) {
                    d dVar2 = dVar.f19088a;
                    while (dVar2 != null) {
                        d dVar3 = dVar2.f19088a;
                        if (dVar2.f19089b == i10) {
                            dVar.f19088a = dVar3;
                            dVar2.d();
                        } else {
                            dVar = dVar2;
                        }
                        dVar2 = dVar3;
                    }
                }
            }
        }

        public void c(d dVar) {
            synchronized (this.f19085b) {
                try {
                    d dVar2 = this.f19084a;
                    if (dVar2 == null) {
                        this.f19084a = dVar;
                        return;
                    }
                    while (true) {
                        d dVar3 = dVar2.f19088a;
                        if (dVar3 == null) {
                            dVar2.f19088a = dVar;
                            return;
                        }
                        dVar2 = dVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void d(d dVar) {
            synchronized (this.f19085b) {
                dVar.f19088a = this.f19084a;
                this.f19084a = dVar;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static d f19086i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final Object f19087j = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f19088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19094g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f19095h;

        public static d a(int i10, int i11, int i12) {
            return b(i10, i11, i12, 0, 0, 0, null);
        }

        public static d b(int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            d dVar;
            synchronized (f19087j) {
                try {
                    dVar = f19086i;
                    if (dVar == null) {
                        dVar = new d();
                    } else {
                        f19086i = dVar.f19088a;
                        dVar.f19088a = null;
                    }
                    dVar.f19089b = i10;
                    dVar.f19090c = i11;
                    dVar.f19091d = i12;
                    dVar.f19092e = i13;
                    dVar.f19093f = i14;
                    dVar.f19094g = i15;
                    dVar.f19095h = obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return dVar;
        }

        public static d c(int i10, int i11, Object obj) {
            return b(i10, i11, 0, 0, 0, 0, obj);
        }

        public void d() {
            this.f19088a = null;
            this.f19094g = 0;
            this.f19093f = 0;
            this.f19092e = 0;
            this.f19091d = 0;
            this.f19090c = 0;
            this.f19089b = 0;
            this.f19095h = null;
            synchronized (f19087j) {
                try {
                    d dVar = f19086i;
                    if (dVar != null) {
                        this.f19088a = dVar;
                    }
                    f19086i = this;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.i0
    public i0.b<T> a(i0.b<T> bVar) {
        return new a(bVar);
    }

    @Override // androidx.recyclerview.widget.i0
    public i0.a<T> b(i0.a<T> aVar) {
        return new b(aVar);
    }
}
