package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lxr implements tse {
    public final /* synthetic */ gyr a;

    public lxr(gyr gyrVar) {
        this.a = gyrVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        gyr gyrVar = this.a;
        lo20 lo20Var = gyrVar.d;
        if (lo20Var != null) {
            lo20Var.d = false;
        }
        gyrVar.d = null;
    }
}
