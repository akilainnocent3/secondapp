package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iy7 {

    public static final class a extends iy7 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CodeHubCountryFilter(team=null)";
        }
    }

    public static final class d extends iy7 {
        public final BookingCodeFilterDto.SortBy a;

        public d(BookingCodeFilterDto.SortBy sortBy) {
            sortBy.getClass();
            this.a = sortBy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CodeHubSortFilter(sort=" + this.a + ")";
        }
    }

    public static final class b extends iy7 {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n36.a("CodeHubFoldFilter(min=", this.a, this.b, ", max=", ")");
        }

        public b() {
            this(0, 50);
        }
    }

    public static final class c extends iy7 {
        public final double a;
        public final double b;

        public c() {
            this(0.0d, 2.147483647E9d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.a, cVar.a) == 0 && Double.compare(this.b, cVar.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ffp.a(this.a, "CodeHubOddsFilter(min=", ", max=");
            sbA.append(this.b);
            sbA.append(")");
            return sbA.toString();
        }

        public c(double d, double d2) {
            this.a = d;
            this.b = d2;
        }
    }

    public static final class e extends iy7 {
        public final List<Long> a;
        public final List<Long> b;
        public final boolean c;
        public final Set<String> d;

        public e(List<Long> list, List<Long> list2, boolean z, Set<String> set) {
            list.getClass();
            list2.getClass();
            set.getClass();
            this.a = list;
            this.b = list2;
            this.c = z;
            this.d = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && this.c == eVar.c && Intrinsics.g(this.d, eVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + mtg0.a(ai50.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbA = hfb0.a("CodeHubTimeFilter(timeFilter=", ", timeSegment=", ", isWeekendSelectedExplicitly=", this.a, this.b);
            sbA.append(this.c);
            sbA.append(", selectedOptionKeys=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }

        public e() {
            this(15, null, null);
        }

        public e(int i, List list, List list2) {
            this((i & 1) != 0 ? m2g.a : list, (i & 2) != 0 ? m2g.a : list2, false, t3g.a);
        }
    }
}
