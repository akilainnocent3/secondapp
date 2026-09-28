package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class b1g0 {
    public final boolean a;
    public final puw b;
    public final cuw<Boolean> c = new cuw<>(Boolean.FALSE);
    public bc6 d;

    public b1g0(boolean z, puw puwVar) {
        this.a = z;
        this.b = puwVar;
    }

    public final void a() {
        bc6 bc6Var;
        this.c.o0(Boolean.FALSE);
        if (!this.a || (bc6Var = this.d) == null) {
            return;
        }
        bc6Var.cancel(null);
    }

    public final boolean b() {
        cuw<Boolean> cuwVar = this.c;
        return ((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue() || ((Boolean) ((x5a0) cuwVar.c).getValue()).booleanValue();
    }

    public final Object c(huw huwVar, tje0 tje0Var) {
        z0g0 z0g0Var = new z0g0(this, new a1g0(this, null), huwVar, null);
        puw puwVar = this.b;
        puwVar.getClass();
        Object objD = w5b.d(new muw(huwVar, puwVar, z0g0Var, null), tje0Var);
        return objD == y5b.a ? objD : Unit.a;
    }
}
