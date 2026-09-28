package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface mws {

    public static final class a implements mws {
        public final g08 a;
        public final Integer b;
        public final lws c;

        public a(g08 g08Var, Integer num, lws lwsVar) {
            g08Var.getClass();
            this.a = g08Var;
            this.b = num;
            this.c = lwsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            lws lwsVar = this.c;
            return iHashCode2 + (lwsVar != null ? lwsVar.hashCode() : 0);
        }

        public final String toString() {
            return "OnLoaded(codeSource=" + this.a + ", orderType=" + this.b + ", combineSelection=" + this.c + ")";
        }
    }

    public static final class b implements mws {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -944853316;
        }

        public final String toString() {
            return "ResetInput";
        }
    }

    public static final class c implements mws {
        public final String a;
        public final List<Event> b;
        public final g08 c;
        public final boolean d;

        public c(String str, List list, g08 g08Var, boolean z, int i) {
            g08Var = (i & 8) != 0 ? g08.UNKNOWN : g08Var;
            g08Var.getClass();
            this.a = str;
            this.b = list;
            this.c = g08Var;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<Event> list = this.b;
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 961)) * 31);
        }

        public final String toString() {
            return "ShowHighLiabilityCode(bookingCode=" + this.a + ", bookingDataOutcomes=" + this.b + ", continuation=null, codeSource=" + this.c + ", isSmartRemixAvailable=" + this.d + ")";
        }
    }
}
