package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class d7k implements hxd0 {
    public final TaskCompletionSource<String> a;

    public d7k(TaskCompletionSource<String> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.hxd0
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.hxd0
    public final boolean b(yj1 yj1Var) {
        if (yj1Var.f() != ke00.a.c && yj1Var.f() != ke00.a.d && yj1Var.f() != ke00.a.e) {
            return false;
        }
        this.a.trySetResult(yj1Var.b);
        return true;
    }
}
