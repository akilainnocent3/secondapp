package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.withdraw.presentation.model.WithdrawConfirmation;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j82 extends kml {
    public final q8i0 W;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.BaseWithdrawFragment$initTradingViewModel$1$1", f = "BaseWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<kqj0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = j82.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kqj0 kqj0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(kqj0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            j82 j82Var = j82.this;
            q8i0 q8i0Var = j82Var.W;
            kqj0 kqj0Var = (kqj0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (kqj0Var instanceof kqj0.d) {
                if (j82Var instanceof ijj0) {
                    return Unit.a;
                }
                xlj0 xlj0Var = (xlj0) q8i0Var.getValue();
                WithdrawConfirmation withdrawConfirmation = ((kqj0.d) kqj0Var).a;
                wwd0 wwd0Var = xlj0Var.b;
                wwd0Var.getClass();
                wwd0Var.k(null, withdrawConfirmation);
                j82Var.S0();
            } else if (kqj0Var instanceof kqj0.b) {
                ((xlj0) q8i0Var.getValue()).w.a(Unit.a);
            } else if (!(kqj0Var instanceof kqj0.a) && !(kqj0Var instanceof kqj0.c)) {
                uhc.a();
                return null;
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.BaseWithdrawFragment$initTradingViewModel$1$2", f = "BaseWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = j82.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
            return ((b) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tzs tzsVar = (tzs) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            xlj0 xlj0Var = (xlj0) j82.this.W.getValue();
            tzsVar.getClass();
            wwd0 wwd0Var = xlj0Var.e;
            wwd0Var.getClass();
            wwd0Var.k(null, tzsVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.BaseWithdrawFragment$initTradingViewModel$1$3", f = "BaseWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<xhj0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ o82 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o82 o82Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = o82Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = j82.this.new c(this.c, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xhj0 xhj0Var, v1b<? super Unit> v1bVar) {
            return ((c) create(xhj0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            final xhj0 xhj0Var = (xhj0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            for (ClearEditText clearEditText : j82.this.m0()) {
                String strF = this.c.d.f();
                clearEditText.getClass();
                xhj0Var.getClass();
                strF.getClass();
                clearEditText.getErrorView().setOnClickListener(null);
                if (xhj0Var.equals(xhj0.i.a) || xhj0Var.equals(xhj0.d.a)) {
                    clearEditText.setError((String) null);
                } else if (xhj0Var.equals(xhj0.j.a)) {
                    Context context = clearEditText.getContext();
                    context.getClass();
                    clearEditText.setError(sn5.b(context, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
                } else if (xhj0Var instanceof xhj0.g) {
                    Context context2 = clearEditText.getContext();
                    context2.getClass();
                    clearEditText.setError(sn5.b(context2, R.string.page_withdraw__the_maximum_withdrawal_amount_is_vcurrency_vnum, strF, n4d.a(((xhj0.g) xhj0Var).a)));
                } else if (xhj0Var instanceof xhj0.h) {
                    Context context3 = clearEditText.getContext();
                    context3.getClass();
                    clearEditText.setError(sn5.b(context3, R.string.page_withdraw__the_minimum_withdrawal_amount_is_vcurrency_vnum, strF, n4d.a(((xhj0.h) xhj0Var).a)));
                } else if (xhj0Var instanceof xhj0.e) {
                    Context context4 = clearEditText.getContext();
                    context4.getClass();
                    clearEditText.setError(sn5.b(context4, R.string.common_feedback__your_balance_is_insufficient, new Object[0]));
                } else if (xhj0Var instanceof xhj0.f) {
                    Context context5 = clearEditText.getContext();
                    context5.getClass();
                    clearEditText.setError(sn5.b(context5, R.string.page_withdraw__amount_exceeds_your_withdrawable_balance_vcurrency_vbalance, strF, n4d.a(((xhj0.f) xhj0Var).a)));
                } else if (xhj0Var instanceof xhj0.a) {
                    Context context6 = clearEditText.getContext();
                    context6.getClass();
                    xhj0.a aVar = (xhj0.a) xhj0Var;
                    clearEditText.setError(sn5.b(context6, R.string.page_withdraw__insufficient_balance_to_withdral_vcurrency_vnum_with_withdrawal_vfee__NG, strF, n4d.a(aVar.a), n4d.a(aVar.b)));
                } else if (xhj0Var instanceof xhj0.b) {
                    xhj0.b bVar = (xhj0.b) xhj0Var;
                    UiText uiText = bVar.a;
                    Context context7 = clearEditText.getContext();
                    context7.getClass();
                    uiText.getClass();
                    clearEditText.setError(uiText.e(context7).toString());
                    final wae waeVar = bVar.b;
                    if (waeVar != null) {
                        clearEditText.getErrorView().setOnClickListener(new View.OnClickListener() { // from class: nw
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ((xhj0.b) xhj0Var).c.invoke(waeVar);
                            }
                        });
                    }
                } else {
                    if (!xhj0Var.equals(xhj0.c.a)) {
                        uhc.a();
                        return null;
                    }
                    Context context8 = clearEditText.getContext();
                    context8.getClass();
                    clearEditText.setError(sn5.b(context8, R.string.page_payment__please_enter_a_valid_integer, new Object[0]));
                }
            }
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function0<Fragment> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return j82.this;
        }
    }

    public static final class e extends qlr implements Function0<w8i0> {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
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

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? j82.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public j82(int i) {
        super(i);
        this.U = false;
        this.V = false;
        ttr ttrVarA = hwr.a(a1s.c, new e(new d()));
        this.W = new q8i0(jq40.a(xlj0.class), new f(ttrVarA), new h(ttrVarA), new g(ttrVarA));
    }

    @Override // defpackage.s62
    public void K0() {
        super.K0();
        o82 o82VarP0 = P0();
        g1i g1iVar = new g1i(o82VarP0.e0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(o82VarP0.H, new b(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(o82VarP0.H1(), new c(o82VarP0, null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
    }

    @Override // defpackage.s62
    public void L0() {
        super.L0();
        TextView textViewQ0 = Q0();
        if (textViewQ0 != null) {
            textViewQ0.setText(sn5.d(this, R.string.common_functions__withdrawable_balance_label, P0().d.f()));
        }
        TextView textViewO0 = O0();
        if (textViewO0 != null) {
            StringUiText stringUiText = vch0.a;
            ConcatUiText concatUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_payment__withdraw_gh_tax_info), new ResourceUiText(R.string.app_common__blank_space), new ResourceUiText(R.string.page_payment__withdraw_gh_tax_info_learn_more)});
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            textViewO0.setText(concatUiText.e(contextRequireContext));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair(sn5.c(textViewO0, R.string.page_payment__withdraw_gh_tax_info_learn_more, new Object[0]), new View.OnClickListener() { // from class: f82
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((d900) this.a.z0()).a();
                }
            }));
            SpannableString spannableString = new SpannableString(textViewO0.getText().toString());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Pair pair = (Pair) obj;
                ych0 ych0Var = new ych0(pair, textViewO0);
                int iIndexOf = textViewO0.getText().toString().indexOf((String) pair.first, 0);
                spannableString.setSpan(ych0Var, iIndexOf, ((String) pair.first).length() + iIndexOf, 34);
            }
            textViewO0.setMovementMethod(LinkMovementMethod.getInstance());
            textViewO0.setText(spannableString, TextView.BufferType.SPANNABLE);
        }
    }

    @Override // defpackage.s62
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public abstract o82 P0();

    public abstract TextView O0();

    public abstract TextView P0();

    public abstract TextView Q0();

    public abstract View R0();

    public void S0() {
        new elj0().show(getChildFragmentManager(), elj0.class.getName());
    }

    public final void T0(WithDrawInfo withDrawInfo) {
        String str;
        if (withDrawInfo == null || (str = withDrawInfo.message) == null) {
            return;
        }
        StringUiText stringUiText = vch0.a;
        StringUiText stringUiText2 = new StringUiText(str);
        f00 f00Var = vgb0.a;
        vgb0.c("sporty_withdraw", jpu.b(new kotlin.Pair(AnalyticsParam.CONTENT_TYPE, "click_balance_info_button")), false);
        s0().d(new com.sporty.android.common.uievent.a.h(stringUiText2, null, null, null, 507), this, E0(), null);
    }

    @Override // defpackage.s62, androidx.fragment.app.Fragment
    public final void onDestroy() {
        s0().a();
        super.onDestroy();
    }

    @Override // defpackage.s62, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        g1i g1iVar = new g1i(((xlj0) this.W.getValue()).v, new h82(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(I0().A, new i82(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
    }
}
