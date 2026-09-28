package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nld implements b68 {
    public final /* synthetic */ old a;

    public nld(old oldVar) {
        this.a = oldVar;
    }

    @Override // defpackage.b68
    public final long a() {
        old oldVar = this.a;
        long jA = oldVar.I.a();
        if (jA != 16) {
            return jA;
        }
        ot50 ot50Var = (ot50) zma.a(oldVar, ut50.a);
        if (ot50Var != null) {
            long j = ot50Var.a;
            if (j != 16) {
                return j;
            }
        }
        return ((j58) zma.a(oldVar, iza.a)).a;
    }
}
