package defpackage;

import android.content.SharedPreferences;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class cel0 implements Runnable {
    public final /* synthetic */ crk0 a;
    public final /* synthetic */ nfl0 b;

    public cel0(nfl0 nfl0Var, crk0 crk0Var) {
        this.a = crk0Var;
        this.b = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k8l0 k8l0Var = this.b.a;
        j6l0 j6l0Var = k8l0Var.e;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.k(j6l0Var);
        j6l0Var.g();
        j6l0Var.g();
        crk0 crk0VarB = crk0.b(j6l0Var.k().getString("dma_consent_settings", null));
        crk0 crk0Var = this.a;
        int i = crk0Var.a;
        if (!jbl0.l(i, crk0VarB.a)) {
            k8l0.m(y4l0Var);
            y4l0Var.l.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = j6l0Var.k().edit();
        editorEdit.putString("dma_consent_settings", crk0Var.b);
        editorEdit.apply();
        k8l0.m(y4l0Var);
        y4l0Var.n.b(crk0Var, "Setting DMA consent(FE)");
        if (k8l0Var.o().q()) {
            final ikl0 ikl0VarO = k8l0Var.o();
            ikl0VarO.g();
            ikl0VarO.h();
            ikl0VarO.u(new Runnable() { // from class: yjl0
                @Override // java.lang.Runnable
                public final void run() {
                    ikl0 ikl0Var = ikl0VarO;
                    k8l0 k8l0Var2 = ikl0Var.a;
                    o3l0 o3l0Var = ikl0Var.d;
                    if (o3l0Var == null) {
                        y4l0 y4l0Var2 = k8l0Var2.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.f.a("Failed to send Dma consent settings to service");
                        return;
                    }
                    try {
                        o3l0Var.s(ikl0Var.w(false));
                        ikl0Var.t();
                    } catch (RemoteException e) {
                        y4l0 y4l0Var3 = k8l0Var2.f;
                        k8l0.m(y4l0Var3);
                        y4l0Var3.f.b(e, "Failed to send Dma consent settings to the service");
                    }
                }
            });
            return;
        }
        ikl0 ikl0VarO2 = k8l0Var.o();
        ikl0VarO2.g();
        ikl0VarO2.h();
        if (ikl0VarO2.p()) {
            ikl0VarO2.u(new pil0(ikl0VarO2, ikl0VarO2.w(false)));
        }
    }
}
