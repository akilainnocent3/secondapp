package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class rco {
    public final String a;

    public rco(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rco) && this.a.equals(((rco) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("InstantWinBetHistorySkipToResultState(roundId=", this.a, ")");
    }
}
