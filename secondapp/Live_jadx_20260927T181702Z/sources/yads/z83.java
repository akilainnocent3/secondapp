package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f158657a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f158658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f158659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f158660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f158661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f158662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f158663g;

    public final void a(m73 m73Var, long j10, int i10, int i11, int i12, l73 l73Var) {
        if (!(this.f158663g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f158658b) {
            int i13 = this.f158659c;
            int i14 = i13 + 1;
            this.f158659c = i14;
            if (i13 == 0) {
                this.f158660d = j10;
                this.f158661e = i10;
                this.f158662f = 0;
            }
            int i15 = this.f158662f + i11;
            this.f158662f = i15;
            this.f158663g = i12;
            if (i14 < 16 || i14 <= 0) {
                return;
            }
            m73Var.a(this.f158660d, this.f158661e, i15, i12, l73Var);
            this.f158659c = 0;
        }
    }

    public final void a(nq0 nq0Var) {
        if (this.f158658b) {
            return;
        }
        nq0Var.a(this.f158657a, 0, 10);
        nq0Var.b();
        byte[] bArr = this.f158657a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.f158658b = true;
        }
    }
}
