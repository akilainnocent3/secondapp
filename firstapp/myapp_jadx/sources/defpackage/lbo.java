package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class lbo implements mbo {
    public final int a;

    public lbo(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbo) && this.a == ((lbo) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "InstantWinBetHistoryInsureOneCutState(iconResId=", ")");
    }
}
