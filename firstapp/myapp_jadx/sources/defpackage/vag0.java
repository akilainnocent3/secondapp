package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class vag0 implements tse {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ s9g0 b;

    public vag0(ibs ibsVar, s9g0 s9g0Var) {
        this.a = ibsVar;
        this.b = s9g0Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
    }
}
