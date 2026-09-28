package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw5 implements Runnable {
    public final /* synthetic */ ow5 a;
    public final /* synthetic */ nv5.a b;

    public /* synthetic */ cw5(ow5 ow5Var, nv5.a aVar) {
        this.a = ow5Var;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ow5 ow5Var = this.a;
        final long jU = ow5Var.u();
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            ow5Var.j(new ow5.c() { // from class: fw5
                @Override // ow5.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    if (!ow5.q(totalCaptureResult, jU)) {
                        return false;
                    }
                    aVar.b(null);
                    return true;
                }
            });
            aVar.a = "waitForSessionUpdateId:" + jU;
        } catch (Exception e) {
            dVar.a(e);
        }
        obj.e(dVar, this.b);
    }
}
