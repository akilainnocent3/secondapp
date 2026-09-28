package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zhe0 implements cbj<Void> {
    public final /* synthetic */ nv5.a a;
    public final /* synthetic */ nv5.d b;

    public zhe0(nv5.a aVar, nv5.d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        if (th instanceof cie0.b) {
            km20.g(null, this.b.cancel(false));
        } else {
            km20.g(null, this.a.b(null));
        }
    }

    @Override // defpackage.cbj
    public final void onSuccess(Void r1) {
        km20.g(null, this.a.b(null));
    }
}
