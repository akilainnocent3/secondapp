package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ub1 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156349c;

    public ub1(String str, String str2) {
        super(str);
        this.f156348b = str;
        this.f156349c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f156348b;
    }
}
