package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f151270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f151271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f151272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f151273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f151274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f151275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f151276g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f151277h;

    public final boolean a() {
        return this.f151273d > 15 && this.f151277h == 0;
    }

    public final void a(long j10) {
        long j11 = this.f151273d;
        if (j11 == 0) {
            this.f151270a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f151270a;
            this.f151271b = j12;
            this.f151275f = j12;
            this.f151274e = 1L;
        } else {
            long j13 = j10 - this.f151272c;
            int i10 = (int) (j11 % 15);
            if (Math.abs(j13 - this.f151271b) <= 1000000) {
                this.f151274e++;
                this.f151275f += j13;
                boolean[] zArr = this.f151276g;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f151277h--;
                }
            } else {
                boolean[] zArr2 = this.f151276g;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.f151277h++;
                }
            }
        }
        this.f151273d++;
        this.f151272c = j10;
    }
}
