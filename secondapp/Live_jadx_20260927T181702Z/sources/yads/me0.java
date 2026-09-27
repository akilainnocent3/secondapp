package yads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class me0 implements p92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o92 f152420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f152422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z33 f152423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f152425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f152426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f152427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f152428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f152429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f152430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f152431l;

    public me0(z33 z33Var, long j10, long j11, long j12, long j13, boolean z10) {
        ni.a(j10 >= 0 && j11 > j10);
        this.f152423d = z33Var;
        this.f152421b = j10;
        this.f152422c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f152425f = j13;
            this.f152424e = 4;
        } else {
            this.f152424e = 0;
        }
        this.f152420a = new o92();
    }

    @Override // yads.p92
    public final vw2 a() {
        if (this.f152425f != 0) {
            return new le0(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    @Override // yads.p92
    public final long a(ld0 ld0Var) throws IOException {
        long j10;
        long j11;
        long jMax;
        long j12;
        int i10 = this.f152424e;
        if (i10 == 0) {
            j10 = 0;
            long j13 = ld0Var.f151947d;
            this.f152426g = j13;
            this.f152424e = 1;
            long j14 = this.f152422c - 65307;
            if (j14 > j13) {
                return j14;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j15 = this.f152428i;
                j11 = 2;
                long j16 = this.f152429j;
                if (j15 == j16) {
                    jMax = -1;
                    j12 = -1;
                } else {
                    long j17 = ld0Var.f151947d;
                    if (this.f152420a.a(ld0Var, j16)) {
                        this.f152420a.a(ld0Var, false);
                        ld0Var.f151949f = 0;
                        long j18 = this.f152427h;
                        o92 o92Var = this.f152420a;
                        long j19 = o92Var.f153410b;
                        long j20 = j18 - j19;
                        int i11 = o92Var.f153412d + o92Var.f153413e;
                        if (0 > j20 || j20 >= 72000) {
                            if (j20 < 0) {
                                this.f152429j = j17;
                                this.f152431l = j19;
                            } else {
                                this.f152428i = ld0Var.f151947d + ((long) i11);
                                this.f152430k = j19;
                            }
                            long j21 = this.f152429j;
                            long j22 = this.f152428i;
                            long j23 = j21 - j22;
                            if (j23 < 100000) {
                                this.f152429j = j22;
                                j12 = -1;
                                jMax = j22;
                            } else {
                                j12 = -1;
                                long j24 = ld0Var.f151947d - (((long) i11) * (j20 <= 0 ? 2L : 1L));
                                int i12 = ib3.f150516a;
                                jMax = Math.max(j22, Math.min(((j23 * j20) / (this.f152431l - this.f152430k)) + j24, j21 - 1));
                            }
                        } else {
                            jMax = -1;
                            j12 = -1;
                        }
                    } else {
                        jMax = this.f152428i;
                        if (jMax == j17) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j12 = -1;
                    }
                }
                if (jMax != j12) {
                    return jMax;
                }
                this.f152424e = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j12 = -1;
                j11 = 2;
            }
            while (true) {
                this.f152420a.a(ld0Var, j12);
                this.f152420a.a(ld0Var, false);
                o92 o92Var2 = this.f152420a;
                if (o92Var2.f153410b > this.f152427h) {
                    ld0Var.f151949f = 0;
                    this.f152424e = 4;
                    return -(this.f152430k + j11);
                }
                ld0Var.a(o92Var2.f153412d + o92Var2.f153413e);
                this.f152428i = ld0Var.f151947d;
                this.f152430k = this.f152420a.f153410b;
                j12 = -1;
            }
        } else {
            j10 = 0;
        }
        o92 o92Var3 = this.f152420a;
        o92Var3.f153409a = 0;
        o92Var3.f153410b = j10;
        o92Var3.f153411c = 0;
        o92Var3.f153412d = 0;
        o92Var3.f153413e = 0;
        if (!o92Var3.a(ld0Var, -1L)) {
            throw new EOFException();
        }
        this.f152420a.a(ld0Var, false);
        o92 o92Var4 = this.f152420a;
        ld0Var.a(o92Var4.f153412d + o92Var4.f153413e);
        long j25 = this.f152420a.f153410b;
        while (true) {
            o92 o92Var5 = this.f152420a;
            if ((o92Var5.f153409a & 4) == 4 || !o92Var5.a(ld0Var, -1L) || ld0Var.f151947d >= this.f152422c || !this.f152420a.a(ld0Var, true)) {
                break;
            }
            o92 o92Var6 = this.f152420a;
            try {
                ld0Var.a(o92Var6.f153412d + o92Var6.f153413e);
                j25 = this.f152420a.f153410b;
            } catch (EOFException unused) {
            }
        }
        this.f152425f = j25;
        this.f152424e = 4;
        return this.f152426g;
    }

    @Override // yads.p92
    public final void a(long j10) {
        long j11 = this.f152425f - 1;
        int i10 = ib3.f150516a;
        this.f152427h = Math.max(0L, Math.min(j10, j11));
        this.f152424e = 2;
        this.f152428i = this.f152421b;
        this.f152429j = this.f152422c;
        this.f152430k = 0L;
        this.f152431l = this.f152425f;
    }
}
