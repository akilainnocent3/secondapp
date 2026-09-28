package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class u3g0 {
    public final ow5 a;
    public final ssw<Integer> b;
    public final ssw<Integer> c;
    public final boolean d;
    public boolean e;
    public final int f;
    public nv5.a<Void> g;
    public boolean h;

    public u3g0(ow5 ow5Var, e16 e16Var, od80 od80Var) {
        this.a = ow5Var;
        boolean zA = juh.a(new cy5(e16Var));
        this.d = zA;
        int iB = (zA && e16Var.e()) ? e16Var.b() : 0;
        this.f = iB;
        this.b = new ssw<>(0);
        this.c = new ssw<>(Integer.valueOf(iB));
        ow5Var.j(new ow5.c() { // from class: t3g0
            @Override // ow5.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                u3g0 u3g0Var = this.a;
                if (u3g0Var.g != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == u3g0Var.h) {
                        u3g0Var.g.b(null);
                        u3g0Var.g = null;
                    }
                }
                return false;
            }
        });
    }

    public final void a(nv5.a<Void> aVar, int i) {
        if (!this.d) {
            if (aVar != null) {
                aVar.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.e) {
            b(0);
            if (aVar != null) {
                aVar.d(new k16("Camera is not active."));
                return;
            }
            return;
        }
        this.h = i != 0;
        this.a.l(i);
        b(i);
        nv5.a<Void> aVar2 = this.g;
        if (aVar2 != null) {
            aVar2.d(new k16("There is a new enableTorch being set"));
        }
        this.g = aVar;
    }

    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i != 1 ? 0 : 1);
        boolean zB = kpf0.b();
        ssw<Integer> sswVar = this.b;
        if (zB) {
            sswVar.m(numValueOf);
        } else {
            sswVar.j(numValueOf);
        }
    }
}
