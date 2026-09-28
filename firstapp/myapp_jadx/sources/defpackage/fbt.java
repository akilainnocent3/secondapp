package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class fbt implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ bbt b;

    public fbt(ibs ibsVar, bbt bbtVar) {
        this.a = ibsVar;
        this.b = bbtVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
