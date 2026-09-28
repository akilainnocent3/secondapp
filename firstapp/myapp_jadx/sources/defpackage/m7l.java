package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface m7l {

    public static final class a implements m7l {
        public static final a a = new a();
        public static final ResourceUiText b = new ResourceUiText(R.string.page_withdraw__withdrawals_blocked);
        public static final l7l.b c = new l7l.b(new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip));
        public static final i7l.a d = new i7l.a(new ResourceUiText(R.string.identity_verification__verify), new h7l.d());

        @Override // defpackage.m7l
        public final i7l a() {
            return d;
        }

        @Override // defpackage.m7l
        public final l7l b() {
            return c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // defpackage.m7l
        public final UiText getTitle() {
            return b;
        }

        public final int hashCode() {
            return 944493853;
        }

        public final String toString() {
            return "BlockAuditUiState";
        }
    }

    public static final class b implements m7l {
        public final String a;
        public final String b;
        public final ResourceUiText c = new ResourceUiText(R.string.page_withdraw__withdrawals_blocked);
        public final l7l.a d;
        public final i7l.a e;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
            Object[] objArr = {tug.a("^", str, "^")};
            StringUiText stringUiText = vch0.a;
            this.d = new l7l.a(new ResourceUiText(R.string.component_withdraw_block_tip__ai_reject_hint_content, ay0.S(objArr)), new h7l.c(str == null ? "" : str, str2 == null ? "" : str2));
            this.e = new i7l.a(new ResourceUiText(R.string.identity_verification__verify), new h7l.d());
        }

        @Override // defpackage.m7l
        public final i7l a() {
            return this.e;
        }

        @Override // defpackage.m7l
        public final l7l b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        @Override // defpackage.m7l
        public final UiText getTitle() {
            return this.c;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return tx5.a("BlockReasonAuditUiState(reasonTitle=", this.a, ", reason=", this.b, ")");
        }
    }

    public static final class c implements m7l {
        public static final c a = new c();
        public static final StringUiText b = new StringUiText("");
        public static final l7l.b c = new l7l.b(new StringUiText(""));
        public static final i7l.b d = i7l.b.a;

        @Override // defpackage.m7l
        public final i7l a() {
            return d;
        }

        @Override // defpackage.m7l
        public final l7l b() {
            return c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // defpackage.m7l
        public final UiText getTitle() {
            return b;
        }

        public final int hashCode() {
            return -1508044815;
        }

        public final String toString() {
            return "Gone";
        }
    }

    public static final class d implements m7l {
        public static final d a = new d();
        public static final ResourceUiText b = new ResourceUiText(R.string.page_withdraw__withdrawal_review_tip_title);
        public static final l7l.b c = new l7l.b(new ResourceUiText(R.string.page_withdraw__withdrawal_review_tip));
        public static final i7l.a d = new i7l.a(new ResourceUiText(R.string.common_functions__verify), h7l.f.a);

        @Override // defpackage.m7l
        public final i7l a() {
            return d;
        }

        @Override // defpackage.m7l
        public final l7l b() {
            return c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // defpackage.m7l
        public final UiText getTitle() {
            return b;
        }

        public final int hashCode() {
            return -1077725710;
        }

        public final String toString() {
            return "GrayListCanReleaseByNIN";
        }
    }

    public static final class e implements m7l {
        public final String a;
        public final StringUiText b;
        public final l7l.b c;
        public final i7l.a d;

        public e(String str) {
            str.getClass();
            this.a = str;
            this.b = new StringUiText("");
            this.c = new l7l.b(new ResourceUiText(R.string.identity_verification__name_update_approved_message));
            this.d = new i7l.a(new ResourceUiText(R.string.common_functions__confirm), new h7l.e(str));
        }

        @Override // defpackage.m7l
        public final i7l a() {
            return this.d;
        }

        @Override // defpackage.m7l
        public final l7l b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        @Override // defpackage.m7l
        public final UiText getTitle() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("NameUpdateApprove(data=", this.a, ")");
        }
    }

    public static final class f implements m7l {
        public static final f a = new f();
        public static final StringUiText b = new StringUiText("");
        public static final l7l.b c = new l7l.b(new ResourceUiText(R.string.page_withdraw__your_request_is_under_review_tip));
        public static final i7l.b d = i7l.b.a;

        @Override // defpackage.m7l
        public final i7l a() {
            return d;
        }

        @Override // defpackage.m7l
        public final l7l b() {
            return c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // defpackage.m7l
        public final UiText getTitle() {
            return b;
        }

        public final int hashCode() {
            return -1003292239;
        }

        public final String toString() {
            return "NameUpdatePending";
        }
    }

    public static final class g implements m7l {
        public final String a;
        public final String b;
        public final StringUiText c = new StringUiText("");
        public final l7l.a d;
        public final i7l.a e;

        public g(String str, String str2) {
            this.a = str;
            this.b = str2;
            Object[] objArr = {tug.a("^", str, "^")};
            StringUiText stringUiText = vch0.a;
            this.d = new l7l.a(new ResourceUiText(R.string.page_withdraw__your_request_is_rejected_tip, ay0.S(objArr)), new h7l.c(str, str2));
            this.e = new i7l.a(new ResourceUiText(R.string.identity_verification__verify), h7l.b.a);
        }

        @Override // defpackage.m7l
        public final i7l a() {
            return this.e;
        }

        @Override // defpackage.m7l
        public final l7l b() {
            return this.d;
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

        @Override // defpackage.m7l
        public final UiText getTitle() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("NameUpdateReject(reasonTitle=", this.a, ", reason=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class h implements m7l {
        public static final h a = new h();
        public static final ConcatUiText b = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new StringUiText("("), new ResourceUiText(R.string.page_payment__verification_failed), new StringUiText(LGxrN.MQQbSVi)});
        public static final l7l.b c = new l7l.b(new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip));
        public static final i7l.a d = new i7l.a(new ResourceUiText(R.string.common_functions__contact_us), h7l.a.a);

        @Override // defpackage.m7l
        public final i7l a() {
            return d;
        }

        @Override // defpackage.m7l
        public final l7l b() {
            return c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        @Override // defpackage.m7l
        public final UiText getTitle() {
            return b;
        }

        public final int hashCode() {
            return -413547220;
        }

        public final String toString() {
            return "VerificationFailedAuditUiState";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class i implements m7l {
        public static final i a = new i();
        public static final ConcatUiText b = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new StringUiText("("), new ResourceUiText(R.string.page_transaction__pending_verification), new StringUiText(")")});
        public static final l7l.b c = new l7l.b(new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip));
        public static final i7l.b d = i7l.b.a;

        @Override // defpackage.m7l
        public final i7l a() {
            return d;
        }

        @Override // defpackage.m7l
        public final l7l b() {
            return c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        @Override // defpackage.m7l
        public final UiText getTitle() {
            return b;
        }

        public final int hashCode() {
            return 199176332;
        }

        public final String toString() {
            return siPCzPFw.BofFLs;
        }
    }

    i7l a();

    l7l b();

    UiText getTitle();
}
