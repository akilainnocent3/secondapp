package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lolg0;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class olg0 extends i5m {
    public f9h f;
    public final q8i0 i;

    public static final class a {
        public static final void a(x62 x62Var, FragmentManager fragmentManager, String str, Bundle bundle) {
            bundle.getClass();
            TradeAdditionalResult tradeAdditionalResult = Build.VERSION.SDK_INT >= 33 ? (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT", TradeAdditionalResult.class) : (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT");
            if (tradeAdditionalResult == null) {
                tradeAdditionalResult = new TradeAdditionalResult(null, 16383);
            }
            x62Var.invoke(tradeAdditionalResult);
            fragmentManager.g("REQUEST_KEY_TRADE_ADDITIONAL_OTP");
            fragmentManager.f("REQUEST_KEY_TRADE_ADDITIONAL_OTP");
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return olg0.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? olg0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public olg0() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.i = new q8i0(jq40.a(vlg0.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        this.f = f9h.a(getLayoutInflater());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bo8 bo8Var = new bo8(contextRequireContext, 0);
        bo8Var.requestWindowFeature(1);
        f9h f9hVar = this.f;
        if (f9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = f9hVar.a;
        constraintLayout.getClass();
        bo8Var.setContentView(constraintLayout);
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
        f9h f9hVar2 = this.f;
        if (f9hVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ClearEditText clearEditText = f9hVar2.d;
        ProgressButton progressButton = f9hVar2.i;
        clearEditText.setErrorView(f9hVar2.e);
        clearEditText.setTextChangedListener(new ClearEditText.b() { // from class: klg0
            @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
            public final void l(CharSequence charSequence) {
                String string;
                String string2;
                if (charSequence == null || (string2 = charSequence.toString()) == null || (string = StringsKt.t0(string2).toString()) == null) {
                    string = "";
                }
                vlg0 vlg0Var = (vlg0) this.a.i.getValue();
                wwd0 wwd0Var = vlg0Var.c;
                wwd0Var.getClass();
                wwd0Var.k(null, string);
                vlg0Var.e.setValue(null);
            }
        });
        progressButton.setEnabled(false);
        progressButton.setButtonText(R.string.common_functions__continue);
        progressButton.setOnClickListener(new View.OnClickListener() { // from class: llg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vlg0 vlg0Var = (vlg0) this.a.i.getValue();
                ej5.c(o8i0.d(vlg0Var), null, null, new ulg0(vlg0Var.b, vlg0Var, null), 3);
            }
        });
        f9hVar2.b.setOnClickListener(new View.OnClickListener() { // from class: mlg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", new TradeAdditionalResult(null, 16383)));
                olg0 olg0Var = this.a;
                olg0Var.getParentFragmentManager().m0("REQUEST_KEY_TRADE_ADDITIONAL_OTP", bundleA);
                olg0Var.dismissAllowingStateLoss();
            }
        });
        f9hVar2.f.setOnClickListener(new e440());
        vlg0 vlg0Var = (vlg0) this.i.getValue();
        g1i g1iVar = new g1i(vlg0Var.d, new plg0(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(vlg0Var.f, new qlg0(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(vlg0Var.v, new rlg0(this, null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(vlg0Var.y, new slg0(this, null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
        Bundle arguments = getArguments();
        vlg0Var.b = arguments != null ? arguments.getString("ARG_TRADE_ID") : null;
        return bo8Var;
    }
}
