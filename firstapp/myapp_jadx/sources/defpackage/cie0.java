package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class cie0 {
    public final Object a = new Object();
    public final Size b;
    public final dhf c;
    public final n26 d;
    public final boolean e;
    public final nv5.d f;
    public final nv5.a<Surface> g;
    public final nv5.d h;
    public final nv5.a<Void> i;
    public final nv5.a<Void> j;
    public final aie0 k;
    public gl1 l;
    public e m;
    public Executor n;

    public class a implements cbj<Void> {
        public final /* synthetic */ qya a;
        public final /* synthetic */ Surface b;

        public a(qya qyaVar, Surface surface) {
            this.a = qyaVar;
            this.b = surface;
        }

        @Override // defpackage.cbj
        public final void onFailure(Throwable th) {
            km20.g("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof b);
            this.a.accept(new fl1(1, this.b));
        }

        @Override // defpackage.cbj
        public final void onSuccess(Void r3) {
            this.a.accept(new fl1(0, this.b));
        }
    }

    public static final class b extends RuntimeException {
    }

    public static abstract class c {
        public abstract int a();

        public abstract Surface b();
    }

    public static abstract class d {
        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface e {
        void a(d dVar);
    }

    static {
        Range<Integer> range = k8e0.a;
    }

    public cie0(Size size, n26 n26Var, boolean z, dhf dhfVar, wge0 wge0Var) {
        this.b = size;
        this.d = n26Var;
        this.e = z;
        km20.a("SurfaceRequest's DynamicRange must always be fully specified.", dhfVar.b());
        this.c = dhfVar;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            atomicReference.set(aVar);
            aVar.a = str.concat("-cancellation");
        } catch (Exception e2) {
            dVar.a(e2);
        }
        nv5.a<Void> aVar2 = (nv5.a) atomicReference.get();
        aVar2.getClass();
        this.j = aVar2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        nv5.a aVar3 = new nv5.a();
        nv5.d<T> dVar2 = new nv5.d<>(aVar3);
        aVar3.b = dVar2;
        aVar3.a = ew5.class;
        try {
            atomicReference2.set(aVar3);
            aVar3.a = str.concat("-status");
        } catch (Exception e3) {
            dVar2.a(e3);
        }
        this.h = dVar2;
        dVar2.k(new obj.b(dVar2, new zhe0(aVar2, dVar)), nqe.a());
        nv5.a aVar4 = (nv5.a) atomicReference2.get();
        aVar4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        nv5.a aVar5 = new nv5.a();
        nv5.d<T> dVar3 = new nv5.d<>(aVar5);
        aVar5.b = dVar3;
        aVar5.a = ew5.class;
        try {
            atomicReference3.set(aVar5);
            aVar5.a = str.concat("-Surface");
        } catch (Exception e4) {
            dVar3.a(e4);
        }
        this.f = dVar3;
        nv5.a<Surface> aVar6 = (nv5.a) atomicReference3.get();
        aVar6.getClass();
        this.g = aVar6;
        aie0 aie0Var = new aie0(this, size);
        this.k = aie0Var;
        qis qisVarD = obj.d(aie0Var.e);
        dVar3.k(new obj.b(dVar3, new bie0(qisVarD, aVar4, str)), nqe.a());
        qisVarD.k(new Runnable() { // from class: uhe0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f.cancel(true);
            }
        }, nqe.a());
        nqe nqeVarA = nqe.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        nv5.a aVar7 = new nv5.a();
        nv5.d<T> dVar4 = new nv5.d<>(aVar7);
        aVar7.b = dVar4;
        aVar7.a = ew5.class;
        try {
            atomicReference4.set(aVar7);
            aVar7.a = "SurfaceRequest-surface-recreation(" + hashCode() + ")";
        } catch (Exception e5) {
            dVar4.a(e5);
        }
        dVar4.k(new obj.b(dVar4, new die0(wge0Var)), nqeVarA);
        nv5.a<Void> aVar8 = (nv5.a) atomicReference4.get();
        aVar8.getClass();
        this.i = aVar8;
    }

    public final void a(final Surface surface, Executor executor, final qya<c> qyaVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: whe0
                @Override // java.lang.Runnable
                public final void run() {
                    qyaVar.accept(new fl1(2, surface));
                }
            });
            return;
        }
        if (!this.g.b(surface)) {
            nv5.d dVar = this.f;
            if (!dVar.isCancelled()) {
                km20.g(null, dVar.b.isDone());
                try {
                    dVar.get();
                    executor.execute(new Runnable() { // from class: xhe0
                        @Override // java.lang.Runnable
                        public final void run() {
                            qyaVar.accept(new fl1(3, surface));
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: yhe0
                        @Override // java.lang.Runnable
                        public final void run() {
                            qyaVar.accept(new fl1(4, surface));
                        }
                    });
                    return;
                }
            }
        }
        a aVar = new a(qyaVar, surface);
        nv5.d dVar2 = this.h;
        dVar2.k(new obj.b(dVar2, aVar), executor);
    }

    public final void b(Executor executor, final e eVar) {
        final gl1 gl1Var;
        synchronized (this.a) {
            this.m = eVar;
            this.n = executor;
            gl1Var = this.l;
        }
        if (gl1Var != null) {
            executor.execute(new Runnable() { // from class: vhe0
                @Override // java.lang.Runnable
                public final void run() {
                    eVar.a(gl1Var);
                }
            });
        }
    }

    public final boolean c() {
        return this.g.d(new ijd.b("Surface request will not complete."));
    }
}
