package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface rn30 {

    public static final class a implements rn30 {
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
            BigDecimal bigDecimal2 = skd0.b;
            return Intrinsics.g(this.a, bigDecimal);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = skd0.b;
            return this.a.hashCode();
        }

        public final String toString() {
            return "AddAmount(amount=" + ((Object) skd0.a(this.a)) + ')';
        }
    }

    public static final class b implements rn30 {
        public final tq30 a;
        public final boolean b;

        public b(tq30 tq30Var, boolean z) {
            tq30Var.getClass();
            this.a = tq30Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetClick(userPick=");
            sb.append(this.a);
            sb.append(", isOneTapBetCheck=");
            return ruw.a(sb, this.b, ')');
        }
    }

    public static final class c implements rn30 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1997257781;
        }

        public final String toString() {
            return "ClearGift";
        }
    }

    public static final class d implements rn30 {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("CloseGame(message=null, showRecommendationDialog="), this.a, ')');
        }
    }

    public static final class e implements rn30 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1072813962;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public static final class f implements rn30 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -53091774;
        }

        public final String toString() {
            return "LoginSuccess";
        }
    }

    public static final class g implements rn30 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1753798751;
        }

        public final String toString() {
            return "NavBackPress";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h implements rn30 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1062082517;
        }

        public final String toString() {
            return "NextRoundClick";
        }
    }

    public static final class i implements rn30 {
        public final boolean a;

        public i(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("OnTabBetConfigChange(oneTapBet="), this.a, ')');
        }
    }

    public static final class j implements rn30 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1261073514;
        }

        public final String toString() {
            return "OpenGiftDialog";
        }
    }

    public static final class k implements rn30 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -704957733;
        }

        public final String toString() {
            return "OpenSidePanel";
        }
    }

    public static final class l implements rn30 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1862968151;
        }

        public final String toString() {
            return "PointerRotatedCompleted";
        }
    }

    public static final class m implements rn30 {
        public final boolean a;

        public m(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("ReBetClick(isOneTapBetCheck="), this.a, ')');
        }
    }

    public static final class n implements rn30 {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 645508317;
        }

        public final String toString() {
            return "SpineBetAnimationCompleted";
        }
    }

    public static final class o implements rn30 {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1934329627;
        }

        public final String toString() {
            return "SpineViewLoaded";
        }
    }

    public static final class p implements rn30 {
        public final nn30 a;

        public p(nn30 nn30Var) {
            nn30Var.getClass();
            this.a = nn30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && Intrinsics.g(this.a, ((p) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SwitchSidePanel(dialogState=" + this.a + ')';
        }
    }

    public static final class q implements rn30 {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -505490197;
        }

        public final String toString() {
            return "UpdateBalance";
        }
    }

    public static final class r implements rn30 {
        public final BigDecimal a;

        public r(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            BigDecimal bigDecimal = ((r) obj).a;
            BigDecimal bigDecimal2 = skd0.b;
            return Intrinsics.g(this.a, bigDecimal);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = skd0.b;
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateBetAmount(amount=" + ((Object) skd0.a(this.a)) + ')';
        }
    }

    public static final class s implements rn30 {
        public final GiftItem a;
        public final double b;

        public s(GiftItem giftItem, double d) {
            this.a = giftItem;
            this.b = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.a.equals(sVar.a) && Double.compare(this.b, sVar.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UseGift(item=");
            sb.append(this.a);
            sb.append(", amount=");
            return org0.a(sb, this.b, ')');
        }
    }
}
