package defpackage;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ijd {
    public static final Size k = new Size(0, 0);
    public static final boolean l = pgt.f("DeferrableSurface");
    public static final AtomicInteger m = new AtomicInteger(0);
    public static final AtomicInteger n = new AtomicInteger(0);
    public final Object a;
    public int b;
    public boolean c;
    public nv5.a<Void> d;
    public final nv5.d e;
    public final nv5.a<Void> f;
    public final nv5.d g;
    public final Size h;
    public final int i;
    public Class<?> j;

    public static final class a extends Exception {
        public final ijd a;

        public a(ijd ijdVar, String str) {
            super(str);
            this.a = ijdVar;
        }
    }

    public static final class b extends Exception {
    }

    public ijd(Size size, int i) {
        this.a = new Object();
        this.b = 0;
        this.c = false;
        this.h = size;
        this.i = i;
        nv5.a<Void> aVar = new nv5.a<>();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            synchronized (this.a) {
                this.d = aVar;
            }
            aVar.a = "DeferrableSurface-termination(" + this + ")";
        } catch (Exception e) {
            dVar.a(e);
        }
        this.e = dVar;
        nv5.a<Void> aVar2 = new nv5.a<>();
        nv5.d<T> dVar2 = new nv5.d<>(aVar2);
        aVar2.b = dVar2;
        aVar2.a = ew5.class;
        try {
            synchronized (this.a) {
                this.f = aVar2;
            }
            aVar2.a = "DeferrableSurface-close(" + this + ")";
        } catch (Exception e2) {
            dVar2.a(e2);
        }
        this.g = dVar2;
        if (pgt.f("DeferrableSurface")) {
            e(n.incrementAndGet(), m.get(), "Surface created");
            final String stackTraceString = Log.getStackTraceString(new Exception());
            dVar.b.k(new Runnable() { // from class: hjd
                @Override // java.lang.Runnable
                public final void run() {
                    ijd ijdVar = this.a;
                    String str = stackTraceString;
                    try {
                        ijdVar.e.get();
                        ijdVar.e(ijd.n.decrementAndGet(), ijd.m.get(), "Surface terminated");
                    } catch (Exception e3) {
                        pgt.c("DeferrableSurface", "Unexpected surface termination for " + ijdVar + "\nStack Trace:\n" + str);
                        synchronized (ijdVar.a) {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", ijdVar, Boolean.valueOf(ijdVar.c), Integer.valueOf(ijdVar.b)), e3);
                        }
                    }
                }
            }, nqe.a());
        }
    }

    public void a() {
        nv5.a<Void> aVar;
        synchronized (this.a) {
            try {
                if (this.c) {
                    aVar = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        aVar = this.d;
                        this.d = null;
                    } else {
                        aVar = null;
                    }
                    if (pgt.f("DeferrableSurface")) {
                        pgt.a("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final void b() {
        nv5.a<Void> aVar;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    aVar = this.d;
                    this.d = null;
                } else {
                    aVar = null;
                }
                if (pgt.f("DeferrableSurface")) {
                    pgt.a("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.c + " " + this);
                    if (this.b == 0) {
                        e(n.get(), m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final qis<Surface> c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new fcn.a(new a(this, "DeferrableSurface already closed."));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new a(this, "Cannot begin use on a closed surface.");
                }
                this.b = i + 1;
                if (pgt.f("DeferrableSurface")) {
                    if (this.b == 1) {
                        e(n.get(), m.incrementAndGet(), "New surface in use");
                    }
                    pgt.a("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i2, String str) {
        if (!l && pgt.f("DeferrableSurface")) {
            pgt.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        pgt.a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract qis<Surface> f();

    public ijd() {
        this(k, 0);
    }
}
