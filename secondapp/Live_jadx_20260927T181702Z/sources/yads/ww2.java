package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ww2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ww2 f157565c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f157566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f157567b;

    static {
        ww2 ww2Var = new ww2(0L, 0L);
        new ww2(Long.MAX_VALUE, Long.MAX_VALUE);
        new ww2(Long.MAX_VALUE, 0L);
        new ww2(0L, Long.MAX_VALUE);
        f157565c = ww2Var;
    }

    public ww2(long j10, long j11) {
        ni.a(j10 >= 0);
        ni.a(j11 >= 0);
        this.f157566a = j10;
        this.f157567b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005e A[RETURN] */
    public final long a(long j10, long j11, long j12) {
        long j13 = this.f157566a;
        if (j13 == 0 && this.f157567b == 0) {
            return j10;
        }
        int i10 = ib3.f150516a;
        long j14 = j10 - j13;
        if (((j13 ^ j10) & (j10 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        long j15 = this.f157567b;
        long j16 = j10 + j15;
        if (((j15 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z10 = false;
        boolean z11 = j14 <= j11 && j11 <= j16;
        if (j14 <= j12 && j12 <= j16) {
            z10 = true;
        }
        if (z11 && z10) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (!z11) {
            if (z10) {
                return j12;
            }
            return j14;
        }
        return j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ww2.class == obj.getClass()) {
            ww2 ww2Var = (ww2) obj;
            if (this.f157566a == ww2Var.f157566a && this.f157567b == ww2Var.f157567b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f157566a) * 31) + ((int) this.f157567b);
    }
}
