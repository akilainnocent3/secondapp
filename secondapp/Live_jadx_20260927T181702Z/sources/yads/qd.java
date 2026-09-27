package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qd implements jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f154433b;

    public qd(String str, Runnable runnable) {
        this.f154432a = str;
        this.f154433b = runnable;
    }

    public final void a() {
        this.f154433b.run();
    }

    public final boolean a(String str, String str2) {
        return kotlin.jvm.internal.m0.g("mobileads", str) && kotlin.jvm.internal.m0.g(this.f154432a, str2);
    }
}
