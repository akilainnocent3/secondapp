package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;

/* JADX INFO: loaded from: classes5.dex */
public interface maf0 {

    public static final class a implements maf0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1393558578;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements maf0 {
        public final OtpData a;

        public b(OtpData otpData) {
            this.a = otpData;
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
            return "Finish(data=" + this.a + ")";
        }
    }

    public static final class c implements maf0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 533602485;
        }

        public final String toString() {
            return "GoCustomService";
        }
    }

    public static final class d implements maf0 {
        public final OtpSelection a;
        public final OTPInternalData b;

        public d(OtpSelection otpSelection, OTPInternalData oTPInternalData) {
            this.a = otpSelection;
            this.b = oTPInternalData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b.equals(dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LaunchOTP(otpSelection=" + this.a + ", otpInternalData=" + this.b + ")";
        }
    }

    public static final class e implements maf0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -405253079;
        }

        public final String toString() {
            return "LeaveOtpFlow";
        }
    }
}
