package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f151905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f151906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f151907e;

    public l93(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + to.c.userBaseDel;
        } else {
            str = "";
        }
        this.f151903a = str;
        this.f151904b = i11;
        this.f151905c = i12;
        this.f151906d = Integer.MIN_VALUE;
        this.f151907e = "";
    }

    public final void a() {
        int i10 = this.f151906d;
        this.f151906d = i10 == Integer.MIN_VALUE ? this.f151904b : i10 + this.f151905c;
        this.f151907e = this.f151903a + this.f151906d;
    }

    public final void b() {
        if (this.f151906d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
