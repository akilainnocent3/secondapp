package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ruo {
    public final long a;
    public final int b;

    public ruo(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruo)) {
            return false;
        }
        ruo ruoVar = (ruo) obj;
        return this.a == ruoVar.a && this.b == ruoVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InsureBetQuoteRequest(id=" + this.a + ", betType=" + this.b + ")";
    }
}
