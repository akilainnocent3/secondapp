package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yu60 implements cbs, AutoCloseable {
    public final String a;
    public final vu60 b;
    public boolean c;

    public yu60(String str, vu60 vu60Var) {
        this.a = str;
        this.b = vu60Var;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        if (aVar == s9s.a.ON_DESTROY) {
            this.c = false;
            ibsVar.getLifecycle().d(this);
        }
    }

    public final void d(s9s s9sVar, jv60 jv60Var) {
        jv60Var.getClass();
        s9sVar.getClass();
        if (this.c) {
            ib5.a("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        s9sVar.a(this);
        jv60Var.c(this.a, this.b.b.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
