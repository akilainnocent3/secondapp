package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public interface px4 {

    public static final class a implements px4 {
        public static final a a = new a();
        public static final String b = "bet_history";

        @Override // defpackage.px4
        public final String a() {
            return b;
        }

        @Override // defpackage.px4
        public final String b(boolean z, androidx.compose.runtime.a aVar) {
            aVar.N(109411636);
            String strA = cb40.a(z ? R.string.image_url__personal_page_share_code_from_bet_history_dark : R.string.image_url__personal_page_share_code_from_bet_history_light, new Object[0], aVar);
            aVar.H();
            return strA;
        }

        @Override // defpackage.px4
        public final String c(androidx.compose.runtime.a aVar) {
            aVar.N(170707792);
            String strA = cb40.a(R.string.personal_page__check_my_bet_history, new Object[0], aVar);
            aVar.H();
            return strA;
        }

        @Override // defpackage.px4
        public final String d(androidx.compose.runtime.a aVar) {
            aVar.N(374885786);
            String strA = cb40.a(R.string.personal_page__from_bet_history, new Object[0], aVar);
            aVar.H();
            return strA;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1406912943;
        }

        public final String toString() {
            return "FromBetHistory";
        }
    }

    public static final class b implements px4 {
        public static final b a = new b();
        public static final String b = "betslip";

        @Override // defpackage.px4
        public final String a() {
            return b;
        }

        @Override // defpackage.px4
        public final String b(boolean z, androidx.compose.runtime.a aVar) {
            aVar.N(1248578134);
            String strA = cb40.a(z ? R.string.image_url__personal_page_share_code_from_betslip_dark : R.string.image_url__personal_page_share_code_from_betslip_light, new Object[0], aVar);
            aVar.H();
            return strA;
        }

        @Override // defpackage.px4
        public final String c(androidx.compose.runtime.a aVar) {
            aVar.N(-538406470);
            String strA = cb40.a(R.string.personal_page__add_selections_to_betslip, new Object[0], aVar);
            aVar.H();
            return strA;
        }

        @Override // defpackage.px4
        public final String d(androidx.compose.runtime.a aVar) {
            aVar.N(1516454832);
            String strA = cb40.a(R.string.personal_page__from_betslip, new Object[0], aVar);
            aVar.H();
            return strA;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 305579139;
        }

        public final String toString() {
            return "FromBetslip";
        }
    }

    public static final class c implements px4 {
        public static final c a = new c();
        public static final String b = "running_bets";

        @Override // defpackage.px4
        public final String a() {
            return b;
        }

        @Override // defpackage.px4
        public final String b(boolean z, androidx.compose.runtime.a aVar) {
            String strA;
            aVar.N(-1842103994);
            if (z) {
                aVar.N(-1322843293);
                strA = cb40.a(R.string.image_url__personal_page_share_code_from_runing_bet_dark, new Object[0], aVar);
                aVar.H();
            } else {
                aVar.N(-1322717278);
                strA = cb40.a(R.string.image_url__personal_page_share_code_from_runing_bet_light, new Object[0], aVar);
                aVar.H();
            }
            aVar.H();
            return strA;
        }

        @Override // defpackage.px4
        public final String c(androidx.compose.runtime.a aVar) {
            aVar.N(58076842);
            String strA = cb40.a(R.string.personal_page__check_my_open_bets, new Object[0], aVar);
            aVar.H();
            return strA;
        }

        @Override // defpackage.px4
        public final String d(androidx.compose.runtime.a aVar) {
            aVar.N(2092627360);
            String strA = cb40.a(R.string.personal_page__from_openbet, new Object[0], aVar);
            aVar.H();
            return strA;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1405275795;
        }

        public final String toString() {
            return "FromRunningBets";
        }
    }

    String a();

    String b(boolean z, androidx.compose.runtime.a aVar);

    String c(androidx.compose.runtime.a aVar);

    String d(androidx.compose.runtime.a aVar);
}
