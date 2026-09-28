package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import com.sportygames.newcms.uitext.CMSUiText;
import com.sportygames.newcms.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface nn30 {

    public static final class a implements nn30 {
        public final CMSUiText a;
        public final CMSUiText b;
        public final CMSUiText c;
        public final rn30 d;
        public final rn30 e;

        public a(CMSUiText cMSUiText, CMSUiText cMSUiText2, CMSUiText cMSUiText3, rn30 rn30Var, rn30 rn30Var2) {
            rn30Var.getClass();
            this.a = cMSUiText;
            this.b = cMSUiText2;
            this.c = cMSUiText3;
            this.d = rn30Var;
            this.e = rn30Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ButtonDialog(text=" + this.a + ", left=" + this.b + ", right=" + this.c + ", onLeftEvent=" + this.d + ", onRightEvent=" + this.e + ')';
        }
    }

    public static final class b implements nn30 {
        public final uf00<GiftItem> a;
        public final double b;
        public final double c;
        public final double d;

        public b(uf00<GiftItem> uf00Var, double d, double d2, double d3) {
            uf00Var.getClass();
            this.a = uf00Var;
            this.b = d;
            this.c = d2;
            this.d = d3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Double.compare(this.b, bVar.b) == 0 && Double.compare(this.c, bVar.c) == 0 && Double.compare(this.d, bVar.d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.d) + nrg0.a(nrg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftDialog(giftList=");
            sb.append(this.a);
            sb.append(", maxAmount=");
            sb.append(this.b);
            sb.append(", minAmount=");
            sb.append(this.c);
            sb.append(", betAmount=");
            return org0.a(sb, this.d, ')');
        }
    }

    public static final class c implements nn30 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1726878008;
        }

        public final String toString() {
            return "LoginDialog";
        }
    }

    public static final class d implements nn30 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 664461474;
        }

        public final String toString() {
            return "NoDialog";
        }
    }

    public static final class e implements nn30 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1542496014;
        }

        public final String toString() {
            return "NoMoneyDialog";
        }
    }

    public static final class f implements nn30 {
        public final UiText a;
        public final iwg b;
        public final boolean c;
        public final boolean d;

        public f(UiText uiText, iwg iwgVar, boolean z, boolean z2) {
            iwgVar.getClass();
            this.a = uiText;
            this.b = iwgVar;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d;
        }

        public final int hashCode() {
            UiText uiText = this.a;
            return Boolean.hashCode(this.d) + mtg0.a((this.b.hashCode() + ((uiText == null ? 0 : uiText.hashCode()) * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecommendationDialog(message=");
            sb.append(this.a);
            sb.append(", state=");
            sb.append(this.b);
            sb.append(", isShow=");
            sb.append(this.c);
            sb.append(", isLeaveOnly=");
            return ruw.a(sb, this.d, ')');
        }
    }

    public static final class g implements nn30 {
        public final UiText a;
        public final CMSUiText b;
        public final rn30 c;

        public g(UiText uiText, CMSUiText cMSUiText, rn30 rn30Var) {
            rn30Var.getClass();
            this.a = uiText;
            this.b = cMSUiText;
            this.c = rn30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b.equals(gVar.b) && Intrinsics.g(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "SingleButtonDialog(text=" + this.a + ", actionButton=" + this.b + ", onClinkEvent=" + this.c + ')';
        }
    }
}
