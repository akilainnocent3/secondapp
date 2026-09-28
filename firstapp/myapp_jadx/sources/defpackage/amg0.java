package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lamg0;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class amg0 extends j5m {
    public g9h f;
    public final q8i0 i;

    public static final class a {
        public static final void a(z62 z62Var, FragmentManager fragmentManager, String str, Bundle bundle) {
            bundle.getClass();
            TradeAdditionalResult tradeAdditionalResult = Build.VERSION.SDK_INT >= 33 ? (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT", TradeAdditionalResult.class) : (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT");
            if (tradeAdditionalResult == null) {
                tradeAdditionalResult = new TradeAdditionalResult(null, 16383);
            }
            z62Var.invoke(tradeAdditionalResult);
            fragmentManager.g("REQUEST_KEY_TRADE_ADDITIONAL_PHONE");
            fragmentManager.f("REQUEST_KEY_TRADE_ADDITIONAL_PHONE");
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return amg0.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? amg0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public amg0() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.i = new q8i0(jq40.a(hmg0.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.failed_phone_dialog, (ViewGroup) null, false);
        int i = R.id.close;
        ImageView imageView = (ImageView) h5e.a(R.id.close, viewInflate);
        if (imageView != null) {
            i = R.id.content;
            if (((TextView) h5e.a(R.id.content, viewInflate)) != null) {
                i = R.id.edit_container;
                if (((FrameLayout) h5e.a(R.id.edit_container, viewInflate)) != null) {
                    i = R.id.edit_text;
                    ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.edit_text, viewInflate);
                    if (clearEditText != null) {
                        i = R.id.error;
                        TextView textView = (TextView) h5e.a(R.id.error, viewInflate);
                        if (textView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = R.id.next;
                            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                            if (progressButton != null) {
                                i = R.id.tip;
                                if (((TextView) h5e.a(R.id.tip, viewInflate)) != null) {
                                    i = R.id.title;
                                    if (((TextView) h5e.a(R.id.title, viewInflate)) != null) {
                                        this.f = new g9h(constraintLayout, imageView, clearEditText, textView, constraintLayout, progressButton);
                                        Context contextRequireContext = requireContext();
                                        contextRequireContext.getClass();
                                        bo8 bo8Var = new bo8(contextRequireContext, 0);
                                        int i2 = 1;
                                        bo8Var.requestWindowFeature(1);
                                        g9h g9hVar = this.f;
                                        if (g9hVar == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ConstraintLayout constraintLayout2 = g9hVar.b;
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
                                        g9h g9hVar2 = this.f;
                                        if (g9hVar2 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ClearEditText clearEditText2 = (ClearEditText) g9hVar2.f;
                                        ProgressButton progressButton2 = (ProgressButton) g9hVar2.i;
                                        clearEditText2.setErrorView(g9hVar2.c);
                                        clearEditText2.setTextChangedListener(new ClearEditText.b() { // from class: xlg0
                                            @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
                                            public final void l(CharSequence charSequence) {
                                                String string;
                                                String string2;
                                                if (charSequence == null || (string2 = charSequence.toString()) == null || (string = StringsKt.t0(string2).toString()) == null) {
                                                    string = "";
                                                }
                                                hmg0 hmg0Var = (hmg0) this.a.i.getValue();
                                                wwd0 wwd0Var = hmg0Var.c;
                                                wwd0Var.getClass();
                                                wwd0Var.k(null, string);
                                                hmg0Var.e.setValue(null);
                                            }
                                        });
                                        progressButton2.setEnabled(false);
                                        progressButton2.setButtonText(R.string.common_functions__continue);
                                        progressButton2.setOnClickListener(new View.OnClickListener() { // from class: ylg0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                hmg0 hmg0Var = (hmg0) this.a.i.getValue();
                                                if (((String) hmg0Var.c.getValue()).length() >= 10) {
                                                    ej5.c(o8i0.d(hmg0Var), null, null, new gmg0(hmg0Var.b, hmg0Var, null), 3);
                                                    return;
                                                }
                                                wwd0 wwd0Var = hmg0Var.e;
                                                StringUiText stringUiText = vch0.a;
                                                ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__please_enter_at_least_vnum_digit_number, ay0.S(new Object[]{10}));
                                                wwd0Var.getClass();
                                                wwd0Var.k(null, resourceUiText);
                                                bkj0.a(false, null, hmg0Var.i, null);
                                            }
                                        });
                                        ((ImageView) g9hVar2.e).setOnClickListener(new ws80(this, i2));
                                        ((ConstraintLayout) g9hVar2.d).setOnClickListener(new e440());
                                        hmg0 hmg0Var = (hmg0) this.i.getValue();
                                        g1i g1iVar = new g1i(hmg0Var.d, new bmg0(this, null));
                                        s9s lifecycle = getLifecycle();
                                        lifecycle.getClass();
                                        s9s.b bVar = s9s.b.d;
                                        arr.a(g1iVar, lifecycle, bVar);
                                        g1i g1iVar2 = new g1i(hmg0Var.f, new cmg0(this, null));
                                        s9s lifecycle2 = getLifecycle();
                                        lifecycle2.getClass();
                                        arr.a(g1iVar2, lifecycle2, bVar);
                                        g1i g1iVar3 = new g1i(hmg0Var.v, new dmg0(this, null));
                                        s9s lifecycle3 = getLifecycle();
                                        lifecycle3.getClass();
                                        arr.a(g1iVar3, lifecycle3, bVar);
                                        g1i g1iVar4 = new g1i(hmg0Var.y, new emg0(this, null));
                                        s9s lifecycle4 = getLifecycle();
                                        lifecycle4.getClass();
                                        arr.a(g1iVar4, lifecycle4, bVar);
                                        Bundle arguments = getArguments();
                                        hmg0Var.b = arguments != null ? arguments.getString("ARG_TRADE_ID") : null;
                                        return bo8Var;
                                    }
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
