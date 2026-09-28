package defpackage;

import android.net.Uri;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface x53 {

    public static final class a implements x53 {
        public final Selection a;
        public final boolean b;

        public a(Selection selection, boolean z) {
            selection.getClass();
            this.a = selection;
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
            return "ChangeBetItemBankerChecked(selection=" + this.a + ", isChecked=" + this.b + ")";
        }
    }

    public static final class b implements x53 {
        public final Selection a;
        public final boolean b;

        public b(Selection selection, boolean z) {
            selection.getClass();
            this.a = selection;
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
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ChangeBetItemEarlyGoalsStatus(selection=" + this.a + ", isChecked=" + this.b + ")";
        }
    }

    public static final class c implements x53 {
        public final Selection a;
        public final boolean b;

        public c(Selection selection, boolean z) {
            selection.getClass();
            this.a = selection;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ChangeBetItemNeverDownStatus(selection=" + this.a + ", toActivated=" + this.b + ")";
        }
    }

    public static final class d implements x53 {
        public final Selection a;
        public final zuy b;
        public final huy c;
        public final avy d;
        public final avy e;

        public d(Selection selection, zuy zuyVar, huy huyVar, avy avyVar, avy avyVar2) {
            selection.getClass();
            this.a = selection;
            this.b = zuyVar;
            this.c = huyVar;
            this.d = avyVar;
            this.e = avyVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ChangeBetItemOneTwoUpStatus(selection=" + this.a + ", state=" + this.b + ", case=" + this.c + ", toStatus=" + this.d + ", fromStatus=" + this.e + ")";
        }
    }

    public static final class e implements x53 {
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "DeleteBetItem(selectionIndex=", ")");
        }
    }

    public static final class f implements x53 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -194072331;
        }

        public final String toString() {
            return "DismissSingleFooterKeyboard";
        }
    }

    public static final class g implements x53 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "DismissSystemFooterKeyboard(verify=false)";
        }
    }

    public static final class h implements x53 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -232282148;
        }

        public final String toString() {
            return "GoToDeposit";
        }
    }

    public static final class i implements x53 {
        public final Uri a;

        public i(Uri uri) {
            uri.getClass();
            this.a = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LaunchDeepLinkUri(uri=" + this.a + ")";
        }
    }

    public static final class j implements x53 {
        public final Selection a;

        public j(Selection selection) {
            selection.getClass();
            this.a = selection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.g(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LaunchEventDetailPage(selection=" + this.a + ")";
        }
    }

    public static final class l implements x53 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1540844097;
        }

        public final String toString() {
            return "RefreshSingleFooter";
        }
    }

    public static final class m implements x53 {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 258357862;
        }

        public final String toString() {
            return "RefreshSystemFooter";
        }
    }

    public static final class n implements x53 {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 553159079;
        }

        public final String toString() {
            return "ReloadBetSlipItems";
        }
    }

    public static final class o implements x53 {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1074970117;
        }

        public final String toString() {
            return "RemoveAllSelections";
        }
    }

    public static final class p implements x53 {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -292670456;
        }

        public final String toString() {
            return "ShowNeverDownInfoDialog";
        }
    }

    public static final class q implements x53 {
        public final BigDecimal a;

        public q(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
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
            return "TotalBonusAmountPreparedForPlaceBet(totalBonusAmount=" + this.a + ")";
        }
    }

    public static final class r implements x53 {
        public final int a;

        public r(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a == ((r) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "UndoEditBet(selectionIndex=", ")");
        }
    }

    public static final class s implements x53 {
        public static final s a = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -1568215623;
        }

        public final String toString() {
            return "UpdateBetSlipWindow";
        }
    }

    public static final class k implements x53 {
        public final boolean a;
        public final String b;
        public final List<MultiMakerItem> c;

        public k(String str, ArrayList arrayList, boolean z) {
            this.a = z;
            this.b = str;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a == kVar.a && Intrinsics.g(this.b, kVar.b) && Intrinsics.g(this.c, kVar.c);
        }

        public final int hashCode() {
            int iA = mtg0.a(Boolean.hashCode(this.a) * 31, 923521, false);
            String str = this.b;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 961;
            List<MultiMakerItem> list = this.c;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return ng1.a(t160.a("LaunchMultiMaker(isRejectedByBookingCodeLiability=", ", isFromCodeHubEdit=false, codeSource=null, multiMakerAction=null, codeProvider=null, loadingShareCode=", this.b, ", loadingAliasCode=null, multiMakerItems=", this.a), this.c, ")");
        }

        public k() {
            this(null, null, false);
        }
    }
}
