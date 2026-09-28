package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface rtv {

    public static final class a implements rtv {
        public final Integer a;

        public a(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "BetslipTheme(pickAmount=" + this.a + ")";
        }
    }

    public static final class b implements rtv {
        public final long a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;

        public b(long j, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.a = j;
            this.b = arrayList;
            this.c = arrayList2;
            this.d = arrayList3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + vt5.a(this.c, vt5.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return "FreebetGift(amount=" + this.a + ", realSportsCategories=" + this.b + ", virtualCategories=" + this.c + ", casinoCategories=" + this.d + ")";
        }
    }

    public static final class c implements rtv {
        public final Integer a;
        public final Integer b;

        public c(Integer num, Integer num2) {
            this.a = num;
            this.b = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "RakebackBoostGift(boostPercent=" + this.a + ", days=" + this.b + ")";
        }
    }

    public static final class d implements rtv {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 357291774;
        }

        public final String toString() {
            return "SportyTVWorldCupPass";
        }
    }
}
