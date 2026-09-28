package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ypw implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ zow b;

    public ypw(ibs ibsVar, zow zowVar) {
        this.a = ibsVar;
        this.b = zowVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
