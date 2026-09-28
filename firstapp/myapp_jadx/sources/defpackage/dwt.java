package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface dwt extends pdd0 {

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements dwt {
        public final String a = "loyalty__current_mission_tab__click";

        public a(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LoyaltyCurrentMissionTabClickEvent(name=", this.a, ")");
        }
    }

    public static final class b implements dwt {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "loyalty__mission_default__view";
        }

        public final int hashCode() {
            return 1210916799;
        }

        public final String toString() {
            return "LoyaltyMissionCanStartViewEvent";
        }
    }

    public static final class c implements dwt {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "loyalty__mission_completed__view";
        }

        public final int hashCode() {
            return -1157152890;
        }

        public final String toString() {
            return "LoyaltyMissionCompleteMissionViewEvent";
        }
    }

    public static final class d implements dwt {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "loyalty__mission_participating__view";
        }

        public final int hashCode() {
            return -1986824418;
        }

        public final String toString() {
            return "LoyaltyMissionOngoingViewEvent";
        }
    }

    public static final class e implements dwt {
        public final String a = "loyalty__mission_popup_complete__click";

        public e(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LoyaltyMissionPopupCompleteClickEvent(name=", this.a, ")");
        }
    }

    public static final class f implements dwt {
        public final String a = "loyalty__mission_popup_complete_close__click";

        public f(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LoyaltyMissionPopupCompleteCloseClickEvent(name=", this.a, ")");
        }
    }

    public static final class g implements dwt {
        public final String a = "loyalty__mission_popup_complete__view";

        public g(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LoyaltyMissionPopupCompleteViewEvent(name=", this.a, ")");
        }
    }

    public static final class h implements dwt {
        public final String a = "loyalty__mission_popup_new__click";

        public h(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.g(this.a, ((h) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LoyaltyMissionPopupNewClickEvent(name=", this.a, ")");
        }
    }

    public static final class i implements dwt {
        public final String a = "loyalty__mission_popup_new_close__click";

        public i(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LoyaltyMissionPopupNewCloseClickEvent(name=", this.a, ")");
        }
    }

    public static final class j implements dwt {
        public final String a = "loyalty__mission_popup_new__view";

        public j(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.g(this.a, ((j) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LoyaltyMissionPopupNewViewEvent(name=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class k implements dwt {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "loyalty__mission_participating_btn__click";
        }

        public final int hashCode() {
            return 554237632;
        }

        public final String toString() {
            return "LoyaltyMissionStartMissionClickEvent";
        }
    }
}
