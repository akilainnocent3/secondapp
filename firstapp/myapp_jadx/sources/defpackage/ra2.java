package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ra2 implements tse {
    public final /* synthetic */ ka2 a;

    public ra2(ka2 ka2Var) {
        this.a = ka2Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        ka2.a aVar = (ka2.a) ((x5a0) this.a.c).getValue();
        if (aVar != null) {
            aVar.close();
        }
    }
}
