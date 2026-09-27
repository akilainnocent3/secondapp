package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f155873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f155874d;

    public tf1(int i10, int i11, int i12, int i13) {
        this.f155871a = i10;
        this.f155872b = i11;
        this.f155873c = i12;
        this.f155874d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f155871a - this.f155872b <= 1) {
                return false;
            }
        } else if (this.f155873c - this.f155874d <= 1) {
            return false;
        }
        return true;
    }
}
