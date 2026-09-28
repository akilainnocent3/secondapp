package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mst {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public mst(int i, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mst)) {
            return false;
        }
        mst mstVar = (mst) obj;
        return this.a == mstVar.a && this.b == mstVar.b && this.c == mstVar.c && this.d == mstVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return lng.a(", ninDobVerificationEnabled=", ")", zug0.a("LoyaltyDobData(dobVerified=", ", dobMiniQualifiedTier=", ", showNewTagInDobGift=", this.b, this.a), this.c, this.d);
    }
}
