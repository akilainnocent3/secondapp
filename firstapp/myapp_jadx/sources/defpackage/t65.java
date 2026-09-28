package defpackage;

import androidx.compose.animation.l;
import androidx.compose.runtime.m;

/* JADX INFO: loaded from: classes.dex */
public final class t65 {
    public final l a;
    public final dtg0<Boolean> b;
    public final ytw c;
    public final ytw d;
    public goh<lk40> e = u65.a;
    public final ytw f = m.b(null);

    public t65(l lVar, dtg0<Boolean> dtg0Var, dtg0<Boolean>.a<lk40, lj0> aVar, c75 c75Var) {
        this.a = lVar;
        this.b = dtg0Var;
        this.c = m.b(aVar);
        this.d = m.b(c75Var);
    }

    public final boolean a() {
        return ((Boolean) ((x5a0) this.b.d).getValue()).booleanValue();
    }

    public final lk40 b() {
        twd0 twd0Var;
        if (!this.a.i() || (twd0Var = (twd0) ((x5a0) this.f).getValue()) == null) {
            return null;
        }
        return (lk40) twd0Var.getValue();
    }
}
