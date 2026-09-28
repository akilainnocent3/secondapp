package defpackage;

import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ycj {

    public static final class a implements ycj {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1220387585;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements ycj {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -821427426;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class c implements ycj {
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
            return tug.a("LaunchOTP(phone=", this.a, ")");
        }
    }

    public static final class d implements ycj {
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
            return tug.a("LaunchUrl(url=", this.a, ")");
        }
    }

    public static final class e implements ycj {
        public final String a;
        public final OTPCompleteResult b;
        public final cej c;

        public e(String str, OTPCompleteResult oTPCompleteResult, cej cejVar) {
            str.getClass();
            oTPCompleteResult.getClass();
            this.a = str;
            this.b = oTPCompleteResult;
            this.c = cejVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && this.c == eVar.c;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "RegisterComplete(phone=" + this.a + ", data=" + this.b + ", onResult=" + this.c + ")";
        }
    }
}
