package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.EventData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class png {

    public static final class a extends png {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1816324071;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b extends png {
        public final Long a;

        public b(Long l) {
            this.a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            Long l = this.a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return "Error(errorCode=" + this.a + ")";
        }
    }

    public static final class c extends png {
        public final EventData a;
        public final String b;
        public final aqn c;

        public c(EventData eventData, String str, aqn aqnVar) {
            str.getClass();
            this.a = eventData;
            this.b = str;
            this.c = aqnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, false);
        }

        public final String toString() {
            return "Ideal(eventData=" + this.a + ", lastFocusedMarketGroupId=" + this.b + ", showNewBetBuilderDesign=false, kickOffButtonPosition=" + this.c + ")";
        }
    }

    public static final class d extends png {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 229765384;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
