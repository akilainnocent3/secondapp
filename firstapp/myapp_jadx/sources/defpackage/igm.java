package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface igm {

    public static final class a implements igm {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1821033198;
        }

        public final String toString() {
            return "BackToCurrentTier";
        }
    }

    public static final class b implements igm {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1200774050;
        }

        public final String toString() {
            return "BetslipCustomizationScrollConsumed";
        }
    }

    public static final class c implements igm {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 203464407;
        }

        public final String toString() {
            return "BetslipMissionScrollConsumed";
        }
    }

    public interface d extends igm {

        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2091910634;
            }

            public final String toString() {
                return "AcknowledgeTooltip";
            }
        }

        public static final class b implements d {
            public final long a;

            public b(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return d020.a(this.a, "Apply(themeId=", ")");
            }
        }

        public static final class c implements d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2075955317;
            }

            public final String toString() {
                return "ConfirmUnlock";
            }
        }

        /* JADX INFO: renamed from: igm$d$d, reason: collision with other inner class name */
        public static final class C0678d implements d {
            public static final C0678d a = new C0678d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0678d);
            }

            public final int hashCode() {
                return 1773609885;
            }

            public final String toString() {
                return "CustomizeBetslip";
            }
        }

        public static final class e implements d {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -642533075;
            }

            public final String toString() {
                return "DismissError";
            }
        }

        public static final class f implements d {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -635195424;
            }

            public final String toString() {
                return "DismissUnlockSheet";
            }
        }

        public static final class g implements d {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 1003585944;
            }

            public final String toString() {
                return "LearnMoreFromMission";
            }
        }

        public static final class h implements d {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -116095399;
            }

            public final String toString() {
                return "StartMission";
            }
        }

        public static final class i implements d {
            public final String a;

            public i(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.a.equals(((i) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("ToggleCategoryCollapse(title=", this.a, ")");
            }
        }

        public static final class j implements d {
            public static final j a = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -327599459;
            }

            public final String toString() {
                return "ToggleExpand";
            }
        }

        public static final class k implements d {
            public final long a;

            public k(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && this.a == ((k) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return d020.a(this.a, "Unlock(themeId=", ")");
            }
        }
    }

    public static final class e implements igm {
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
            return b6c.a("ChangeSkipBallFlickingState(shouldSkipBallFlicking=", ")", this.a);
        }
    }

    public static final class f implements igm {
        public final String a;

        public f(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ClaimDailyReward(batchId=", this.a, ")");
        }
    }

    public static final class g implements igm {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1806722854;
        }

        public final String toString() {
            return "ClearScrollTierRequest";
        }
    }

    public static final class h implements igm {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1451395824;
        }

        public final String toString() {
            return "ClickDailyEventInfo";
        }
    }

    public static final class i implements igm {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -328842919;
        }

        public final String toString() {
            return "CloseDialog";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class j implements igm {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1360348542;
        }

        public final String toString() {
            return siPCzPFw.LJlVsUManEZz;
        }
    }

    public static final class k implements igm {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1304684215;
        }

        public final String toString() {
            return "EventInfoDialog";
        }
    }

    public static final class l implements igm {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -604020486;
        }

        public final String toString() {
            return "Finish";
        }
    }

    public static final class m implements igm {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -353514785;
        }

        public final String toString() {
            return "GoViewTotalReward";
        }
    }

    public static final class n implements igm {
        public final boolean a;

        public n(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("IsHomeShowing(isShowing=", ")", this.a);
        }
    }

    public interface o extends igm {

        public static final class a implements o {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "CancelCooldownExpired(missionId=", ")");
            }
        }

        public static final class b implements o {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "CancelMission(missionId=", ")");
            }
        }

        public static final class c implements o {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "ConfirmCancelMission(missionId=", ")");
            }
        }

        public static final class d implements o {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1667291856;
            }

            public final String toString() {
                return "DismissCancelConfirmation";
            }
        }

        public static final class e implements o {
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
                return pe4.b(this.a, "Participate(missionId=", ")");
            }
        }

        public static final class f implements o {
            public final int a;

            public f(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "ToggleRules(missionId=", ")");
            }
        }
    }

    public static final class p implements igm {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1007317647;
        }

        public final String toString() {
            return "ScrollToBetslipCustomization";
        }
    }

    public static final class q implements igm {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1781677867;
        }

        public final String toString() {
            return "ScrollToFirstMission";
        }
    }

    public static final class r implements igm {
        public final wsf0 a;

        public r(wsf0 wsf0Var) {
            this.a = wsf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Intrinsics.g(this.a, ((r) obj).a);
        }

        public final int hashCode() {
            wsf0 wsf0Var = this.a;
            if (wsf0Var == null) {
                return 0;
            }
            return wsf0Var.hashCode();
        }

        public final String toString() {
            return "TierStatusHintInfo(state=" + this.a + ")";
        }
    }

    public static final class s implements igm {
        public final pdd0 a;
        public final List<k00> b;

        /* JADX WARN: Multi-variable type inference failed */
        public s(pdd0 pdd0Var, List<? extends k00> list) {
            pdd0Var.getClass();
            list.getClass();
            this.a = pdd0Var;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return Intrinsics.g(this.a, sVar.a) && Intrinsics.g(this.b, sVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TrackEvent(trackingEvent=" + this.a + ", platforms=" + this.b + ")";
        }
    }

    public static final class t implements igm {
        public final krf0 a;

        public t(krf0 krf0Var) {
            this.a = krf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateSelectedTier(tierData=" + this.a + ")";
        }
    }

    public static final class u implements igm {
        public final tyt a;

        public u(tyt tytVar) {
            this.a = tytVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.a.equals(((u) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateTab(tab=" + this.a + ")";
        }
    }

    public static final class v implements igm {
        public static final v a = new v();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return 2080290385;
        }

        public final String toString() {
            return "WagerInfo";
        }
    }
}
