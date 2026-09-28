package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wz80 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public wz80(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, String str8, String str9, String str10) {
        m.a(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz80)) {
            return false;
        }
        wz80 wz80Var = (wz80) obj;
        return Intrinsics.g(this.a, wz80Var.a) && Intrinsics.g(this.b, wz80Var.b) && this.c.equals(wz80Var.c) && Intrinsics.g(this.d, wz80Var.d) && Intrinsics.g(this.e, wz80Var.e) && this.f == wz80Var.f && this.g == wz80Var.g && Intrinsics.g(this.h, wz80Var.h) && Intrinsics.g(this.i, wz80Var.i) && Intrinsics.g(this.j, wz80Var.j) && Intrinsics.g(this.k, wz80Var.k) && Intrinsics.g(this.l, wz80Var.l);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iA2 = mtg0.a(mtg0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
        String str2 = this.h;
        int iHashCode = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ShareCodeData(imageUri=", this.a, ", imageWithUserUri=", this.b, ", linkUrl=");
        hxa.c(sbA, this.c, ", shareCode=", this.d, ", customCode=");
        uts.b(this.e, ", isAlreadyPublished=", ", isSingleBetBuilder=", sbA, this.f);
        mng.a(", username=", this.h, ", avatarUri=", sbA, this.g);
        hxa.c(sbA, this.i, ", source=", this.j, ", orderId=");
        return kwi.a(sbA, this.k, ", userNote=", this.l, ")");
    }
}
