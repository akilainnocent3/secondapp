package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class x5s implements rk10 {
    public t4s a;

    public interface a {
        urr Q();
    }

    @Override // defpackage.rk10
    public final void e() {
        ooa0 ooa0VarP2;
        t4s t4sVar = this.a;
        if (t4sVar == null || (ooa0VarP2 = t4sVar.p2()) == null) {
            return;
        }
        ooa0VarP2.b();
    }

    @Override // defpackage.rk10
    public final void g() {
        ooa0 ooa0VarP2;
        t4s t4sVar = this.a;
        if (t4sVar == null || (ooa0VarP2 = t4sVar.p2()) == null) {
            return;
        }
        ooa0VarP2.a();
    }

    public abstract void i();

    public final void j(t4s t4sVar) {
        if (this.a != t4sVar) {
            zkn.c("Expected textInputModifierNode to be " + t4sVar + " but was " + this.a);
        }
        this.a = null;
    }
}
