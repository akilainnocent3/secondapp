package com.sportybet.feature.facialrecognition.presentation;

import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.international.data.model.FacialRecognitionStatusResponse;
import defpackage.ekc;
import defpackage.gmf0;
import defpackage.kpu;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.pdd0;
import defpackage.tx5;
import defpackage.uag;
import defpackage.uf80;
import defpackage.ux5;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface a extends pdd0 {

    /* JADX INFO: renamed from: com.sportybet.feature.facialrecognition.presentation.a$a, reason: collision with other inner class name */
    public static final class C0360a implements a {
        public final String a;
        public final k b;
        public final l c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public C0360a(String str, k kVar, l lVar, boolean z, boolean z2, boolean z3, boolean z4) {
            str.getClass();
            this.a = str;
            this.b = kVar;
            this.c = lVar;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("flow_id", this.a), new Pair("method", this.b.a), new Pair(AnalyticsParam.EVENT_STREAM_PROVIDER, this.c.a), new Pair("has_launched_fr", Boolean.valueOf(this.d)), new Pair("awaiting_unico_callback", Boolean.valueOf(this.e)), new Pair("is_finishing", Boolean.valueOf(this.f)), new Pair("is_changing_configurations", Boolean.valueOf(this.g)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0360a)) {
                return false;
            }
            C0360a c0360a = (C0360a) obj;
            return Intrinsics.g(this.a, c0360a.a) && this.b == c0360a.b && this.c == c0360a.c && this.d == c0360a.d && this.e == c0360a.e && this.f == c0360a.f && this.g == c0360a.g;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "fr_activity_lifecycle";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + mtg0.a(mtg0.a(mtg0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActivityLifecycle(flowId=");
            sb.append(this.a);
            sb.append(", method=");
            sb.append(this.b);
            sb.append(", provider=");
            sb.append(this.c);
            sb.append(", hasLaunchedFacialRecognition=");
            sb.append(this.d);
            sb.append(", awaitingUnicoCallback=");
            nng.a(", isFinishing=", ", isChangingConfigurations=", sb, this.e, this.f);
            return mq0.a(sb, this.g, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum b {
        AppLink("app_link"),
        CustomScheme("custom_scheme"),
        Restore("restore"),
        /* JADX INFO: Fake field, exist only in values array */
        Unknown("unknown");

        public final String a;

        b(String str) {
            this.a = str;
        }
    }

    public static final class c implements a {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            l.C0361a c0361a = l.b;
            String str = this.a;
            return kpu.d(ekc.a(str, "flow_id", str), new Pair(UserCertConstants.CONFIRM_NAME_USAGE, this.b), new Pair(AnalyticsParam.EVENT_STREAM_PROVIDER, "legitimuz"));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b.equals(cVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "fr_cloudflare_preloaded";
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("CloudflarePreloaded(flowId=", this.a, ", usage=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum d {
        SessionTokenRequestFailed("session_token_request_failed"),
        MaxDailyAttemptReached("max_daily_attempt_reached"),
        MissingCaptchaAction("missing_captcha_action"),
        CloudflareFailure("cloudflare_failure"),
        MissingSessionToken("missing_session_token"),
        SdkUnavailable("sdk_unavailable"),
        BrowserUnavailable("browser_unavailable"),
        ExternalResultUnexpected("external_result_unexpected"),
        UserReturnedWithoutCallback("user_returned_without_callback"),
        StatusPollNoResult("status_poll_no_result"),
        StatusPollResponseError("status_poll_response_error"),
        /* JADX INFO: Fake field, exist only in values array */
        Unknown("unknown");

        public final String a;

        d(String str) {
            this.a = str;
        }
    }

    public static final class e implements a {
        public final String a;
        public final String b;
        public final String c;

        public e(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            l.C0361a c0361a = l.b;
            String str = this.a;
            HashMap<String, Object> mapD = kpu.d(ekc.a(str, "flow_id", str), new Pair(UserCertConstants.CONFIRM_NAME_USAGE, this.b), new Pair(AnalyticsParam.EVENT_STREAM_PROVIDER, "unico"));
            String str2 = this.c;
            if (str2 != null) {
                mapD.put("redirect_host", str2);
            }
            return mapD;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && this.b.equals(eVar.b) && Intrinsics.g(this.c, eVar.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "fr_external_browser_launched";
        }

        public final int hashCode() {
            int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return uf80.a(ux5.a("ExternalBrowserLaunched(flowId=", this.a, ", usage=", this.b, ", redirectHost="), this.c, ")");
        }
    }

    public static final class f implements a {
        public final String a;
        public final String b;
        public final l c;
        public final b d;

        public f(String str, String str2, l lVar, b bVar) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = lVar;
            this.d = bVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            String str = this.a;
            HashMap<String, Object> mapD = kpu.d(ekc.a(str, "flow_id", str), new Pair(UserCertConstants.CONFIRM_NAME_USAGE, this.b), new Pair(AnalyticsParam.EVENT_STREAM_PROVIDER, this.c.a));
            b bVar = this.d;
            if (bVar != null) {
                mapD.put("callback_type", bVar.a);
            }
            return mapD;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && this.b.equals(fVar.b) && this.c == fVar.c && this.d == fVar.d;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "fr_external_verification_returned";
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
            b bVar = this.d;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("ExternalVerificationReturned(flowId=", this.a, ", usage=", this.b, ", provider=");
            sbA.append(this.c);
            sbA.append(", callbackType=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class g implements a {
        public final String a;
        public final String b;
        public final l c;
        public final String d;

        public g(String str, String str2, l lVar, String str3) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = lVar;
            this.d = str3;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            String str = this.a;
            HashMap<String, Object> mapD = kpu.d(ekc.a(str, "flow_id", str), new Pair(UserCertConstants.CONFIRM_NAME_USAGE, this.b), new Pair(AnalyticsParam.EVENT_STREAM_PROVIDER, this.c.a));
            String str2 = this.d;
            if (str2 != null) {
                mapD.put("redirect_host", str2);
            }
            return mapD;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.g(this.a, gVar.a) && this.b.equals(gVar.b) && this.c == gVar.c && Intrinsics.g(this.d, gVar.d);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "fr_external_verification_started";
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("ExternalVerificationStarted(flowId=", this.a, ", usage=", this.b, ", provider=");
            sbA.append(this.c);
            sbA.append(", redirectHost=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class h implements a {
        public final String a;
        public final String b;
        public final l c;
        public final j d;
        public final d e;

        public h(String str, String str2, l lVar, j jVar, d dVar) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = lVar;
            this.d = jVar;
            this.e = dVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            String str = this.a;
            HashMap<String, Object> mapD = kpu.d(ekc.a(str, "flow_id", str), new Pair(UserCertConstants.CONFIRM_NAME_USAGE, this.b), new Pair(AnalyticsParam.EVENT_STREAM_PROVIDER, this.c.a));
            mapD.put("fr_status", this.d.a);
            d dVar = this.e;
            if (dVar != null) {
                mapD.put("error_reason", dVar.a);
            }
            return mapD;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.g(this.a, hVar.a) && this.b.equals(hVar.b) && this.c == hVar.c && this.d == hVar.d && this.e == hVar.e;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "fr_flow_finished";
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
            d dVar = this.e;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("FlowFinished(flowId=", this.a, ", usage=", this.b, ", provider=");
            sbA.append(this.c);
            sbA.append(", frStatus=");
            sbA.append(this.d);
            sbA.append(", errorReason=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class i implements a {
        public final String a;
        public final String b;

        public i(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("flow_id", this.a), new Pair(UserCertConstants.CONFIRM_NAME_USAGE, this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.g(this.a, iVar.a) && this.b.equals(iVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "fr_flow_started";
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("FlowStarted(flowId=", this.a, ", usage=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum j {
        Approved(FacialRecognitionStatusResponse.STATUS_APPROVED),
        Rejected("rejected"),
        CanceledByUser("canceled_by_user"),
        CouldNotInitializeSdk("could_not_initialize_sdk"),
        CouldNotGetSessionToken("could_not_get_session_token"),
        CouldNotConfirmResult("could_not_confirm_result"),
        MaxDailyAttemptReached("max_daily_attempt_reached"),
        CloudflareError("cloudflare_error"),
        UnknownError("unknown_error");

        public final String a;

        j(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum k {
        OnCreate("on_create"),
        OnNewIntent("on_new_intent"),
        OnResume("on_resume"),
        OnStop("on_stop"),
        OnDestroy("on_destroy");

        public final String a;

        k(String str) {
            this.a = str;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.sportybet.feature.facialrecognition.presentation.a$l[], still in use, count: 1, list:
      (r0v1 com.sportybet.feature.facialrecognition.presentation.a$l[]) from 0x002c: CONSTRUCTOR (r0v1 com.sportybet.feature.facialrecognition.presentation.a$l[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:45) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class l {
        Unknown("unknown"),
        Unico("unico"),
        Legitimuz("legitimuz");

        public static final C0361a b = new C0361a();
        public static final /* synthetic */ uag i;
        public final String a;

        /* JADX INFO: renamed from: com.sportybet.feature.facialrecognition.presentation.a$l$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes6.dex */
        public static final class C0361a {
        }

        static {
            i = new uag(new l[]{r0, r1, r2});
        }

        public l(String str) {
            super(str, i);
            this.a = str;
        }

        public static l valueOf(String str) {
            return (l) Enum.valueOf(l.class, str);
        }

        public static l[] values() {
            return (l[]) f.clone();
        }
    }

    public static final class m implements a {
        public final String a;
        public final String b;

        public m(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            l.C0361a c0361a = l.b;
            String str = this.a;
            return kpu.d(ekc.a(str, "flow_id", str), new Pair(UserCertConstants.CONFIRM_NAME_USAGE, this.b), new Pair(AnalyticsParam.EVENT_STREAM_PROVIDER, "unico"));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Intrinsics.g(this.a, mVar.a) && this.b.equals(mVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "fr_retry_started";
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("RetryStarted(flowId=", this.a, ", usage=", this.b, ")");
        }
    }

    public static final class n implements a {
        public final String a;
        public final String b;
        public final l c;

        public n(String str, String str2, l lVar) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = lVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            String str = this.a;
            return kpu.d(ekc.a(str, "flow_id", str), new Pair(UserCertConstants.CONFIRM_NAME_USAGE, this.b), new Pair(AnalyticsParam.EVENT_STREAM_PROVIDER, this.c.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.g(this.a, nVar.a) && this.b.equals(nVar.b) && this.c == nVar.c;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "fr_session_token_received";
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("SessionTokenReceived(flowId=", this.a, ", usage=", this.b, ", provider=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }
}
