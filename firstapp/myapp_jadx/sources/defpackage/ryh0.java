package defpackage;

import com.sportybet.android.verifybet.apidata.VerifyBetData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ryh0 {

    public static final class a extends ryh0 {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("FormatError(message=", this.a, ")");
        }
    }

    public static final class b extends ryh0 {
        public static final b a = new b();
    }

    public static final class c extends ryh0 {
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
            return tug.a("RateLimitError(message=", this.a, ")");
        }
    }

    public static final class d extends ryh0 {
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
            return tug.a("ShowErrorMessage(message=", this.a, ")");
        }
    }

    public static final class e extends ryh0 {
        public static final e a = new e();
    }

    public static final class f extends ryh0 {
        public static final f a = new f();
    }

    public static final class g extends ryh0 {
        public final VerifyBetData a;

        public g(VerifyBetData verifyBetData) {
            this.a = verifyBetData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VerifySuccess(verifyBetData=" + this.a + ")";
        }
    }
}
