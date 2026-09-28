package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by5 implements Runnable {
    public final /* synthetic */ ow5 a;
    public final /* synthetic */ fy5.f b;

    public /* synthetic */ by5(ow5 ow5Var, fy5.f fVar) {
        this.a = ow5Var;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.a.remove(this.b);
    }
}
