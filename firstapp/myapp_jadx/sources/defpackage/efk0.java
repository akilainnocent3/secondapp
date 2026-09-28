package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class efk0 extends bfk0 {
    public final /* synthetic */ TaskCompletionSource i;
    public final /* synthetic */ bfk0 v;
    public final /* synthetic */ odk0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efk0(odk0 odk0Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, bfk0 bfk0Var) {
        super(taskCompletionSource);
        this.i = taskCompletionSource2;
        this.v = bfk0Var;
        this.w = odk0Var;
    }

    @Override // defpackage.bfk0
    public final void b() {
        final odk0 odk0Var = this.w;
        synchronized (odk0Var.f) {
            try {
                final TaskCompletionSource taskCompletionSource = this.i;
                odk0Var.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: dfk0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        odk0 odk0Var2 = odk0Var;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (odk0Var2.f) {
                            odk0Var2.e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (odk0Var.l.getAndIncrement() > 0) {
                    odk0Var.b.c("Already connected to the service.", new Object[0]);
                }
                odk0.b(odk0Var, this.v);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
