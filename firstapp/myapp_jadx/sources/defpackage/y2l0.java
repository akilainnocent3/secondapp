package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes4.dex */
public final class y2l0 implements hu0 {
    public final zql0 a;
    public final Context b;

    public y2l0(zql0 zql0Var, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = zql0Var;
        this.b = context;
    }

    @Override // defpackage.hu0
    public final Task<gu0> a() {
        String packageName = this.b.getPackageName();
        wgl0 wgl0Var = zql0.e;
        zql0 zql0Var = this.a;
        vtl0 vtl0Var = zql0Var.a;
        if (vtl0Var == null) {
            Object[] objArr = {-9};
            wgl0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", wgl0.b(wgl0Var.a, "onError(%d)", objArr));
            }
            return Tasks.forException(new lnn(-9));
        }
        wgl0Var.a("requestUpdateInfo(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        vtl0Var.a().post(new qpl0(vtl0Var, taskCompletionSource, taskCompletionSource, new vgl0(zql0Var, taskCompletionSource, packageName, taskCompletionSource)));
        return taskCompletionSource.getTask();
    }
}
