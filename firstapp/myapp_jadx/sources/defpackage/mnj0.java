package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmnj0;", "Lj82;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mnj0 extends z7m {
    public azi a0;
    public final q8i0 b0;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawPartnerFragment$initTradingViewModel$1$1", f = "WithdrawPartnerFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = mnj0.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            mnj0 mnj0Var = mnj0.this;
            azi aziVar = mnj0Var.a0;
            if (aziVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            if (!Intrinsics.g(str, aziVar.C.getText())) {
                azi aziVar2 = mnj0Var.a0;
                if (aziVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                aziVar2.C.setText(str);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawPartnerFragment$initTradingViewModel$1$2", f = "WithdrawPartnerFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<itz, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = mnj0.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(itz itzVar, v1b<? super Unit> v1bVar) {
            return ((b) create(itzVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            itz itzVar = (itz) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zG = Intrinsics.g(itzVar, itz.b.a);
            mnj0 mnj0Var = mnj0.this;
            azi aziVar = mnj0Var.a0;
            if (zG) {
                if (aziVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                aziVar.C.setError(sn5.d(mnj0Var, R.string.page_withdraw__invalid_partner_code__NG, new Object[0]));
            } else {
                if (aziVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                aziVar.C.setError(null);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawPartnerFragment$initTradingViewModel$1$3", f = "WithdrawPartnerFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = mnj0.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
            return ((c) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c330 c330Var = (c330) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            azi aziVar = mnj0.this.a0;
            if (aziVar != null) {
                b330.a(aziVar.B, c330Var);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawPartnerFragment$initTradingViewModel$1$4", f = "WithdrawPartnerFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<onj0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = mnj0.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(onj0 onj0Var, v1b<? super Unit> v1bVar) {
            return ((d) create(onj0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            onj0 onj0Var = (onj0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = onj0Var instanceof onj0.a;
            mnj0 mnj0Var = mnj0.this;
            if (z) {
                Context context = mnj0Var.getContext();
                if (context != null) {
                    int i = PartnerWithdrawRequestDetailsActivity.w;
                    PartnerWithdrawRequestDetailsActivity.a.a(context, ((onj0.a) onj0Var).a, null);
                }
            } else {
                if (!Intrinsics.g(onj0Var, onj0.b.a)) {
                    uhc.a();
                    return null;
                }
                Toast toast = new Toast(mnj0Var.getActivity());
                toast.setView(LayoutInflater.from(mnj0Var.getActivity()).inflate(R.layout.request_submmited_toast, (ViewGroup) null));
                toast.setGravity(17, 0, 0);
                toast.setDuration(0);
                toast.show();
            }
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return mnj0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return mnj0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return mnj0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public mnj0() {
        super(R.layout.fragment_withdraw_partner);
        this.Y = false;
        this.Z = false;
        this.b0 = new q8i0(jq40.a(snj0.class), new e(), new g(), new f());
    }

    @Override // defpackage.s62
    public final HintView D0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return aziVar.w;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        azi aziVar = this.a0;
        if (aziVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = aziVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return aziVar.F;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82, defpackage.s62
    /* JADX INFO: renamed from: J0 */
    public final k72 P0() {
        return (snj0) this.b0.getValue();
    }

    @Override // defpackage.j82, defpackage.s62
    public final void K0() {
        super.K0();
        snj0 snj0Var = (snj0) this.b0.getValue();
        g1i g1iVar = new g1i(snj0Var.v0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(snj0Var.x0, new b(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(snj0Var.o0, new c(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(snj0Var.q0, new d(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
    }

    @Override // defpackage.j82, defpackage.s62
    public final void L0() {
        super.L0();
        azi aziVar = this.a0;
        if (aziVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(aziVar.z);
        azi aziVar2 = this.a0;
        if (aziVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        CombEditText combEditText = aziVar2.C;
        combEditText.setLabelText(sn5.c(combEditText, R.string.page_withdraw__partner_code, new Object[0]));
        combEditText.setEditHint(sn5.c(combEditText, R.string.page_withdraw__eg_prxxxx, new Object[0]));
        azi aziVar3 = this.a0;
        if (aziVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        combEditText.setErrorView(aziVar3.D);
        combEditText.setMaxLength(6);
        combEditText.setTextChangedListener(new CombEditText.d() { // from class: jnj0
            @Override // com.sporty.android.common_ui.widgets.CombEditText.d
            public final void l(CharSequence charSequence) {
                Object obj;
                String string = StringsKt.t0(charSequence.toString()).toString();
                snj0 snj0Var = (snj0) this.a.b0.getValue();
                string.getClass();
                wwd0 wwd0Var = snj0Var.u0;
                wwd0Var.getClass();
                wwd0Var.k(null, string);
                wwd0 wwd0Var2 = snj0Var.w0;
                if (StringsKt.U(string)) {
                    obj = itz.a.a;
                } else {
                    obj = (string.length() < 2 || c.u(string, "PR", false)) ? itz.c.a : itz.b.a;
                }
                wwd0Var2.getClass();
                wwd0Var2.k(null, obj);
            }
        });
        combEditText.setEditType(4096);
        azi aziVar4 = this.a0;
        if (aziVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aziVar4.B.setOnClickListener(new View.OnClickListener() { // from class: knj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mnj0 mnj0Var = this.a;
                azi aziVar5 = mnj0Var.a0;
                if (aziVar5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                lop.b(aziVar5.b, Boolean.FALSE);
                snj0 snj0Var = (snj0) mnj0Var.b0.getValue();
                ej5.c(o8i0.d(snj0Var), null, null, new pnj0(snj0Var, null), 3);
            }
        });
        azi aziVar5 = this.a0;
        if (aziVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aziVar5.b.setErrorView(aziVar5.d);
        azi aziVar6 = this.a0;
        if (aziVar6 != null) {
            aziVar6.E.setOnClickListener(new View.OnClickListener() { // from class: lnj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.F0().d(wae.WITHDRAW_LIST);
                }
            });
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.j82
    /* JADX INFO: renamed from: N0 */
    public final o82 P0() {
        return (snj0) this.b0.getValue();
    }

    @Override // defpackage.j82
    public final TextView O0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return aziVar.G;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final TextView P0() {
        return null;
    }

    @Override // defpackage.j82
    public final TextView Q0() {
        return null;
    }

    @Override // defpackage.j82
    public final View R0() {
        return null;
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return kotlin.collections.a.c(aziVar.b);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return kotlin.collections.a.c(aziVar.c);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return aziVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_withdraw_partner, viewGroup, false);
        int i = R.id.amount;
        ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, viewInflate);
        if (clearEditText != null) {
            i = R.id.amount_container;
            if (((FrameLayout) h5e.a(R.id.amount_container, viewInflate)) != null) {
                i = R.id.amount_label;
                TextView textView = (TextView) h5e.a(R.id.amount_label, viewInflate);
                if (textView != null) {
                    i = R.id.amount_warning;
                    TextView textView2 = (TextView) h5e.a(R.id.amount_warning, viewInflate);
                    if (textView2 != null) {
                        i = R.id.anti_interaction_mask;
                        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
                        if (frameLayout != null) {
                            i = R.id.balance;
                            TextView textView3 = (TextView) h5e.a(R.id.balance, viewInflate);
                            if (textView3 != null) {
                                i = R.id.balance_label;
                                TextView textView4 = (TextView) h5e.a(R.id.balance_label, viewInflate);
                                if (textView4 != null) {
                                    i = R.id.description_list_view;
                                    SimpleDescriptionListView simpleDescriptionListView = (SimpleDescriptionListView) h5e.a(R.id.description_list_view, viewInflate);
                                    if (simpleDescriptionListView != null) {
                                        i = R.id.hint_view;
                                        HintView hintView = (HintView) h5e.a(R.id.hint_view, viewInflate);
                                        if (hintView != null) {
                                            i = R.id.init_failed_mask;
                                            LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                            if (loadingViewNew != null) {
                                                i = R.id.init_mask;
                                                ComposeView composeView = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                if (composeView != null) {
                                                    i = R.id.loading_mask;
                                                    LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                    if (loadingViewNew2 != null) {
                                                        i = R.id.next;
                                                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                                        if (progressButton != null) {
                                                            i = R.id.partner_code;
                                                            CombEditText combEditText = (CombEditText) h5e.a(R.id.partner_code, viewInflate);
                                                            if (combEditText != null) {
                                                                i = R.id.partner_code_warning;
                                                                TextView textView5 = (TextView) h5e.a(R.id.partner_code_warning, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = R.id.request_list_button;
                                                                    TextView textView6 = (TextView) h5e.a(R.id.request_list_button, viewInflate);
                                                                    if (textView6 != null) {
                                                                        i = R.id.swipe;
                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                        if (swipeRefreshLayout != null) {
                                                                            i = R.id.wh_tax_description;
                                                                            TextView textView7 = (TextView) h5e.a(R.id.wh_tax_description, viewInflate);
                                                                            if (textView7 != null) {
                                                                                i = R.id.withdraw_banner;
                                                                                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) h5e.a(R.id.withdraw_banner, viewInflate);
                                                                                if (aspectRatioImageView != null) {
                                                                                    FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                                                    this.a0 = new azi(frameLayout2, clearEditText, textView, textView2, frameLayout, textView3, textView4, simpleDescriptionListView, hintView, loadingViewNew, composeView, loadingViewNew2, progressButton, combEditText, textView5, textView6, swipeRefreshLayout, textView7, aspectRatioImageView);
                                                                                    frameLayout2.getClass();
                                                                                    return frameLayout2;
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
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return kotlin.collections.a.c(aziVar.i);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return kotlin.collections.a.c(aziVar.f);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final AspectRatioImageView r0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return aziVar.H;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return aziVar.v;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return aziVar.y;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return aziVar.z;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        azi aziVar = this.a0;
        if (aziVar != null) {
            return aziVar.A;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
