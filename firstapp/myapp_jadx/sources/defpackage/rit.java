package defpackage;

import com.sporty.android.core.model.patron.LoginResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface rit {

    public static final class a implements rit {
        public final Integer a;
        public final Throwable b;

        public a(Integer num, Throwable th, int i) {
            num = (i & 1) != 0 ? null : num;
            th = (i & 2) != 0 ? null : th;
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
            return "Error(bizCode=" + this.a + ", throwable=" + this.b + ")";
        }
    }

    public static final class b implements rit {
        public final LoginResponse a;
        public final int b;

        public b(LoginResponse loginResponse, int i) {
            loginResponse.getClass();
            this.a = loginResponse;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(loginResponse=" + this.a + ", bizCode=" + this.b + ")";
        }
    }
}
