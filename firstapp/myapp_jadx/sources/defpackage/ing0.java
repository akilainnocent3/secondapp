package defpackage;

import android.accounts.Account;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CountdownButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ling0;", "Landroidx/fragment/app/d;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ing0 extends m5m implements View.OnClickListener {
    public l9h f;
    public final q8i0 i;

    public static final class a {
        public static final void a(t62 t62Var, FragmentManager fragmentManager, String str, Bundle bundle) {
            bundle.getClass();
            TradeAdditionalResult tradeAdditionalResult = Build.VERSION.SDK_INT >= 33 ? (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT", TradeAdditionalResult.class) : (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT");
            if (tradeAdditionalResult == null) {
                tradeAdditionalResult = new TradeAdditionalResult(null, 16383);
            }
            t62Var.invoke(tradeAdditionalResult);
            fragmentManager.g("REQUEST_KEY_TRADE_ADDITIONAL_SMS");
            fragmentManager.f("REQUEST_KEY_TRADE_ADDITIONAL_SMS");
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ing0.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ing0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ing0() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.i = new q8i0(jq40.a(sng0.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        int id = view.getId();
        if (id == R.id.close) {
            getParentFragmentManager().m0("REQUEST_KEY_TRADE_ADDITIONAL_SMS", vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", new TradeAdditionalResult(sn5.d(this, R.string.common_otp_verify__we_have_not_received_your_sms_tip, new Object[0]), 16382))));
            dismissAllowingStateLoss();
            return;
        }
        q8i0 q8i0Var = this.i;
        if (id == R.id.next) {
            sng0 sng0Var = (sng0) q8i0Var.getValue();
            ej5.c(o8i0.d(sng0Var), null, null, new png0(sng0Var.d, sng0Var, null), 3);
        } else if (id == R.id.countdown) {
            sng0 sng0Var2 = (sng0) q8i0Var.getValue();
            ej5.c(o8i0.d(sng0Var2), null, null, new qng0(sng0Var2, null), 3);
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.failed_verify_identity_dialog, (ViewGroup) null, false);
        int i = R.id.close;
        ImageView imageView = (ImageView) h5e.a(R.id.close, viewInflate);
        if (imageView != null) {
            i = R.id.content;
            TextView textView = (TextView) h5e.a(R.id.content, viewInflate);
            if (textView != null) {
                i = R.id.edit_text;
                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.edit_text, viewInflate);
                if (clearEditText != null) {
                    i = R.id.error;
                    TextView textView2 = (TextView) h5e.a(R.id.error, viewInflate);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.next;
                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                        if (progressButton != null) {
                            i = R.id.resend;
                            CountdownButton countdownButton = (CountdownButton) h5e.a(R.id.resend, viewInflate);
                            if (countdownButton != null) {
                                i = R.id.title;
                                if (((TextView) h5e.a(R.id.title, viewInflate)) != null) {
                                    this.f = new l9h(constraintLayout, imageView, textView, clearEditText, textView2, constraintLayout, progressButton, countdownButton);
                                    Context contextRequireContext = requireContext();
                                    contextRequireContext.getClass();
                                    bo8 bo8Var = new bo8(contextRequireContext, 0);
                                    bo8Var.requestWindowFeature(1);
                                    l9h l9hVar = this.f;
                                    if (l9hVar == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ConstraintLayout constraintLayout2 = l9hVar.a;
                                    constraintLayout2.getClass();
                                    bo8Var.setContentView(constraintLayout2);
                                    Window window = bo8Var.getWindow();
                                    if (window != null) {
                                        WindowManager.LayoutParams attributes = window.getAttributes();
                                        attributes.width = -1;
                                        attributes.height = -2;
                                        window.setAttributes(attributes);
                                    }
                                    bo8Var.setCanceledOnTouchOutside(false);
                                    bo8Var.setCancelable(false);
                                    as1.a(bo8Var);
                                    l9h l9hVar2 = this.f;
                                    if (l9hVar2 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ProgressButton progressButton2 = l9hVar2.i;
                                    ClearEditText clearEditText2 = l9hVar2.d;
                                    clearEditText2.setErrorView(l9hVar2.e);
                                    clearEditText2.setTextChangedListener(new ClearEditText.b() { // from class: hng0
                                        @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
                                        public final void l(CharSequence charSequence) {
                                            String string;
                                            String string2;
                                            if (charSequence == null || (string2 = charSequence.toString()) == null || (string = StringsKt.t0(string2).toString()) == null) {
                                                string = "";
                                            }
                                            sng0 sng0Var = (sng0) this.a.i.getValue();
                                            wwd0 wwd0Var = sng0Var.f;
                                            wwd0Var.getClass();
                                            wwd0Var.k(null, string);
                                            sng0Var.v.setValue(null);
                                        }
                                    });
                                    clearEditText2.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
                                    clearEditText2.setRawInputType(2);
                                    progressButton2.setEnabled(false);
                                    progressButton2.setButtonText(R.string.page_withdraw__complete_withdrawal);
                                    progressButton2.setOnClickListener(this);
                                    l9hVar2.v.setOnClickListener(this);
                                    l9hVar2.b.setOnClickListener(this);
                                    l9hVar2.f.setOnClickListener(this);
                                    q8i0 q8i0Var = this.i;
                                    sng0 sng0Var = (sng0) q8i0Var.getValue();
                                    l9h l9hVar3 = this.f;
                                    if (l9hVar3 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    TextView textView3 = l9hVar3.c;
                                    Account account = ((sng0) q8i0Var.getValue()).c.getAccount();
                                    textView3.setText(sn5.d(this, R.string.common_otp_verify__we_have_sent_you_a_vnum_digit_code_to_vcountrycode_vphone_line_up, account != null ? account.name : null));
                                    g1i g1iVar = new g1i(sng0Var.i, new jng0(this, null));
                                    s9s lifecycle = getLifecycle();
                                    lifecycle.getClass();
                                    s9s.b bVar = s9s.b.d;
                                    arr.a(g1iVar, lifecycle, bVar);
                                    g1i g1iVar2 = new g1i(sng0Var.w, new kng0(this, null));
                                    s9s lifecycle2 = getLifecycle();
                                    lifecycle2.getClass();
                                    arr.a(g1iVar2, lifecycle2, bVar);
                                    g1i g1iVar3 = new g1i(sng0Var.z, new lng0(this, null));
                                    s9s lifecycle3 = getLifecycle();
                                    lifecycle3.getClass();
                                    arr.a(g1iVar3, lifecycle3, bVar);
                                    g1i g1iVar4 = new g1i(sng0Var.B, new mng0(this, null));
                                    s9s lifecycle4 = getLifecycle();
                                    lifecycle4.getClass();
                                    arr.a(g1iVar4, lifecycle4, bVar);
                                    g1i g1iVar5 = new g1i(sng0Var.D, new nng0(this, null));
                                    s9s lifecycle5 = getLifecycle();
                                    lifecycle5.getClass();
                                    arr.a(g1iVar5, lifecycle5, bVar);
                                    Bundle arguments = getArguments();
                                    String string = arguments != null ? arguments.getString("ARG_TRADE_ID") : null;
                                    Bundle arguments2 = getArguments();
                                    String string2 = arguments2 != null ? arguments2.getString("ARG_SMS_TOKEN") : null;
                                    sng0Var.d = string;
                                    sng0Var.e = string2;
                                    return bo8Var;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
