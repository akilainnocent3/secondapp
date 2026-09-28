package defpackage;

import com.appsflyer.internal.p;
import com.sportygames.crash.remote.models.BetHistoryItem;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.crash.remote.models.TopWinResponseV2;
import com.sportygames.vip.data.EliteTopWinsThisWeekItem;
import com.sportygames.vip.data.UserTopCoeffResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vqb0 {

    public static final class a extends vqb0 {
        public final List<TopBets> a;

        public a(List<TopBets> list) {
            list.getClass();
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("AllBets(items=", ")", this.a);
        }
    }

    public static final class b extends vqb0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2049737140;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class c extends vqb0 {
        public final List<EliteTopWinsThisWeekItem> a;
        public final UserTopCoeffResponse b;

        public c(UserTopCoeffResponse userTopCoeffResponse, List list) {
            this.a = list;
            this.b = userTopCoeffResponse;
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
            List<EliteTopWinsThisWeekItem> list = this.a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            UserTopCoeffResponse userTopCoeffResponse = this.b;
            return iHashCode + (userTopCoeffResponse != null ? userTopCoeffResponse.hashCode() : 0);
        }

        public final String toString() {
            return "HeroElite(items=" + this.a + ", topCoeff=" + this.b + ")";
        }
    }

    public static final class d extends vqb0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -741894533;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class e extends vqb0 {
        public final List<BetHistoryItem> a;

        public e(List<BetHistoryItem> list) {
            this.a = list;
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
            return p.a("MyBets(items=", ")", this.a);
        }
    }

    public static final class f extends vqb0 {
        public final List<TopWinResponseV2> a;

        public f(List<TopWinResponseV2> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("TopWins(items=", ")", this.a);
        }
    }
}
