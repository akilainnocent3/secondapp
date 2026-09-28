package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class zwy implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ lwy b;

    public zwy(ibs ibsVar, lwy lwyVar) {
        this.a = ibsVar;
        this.b = lwyVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
