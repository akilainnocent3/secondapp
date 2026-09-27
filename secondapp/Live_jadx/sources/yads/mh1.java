package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh1 f152453a = new nh1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d63 f152454b = new d63();

    public final void a(Runnable runnable) {
        this.f152454b.getClass();
        if (d63.a()) {
            runnable.run();
        } else {
            this.f152453a.f153051a.post(runnable);
        }
    }

    public final void a() {
        this.f152453a.f153051a.removeCallbacksAndMessages(null);
    }
}
