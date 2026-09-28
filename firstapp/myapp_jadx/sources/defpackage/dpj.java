package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public interface dpj {

    public static final class a implements dpj {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FlyAwayBonus(rewards=" + this.a + ')';
        }
    }

    public static final class b implements dpj {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -176093293;
        }

        public final String toString() {
            return "FlyAwayWarning";
        }
    }

    public static final class c implements dpj {
        public final pr50 a;

        public c(pr50 pr50Var) {
            this.a = pr50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MinorWin(rewardInfo=" + this.a + ')';
        }
    }

    public static final class d implements dpj {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1384943199;
        }

        public final String toString() {
            return "NoDialog";
        }
    }

    public static final class e implements dpj {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 516117036;
        }

        public final String toString() {
            return "OneHitLeft";
        }
    }

    public static final class f implements dpj {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("PreRoundStartTimer(secondsLeft="), this.a, ')');
        }
    }
}
