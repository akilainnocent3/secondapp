package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class qpl0 extends jjl0 {
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ vgl0 c;
    public final /* synthetic */ vtl0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpl0(vtl0 vtl0Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, vgl0 vgl0Var) {
        super(taskCompletionSource);
        this.d = vtl0Var;
        this.b = taskCompletionSource2;
        this.c = vgl0Var;
    }

    @Override // defpackage.jjl0
    public final void a() {
        synchronized (this.d.f) {
            try {
                final vtl0 vtl0Var = this.d;
                final TaskCompletionSource taskCompletionSource = this.b;
                vtl0Var.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: pll0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        vtl0 vtl0Var2 = vtl0Var;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (vtl0Var2.f) {
                            vtl0Var2.e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.d.k.getAndIncrement() > 0) {
                    this.d.b.a("Already connected to the service.", new Object[0]);
                }
                vtl0.b(this.d, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
