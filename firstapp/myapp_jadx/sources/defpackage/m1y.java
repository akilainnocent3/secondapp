package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class m1y implements tqc<Boolean> {
    public final /* synthetic */ rzf0 a;

    public m1y(rzf0 rzf0Var) {
        this.a = rzf0Var;
    }

    @Override // defpackage.tqc
    public final void onSuccess(Boolean bool) {
        Boolean bool2 = bool;
        bool2.getClass();
        this.a.invoke(bool2);
    }

    @Override // defpackage.tqc
    public final void a(Exception exc) {
    }
}
