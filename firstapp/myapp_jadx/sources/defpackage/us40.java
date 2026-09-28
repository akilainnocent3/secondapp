package defpackage;

import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface us40 {

    public static final class a implements us40 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1609018414;
        }

        public final String toString() {
            return "ChangeCountry";
        }
    }

    public static final class b implements us40 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1144432644;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class c implements us40 {
        public final String a;

        public c(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("LaunchLogin(phone=", this.a, ")");
        }
    }

    public static final class d implements us40 {
        public final String a;
        public final String b;
        public final RegisterRevampConfig c;

        public d(String str, String str2) {
            RegisterRevampConfig.Default r0 = RegisterRevampConfig.Default.a;
            str.getClass();
            str2.getClass();
            r0.getClass();
            this.a = str;
            this.b = str2;
            this.c = r0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && this.c.equals(dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("LaunchOTP(phoneCode=", this.a, ", phoneNumber=", this.b, ", config=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class e implements us40 {
        public final String a;
        public final OTPCompleteResult b;

        public e(String str, OTPCompleteResult oTPCompleteResult) {
            str.getClass();
            oTPCompleteResult.getClass();
            this.a = str;
            this.b = oTPCompleteResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RegistrationComplete(phone=" + this.a + ", data=" + this.b + ")";
        }
    }
}
