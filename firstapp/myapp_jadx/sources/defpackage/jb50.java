package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class jb50 implements uym {
    public final srm a;
    public final prm b;

    public jb50(srm srmVar, prm prmVar) {
        srmVar.getClass();
        prmVar.getClass();
        this.a = srmVar;
        this.b = prmVar;
    }

    @Override // defpackage.uym
    public final Object a(tje0 tje0Var) {
        prm prmVar = this.b;
        Object objM = this.a.m(new ip4(prmVar.f()), "/app/bonus-cup/spawn", prmVar.c(), tje0Var);
        return objM == y5b.a ? objM : Unit.a;
    }
}
