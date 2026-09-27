package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c93 implements sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y63 f147636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f147637b = new jb2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f147639d;

    public c93(int i10, y63 y63Var, int i11) {
        this.f147638c = i10;
        this.f147636a = y63Var;
        this.f147639d = i11;
    }

    @Override // yads.sp
    public final void a() {
        this.f147637b.a(ib3.f150521f);
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j10) {
        long j11;
        long j12 = ld0Var.f151947d;
        int iMin = (int) Math.min(this.f147639d, ld0Var.f151946c - j12);
        this.f147637b.c(iMin);
        ld0Var.b(this.f147637b.f151001a, 0, iMin, false);
        jb2 jb2Var = this.f147637b;
        int i10 = jb2Var.f151003c;
        long j13 = -1;
        long j14 = -1;
        long j15 = -9223372036854775807L;
        while (true) {
            int i11 = jb2Var.f151003c;
            int i12 = jb2Var.f151002b;
            if (i11 - i12 < 188) {
                j11 = -9223372036854775807L;
                break;
            }
            byte[] bArr = jb2Var.f151001a;
            while (true) {
                if (i12 >= i10) {
                    j11 = -9223372036854775807L;
                    break;
                }
                j11 = -9223372036854775807L;
                if (bArr[i12] == 71) {
                    break;
                }
                i12++;
            }
            int i13 = i12 + 188;
            if (i13 > i10) {
                break;
            }
            long jA = n93.a(i12, this.f147638c, jb2Var);
            if (jA != j11) {
                long jB = this.f147636a.b(jA);
                if (jB > j10) {
                    return j15 == j11 ? new rp(-1, jB, j12) : new rp(0, -9223372036854775807L, j12 + j14);
                }
                if (100000 + jB > j10) {
                    return new rp(0, -9223372036854775807L, j12 + ((long) i12));
                }
                j15 = jB;
                j14 = i12;
            }
            jb2Var.e(i13);
            j13 = i13;
        }
        return j15 != j11 ? new rp(-2, j15, j12 + j13) : rp.f155080d;
    }
}
