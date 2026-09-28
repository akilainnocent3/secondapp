package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class uc0 extends k5b {
    public static final mpe0 A = hwr.b(a.a);
    public static final b B = new b();
    public final Choreographer b;
    public final Handler c;
    public boolean v;
    public boolean w;
    public final vc0 z;
    public final Object d = new Object();
    public final gx0<Runnable> e = new gx0<>();
    public ArrayList f = new ArrayList();
    public ArrayList i = new ArrayList();
    public final c y = new c();

    public static final class a extends qlr implements Function0<CoroutineContext> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineContext invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                pfd pfdVar = fse.a;
                choreographer = (Choreographer) dj5.a(gku.a, new tc0(2, null));
            }
            uc0 uc0Var = new uc0(choreographer, rcl.a(Looper.getMainLooper()));
            return uc0Var.plus(uc0Var.z);
        }
    }

    public static final class b extends ThreadLocal<CoroutineContext> {
        @Override // java.lang.ThreadLocal
        public final CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                uc0 uc0Var = new uc0(choreographer, rcl.a(looperMyLooper));
                return uc0Var.plus(uc0Var.z);
            }
            ib5.a("no Looper on this thread");
            return null;
        }
    }

    public static final class c implements Choreographer.FrameCallback, Runnable {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            uc0.this.c.removeCallbacks(this);
            uc0.this.h0();
            uc0 uc0Var = uc0.this;
            synchronized (uc0Var.d) {
                if (uc0Var.w) {
                    uc0Var.w = false;
                    ArrayList arrayList = uc0Var.f;
                    uc0Var.f = uc0Var.i;
                    uc0Var.i = arrayList;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                    }
                    arrayList.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            uc0.this.h0();
            uc0 uc0Var = uc0.this;
            synchronized (uc0Var.d) {
                try {
                    if (uc0Var.f.isEmpty()) {
                        uc0Var.b.removeFrameCallback(this);
                        uc0Var.w = false;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public uc0(Choreographer choreographer, Handler handler) {
        this.b = choreographer;
        this.c = handler;
        this.z = new vc0(choreographer, this);
    }

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.d) {
            try {
                this.e.addLast(runnable);
                if (!this.v) {
                    this.v = true;
                    this.c.post(this.y);
                    if (!this.w) {
                        this.w = true;
                        this.b.postFrameCallback(this.y);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h0() {
        Runnable runnableRemoveFirst;
        boolean z;
        do {
            synchronized (this.d) {
                gx0<Runnable> gx0Var = this.e;
                runnableRemoveFirst = gx0Var.isEmpty() ? null : gx0Var.removeFirst();
            }
            while (runnableRemoveFirst != null) {
                runnableRemoveFirst.run();
                synchronized (this.d) {
                    gx0<Runnable> gx0Var2 = this.e;
                    runnableRemoveFirst = gx0Var2.isEmpty() ? null : gx0Var2.removeFirst();
                }
            }
            synchronized (this.d) {
                if (this.e.isEmpty()) {
                    z = false;
                    this.v = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
