package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hfq {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public hfq(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        wd7.a(str, str2, str3, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfq)) {
            return false;
        }
        hfq hfqVar = (hfq) obj;
        return Intrinsics.g(this.a, hfqVar.a) && Intrinsics.g(this.b, hfqVar.b) && Intrinsics.g(this.c, hfqVar.c) && Intrinsics.g(this.d, hfqVar.d) && Intrinsics.g(this.e, hfqVar.e) && Intrinsics.g(this.f, hfqVar.f) && this.g == hfqVar.g && this.h == hfqVar.h;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.h) + mtg0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNGiftUIState(giftId=", this.a, ", currency=", this.b, ", amount=");
        hxa.c(sbA, this.c, ", expireTime=", this.d, ", displayTitle=");
        hxa.c(sbA, this.e, ", displayDesc=", this.f, ", isOpen=");
        return lng.a(", isSelected=", ")", sbA, this.g, this.h);
    }
}
