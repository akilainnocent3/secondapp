package defpackage;

import com.appsflyer.internal.m;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface uyt {

    public static final class a implements uyt {
        public final oo3 a;

        public a(oo3 oo3Var) {
            oo3Var.getClass();
            this.a = oo3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "BetslipCustomization(model=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final int d;
        public final boolean e;
        public final String f;
        public final UiText g;

        public b(String str, String str2, String str3, int i, boolean z, String str4, UiText uiText) {
            m.a(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = z;
            this.f = str4;
            this.g = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && Intrinsics.g(this.f, bVar.f) && Intrinsics.g(this.g, bVar.g);
        }

        public final int hashCode() {
            int iA = mtg0.a(gpp.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
            String str = this.f;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            UiText uiText = this.g;
            return iHashCode + (uiText != null ? uiText.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("DailyEvent(batchId=", this.a, ", date=", this.b, ", reward=");
            wxa.b(this.d, this.c, ", status=", ", isAccumulate=", sbA);
            mng.a(jbkEboCkTqmGf.ZZS, this.f, ", streakBonus=", sbA, this.e);
            return plf.a(sbA, this.g, ")");
        }
    }

    public static final class c implements uyt {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -481798159;
        }

        public final String toString() {
            return "EmptyBenefit";
        }
    }

    public static final class d implements uyt {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -730192780;
        }

        public final String toString() {
            return "EmptyEvent";
        }
    }

    public static final class e implements uyt {
        public final j a;
        public final b b;

        public e(j jVar, b bVar) {
            this.a = jVar;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            b bVar = this.b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            return "Event(weeklyEvent=" + this.a + ", dailyEvent=" + this.b + ")";
        }
    }

    public static final class f implements uyt {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1349888885;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class g implements uyt {
        public final jwv a;

        public g(jwv jwvVar) {
            jwvVar.getClass();
            this.a = jwvVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MissionTabContent(missionUIState=" + this.a + ")";
        }
    }

    public static final class h implements uyt {
        public final wr50 a;

        public h(wr50 wr50Var) {
            wr50Var.getClass();
            this.a = wr50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.g(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Reward(model=" + this.a + ")";
        }
    }

    public static final class j {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final UiText e;

        public j(UiText uiText, String str, String str2, String str3, String str4) {
            m.a(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.g(this.a, jVar.a) && Intrinsics.g(this.b, jVar.b) && Intrinsics.g(this.c, jVar.c) && Intrinsics.g(this.d, jVar.d) && Intrinsics.g(this.e, jVar.e);
        }

        public final int hashCode() {
            int iA = gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            UiText uiText = this.e;
            return iHashCode + (uiText != null ? uiText.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("WeeklyEvent(date=", this.a, ", endTime=", this.b, ", reward=");
            hxa.c(sbA, this.c, ", streakMultiplier=", this.d, ", streakBonus=");
            return plf.a(sbA, this.e, ")");
        }
    }

    public static final class i implements uyt {
        public final UiText a;
        public final boolean b;

        public i(UiText uiText) {
            this.a = uiText;
            this.b = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.g(this.a, iVar.a) && this.b == iVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RewardSectionTitle(title=" + this.a + ", isScrollAnchor=" + this.b + ")";
        }

        public i(UiText uiText, boolean z) {
            this.a = uiText;
            this.b = z;
        }
    }
}
