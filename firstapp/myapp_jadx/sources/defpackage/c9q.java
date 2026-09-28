package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface c9q {

    public static final class a implements c9q {
        public final BigDecimal a;

        public a(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            BigDecimal bigDecimal = ((a) obj).a;
            rkd0.a aVar = rkd0.Companion;
            return Intrinsics.g(this.a, bigDecimal);
        }

        public final int hashCode() {
            rkd0.a aVar = rkd0.Companion;
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("AddQuickStake(amount=", rkd0.a(this.a), ")");
        }
    }

    public static final class b implements c9q {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2073752223;
        }

        public final String toString() {
            return "ClearStake";
        }
    }

    public static final class c implements c9q {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -322055866;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class d implements c9q {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -634940637;
        }

        public final String toString() {
            return "ConfirmBet";
        }
    }

    public static final class e implements c9q {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 314892637;
        }

        public final String toString() {
            return "DeleteStake";
        }
    }

    public static final class f implements c9q {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 792229040;
        }

        public final String toString() {
            return "DismissConfirmDialog";
        }
    }

    public static final class g implements c9q {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "DoneEditingStake(saveDefaultAmount=", ")");
        }
    }

    public static final class h implements c9q {
        public final String a;

        public h(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("InputStake(input=", this.a, ")");
        }
    }

    public static final class i implements c9q {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1489534526;
        }

        public final String toString() {
            return "OpenDeposit";
        }
    }

    public static final class j implements c9q {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1356815356;
        }

        public final String toString() {
            return "PlaceBet";
        }
    }

    public static final class k implements c9q {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 584543875;
        }

        public final String toString() {
            return "ReturnFromBetError";
        }
    }

    public static final class l implements c9q {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 476123483;
        }

        public final String toString() {
            return "ToggleStakeKeyboard";
        }
    }

    public static final class m implements c9q {
        public final String a;

        public m(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.g(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ViewOrder(orderId=", this.a, ")");
        }
    }
}
