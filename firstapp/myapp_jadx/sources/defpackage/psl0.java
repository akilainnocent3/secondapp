package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class psl0 extends htl0 {
    public final dzk0 e;

    public /* synthetic */ psl0(dzk0 dzk0Var) {
        super(false, null, null);
        this.e = dzk0Var;
    }

    @Override // defpackage.htl0
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            gqm.a(e);
            return null;
        }
    }
}
