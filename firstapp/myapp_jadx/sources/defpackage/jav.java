package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface jav {

    public interface a extends jav {

        /* JADX INFO: renamed from: jav$a$a, reason: collision with other inner class name */
        public static final class C0713a implements a {
            public static final C0713a a = new C0713a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0713a);
            }

            public final int hashCode() {
                return 1932545749;
            }

            public final String toString() {
                return "RoundAssigned";
            }
        }

        public static final class b implements a {
            public final String a;
            public final double b;

            public b(String str, double d) {
                this.a = str;
                this.b = d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && Double.compare(this.b, bVar.b) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RoundCancelled(currency=");
                sb.append(this.a);
                sb.append(", refundedStake=");
                return org0.a(sb, this.b, ')');
            }
        }
    }

    public interface b extends jav {

        public static final class a implements b {
            public final int a;
            public final int b;
            public final double c;
            public final String d;

            public a(int i, int i2, double d, String str) {
                this.a = i;
                this.b = i2;
                this.c = d;
                this.d = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && Double.compare(this.c, aVar.c) == 0 && this.d.equals(aVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + nrg0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StatusUpdate(currentPlayers=");
                sb.append(this.a);
                sb.append(", maxPlayers=");
                sb.append(this.b);
                sb.append(", prizePoolAmount=");
                sb.append(this.c);
                sb.append(", currency=");
                return j26.a(sb, this.d, ')');
            }
        }

        /* JADX INFO: renamed from: jav$b$b, reason: collision with other inner class name */
        public static final class C0714b implements b {
            public final int a;
            public final int b;

            public C0714b(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0714b)) {
                    return false;
                }
                C0714b c0714b = (C0714b) obj;
                return this.a == c0714b.a && this.b == c0714b.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TimerUpdate(remainingSeconds=");
                sb.append(this.a);
                sb.append(", totalSeconds=");
                return rr1.b(sb, this.b, ')');
            }
        }

        public static final class c implements b {
            public final int a;
            public final String b;
            public final String c;

            public c(int i, String str, String str2) {
                str.getClass();
                str2.getClass();
                this.a = i;
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UserReactionUpdate(msgId=");
                sb.append(this.a);
                sb.append(", userName=");
                sb.append(this.b);
                sb.append(", emoji=");
                return j26.a(sb, this.c, ')');
            }
        }
    }
}
