package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vts {
    public final String a;

    public static final class a extends vts {
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final boolean g;
        public final String h;
        public final String i;
        public final List<String> j;
        public final List<String> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, List<String> list, List<String> list2) {
            super(str);
            qn4.b(str, str2, str4, str6, str7);
            list.getClass();
            list2.getClass();
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = z;
            this.h = str6;
            this.i = str7;
            this.j = list;
            this.k = list2;
        }

        @Override // defpackage.vts
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f) && this.g == aVar.g && Intrinsics.g(this.h, aVar.h) && Intrinsics.g(this.i, aVar.i) && Intrinsics.g(this.j, aVar.j) && Intrinsics.g(this.k, aVar.k);
        }

        public final int hashCode() {
            int iA = gmf0.a(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            int iA2 = gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
            String str2 = this.f;
            return this.k.hashCode() + ai50.a(gmf0.a(gmf0.a(mtg0.a((iA2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("LiveSetBasedSideMenuEvent(eventId=", this.b, ", homeTeam=", this.c, ", homeIcon=");
            hxa.c(sbA, this.d, ", awayTeam=", this.e, ", awayIcon=");
            uts.b(this.f, ", isLargeScore=", ", homeScore=", sbA, this.g);
            hxa.c(sbA, this.h, ", awayScore=", this.i, ", homeSetScore=");
            return v9d.a(", awaySetScore=", ")", sbA, this.j, this.k);
        }
    }

    public static final class b extends vts {
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(str);
            qn4.b(str, str2, str4, str6, str7);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
        }

        @Override // defpackage.vts
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && Intrinsics.g(this.f, bVar.f) && Intrinsics.g(this.g, bVar.g) && Intrinsics.g(this.h, bVar.h);
        }

        public final int hashCode() {
            int iA = gmf0.a(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            int iA2 = gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
            String str2 = this.f;
            return this.h.hashCode() + gmf0.a((iA2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("LiveSideMenuEvent(eventId=", this.b, ", homeTeam=", this.c, ", homeIcon=");
            hxa.c(sbA, this.d, ", awayTeam=", this.e, ", awayIcon=");
            hxa.c(sbA, this.f, ", homeScore=", this.g, ", awayScore=");
            return uf80.a(sbA, this.h, ")");
        }
    }

    public vts(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
