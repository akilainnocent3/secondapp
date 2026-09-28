package defpackage;

import com.google.android.gms.measurement.internal.zzoq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class shl0 extends x3l0 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ ikl0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shl0(ikl0 ikl0Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.a = atomicReference;
        this.b = ikl0Var;
    }

    @Override // defpackage.z3l0
    public final void S(zzoq zzoqVar) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            y4l0 y4l0Var = this.b.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.b(Integer.valueOf(zzoqVar.a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
