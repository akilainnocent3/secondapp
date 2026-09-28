package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;

/* JADX INFO: loaded from: classes5.dex */
public interface lwf {

    public static final class a implements lwf {
        public static final a a = new a();
    }

    public static final class b implements lwf {
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

    public static final class c implements lwf {
        public static final c a = new c();
    }

    public static final class d implements lwf {
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
            return "LaunchOtp(otpSelection=" + this.a + ", otpInternalData=" + this.b + ")";
        }
    }

    public static final class e implements lwf {
        public static final e a = new e();
    }
}
