package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vgj0 implements Runnable {
    public final /* synthetic */ s9s a;
    public final /* synthetic */ xgj0 b;

    public vgj0(s9s s9sVar, xgj0 xgj0Var) {
        this.a = s9sVar;
        this.b = xgj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b);
    }
}
