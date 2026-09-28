package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class xgj0 implements cbs {
    public final /* synthetic */ s9s a;
    public final /* synthetic */ bc6 b;

    public xgj0(s9s s9sVar, bc6 bc6Var, arq.a.C0092a.C0093a c0093a) {
        s9s.b bVar = s9s.b.a;
        this.a = s9sVar;
        this.b = bc6Var;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        Object bVar;
        s9s.a.C1084a c1084a = s9s.a.Companion;
        s9s.b bVar2 = s9s.b.d;
        c1084a.getClass();
        s9s.a aVarB = s9s.a.C1084a.b(bVar2);
        bc6 bc6Var = this.b;
        s9s s9sVar = this.a;
        if (aVar != aVarB) {
            if (aVar == s9s.a.ON_DESTROY) {
                s9sVar.d(this);
                zi50.a aVar2 = zi50.b;
                bc6Var.resumeWith(new zi50.b(new oas(null)));
                return;
            }
            return;
        }
        s9sVar.d(this);
        try {
            zi50.a aVar3 = zi50.b;
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        bc6Var.resumeWith(bVar);
    }
}
