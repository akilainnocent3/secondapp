package com.sportybet.android.instantwin.presentation.scheduledfootball;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import defpackage.bz3;
import defpackage.gmf0;
import defpackage.n36;
import defpackage.tug;
import defpackage.tx5;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.ve70;
import defpackage.zrd0;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    public interface a extends b {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$a$a, reason: collision with other inner class name */
        public static final class C0320a implements a {
            public static final C0320a a = new C0320a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0320a);
            }

            public final int hashCode() {
                return 2089110773;
            }

            public final String toString() {
                return "DismissCreateTicketErrorDialog";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$a$b, reason: collision with other inner class name */
        public static final class C0321b implements a {
            public static final C0321b a = new C0321b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0321b);
            }

            public final int hashCode() {
                return -1753784189;
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
                return 324492170;
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
                return 1555608692;
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
                return 945312055;
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
                return 350978820;
            }

            public final String toString() {
                return "ShowNoSelectionsDialog";
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class g implements a {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -441591477;
            }

            public final String toString() {
                return siPCzPFw.keSFzMjZQw;
            }
        }
    }

    public static final class a0 implements b {
        public final String a;

        public a0(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && this.a.equals(((a0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ToggleKickoffMatchdayExpansion(matchdayId=", this.a, ")");
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$b, reason: collision with other inner class name */
    public interface InterfaceC0322b extends b {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$b$a */
        public static final class a implements InterfaceC0322b {
            public final int a;
            public final int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return n36.a("SendAnimationErrorEvent(totalFileCount=", this.a, this.b, ", errorFileCount=", ")");
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$b$b, reason: collision with other inner class name */
        public static final class C0323b implements InterfaceC0322b {
            public static final C0323b a = new C0323b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0323b);
            }

            public final int hashCode() {
                return -947928183;
            }

            public final String toString() {
                return "SendBetslipAcceptChangeClickEventFromBetslip";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$b$c */
        public static final class c implements InterfaceC0322b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2036741164;
            }

            public final String toString() {
                return "SendBetslipAcceptChangeClickEventFromQuickBet";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$b$d */
        public static final class d implements InterfaceC0322b {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 573733146;
            }

            public final String toString() {
                return "SendEventListViewEvent";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$b$e */
        public static final class e implements InterfaceC0322b {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1907150137;
            }

            public final String toString() {
                return "SendPlaceBetClickEvent";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$b$f */
        public static final class f implements InterfaceC0322b {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -125842910;
            }

            public final String toString() {
                return "SendSocketErrorEvent";
            }
        }
    }

    public static final class b0 implements b {
        public final String a;

        public b0(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && this.a.equals(((b0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ToggleUpcomingMatchdayExpansion(matchdayId=", this.a, ")");
        }
    }

    public interface c extends b {

        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -513854368;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$c$b, reason: collision with other inner class name */
        public static final class C0324b implements c {
            public static final C0324b a = new C0324b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0324b);
            }

            public final int hashCode() {
                return -431856926;
            }

            public final String toString() {
                return "Open";
            }
        }
    }

    public interface c0 extends b {

        public static final class a implements c0 {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1491371524;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$c0$b, reason: collision with other inner class name */
        public static final class C0325b implements c0 {
            public final String a;
            public final String b;

            public C0325b(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0325b)) {
                    return false;
                }
                C0325b c0325b = (C0325b) obj;
                return this.a.equals(c0325b.a) && this.b.equals(c0325b.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("Visible(matchdayId=", this.a, ", marketType=", this.b, ")");
            }
        }
    }

    public static final class d implements b {
        public final bz3 a;

        public d(bz3 bz3Var) {
            this.a = bz3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeBetslipTab(betslipType=" + this.a + ")";
        }
    }

    public static final class d0 implements b {
        public final String a;
        public final String b;
        public final String c;

        public d0(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return this.a.equals(d0Var.a) && this.b.equals(d0Var.b) && this.c.equals(d0Var.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return uf80.a(ux5.a("UpdateSelectedSelection(matchdayId=", this.a, ", eventId=", this.b, ", outcomeId="), this.c, ")");
        }
    }

    public static final class e implements b {
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
            return tx5.a("ChangeEventScoreSelection(matchdayId=", this.a, ", eventId=", this.b, ")");
        }
    }

    public static final class f implements b {
        public final String a;

        public f(String str) {
            this.a = str;
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
            return tug.a("ChangeLeagueTab(leagueId=", this.a, ")");
        }
    }

    public static final class g implements b {
        public final String a;
        public final String b;

        public g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b.equals(gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("ChangeMarketTab(matchdayId=", this.a, ", marketType=", this.b, ")");
        }
    }

    public static final class h implements b {
        public final String a;
        public final String b;
        public final String c;

        public h(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && this.b.equals(hVar.b) && this.c.equals(hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return uf80.a(ux5.a("ChangeSpecifierType(eventId=", this.a, ", marketType=", this.b, ", specifierType="), this.c, ")");
        }
    }

    public static final class i implements b {
        public final String a;
        public final String b;
        public final String c;

        public i(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return uf80.a(ux5.a("ChangeUniversalSpecifierType(matchdayId=", this.a, ", marketType=", this.b, ", universalSpecifierType="), this.c, ")");
        }
    }

    public static final class j implements b {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 54906193;
        }

        public final String toString() {
            return "CheckDeviceSecurity";
        }
    }

    public static final class k implements b {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 171056687;
        }

        public final String toString() {
            return "CloseQuickBet";
        }
    }

    public interface l extends b {

        public static final class a implements l {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -699367479;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$l$b, reason: collision with other inner class name */
        public static final class C0326b implements l {
            public static final C0326b a = new C0326b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0326b);
            }

            public final int hashCode() {
                return -1775030754;
            }

            public final String toString() {
                return "Show";
            }
        }
    }

    public static final class m implements b {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -437028380;
        }

        public final String toString() {
            return "DismissTicketCreatedSnackbar";
        }
    }

    public static final class n implements b {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 376621435;
        }

        public final String toString() {
            return "DismissWinningDialog";
        }
    }

    public interface o extends b {

        public static final class a implements o {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 597475713;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$o$b, reason: collision with other inner class name */
        public static final class C0327b implements o {
            public final String a;

            public C0327b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0327b) && this.a.equals(((C0327b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("CloseIfNeeded(matchdayId=", this.a, ")");
            }
        }

        public static final class c implements o {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1266520650;
            }

            public final String toString() {
                return "Next";
            }
        }

        public static final class d implements o {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1312014642;
            }

            public final String toString() {
                return "Previous";
            }
        }

        public static final class e implements o {
            public final String a;

            public e(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a.equals(((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("ReloadData(eventId=", this.a, ")");
            }
        }

        public static final class f implements o {
            public final String a;
            public final String b;

            public f(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.a.equals(fVar.a) && this.b.equals(fVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("ToggleVisibility(eventId=", this.a, ", marketType=", this.b, ")");
            }
        }
    }

    public interface p extends b {

        public static final class a implements p {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1738727927;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$p$b, reason: collision with other inner class name */
        public static final class C0328b implements p {
            public final String a;

            public C0328b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0328b) && this.a.equals(((C0328b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("Visible(marketType=", this.a, ")");
            }
        }
    }

    public interface q extends b {

        public static final class a implements q {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1269228124;
            }

            public final String toString() {
                return "GoBack";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$q$b, reason: collision with other inner class name */
        public static final class C0329b implements q {
            public static final C0329b a = new C0329b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0329b);
            }

            public final int hashCode() {
                return 1811178818;
            }

            public final String toString() {
                return "GoToBetHistoryPage";
            }
        }

        public static final class c implements q {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1156984541;
            }

            public final String toString() {
                return "GoToGiftPickerPage";
            }
        }

        public static final class d implements q {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1348658616;
            }

            public final String toString() {
                return "GoToLoginPage";
            }
        }

        public static final class e implements q {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1590784661;
            }

            public final String toString() {
                return "GoToOpenBetsPage";
            }
        }

        public static final class f implements q {
            public final String a;

            public f(String str) {
                this.a = str;
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
                return tug.a("GoToTicketDetailPage(ticketId=", this.a, ")");
            }
        }
    }

    public interface r extends b {

        public static final class a implements r {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1285809603;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$r$b, reason: collision with other inner class name */
        public static final class C0330b implements r {
            public final ve70 a;

            public C0330b(ve70 ve70Var) {
                this.a = ve70Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0330b) && this.a == ((C0330b) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ReloadData(overviewStatsType=" + this.a + ")";
            }
        }

        public static final class c implements r {
            public final ve70 a;

            public c(ve70 ve70Var) {
                this.a = ve70Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "UpdateSelectedOverviewStatsType(overviewStatsType=" + this.a + ")";
            }
        }

        public static final class d implements r {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1651243457;
            }

            public final String toString() {
                return "Visible";
            }
        }
    }

    public static final class s implements b {
        public static final s a = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 2132475255;
        }

        public final String toString() {
            return "PlaceBet";
        }
    }

    public static final class t implements b {
        public final String a;

        public t(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a.equals(((t) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ReloadEventResults(matchdayId=", this.a, ")");
        }
    }

    public static final class u implements b {
        public static final u a = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 676613946;
        }

        public final String toString() {
            return "ReloadSessionData";
        }
    }

    public interface v extends b {

        public static final class a implements v {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1459825262;
            }

            public final String toString() {
                return "All";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$v$b, reason: collision with other inner class name */
        public static final class C0331b implements v {
            public static final C0331b a = new C0331b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0331b);
            }

            public final int hashCode() {
                return 1542007154;
            }

            public final String toString() {
                return "Expired";
            }
        }

        public static final class c implements v {
            public final String a;

            public c(String str) {
                this.a = str;
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
                return tug.a("Single(outcomeId=", this.a, ")");
            }
        }
    }

    public static final class w implements b {
        public static final w a = new w();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return -633918616;
        }

        public final String toString() {
            return "ReportDefaultDisplayCampaignConversion";
        }
    }

    public interface x extends b {

        public static final class a implements x {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -97005385;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$x$b, reason: collision with other inner class name */
        public static final class C0332b implements x {
            public final String a;
            public final String b;

            public C0332b(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0332b)) {
                    return false;
                }
                C0332b c0332b = (C0332b) obj;
                return this.a.equals(c0332b.a) && this.b.equals(c0332b.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("Visible(eventId=", this.a, ", marketType=", this.b, ")");
            }
        }
    }

    public interface y extends b {

        public static final class a implements y {
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

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$y$b, reason: collision with other inner class name */
        public static final class C0333b implements y {
            public final zrd0 a;

            public C0333b(zrd0 zrd0Var) {
                this.a = zrd0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0333b) && this.a.equals(((C0333b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "DeleteStakeLastCharacter(stakeInputSingleType=" + this.a + ")";
            }
        }

        public static final class c implements y {
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

        public static final class d implements y {
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

        public static final class e implements y {
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

    public interface z extends b {

        public static final class a implements z {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -287673158;
            }

            public final String toString() {
                return "HideBetslipStakeKeyboard";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.b$z$b, reason: collision with other inner class name */
        public static final class C0334b implements z {
            public static final C0334b a = new C0334b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0334b);
            }

            public final int hashCode() {
                return -635835213;
            }

            public final String toString() {
                return "HideQuickBetStakeKeyboard";
            }
        }

        public static final class c implements z {
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

        public static final class d implements z {
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
}
