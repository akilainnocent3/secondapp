package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface e9g {

    public static final class a implements e9g {
        public final OtpModule<OtpData.DeviceBlocking> a;

        public a(OtpModule<OtpData.DeviceBlocking> otpModule) {
            this.a = otpModule;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LaunchDeviceBlockingOtp(module=" + this.a + ")";
        }
    }

    public static final class b implements e9g {
        public final OtpModule<OtpData.DeviceLogout> a;

        public b(OtpModule<OtpData.DeviceLogout> otpModule) {
            this.a = otpModule;
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
            return "LaunchDeviceLogoutOtp(module=" + this.a + ")";
        }
    }

    public static final class c implements e9g {
        public final UiText a;

        public c(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            if (uiText == null) {
                return 0;
            }
            return uiText.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "ToDeviceList(messageUiText=", ")");
        }
    }

    public static final class d implements e9g {
        public final String a;

        public d(String str) {
            this.a = str;
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
            return tug.a("ToForgotPassword(mobile=", this.a, ")");
        }
    }
}
