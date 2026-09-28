package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class bv0 {
    public final l25 a;
    public final long b;
    public final int c;

    public bv0(l25 l25Var, long j, int i) {
        this.a = l25Var;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv0)) {
            return false;
        }
        bv0 bv0Var = (bv0) obj;
        return this.a == bv0Var.a && this.b == bv0Var.b && this.c == bv0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f87.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "AppliedBoost(boostGiftType=" + this.a + ", endTime=" + this.b + ", boostPercentage=" + this.c + ")";
    }
}
