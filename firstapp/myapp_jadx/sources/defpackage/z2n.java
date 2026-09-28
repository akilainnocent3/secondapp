package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class z2n {
    public final String a;
    public final c3n b;
    public final w3n c;
    public final k3n d;
    public final mpe0 e = hwr.b(new y2n(this, 0));

    public z2n(String str, c3n c3nVar, w3n w3nVar, k3n k3nVar) {
        this.a = str;
        this.b = c3nVar;
        this.c = w3nVar;
        this.d = k3nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2n)) {
            return false;
        }
        z2n z2nVar = (z2n) obj;
        return this.a.equals(z2nVar.a) && this.b == z2nVar.b && this.c == z2nVar.c && this.d == z2nVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IbMatchTrackerAttackAnimation(fileName=" + this.a + ", teamColor=" + this.b + ", ibMatchTrackerShotType=" + this.c + ", ibMatchTrackerGamePhase=" + this.d + ")";
    }
}
