package defpackage;

import com.sporty.android.core.model.welcomereward.NonFtdRewardType;
import com.sporty.android.core.model.welcomereward.NonFtdTaskType;

/* JADX INFO: loaded from: classes5.dex */
public interface j4j0 {

    public static final class a implements j4j0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2095371830;
        }

        public final String toString() {
            return "ClickMoreInfo";
        }
    }

    public static final class b implements j4j0 {
        public final boolean a;
        public final NonFtdRewardType b;
        public final gr50 c;

        public b(boolean z, NonFtdRewardType nonFtdRewardType, gr50 gr50Var) {
            nonFtdRewardType.getClass();
            this.a = z;
            this.b = nonFtdRewardType;
            this.c = gr50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            return "ClickRewardItem(isUnlocked=" + this.a + ", type=" + this.b + ", payload=" + this.c + ")";
        }
    }

    public static final class c implements j4j0 {
        public final boolean a;
        public final NonFtdTaskType b;
        public final boolean c;

        public c(boolean z, NonFtdTaskType nonFtdTaskType, boolean z2) {
            nonFtdTaskType.getClass();
            this.a = z;
            this.b = nonFtdTaskType;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickTaskItem(isComplete=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", isKycUnderReview=");
            return mq0.a(sb, this.c, ")");
        }
    }

    public static final class d implements j4j0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 150893431;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class e implements j4j0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -465863998;
        }

        public final String toString() {
            return "MarkAllDoneAnimationShown";
        }
    }

    public static final class f implements j4j0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -813646453;
        }

        public final String toString() {
            return "ViewWelcomeReward";
        }
    }
}
