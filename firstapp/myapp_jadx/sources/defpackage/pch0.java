package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class pch0 {
    public final och0 a;
    public final long b;

    public pch0(och0 och0Var, long j) {
        this.a = och0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pch0)) {
            return false;
        }
        pch0 pch0Var = (pch0) obj;
        return this.a.equals(pch0Var.a) && this.b == pch0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UiInteractionWindow(target=" + this.a + ", maxFrameDelayNanos=" + this.b + ")";
    }
}
