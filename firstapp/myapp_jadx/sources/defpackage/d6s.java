package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d6s implements cbs {
    public final /* synthetic */ s9s a;
    public final /* synthetic */ jv60 b;

    public d6s(s9s s9sVar, jv60 jv60Var) {
        this.a = s9sVar;
        this.b = jv60Var;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        if (aVar == s9s.a.ON_START) {
            this.a.d(this);
            this.b.d();
        }
    }
}
