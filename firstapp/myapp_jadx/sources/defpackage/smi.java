package defpackage;

import com.sporty.android.core.model.loyalty.RewardShowOffData;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface smi {

    public static final class a implements smi {
        public final String a;
        public final String b;
        public final kp7 c;
        public final CountryCodeName d;
        public final RewardShowOffData e;

        public a(String str, String str2, kp7 kp7Var, CountryCodeName countryCodeName, RewardShowOffData rewardShowOffData) {
            str.getClass();
            str2.getClass();
            countryCodeName.getClass();
            this.a = str;
            this.b = str2;
            this.c = kp7Var;
            this.d = countryCodeName;
            this.e = rewardShowOffData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && this.d == aVar.d && Intrinsics.g(this.e, aVar.e);
        }

        public final int hashCode() {
            int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
            kp7 kp7Var = this.c;
            int iHashCode = (this.d.hashCode() + ((iA + (kp7Var == null ? 0 : kp7Var.hashCode())) * 31)) * 31;
            RewardShowOffData rewardShowOffData = this.e;
            return iHashCode + (rewardShowOffData != null ? rewardShowOffData.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Game(potentialReward=", this.a, ", date=", this.b, ", claimResult=");
            sbA.append(this.c);
            sbA.append(", countryCode=");
            sbA.append(this.d);
            sbA.append(", rewardShowOffData=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements smi {
        public final CountryCodeName a;
        public final boolean b;
        public final kp7 c;
        public final RewardShowOffData d;

        public b(CountryCodeName countryCodeName, boolean z, kp7 kp7Var, RewardShowOffData rewardShowOffData) {
            countryCodeName.getClass();
            this.a = countryCodeName;
            this.b = z;
            this.c = kp7Var;
            this.d = rewardShowOffData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            int iA = mtg0.a(this.a.hashCode() * 31, 31, this.b);
            kp7 kp7Var = this.c;
            int iHashCode = (iA + (kp7Var == null ? 0 : kp7Var.hashCode())) * 31;
            RewardShowOffData rewardShowOffData = this.d;
            return iHashCode + (rewardShowOffData != null ? rewardShowOffData.hashCode() : 0);
        }

        public final String toString() {
            return "Loading(countryCode=" + this.a + ", shouldSkipBallFlicking=" + this.b + ", claimResult=" + this.c + ", rewardShowOffData=" + this.d + ")";
        }
    }

    public static final class c implements smi {
        public final kp7 a;
        public final RewardShowOffData b;
        public final uxs c;

        public c(kp7 kp7Var, RewardShowOffData rewardShowOffData, uxs uxsVar) {
            kp7Var.getClass();
            rewardShowOffData.getClass();
            uxsVar.getClass();
            this.a = kp7Var;
            this.b = rewardShowOffData;
            this.c = uxsVar;
        }

        public static c a(c cVar, RewardShowOffData rewardShowOffData, uxs uxsVar, int i) {
            kp7 kp7Var = cVar.a;
            if ((i & 2) != 0) {
                rewardShowOffData = cVar.b;
            }
            kp7Var.getClass();
            rewardShowOffData.getClass();
            return new c(kp7Var, rewardShowOffData, uxsVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Reward(claimResult=" + this.a + ", rewardShowOffData=" + this.b + ", isShowOffLoading=" + this.c + ")";
        }
    }
}
