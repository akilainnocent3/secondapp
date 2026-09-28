package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface o6z {

    public static final class a implements o6z {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1132604563;
        }

        public final String toString() {
            return "AccountVerified";
        }
    }

    public static final class b implements o6z {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 623143055;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class c implements o6z {
        public final g74 a;

        public c(g74 g74Var) {
            this.a = g74Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "BiometricError(error=" + this.a + ")";
        }
    }

    public static final class d implements o6z {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1013520787;
        }

        public final String toString() {
            return "BiometricFailed";
        }
    }

    public static final class e implements o6z {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1878456867;
        }

        public final String toString() {
            return "BiometricPromptShown";
        }
    }

    public static final class f implements o6z {
        public final qd4.c a;

        public f(qd4.c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            qd4.c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public final String toString() {
            return "BiometricSuccess(cryptoObject=" + this.a + ")";
        }
    }

    public static final class g implements o6z {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 498602417;
        }

        public final String toString() {
            return "CancelOTPAPI";
        }
    }

    public static final class h implements o6z {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1593561463;
        }

        public final String toString() {
            return "ClickMoreOptions";
        }
    }

    public static final class i implements o6z {
        public final OtpSelection a;

        public i(OtpSelection otpSelection) {
            this.a = otpSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ClickOTP(otpSelection=" + this.a + ")";
        }
    }

    public static final class j implements o6z {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 247196543;
        }

        public final String toString() {
            return "ConfirmLeave";
        }
    }

    public static final class k implements o6z {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1997256702;
        }

        public final String toString() {
            return "DismissInitErrorDialog";
        }
    }

    public static final class l implements o6z {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1053635683;
        }

        public final String toString() {
            return "DismissLeaveDialog";
        }
    }

    public static final class m implements o6z {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1014013895;
        }

        public final String toString() {
            return "DismissOTPErrorDialog";
        }
    }

    public static final class n implements o6z {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -36970156;
        }

        public final String toString() {
            return "GoCustomService";
        }
    }

    public static final class o implements o6z {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -546838256;
        }

        public final String toString() {
            return "RequestLeave";
        }
    }
}
