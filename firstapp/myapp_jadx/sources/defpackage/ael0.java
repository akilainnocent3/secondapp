package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ael0 implements Runnable {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ nfl0 b;

    public ael0(nfl0 nfl0Var, Boolean bool) {
        this.a = bool;
        this.b = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.x(this.a, true);
    }
}
