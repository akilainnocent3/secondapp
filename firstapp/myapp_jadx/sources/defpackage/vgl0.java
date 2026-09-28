package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class vgl0 extends jjl0 {
    public final /* synthetic */ String b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ zql0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgl0(zql0 zql0Var, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.d = zql0Var;
        this.b = str;
        this.c = taskCompletionSource2;
    }

    @Override // defpackage.jjl0
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.c;
        zql0 zql0Var = this.d;
        String str = this.b;
        try {
            zql0Var.a.m.h(zql0Var.b, zql0.a(zql0Var, str), new ppl0(zql0Var, taskCompletionSource, str));
        } catch (RemoteException e) {
            wgl0 wgl0Var = zql0.e;
            Object[] objArr = {str};
            wgl0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", wgl0.b(wgl0Var.a, "requestUpdateInfo(%s)", objArr), e);
            }
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}
