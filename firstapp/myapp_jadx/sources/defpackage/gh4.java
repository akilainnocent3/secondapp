package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class gh4 {
    public final zg4 a;
    public final long b;

    public gh4(zg4 zg4Var, long j) {
        this.a = zg4Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh4)) {
            return false;
        }
        gh4 gh4Var = (gh4) obj;
        return this.a.equals(gh4Var.a) && gly.c(this.b, gh4Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardPosData(boardInfo=" + this.a + ", center=" + gly.h(this.b) + ")";
    }
}
