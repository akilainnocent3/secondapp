package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u1f {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;

    public u1f(int i, int i2, String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1f)) {
            return false;
        }
        u1f u1fVar = (u1f) obj;
        return Intrinsics.g(this.a, u1fVar.a) && Intrinsics.g(this.b, u1fVar.b) && this.c == u1fVar.c && Intrinsics.g(this.d, u1fVar.d) && Intrinsics.g(this.e, u1fVar.e) && this.f == u1fVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + gmf0.a(gmf0.a(gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("DoubleOrNothingHostGameEventInfo(homeTeamName=", this.a, ", homeTeamLogoUrl=", this.b, ", homeTeamFinalScore=");
        f78.b(this.c, ", awayTeamName=", this.d, ", awayTeamLogoUrl=", sbA);
        return ijg0.a(this.f, this.e, ", awayTeamFinalScore=", ")", sbA);
    }
}
