package defpackage;

import com.sportybet.feature.payment.impl.withdraw.presentation.model.WithdrawConfirmation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface kqj0 {

    public static final class a implements kqj0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1503545861;
        }

        public final String toString() {
            return "ClearBankAndAccount";
        }
    }

    public static final class b implements kqj0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1124839384;
        }

        public final String toString() {
            return "DismissConfirmDialog";
        }
    }

    public static final class c implements kqj0 {
        public final Integer a;

        public c(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "ReEnterBankAccountDetails(assetId=" + this.a + ")";
        }
    }

    public static final class d implements kqj0 {
        public final WithdrawConfirmation a;

        public d(WithdrawConfirmation withdrawConfirmation) {
            this.a = withdrawConfirmation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowConfirmDialog(confirmation=" + this.a + ")";
        }
    }
}
