package defpackage;

import android.util.Log;
import androidx.camera.core.b;
import androidx.camera.core.e;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m4f0 implements h4f0, b.a {
    public final j8n b;
    public aan c;
    public lb50 d;
    public final ArrayList e;
    public final ArrayDeque a = new ArrayDeque();
    public boolean f = false;

    public m4f0(j8n j8nVar) {
        kpf0.a();
        this.b = j8nVar;
        this.e = new ArrayList();
    }

    @Override // defpackage.h4f0
    public final void b() {
        kpf0.a();
        k8n k8nVar = new k8n("Camera is closed.", null);
        ArrayDeque<s4f0> arrayDeque = this.a;
        for (s4f0 s4f0Var : arrayDeque) {
            s4f0Var.a().execute(new n4f0(s4f0Var, k8nVar));
        }
        arrayDeque.clear();
        ArrayList arrayList = new ArrayList(this.e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lb50 lb50Var = (lb50) obj;
            lb50Var.getClass();
            kpf0.a();
            if (!lb50Var.d.b.isDone()) {
                kpf0.a();
                lb50Var.g = true;
                pw6 pw6Var = lb50Var.i;
                Objects.requireNonNull(pw6Var);
                pw6Var.cancel(true);
                lb50Var.e.d(k8nVar);
                lb50Var.f.b(null);
                kpf0.a();
                s4f0 s4f0Var2 = lb50Var.a;
                s4f0Var2.a().execute(new n4f0(s4f0Var2, k8nVar));
            }
        }
    }

    @Override // defpackage.h4f0
    public final void c(jl1 jl1Var) {
        kpf0.a();
        this.a.offer(jl1Var);
        f();
    }

    @Override // defpackage.h4f0
    public final void d(aan aanVar) {
        kpf0.a();
        this.c = aanVar;
        aanVar.getClass();
        kpf0.a();
        ff6 ff6Var = aanVar.c;
        kpf0.a();
        km20.g("The ImageReader is not initialized.", ff6Var.b != null);
        e eVar = ff6Var.b;
        synchronized (eVar.a) {
            eVar.f = this;
        }
    }

    @Override // defpackage.h4f0
    public final void e() {
        kpf0.a();
        this.f = false;
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        tz5 tz5Var;
        gcn gcnVar;
        kpf0.a();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.d != null) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        aan aanVar = this.c;
        aanVar.getClass();
        kpf0.a();
        if (aanVar.c.a() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        s4f0 s4f0Var = (s4f0) this.a.poll();
        if (s4f0Var == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        final lb50 lb50Var = new lb50(s4f0Var, this);
        int i = 0;
        int i2 = 1;
        km20.g(null, !(this.d != null));
        this.d = lb50Var;
        kpf0.a();
        lb50Var.c.b.k(new Runnable() { // from class: i4f0
            @Override // java.lang.Runnable
            public final void run() {
                m4f0 m4f0Var = this.a;
                m4f0Var.d = null;
                m4f0Var.f();
            }
        }, nqe.a());
        this.e.add(lb50Var);
        kpf0.a();
        lb50Var.d.b.k(new Runnable() { // from class: j4f0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e.remove(lb50Var);
            }
        }, nqe.a());
        aan aanVar2 = this.c;
        kpf0.a();
        nv5.d dVar = lb50Var.c;
        aanVar2.getClass();
        kpf0.a();
        pe6 pe6Var = (pe6) aanVar2.a.b(i8n.Q, new qe6(Arrays.asList(new vf6.a())));
        Objects.requireNonNull(pe6Var);
        int i3 = aan.e;
        aan.e = i3 + 1;
        sg1 sg1Var = aanVar2.d;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(pe6Var.hashCode());
        List<vf6> listA = pe6Var.a();
        Objects.requireNonNull(listA);
        for (vf6 vf6Var : listA) {
            ue6.a aVar = new ue6.a();
            ue6 ue6Var = aanVar2.b;
            int i4 = i;
            aVar.c = ue6Var.c;
            aVar.c(ue6Var.b);
            aVar.a(s4f0Var.k());
            gcn gcnVar2 = sg1Var.c;
            Objects.requireNonNull(gcnVar2);
            aVar.d(gcnVar2);
            int i5 = sg1Var.g;
            ArrayList arrayList2 = sg1Var.h;
            aan aanVar3 = aanVar2;
            if (arrayList2.size() > i2 && (gcnVar = sg1Var.d) != null) {
                aVar.d(gcnVar);
            }
            gcn gcnVar3 = sg1Var.e;
            boolean z = i2;
            if (gcnVar3 == null) {
                z = i4;
            }
            if (z != 0) {
                Objects.requireNonNull(gcnVar3);
                aVar.d(gcnVar3);
            }
            aVar.d = z;
            if (qbn.b(i5) || i5 == 32) {
                if (((ImageCaptureRotationOptionQuirk) xhe.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    wg1 wg1Var = ue6.i;
                } else {
                    aVar.b.Y(ue6.i, Integer.valueOf(s4f0Var.h()));
                }
                aVar.b.Y(ue6.j, Integer.valueOf(((s4f0Var.f() != null ? 1 : i4) == 0 || !lsg0.c(s4f0Var.c(), sg1Var.f)) ? s4f0Var.e() : s4f0Var.b() == 0 ? 100 : 95));
            }
            aVar.c(vf6Var.a().b);
            aVar.g.a.put(strValueOf, Integer.valueOf(i4));
            aVar.g.a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i3));
            aVar.b(sg1Var.a);
            if (arrayList2.size() > 1 && (tz5Var = sg1Var.b) != null) {
                aVar.b(tz5Var);
            }
            arrayList.add(aVar.e());
            i2 = 1;
            i = i4;
            aanVar2 = aanVar3;
            pe6Var = pe6Var;
        }
        int i6 = i;
        boolean z2 = i2 == true ? 1 : 0;
        i36 i36Var = new i36(arrayList, lb50Var);
        sy20 sy20Var = new sy20(pe6Var, s4f0Var, lb50Var, dVar, i3);
        aan aanVar4 = this.c;
        aanVar4.getClass();
        kpf0.a();
        aanVar4.d.l.accept(sy20Var);
        kpf0.a();
        h8n h8nVar = h8n.this;
        synchronized (h8nVar.s) {
            try {
                if (h8nVar.s.get() == null) {
                    h8nVar.s.set(Integer.valueOf(h8nVar.H()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h8n h8nVar2 = h8n.this;
        kpf0.a();
        pw6 pw6VarG = obj.g(h8nVar2.d().g(arrayList, h8nVar2.r, h8nVar2.t), new nbj(new ie4()), nqe.a());
        pw6VarG.k(new obj.b(pw6VarG, new l4f0(this, i36Var)), mku.a());
        kpf0.a();
        if (lb50Var.i != null) {
            z2 = i6;
        }
        km20.g("CaptureRequestFuture can only be set once.", z2);
        lb50Var.i = pw6VarG;
    }

    @Override // androidx.camera.core.b.a
    public final void g(b bVar) {
        ((adl) mku.a()).execute(new Runnable() { // from class: k4f0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        });
    }

    @Override // defpackage.h4f0
    public final void a() {
        kpf0.a();
        this.f = true;
        lb50 lb50Var = this.d;
        if (lb50Var != null) {
            kpf0.a();
            if (!lb50Var.d.b.isDone()) {
                k8n k8nVar = new k8n("The request is aborted silently and retried.", null);
                kpf0.a();
                lb50Var.g = true;
                pw6 pw6Var = lb50Var.i;
                Objects.requireNonNull(pw6Var);
                pw6Var.cancel(true);
                lb50Var.e.d(k8nVar);
                lb50Var.f.b(null);
                m4f0 m4f0Var = lb50Var.b;
                s4f0 s4f0Var = lb50Var.a;
                kpf0.a();
                pgt.a("TakePictureManagerImpl", lobGSRIlnSGJY.VvtHECq);
                m4f0Var.a.addFirst(s4f0Var);
                m4f0Var.f();
            }
        }
    }
}
