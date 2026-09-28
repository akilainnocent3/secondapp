package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class dep extends l3 {
    public final scp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dep(wbp wbpVar, scp scpVar, String str) {
        super(wbpVar, scpVar, str);
        wbpVar.getClass();
        scpVar.getClass();
        this.f = scpVar;
        this.a.add("primitive");
    }

    @Override // defpackage.l3
    public final scp T(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        hb5.a("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.l3
    public final scp V() {
        return this.f;
    }

    @Override // defpackage.dma
    public final int v(pd80 pd80Var) {
        pd80Var.getClass();
        return 0;
    }
}
