package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface x8z {

    public static final class a implements x8z {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -486577529;
        }

        public final String toString() {
            return "OddsBypass";
        }
    }

    public static final class b implements x8z {
        public final List<Event> a;
        public final List<Selection> b;
        public final long c;
        public final long d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Event> list, List<? extends Selection> list2, long j, long j2) {
            list.getClass();
            list2.getClass();
            this.a = list;
            this.b = list2;
            this.c = j;
            this.d = j2;
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
            return Long.hashCode(this.d) + f87.a(ai50.a(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        }

        public final String toString() {
            StringBuilder sbA = hfb0.a("OddsInvalid(validEvents=", ", origin=", ", requestTime=", this.a, this.b);
            sbA.append(this.c);
            return zug.a(this.d, ", responseTime=", ")", sbA);
        }
    }

    public static final class c implements x8z {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1110434429;
        }

        public final String toString() {
            return "OddsValid";
        }
    }
}
