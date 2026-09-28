package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class mgl0 implements Runnable {
    public final /* synthetic */ igl0 a;
    public final /* synthetic */ igl0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ khl0 e;

    public mgl0(khl0 khl0Var, igl0 igl0Var, igl0 igl0Var2, long j, boolean z) {
        this.a = igl0Var;
        this.b = igl0Var2;
        this.c = j;
        this.d = z;
        this.e = khl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.q(this.a, this.b, this.c, this.d, null);
    }
}
