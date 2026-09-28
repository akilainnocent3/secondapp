package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wtg0 implements tse {
    public final /* synthetic */ dtg0 a;
    public final /* synthetic */ dtg0.a b;

    public wtg0(dtg0 dtg0Var, dtg0.a aVar) {
        this.a = dtg0Var;
        this.b = aVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        dtg0 dtg0Var = this.a;
        dtg0Var.getClass();
        dtg0.a.C0505a c0505a = (dtg0.a.C0505a) ((x5a0) this.b.b).getValue();
        if (c0505a != null) {
            dtg0Var.i.remove(c0505a.a);
        }
    }
}
