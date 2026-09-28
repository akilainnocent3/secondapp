package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bli {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bli(String str, String str2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bli)) {
            return false;
        }
        bli bliVar = (bli) obj;
        return this.a.equals(bliVar.a) && Intrinsics.g(this.b, bliVar.b) && Intrinsics.g(this.c, bliVar.c) && Intrinsics.g(this.d, bliVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("FootballLottieSimulationTeamState(name=", this.a, ", logoUrl=", this.b, ", halfTimeScoreText="), this.c, ", fullTimeScoreText=", this.d, ")");
    }
}
