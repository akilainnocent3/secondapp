package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class a0d0 {
    public final String a;

    public a0d0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0d0) && this.a.equals(((a0d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SportyPenaltyRoundInfo(roundId=", this.a, ")");
    }
}
