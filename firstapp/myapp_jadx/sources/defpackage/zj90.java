package defpackage;

import androidx.compose.ui.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zj90 extends d.c implements qcf, mfy {
    public qx80 D;
    public hx80 E;
    public nln F;

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        nln nlnVarB = this.F;
        if (nlnVarB == null) {
            nlnVarB = pkd.g(this).getGraphicsContext().b().b(this.D, this.E);
            this.F = nlnVarB;
        }
        nlnVarB.g(wsrVar, wsrVar.a.d(), 1.0f, null);
        wsrVar.b2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zj90.class != obj.getClass()) {
            return false;
        }
        zj90 zj90Var = (zj90) obj;
        return Intrinsics.g(this.D, zj90Var.D) && Intrinsics.g(this.E, zj90Var.E);
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
