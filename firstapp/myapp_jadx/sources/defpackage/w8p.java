package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class w8p implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ l8p b;

    public w8p(ibs ibsVar, l8p l8pVar) {
        this.a = ibsVar;
        this.b = l8pVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
