package defpackage;

import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import com.sportygames.newcms.uitext.CMSUiText;
import com.sportygames.newcms.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface rc60 {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements rc60 {
        public final CMSUiText a;
        public final CMSUiText b;
        public final CMSUiText c;
        public final vc60 d;
        public final vc60 e;

        public a(CMSUiText cMSUiText, CMSUiText cMSUiText2, CMSUiText cMSUiText3, vc60 vc60Var, vc60 vc60Var2) {
            vc60Var.getClass();
            this.a = cMSUiText;
            this.b = cMSUiText2;
            this.c = cMSUiText3;
            this.d = vc60Var;
            this.e = vc60Var2;
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
            return "ButtonDialog(text=" + this.a + rarBonoqWB.WIzJ + this.b + ", right=" + this.c + ", onLeftEvent=" + this.d + ", onRightEvent=" + this.e + ')';
        }
    }

    public static final class b implements rc60 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1652786713;
        }

        public final String toString() {
            return "LoginDialog";
        }
    }

    public static final class c implements rc60 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 196050785;
        }

        public final String toString() {
            return "NoDialog";
        }
    }

    public static final class d implements rc60 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -939761745;
        }

        public final String toString() {
            return "NoMoneyDialog";
        }
    }

    public static final class e implements rc60 {
        public final UiText a;
        public final iwg b;
        public final boolean c;
        public final boolean d;

        public e(UiText uiText, iwg iwgVar, boolean z, boolean z2) {
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d;
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

    public static final class f implements rc60 {
        public final UiText a;
        public final CMSUiText b;
        public final vc60 c;

        public f(UiText uiText, CMSUiText cMSUiText, vc60 vc60Var) {
            vc60Var.getClass();
            this.a = uiText;
            this.b = cMSUiText;
            this.c = vc60Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b.equals(fVar.b) && Intrinsics.g(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "SingleButtonDialog(text=" + this.a + ", actionButton=" + this.b + ", onClinkEvent=" + this.c + ')';
        }
    }
}
