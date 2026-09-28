package defpackage;

import androidx.compose.runtime.m;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cnn implements nsr, j3w, m3w<g8j0> {
    public final g8j0 b;
    public final ytw c;
    public final ytw d;

    public cnn(g8j0 g8j0Var) {
        this.b = g8j0Var;
        this.c = m.b(g8j0Var);
        this.d = m.b(g8j0Var);
    }

    @Override // defpackage.nsr
    public final biv e(t tVar, vhv vhvVar, long j) {
        ytw ytwVar = this.c;
        final int iD = ((g8j0) ((x5a0) ytwVar).getValue()).d(tVar, tVar.getLayoutDirection());
        final int iA = ((g8j0) ((x5a0) ytwVar).getValue()).a(tVar);
        int iB = ((g8j0) ((x5a0) ytwVar).getValue()).b(tVar, tVar.getLayoutDirection()) + iD;
        int iC = ((g8j0) ((x5a0) ytwVar).getValue()).c(tVar) + iA;
        final y yVarD0 = vhvVar.d0(oxa.i(-iB, j, -iC));
        return t.z1(tVar, oxa.g(yVarD0.a + iB, j), oxa.f(yVarD0.b + iC, j), new Function1() { // from class: bnn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((y.a) obj).s(yVarD0, iD, iA, 0.0f);
                return Unit.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cnn) {
            return Intrinsics.g(((cnn) obj).b, this.b);
        }
        return false;
    }

    @Override // defpackage.j3w
    public final void g(n3w n3wVar) {
        g8j0 g8j0Var = (g8j0) n3wVar.g(u8j0.a);
        g8j0 g8j0Var2 = this.b;
        ((x5a0) this.c).setValue(new stg(g8j0Var2, g8j0Var));
        ((x5a0) this.d).setValue(new ydh0(g8j0Var, g8j0Var2));
    }

    @Override // defpackage.m3w
    public final g8j0 getValue() {
        return (g8j0) ((x5a0) this.d).getValue();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
