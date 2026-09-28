package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ez80 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public ez80(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez80)) {
            return false;
        }
        ez80 ez80Var = (ez80) obj;
        return Intrinsics.g(this.a, ez80Var.a) && Intrinsics.g(this.b, ez80Var.b) && Intrinsics.g(this.c, ez80Var.c) && Intrinsics.g(this.d, ez80Var.d) && this.e.equals(ez80Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ShareBookingInfo(shareCode=", this.a, ", shareUrl=", this.b, ", userNote=");
        hxa.c(sbA, this.c, ", orderId=", this.d, ", bookingInfoList=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final Integer n;
        public final Long o;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, Long l) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = str10;
            this.k = str11;
            this.l = str12;
            this.m = str13;
            this.n = num;
            this.o = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f) && Intrinsics.g(this.g, aVar.g) && Intrinsics.g(this.h, aVar.h) && Intrinsics.g(this.i, aVar.i) && Intrinsics.g(this.j, aVar.j) && Intrinsics.g(this.k, aVar.k) && Intrinsics.g(this.l, aVar.l) && Intrinsics.g(this.m, aVar.m) && Intrinsics.g(this.n, aVar.n) && Intrinsics.g(this.o, aVar.o);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.j;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.k;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.l;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.m;
            int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            Integer num = this.n;
            int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.o;
            return iHashCode14 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("BookingInfo(sportId=", this.a, ", eventId=", this.b, ", categoryId=");
            hxa.c(sbA, this.c, ", tournamentId=", this.d, ", tournamentName=");
            hxa.c(sbA, this.e, ", homeTeamName=", this.f, ", awayTeamName=");
            hxa.c(sbA, this.g, ", marketId=", this.h, ", marketDesc=");
            hxa.c(sbA, this.i, ", specifier=", this.j, ", outcomeId=");
            hxa.c(sbA, this.k, ", outcomeDesc=", this.l, ", odds=");
            oie.a(this.n, this.m, ", status=", ", product=", sbA);
            sbA.append(this.o);
            sbA.append(")");
            return sbA.toString();
        }

        public a() {
            this("", "", "", "", "", "", "", "", "", "", "", "", "", -1, -1L);
        }
    }
}
