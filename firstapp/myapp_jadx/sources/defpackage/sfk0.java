package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class sfk0 implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource a;
    public final /* synthetic */ tfk0 b;

    public sfk0(tfk0 tfk0Var, TaskCompletionSource taskCompletionSource) {
        this.b = tfk0Var;
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.b.b.remove(this.a);
    }
}
