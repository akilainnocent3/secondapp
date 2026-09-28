package defpackage;

import com.sportybet.android.social.data.remote.entity.RewardData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface tp7 {

    public static final class a implements tp7 {
        public final Throwable a;

        public a(int i, Throwable th) {
            this.a = (i & 1) != 0 ? null : th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Throwable th = this.a;
            return (th == null ? 0 : th.hashCode()) * 31;
        }

        public final String toString() {
            return kox.a("Error(error=", ", errorText=null)", this.a);
        }
    }

    public static final class b implements tp7 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -504017492;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c implements tp7 {
        public final RewardData a;

        public c(RewardData rewardData) {
            rewardData.getClass();
            this.a = rewardData;
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
            return "Success(rewardData=" + this.a + ")";
        }
    }
}
