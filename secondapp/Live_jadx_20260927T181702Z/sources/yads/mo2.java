package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mo2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f152589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f152590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po2 f152591d;

    public mo2(po2 po2Var, String str, long j10) {
        this.f152591d = po2Var;
        this.f152589b = str;
        this.f152590c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f152591d.f154019b.a(this.f152589b, this.f152590c);
        po2 po2Var = this.f152591d;
        km3 km3Var = po2Var.f154019b;
        po2Var.toString();
        km3Var.a();
    }
}
