package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lal0 implements wnk0 {
    public final wnk0 a;

    public lal0(wnk0 wnk0Var) {
        this.a = wnk0Var;
    }

    @Override // defpackage.wnk0
    public final Object zza() {
        y2l0 y2l0Var = (y2l0) this.a.zza();
        if (y2l0Var != null) {
            return y2l0Var;
        }
        bmy.a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
