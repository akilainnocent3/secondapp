package defpackage;

import com.sporty.android.core.model.OrderBetType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vwv {

    public static final class a extends vwv {
        public static final a a = new a();
    }

    public static final class b extends vwv {
        public final OrderBetType a;

        public b(OrderBetType orderBetType) {
            orderBetType.getClass();
            this.a = orderBetType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NoShow(orderBetType=" + this.a + ")";
        }
    }

    public static final class c extends vwv {
        public final OrderBetType a;
        public final ftv.a b;

        public c(OrderBetType orderBetType, ftv.a aVar) {
            orderBetType.getClass();
            this.a = orderBetType;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Show(orderBetType=" + this.a + ", mission=" + this.b + ")";
        }
    }
}
