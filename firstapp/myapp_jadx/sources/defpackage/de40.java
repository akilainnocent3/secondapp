package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface de40 {

    public static final class a implements de40 {
        public static final a a = new a();

        @Override // defpackage.de40
        public final String a() {
            return "cta";
        }
    }

    public static final class b implements de40 {
        public final String a;
        public final String b;
        public final int c;
        public final List<String> d;
        public final String e;
        public final String f;

        public b(String str, String str2, int i, List list) {
            list.getClass();
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = list;
            this.e = "https://s.sporty.net/cms/recap_bg_1_19c222393e.jpg";
            this.f = "total_sport";
        }

        @Override // defpackage.de40
        public final String a() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ai50.a(gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("EpicYearPlay(title=", this.a, ", desc=", this.b, ", totalSports=");
            sbA.append(this.c);
            sbA.append(", sportIdList=");
            sbA.append(this.d);
            sbA.append(", bgCdn=");
            return uf80.a(sbA, this.e, ")");
        }
    }

    public static final class c implements de40 {
        public static final c a = new c();

        @Override // defpackage.de40
        public final String a() {
            return "not_enough_sport";
        }
    }

    public static final class d implements de40 {
        public final String a;
        public final String b;
        public final int c;
        public final int d;
        public final String e = "https://s.sporty.net/cms/recap_bg_2_f10838fbf1.jpg";

        public d(String str, String str2, int i, int i2) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
        }

        @Override // defpackage.de40
        public final String a() {
            return "total_ticket";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c == dVar.c && this.d == dVar.d && this.e.equals(dVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + gpp.a(this.d, gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Tickets(title=", this.a, ", desc=", this.b, ", value=");
            d5d.a(sbA, this.c, ", valueType=", this.d, ", bgCdn=");
            return uf80.a(sbA, this.e, ")");
        }
    }

    public static final class e implements de40 {
        public final String a;
        public final String b;
        public final ArrayList c;
        public final String d = "https://s.sporty.net/cms/recap_bg_3_be6bfa9180.jpg";
        public final String e = "top_market";

        public e(String str, String str2, ArrayList arrayList) {
            this.a = str;
            this.b = str2;
            this.c = arrayList;
        }

        @Override // defpackage.de40
        public final String a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && Intrinsics.g(this.c, eVar.c) && Intrinsics.g(this.d, eVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + vt5.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("TopMarkets(title=", this.a, ", desc=", this.b, ", markets=");
            sbA.append(this.c);
            sbA.append(", bgCdn=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    String a();
}
