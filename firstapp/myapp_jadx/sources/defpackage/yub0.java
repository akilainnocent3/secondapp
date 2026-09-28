package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class yub0 implements Runnable {
    public final /* synthetic */ qub0 a;
    public final /* synthetic */ bc6 b;

    public yub0(qub0 qub0Var, bc6 bc6Var) {
        this.a = qub0Var;
        this.b = bc6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.o3 = true;
        bc6 bc6Var = this.b;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(Unit.a);
        }
    }
}
