package defpackage;

import android.util.Range;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface b740 {

    public static final class a implements b740 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 855272590;
        }

        public final String toString() {
            return "GoBetslipForEditBet";
        }
    }

    public static final class b implements b740 {
        public final Range<Date> a;
        public final boolean b;
        public final bc6 c;

        public b(Range range, boolean z, bc6 bc6Var) {
            this.a = range;
            this.b = z;
            this.c = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
            }
            return false;
        }

        public final int hashCode() {
            Range<Date> range = this.a;
            return this.c.hashCode() + mtg0.a((range == null ? 0 : range.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            return "PickDateRange(currentDateRange=" + this.a + ", shouldPromptBulkDeleteSelectionsDiscarded=" + this.b + ", continuation=" + this.c + ")";
        }
    }
}
