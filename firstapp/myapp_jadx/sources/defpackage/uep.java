package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class uep extends l3 {
    public final acp f;
    public final int i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uep(wbp wbpVar, acp acpVar) {
        super(wbpVar, acpVar, null);
        wbpVar.getClass();
        this.f = acpVar;
        this.i = acpVar.a.size();
        this.v = -1;
    }

    @Override // defpackage.uex
    public final String P(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.l3
    public final scp T(String str) {
        str.getClass();
        return this.f.a.get(Integer.parseInt(str));
    }

    @Override // defpackage.l3
    public final scp V() {
        return this.f;
    }

    @Override // defpackage.dma
    public final int v(pd80 pd80Var) {
        pd80Var.getClass();
        int i = this.v;
        if (i >= this.i - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.v = i2;
        return i2;
    }
}
