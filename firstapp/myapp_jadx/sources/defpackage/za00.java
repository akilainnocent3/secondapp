package defpackage;

import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sportybet.android.globalpay.jumpbank.JumpBankActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lza00;", "Llrd;", "Lk9j;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class za00 extends gzl implements k9j {
    public final String g0;
    public final String h0;
    public final ga00 i0;
    public final i6i0 j0;
    public final ee<Intent> k0;
    public static final /* synthetic */ ohp<Object>[] m0 = {new d630(0, za00.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentPeachCardDepositBinding;")};
    public static final a l0 = new a();

    public static final class a {
    }

    public static final /* synthetic */ class b extends saj implements Function1<View, hxi> {
        public static final b a = new b(1, hxi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentPeachCardDepositBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final hxi invoke(View view) {
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
                                                        if (((ImageView) h5e.a(R.id.logo, view2)) != null) {
                                                            i = R.id.quick_input;
                                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.quick_input, view2);
                                                            if (composeView2 != null) {
                                                                return new hxi(linearLayout, textView, textView2, textView3, textView4, textView5, composeView, composeView2, (ConstraintLayout) view2, clearEditText, hintView, progressButton);
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

    public za00() {
        super(R.layout.fragment_peach_card_deposit);
        this.e0 = false;
        this.f0 = false;
        this.g0 = String.valueOf(270);
        c100 c100Var = c100.e;
        this.h0 = String.valueOf(27001);
        this.i0 = ga00.DEPOSIT;
        this.j0 = g5e.a(b.a);
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: ya00
            @Override // defpackage.ud
            public final void a(Object obj) {
                za00.a aVar = za00.l0;
                ((ActivityResult) obj).getClass();
                za00 za00Var = this.a;
                r9e r9eVarH1 = za00Var.h1();
                ej5.c(o8i0.d(r9eVarH1), null, null, new q9e(r9eVarH1, null), 3);
                FragmentManager childFragmentManager = za00Var.getChildFragmentManager();
                c100 c100Var2 = c100.e;
                ble.b(childFragmentManager, za00Var, R.string.page_payment__after_deposit_on_the_vprovider_please_press_ok_tip, "Peach", Boolean.TRUE);
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.k0 = eeVarRegisterForActivityResult;
    }

    @Override // defpackage.c000
    public final TextView C0() {
        return D1().z;
    }

    public final hxi D1() {
        return (hxi) this.j0.a(this, m0[0]);
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

    @Override // defpackage.c000, a92.a
    public final void L() {
        String str = this.X;
        if (str != null) {
            h1().f.b(str);
        }
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
    public final String i1() {
        return "8";
    }

    @Override // defpackage.lrd
    public final ComposeView m1() {
        return D1().A;
    }

    @Override // defpackage.lrd
    public final String n1() {
        return "8";
    }

    @Override // defpackage.lrd
    public final void q1(x7e.b.d dVar) {
        Intent intent = new Intent(getContext(), (Class<?>) JumpBankActivity.class);
        intent.putExtra("JUMP_URL", dVar.c);
        this.k0.b(intent);
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
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final String getH0() {
        return this.h0;
    }

    @Override // defpackage.c000
    public final View w0() {
        return D1().w;
    }

    @Override // defpackage.lrd
    public final String w1(BankTradeData bankTradeData) {
        String str;
        String str2;
        String str3 = null;
        if (bankTradeData == null || (str = bankTradeData.counterAuthority) == null) {
            c100 c100Var = (c100) this.Y.getValue();
            str = c100Var != null ? c100Var.b : null;
        }
        BankTradeResponse bankTradeResponse = this.M;
        if (bankTradeResponse != null && (str2 = bankTradeResponse.counterPart) != null) {
            str3 = str2;
        } else if (bankTradeData != null) {
            str3 = bankTradeData.counterPart;
        }
        return v70.b(str, " (", str3, ")");
    }

    @Override // defpackage.c000
    public final View y0() {
        return D1().y;
    }

    @Override // defpackage.lrd
    public final void x1() {
    }
}
