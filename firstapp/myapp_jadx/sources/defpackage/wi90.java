package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wi90 {

    public static final class a extends wi90 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1932818193;
        }

        public final String toString() {
            return "FetchGifts";
        }
    }

    public static final class b extends wi90 {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public b(String str, String str2, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return lng.a(", isOneCutSelected=", ")", ux5.a("OnGiftClickedWithDefaultGift(totalOdds=", this.a, ", bonusRate=", this.b, ", isFlexiSelected="), this.c, this.d);
        }
    }

    public static final class c extends wi90 {
        public final String a;
        public final String b;
        public final Boolean c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;

        public c(String str, String str2, Boolean bool, String str3, String str4, boolean z, boolean z2) {
            str3.getClass();
            str4.getClass();
            this.a = str;
            this.b = str2;
            this.c = bool;
            this.d = str3;
            this.e = str4;
            this.f = z;
            this.g = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.c;
            return Boolean.hashCode(this.g) + mtg0.a(gmf0.a(gmf0.a((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("OnGiftClickedWithGiftData(giftId=", this.a, ", giftValue=", this.b, ", isAddToStake=");
            sbA.append(this.c);
            sbA.append(", totalOdds=");
            sbA.append(this.d);
            sbA.append(", bonusRate=");
            uts.b(this.e, ", isFlexiSelected=", ", isOneCutSelected=", sbA, this.f);
            return mq0.a(sbA, this.g, ")");
        }
    }
}
