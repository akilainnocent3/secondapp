package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface kws {

    public static final class a implements kws {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -403316860;
        }

        public final String toString() {
            return "Canceled";
        }
    }

    public static final class b implements kws {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return kox.a("Failed(throwable=", ")", this.a);
        }
    }

    public static final class c implements kws {
        public final String a;
        public final List<Event> b;
        public final Integer c;
        public final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, List<? extends Event> list, Integer num, boolean z) {
            list.getClass();
            this.a = str;
            this.b = list;
            this.c = num;
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
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && this.d == cVar.d;
        }

        public final int hashCode() {
            String str = this.a;
            int iA = ai50.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            Integer num = this.c;
            return Boolean.hashCode(this.d) + ((iA + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "HighLiability(bookingCode=" + this.a + ", bookingDataOutcomes=" + this.b + ", orderType=" + this.c + ", isSmartRemixAvailable=" + this.d + ")";
        }
    }

    public static final class d implements kws {
        public final Integer a;
        public final lws b;

        public d(Integer num, lws lwsVar) {
            this.a = num;
            this.b = lwsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            Integer num = this.a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            lws lwsVar = this.b;
            return iHashCode + (lwsVar != null ? lwsVar.hashCode() : 0);
        }

        public final String toString() {
            return "Loaded(orderType=" + this.a + ", combineSelection=" + this.b + ")";
        }
    }
}
