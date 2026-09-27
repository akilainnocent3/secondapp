package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class t13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f155674a = new jb2(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f155675b;

    public final long a(ld0 ld0Var) {
        int i10 = 0;
        ld0Var.b(this.f155674a.f151001a, 0, 1, false);
        int i11 = this.f155674a.f151001a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        ld0Var.b(this.f155674a.f151001a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f155674a.f151001a[i10] & 255) + (i14 << 8);
        }
        this.f155675b = i13 + 1 + this.f155675b;
        return i14;
    }
}
