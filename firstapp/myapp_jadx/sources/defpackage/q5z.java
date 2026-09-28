package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface q5z {

    public static final class a implements q5z {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 353137775;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements q5z {
        public final g74 a;

        public b(g74 g74Var) {
            this.a = g74Var;
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
            return "BiometricError(error=" + this.a + ")";
        }
    }

    public static final class c implements q5z {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1338331507;
        }

        public final String toString() {
            return "BiometricFailed";
        }
    }

    public static final class d implements q5z {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1860349507;
        }

        public final String toString() {
            return "BiometricPromptShown";
        }
    }

    public static final class e implements q5z {
        public final qd4.c a;

        public e(qd4.c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
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

    public static final class f implements q5z {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1270234167;
        }

        public final String toString() {
            return "CancelOtp";
        }
    }

    public static final class g implements q5z {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1134588048;
        }

        public final String toString() {
            return "ClickCS";
        }
    }

    public static final class h implements q5z {
        public final gay a;

        public h(gay gayVar) {
            this.a = gayVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            gay gayVar = this.a;
            if (gayVar == null) {
                return 0;
            }
            return gayVar.hashCode();
        }

        public final String toString() {
            return "DismissDialogAndBack(errorCode=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class i implements q5z {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -880446579;
        }

        public final String toString() {
            return CaBJCMnsV.ChEsElXJvYbuN;
        }
    }

    public static final class j implements q5z {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -928477315;
        }

        public final String toString() {
            return "DismissLeaveDialog";
        }
    }

    public static final class k implements q5z {
        public final boolean a;
        public final gay b;

        public k(boolean z, gay gayVar) {
            this.a = z;
            this.b = gayVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a == kVar.a && this.b == kVar.b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            gay gayVar = this.b;
            return iHashCode + (gayVar == null ? 0 : gayVar.hashCode());
        }

        public final String toString() {
            return "DismissVerifyFailedDialog(requestFirstPinFocus=" + this.a + ", errorCode=" + this.b + ")";
        }
    }

    public static final class l implements q5z {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 185219611;
        }

        public final String toString() {
            return "Finish";
        }
    }

    public static final class m implements q5z {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -955868214;
        }

        public final String toString() {
            return "LeaveOtpFlow";
        }
    }

    public static final class n implements q5z {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1924683922;
        }

        public final String toString() {
            return "Pause";
        }
    }

    public static final class o implements q5z {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 334894320;
        }

        public final String toString() {
            return "RequestLeave";
        }
    }

    public static final class p implements q5z {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 525235637;
        }

        public final String toString() {
            return "Resume";
        }
    }

    public static final class q implements q5z {
        public final OtpSelection a;

        public q(OtpSelection otpSelection) {
            this.a = otpSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.a == ((q) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SendOtp(otpSelection=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class r implements q5z {
        public static final r a = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -1503729115;
        }

        public final String toString() {
            return YAzniTbXHYQ.rJKlSNPYfpq;
        }
    }

    public static final class s implements q5z {
        public final uf00<d08> a;

        /* JADX WARN: Multi-variable type inference failed */
        public s(uf00<? extends d08> uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Intrinsics.g(this.a, ((s) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateOTPCode(boxList=" + this.a + ")";
        }
    }

    public static final class t implements q5z {
        public final gz00 a;

        public t(gz00 gz00Var) {
            this.a = gz00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a.equals(((t) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateOTPFocus(pinCodeFocus=" + this.a + ")";
        }
    }
}
