package defpackage;

import com.sporty.android.core.model.loyalty.RewardShowOffData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class es50 {

    public static final class a extends es50 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1932226794;
        }

        public final String toString() {
            return "Loaded";
        }
    }

    public static final class b extends es50 {
        public final RewardShowOffData a;

        public b(RewardShowOffData rewardShowOffData) {
            rewardShowOffData.getClass();
            this.a = rewardShowOffData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Loading(data=" + this.a + ")";
        }
    }
}
