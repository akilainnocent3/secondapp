package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class yy40 implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ wx40 b;

    public yy40(ibs ibsVar, wx40 wx40Var) {
        this.a = ibsVar;
        this.b = wx40Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
