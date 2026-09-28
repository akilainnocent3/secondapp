package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface osp extends pdd0 {

    public static final class a implements osp {
        public static final a a = new a();
        public static final String b = "KYC_Annoying_Dialog_Confirm_Clicked";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -120893442;
        }

        public final String toString() {
            return "KYCAnnoyingDialogConfirmClickedEvent";
        }
    }

    public static final class a0 implements osp {
        public final String a;
        public final int b;
        public final String c;

        public a0(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("kyc_webview_stage", this.a), new Pair("error_code", Integer.valueOf(this.b)), new Pair("error_description", this.c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return this.a.equals(a0Var.a) && this.b == a0Var.b && Intrinsics.g(this.c, a0Var.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__load_error";
        }

        public final int hashCode() {
            int iA = gpp.a(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return uf80.a(ml5.a(this.b, "KycWebviewLoadErrorEvent(stage=", this.a, ", errorCode=", ", errorDescription="), this.c, ")");
        }
    }

    public static final class b implements osp {
        public static final b a = new b();
        public static final String b = "KYC_Annoying_Dialog_Showed";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1026712311;
        }

        public final String toString() {
            return "KYCAnnoyingDialogShowedEvent";
        }
    }

    public static final class b0 implements osp {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public b0(String str, String str2, boolean z, boolean z2) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("url", this.a), new Pair("method", this.b), new Pair("is_redirect", Boolean.valueOf(this.c)), new Pair("is_main_frame", Boolean.valueOf(this.d)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return Intrinsics.g(this.a, b0Var.a) && Intrinsics.g(this.b, b0Var.b) && this.c == b0Var.c && this.d == b0Var.d;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__override_url";
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.d) + mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return lng.a(", isMainFrame=", ")", ux5.a("KycWebviewOverrideUrlEvent(url=", this.a, ", method=", this.b, ", isRedirect="), this.c, this.d);
        }
    }

    public static final class c implements osp {
        public final String a;
        public final vtp b;

        public c(vtp vtpVar) {
            vtpVar.getClass();
            this.a = "kyc__annoying_dialog_confirm__click";
            this.b = vtpVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("screen_page", this.b.a));
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

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "KycAnnoyingDialogConfirmClickEvent(name=" + this.a + ", page=" + this.b + ")";
        }
    }

    public static final class c0 implements osp {
        public final String a;
        public final String b;

        public c0(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("kyc_webview_stage", this.a), new Pair("entry_source", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return this.a.equals(c0Var.a) && this.b.equals(c0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__page_started";
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("KycWebviewPageStartedEvent(stage=", this.a, ", entrySource=", this.b, ")");
        }
    }

    public static final class d implements osp {
        public final String a;
        public final vtp b;

        public d(vtp vtpVar) {
            vtpVar.getClass();
            this.a = "kyc__annoying_dialog_mask__click";
            this.b = vtpVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("screen_page", this.b.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b == dVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "KycAnnoyingDialogConfirmMaskEvent(name=" + this.a + ", page=" + this.b + ")";
        }
    }

    public static final class d0 implements osp {
        public final int a;

        public d0(int i) {
            this.a = i;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("primary_error", Integer.valueOf(this.a)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && this.a == ((d0) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__ssl_error";
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "KycWebviewSslErrorEvent(primaryError=", ")");
        }
    }

    public static final class e implements osp {
        public final String a;
        public final vtp b;

        public e(vtp vtpVar) {
            vtpVar.getClass();
            this.a = "kyc__annoying_dialog__view";
            this.b = vtpVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("screen_page", this.b.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b == eVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "KycAnnoyingDialogViewEvent(name=" + this.a + ", page=" + this.b + ")";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class f implements osp {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("registration_status", Integer.valueOf(this.a)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__registration_intent_open";
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "KycIntentOpenEvent(registrationStatus=", ")");
        }
    }

    public static final class g implements osp {
        public static final g a = new g();
        public static final String b = "kyc__me_resubmit_btn__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1874221643;
        }

        public final String toString() {
            return "KycMeResubmitClickEvent";
        }
    }

    public static final class h implements osp {
        public static final h a = new h();
        public static final String b = "kyc__me_verify__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1554990919;
        }

        public final String toString() {
            return "KycMeVerifyClickEvent";
        }
    }

    public static final class i implements osp {
        public static final i a = new i();
        public static final String b = "kyc__me_verify__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 456911694;
        }

        public final String toString() {
            return "KycMeVerifyViewEvent";
        }
    }

    public static final class j implements osp {
        public static final j a = new j();
        public static final String b = "kyc__reject_reason_close_btn__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -2009145041;
        }

        public final String toString() {
            return "KycRejectReasonCloseBtnClickEvent";
        }
    }

    public static final class k implements osp {
        public static final k a = new k();
        public static final String b = "kyc__reject_reason_verify_btn__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1537522244;
        }

        public final String toString() {
            return "KycRejectReasonVerifyBtnClickEvent";
        }
    }

    public static final class l implements osp {
        public final boolean a;
        public final String b;

        public l(boolean z) {
            this.a = z;
            this.b = z ? "kyc__verify_banner1__click" : "kyc__verify_banner2__click";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("KycVerifyBannerClickEvent(isSimpleUnconfirmed=", ")", this.a);
        }
    }

    public static final class m implements osp {
        public final boolean a;
        public final String b;

        public m(boolean z) {
            this.a = z;
            this.b = z ? "kyc__verify_banner1__view" : "kyc__verify_banner2__view";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("KycVerifyBannerViewEvent(isSimpleUnconfirmed=", ")", this.a);
        }
    }

    public static final class n implements osp {
        public final eup a;

        public n(eup eupVar) {
            this.a = eupVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("src", this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__verify_fail_banner__click";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "KycVerifyFailBannerClickEvent(src=" + this.a + ")";
        }
    }

    public static final class o implements osp {
        public final eup a;

        public o(eup eupVar) {
            this.a = eupVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("src", this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.a == ((o) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__verify_fail_banner__view";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "KycVerifyFailBannerViewEvent(src=" + this.a + ")";
        }
    }

    public static final class p implements osp {
        public final eup a;

        public p(eup eupVar) {
            this.a = eupVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("src", this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.a == ((p) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__verify_fail_reason__click";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "KycVerifyFailReasonClickEvent(src=" + this.a + ")";
        }
    }

    public static final class q implements osp {
        public final String a = "kyc__verifying_banner__view";

        public q(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.g(this.a, ((q) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("KycVerifyingBannerViewEvent(name=", this.a, ")");
        }
    }

    public static final class r implements osp {
        public final wup a;

        public r(wup wupVar) {
            this.a = wupVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("source", this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a == ((r) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc_verifying_profile_btn_click";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "KycVerifyingProfileBtnClickEvent(src=" + this.a + ")";
        }
    }

    public static final class s implements osp {
        public final wup a;

        public s(wup wupVar) {
            this.a = wupVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("source", this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.a == ((s) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__verifying_sheet__view";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "KycVerifyingSheetViewEvent(src=" + this.a + ")";
        }
    }

    public static final class t implements osp {
        public final wup a;

        public t(wup wupVar) {
            this.a = wupVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("source", this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc_verifying_transaction_btn_click";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "KycVerifyingTransactionBtnClickEvent(src=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class u implements osp {
        public final String a;

        public u(String str) {
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("entry_source", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.a.equals(((u) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__activity_created";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("KycWebviewActivityCreatedEvent(entrySource=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class v implements osp {
        public final String a;
        public final boolean b;

        public v(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("entry_source", this.a), new Pair("finishing", Boolean.valueOf(this.b)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.a.equals(vVar.a) && this.b == vVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__activity_destroyed";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("KycWebviewActivityDestroyedEvent(entrySource=", this.a, ", finishing=", ")", this.b);
        }
    }

    public static final class w implements osp {
        public final String a;
        public final String b;

        public w(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("entry_source", this.a), new Pair("reason", this.b));
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

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__finish_reason";
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("KycWebviewFinishReasonEvent(entrySource=", this.a, ", reason=", this.b, ")");
        }
    }

    public static final class x implements osp {
        public final String a;

        public x(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("host", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && Intrinsics.g(this.a, ((x) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__http_auth_request";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("KycWebviewHttpAuthRequestEvent(host=", this.a, ")");
        }
    }

    public static final class y implements osp {
        public final String a;
        public final int b;

        public y(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("kyc_webview_stage", this.a), new Pair("http_status", Integer.valueOf(this.b)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return this.a.equals(yVar.a) && this.b == yVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__http_error";
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "KycWebviewHttpErrorEvent(stage=", this.a, ", httpStatus=", ")");
        }
    }

    public static final class z implements osp {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final String e;

        public z(String str, String str2, String str3, boolean z, boolean z2) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
            this.e = str3;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("url", this.a), new Pair("method", this.b), new Pair("is_redirect", Boolean.valueOf(this.c)), new Pair("is_main_frame", Boolean.valueOf(this.d)), new Pair("entry_source", this.e));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return Intrinsics.g(this.a, zVar.a) && Intrinsics.g(this.b, zVar.b) && this.c == zVar.c && this.d == zVar.d && this.e.equals(zVar.e);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "kyc__webview__intercept_request";
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.e.hashCode() + mtg0.a(mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("KycWebviewInterceptRequestEvent(url=", this.a, ", method=", this.b, ", isRedirect=");
            nng.a(", isMainFrame=", ", entrySource=", sbA, this.c, this.d);
            return uf80.a(sbA, this.e, ")");
        }
    }
}
