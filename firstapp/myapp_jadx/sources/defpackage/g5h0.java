package defpackage;

import com.sportybet.android.transaction.domain.model.LastDayRangeSetting;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface g5h0 {

    public static final class a implements g5h0 {
        public final Pair<Long, Long> a;
        public final LastDayRangeSetting b;

        public a(Pair<Long, Long> pair, LastDayRangeSetting lastDayRangeSetting) {
            lastDayRangeSetting.getClass();
            this.a = pair;
            this.b = lastDayRangeSetting;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ChooseDateRangeEvent(dateRange=" + this.a + ", lastDayRangeSetting=" + this.b + ")";
        }
    }

    public static final class b implements g5h0 {
        public final aqg0 a;

        public b(aqg0 aqg0Var) {
            aqg0Var.getClass();
            this.a = aqg0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PopupEvent(currentCategory=" + this.a + ")";
        }
    }
}
