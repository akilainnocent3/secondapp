package defpackage;

import androidx.compose.runtime.m;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kae extends t12 implements nsr, j3w {
    public final ydh0 c;
    public final ytw d;

    public kae(ydh0 ydh0Var, Function1 function1) {
        super(function1);
        this.c = ydh0Var;
        this.d = m.b(ydh0Var);
    }

    @Override // defpackage.nsr
    public final biv e(t tVar, vhv vhvVar, long j) {
        int iC = ((g8j0) ((x5a0) this.d).getValue()).c(tVar);
        if (iC == 0) {
            return t.z1(tVar, 0, 0, new jae(0));
        }
        y yVarD0 = vhvVar.d0(kxa.b(0, 0, iC, iC, 3, j));
        return t.z1(tVar, yVarD0.a, iC, new vf0(yVarD0, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kae) {
            return this.c.equals(((kae) obj).c);
        }
        return false;
    }

    @Override // defpackage.j3w
    public final void g(n3w n3wVar) {
        ((x5a0) this.d).setValue(new stg(this.c, (g8j0) n3wVar.g(u8j0.a)));
    }

    public final int hashCode() {
        return y8j0.a.hashCode() + (this.c.hashCode() * 31);
    }
}
