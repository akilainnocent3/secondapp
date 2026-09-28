package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface zvk extends pdd0 {

    public static final class a implements zvk {
        public static final a a = new a();
        public static final String b = "gift__deposit_banner__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 2000072804;
        }

        public final String toString() {
            return "DepositNowClickEvent";
        }
    }

    public static final class b implements zvk {
        public static final b a = new b();
        public static final String b = "gift__howtouse__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -713869960;
        }

        public final String toString() {
            return "GiftHowToUseClickEvent";
        }
    }

    public static final class c implements zvk {
        public static final c a = new c();
        public static final String b = "gift__gift_mainpage__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1776103709;
        }

        public final String toString() {
            return "GiftMainPageViewEvent";
        }
    }

    public static final class d implements zvk {
        public static final d a = new d();
        public static final String b = "lw__lw_use__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 137236256;
        }

        public final String toString() {
            return "LuckyWheelTicketUseClickEvent";
        }
    }

    public static final class e implements zvk {
        public static final e a = new e();
        public static final String b = "lw__lw_ticket__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1696324284;
        }

        public final String toString() {
            return "LuckyWheelTicketViewEvent";
        }
    }
}
