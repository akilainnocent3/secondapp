package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class lqh extends pd00 {
    public final pyj b;

    public lqh(pyj pyjVar) {
        this.b = pyjVar;
    }

    @Override // defpackage.pd00
    public final boolean a() {
        pyj pyjVar = this.b;
        if (!pyjVar.o()) {
            return false;
        }
        if (pyjVar.k() > 0 || pyjVar.j() > 0) {
            return true;
        }
        return pyjVar.n() && pyjVar.m().i();
    }
}
