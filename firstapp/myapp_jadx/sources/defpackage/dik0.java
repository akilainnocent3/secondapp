package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class dik0 extends khk0 {
    public final chk0 c;

    public dik0(chk0 chk0Var, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.c = chk0Var;
    }

    @Override // defpackage.rgk0
    public final boolean f(kgk0 kgk0Var) {
        return true;
    }

    @Override // defpackage.rgk0
    public final Feature[] g(kgk0 kgk0Var) {
        return null;
    }

    @Override // defpackage.khk0
    public final void h(kgk0 kgk0Var) {
        ehk0 ehk0Var = this.c.a;
        ehk0Var.b.a.accept(kgk0Var.b, this.b);
        yis.a aVar = this.c.a.a.c;
        if (aVar != null) {
            kgk0Var.f.put(aVar, this.c);
        }
    }

    @Override // defpackage.nik0
    public final /* bridge */ /* synthetic */ void d(tfk0 tfk0Var, boolean z) {
    }
}
