package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface z7a0 {

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements z7a0 {
        public final String a;
        public final wae b;
        public final g08 c;
        public final List<Event> d;
        public final Integer e;
        public final String f;
        public final Throwable g;
        public final Integer h;

        public a() {
            throw null;
        }

        public a(String str, List list, Integer num, String str2, Throwable th, Integer num2, int i) {
            g08 g08Var = g08.FOLLOWING_AT_CODEHUB;
            wae waeVar = wae.BET_SLIP;
            list = (i & 8) != 0 ? null : list;
            str2 = (i & 32) != 0 ? null : str2;
            th = (i & 64) != 0 ? null : th;
            num2 = (i & 128) != 0 ? null : num2;
            str.getClass();
            this.a = str;
            this.b = waeVar;
            this.c = g08Var;
            this.d = list;
            this.e = num;
            this.f = str2;
            this.g = th;
            this.h = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f) && Intrinsics.g(this.g, aVar.g) && Intrinsics.g(this.h, aVar.h);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            List<Event> list = this.d;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.e;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.g;
            int iHashCode5 = (iHashCode4 + (th == null ? 0 : th.hashCode())) * 31;
            Integer num2 = this.h;
            return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddCode(shareCode=");
            sb.append(this.a);
            sb.append(", destination=");
            sb.append(this.b);
            sb.append(", codeSource=");
            sb.append(this.c);
            sb.append(", events=");
            sb.append(this.d);
            sb.append(", bizCode=");
            w03.a(this.e, ", message=", this.f, ", error=", sb);
            sb.append(this.g);
            sb.append(", orderType=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b implements z7a0 {
        public final String a;
        public final wae b;
        public final g08 c;
        public final List<Event> d;
        public final Integer e;
        public final String f;
        public final Throwable g;

        public b() {
            throw null;
        }

        public b(String str, List list, Integer num, String str2, Throwable th, int i) {
            g08 g08Var = g08.FOLLOWING_AT_CODEHUB;
            wae waeVar = wae.MULTI_MAKER;
            list = (i & 8) != 0 ? null : list;
            str2 = (i & 32) != 0 ? null : str2;
            th = (i & 64) != 0 ? null : th;
            str.getClass();
            this.a = str;
            this.b = waeVar;
            this.c = g08Var;
            this.d = list;
            this.e = num;
            this.f = str2;
            this.g = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && Intrinsics.g(this.f, bVar.f) && Intrinsics.g(this.g, bVar.g);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            List<Event> list = this.d;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.e;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.g;
            return iHashCode4 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditCode(shareCode=");
            sb.append(this.a);
            sb.append(", destination=");
            sb.append(this.b);
            sb.append(", codeSource=");
            sb.append(this.c);
            sb.append(", events=");
            sb.append(this.d);
            sb.append(", bizCode=");
            w03.a(this.e, ", message=", this.f, ", error=", sb);
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c implements z7a0 {
        public final String a;
        public final wae b;
        public final g08 c;
        public final List<Event> d;
        public final Integer e;
        public final Double f;
        public final boolean g;
        public final Integer h;

        public c() {
            throw null;
        }

        public c(String str, List list, Integer num, Double d, boolean z, Integer num2, int i) {
            g08 g08Var = g08.FOLLOWING_AT_CODEHUB;
            wae waeVar = wae.A0;
            z = (i & 64) != 0 ? false : z;
            str.getClass();
            this.a = str;
            this.b = waeVar;
            this.c = g08Var;
            this.d = list;
            this.e = num;
            this.f = d;
            this.g = z;
            this.h = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && this.g == cVar.g && Intrinsics.g(this.h, cVar.h);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            List<Event> list = this.d;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.e;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Double d = this.f;
            int iA = mtg0.a((iHashCode3 + (d == null ? 0 : d.hashCode())) * 31, 31, this.g);
            Integer num2 = this.h;
            return (iA + (num2 != null ? num2.hashCode() : 0)) * 961;
        }

        public final String toString() {
            return "HighLiabilityCode(shareCode=" + this.a + ", destination=" + this.b + ", codeSource=" + this.c + ", events=" + this.d + ", foldsAmount=" + this.e + ", totalOdds=" + this.f + ", isSmartRemixAvailable=" + this.g + ", bizCode=" + this.h + ", message=null, error=null)";
        }
    }

    public static final class d implements z7a0 {
        public final String a;
        public final boolean b;
        public final BookingData c;
        public final Integer d;
        public final String e;
        public final Throwable f;

        public d(String str, boolean z, BookingData bookingData, Integer num, String str2, Throwable th, int i) {
            z = (i & 2) != 0 ? false : z;
            bookingData = (i & 4) != 0 ? null : bookingData;
            str2 = (i & 16) != 0 ? null : str2;
            th = (i & 32) != 0 ? null : th;
            str.getClass();
            this.a = str;
            this.b = z;
            this.c = bookingData;
            this.d = num;
            this.e = str2;
            this.f = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b && Intrinsics.g(this.c, dVar.c) && Intrinsics.g(this.d, dVar.d) && Intrinsics.g(this.e, dVar.e) && Intrinsics.g(this.f, dVar.f);
        }

        public final int hashCode() {
            int iA = mtg0.a(this.a.hashCode() * 31, 31, this.b);
            BookingData bookingData = this.c;
            int iHashCode = (iA + (bookingData == null ? 0 : bookingData.hashCode())) * 31;
            Integer num = this.d;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.e;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.f;
            return iHashCode3 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = z620.a("ShareCode(shareCode=", this.a, ", isPublished=", ", data=", this.b);
            sbA.append(this.c);
            sbA.append(", bizCode=");
            sbA.append(this.d);
            sbA.append(", message=");
            sbA.append(this.e);
            sbA.append(", error=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }
    }
}
