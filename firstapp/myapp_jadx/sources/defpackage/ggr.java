package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ggr {
    public final boolean a;
    public final int b;

    public ggr(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggr)) {
            return false;
        }
        ggr ggrVar = (ggr) obj;
        return this.a == ggrVar.a && this.b == ggrVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LNStreamTicketBall(isMainBall=" + this.a + ", number=" + this.b + ")";
    }
}
