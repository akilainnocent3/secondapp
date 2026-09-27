package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155345a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f155346b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155347c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f155348d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f155349e = 15;

    public final void a(int i10) {
        int i11 = this.f155347c;
        int[] iArr = this.f155348d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f155345a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.f155348d, 0, iArr2, i13, i12);
            this.f155345a = 0;
            this.f155346b = this.f155347c - 1;
            this.f155348d = iArr2;
            this.f155349e = length - 1;
        }
        int i14 = (this.f155346b + 1) & this.f155349e;
        this.f155346b = i14;
        this.f155348d[i14] = i10;
        this.f155347c++;
    }
}
