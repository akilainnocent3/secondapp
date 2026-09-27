package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oh1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f153496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt f153497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1 f153498d;

    public oh1(ph1 ph1Var, long j10, xw1 xw1Var) {
        this.f153498d = ph1Var;
        this.f153496b = j10;
        this.f153497c = xw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dt dtVar = this.f153497c;
        if (dtVar.f148346b == ct.f147886b) {
            ((xw1) dtVar).run();
            this.f153498d.f153937a.postDelayed(this, this.f153496b);
        }
    }
}
