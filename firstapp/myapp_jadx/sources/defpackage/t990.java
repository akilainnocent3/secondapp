package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t990 {
    public final psm a;
    public final mgb0 b;
    public v340 c;

    public t990(psm psmVar, mgb0 mgb0Var) {
        psmVar.getClass();
        mgb0Var.getClass();
        this.a = psmVar;
        this.b = mgb0Var;
    }

    public final uwd0<Boolean> a() {
        v340 v340Var = this.c;
        if (v340Var != null) {
            return v340Var;
        }
        Intrinsics.n("_showKycDialogEventFlow");
        throw null;
    }

    public final void b(et7 et7Var) {
        mgb0 mgb0Var = this.b;
        this.c = e1i.e(new n1i(mgb0Var.getUserCertStatusFlow(), mgb0Var.getDocumentAuditStatusFlow(), new s990(this, null)), et7Var, q490.a.a, null);
    }
}
