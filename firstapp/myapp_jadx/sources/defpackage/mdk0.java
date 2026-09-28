package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class mdk0 extends bfk0 {
    public final /* synthetic */ ndk0 i;

    public mdk0(ndk0 ndk0Var) {
        this.i = ndk0Var;
    }

    @Override // defpackage.bfk0
    public final void b() {
        odk0 odk0Var = this.i.a;
        odk0Var.b.c("unlinkToDeath", new Object[0]);
        odk0Var.n.asBinder().unlinkToDeath(odk0Var.k, 0);
        odk0Var.n = null;
        odk0Var.g = false;
    }
}
