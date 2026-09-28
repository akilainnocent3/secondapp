package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface bri0 {

    public static final class a implements bri0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -973015120;
        }

        public final String toString() {
            return "AddBetAmount";
        }
    }

    public static final class a0 implements bri0 {
        public final float a;

        public a0(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && Float.compare(this.a, ((a0) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h70.a(new StringBuilder("SpinComplete(angle="), this.a, ')');
        }
    }

    public static final class b implements bri0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 247619255;
        }

        public final String toString() {
            return "AddBetCount";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b0 implements bri0 {
        public final kui0 a;

        public b0(kui0 kui0Var) {
            kui0Var.getClass();
            this.a = kui0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && Intrinsics.g(this.a, ((b0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SwitchSidePanelScreen(page=" + this.a + ')';
        }
    }

    public static final class c implements bri0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1193576696;
        }

        public final String toString() {
            return "AddRisk";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c0 implements bri0 {
        public final ijf0 a;

        public c0(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && this.a.equals(((c0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateBetAmount(amount=" + this.a + ')';
        }
    }

    public static final class d implements bri0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 952958042;
        }

        public final String toString() {
            return "AddSegment";
        }
    }

    public static final class d0 implements bri0 {
        public final ijf0 a;

        public d0(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && this.a.equals(((d0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateBetCount(count=" + this.a + ')';
        }
    }

    public static final class e implements bri0 {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("BetClick(isOneTapBetCheck="), this.a, ')');
        }
    }

    public static final class e0 implements bri0 {
        public final GiftItem a;
        public final double b;

        public e0(GiftItem giftItem, double d) {
            this.a = giftItem;
            this.b = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) obj;
            return this.a.equals(e0Var.a) && Double.compare(this.b, e0Var.b) == 0;
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

    public static final class f implements bri0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1504321771;
        }

        public final String toString() {
            return "ClearGift";
        }
    }

    public static final class g implements bri0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 373117249;
        }

        public final String toString() {
            return "ClickTurboMode";
        }
    }

    public static final class h implements bri0 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -871757480;
        }

        public final String toString() {
            return "CloseDialog";
        }
    }

    public static final class i implements bri0 {
        public final boolean a;

        public /* synthetic */ i(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.a == ((i) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return "CloseGame(showRecommendDialog=" + this.a + ')';
        }
    }

    public static final class j implements bri0 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 2098410152;
        }

        public final String toString() {
            return "CloseGiftDialog";
        }
    }

    public static final class k implements bri0 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 2087442051;
        }

        public final String toString() {
            return "CorrectionBetAmount";
        }
    }

    public static final class l implements bri0 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 484891012;
        }

        public final String toString() {
            return "CorrectionBetCount";
        }
    }

    public static final class m implements bri0 {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 556159842;
        }

        public final String toString() {
            return "LoginSuccess";
        }
    }

    public static final class n implements bri0 {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 2036561485;
        }

        public final String toString() {
            return "MaxBetAmount";
        }
    }

    public static final class o implements bri0 {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1040770950;
        }

        public final String toString() {
            return "MaxBetCount";
        }
    }

    public static final class p implements bri0 {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1783979745;
        }

        public final String toString() {
            return "MinBetAmount";
        }
    }

    public static final class q implements bri0 {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1718203544;
        }

        public final String toString() {
            return "MinBetCount";
        }
    }

    public static final class r implements bri0 {
        public static final r a = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -1530675519;
        }

        public final String toString() {
            return "MinusBetAmount";
        }
    }

    public static final class s implements bri0 {
        public static final s a = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 368177542;
        }

        public final String toString() {
            return "MinusBetCount";
        }
    }

    public static final class t implements bri0 {
        public static final t a = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 933939543;
        }

        public final String toString() {
            return "MinusRisk";
        }
    }

    public static final class u implements bri0 {
        public static final u a = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 956847019;
        }

        public final String toString() {
            return "MinusSegment";
        }
    }

    public static final class v implements bri0 {
        public final int a;

        public v(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.a == ((v) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("MultiplierClick(id="), this.a, ')');
        }
    }

    public static final class w implements bri0 {
        public static final w a = new w();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return 1830884218;
        }

        public final String toString() {
            return "MultiplierHintDismiss";
        }
    }

    public static final class x implements bri0 {
        public final boolean a;

        public x(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.a == ((x) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("OnTabBetConfigChange(value="), this.a, ')');
        }
    }

    public static final class y implements bri0 {
        public static final y a = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -1658643062;
        }

        public final String toString() {
            return "OpenGiftDialog";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z implements bri0 {
        public final nui0 a;

        public z(nui0 nui0Var) {
            this.a = nui0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && this.a == ((z) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectSpinMode(mode=" + this.a + ')';
        }
    }
}
