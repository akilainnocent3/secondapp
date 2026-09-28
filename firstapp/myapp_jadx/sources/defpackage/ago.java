package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ago {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final String d;
    public final wfo e;

    public ago(boolean z, int i, boolean z2, String str, wfo wfoVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = str;
        this.e = wfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ago)) {
            return false;
        }
        ago agoVar = (ago) obj;
        return this.a == agoVar.a && this.b == agoVar.b && this.c == agoVar.c && this.d.equals(agoVar.d) && this.e.equals(agoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(mtg0.a(gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = zug0.a("InstantWinMarketAttribute(hasSpanner=", ", spannerIndex=", ", combo=", this.b, this.a);
        mng.a(", defaultMarketPoolId=", this.d, ", layout=", sbA, this.c);
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
