package defpackage;

import androidx.compose.runtime.m;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class t4s extends d.c implements nk10, yma, l2l, x5s.a {
    public x5s D;
    public n6s E;
    public iif0 F;
    public final ytw G = m.b(null);

    public t4s(x5s x5sVar, n6s n6sVar, iif0 iif0Var) {
        this.D = x5sVar;
        this.E = n6sVar;
        this.F = iif0Var;
    }

    @Override // x5s.a
    public final urr Q() {
        return (urr) ((x5a0) this.G).getValue();
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        x5s x5sVar = this.D;
        if (x5sVar.a != null) {
            zkn.c("Expected textInputModifierNode to be null");
        }
        x5sVar.a = this;
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        this.D.j(this);
    }

    public final ooa0 p2() {
        return (ooa0) zma.a(this, kna.p);
    }

    @Override // defpackage.l2l
    public final void r0(ywx ywxVar) {
        ((x5a0) this.G).setValue(ywxVar);
    }
}
