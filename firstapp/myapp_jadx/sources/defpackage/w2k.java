package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class w2k implements hxd0 {
    public final wrh0 a;
    public final TaskCompletionSource<snn> b;

    public w2k(wrh0 wrh0Var, TaskCompletionSource<snn> taskCompletionSource) {
        this.a = wrh0Var;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.hxd0
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // defpackage.hxd0
    public final boolean b(yj1 yj1Var) {
        if (yj1Var.f() == ke00.a.d && !this.a.a(yj1Var)) {
            String str = yj1Var.d;
            if (str != null) {
                this.b.setResult(new aj1(str, yj1Var.f, yj1Var.g));
                return true;
            }
            bmy.a("Null token");
        }
        return false;
    }
}
