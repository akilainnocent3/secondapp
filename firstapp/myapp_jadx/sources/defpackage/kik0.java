package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class kik0 extends khk0 {
    public final yis.a c;

    public kik0(yis.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.c = aVar;
    }

    @Override // defpackage.rgk0
    public final boolean f(kgk0 kgk0Var) {
        return ((chk0) kgk0Var.f.get(this.c)) != null;
    }

    @Override // defpackage.rgk0
    public final Feature[] g(kgk0 kgk0Var) {
        return null;
    }

    @Override // defpackage.khk0
    public final void h(kgk0 kgk0Var) {
        TaskCompletionSource taskCompletionSource = this.b;
        chk0 chk0Var = (chk0) kgk0Var.f.remove(this.c);
        if (chk0Var == null) {
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        chk0Var.b.a.b.accept(kgk0Var.b, taskCompletionSource);
        yis yisVar = chk0Var.a.a;
        yisVar.b = null;
        yisVar.c = null;
    }

    @Override // defpackage.nik0
    public final /* bridge */ /* synthetic */ void d(tfk0 tfk0Var, boolean z) {
    }
}
