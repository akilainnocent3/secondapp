package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public interface v03 extends pdd0 {

    public static final class a implements v03 {
        public static final a a = new a();
        public static final String b = AnalyticsParam.BETSLIP_ADD_CODE;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 465584879;
        }

        public final String toString() {
            return "AddCodeToBetSlip";
        }
    }

    public static final class a0 implements pdd0 {
        public static final a0 a = new a0();
        public static final String b = "betslip__combined_snackbar_settings_btn__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1279203443;
        }

        public final String toString() {
            return "CombinedSnackbarSettingsBtnViewEvent";
        }
    }

    public static final class b implements v03 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("anywin_status", this.a ? "enable" : "disable"));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "betslip__anywin_checkbox__click";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("AnyWinCheckboxClickEvent(enable=", ")", this.a);
        }
    }

    public static final class b0 implements pdd0 {
        public final String a = "gift_toggle_setting__click";
        public final HashMap<String, Object> b;

        public b0(HashMap map) {
            this.b = map;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return Intrinsics.g(this.a, b0Var.a) && Intrinsics.g(this.b, b0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "GiftToggleSettingClickEvent(name=" + this.a + ", customMetrics=" + this.b + ")";
        }
    }

    public static final class c implements v03 {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("anywin_status", this.a ? "enable" : "disable"));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "betslip__anywin_checkbox__view";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("AnyWinCheckboxViewEvent(enable=", ")", this.a);
        }
    }

    public static final class c0 implements pdd0 {
        public final String a = "gift_toggle_setting__view";
        public final HashMap<String, Object> b;

        public c0(HashMap map) {
            this.b = map;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return Intrinsics.g(this.a, c0Var.a) && Intrinsics.g(this.b, c0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "GiftToggleSettingViewEvent(name=" + this.a + ", customMetrics=" + this.b + ")";
        }
    }

    public static final class d implements v03 {
        public static final d a = new d();
        public static final String b = "betslip__anywin_fail_addmore__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1451452205;
        }

        public final String toString() {
            return "AnyWinFailAddMoreClickEvent";
        }
    }

    public static final class d0 implements v03 {
        public final String a;
        public final String b = "LOAD_BOOK_CODE";

        public d0(String str) {
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("from", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return this.a.equals(d0Var.a) && this.b.equals(d0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("LoadBookCodeFullStoryViewEvent(from=", this.a, ", name=", this.b, ")");
        }
    }

    public static final class e implements v03 {
        public static final e a = new e();
        public static final String b = "betslip__anywin_fail_addmore__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -93937676;
        }

        public final String toString() {
            return "AnyWinFailAddMoreViewEvent";
        }
    }

    public static final class e0 implements v03 {
        public final String a;
        public final String b = "load_book_code__view";

        public e0(String str) {
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("from", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) obj;
            return this.a.equals(e0Var.a) && this.b.equals(e0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("LoadBookCodeViewEvent(from=", this.a, ", name=", this.b, ")");
        }
    }

    public static final class f implements v03 {
        public static final f a = new f();
        public static final String b = "betslip__anywin_fail_reduce__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1968430061;
        }

        public final String toString() {
            return "AnyWinFailReduceClickEvent";
        }
    }

    public static final class f0 implements v03 {
        public static final f0 a = new f0();
        public static final String b = "betslip__lowreturn_remove_undo__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1264374711;
        }

        public final String toString() {
            return "LowReturnRemoveUndoClickEvent";
        }
    }

    public static final class g implements v03 {
        public static final g a = new g();
        public static final String b = "betslip__anywin_fail_reduce__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -814902886;
        }

        public final String toString() {
            return "AnyWinFailReduceViewEvent";
        }
    }

    public static final class g0 implements v03 {
        public static final g0 a = new g0();
        public static final String b = "betslip__lowreturn_remove_undo__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 132216976;
        }

        public final String toString() {
            return "LowReturnRemoveUndoViewEvent";
        }
    }

    public static final class h implements v03 {
        public static final h a = new h();
        public static final String b = "betslip__anywin_fail_total__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1375604287;
        }

        public final String toString() {
            return "AnyWinFailTotalClickEvent";
        }
    }

    public static final class h0 implements v03 {
        public static final h0 a = new h0();
        public static final String b = "more_insure_betslip__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -168026336;
        }

        public final String toString() {
            return "MoreInsureBetSlipView";
        }
    }

    public static final class i implements v03 {
        public static final i a = new i();
        public static final String b = "betslip__anywin_fail_total__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1199869626;
        }

        public final String toString() {
            return "AnyWinFailTotalViewEvent";
        }
    }

    public static final class i0 implements v03 {
        public static final i0 a = new i0();
        public static final String b = "betslip__remove_lowreturn_accpectchange_btn__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1651435291;
        }

        public final String toString() {
            return "RemoveLowReturnAcceptButtonClickEvent";
        }
    }

    public static final class j implements v03 {
        public static final j a = new j();
        public static final String b = "betslip__insuretip_anywin__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1070542101;
        }

        public final String toString() {
            return "AnyWinInsureTipViewEvent";
        }
    }

    public static final class j0 implements v03 {
        public static final j0 a = new j0();
        public static final String b = "betslip__remove_lowreturn_accpectchange_btn__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1285084578;
        }

        public final String toString() {
            return "RemoveLowReturnAcceptButtonViewEvent";
        }
    }

    public static final class k0 implements v03 {
        public static final k0 a = new k0();
        public static final String b = "betslip__remove_lowreturn_btn__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1587191421;
        }

        public final String toString() {
            return "RemoveLowReturnButtonClickEvent";
        }
    }

    public static final class l0 implements v03 {
        public static final l0 a = new l0();
        public static final String b = "betslip__remove_lowreturn_btn__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -134464246;
        }

        public final String toString() {
            return "RemoveLowReturnButtonViewEvent";
        }
    }

    public static final class m0 implements pdd0 {
        public static final m0 a = new m0();
        public static final String b = "betslip__replaced_snackbar_settings_btn__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -2034254065;
        }

        public final String toString() {
            return "ReplacedSnackbarSettingsBtnClickEvent";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface n extends v03 {
        n a(String str);

        q b();

        @Override // defpackage.pdd0
        default HashMap<String, Object> createCustomMetrics() {
            q qVarB = b();
            return kpu.d(new Pair("source", qVarB.a), new Pair("lv_flag", qVarB.c), new Pair("config", qVarB.b), new Pair("from", qVarB.d));
        }
    }

    public static final class n0 implements pdd0 {
        public static final n0 a = new n0();
        public static final String b = "betslip__replaced_snackbar_settings_btn__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n0);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -112737736;
        }

        public final String toString() {
            return "ReplacedSnackbarSettingsBtnViewEvent";
        }
    }

    public static final class o0 implements pdd0 {
        public final String a = "retain_selections_after_rebet";
        public final HashMap<String, Object> b;

        public o0(HashMap map) {
            this.b = map;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o0)) {
                return false;
            }
            o0 o0Var = (o0) obj;
            return Intrinsics.g(this.a, o0Var.a) && Intrinsics.g(this.b, o0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RetainSelectionsAfterRebetEvent(name=" + this.a + ", customMetrics=" + this.b + ")";
        }
    }

    public static final class s implements pdd0 {
        public final String a = "betslip_place_bet_time_view";
        public final int b;
        public final int c;
        public final long d;
        public final long e;
        public final boolean f;

        public s(int i, int i2, long j, long j2, boolean z) {
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = j2;
            this.f = z;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("http_status", Integer.valueOf(this.b)), new Pair("biz_code", Integer.valueOf(this.c)), new Pair("click_confirm_time", Long.valueOf(this.d)), new Pair("response_time", Long.valueOf(this.e)), new Pair("has_refresh_betslip", Boolean.valueOf(this.f)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.a.equals(sVar.a) && this.b == sVar.b && this.c == sVar.c && this.d == sVar.d && this.e == sVar.e && this.f == sVar.f;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + f87.a(f87.a(gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31), this.e, 31);
        }

        public final String toString() {
            StringBuilder sbA = ml5.a(this.b, "BetSlipPlaceBetTimeViewEvent(name=", this.a, ", httpStatus=", ", bizCode=");
            sbA.append(this.c);
            sbA.append(", clickConfirmTime=");
            sbA.append(this.d);
            g41.a(this.e, ", responseTime=", ", hasRefreshBetSlip=", sbA);
            return mq0.a(sbA, this.f, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class t implements v03 {
        public static final t a = new t();
        public static final String b = "betslip__prerequisite_state_fail";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 72813775;
        }

        public final String toString() {
            return qUnCRF.DPZg;
        }
    }

    public static final class u implements v03 {
        public static final u a = new u();
        public static final String b = "betslip__prerequisite_state_retry_clicked";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 779824400;
        }

        public final String toString() {
            return "BetSlipPrerequisiteStateRetryClicked";
        }
    }

    public static final class v implements v03 {
        public static final v a = new v();
        public static final String b = AnalyticsEvent.BETSLIP_SIMPLE_SWITCH_TO_STANDARD;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -604370520;
        }

        public final String toString() {
            return "BetSlipSimpleSwitchToStandard";
        }
    }

    public static final class w implements v03 {
        public static final w a = new w();
        public static final String b = AnalyticsEvent.BETSLIP_STANDARD_SWITCH_TO_SIMPLE;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1121113768;
        }

        public final String toString() {
            return "BetSlipStandardSwitchToSimple";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class x implements n {
        public final String a;
        public final q b;

        public x(String str, q qVar) {
            qVar.getClass();
            this.a = str;
            this.b = qVar;
        }

        @Override // v03.n
        public final n a(String str) {
            if (str == null) {
                return this;
            }
            return new x(this.a, q.a(this.b, null, str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8388605));
        }

        @Override // v03.n
        public final q b() {
            return this.b;
        }

        @Override // v03.n, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> mapCreateCustomMetrics = super.createCustomMetrics();
            mapCreateCustomMetrics.put("variant", this.b.p);
            return mapCreateCustomMetrics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.a.equals(xVar.a) && Intrinsics.g(this.b, xVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetSlipViewEvent(name=" + this.a + ", betSlipParams=" + this.b + ")";
        }
    }

    public static final class y implements pdd0 {
        public final String a = "betslip__combine_selection_toggle__click";
        public final HashMap<String, Object> b;

        public y(HashMap map) {
            this.b = map;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return Intrinsics.g(this.a, yVar.a) && Intrinsics.g(this.b, yVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CombineSelectionToggleClickEvent(name=" + this.a + ", customMetrics=" + this.b + ")";
        }
    }

    public static final class z implements pdd0 {
        public static final z a = new z();
        public static final String b = "betslip__combined_snackbar_settings_btn__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 460014682;
        }

        public final String toString() {
            return "CombinedSnackbarSettingsBtnClickEvent";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class k implements n {
        public final String a;
        public final q b;

        public k(String str, q qVar) {
            str.getClass();
            qVar.getClass();
            this.a = str;
            this.b = qVar;
        }

        @Override // v03.n
        public final n a(String str) {
            if (str == null) {
                return this;
            }
            q qVarA = q.a(this.b, null, str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8388605);
            String str2 = this.a;
            str2.getClass();
            return new k(str2, qVarA);
        }

        @Override // v03.n
        public final q b() {
            return this.b;
        }

        @Override // v03.n, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            q qVar = this.b;
            return kpu.d(new Pair("unavailable_selections_count", qVar.g), new Pair("selections_count", qVar.e), new Pair("from", qVar.d));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Intrinsics.g(this.a, kVar.a) && Intrinsics.g(this.b, kVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetSlipAcceptChangeClickEvent(name=" + this.a + ", betSlipParams=" + this.b + ")";
        }

        public /* synthetic */ k(q qVar) {
            this("betslip__accept_change__click", qVar);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class l implements n {
        public final String a;
        public final q b;

        public l(String str, q qVar) {
            str.getClass();
            qVar.getClass();
            this.a = str;
            this.b = qVar;
        }

        @Override // v03.n
        public final n a(String str) {
            if (str == null) {
                return this;
            }
            q qVarA = q.a(this.b, null, str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8388605);
            String str2 = this.a;
            str2.getClass();
            return new l(str2, qVarA);
        }

        @Override // v03.n
        public final q b() {
            return this.b;
        }

        @Override // v03.n, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            q qVar = this.b;
            return kpu.d(new Pair("unavailable_selections_count", qVar.g), new Pair("selections_count", qVar.e), new Pair("from", qVar.d));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.g(this.a, lVar.a) && Intrinsics.g(this.b, lVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetSlipAcceptChangeViewEvent(name=" + this.a + ", betSlipParams=" + this.b + ")";
        }

        public /* synthetic */ l(q qVar) {
            this("betslip__accept_change__view", qVar);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class m implements n {
        public final String a;
        public final q b;

        public m(String str, q qVar) {
            str.getClass();
            qVar.getClass();
            this.a = str;
            this.b = qVar;
        }

        @Override // v03.n
        public final n a(String str) {
            if (str == null) {
                return this;
            }
            q qVarA = q.a(this.b, null, str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8388605);
            String str2 = this.a;
            str2.getClass();
            return new m(str2, qVarA);
        }

        @Override // v03.n
        public final q b() {
            return this.b;
        }

        @Override // v03.n, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> mapCreateCustomMetrics = super.createCustomMetrics();
            mapCreateCustomMetrics.put(AnalyticsParam.DATA_BET_TYPE, this.b.f);
            return mapCreateCustomMetrics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Intrinsics.g(this.a, mVar.a) && Intrinsics.g(this.b, mVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetSlipAddSelectionEvent(name=" + this.a + ", betSlipParams=" + this.b + ")";
        }

        public /* synthetic */ m(q qVar) {
            this("betslip__add_selection", qVar);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class o implements n {
        public final String a;
        public final q b;

        public o(String str, q qVar) {
            str.getClass();
            qVar.getClass();
            this.a = str;
            this.b = qVar;
        }

        @Override // v03.n
        public final n a(String str) {
            if (str == null) {
                return this;
            }
            q qVarA = q.a(this.b, null, str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8388605);
            String str2 = this.a;
            str2.getClass();
            return new o(str2, qVarA);
        }

        @Override // v03.n
        public final q b() {
            return this.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v13 */
        /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v18 */
        /* JADX WARN: Type inference failed for: r12v19 */
        /* JADX WARN: Type inference failed for: r12v20 */
        /* JADX WARN: Type inference failed for: r12v21 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
        @Override // v03.n, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap mapCreateCustomMetrics = super.createCustomMetrics();
            q qVar = this.b;
            Integer num = qVar.e;
            int i = qVar.w;
            int i2 = qVar.o;
            int i3 = qVar.n;
            int i4 = qVar.l;
            String str = qVar.q;
            int i5 = qVar.k;
            mapCreateCustomMetrics.put("selections_count", num);
            mapCreateCustomMetrics.put(AnalyticsParam.DATA_BET_TYPE, qVar.f);
            int i6 = qVar.m;
            if (i6 > 0) {
                mapCreateCustomMetrics.put("isPcbb", "1");
            }
            mapCreateCustomMetrics.put("contain_featured_bb", i5 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("featured_bb__bet_count", Integer.valueOf(i5));
            mapCreateCustomMetrics.put("contain_flash_boost", qVar.t ? "yes" : "no");
            mapCreateCustomMetrics.put(AnalyticsParam.EVENT_PARAM_MISSION_REMINDER, Integer.valueOf(Intrinsics.g(qVar.r, Boolean.TRUE) ? 1 : 0));
            mapCreateCustomMetrics.put("mission_id", qVar.s);
            mapCreateCustomMetrics.put("one_up_tag", Integer.valueOf(qVar.v));
            if (str != null && str.length() > 0) {
                mapCreateCustomMetrics.put(AnalyticsParam.SOCIAL_ORDER_ID, str);
            }
            mapCreateCustomMetrics.put("contain_bbt", i4 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("bb_bet_count", Integer.valueOf(i4));
            mapCreateCustomMetrics.put("contain_pcbbt", i6 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("pcbb__bet_count", Integer.valueOf(i6));
            mapCreateCustomMetrics.put("contain_megat", i3 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("mega_bet_count", Integer.valueOf(i3));
            mapCreateCustomMetrics.put("home_contain_featured_bb", i2 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("home_featured_bb__bet_count", Integer.valueOf(i2));
            mapCreateCustomMetrics.put("sportypicks_count", Integer.valueOf(i));
            mapCreateCustomMetrics.put("contain_sportypicks", i > 0 ? "yes" : "no");
            return mapCreateCustomMetrics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Intrinsics.g(this.a, oVar.a) && Intrinsics.g(this.b, oVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetSlipBetSuccessViewEvent(name=" + this.a + ", betSlipParams=" + this.b + ")";
        }

        public /* synthetic */ o(q qVar) {
            this("betslip__bet_success__view", qVar);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class p implements n {
        public final String a;
        public final q b;

        public p(String str, q qVar) {
            str.getClass();
            qVar.getClass();
            this.a = str;
            this.b = qVar;
        }

        @Override // v03.n
        public final n a(String str) {
            if (str == null) {
                return this;
            }
            q qVarA = q.a(this.b, null, str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8388605);
            String str2 = this.a;
            str2.getClass();
            return new p(str2, qVarA);
        }

        @Override // v03.n
        public final q b() {
            return this.b;
        }

        @Override // v03.n, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> mapCreateCustomMetrics = super.createCustomMetrics();
            q qVar = this.b;
            Integer num = qVar.e;
            int i = qVar.w;
            int i2 = qVar.o;
            int i3 = qVar.n;
            int i4 = qVar.m;
            int i5 = qVar.l;
            mapCreateCustomMetrics.put("selections_count", num);
            mapCreateCustomMetrics.put(AnalyticsParam.DATA_BET_TYPE, qVar.f);
            int i6 = qVar.k;
            mapCreateCustomMetrics.put("contain_featured_bb", i6 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("featured_bb__bet_count", Integer.valueOf(i6));
            mapCreateCustomMetrics.put("contain_flash_boost", qVar.t ? "yes" : "no");
            mapCreateCustomMetrics.put("contain_bbt", i5 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("bb_bet_count", Integer.valueOf(i5));
            mapCreateCustomMetrics.put("contain_pcbbt", i4 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("pcbb__bet_count", Integer.valueOf(i4));
            mapCreateCustomMetrics.put("contain_megat", i3 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("mega_bet_count", Integer.valueOf(i3));
            mapCreateCustomMetrics.put("home_contain_featured_bb", i2 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("home_featured_bb__bet_count", Integer.valueOf(i2));
            String str = qVar.u;
            if (str != null) {
                mapCreateCustomMetrics.put("note", str);
            }
            mapCreateCustomMetrics.put("sportypicks_count", Integer.valueOf(i));
            mapCreateCustomMetrics.put("contain_sportypicks", i > 0 ? "yes" : "no");
            return mapCreateCustomMetrics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Intrinsics.g(this.a, pVar.a) && Intrinsics.g(this.b, pVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetSlipConfirmClickEvent(name=" + this.a + ", betSlipParams=" + this.b + ")";
        }

        public /* synthetic */ p(q qVar) {
            this("betslip__confirm__click", qVar);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class r implements n {
        public final String a;
        public final q b;

        public r(String str, q qVar) {
            str.getClass();
            qVar.getClass();
            this.a = str;
            this.b = qVar;
        }

        @Override // v03.n
        public final n a(String str) {
            if (str == null) {
                return this;
            }
            q qVarA = q.a(this.b, null, str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8388605);
            String str2 = this.a;
            str2.getClass();
            return new r(str2, qVarA);
        }

        @Override // v03.n
        public final q b() {
            return this.b;
        }

        @Override // v03.n, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> mapCreateCustomMetrics = super.createCustomMetrics();
            q qVar = this.b;
            Integer num = qVar.e;
            int i = qVar.w;
            int i2 = qVar.o;
            int i3 = qVar.n;
            int i4 = qVar.m;
            int i5 = qVar.l;
            int i6 = qVar.k;
            String str = qVar.f;
            if (num != null) {
                mapCreateCustomMetrics.put("selections_count", Integer.valueOf(num.intValue()));
            }
            if (str != null) {
                mapCreateCustomMetrics.put(AnalyticsParam.DATA_BET_TYPE, str);
            }
            String str2 = qVar.i;
            if (str2 != null) {
                mapCreateCustomMetrics.put("use_gift", str2);
            }
            String str3 = qVar.j;
            if (str3 != null) {
                mapCreateCustomMetrics.put("gift_type", str3);
            }
            String str4 = qVar.h;
            if (str4 != null) {
                mapCreateCustomMetrics.put("liability_status", str4);
            }
            mapCreateCustomMetrics.put("selections_count", qVar.e);
            mapCreateCustomMetrics.put(AnalyticsParam.DATA_BET_TYPE, str);
            mapCreateCustomMetrics.put("contain_featured_bb", i6 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("featured_bb__bet_count", Integer.valueOf(i6));
            mapCreateCustomMetrics.put("contain_flash_boost", qVar.t ? "yes" : "no");
            String str5 = qVar.p;
            if (str5 != null) {
                mapCreateCustomMetrics.put("variant", str5);
            }
            mapCreateCustomMetrics.put("contain_bbt", i5 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("bb_bet_count", Integer.valueOf(i5));
            mapCreateCustomMetrics.put("contain_pcbbt", i4 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("pcbb__bet_count", Integer.valueOf(i4));
            mapCreateCustomMetrics.put("contain_megat", i3 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("mega_bet_count", Integer.valueOf(i3));
            String str6 = qVar.u;
            if (str6 != null) {
                mapCreateCustomMetrics.put("note", str6);
            }
            mapCreateCustomMetrics.put("home_contain_featured_bb", i2 > 0 ? "yes" : "no");
            mapCreateCustomMetrics.put("home_featured_bb__bet_count", Integer.valueOf(i2));
            mapCreateCustomMetrics.put("sportypicks_count", Integer.valueOf(i));
            mapCreateCustomMetrics.put("contain_sportypicks", i > 0 ? "yes" : "no");
            return mapCreateCustomMetrics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return Intrinsics.g(this.a, rVar.a) && Intrinsics.g(this.b, rVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetSlipPlaceBetClickEvent(name=" + this.a + ", betSlipParams=" + this.b + ")";
        }

        public /* synthetic */ r(q qVar) {
            this(AnalyticsEvent.BETSLIP_PLACE_BET_CLICK, qVar);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class q {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Integer e;
        public final String f;
        public final Integer g;
        public final String h;
        public final String i;
        public final String j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final String p;
        public final String q;
        public final Boolean r;
        public final Integer s;
        public final boolean t;
        public final String u;
        public final int v;
        public final int w;

        public q(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, String str6, String str7, String str8, int i, int i2, int i3, int i4, int i5, String str9, String str10, Boolean bool, Integer num3, boolean z, String str11, int i6, int i7) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = num;
            this.f = str5;
            this.g = num2;
            this.h = str6;
            this.i = str7;
            this.j = str8;
            this.k = i;
            this.l = i2;
            this.m = i3;
            this.n = i4;
            this.o = i5;
            this.p = str9;
            this.q = str10;
            this.r = bool;
            this.s = num3;
            this.t = z;
            this.u = str11;
            this.v = i6;
            this.w = i7;
        }

        public static q a(q qVar, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, String str6, String str7, String str8, int i, int i2, int i3, int i4, int i5, String str9, String str10, Boolean bool, Integer num3, boolean z, String str11, int i6, int i7, int i8) {
            String str12 = (i8 & 1) != 0 ? qVar.a : str;
            String str13 = (i8 & 2) != 0 ? qVar.b : str2;
            String str14 = (i8 & 4) != 0 ? qVar.c : str3;
            String str15 = (i8 & 8) != 0 ? qVar.d : str4;
            Integer num4 = (i8 & 16) != 0 ? qVar.e : num;
            String str16 = (i8 & 32) != 0 ? qVar.f : str5;
            Integer num5 = (i8 & 64) != 0 ? qVar.g : num2;
            String str17 = (i8 & 128) != 0 ? qVar.h : str6;
            String str18 = (i8 & 256) != 0 ? qVar.i : str7;
            String str19 = (i8 & 512) != 0 ? qVar.j : str8;
            int i9 = (i8 & 1024) != 0 ? qVar.k : i;
            int i10 = (i8 & 2048) != 0 ? qVar.l : i2;
            int i11 = (i8 & 4096) != 0 ? qVar.m : i3;
            int i12 = (i8 & 8192) != 0 ? qVar.n : i4;
            String str20 = str12;
            int i13 = (i8 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? qVar.o : i5;
            String str21 = (i8 & 32768) != 0 ? qVar.p : str9;
            String str22 = (i8 & 65536) != 0 ? qVar.q : str10;
            Boolean bool2 = (i8 & 131072) != 0 ? qVar.r : bool;
            Integer num6 = (i8 & 262144) != 0 ? qVar.s : num3;
            boolean z2 = (i8 & 524288) != 0 ? qVar.t : z;
            String str23 = (i8 & 1048576) != 0 ? qVar.u : str11;
            int i14 = (i8 & 2097152) != 0 ? qVar.v : i6;
            int i15 = (i8 & 4194304) != 0 ? qVar.w : i7;
            qVar.getClass();
            return new q(str20, str13, str14, str15, num4, str16, num5, str17, str18, str19, i9, i10, i11, i12, i13, str21, str22, bool2, num6, z2, str23, i14, i15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Intrinsics.g(this.a, qVar.a) && Intrinsics.g(this.b, qVar.b) && Intrinsics.g(this.c, qVar.c) && Intrinsics.g(this.d, qVar.d) && Intrinsics.g(this.e, qVar.e) && Intrinsics.g(this.f, qVar.f) && Intrinsics.g(this.g, qVar.g) && Intrinsics.g(this.h, qVar.h) && Intrinsics.g(this.i, qVar.i) && Intrinsics.g(this.j, qVar.j) && this.k == qVar.k && this.l == qVar.l && this.m == qVar.m && this.n == qVar.n && this.o == qVar.o && Intrinsics.g(this.p, qVar.p) && Intrinsics.g(this.q, qVar.q) && Intrinsics.g(this.r, qVar.r) && Intrinsics.g(this.s, qVar.s) && this.t == qVar.t && Intrinsics.g(this.u, qVar.u) && this.v == qVar.v && this.w == qVar.w;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.e;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.g;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str6 = this.h;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.i;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.j;
            int iA = gpp.a(this.o, gpp.a(this.n, gpp.a(this.m, gpp.a(this.l, gpp.a(this.k, (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31), 31), 31), 31);
            String str9 = this.p;
            int iHashCode10 = (iA + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.q;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Boolean bool = this.r;
            int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num3 = this.s;
            int iA2 = mtg0.a((iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.t);
            String str11 = this.u;
            return Integer.hashCode(this.w) + gpp.a(this.v, (iA2 + (str11 != null ? str11.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("BetSlipParams(source=", this.a, ", config=", this.b, ", lvFlag=");
            hxa.c(sbA, this.c, ", from=", this.d, ", selectionsCount=");
            w03.a(this.e, ", betType=", this.f, ", unavailableSelectionsCount=", sbA);
            w03.a(this.g, ", liabilityStatus=", this.h, ", isUseGift=", sbA);
            hxa.c(sbA, this.i, ", giftType=", this.j, ", featuredBBCount=");
            d5d.a(sbA, this.k, ", bbCount=", this.l, ", pcBBCount=");
            d5d.a(sbA, this.m, ", megaBBCount=", this.n, ", homeFeaturedBBCount=");
            f78.b(this.o, ", betSlipHeaderState=", this.p, ", orderId=", sbA);
            x03.a(sbA, this.q, ", isMissionReminder=", this.r, ", missionId=");
            sbA.append(this.s);
            sbA.append(", hasFlashBoostSelections=");
            sbA.append(this.t);
            sbA.append(", note=");
            wxa.b(this.v, this.u, ", oneUpTag=", ", sportyPicksCount=", sbA);
            return zk1.a(this.w, ")", sbA);
        }

        public /* synthetic */ q(int i) {
            this((i & 1) != 0 ? null : "non_load_code", null, null, null, null, (i & 32) == 0 ? SimulateBetConsts.BetslipType.SINGLE : null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0);
        }

        public q() {
            this(8388607);
        }
    }
}
