package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sr implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po2 f155531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f155532c;

    public sr(tr trVar, po2 po2Var) {
        this.f155532c = trVar;
        this.f155531b = po2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f155532c.f156019c.put(this.f155531b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
