package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class d3n {
    public final int a;
    public final w3n b;

    public d3n(int i, w3n w3nVar) {
        this.a = i;
        this.b = w3nVar;
    }

    public final String a() {
        String lowerCase = this.b.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase + "_" + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3n)) {
            return false;
        }
        d3n d3nVar = (d3n) obj;
        return this.a == d3nVar.a && this.b == d3nVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "IbMatchTrackerCommentary(textResId=" + this.a + ", ibMatchTrackerShotType=" + this.b + ")";
    }
}
