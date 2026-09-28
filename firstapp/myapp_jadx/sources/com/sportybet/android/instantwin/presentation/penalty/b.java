package com.sportybet.android.instantwin.presentation.penalty;

import defpackage.ht7;
import defpackage.tug;
import defpackage.tx5;
import defpackage.zrd0;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    public interface a extends b {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$a$a, reason: collision with other inner class name */
        public static final class C0292a implements a {
            public static final C0292a a = new C0292a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0292a);
            }

            public final int hashCode() {
                return 1200550748;
            }

            public final String toString() {
                return "DismissCreateTicketErrorDialog";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$a$b, reason: collision with other inner class name */
        public static final class C0293b implements a {
            public static final C0293b a = new C0293b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0293b);
            }

            public final int hashCode() {
                return -591718980;
            }

            public final String toString() {
                return "DismissNoSelectionsDialog";
            }
        }

        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1451064829;
            }

            public final String toString() {
                return "DismissRemoveAllSelectionDialog";
            }
        }

        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1075075493;
            }

            public final String toString() {
                return "DismissSportInactiveDialog";
            }
        }

        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1806650974;
            }

            public final String toString() {
                return "HandleCreateTicketErrorDialogConfirm";
            }
        }

        public static final class f implements a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1279688597;
            }

            public final String toString() {
                return "ShowNoSelectionsDialog";
            }
        }

        public static final class g implements a {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 1206644082;
            }

            public final String toString() {
                return "ShowRemoveAllSelectionDialog";
            }
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$b, reason: collision with other inner class name */
    public interface InterfaceC0294b extends b {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$b$a */
        public static final class a implements InterfaceC0294b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1429390087;
            }

            public final String toString() {
                return "SendEventListNextRoundClickEvent";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$b$b, reason: collision with other inner class name */
        public static final class C0295b implements InterfaceC0294b {
            public static final C0295b a = new C0295b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0295b);
            }

            public final int hashCode() {
                return 1532929089;
            }

            public final String toString() {
                return "SendEventListViewEvent";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$b$c */
        public static final class c implements InterfaceC0294b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1428621216;
            }

            public final String toString() {
                return "SendPlaceBetClickEvent";
            }
        }
    }

    public interface c extends b {

        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -141979303;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$c$b, reason: collision with other inner class name */
        public static final class C0296b implements c {
            public static final C0296b a = new C0296b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0296b);
            }

            public final int hashCode() {
                return 827065033;
            }

            public final String toString() {
                return "Open";
            }
        }
    }

    public static final class d implements b {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ChangeMarketCategoryTab(marketCategoryId=", this.a, ")");
        }
    }

    public static final class e implements b {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1069958340;
        }

        public final String toString() {
            return "ChangeToNextRound";
        }
    }

    public static final class f implements b {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1081110838;
        }

        public final String toString() {
            return "CheckDeviceSecurity";
        }
    }

    public static final class g implements b {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1419465112;
        }

        public final String toString() {
            return "CloseQuickBet";
        }
    }

    public interface h extends b {

        public static final class a implements h {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -252783678;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$h$b, reason: collision with other inner class name */
        public static final class C0297b implements h {
            public static final C0297b a = new C0297b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0297b);
            }

            public final int hashCode() {
                return 1896416453;
            }

            public final String toString() {
                return "Show";
            }
        }
    }

    public static final class i implements b {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1548395422;
        }

        public final String toString() {
            return "DismissExploreMoreBottomSheet";
        }
    }

    public static final class j implements b {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -722118318;
        }

        public final String toString() {
            return "HideMarketGuideDialog";
        }
    }

    public interface k extends b {

        public static final class a implements k {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -197874155;
            }

            public final String toString() {
                return "GoBack";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$k$b, reason: collision with other inner class name */
        public static final class C0298b implements k {
            public static final C0298b a = new C0298b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0298b);
            }

            public final int hashCode() {
                return -338074757;
            }

            public final String toString() {
                return "GoToBetHistoryPage";
            }
        }

        public static final class c implements k {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -992269034;
            }

            public final String toString() {
                return "GoToGiftPickerPage";
            }
        }

        public static final class d implements k {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1589533807;
            }

            public final String toString() {
                return "GoToLoginPage";
            }
        }

        public static final class e implements k {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1079133900;
            }

            public final String toString() {
                return "GotoVirtualLobby";
            }
        }
    }

    public interface l extends b {

        public static final class a implements l {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1565062030;
            }

            public final String toString() {
                return "CloseOddsFilterPanel";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$l$b, reason: collision with other inner class name */
        public static final class C0299b implements l {
            public static final C0299b a = new C0299b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0299b);
            }

            public final int hashCode() {
                return 2778944;
            }

            public final String toString() {
                return "OpenOddsFilterPanel";
            }
        }

        public static final class c implements l {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 922550801;
            }

            public final String toString() {
                return "Reset";
            }
        }

        public static final class d implements l {
            public final String a;
            public final ht7<Float> b;

            public d(String str, ht7<Float> ht7Var) {
                this.a = str;
                this.b = ht7Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a.equals(dVar.a) && this.b.equals(dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "UpdateSelectedOption(optionId=" + this.a + ", range=" + this.b + ")";
            }
        }
    }

    public static final class m implements b {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -751080034;
        }

        public final String toString() {
            return "PlaceBet";
        }
    }

    public static final class n implements b {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 864306201;
        }

        public final String toString() {
            return "RefreshSessionData";
        }
    }

    public static final class o implements b {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1476047325;
        }

        public final String toString() {
            return "RemoveAllSelection";
        }
    }

    public static final class p implements b {
        public final String a;

        public p(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.a.equals(((p) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("RemoveSelection(outcomeId=", this.a, ")");
        }
    }

    public static final class q implements b {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1292241863;
        }

        public final String toString() {
            return "RequestExit";
        }
    }

    public static final class r implements b {
        public final String a;

        public r(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a.equals(((r) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ShowMarketGuideDialog(marketType=", this.a, ")");
        }
    }

    public interface s extends b {

        public static final class a implements s {
            public final zrd0 a;

            public a(zrd0 zrd0Var) {
                this.a = zrd0Var;
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
                return "ClearStake(stakeInputSingleType=" + this.a + ")";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$s$b, reason: collision with other inner class name */
        public static final class C0300b implements s {
            public final zrd0 a;

            public C0300b(zrd0 zrd0Var) {
                this.a = zrd0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0300b) && this.a.equals(((C0300b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "DeleteStakeLastCharacter(stakeInputSingleType=" + this.a + ")";
            }
        }

        public static final class c implements s {
            public final zrd0 a;
            public final boolean b;

            public c(zrd0 zrd0Var, boolean z) {
                this.a = zrd0Var;
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
                return this.a.equals(cVar.a) && this.b == cVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "UpdateDefaultStakeIfNeeded(stakeInputSingleType=" + this.a + ", setAsDefault=" + this.b + ")";
            }
        }

        public static final class d implements s {
            public final zrd0 a;
            public final BigDecimal b;

            public d(zrd0 zrd0Var, BigDecimal bigDecimal) {
                this.a = zrd0Var;
                this.b = bigDecimal;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a.equals(dVar.a) && this.b.equals(dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "UpdateStakeWithQuickStake(stakeInputSingleType=" + this.a + ", quickStake=" + this.b + ")";
            }
        }

        public static final class e implements s {
            public final zrd0 a;
            public final String b;

            public e(zrd0 zrd0Var, String str) {
                this.a = zrd0Var;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.a.equals(eVar.a) && this.b.equals(eVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "UpdateStakeWithStakeKeyboardKeyInput(stakeInputSingleType=" + this.a + ", key=" + this.b + ")";
            }
        }
    }

    public interface t extends b {

        public static final class a implements t {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 573665761;
            }

            public final String toString() {
                return "HideBetslipStakeKeyboard";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.b$t$b, reason: collision with other inner class name */
        public static final class C0301b implements t {
            public static final C0301b a = new C0301b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0301b);
            }

            public final int hashCode() {
                return 295867500;
            }

            public final String toString() {
                return "HideQuickBetStakeKeyboard";
            }
        }

        public static final class c implements t {
            public final zrd0 a;

            public c(zrd0 zrd0Var) {
                this.a = zrd0Var;
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
                return "ShowBetslipStakeKeyboard(stakeInputSingleType=" + this.a + ")";
            }
        }

        public static final class d implements t {
            public final zrd0 a;

            public d(zrd0 zrd0Var) {
                this.a = zrd0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a.equals(((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ShowQuickBetStakeKeyboard(stakeInputSingleType=" + this.a + ")";
            }
        }
    }

    public static final class u implements b {
        public final String a;
        public final String b;

        public u(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.a.equals(uVar.a) && this.b.equals(uVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("UpdateMarketContentExpansion(marketCategoryId=", this.a, ", marketType=", this.b, ")");
        }
    }

    public static final class v implements b {
        public final String a;
        public final String b;

        public v(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.a.equals(vVar.a) && this.b.equals(vVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("UpdateMarketExpansion(marketCategoryId=", this.a, ", marketType=", this.b, ")");
        }
    }

    public static final class w implements b {
        public final String a;
        public final String b;

        public w(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.a.equals(wVar.a) && this.b.equals(wVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("UpdateSelectedSelection(marketType=", this.a, ", outcomeId=", this.b, ")");
        }
    }

    public static final class x implements b {
        public static final x a = new x();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return -2117564283;
        }

        public final String toString() {
            return "UpdateStatsDescriptionExpansion";
        }
    }

    public static final class y implements b {
        public static final y a = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 1895256477;
        }

        public final String toString() {
            return "UpdateStatsExpansion";
        }
    }
}
