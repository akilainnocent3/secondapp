package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xtg0 implements tse {
    public final /* synthetic */ dtg0 a;
    public final /* synthetic */ dtg0.d b;

    public xtg0(dtg0 dtg0Var, dtg0.d dVar) {
        this.a = dtg0Var;
        this.b = dVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.i.remove(this.b);
    }
}
