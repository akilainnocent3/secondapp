package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ija implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ xia b;

    public ija(ibs ibsVar, xia xiaVar) {
        this.a = ibsVar;
        this.b = xiaVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
