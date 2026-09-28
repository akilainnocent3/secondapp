package defpackage;

import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface xuz {

    public static final class a implements xuz {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -772177871;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements xuz {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1833552878;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class c implements xuz {
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
            return tug.a("LaunchOtp(phone=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class d implements xuz {
        public final String a;

        public d(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LaunchUrl(url=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class e implements xuz {
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
            return "RegistrationComplete(phone=" + this.a + ", result=" + this.b + ")";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class f implements xuz {
        public final String a;
        public final OTPCompleteResult b;
        public final String c;
        public final boolean d;

        public f(String str, OTPCompleteResult oTPCompleteResult, String str2, boolean z) {
            str.getClass();
            oTPCompleteResult.getClass();
            str2.getClass();
            this.a = str;
            this.b = oTPCompleteResult;
            this.c = str2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c) && this.d == fVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResetComplete(mobile=");
            sb.append(this.a);
            sb.append(", result=");
            sb.append(this.b);
            sb.append(", triggeredEvent=");
            return x9d.a(this.c, ", isForced=", ")", sb, this.d);
        }
    }
}
