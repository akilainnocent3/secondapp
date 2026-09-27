package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public enum w implements wk.g {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ sr.a f159714h = sr.c.c(d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159715b;

    w(int i10) {
        this.f159715b = i10;
    }

    @oy.l
    public static sr.a<w> g() {
        return f159714h;
    }

    @Override // wk.g
    public int getNumber() {
        return this.f159715b;
    }
}
