package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;

/* JADX INFO: loaded from: classes5.dex */
public interface o2a0 {

    public static final class a implements o2a0 {
        public static final a a = new a();
    }

    public static final class b implements o2a0 {
        public static final b a = new b();
    }

    public static final class c implements o2a0 {
        public final OtpData a;

        public c(OtpData otpData) {
            this.a = otpData;
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
            return "Finish(data=" + this.a + ")";
        }
    }

    public static final class d implements o2a0 {
        public static final d a = new d();
    }

    public static final class e implements o2a0 {
        public final OtpSelection a;
        public final OTPInternalData b;

        public e(OtpSelection otpSelection, OTPInternalData oTPInternalData) {
            this.a = otpSelection;
            this.b = oTPInternalData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LaunchOTP(otpSelection=" + this.a + ", otpInternalData=" + this.b + ")";
        }
    }

    public static final class f implements o2a0 {
        public static final f a = new f();
    }

    public static final class g implements o2a0 {
        public static final g a = new g();
    }
}
