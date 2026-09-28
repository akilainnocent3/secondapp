package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface lpj {

    public static final class a implements lpj {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -858848612;
        }

        public final String toString() {
            return "GameExit";
        }
    }

    public interface b extends lpj {

        public static final class a implements b {
            public final List<eq10> a;
            public final boolean b;

            public a(List<eq10> list, boolean z) {
                list.getClass();
                this.a = list;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FlyAwayBonus(rewards=");
                sb.append(this.a);
                sb.append(", majorHitOccurred=");
                return ruw.a(sb, this.b, ')');
            }
        }

        /* JADX INFO: renamed from: lpj$b$b, reason: collision with other inner class name */
        public static final class C0827b implements b {
            public final long a;

            public C0827b(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0827b) && this.a == ((C0827b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return uvh.a(new StringBuilder("HammerHit(playerId="), this.a, ')');
            }
        }

        public static final class c implements b {
            public final double a;
            public final long b;
            public final boolean c;

            public c(double d, long j, boolean z) {
                this.a = d;
                this.b = j;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Double.compare(this.a, cVar.a) == 0 && this.b == cVar.b && this.c == cVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + f87.a(Double.hashCode(this.a) * 31, this.b, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MajorWin(amount=");
                sb.append(this.a);
                sb.append(", wonByUserId=");
                sb.append(this.b);
                sb.append(", isUser=");
                return ruw.a(sb, this.c, ')');
            }
        }

        public static final class d implements b {
            public final eq10 a;

            public d(eq10 eq10Var) {
                this.a = eq10Var;
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
                return "MinorWin(reward=" + this.a + ')';
            }
        }

        public static final class e implements b {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 203584109;
            }

            public final String toString() {
                return "None";
            }
        }

        public static final class f implements b {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1808103529;
            }

            public final String toString() {
                return "OneHitLeft";
            }
        }

        public static final class g implements b {
            public final String a;
            public final boolean b;
            public final boolean c;
            public final int d;

            public g(boolean z, int i, String str, boolean z2) {
                this.a = str;
                this.b = z;
                this.c = z2;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.g(this.a, gVar.a) && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PlayAnimation(animationName=");
                sb.append(this.a);
                sb.append(", loop=");
                sb.append(this.b);
                sb.append(", isSkinChange=");
                sb.append(this.c);
                sb.append(", animationNumber=");
                return rr1.b(sb, this.d, ')');
            }
        }

        public static final class h implements b {
            public final int a;

            public h(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return rr1.b(new StringBuilder("PreStartRoundTimer(secondsLeft="), this.a, ')');
            }
        }

        public static final class i implements b {
            public final long a;
            public final String b;

            public i(long j, String str) {
                str.getClass();
                this.a = j;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return this.a == iVar.a && Intrinsics.g(this.b, iVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowPlayerReaction(playerId=");
                sb.append(this.a);
                sb.append(", reaction=");
                return j26.a(sb, this.b, ')');
            }
        }

        public static final class j implements b {
            public static final j a = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return 1264701375;
            }

            public final String toString() {
                return "TimeoutThreshold";
            }
        }
    }

    public interface c extends lpj {

        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -703618439;
            }

            public final String toString() {
                return "DisableHitButton";
            }
        }

        public static final class b implements c {
            public final long a;

            public b(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return uvh.a(new StringBuilder("DisablePlayer(playerId="), this.a, ')');
            }
        }

        /* JADX INFO: renamed from: lpj$c$c, reason: collision with other inner class name */
        public static final class C0828c implements c {
            public static final C0828c a = new C0828c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0828c);
            }

            public final int hashCode() {
                return 368937734;
            }

            public final String toString() {
                return "EnableHitButton";
            }
        }

        public static final class d implements c {
            public final Set<Long> a;

            public d(Set<Long> set) {
                set.getClass();
                this.a = set;
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
                return "EnablePlayers(playerIds=" + this.a + ')';
            }
        }

        public static final class e implements c {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 505305648;
            }

            public final String toString() {
                return "GameAlreadyEnded";
            }
        }

        public static final class f implements c {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 132718988;
            }

            public final String toString() {
                return "GameEnded";
            }
        }

        public static final class g implements c {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -5788433;
            }

            public final String toString() {
                return "RoundStarted";
            }
        }

        public static final class h implements c {
            public final int a;

            public h(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return rr1.b(new StringBuilder("Timer(secondsLeft="), this.a, ')');
            }
        }

        public static final class i implements c {
            public final int a;

            public i(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.a == ((i) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return rr1.b(new StringBuilder("UserHammersLeft(hammersLeft="), this.a, ')');
            }
        }
    }
}
