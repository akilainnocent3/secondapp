package com.sportybet.android.instantwin.presentation.legends;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.gift.GiftUtil;
import defpackage.a5o;
import defpackage.b6c;
import defpackage.enc0;
import defpackage.fnc0;
import defpackage.hfc0;
import defpackage.pe4;
import defpackage.sk3;
import defpackage.tug;
import defpackage.tx5;
import defpackage.xh8;
import defpackage.zrd0;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    public interface a extends b {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$a$a, reason: collision with other inner class name */
        public static final class C0273a implements a {
            public static final C0273a a = new C0273a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0273a);
            }

            public final int hashCode() {
                return 449438765;
            }

            public final String toString() {
                return "DiscardBetslipAndChangeTeam";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$a$b, reason: collision with other inner class name */
        public static final class C0274b implements a {
            public static final C0274b a = new C0274b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0274b);
            }

            public final int hashCode() {
                return 526978974;
            }

            public final String toString() {
                return "DiscardUnsavedBetBuilder";
            }
        }

        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1175726848;
            }

            public final String toString() {
                return "DismissBetslipChangeTeamDialog";
            }
        }

        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 734511330;
            }

            public final String toString() {
                return "DismissCreateTicketErrorDialog";
            }
        }

        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1599025951;
            }

            public final String toString() {
                return "DismissGenericErrorDialog";
            }
        }

        public static final class f implements a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -437425034;
            }

            public final String toString() {
                return "DismissNoSelectionsDialog";
            }
        }

        public static final class g implements a {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 1281582397;
            }

            public final String toString() {
                return "DismissRemoveAllSelectionDialog";
            }
        }

        public static final class h implements a {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -586930463;
            }

            public final String toString() {
                return "DismissSportInactiveDialog";
            }
        }

        public static final class i implements a {
            public static final i a = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 1584805658;
            }

            public final String toString() {
                return "DismissUnsavedBetBuilderDialog";
            }
        }

        public static final class j implements a {
            public static final j a = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return 1407016804;
            }

            public final String toString() {
                return "HandleCreateTicketErrorDialogConfirm";
            }
        }

        public static final class k implements a {
            public static final k a = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -75287567;
            }

            public final String toString() {
                return "ShowNoSelectionsDialog";
            }
        }

        public static final class l implements a {
            public static final l a = new l();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return -2132384648;
            }

            public final String toString() {
                return "ShowRemoveAllSelectionDialog";
            }
        }

        public static final class m implements a {
            public static final m a = new m();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return 1235906156;
            }

            public final String toString() {
                return "StayInBetBuilder";
            }
        }

        public static final class n implements a {
            public static final n a = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return -1082183570;
            }

            public final String toString() {
                return "StayWithBetslip";
            }
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$b, reason: collision with other inner class name */
    public interface InterfaceC0275b extends b {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$b$a */
        public static final class a implements InterfaceC0275b {
            public final a5o a;

            public a(a5o a5oVar) {
                this.a = a5oVar;
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
                return "SendOddsFilterEvent(event=" + this.a + ")";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$b$b, reason: collision with other inner class name */
        public static final class C0276b implements InterfaceC0275b {
            public static final C0276b a = new C0276b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0276b);
            }

            public final int hashCode() {
                return -1570384538;
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
                return 2119307935;
            }

            public final String toString() {
                return "AddToBetslip";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$c$b, reason: collision with other inner class name */
        public static final class C0277b implements c {
            public static final C0277b a = new C0277b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0277b);
            }

            public final int hashCode() {
                return 2112407016;
            }

            public final String toString() {
                return "CollapseExpansion";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$c$c, reason: collision with other inner class name */
        public static final class C0278c implements c {
            public static final C0278c a = new C0278c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0278c);
            }

            public final int hashCode() {
                return 501735390;
            }

            public final String toString() {
                return "DismissTutorial";
            }
        }

        public static final class d implements c {
            public final int a;

            public d(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "RemoveSelection(index=", ")");
            }
        }

        public static final class e implements c {
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
                return b6c.a("SetMode(enabled=", ")", this.a);
            }
        }

        public static final class f implements c {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -816491163;
            }

            public final String toString() {
                return "ShowTutorial";
            }
        }

        public static final class g implements c {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -611158111;
            }

            public final String toString() {
                return "ToggleExpansion";
            }
        }
    }

    public interface d extends b {

        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2114770323;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$d$b, reason: collision with other inner class name */
        public static final class C0279b implements d {
            public static final C0279b a = new C0279b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0279b);
            }

            public final int hashCode() {
                return -208515249;
            }

            public final String toString() {
                return "Open";
            }
        }
    }

    public static final class e implements b {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1401028612;
        }

        public final String toString() {
            return "CheckDeviceSecurity";
        }
    }

    public static final class f implements b {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -43314398;
        }

        public final String toString() {
            return "CloseQuickBet";
        }
    }

    public interface g extends b {

        public static final class a implements g {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 158285308;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$g$b, reason: collision with other inner class name */
        public static final class C0280b implements g {
            public static final C0280b a = new C0280b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0280b);
            }

            public final int hashCode() {
                return -253143861;
            }

            public final String toString() {
                return "Show";
            }
        }
    }

    public static final class h implements b {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 534711580;
        }

        public final String toString() {
            return "DismissExploreMoreBottomSheet";
        }
    }

    public interface i extends b {

        public static final class a implements i {
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$i$b, reason: collision with other inner class name */
        public static final class C0281b implements i {
            public final String a;

            public C0281b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0281b) && this.a.equals(((C0281b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("ChangeCategoryTab(marketCategoryId=", this.a, ")");
            }
        }

        public static final class c implements i {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1005607926;
            }

            public final String toString() {
                return "HideGuideDialog";
            }
        }

        public static final class d implements i {
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
                return tug.a("ShowGuideDialog(marketType=", this.a, ")");
            }
        }

        public static final class e implements i {
            public final String a;
            public final String b;

            public e(String str, String str2) {
                this.a = str;
                this.b = str2;
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
                return tx5.a("UpdateExpansion(marketCategoryId=", this.a, ", marketType=", this.b, ")");
            }
        }

        public static final class f implements i {
            public final hfc0 a;

            public f(hfc0 hfc0Var) {
                this.a = hfc0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a.equals(((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "UpdateSelection(clickData=" + this.a + ")";
            }
        }
    }

    public interface j extends b {

        public static final class a implements j {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1587946959;
            }

            public final String toString() {
                return "GoBack";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$j$b, reason: collision with other inner class name */
        public static final class C0282b implements j {
            public static final C0282b a = new C0282b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0282b);
            }

            public final int hashCode() {
                return 1745032245;
            }

            public final String toString() {
                return "GoToBetHistoryPage";
            }
        }

        public static final class c implements j {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1090837968;
            }

            public final String toString() {
                return "GoToGiftPickerPage";
            }
        }

        public static final class d implements j {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1465671819;
            }

            public final String toString() {
                return "GoToLoginPage";
            }
        }

        public static final class e implements j {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -764994418;
            }

            public final String toString() {
                return "GoToVirtualLobby";
            }
        }
    }

    public static final class k implements b {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 354647204;
        }

        public final String toString() {
            return "PlaceBet";
        }
    }

    public static final class l implements b {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 390185887;
        }

        public final String toString() {
            return "RefreshSessionData";
        }
    }

    public static final class m implements b {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1950167639;
        }

        public final String toString() {
            return "RemoveAllSelection";
        }
    }

    public static final class n implements b {
        public final String a;

        public n(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a.equals(((n) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("RemoveSelection(outcomeId=", this.a, ")");
        }
    }

    public static final class o implements b {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1323712371;
        }

        public final String toString() {
            return "RequestExit";
        }
    }

    public static final class p implements b {
        public final sk3 a;

        public p(sk3 sk3Var) {
            this.a = sk3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.a == ((p) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectAnimationMode(animationMode=" + this.a + ")";
        }
    }

    public interface q extends b {

        public static final class a implements q {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -24185061;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$q$b, reason: collision with other inner class name */
        public static final class C0283b implements q {
            public final UiText a;

            public C0283b(UiText uiText) {
                uiText.getClass();
                this.a = uiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0283b) && Intrinsics.g(this.a, ((C0283b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return xh8.a(this.a, "Show(uiText=", ")");
            }
        }
    }

    public interface r extends b {

        public static final class a implements r {
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

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$r$b, reason: collision with other inner class name */
        public static final class C0284b implements r {
            public final zrd0 a;

            public C0284b(zrd0 zrd0Var) {
                this.a = zrd0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0284b) && this.a.equals(((C0284b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "DeleteStakeLastCharacter(stakeInputSingleType=" + this.a + ")";
            }
        }

        public static final class c implements r {
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

        public static final class d implements r {
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

        public static final class e implements r {
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

    public interface s extends b {

        public static final class a implements s {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 174031591;
            }

            public final String toString() {
                return "HideBetslipStakeKeyboard";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$s$b, reason: collision with other inner class name */
        public static final class C0285b implements s {
            public static final C0285b a = new C0285b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0285b);
            }

            public final int hashCode() {
                return 792110118;
            }

            public final String toString() {
                return "HideQuickBetStakeKeyboard";
            }
        }

        public static final class c implements s {
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

        public static final class d implements s {
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

    public static final class t implements b {
        public static final t a = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 533004273;
        }

        public final String toString() {
            return "StatsButtonClick";
        }
    }

    public interface u extends b {

        public static final class a implements u {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1306443910;
            }

            public final String toString() {
                return "ChangeTeam";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$u$b, reason: collision with other inner class name */
        public static final class C0286b implements u {
            public static final C0286b a = new C0286b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0286b);
            }

            public final int hashCode() {
                return -1977229904;
            }

            public final String toString() {
                return "LuckyPick";
            }
        }

        public static final class c implements u {
            public final enc0 a;

            public c(enc0 enc0Var) {
                this.a = enc0Var;
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
                return "RemoveSelectedTeam(team=" + this.a + ")";
            }
        }

        public static final class d implements u {
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
                return tug.a("SelectLeague(leagueCategoryId=", this.a, ")");
            }
        }

        public static final class e implements u {
            public final enc0 a;
            public final enc0 b;

            public e(enc0 enc0Var, enc0 enc0Var2) {
                this.a = enc0Var;
                this.b = enc0Var2;
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
                return "SelectRecommendedMatch(home=" + this.a + ", away=" + this.b + ")";
            }
        }

        public static final class f implements u {
            public final enc0 a;

            public f(enc0 enc0Var) {
                this.a = enc0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a.equals(((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SelectTeam(team=" + this.a + ")";
            }
        }

        public static final class g implements u {
            public final fnc0 a;

            public g(fnc0 fnc0Var) {
                this.a = fnc0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.a == ((g) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SelectTeamSlot(teamCard=" + this.a + ")";
            }
        }

        public static final class h implements u {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 468298874;
            }

            public final String toString() {
                return "ShowMatchupAnimation";
            }
        }
    }

    public interface v extends b {

        public static final class a implements v {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1432993597;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.b$v$b, reason: collision with other inner class name */
        public static final class C0287b implements v {
            public static final C0287b a = new C0287b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0287b);
            }

            public final int hashCode() {
                return 1433355593;
            }

            public final String toString() {
                return "Next";
            }
        }

        public static final class c implements v {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1433509845;
            }

            public final String toString() {
                return GiftUtil.CLEARED_GIFT_VALUE;
            }
        }
    }
}
