package defpackage;

import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import com.sportygames.common.ui.model.GiftItem;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface z8x {

    public static final class a implements z8x {
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

    public static final class b implements z8x {
        public final fbx a;
        public final boolean b;

        public b(fbx fbxVar, boolean z) {
            fbxVar.getClass();
            this.a = fbxVar;
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

    public static final class c implements z8x {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1187209138;
        }

        public final String toString() {
            return "ClearGift";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class d implements z8x {
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
            return ruw.a(new StringBuilder(tYcQsJyaojE.QKjPfZZbl), this.a, ')');
        }
    }

    public static final class e implements z8x {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1543599239;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public static final class f implements z8x {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1209020837;
        }

        public final String toString() {
            return "LoginSuccess";
        }
    }

    public static final class g implements z8x {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -491686140;
        }

        public final String toString() {
            return "NavBackPress";
        }
    }

    public static final class h implements z8x {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1523443080;
        }

        public final String toString() {
            return "NextRoundClick";
        }
    }

    public static final class i implements z8x {
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

    public static final class j implements z8x {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1324452083;
        }

        public final String toString() {
            return "OpenGiftDialog";
        }
    }

    public static final class k implements z8x {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -234172456;
        }

        public final String toString() {
            return "OpenSidePanel";
        }
    }

    public static final class l implements z8x {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -2025068524;
        }

        public final String toString() {
            return "PointerRotatedCompleted";
        }
    }

    public static final class m implements z8x {
        public final boolean a = true;

        public m(int i) {
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

    public static final class n implements z8x {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1177038080;
        }

        public final String toString() {
            return "SpineBetAnimationCompleted";
        }
    }

    public static final class o implements z8x {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1856373549;
        }

        public final String toString() {
            return "SpineNewRoundAnimationCompleted";
        }
    }

    public static final class p implements z8x {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -481244510;
        }

        public final String toString() {
            return "SpineViewLoaded";
        }
    }

    public static final class q implements z8x {
        public final v8x a;

        public q(v8x v8xVar) {
            v8xVar.getClass();
            this.a = v8xVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.g(this.a, ((q) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SwitchSidePanel(dialogState=" + this.a + ')';
        }
    }

    public static final class r implements z8x {
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

    public static final class s implements z8x {
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
