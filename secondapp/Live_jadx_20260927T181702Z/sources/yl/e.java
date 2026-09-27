package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public enum e implements wk.g {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ sr.a f159610j = sr.c.c(d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159611b;

    e(int i10) {
        this.f159611b = i10;
    }

    @oy.l
    public static sr.a<e> g() {
        return f159610j;
    }

    @Override // wk.g
    public int getNumber() {
        return this.f159611b;
    }
}
