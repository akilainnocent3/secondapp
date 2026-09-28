package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes5.dex */
public interface vnj0 {

    public static abstract class a implements vnj0 {
        public final ResourceUiText a = new ResourceUiText(R.string.common_functions__ok);

        /* JADX INFO: renamed from: vnj0$a$a, reason: collision with other inner class name */
        public static final class C1217a extends a {
            public static final C1217a b = new C1217a();
            public static final ResourceUiText c = new ResourceUiText(R.string.page_payment__pending_request);
            public static final ResourceUiText d = new ResourceUiText(R.string.page_payment__your_withdrawal_request_has_been_submitted_tip_pix);

            @Override // vnj0.a
            public final UiText a() {
                return d;
            }

            @Override // vnj0.a
            public final UiText d() {
                return c;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1217a);
            }

            public final int hashCode() {
                return 696397727;
            }

            public final String toString() {
                return "CheckPendingRequestLater";
            }
        }

        public static final class b extends a {
            public final UiText b;
            public final ResourceUiText c = new ResourceUiText(R.string.common_functions__continue);
            public final d d = d.c;

            public b(UiText uiText) {
                this.b = uiText;
            }

            @Override // vnj0.a
            public final UiText a() {
                return this.b;
            }

            @Override // vnj0.a
            public final d b() {
                return this.d;
            }

            @Override // vnj0.a
            public final ResourceUiText c() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return xh8.a(this.b, "ManuallyWithdraw(message=", ")");
            }
        }

        public static final class c extends a {
            public static final c b = new c();
            public static final ResourceUiText c = new ResourceUiText(R.string.page_payment__pending_request);
            public static final ResourceUiText d = new ResourceUiText(R.string.page_withdraw__your_account_is_under_review_to_ensure_safety_and_security);
            public static final d e = d.b;

            @Override // vnj0.a
            public final UiText a() {
                return d;
            }

            @Override // vnj0.a
            public final d b() {
                return e;
            }

            @Override // vnj0.a
            public final UiText d() {
                return c;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1308214557;
            }

            public final String toString() {
                return "NeedRiskAudit";
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public enum d {
            b(Chyeyik.kSNOYmFzPLHd),
            c("CANCEL"),
            d("TRANSACTIONS"),
            e("CONTACT_CUSTOMER_SERVICE");

            public final ResourceUiText a;

            d(String str) {
                this.a = resourceUiText;
            }
        }

        public static final class e extends a {
            public static final e b = new e();
            public static final ResourceUiText c = new ResourceUiText(R.string.page_payment__pending_request);
            public static final ResourceUiText d = new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again);

            @Override // vnj0.a
            public final UiText a() {
                return d;
            }

            @Override // vnj0.a
            public final UiText d() {
                return c;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1827883331;
            }

            public final String toString() {
                return "PendingRequestError";
            }
        }

        public static final class f extends a {
            public static final f b = new f();
            public static final ResourceUiText c = new ResourceUiText(R.string.page_payment__pending_request);
            public static final ResourceUiText d = new ResourceUiText(R.string.common_payment_providers__pending_request_content);
            public static final d e = d.d;

            @Override // vnj0.a
            public final UiText a() {
                return d;
            }

            @Override // vnj0.a
            public final d b() {
                return e;
            }

            @Override // vnj0.a
            public final UiText d() {
                return c;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -686178833;
            }

            public final String toString() {
                return "WaitingConfirmation";
            }
        }

        public static final class g extends a {
            public final UiText b;
            public final ResourceUiText c = new ResourceUiText(R.string.page_withdraw__withdrawals_blocked);
            public final ResourceUiText d = new ResourceUiText(R.string.common_functions__home);
            public final d e = d.d;

            public g(UiText uiText) {
                this.b = uiText;
            }

            @Override // vnj0.a
            public final UiText a() {
                return this.b;
            }

            @Override // vnj0.a
            public final d b() {
                return this.e;
            }

            @Override // vnj0.a
            public final ResourceUiText c() {
                return this.d;
            }

            @Override // vnj0.a
            public final UiText d() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.g(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return xh8.a(this.b, "WithdrawGreylistNeedBets(message=", ")");
            }
        }

        public static final class h extends a {
            public final UiText b;
            public final ResourceUiText c = new ResourceUiText(R.string.page_withdraw__withdrawals_blocked);
            public final ResourceUiText d = new ResourceUiText(R.string.common_functions__home);
            public final d e = d.e;

            public h(UiText uiText) {
                this.b = uiText;
            }

            @Override // vnj0.a
            public final UiText a() {
                return this.b;
            }

            @Override // vnj0.a
            public final d b() {
                return this.e;
            }

            @Override // vnj0.a
            public final ResourceUiText c() {
                return this.d;
            }

            @Override // vnj0.a
            public final UiText d() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && Intrinsics.g(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return xh8.a(this.b, "WithdrawGreylisted(message=", ")");
            }
        }

        public abstract UiText a();

        public d b() {
            return null;
        }

        public ResourceUiText c() {
            return this.a;
        }

        public UiText d() {
            return null;
        }
    }

    public static final class b implements vnj0 {
        public final ResourceUiText a;

        public b(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oe90.a(this.a, "OverLimitDialogState(description=", ")");
        }
    }
}
