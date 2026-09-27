package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yk2 implements sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y63 f158379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f158380b = new jb2();

    public yk2(y63 y63Var) {
        this.f158379a = y63Var;
    }

    @Override // yads.sp
    public final void a() {
        this.f158380b.a(ib3.f150521f);
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j10) {
        int i10;
        int i11;
        int iA;
        long j11 = ld0Var.f151947d;
        int iMin = (int) Math.min(20000L, ld0Var.f151946c - j11);
        this.f158380b.c(iMin);
        ld0Var.b(this.f158380b.f151001a, 0, iMin, false);
        jb2 jb2Var = this.f158380b;
        int i12 = -1;
        int i13 = -1;
        long j12 = -9223372036854775807L;
        while (true) {
            int i14 = jb2Var.f151003c;
            int i15 = jb2Var.f151002b;
            if (i14 - i15 < 4) {
                return j12 != -9223372036854775807L ? new rp(-2, j12, j11 + ((long) i12)) : rp.f155080d;
            }
            if (zk2.a(i15, jb2Var.f151001a) != 442) {
                jb2Var.e(jb2Var.f151002b + 1);
            } else {
                jb2Var.e(jb2Var.f151002b + 4);
                long jA = al2.a(jb2Var);
                if (jA != -9223372036854775807L) {
                    long jB = this.f158379a.b(jA);
                    if (jB > j10) {
                        return j12 == -9223372036854775807L ? new rp(-1, jB, j11) : new rp(0, -9223372036854775807L, j11 + ((long) i13));
                    }
                    if (jB + 100000 > j10) {
                        return new rp(0, -9223372036854775807L, j11 + ((long) jb2Var.f151002b));
                    }
                    j12 = jB;
                    i13 = jb2Var.f151002b;
                }
                int i16 = jb2Var.f151003c;
                int i17 = jb2Var.f151002b;
                if (i16 - i17 < 10) {
                    jb2Var.e(i16);
                } else {
                    jb2Var.e(i17 + 9);
                    int iM = jb2Var.m() & 7;
                    int i18 = jb2Var.f151003c;
                    int i19 = jb2Var.f151002b;
                    if (i18 - i19 < iM) {
                        jb2Var.e(i16);
                    } else {
                        jb2Var.e(i19 + iM);
                        int i20 = jb2Var.f151003c;
                        int i21 = jb2Var.f151002b;
                        if (i20 - i21 < 4) {
                            jb2Var.e(i16);
                        } else if (zk2.a(i21, jb2Var.f151001a) == 443) {
                            jb2Var.e(jb2Var.f151002b + 4);
                            int iR = jb2Var.r();
                            int i22 = jb2Var.f151003c;
                            int i23 = jb2Var.f151002b;
                            if (i22 - i23 < iR) {
                                jb2Var.e(i16);
                            } else {
                                jb2Var.e(i23 + iR);
                                while (true) {
                                    i10 = jb2Var.f151003c;
                                    i11 = jb2Var.f151002b;
                                    if (i10 - i11 < 4 || (iA = zk2.a(i11, jb2Var.f151001a)) == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    jb2Var.e(jb2Var.f151002b + 4);
                                    if (jb2Var.f151003c - jb2Var.f151002b < 2) {
                                        jb2Var.e(i16);
                                        break;
                                    }
                                    jb2Var.e(Math.min(jb2Var.f151003c, jb2Var.f151002b + jb2Var.r()));
                                }
                            }
                        } else {
                            while (true) {
                                i10 = jb2Var.f151003c;
                                i11 = jb2Var.f151002b;
                                if (i10 - i11 < 4) {
                                    break;
                                }
                                break;
                                jb2Var.e(Math.min(jb2Var.f151003c, jb2Var.f151002b + jb2Var.r()));
                            }
                        }
                    }
                }
                i12 = jb2Var.f151002b;
            }
        }
    }
}
