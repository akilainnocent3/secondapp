package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface l6z {

    public static final class a implements l6z {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 378413963;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements l6z {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -439832360;
        }

        public final String toString() {
            return "GoCustomService";
        }
    }

    public static final class c implements l6z {
        public final OtpSelection a;
        public final OTPInternalData b;
        public final UiText c;

        public c(OtpSelection otpSelection, OTPInternalData oTPInternalData, UiText uiText) {
            otpSelection.getClass();
            this.a = otpSelection;
            this.b = oTPInternalData;
            this.c = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b.equals(cVar.b) && Intrinsics.g(this.c, cVar.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            UiText uiText = this.c;
            return iHashCode + (uiText == null ? 0 : uiText.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LaunchOTP(otpSelection=");
            sb.append(this.a);
            sb.append(", otpInternalData=");
            sb.append(this.b);
            sb.append(", pendingSnackbar=");
            return plf.a(sb, this.c, ")");
        }
    }

    public static final class d implements l6z {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1699730444;
        }

        public final String toString() {
            return "LeaveConfirmed";
        }
    }

    public static final class e implements l6z {
        public final OtpData a;

        public e(OtpData otpData) {
            this.a = otpData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetVerificationResult(otpData=" + this.a + ")";
        }
    }
}
