package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nss implements spe<nss> {

    public static final class a extends nss {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // defpackage.spe
        public final boolean a(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return nssVar instanceof a;
        }

        @Override // defpackage.spe
        public final boolean b(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return (nssVar instanceof a) && nssVar.equals(this);
        }

        @Override // defpackage.nss
        public final int d() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("ActionButton(isExpanded=", ")", this.a);
        }
    }

    public static final class b extends nss {
        public final String a;
        public final sw2 b;
        public final boolean c;
        public final int d;

        public b(String str, sw2 sw2Var, boolean z) {
            sw2Var.getClass();
            this.a = str;
            this.b = sw2Var;
            this.c = z;
            this.d = 3;
        }

        @Override // defpackage.spe
        public final boolean a(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return nssVar instanceof b;
        }

        @Override // defpackage.spe
        public final boolean b(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return (nssVar instanceof b) && nssVar.equals(this);
        }

        @Override // defpackage.nss
        public final int d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetOdds(eventId=");
            sb.append(this.a);
            sb.append(", betOddsItem=");
            sb.append(this.b);
            sb.append(", isLast=");
            return mq0.a(sb, this.c, ")");
        }
    }

    public static final class c extends nss {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final Map<Integer, ho70> g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final int l = 2;

        public c(String str, String str2, String str3, String str4, String str5, String str6, Map<Integer, ho70> map, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = map;
            this.h = z;
            this.i = z2;
            this.j = z3;
            this.k = z4;
        }

        public static c e(c cVar, boolean z) {
            String str = cVar.a;
            String str2 = cVar.b;
            String str3 = cVar.c;
            String str4 = cVar.d;
            String str5 = cVar.e;
            String str6 = cVar.f;
            Map<Integer, ho70> map = cVar.g;
            boolean z2 = cVar.h;
            boolean z3 = cVar.i;
            boolean z4 = cVar.k;
            qn4.b(str, str2, str3, str4, str5);
            str6.getClass();
            map.getClass();
            return new c(str, str2, str3, str4, str5, str6, map, z2, z3, z, z4);
        }

        @Override // defpackage.spe
        public final boolean a(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return nssVar instanceof c;
        }

        @Override // defpackage.spe
        public final boolean b(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return (nssVar instanceof c) && nssVar.equals(this);
        }

        @Override // defpackage.nss
        public final int d() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g) && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.k) + mtg0.a(mtg0.a(mtg0.a((this.g.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Event(eventId=", this.a, ", homeTeamName=", this.b, ", homeTeamLogoUrl=");
            hxa.c(sbA, this.c, ", awayTeamName=", this.d, ", awayTeamLogoUrl=");
            hxa.c(sbA, this.e, ", resultSequence=", this.f, ", scoreChangeMap=");
            sbA.append(this.g);
            sbA.append(", isUserBet=");
            sbA.append(this.h);
            sbA.append(", hasOdds=");
            nng.a(", isExpanded=", ", isPreviewEvent=", sbA, this.i, this.j);
            return mq0.a(sbA, this.k, ")");
        }
    }

    public static final class d extends nss {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final Map<Integer, ho70> g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final int k;

        public d(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z) {
            qn4.b(str2, str3, str4, str5, str6);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = map;
            this.h = true;
            this.i = z;
            this.j = true;
            this.k = 4;
        }

        @Override // defpackage.spe
        public final boolean a(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return nssVar instanceof d;
        }

        @Override // defpackage.spe
        public final boolean b(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return (nssVar instanceof d) && nssVar.equals(this);
        }

        @Override // defpackage.nss
        public final int d() {
            return this.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c) && Intrinsics.g(this.d, dVar.d) && Intrinsics.g(this.e, dVar.e) && Intrinsics.g(this.f, dVar.f) && Intrinsics.g(this.g, dVar.g) && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.j) + mtg0.a(mtg0.a((this.g.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("LegendsEvent(eventId=", this.a, ", homeTeamName=", this.b, ", homeTeamLogoUrl=");
            hxa.c(sbA, this.c, ", awayTeamName=", this.d, ", awayTeamLogoUrl=");
            hxa.c(sbA, this.e, ", resultSequence=", this.f, ", scoreChangeMap=");
            sbA.append(this.g);
            sbA.append(", isUserBet=");
            sbA.append(this.h);
            sbA.append(", hasOdds=");
            return lng.a(", isPreviewEvent=", ")", sbA, this.i, this.j);
        }
    }

    public static final class e extends nss {
        public final String a;
        public final int b = 1;

        public e(String str) {
            this.a = str;
        }

        @Override // defpackage.spe
        public final boolean a(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return nssVar instanceof e;
        }

        @Override // defpackage.spe
        public final boolean b(spe speVar) {
            nss nssVar = (nss) speVar;
            nssVar.getClass();
            return (nssVar instanceof e) && nssVar.equals(this);
        }

        @Override // defpackage.nss
        public final int d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Title(text=", this.a, ")");
        }
    }

    @Override // defpackage.spe
    public final /* bridge */ /* synthetic */ void c(spe speVar) {
    }

    public abstract int d();
}
