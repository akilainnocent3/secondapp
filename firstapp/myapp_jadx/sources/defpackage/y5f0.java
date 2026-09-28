package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public final class y5f0<TResult> implements OnCompleteListener {
    public final /* synthetic */ bc6 a;

    public y5f0(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Object> task) {
        Exception exception = task.getException();
        bc6 bc6Var = this.a;
        if (exception != null) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(new zi50.b(exception));
        } else if (task.isCanceled()) {
            bc6Var.cancel(null);
        } else {
            zi50.a aVar2 = zi50.b;
            bc6Var.resumeWith(task.getResult());
        }
    }
}
