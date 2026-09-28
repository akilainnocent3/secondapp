package defpackage;

import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.k;

/* JADX INFO: loaded from: classes.dex */
public final class zdd implements uiv {
    public final lvd0 a;
    public final e b;
    public k c;
    public uiv d;
    public boolean e = true;
    public boolean f;

    public zdd(e eVar, vs7 vs7Var) {
        this.b = eVar;
        this.a = new lvd0(vs7Var);
    }

    public final void a(k kVar) {
        uiv uivVar;
        uiv uivVarC = kVar.C();
        if (uivVarC == null || uivVarC == (uivVar = this.d)) {
            return;
        }
        if (uivVar != null) {
            throw new rwg(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = uivVarC;
        this.c = kVar;
        ((wiv) uivVarC).e(this.a.e);
    }

    @Override // defpackage.uiv
    public final eo10 c() {
        uiv uivVar = this.d;
        return uivVar != null ? uivVar.c() : this.a.e;
    }

    @Override // defpackage.uiv
    public final void e(eo10 eo10Var) {
        uiv uivVar = this.d;
        if (uivVar != null) {
            uivVar.e(eo10Var);
            eo10Var = this.d.c();
        }
        this.a.e(eo10Var);
    }

    @Override // defpackage.uiv
    public final boolean l() {
        if (this.e) {
            return false;
        }
        uiv uivVar = this.d;
        uivVar.getClass();
        return uivVar.l();
    }

    @Override // defpackage.uiv
    public final long v() {
        if (this.e) {
            return this.a.v();
        }
        uiv uivVar = this.d;
        uivVar.getClass();
        return uivVar.v();
    }
}
