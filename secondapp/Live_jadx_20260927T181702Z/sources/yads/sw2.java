package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sw2 implements m93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw2 f155591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f155592b = new jb2(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f155594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f155595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f155596f;

    public sw2(rw2 rw2Var) {
        this.f155591a = rw2Var;
    }

    @Override // yads.m93
    public final void a(int i10, jb2 jb2Var) {
        boolean z10 = (i10 & 1) != 0;
        int iM = z10 ? jb2Var.f151002b + jb2Var.m() : -1;
        if (this.f155596f) {
            if (!z10) {
                return;
            }
            this.f155596f = false;
            jb2Var.e(iM);
            this.f155594d = 0;
        }
        while (true) {
            int i11 = jb2Var.f151003c - jb2Var.f151002b;
            if (i11 <= 0) {
                return;
            }
            int i12 = this.f155594d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iM2 = jb2Var.m();
                    jb2Var.e(jb2Var.f151002b - 1);
                    if (iM2 == 255) {
                        this.f155596f = true;
                        return;
                    }
                }
                int iMin = Math.min(jb2Var.f151003c - jb2Var.f151002b, 3 - this.f155594d);
                jb2Var.a(this.f155592b.f151001a, this.f155594d, iMin);
                int i13 = this.f155594d + iMin;
                this.f155594d = i13;
                if (i13 == 3) {
                    this.f155592b.e(0);
                    this.f155592b.d(3);
                    jb2 jb2Var2 = this.f155592b;
                    jb2Var2.e(jb2Var2.f151002b + 1);
                    int iM3 = this.f155592b.m();
                    int iM4 = this.f155592b.m();
                    this.f155595e = (iM3 & 128) != 0;
                    int i14 = (((iM3 & 15) << 8) | iM4) + 3;
                    this.f155593c = i14;
                    byte[] bArr = this.f155592b.f151001a;
                    if (bArr.length < i14) {
                        this.f155592b.a(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(i11, this.f155593c - i12);
                jb2Var.a(this.f155592b.f151001a, this.f155594d, iMin2);
                int i15 = this.f155594d + iMin2;
                this.f155594d = i15;
                int i16 = this.f155593c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f155595e) {
                        byte[] bArr2 = this.f155592b.f151001a;
                        int i17 = -1;
                        for (int i18 = 0; i18 < i16; i18++) {
                            i17 = ib3.f150529n[((i17 >>> 24) ^ (bArr2[i18] & 255)) & 255] ^ (i17 << 8);
                        }
                        int i19 = ib3.f150516a;
                        if (i17 != 0) {
                            this.f155596f = true;
                            return;
                        }
                        this.f155592b.d(this.f155593c - 4);
                    } else {
                        this.f155592b.d(i16);
                    }
                    this.f155592b.e(0);
                    this.f155591a.a(this.f155592b);
                    this.f155594d = 0;
                }
            }
        }
    }

    @Override // yads.m93
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
        this.f155591a.a(y63Var, pq0Var, l93Var);
        this.f155596f = true;
    }

    @Override // yads.m93
    public final void a() {
        this.f155596f = true;
    }
}
