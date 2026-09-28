package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ehe0 {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final k8e0 g;
    public int h;
    public int i;
    public cie0 k;
    public a l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public ehe0(int i, int i2, k8e0 k8e0Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = k8e0Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new a(k8e0Var.f(), i2);
    }

    public final void a() {
        km20.g("Edge is already closed.", !this.n);
    }

    public final void b() {
        kpf0.a();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final cie0 c(n26 n26Var, boolean z) {
        kpf0.a();
        a();
        k8e0 k8e0Var = this.g;
        cie0 cie0Var = new cie0(k8e0Var.f(), n26Var, z, k8e0Var.b(), new wge0(this));
        try {
            final aie0 aie0Var = cie0Var.k;
            a aVar = this.l;
            if (aVar.g(aie0Var, new xge0(aVar))) {
                obj.d(aVar.e).k(new Runnable() { // from class: yge0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aie0Var.a();
                    }
                }, nqe.a());
            }
            this.k = cie0Var;
            e();
            return cie0Var;
        } catch (ijd.a e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            cie0Var.c();
            throw e2;
        }
    }

    public final void d() {
        boolean z;
        kpf0.a();
        a();
        a aVar = this.l;
        kpf0.a();
        if (aVar.q == null) {
            synchronized (aVar.a) {
                z = aVar.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new a(this.g.f(), this.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        final cie0.e eVar;
        Executor executor;
        kpf0.a();
        final gl1 gl1Var = new gl1(this.d, this.i, this.h, this.c, this.b, this.e);
        cie0 cie0Var = this.k;
        if (cie0Var != null) {
            synchronized (cie0Var.a) {
                cie0Var.l = gl1Var;
                eVar = cie0Var.m;
                executor = cie0Var.n;
            }
            if (eVar != null && executor != null) {
                executor.execute(new Runnable() { // from class: the0
                    @Override // java.lang.Runnable
                    public final void run() {
                        eVar.a(gl1Var);
                    }
                });
            }
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qya) obj).accept(gl1Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.f);
        sb.append(", format=");
        sb.append(this.a);
        sb.append(", resolution=");
        sb.append(this.g.f());
        sb.append(", cropRect=");
        sb.append(this.d);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", mirroring=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.b;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(lsg0.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(lsg0.f(matrix));
        sb.append(", isClosed=");
        return ruw.a(sb, this.n, '}');
    }

    public static class a extends ijd {
        public final nv5.d o;
        public final nv5.a<Surface> p;
        public ijd q;
        public nhe0 r;

        @Override // defpackage.ijd
        public final void a() {
            super.a();
            kpf0.c(new Runnable() { // from class: che0
                @Override // java.lang.Runnable
                public final void run() {
                    ehe0.a aVar = this.a;
                    nhe0 nhe0Var = aVar.r;
                    if (nhe0Var != null) {
                        nhe0Var.f();
                    }
                    if (aVar.q == null) {
                        aVar.p.c();
                    }
                    aVar.q = null;
                }
            });
        }

        @Override // defpackage.ijd
        public final qis<Surface> f() {
            return this.o;
        }

        public final boolean g(final ijd ijdVar, Runnable runnable) {
            boolean z;
            Size size = this.h;
            kpf0.a();
            ijdVar.getClass();
            int i = ijdVar.i;
            Size size2 = ijdVar.h;
            ijd ijdVar2 = this.q;
            if (ijdVar2 == ijdVar) {
                return false;
            }
            km20.g("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", ijdVar2 == null);
            km20.a("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
            int i2 = this.i;
            km20.a(n36.a("The provider's format(", i2, i, ") must match the parent(", ")"), i2 == i);
            synchronized (this.a) {
                z = this.c;
            }
            km20.g("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
            this.q = ijdVar;
            obj.e(ijdVar.c(), this.p);
            ijdVar.d();
            obj.d(this.e).k(new Runnable() { // from class: dhe0
                @Override // java.lang.Runnable
                public final void run() {
                    ijdVar.b();
                }
            }, nqe.a());
            obj.d(ijdVar.g).k(runnable, mku.a());
            return true;
        }

        public a(Size size, int i) {
            super(size, i);
            nv5.a<Surface> aVar = new nv5.a<>();
            nv5.d<T> dVar = new nv5.d<>(aVar);
            aVar.b = dVar;
            aVar.a = ew5.class;
            try {
                this.p = aVar;
                aVar.a = QQWMbKFOuTf.WoGbHRGsghR + hashCode();
            } catch (Exception e) {
                dVar.a(e);
            }
            this.o = dVar;
        }
    }
}
