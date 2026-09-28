package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uoo {
    public final gno a;
    public final String b;

    public uoo(gno gnoVar, String str) {
        this.a = gnoVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoo)) {
            return false;
        }
        uoo uooVar = (uoo) obj;
        return this.a.equals(uooVar.a) && this.b.equals(uooVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantWinTicketDetailSelectionResult(drawable=" + this.a + ", resourceId=" + this.b + ")";
    }
}
