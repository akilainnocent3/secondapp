package defpackage;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bqh implements SuccessContinuation {
    public final /* synthetic */ String a;

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        r3g0 r3g0Var = (r3g0) obj;
        r3g0Var.getClass();
        Task<Void> taskC = r3g0Var.c(new j3g0("U", this.a));
        r3g0Var.e();
        return taskC;
    }
}
