package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hm3 {
    public final int a;

    public hm3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm3) && this.a == ((hm3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "BetslipButtonState(selectionCount=", ")");
    }
}
