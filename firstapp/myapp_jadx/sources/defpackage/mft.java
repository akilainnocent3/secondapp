package defpackage;

import com.sporty.android.core.model.patron.LoginResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface mft {

    public static final class a implements mft {
        public final Integer a;
        public final Throwable b;

        public a(Integer num, Throwable th) {
            this.a = num;
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Throwable th = this.b;
            return iHashCode + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            return "Failure(bizCode=" + this.a + ", throwable=" + this.b + ")";
        }
    }

    public static final class b implements mft {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2143363084;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c implements mft {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1676773884;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d implements mft {
        public final LoginResponse a;
        public final int b;

        public d(LoginResponse loginResponse, int i) {
            loginResponse.getClass();
            this.a = loginResponse;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(loginResponse=" + this.a + ", bizCode=" + this.b + ")";
        }
    }
}
