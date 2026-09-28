package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
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
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lymg0;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ymg0 extends l5m {
    public gbn f;
    public i9h i;
    public final q8i0 v;

    public static final class a {
        public static final void a(w62 w62Var, FragmentManager fragmentManager, String str, Bundle bundle) {
            bundle.getClass();
            TradeAdditionalResult tradeAdditionalResult = Build.VERSION.SDK_INT >= 33 ? (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT", TradeAdditionalResult.class) : (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT");
            if (tradeAdditionalResult == null) {
                tradeAdditionalResult = new TradeAdditionalResult(null, 16383);
            }
            w62Var.invoke(tradeAdditionalResult);
            fragmentManager.g("REQUEST_KEY_TRADE_ADDITIONAL_SECOND_OTP");
            fragmentManager.f("REQUEST_KEY_TRADE_ADDITIONAL_SECOND_OTP");
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ymg0.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ymg0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ymg0() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.v = new q8i0(jq40.a(fng0.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.failed_second_token_dialog, (ViewGroup) null, false);
        int i = R.id.close;
        ImageView imageView = (ImageView) h5e.a(R.id.close, viewInflate);
        if (imageView != null) {
            i = R.id.content;
            if (((TextView) h5e.a(R.id.content, viewInflate)) != null) {
                i = R.id.edit_text;
                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.edit_text, viewInflate);
                if (clearEditText != null) {
                    i = R.id.error;
                    TextView textView = (TextView) h5e.a(R.id.error, viewInflate);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.icon;
                        ImageView imageView2 = (ImageView) h5e.a(R.id.icon, viewInflate);
                        if (imageView2 != null) {
                            i = R.id.information;
                            TextView textView2 = (TextView) h5e.a(R.id.information, viewInflate);
                            if (textView2 != null) {
                                i = R.id.next;
                                ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                if (progressButton != null) {
                                    i = R.id.title;
                                    if (((TextView) h5e.a(R.id.title, viewInflate)) != null) {
                                        this.i = new i9h(constraintLayout, imageView, clearEditText, textView, constraintLayout, imageView2, textView2, progressButton);
                                        Context contextRequireContext = requireContext();
                                        contextRequireContext.getClass();
                                        bo8 bo8Var = new bo8(contextRequireContext, 0);
                                        int i2 = 1;
                                        bo8Var.requestWindowFeature(1);
                                        i9h i9hVar = this.i;
                                        if (i9hVar == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ConstraintLayout constraintLayout2 = i9hVar.a;
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
                                        i9h i9hVar2 = this.i;
                                        if (i9hVar2 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ClearEditText clearEditText2 = i9hVar2.c;
                                        ProgressButton progressButton2 = i9hVar2.v;
                                        Bundle arguments = getArguments();
                                        String string = arguments != null ? arguments.getString("ARG_COUNTER_ICON_URL") : null;
                                        Bundle arguments2 = getArguments();
                                        String string2 = arguments2 != null ? arguments2.getString("ARG_COUNTER_AUTHORITY") : null;
                                        Bundle arguments3 = getArguments();
                                        String string3 = arguments3 != null ? arguments3.getString("ARG_COUNTER_PART") : null;
                                        if (string != null) {
                                            gbn gbnVar = this.f;
                                            if (gbnVar == null) {
                                                Intrinsics.n("imageService");
                                                throw null;
                                            }
                                            i9h i9hVar3 = this.i;
                                            if (i9hVar3 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            gbnVar.a(string, i9hVar3.f);
                                        }
                                        i9h i9hVar4 = this.i;
                                        if (i9hVar4 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        i9hVar4.i.setText(string2 + "(" + string3 + ")");
                                        clearEditText2.setErrorView(i9hVar2.d);
                                        clearEditText2.setTextChangedListener(new ClearEditText.b() { // from class: wmg0
                                            @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
                                            public final void l(CharSequence charSequence) {
                                                String string4;
                                                String string5;
                                                if (charSequence == null || (string5 = charSequence.toString()) == null || (string4 = StringsKt.t0(string5).toString()) == null) {
                                                    string4 = "";
                                                }
                                                fng0 fng0Var = (fng0) this.a.v.getValue();
                                                wwd0 wwd0Var = fng0Var.c;
                                                wwd0Var.getClass();
                                                wwd0Var.k(null, string4);
                                                fng0Var.e.setValue(null);
                                            }
                                        });
                                        progressButton2.setEnabled(false);
                                        progressButton2.setButtonText(R.string.common_functions__continue);
                                        progressButton2.setOnClickListener(new xjm(this, i2));
                                        i9hVar2.b.setOnClickListener(new yjm(this, 2));
                                        i9hVar2.e.setOnClickListener(new e440());
                                        fng0 fng0Var = (fng0) this.v.getValue();
                                        g1i g1iVar = new g1i(fng0Var.d, new zmg0(this, null));
                                        s9s lifecycle = getLifecycle();
                                        lifecycle.getClass();
                                        s9s.b bVar = s9s.b.d;
                                        arr.a(g1iVar, lifecycle, bVar);
                                        g1i g1iVar2 = new g1i(fng0Var.f, new ang0(this, null));
                                        s9s lifecycle2 = getLifecycle();
                                        lifecycle2.getClass();
                                        arr.a(g1iVar2, lifecycle2, bVar);
                                        g1i g1iVar3 = new g1i(fng0Var.v, new bng0(this, null));
                                        s9s lifecycle3 = getLifecycle();
                                        lifecycle3.getClass();
                                        arr.a(g1iVar3, lifecycle3, bVar);
                                        g1i g1iVar4 = new g1i(fng0Var.y, new cng0(this, null));
                                        s9s lifecycle4 = getLifecycle();
                                        lifecycle4.getClass();
                                        arr.a(g1iVar4, lifecycle4, bVar);
                                        Bundle arguments4 = getArguments();
                                        fng0Var.b = arguments4 != null ? arguments4.getString("ARG_TRADE_ID") : null;
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
