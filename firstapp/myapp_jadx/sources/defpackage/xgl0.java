package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class xgl0 extends dal0 {
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ b1l0 c;
    public final /* synthetic */ esl0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgl0(esl0 esl0Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, b1l0 b1l0Var) {
        super(taskCompletionSource);
        this.b = taskCompletionSource2;
        this.c = b1l0Var;
        this.d = esl0Var;
    }

    @Override // defpackage.dal0
    public final void a() {
        synchronized (this.d.f) {
            try {
                final esl0 esl0Var = this.d;
                final TaskCompletionSource taskCompletionSource = this.b;
                esl0Var.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: oel0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        esl0 esl0Var2 = esl0Var;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (esl0Var2.f) {
                            esl0Var2.e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.d.k.getAndIncrement() > 0) {
                    this.d.b.a("Already connected to the service.", new Object[0]);
                }
                esl0.b(this.d, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
