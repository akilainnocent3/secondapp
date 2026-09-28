package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class c4n {
    public final fqo a;
    public final f3n b;

    public c4n(fqo fqoVar, f3n f3nVar) {
        this.a = fqoVar;
        this.b = f3nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4n)) {
            return false;
        }
        c4n c4nVar = (c4n) obj;
        return this.a.equals(c4nVar.a) && this.b.equals(c4nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IbMatchTrackerUiState(appBarState=" + this.a + ", contentState=" + this.b + ")";
    }
}
