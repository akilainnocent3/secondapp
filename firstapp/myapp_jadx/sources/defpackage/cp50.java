package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface cp50 {

    public static final class a implements cp50 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2010562438;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements cp50 {
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

    public static final class c implements cp50 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1201233686;
        }

        public final String toString() {
            return "BiometricFailed";
        }
    }

    public static final class d implements cp50 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 590646996;
        }

        public final String toString() {
            return "BiometricPromptShown";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class e implements cp50 {
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
            return CaxEybC.wWsACIxDeNJ + this.a + ")";
        }
    }

    public static final class f implements cp50 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1690997275;
        }

        public final String toString() {
            return "CloseAndBack";
        }
    }

    public static final class g implements cp50 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 719409633;
        }

        public final String toString() {
            return "CloseDialog";
        }
    }

    public static final class h implements cp50 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1388903074;
        }

        public final String toString() {
            return "CompleteAPI";
        }
    }

    public static final class i implements cp50 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -462546062;
        }

        public final String toString() {
            return "Finish";
        }
    }

    public static final class j implements cp50 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1873220087;
        }

        public final String toString() {
            return "GenerateOTP";
        }
    }

    public static final class k implements cp50 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -2117182979;
        }

        public final String toString() {
            return "GoCustomService";
        }
    }

    public static final class l implements cp50 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 195704520;
        }

        public final String toString() {
            return "ManualCheckOTP";
        }
    }

    public static final class m implements cp50 {
        public final OtpSelection a;

        public m(OtpSelection otpSelection) {
            this.a = otpSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OTPSelectionClick(otpSelection=" + this.a + ")";
        }
    }

    public static final class n implements cp50 {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1937905980;
        }

        public final String toString() {
            return "OnStart";
        }
    }

    public static final class o implements cp50 {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -201060000;
        }

        public final String toString() {
            return "OnStop";
        }
    }

    public static final class p implements cp50 {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1378886532;
        }

        public final String toString() {
            return "SendOTP";
        }
    }
}
