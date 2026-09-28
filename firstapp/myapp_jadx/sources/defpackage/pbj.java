package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pbj implements cbj<Object> {
    public final /* synthetic */ nv5.a a;

    public pbj(nv5.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.cbj
    public final void onSuccess(Object obj) {
        nv5.a aVar = this.a;
        try {
            aVar.b(obj);
        } catch (Throwable th) {
            aVar.d(th);
        }
    }
}
