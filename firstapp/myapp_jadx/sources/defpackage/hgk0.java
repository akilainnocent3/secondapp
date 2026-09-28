package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class hgk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kgk0 b;

    public hgk0(kgk0 kgk0Var, int i) {
        this.b = kgk0Var;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.i(this.a);
    }
}
