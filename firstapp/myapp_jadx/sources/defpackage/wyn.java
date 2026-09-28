package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class wyn {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;

    public wyn(int i, int i2, String str, int i3, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyn)) {
            return false;
        }
        wyn wynVar = (wyn) obj;
        return this.a == wynVar.a && this.b == wynVar.b && this.c.equals(wynVar.c) && this.d == wynVar.d && this.e.equals(wynVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gpp.a(this.d, gmf0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("InstantRacingMarketLayoutRacerState(racerId=", this.a, this.b, ", racerNumber=", ", racerNameText=");
        wxa.b(this.d, this.c, ", racerStarCount=", ", racerNumberUrl=", sbA);
        return uf80.a(sbA, this.e, ")");
    }
}
