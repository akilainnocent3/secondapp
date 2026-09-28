package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ngk0 implements r12.c {
    public final sl0.f a;
    public final qn0 b;
    public b c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ y4l f;

    public ngk0(y4l y4lVar, sl0.f fVar, qn0 qn0Var) {
        this.f = y4lVar;
        this.a = fVar;
        this.b = qn0Var;
    }

    @Override // r12.c
    public final void a(ConnectionResult connectionResult) {
        this.f.C.post(new mgk0(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        kgk0 kgk0Var = (kgk0) this.f.y.get(this.b);
        if (kgk0Var != null) {
            kgk0Var.q(connectionResult);
        }
    }
}
