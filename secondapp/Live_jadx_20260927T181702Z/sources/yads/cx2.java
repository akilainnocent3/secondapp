package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class cx2 extends hx2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f147932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f147933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f147934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f147935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f147936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f147937i;

    public cx2(pl2 pl2Var, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(pl2Var, j10, j11);
        this.f147932d = j12;
        this.f147933e = j13;
        this.f147934f = list;
        this.f147937i = j14;
        this.f147935g = j15;
        this.f147936h = j16;
    }

    public abstract long a(long j10);

    public final long a(long j10, long j11) {
        if (a(j10) == -1) {
            long j12 = this.f147935g;
            if (j12 != -9223372036854775807L) {
                return Math.max(this.f147932d, c((j11 - this.f147936h) - j12, j10));
            }
        }
        return this.f147932d;
    }

    public abstract pl2 a(long j10, lo2 lo2Var);

    public final long b(long j10, long j11) {
        List list = this.f147934f;
        if (list != null) {
            return (((fx2) list.get((int) (j10 - this.f147932d))).f149292b * 1000000) / this.f150335b;
        }
        long jA = a(j11);
        return (jA == -1 || j10 != (this.f147932d + jA) - 1) ? (this.f147933e * 1000000) / this.f150335b : j11 - b(j10);
    }

    public final long c(long j10, long j11) {
        long j12 = this.f147932d;
        long jA = a(j11);
        if (jA != 0) {
            if (this.f147934f != null) {
                long j13 = (jA + j12) - 1;
                long j14 = j12;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    long jB = b(j15);
                    if (jB < j10) {
                        j14 = j15 + 1;
                    } else {
                        if (jB <= j10) {
                            return j15;
                        }
                        j13 = j15 - 1;
                    }
                }
                return j14 == j12 ? j14 : j13;
            }
            long j16 = (j10 / ((this.f147933e * 1000000) / this.f150335b)) + this.f147932d;
            if (j16 >= j12) {
                return jA == -1 ? j16 : Math.min(j16, (j12 + jA) - 1);
            }
        }
        return j12;
    }

    public final long b(long j10) {
        long j11;
        List list = this.f147934f;
        if (list != null) {
            j11 = ((fx2) list.get((int) (j10 - this.f147932d))).f149291a - this.f150336c;
        } else {
            j11 = (j10 - this.f147932d) * this.f147933e;
        }
        return ib3.a(j11, 1000000L, this.f150335b);
    }

    public boolean b() {
        return this.f147934f != null;
    }
}
