package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface yw2 {

    public static final class a implements yw2 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -773497210;
        }

        public final String toString() {
            return "AddBetAmount";
        }
    }

    public static final class b implements yw2 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 878237695;
        }

        public final String toString() {
            return "ClearGift";
        }
    }

    public static final class c implements yw2 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 184078778;
        }

        public final String toString() {
            return "ClickGift";
        }
    }

    public static final class d implements yw2 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1518878088;
        }

        public final String toString() {
            return "ClickGiftInfo";
        }
    }

    public static final class e implements yw2 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1687983582;
        }

        public final String toString() {
            return "Confirm";
        }
    }

    public static final class f implements yw2 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1509585429;
        }

        public final String toString() {
            return "DisableBetAmountInput";
        }
    }

    public static final class g implements yw2 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 374865492;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public static final class h implements yw2 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1434713790;
        }

        public final String toString() {
            return "EnableBetAmountInput";
        }
    }

    public static final class i implements yw2 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -2058887901;
        }

        public final String toString() {
            return "MaxBetAmount";
        }
    }

    public static final class j implements yw2 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1584461835;
        }

        public final String toString() {
            return "MinBetAmount";
        }
    }

    public static final class k implements yw2 {
        public final String a;

        public k(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.g(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j26.a(new StringBuilder("SelectBetAmount(amount="), this.a, ')');
        }
    }

    public static final class l implements yw2 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1325184119;
        }

        public final String toString() {
            return "SubtractBetAmount";
        }
    }

    public static final class m implements yw2 {
        public final ijf0 a;

        public m(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a.equals(((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateBetAmountField(amount=" + this.a + ')';
        }
    }

    public static final class n implements yw2 {
        public final GiftItem a;
        public final double b;

        public n(GiftItem giftItem, double d) {
            this.a = giftItem;
            this.b = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.a.equals(nVar.a) && Double.compare(this.b, nVar.b) == 0;
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
