package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class l6a implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ d6a b;

    public l6a(ibs ibsVar, d6a d6aVar) {
        this.a = ibsVar;
        this.b = d6aVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
