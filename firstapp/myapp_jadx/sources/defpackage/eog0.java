package defpackage;

import android.accounts.Account;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Leog0;", "Landroidx/fragment/app/d;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eog0 extends n5m implements View.OnClickListener {
    public m9h f;
    public final q8i0 i;
    public String v;
    public String w;
    public String y;

    public static final class a {
        public static final void a(u62 u62Var, FragmentManager fragmentManager, String str, Bundle bundle) {
            bundle.getClass();
            TradeAdditionalResult tradeAdditionalResult = Build.VERSION.SDK_INT >= 33 ? (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT", TradeAdditionalResult.class) : (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT");
            if (tradeAdditionalResult == null) {
                tradeAdditionalResult = new TradeAdditionalResult(null, 16383);
            }
            u62Var.invoke(tradeAdditionalResult);
            fragmentManager.g("REQUEST_KEY_TRADE_ADDITIONAL_UPSTREAM_SMS");
            fragmentManager.f("REQUEST_KEY_TRADE_ADDITIONAL_UPSTREAM_SMS");
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return eog0.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? eog0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public eog0() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.i = new q8i0(jq40.a(iog0.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        int id = view.getId();
        if (id == R.id.close) {
            getParentFragmentManager().m0("REQUEST_KEY_TRADE_ADDITIONAL_UPSTREAM_SMS", vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", new TradeAdditionalResult(sn5.d(this, R.string.common_otp_verify__we_have_not_received_your_sms_tip, new Object[0]), 16382))));
            dismissAllowingStateLoss();
        } else if (id == R.id.next) {
            iog0 iog0Var = (iog0) this.i.getValue();
            ej5.c(o8i0.d(iog0Var), null, null, new jog0(iog0Var.d, iog0Var.e, iog0Var, null), 3);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.v = arguments != null ? arguments.getString("ARG_TRADE_ID") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getString("ARG_SMS_TOKEN");
        }
        Bundle arguments3 = getArguments();
        this.w = arguments3 != null ? arguments3.getString("ARG_TARGET_PHONE_NUMBER") : null;
        Bundle arguments4 = getArguments();
        this.y = arguments4 != null ? arguments4.getString("ARG_SMS_CODE") : null;
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.failed_verify_identity_shangxing_dialog, (ViewGroup) null, false);
        int i = R.id.checkbox;
        CheckBox checkBox = (CheckBox) h5e.a(R.id.checkbox, viewInflate);
        if (checkBox != null) {
            i = R.id.close;
            ImageView imageView = (ImageView) h5e.a(R.id.close, viewInflate);
            if (imageView != null) {
                i = R.id.content;
                TextView textView = (TextView) h5e.a(R.id.content, viewInflate);
                if (textView != null) {
                    i = R.id.error;
                    if (((TextView) h5e.a(R.id.error, viewInflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.next;
                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                        if (progressButton != null) {
                            i = R.id.sms;
                            TextView textView2 = (TextView) h5e.a(R.id.sms, viewInflate);
                            if (textView2 != null) {
                                i = R.id.title;
                                if (((TextView) h5e.a(R.id.title, viewInflate)) != null) {
                                    this.f = new m9h(constraintLayout, checkBox, imageView, textView, constraintLayout, progressButton, textView2);
                                    Context contextRequireContext = requireContext();
                                    contextRequireContext.getClass();
                                    bo8 bo8Var = new bo8(contextRequireContext, 0);
                                    bo8Var.requestWindowFeature(1);
                                    m9h m9hVar = this.f;
                                    if (m9hVar == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ConstraintLayout constraintLayout2 = m9hVar.a;
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
                                    m9h m9hVar2 = this.f;
                                    if (m9hVar2 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ProgressButton progressButton2 = m9hVar2.f;
                                    m9hVar2.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: dog0
                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                            compoundButton.getClass();
                                            osa0.a(z, ((iog0) this.a.i.getValue()).f, null);
                                        }
                                    });
                                    m9hVar2.i.setText(this.y);
                                    progressButton2.setEnabled(false);
                                    progressButton2.setButtonText(R.string.page_withdraw__complete_withdrawal);
                                    progressButton2.setOnClickListener(this);
                                    m9hVar2.c.setOnClickListener(this);
                                    m9hVar2.e.setOnClickListener(this);
                                    iog0 iog0Var = (iog0) this.i.getValue();
                                    m9h m9hVar3 = this.f;
                                    if (m9hVar3 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    TextView textView3 = m9hVar3.d;
                                    String str = this.w;
                                    String strP = iog0Var.c.P();
                                    Account account = iog0Var.b.getAccount();
                                    textView3.setText(sn5.d(this, R.string.component_register__please_send_sms_to_smsnumber_from_countrycode_account_with_the_verification_code_below, str, strP, account != null ? account.name : null));
                                    g1i g1iVar = new g1i(iog0Var.v, new fog0(this, null));
                                    s9s lifecycle = getLifecycle();
                                    lifecycle.getClass();
                                    s9s.b bVar = s9s.b.d;
                                    arr.a(g1iVar, lifecycle, bVar);
                                    g1i g1iVar2 = new g1i(iog0Var.y, new gog0(this, null));
                                    s9s lifecycle2 = getLifecycle();
                                    lifecycle2.getClass();
                                    arr.a(g1iVar2, lifecycle2, bVar);
                                    String str2 = this.v;
                                    String str3 = this.y;
                                    iog0Var.d = str2;
                                    iog0Var.e = str3;
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
