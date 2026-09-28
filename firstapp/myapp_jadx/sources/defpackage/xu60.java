package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xu60 implements cbs {
    public final fv60 a;

    public xu60(fv60 fv60Var) {
        this.a = fv60Var;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        if (aVar != s9s.a.ON_CREATE) {
            dmy.a(aVar, "Next event must be ON_CREATE, it was ");
        } else {
            ibsVar.getLifecycle().d(this);
            this.a.b();
        }
    }
}
