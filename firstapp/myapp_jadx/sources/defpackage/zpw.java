package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class zpw implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ tow b;

    public zpw(ibs ibsVar, tow towVar) {
        this.a = ibsVar;
        this.b = towVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
