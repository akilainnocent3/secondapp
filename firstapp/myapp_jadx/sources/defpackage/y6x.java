package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface y6x {

    public static final class a implements y6x {
        public final BigDecimal a;

        public a(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
        }

        @Override // defpackage.y6x
        public final BigDecimal d() {
            return this.a;
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
            return "BetAmount(amount=" + this.a + ')';
        }
    }

    public static final class b implements y6x {
        public final GiftItem a;
        public final BigDecimal b;

        public b(GiftItem giftItem, BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = giftItem;
            this.b = bigDecimal;
        }

        @Override // defpackage.y6x
        public final BigDecimal d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "GiftAmount(gift=" + this.a + ", amount=" + this.b + ')';
        }
    }

    BigDecimal d();
}
