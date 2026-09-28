package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class aw3 {
    public final boolean a;
    public final long b;

    public aw3(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw3)) {
            return false;
        }
        aw3 aw3Var = (aw3) obj;
        return this.a == aw3Var.a && this.b == aw3Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BetslipStaleOddsResumePolicy(enable=" + this.a + ", waitThresholdMillis=" + this.b + ")";
    }

    public /* synthetic */ aw3(int i) {
        this(false, 0L);
    }

    public aw3() {
        this(0);
    }
}
