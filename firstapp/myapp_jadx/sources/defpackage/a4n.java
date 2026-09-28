package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a4n {

    public static final class a extends a4n {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final int g;
        public final List<String> h;
        public final List<String> i;
        public final int j;
        public final int k;
        public final List<String> l;
        public final List<String> m;

        public a(String str, String str2, String str3, String str4, String str5, String str6, int i, List<String> list, List<String> list2, int i2, int i3, List<String> list3, List<String> list4) {
            qn4.b(str, str2, str3, str4, str5);
            str6.getClass();
            list.getClass();
            list2.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = i;
            this.h = list;
            this.i = list2;
            this.j = i2;
            this.k = i3;
            this.l = list3;
            this.m = list4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f) && this.g == aVar.g && Intrinsics.g(this.h, aVar.h) && Intrinsics.g(this.i, aVar.i) && this.j == aVar.j && this.k == aVar.k && Intrinsics.g(this.l, aVar.l) && Intrinsics.g(this.m, aVar.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + ai50.a(gpp.a(this.k, gpp.a(this.j, ai50.a(ai50.a(gpp.a(this.g, gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31), 31), 31, this.l);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("EventNoBet(eventId=", this.a, ", leagueName=", this.b, ", homeTeamName=");
            hxa.c(sbA, this.c, ", homeTeamLogo=", this.d, ", awayTeamName=");
            hxa.c(sbA, this.e, ", awayTeamLogo=", this.f, ", overtimeCount=");
            sbA.append(this.g);
            sbA.append(", homeQuarterScores=");
            sbA.append(this.h);
            sbA.append(", awayQuarterScores=");
            sbA.append(this.i);
            sbA.append(", displayHomeTotalScore=");
            sbA.append(this.j);
            sbA.append(", displayAwayTotalScore=");
            sbA.append(this.k);
            sbA.append(", displayHomeQuarterScores=");
            sbA.append(this.l);
            sbA.append(", displayAwayQuarterScores=");
            return ng1.a(sbA, this.m, ")");
        }
    }

    public static final class b extends a4n {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final boolean g;
        public final boolean h;
        public final int i;
        public final List<String> j;
        public final List<String> k;
        public final List<sw2> l;
        public final int m;
        public final int n;
        public final List<String> o;
        public final List<String> p;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, List<String> list, List<String> list2, List<? extends sw2> list3, int i2, int i3, List<String> list4, List<String> list5) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            list4.getClass();
            list5.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = z;
            this.h = z2;
            this.i = i;
            this.j = list;
            this.k = list2;
            this.l = list3;
            this.m = i2;
            this.n = i3;
            this.o = list4;
            this.p = list5;
        }

        public static b a(b bVar, boolean z, int i, int i2, ArrayList arrayList, ArrayList arrayList2, int i3) {
            String str = bVar.a;
            String str2 = bVar.b;
            String str3 = bVar.c;
            String str4 = bVar.d;
            String str5 = bVar.e;
            String str6 = bVar.f;
            boolean z2 = bVar.g;
            int i4 = bVar.i;
            List<String> list = bVar.j;
            List<String> list2 = bVar.k;
            List<sw2> list3 = bVar.l;
            int i5 = (i3 & 4096) != 0 ? bVar.m : i;
            int i6 = (i3 & 8192) != 0 ? bVar.n : i2;
            List<String> list4 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? bVar.o : arrayList;
            List<String> list5 = (i3 & 32768) != 0 ? bVar.p : arrayList2;
            qn4.b(str, str2, str3, str4, str5);
            str6.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            list4.getClass();
            list5.getClass();
            return new b(str, str2, str3, str4, str5, str6, z2, z, i4, list, list2, list3, i5, i6, list4, list5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && Intrinsics.g(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && Intrinsics.g(this.j, bVar.j) && Intrinsics.g(this.k, bVar.k) && Intrinsics.g(this.l, bVar.l) && this.m == bVar.m && this.n == bVar.n && Intrinsics.g(this.o, bVar.o) && Intrinsics.g(this.p, bVar.p);
        }

        public final int hashCode() {
            return this.p.hashCode() + ai50.a(gpp.a(this.n, gpp.a(this.m, ai50.a(ai50.a(ai50.a(gpp.a(this.i, mtg0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31), 31), 31, this.o);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("EventWithBet(eventId=", this.a, ", leagueName=", this.b, ", homeTeamName=");
            hxa.c(sbA, this.c, ", homeTeamLogo=", this.d, ", awayTeamName=");
            hxa.c(sbA, this.e, ", awayTeamLogo=", this.f, ", isHit=");
            nng.a(", expand=", ", overtimeCount=", sbA, this.g, this.h);
            sbA.append(this.i);
            sbA.append(", homeQuarterScores=");
            sbA.append(this.j);
            sbA.append(", awayQuarterScores=");
            qpu.a(", betOddsItems=", ", displayHomeTotalScore=", sbA, this.k, this.l);
            d5d.a(sbA, this.m, ", displayAwayTotalScore=", this.n, ", displayHomeQuarterScores=");
            return v9d.a(", displayAwayQuarterScores=", ")", sbA, this.o, this.p);
        }
    }

    public static final class c extends a4n {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("FillingTitle(leagueName=", this.a, ")");
        }
    }

    public static final class d extends a4n {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("MainTitle(isHit=", ")", this.a);
        }
    }
}
