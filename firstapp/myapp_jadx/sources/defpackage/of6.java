package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class of6 implements cbj<Void> {
    public final /* synthetic */ qf6 a;

    public of6(qf6 qf6Var) {
        this.a = qf6Var;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        synchronized (this.a.a) {
            try {
                this.a.d.y();
                int iOrdinal = this.a.j.ordinal();
                if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                    pgt.j("CaptureSession", "Opening session with fail " + this.a.j, th);
                    this.a.l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.cbj
    public final void onSuccess(Void r1) {
    }
}
