package defpackage;

import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s8d0 {

    public static final class a extends s8d0 {
        public final WithdrawalPinStatusInfo a;

        public a(WithdrawalPinStatusInfo withdrawalPinStatusInfo) {
            this.a = withdrawalPinStatusInfo;
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
            return "DepositBank(pinStatusInfo=" + this.a + ")";
        }
    }

    public static final class b extends s8d0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1653591587;
        }

        public final String toString() {
            return "ForcePinWithdrawBank";
        }
    }

    public static final class c extends s8d0 {
        public final WithdrawalPinStatusInfo a;

        public c(WithdrawalPinStatusInfo withdrawalPinStatusInfo) {
            this.a = withdrawalPinStatusInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WithdrawBank(pinStatusInfo=" + this.a + ")";
        }
    }

    public static final class d extends s8d0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -473209720;
        }

        public final String toString() {
            return "WithdrawTransfer";
        }
    }
}
