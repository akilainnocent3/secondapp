package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.pay.EmbeddedFrame;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lexi0;", "Llrd;", "Lk9j;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class exi0 extends m7m implements k9j {
    public final String g0;
    public String h0;
    public final ga00 i0;
    public gxi0 j0;
    public final i6i0 k0;
    public final ee<Intent> l0;
    public static final /* synthetic */ ohp<Object>[] n0 = {new d630(0, exi0.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentWalletDocDepositBinding;")};
    public static final a m0 = new a();

    public static final class a {
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c100.values().length];
            try {
                c100 c100Var = c100.e;
                iArr[36] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c100 c100Var2 = c100.e;
                iArr[37] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c100 c100Var3 = c100.e;
                iArr[38] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<View, vyi> {
        public static final c a = new c(1, vyi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentWalletDocDepositBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final vyi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.alert_hint_view;
            HintView hintView = (HintView) h5e.a(R.id.alert_hint_view, view2);
            if (hintView != null) {
                i = R.id.amount;
                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, view2);
                if (clearEditText != null) {
                    i = R.id.amount_container;
                    if (((FrameLayout) h5e.a(R.id.amount_container, view2)) != null) {
                        i = R.id.amount_label;
                        TextView textView = (TextView) h5e.a(R.id.amount_label, view2);
                        if (textView != null) {
                            i = R.id.amount_warning;
                            TextView textView2 = (TextView) h5e.a(R.id.amount_warning, view2);
                            if (textView2 != null) {
                                i = R.id.balance;
                                TextView textView3 = (TextView) h5e.a(R.id.balance, view2);
                                if (textView3 != null) {
                                    i = R.id.balance_label;
                                    TextView textView4 = (TextView) h5e.a(R.id.balance_label, view2);
                                    if (textView4 != null) {
                                        i = R.id.deposit_banner_compose_view;
                                        ComposeView composeView = (ComposeView) h5e.a(R.id.deposit_banner_compose_view, view2);
                                        if (composeView != null) {
                                            i = R.id.deposit_button;
                                            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.deposit_button, view2);
                                            if (progressButton != null) {
                                                i = R.id.description_container;
                                                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.description_container, view2);
                                                if (linearLayout != null) {
                                                    i = R.id.kyc_hint;
                                                    TextView textView5 = (TextView) h5e.a(R.id.kyc_hint, view2);
                                                    if (textView5 != null) {
                                                        i = R.id.logo;
                                                        ImageView imageView = (ImageView) h5e.a(R.id.logo, view2);
                                                        if (imageView != null) {
                                                            i = R.id.quick_input;
                                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.quick_input, view2);
                                                            if (composeView2 != null) {
                                                                return new vyi((ConstraintLayout) view2, hintView, clearEditText, textView, textView2, textView3, textView4, composeView, progressButton, linearLayout, textView5, imageView, composeView2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public exi0() {
        super(R.layout.fragment_wallet_doc_deposit);
        this.e0 = false;
        this.f0 = false;
        this.g0 = String.valueOf(290);
        c100 c100Var = c100.e;
        this.h0 = String.valueOf(29004);
        this.i0 = ga00.DEPOSIT;
        this.k0 = g5e.a(c.a);
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: dxi0
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // defpackage.ud
            public final void a(Object obj) {
                String upperCase;
                ActivityResult activityResult = (ActivityResult) obj;
                exi0.a aVar = exi0.m0;
                activityResult.getClass();
                Intent intent = activityResult.b;
                String stringExtra = intent != null ? intent.getStringExtra(AnalyticsParam.EVENT_STATUS) : null;
                if (stringExtra != null) {
                    upperCase = stringExtra.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                } else {
                    upperCase = null;
                }
                if (upperCase != null) {
                    int iHashCode = upperCase.hashCode();
                    exi0 exi0Var = this.a;
                    switch (iHashCode) {
                        case -1466757626:
                            if (!upperCase.equals("TIMED_OUT")) {
                                return;
                            }
                            break;
                        case -1149187101:
                            if (upperCase.equals("SUCCESS")) {
                                vgb0.a(AnalyticsEvent.DEPOSIT);
                                r9e r9eVarH1 = exi0Var.h1();
                                ej5.c(o8i0.d(r9eVarH1), null, null, new q9e(r9eVarH1, null), 3);
                                lrd.z1(exi0Var, null, null, null, 31);
                                return;
                            }
                            return;
                        case 659453081:
                            if (!upperCase.equals("CANCELED")) {
                                return;
                            }
                            break;
                        case 2066319421:
                            if (!upperCase.equals("FAILED")) {
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                    exi0Var.S0(r700.a, null);
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.l0 = eeVarRegisterForActivityResult;
    }

    @Override // defpackage.c000
    public final TextView C0() {
        return D1().z;
    }

    public final vyi D1() {
        return (vyi) this.k0.a(this, n0[0]);
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final ga00 getI0() {
        return this.i0;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final String getG0() {
        return this.g0;
    }

    @Override // defpackage.c000
    public final HintView I0() {
        return D1().b;
    }

    @Override // defpackage.lrd
    public final TextView b1() {
        return D1().d;
    }

    @Override // defpackage.lrd
    public final TextView c1() {
        return D1().e;
    }

    @Override // defpackage.lrd
    public final TextView d1() {
        return D1().f;
    }

    @Override // defpackage.lrd
    public final TextView e1() {
        return D1().i;
    }

    @Override // defpackage.lrd
    public final ComposeView f1() {
        return D1().v;
    }

    @Override // defpackage.lrd
    public final ProgressButton g1() {
        return D1().w;
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: i1, reason: from getter */
    public final String getH0() {
        return this.h0;
    }

    @Override // defpackage.lrd
    public final ComposeView m1() {
        return D1().B;
    }

    @Override // defpackage.lrd
    public final String n1() {
        return this.h0;
    }

    @Override // defpackage.lrd, defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("CHANNEL_ID")) != null) {
            this.h0 = string;
        }
        int i = Integer.parseInt(this.h0);
        c100 c100Var = c100.e;
        ee<Intent> eeVar = this.l0;
        if (i == 29001 || i == 29004) {
            if (this.j0 == null) {
                Intrinsics.n("walletDocLauncher");
                throw null;
            }
            requireActivity().getClass();
            eeVar.getClass();
            return;
        }
        if (i == 29002 || i == 29003 || i == 29005 || i == 29006) {
            if (this.j0 == null) {
                Intrinsics.n("walletDocLauncher");
                throw null;
            }
            requireActivity().getClass();
            eeVar.getClass();
        }
    }

    @Override // defpackage.lrd
    public final boolean p1(x7e x7eVar) {
        x7eVar.getClass();
        if (!(x7eVar instanceof x7e.b.l)) {
            if (!(x7eVar instanceof x7e.d.o)) {
                return false;
            }
            A1();
            c000.p0(this, sn5.d(this, R.string.page_payment__pending_request, new Object[0]), sn5.d(this, R.string.page_payment__you_deposit_request_has_been_submitted_tip, new Object[0]), null, new n2f(1), null, null, 116);
            return true;
        }
        x7e.b.l lVar = (x7e.b.l) x7eVar;
        this.X = lVar.b;
        EmbeddedFrame embeddedFrame = lVar.c;
        String transactionId = embeddedFrame.getTransactionId();
        String clientKey = embeddedFrame.getClientKey();
        if (transactionId == null || clientKey == null) {
            zyf0.c(1, sn5.d(this, R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, new Object[0]));
            return true;
        }
        int i = Integer.parseInt(this.h0);
        c100 c100Var = c100.e;
        if (i == 29001 || i == 29004) {
            if (this.j0 == null) {
                Intrinsics.n("walletDocLauncher");
                throw null;
            }
        } else if (i == 29002 || i == 29005 || i == 29003 || i == 29006) {
            if (this.j0 == null) {
                Intrinsics.n("walletDocLauncher");
                throw null;
            }
            requireActivity().getClass();
            this.l0.getClass();
            return true;
        }
        return true;
    }

    @Override // defpackage.c000
    public final ClearEditText r0() {
        return D1().c;
    }

    @Override // defpackage.lrd
    public final void r1() {
        super.r1();
        k1().e(D1().w, "deposit__top_up_now__btn");
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0 */
    public final String getE0() {
        return this.h0;
    }

    @Override // defpackage.c000
    public final View w0() {
        return D1().w;
    }

    @Override // defpackage.lrd
    public final String w1(BankTradeData bankTradeData) {
        c100 c100Var = (c100) this.Y.getValue();
        return String.valueOf(c100Var != null ? c100Var.b : null);
    }

    @Override // defpackage.lrd
    public final void x1() {
        Integer num;
        mpe0 mpe0Var = this.Y;
        c100 c100Var = (c100) mpe0Var.getValue();
        if (c100Var != null) {
            int i = c100Var.c;
            ImageView imageView = D1().A;
            c100 c100Var2 = (c100) mpe0Var.getValue();
            int i2 = c100Var2 == null ? -1 : b.a[c100Var2.ordinal()];
            if (i2 != 1) {
                num = (i2 == 2 || i2 == 3) ? 124 : null;
            } else {
                num = 114;
            }
            Q0(imageView, i, num);
        }
    }

    @Override // defpackage.c000
    public final View y0() {
        return D1().y;
    }
}
