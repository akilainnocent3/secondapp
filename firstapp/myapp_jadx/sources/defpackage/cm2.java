package defpackage;

import com.sportybet.plugin.realsports.data.RTicket;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class cm2 {

    public static final class a extends cm2 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -936880136;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b extends cm2 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1632451556;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c extends cm2 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -878007508;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d extends cm2 {
        public final RTicket a;
        public final ShareBetData b;

        public d(RTicket rTicket, ShareBetData shareBetData) {
            this.a = rTicket;
            this.b = shareBetData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(rTicket=" + this.a + ", shareBetData=" + this.b + ")";
        }
    }
}
