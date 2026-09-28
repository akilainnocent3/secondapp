package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class gel0 implements Runnable {
    public final /* synthetic */ jbl0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nfl0 d;

    public gel0(nfl0 nfl0Var, jbl0 jbl0Var, long j, boolean z) {
        this.a = jbl0Var;
        this.b = j;
        this.c = z;
        this.d = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nfl0 nfl0Var = this.d;
        jbl0 jbl0Var = this.a;
        nfl0Var.k(jbl0Var);
        nfl0Var.w(jbl0Var, this.b, this.c);
    }
}
