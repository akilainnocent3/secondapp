package defpackage;

import android.util.Size;
import androidx.camera.core.c;
import androidx.camera.core.e;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ff6 {
    public sy20 a;
    public e b;
    public e c;
    public e d;
    public ak1 e;
    public sg1 f;
    public kvx g;

    public class a implements cbj<Void> {
        public final /* synthetic */ sy20 a;

        public a(sy20 sy20Var) {
            this.a = sy20Var;
        }

        @Override // defpackage.cbj
        public final void onFailure(Throwable th) {
            kpf0.a();
            ff6 ff6Var = ff6.this;
            if (this.a == ff6Var.a) {
                pgt.i("CaptureNode", "request aborted, id=" + ff6Var.a.a);
                kvx kvxVar = ff6Var.g;
                if (kvxVar != null) {
                    kvxVar.b = null;
                }
                ff6Var.a = null;
            }
        }

        @Override // defpackage.cbj
        public final void onSuccess(Void r1) {
        }
    }

    public static abstract class b {
        public tz5 a;
        public tz5 b;
        public gcn c;
        public gcn d;
        public gcn e;

        public class a extends tz5 {
        }

        public abstract zkf<h4f0.a> a();

        public abstract kan b();

        public abstract int c();

        public abstract List<Integer> d();

        public abstract zj1 e();

        public abstract zkf<sy20> f();

        public abstract Size g();

        public abstract boolean h();
    }

    public final int a() {
        int iF;
        kpf0.a();
        km20.g("The ImageReader is not initialized.", this.b != null);
        e eVar = this.b;
        synchronized (eVar.a) {
            iF = eVar.d.f() - eVar.b;
        }
        return iF;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    public final void b(c cVar) throws Exception {
        boolean z;
        sy20 sy20Var;
        sy20 sy20Var2;
        kpf0.a();
        if (this.a == null) {
            pgt.i("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + cVar);
            cVar.close();
            return;
        }
        if (((Integer) cVar.m1().c().a.get(this.a.j)) == null) {
            pgt.i("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            cVar.close();
            return;
        }
        kpf0.a();
        ak1 ak1Var = this.e;
        Objects.requireNonNull(ak1Var);
        ak1Var.a.accept(new bk1(this.a, cVar));
        sy20 sy20Var3 = this.a;
        sg1 sg1Var = this.f;
        if (sg1Var != null) {
            z = sg1Var.h.size() > 1;
        }
        if (z && (sy20Var2 = this.a) != null) {
            sy20Var2.b.n(cVar.getFormat());
        }
        if (!z || ((sy20Var = this.a) != null && sy20Var.b.l())) {
            this.a = null;
        }
        lb50 lb50Var = sy20Var3.i;
        int i = sy20Var3.m;
        if (i != -1 && i != 100) {
            sy20Var3.m = 100;
            kpf0.a();
            if (!lb50Var.g) {
                final s4f0 s4f0Var = lb50Var.a;
                s4f0Var.a().execute(new Runnable() { // from class: r4f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        s4f0 s4f0Var2 = s4f0Var;
                        if (s4f0Var2.f() != null) {
                            s4f0Var2.f().getClass();
                        } else {
                            s4f0Var2.d();
                        }
                    }
                });
            }
        }
        kpf0.a();
        if (lb50Var.g) {
            return;
        }
        if (!lb50Var.h) {
            lb50Var.b();
        }
        lb50Var.e.b(null);
    }

    public final void c(sy20 sy20Var) {
        kpf0.a();
        km20.g("only one capture stage is supported.", sy20Var.k.size() == 1);
        km20.g("Too many acquire images. Close image to be able to process next.", a() > 0);
        this.a = sy20Var;
        qis<Void> qisVar = sy20Var.l;
        qisVar.k(new obj.b(qisVar, new a(sy20Var)), nqe.a());
    }

    public final void d(h4f0.a aVar) {
        boolean z;
        kpf0.a();
        sy20 sy20Var = this.a;
        if (sy20Var == null || sy20Var.a != aVar.b()) {
            return;
        }
        sy20 sy20Var2 = this.a;
        k8n k8nVarA = aVar.a();
        lb50 lb50Var = sy20Var2.i;
        s4f0 s4f0Var = lb50Var.a;
        kpf0.a();
        if (lb50Var.g) {
            return;
        }
        kpf0.a();
        int i = s4f0Var.a;
        if (i > 0) {
            z = true;
            s4f0Var.a = i - 1;
        } else {
            z = false;
        }
        if (!z) {
            kpf0.a();
            s4f0Var.a().execute(new n4f0(s4f0Var, k8nVarA));
        }
        lb50Var.a();
        lb50Var.e.d(k8nVarA);
        if (z) {
            m4f0 m4f0Var = lb50Var.b;
            kpf0.a();
            pgt.a("TakePictureManagerImpl", "Add a new request for retrying.");
            m4f0Var.a.addFirst(s4f0Var);
            m4f0Var.f();
        }
    }
}
