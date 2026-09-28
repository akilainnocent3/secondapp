package defpackage;

import androidx.compose.ui.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vj90 extends d.c implements qcf, mfy {
    public qx80 D;
    public hx80 E;
    public wef F;

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        wef wefVarC = this.F;
        if (wefVarC == null) {
            wefVarC = pkd.g(this).getGraphicsContext().b().c(this.D, this.E);
            this.F = wefVarC;
        }
        wefVarC.g(wsrVar, wsrVar.a.d(), 1.0f, null);
        wsrVar.b2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vj90)) {
            return false;
        }
        vj90 vj90Var = (vj90) obj;
        return Intrinsics.g(this.D, vj90Var.D) && Intrinsics.g(this.E, vj90Var.E);
    }

    public final int hashCode() {
        return this.E.hashCode() + (this.D.hashCode() * 31);
    }

    @Override // defpackage.mfy
    public final void t0() {
        this.F = null;
        rcf.a(this);
    }
}
