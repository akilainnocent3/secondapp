package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lblg0;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class blg0 extends h5m {
    public f9h f;
    public final q8i0 i;

    public static final class a {
        public static final void a(v62 v62Var, FragmentManager fragmentManager, String str, Bundle bundle) {
            bundle.getClass();
            TradeAdditionalResult tradeAdditionalResult = Build.VERSION.SDK_INT >= 33 ? (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT", TradeAdditionalResult.class) : (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT");
            if (tradeAdditionalResult == null) {
                tradeAdditionalResult = new TradeAdditionalResult(null, 16383);
            }
            v62Var.invoke(tradeAdditionalResult);
            fragmentManager.g("REQUEST_KEY_TRADE_ADDITIONAL_DIAL_OTP");
            fragmentManager.f("REQUEST_KEY_TRADE_ADDITIONAL_DIAL_OTP");
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return blg0.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? blg0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public blg0() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.i = new q8i0(jq40.a(ilg0.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        this.f = f9h.a(getLayoutInflater());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bo8 bo8Var = new bo8(contextRequireContext, 0);
        int i = 1;
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
        f9hVar2.v.setVisibility(4);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("ARG_DISPLAY_MSG")) != null) {
            int iT = StringsKt.T(string, "*", 0, false, 6);
            int iV = StringsKt.V(6, string, "#");
            if (iT != -1 && iV != -1) {
                String strSubstring = string.substring(0, iT);
                int i2 = iV + 1;
                final String strSubstring2 = string.substring(iT, i2);
                String strSubstring3 = string.substring(i2);
                j7g j7gVar = new j7g();
                j7gVar.a(strSubstring);
                j7gVar.h(strSubstring2, requireContext().getColor(R.color.brand_secondary), new j7g.a() { // from class: zkg0
                    @Override // j7g.a
                    public final void a() {
                        blg0 blg0Var = this.a;
                        f9h f9hVar3 = blg0Var.f;
                        if (f9hVar3 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        lop.b(f9hVar3.d, Boolean.FALSE);
                        e eVarRequireActivity = blg0Var.requireActivity();
                        eVarRequireActivity.getClass();
                        vxo.b(eVarRequireActivity, strSubstring2);
                    }
                });
                j7gVar.a(strSubstring3);
                f9h f9hVar3 = this.f;
                if (f9hVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                f9hVar3.c.setText(j7gVar);
                f9h f9hVar4 = this.f;
                if (f9hVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                f9hVar4.c.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        clearEditText.setErrorView(f9hVar2.e);
        clearEditText.setTextChangedListener(new ClearEditText.b() { // from class: xkg0
            @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
            public final void l(CharSequence charSequence) {
                String string2;
                String string3;
                if (charSequence == null || (string3 = charSequence.toString()) == null || (string2 = StringsKt.t0(string3).toString()) == null) {
                    string2 = "";
                }
                ilg0 ilg0Var = (ilg0) this.a.i.getValue();
                wwd0 wwd0Var = ilg0Var.c;
                wwd0Var.getClass();
                wwd0Var.k(null, string2);
                ilg0Var.e.setValue(null);
            }
        });
        progressButton.setEnabled(false);
        progressButton.setButtonText(R.string.common_functions__continue);
        progressButton.setOnClickListener(new ds80(this, i));
        f9hVar2.b.setOnClickListener(new View.OnClickListener() { // from class: ykg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", new TradeAdditionalResult(null, 16383)));
                blg0 blg0Var = this.a;
                blg0Var.getParentFragmentManager().m0("REQUEST_KEY_TRADE_ADDITIONAL_DIAL_OTP", bundleA);
                blg0Var.dismissAllowingStateLoss();
            }
        });
        f9hVar2.f.setOnClickListener(new e440());
        ilg0 ilg0Var = (ilg0) this.i.getValue();
        g1i g1iVar = new g1i(ilg0Var.d, new clg0(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(ilg0Var.f, new dlg0(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(ilg0Var.v, new elg0(this, null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(ilg0Var.y, new flg0(this, null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
        Bundle arguments2 = getArguments();
        ilg0Var.b = arguments2 != null ? arguments2.getString("ARG_TRADE_ID") : null;
        return bo8Var;
    }
}
