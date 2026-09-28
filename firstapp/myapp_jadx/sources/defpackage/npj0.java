package defpackage;

import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes6.dex */
public final class npj0<O> implements ud {
    public final /* synthetic */ opj0 a;

    public npj0(opj0 opj0Var) {
        this.a = opj0Var;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        Void r2 = (Void) obj;
        bc6 bc6Var = this.a.f0;
        if (bc6Var != null) {
            if (bc6Var.p() instanceof bzx) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(r2);
            } else {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_COMMON);
                aVar2.n("Continuation not active, resume not perform.", new Object[0]);
            }
        }
    }
}
