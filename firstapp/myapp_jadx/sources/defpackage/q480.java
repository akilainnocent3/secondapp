package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q480 {
    public static final q480 c;
    public final long a;
    public final long b;

    static {
        q480 q480Var = new q480(0L, 0L);
        new q480(Long.MAX_VALUE, Long.MAX_VALUE);
        new q480(Long.MAX_VALUE, 0L);
        new q480(0L, Long.MAX_VALUE);
        c = q480Var;
    }

    public q480(long j, long j2) {
        ly0.b(j >= 0);
        ly0.b(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d A[RETURN] */
    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = jrh0.a;
        long j6 = j - j4;
        if (((j4 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (z2 && z) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z2) {
            if (z) {
                return j3;
            }
            return j6;
        }
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q480.class == obj.getClass()) {
            q480 q480Var = (q480) obj;
            if (this.a == q480Var.a && this.b == q480Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
