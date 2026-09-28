package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dar {
    public final String a;
    public final boolean b;
    public final String c;
    public final glq d;
    public final boolean e;
    public final car f;

    public dar(String str, boolean z, String str2, glq glqVar, boolean z2, car carVar) {
        str.getClass();
        str2.getClass();
        glqVar.getClass();
        carVar.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = glqVar;
        this.e = z2;
        this.f = carVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dar)) {
            return false;
        }
        dar darVar = (dar) obj;
        return Intrinsics.g(this.a, darVar.a) && this.b == darVar.b && Intrinsics.g(this.c, darVar.c) && Intrinsics.g(this.d, darVar.d) && this.e == darVar.e && Intrinsics.g(this.f, darVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + mtg0.a((this.d.hashCode() + gmf0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("LNSearchResultUIState(lotteryId=", this.a, ", isFavorite=", ", name=", this.b);
        sbA.append(this.c);
        sbA.append(", countryFlag=");
        sbA.append(this.d);
        sbA.append(", isOpen=");
        sbA.append(this.e);
        sbA.append(", result=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
