package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public interface l41 {

    public static final class a implements l41 {
        public static final a a = new a();
        public static final ResourceUiText b = new ResourceUiText(R.string.page_withdraw__withdrawals_blocked);
        public static final ResourceUiText c = new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip);
        public static final ResourceUiText d = new ResourceUiText(R.string.identity_verification__verify);

        @Override // defpackage.l41
        public final UiText a() {
            return d;
        }

        @Override // defpackage.l41
        public final UiText b() {
            return c;
        }

        @Override // defpackage.l41
        public final UiText getTitle() {
            return b;
        }
    }

    public static final class b implements l41 {
        public static final b a = new b();
        public static final ConcatUiText b = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new StringUiText("("), new ResourceUiText(R.string.page_payment__verification_failed), new StringUiText(")")});
        public static final ResourceUiText c = new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip);
        public static final ResourceUiText d = new ResourceUiText(R.string.common_functions__contact_us);

        @Override // defpackage.l41
        public final UiText a() {
            return d;
        }

        @Override // defpackage.l41
        public final UiText b() {
            return c;
        }

        @Override // defpackage.l41
        public final UiText getTitle() {
            return b;
        }
    }

    public static final class c implements l41 {
        public static final c a = new c();
        public static final ConcatUiText b = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new StringUiText("("), new ResourceUiText(R.string.page_transaction__pending_verification), new StringUiText(")")});
        public static final ResourceUiText c = new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip);
        public static final ResourceUiText d = new ResourceUiText(R.string.common_functions__ok);

        @Override // defpackage.l41
        public final UiText a() {
            return d;
        }

        @Override // defpackage.l41
        public final UiText b() {
            return c;
        }

        @Override // defpackage.l41
        public final UiText getTitle() {
            return b;
        }
    }

    public static final class d implements l41 {
        public static final d a = new d();
        public static final StringUiText b;
        public static final StringUiText c;
        public static final StringUiText d;

        static {
            StringUiText stringUiText = vch0.a;
            b = stringUiText;
            c = stringUiText;
            d = stringUiText;
        }

        @Override // defpackage.l41
        public final UiText a() {
            return d;
        }

        @Override // defpackage.l41
        public final UiText b() {
            return c;
        }

        @Override // defpackage.l41
        public final UiText getTitle() {
            return b;
        }
    }

    public static final class e implements l41 {
        public static final e a = new e();
        public static final StringUiText b;
        public static final StringUiText c;
        public static final StringUiText d;

        static {
            StringUiText stringUiText = vch0.a;
            b = stringUiText;
            c = stringUiText;
            d = stringUiText;
        }

        @Override // defpackage.l41
        public final UiText a() {
            return d;
        }

        @Override // defpackage.l41
        public final UiText b() {
            return c;
        }

        @Override // defpackage.l41
        public final UiText getTitle() {
            return b;
        }
    }

    UiText a();

    UiText b();

    UiText getTitle();
}
