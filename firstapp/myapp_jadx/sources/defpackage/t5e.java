package defpackage;

import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface t5e {

    public static final class a implements t5e {
        public final PayHintData a;
        public final PaymentChannel b;

        public a(PayHintData payHintData, PaymentChannel paymentChannel) {
            paymentChannel.getClass();
            this.a = payHintData;
            this.b = paymentChannel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            PayHintData payHintData = this.a;
            return this.b.hashCode() + ((payHintData == null ? 0 : payHintData.hashCode()) * 31);
        }

        public final String toString() {
            return "MobileMoneyPage(payHintData=" + this.a + ", paymentChannel=" + this.b + ")";
        }
    }

    public static final class b implements t5e {
        public final PayHintData a;
        public final PaymentChannel b;

        public b(PayHintData payHintData, PaymentChannel paymentChannel) {
            paymentChannel.getClass();
            this.a = payHintData;
            this.b = paymentChannel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            PayHintData payHintData = this.a;
            return this.b.hashCode() + ((payHintData == null ? 0 : payHintData.hashCode()) * 31);
        }

        public final String toString() {
            return "PaybillPage(payHintData=" + this.a + ", paymentChannel=" + this.b + ")";
        }
    }
}
