package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class nb90 {

    public static final class a extends nb90 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1473151556;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b extends nb90 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -838766608;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c extends nb90 {
        public final Integer a;
        public final Integer b;
        public final Integer c;
        public final Integer d;
        public final int e;

        public c(int i, Integer num, Integer num2, Integer num3, Integer num4) {
            this.a = num;
            this.b = num2;
            this.c = num3;
            this.d = num4;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && this.e == cVar.e;
        }

        public final int hashCode() {
            Integer num = this.a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.c;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.d;
            return Integer.hashCode(this.e) + ((iHashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(totalDailyLimit=");
            sb.append(this.a);
            sb.append(", consumedDailyLimit=");
            sb.append(this.b);
            sb.append(", totalWeeklyLimit=");
            cv7.a(sb, this.c, ", consumedWeeklyLimit=", this.d, ", minTime=");
            return zk1.a(this.e, ")", sb);
        }
    }
}
