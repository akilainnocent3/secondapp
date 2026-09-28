package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class yg90 {
    public final v690 a;
    public final int b;

    public yg90(v690 v690Var, int i) {
        v690Var.getClass();
        this.a = v690Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg90)) {
            return false;
        }
        yg90 yg90Var = (yg90) obj;
        return this.a == yg90Var.a && this.b == yg90Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SidePanelTabItem(group=" + this.a + ", indexInList=" + this.b + ")";
    }
}
