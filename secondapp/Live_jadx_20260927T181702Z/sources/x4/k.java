package x4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f144343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144345d = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f144342a = new int[8];

    public void a(int i10) {
        int[] iArr = this.f144342a;
        int i11 = this.f144344c;
        iArr[i11] = i10;
        int i12 = this.f144345d & (i11 + 1);
        this.f144344c = i12;
        if (i12 == this.f144343b) {
            c();
        }
    }

    public void b() {
        this.f144344c = this.f144343b;
    }

    public final void c() {
        int[] iArr = this.f144342a;
        int length = iArr.length;
        int i10 = this.f144343b;
        int i11 = length - i10;
        int i12 = length << 1;
        int[] iArr2 = new int[i12];
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f144342a, 0, iArr2, i11, this.f144343b);
        this.f144342a = iArr2;
        this.f144343b = 0;
        this.f144344c = length;
        this.f144345d = i12 - 1;
    }

    public boolean d() {
        return this.f144343b == this.f144344c;
    }

    public int e() {
        int i10 = this.f144343b;
        if (i10 == this.f144344c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f144342a[i10];
        this.f144343b = (i10 + 1) & this.f144345d;
        return i11;
    }
}
