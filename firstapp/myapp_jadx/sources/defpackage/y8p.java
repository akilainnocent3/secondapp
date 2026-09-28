package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class y8p implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ j8p b;

    public y8p(ibs ibsVar, j8p j8pVar) {
        this.a = ibsVar;
        this.b = j8pVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
