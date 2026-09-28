package defpackage;

import com.sporty.android.core.model.loyalty.RewardShowOffData;
import com.sporty.android.platform.features.loyalty.footballgame.FootballData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ebi {

    public static final class a implements ebi {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1580439244;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements ebi {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1436634405;
        }

        public final String toString() {
            return "CloseErrorDialog";
        }
    }

    public static final class c implements ebi {
        public final kp7 a;
        public final RewardShowOffData b;

        public c(kp7 kp7Var, RewardShowOffData rewardShowOffData) {
            kp7Var.getClass();
            rewardShowOffData.getClass();
            this.a = kp7Var;
            this.b = rewardShowOffData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "GoToReward(claimResult=" + this.a + ", rewardShowOffConfig=" + this.b + ")";
        }
    }

    public static final class d implements ebi {
        public final boolean a;
        public final vbp b;

        public d(boolean z, vbp vbpVar) {
            this.a = z;
            this.b = vbpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            vbp vbpVar = this.b;
            return iHashCode + (vbpVar == null ? 0 : vbpVar.hashCode());
        }

        public final String toString() {
            return "HandleGenerateShareImgJsResponseEvent(isSuccess=" + this.a + ", failureReason=" + this.b + ")";
        }
    }

    public static final class e implements ebi {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -646114048;
        }

        public final String toString() {
            return "Hitboard";
        }
    }

    public static final class f implements ebi {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1761050800;
        }

        public final String toString() {
            return "LoadSuccess";
        }
    }

    public static final class g implements ebi {
        public final FootballData a;

        public g(FootballData footballData) {
            this.a = footballData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NextGame(footballData=" + this.a + ")";
        }
    }

    public static final class h implements ebi {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -992329761;
        }

        public final String toString() {
            return "OnSkipFlickBall";
        }
    }

    public static final class i implements ebi {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -649090778;
        }

        public final String toString() {
            return "PreClaim";
        }
    }

    public static final class j implements ebi {
        public final String a;

        public j(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a.equals(((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ProcessRewardShowOff(dataUri=", this.a, ")");
        }
    }

    public static final class k implements ebi {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1498289210;
        }

        public final String toString() {
            return "ShowErrorDialog";
        }
    }

    public static final class l implements ebi {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1525076600;
        }

        public final String toString() {
            return "TriggerRewardShowOff";
        }
    }
}
