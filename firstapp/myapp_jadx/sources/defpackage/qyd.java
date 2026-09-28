package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqyd;", "Lg02;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class qyd extends g02 {
    public mvi b0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositEWalletFragment$initTradingViewModel$1$1", f = "DepositEWalletFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = qyd.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
            return ((a) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c330 c330Var = (c330) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            mvi mviVar = qyd.this.b0;
            if (mviVar != null) {
                b330.a(mviVar.E, c330Var);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositEWalletFragment$initTradingViewModel$1$2", f = "DepositEWalletFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = qyd.this.new b(v1bVar);
            bVar.a = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qyd qydVar = qyd.this;
            mvi mviVar = qydVar.b0;
            if (z) {
                if (mviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                mviVar.F.setVisibility(8);
                mvi mviVar2 = qydVar.b0;
                if (mviVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                mviVar2.K.setVisibility(0);
            } else {
                if (mviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                mviVar.F.setVisibility(0);
                mvi mviVar3 = qydVar.b0;
                if (mviVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                mviVar3.K.setVisibility(8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositEWalletFragment$initTradingViewModel$1$3", f = "DepositEWalletFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<o200, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = qyd.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o200 o200Var, v1b<? super Unit> v1bVar) {
            return ((c) create(o200Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            o200 o200Var = (o200) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            UiText uiText = o200Var.a;
            qyd qydVar = qyd.this;
            if (uiText != null) {
                qydVar.D0().setVisibility(0);
                HintView hintViewD0 = qydVar.D0();
                UiText uiText2 = o200Var.a;
                Context contextRequireContext = qydVar.requireContext();
                contextRequireContext.getClass();
                HintView.setHintInHtml$default(hintViewD0, uiText2.e(contextRequireContext), 0, 2, null);
                qydVar.D0().setTypeColor(o200Var.b);
            } else {
                qydVar.D0().setVisibility(8);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositEWalletFragment$initTradingViewModel$1$4", f = "DepositEWalletFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = qyd.this.new d(v1bVar);
            dVar.a = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((d) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            mvi mviVar = qyd.this.b0;
            if (mviVar != null) {
                mviVar.O.setVisibility(z ? 0 : 8);
                return Unit.a;
            }
            Intrinsics.n(lTGEJfVytU.RLuVLGoQJsswno);
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositEWalletFragment$initTradingViewModel$1$5", f = "DepositEWalletFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<xi7, v1b<? super Unit>, Object> {
        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(2, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xi7 xi7Var, v1b<? super Unit> v1bVar) {
            return ((e) create(xi7Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    public qyd() {
        super(R.layout.fragment_deposit_e_wallet);
    }

    @Override // defpackage.s62
    public final HintView D0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return mviVar.A;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        mvi mviVar = this.b0;
        if (mviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = mviVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return mviVar.N;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02, defpackage.s62
    public final void K0() {
        cjf cjfVar;
        super.K0();
        vzd vzdVarP0 = P0();
        g1i g1iVar = new g1i(vzdVarP0.y0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(vzdVarP0.v0, new b(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(vzdVarP0.B0, new c(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(e1i.e(new uzd(vzdVarP0.o0.e(), vzdVarP0), o8i0.d(vzdVarP0), q490.a.a, Boolean.FALSE), new d(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
        g1i g1iVar5 = new g1i(vzdVarP0.D0, new e(2, null));
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar5, lifecycle5, bVar);
        Context context = getContext();
        if (context != null) {
            a300.e eVarB1 = vzdVarP0.B1();
            boolean zD = r0b.d(context);
            eVarB1.getClass();
            if (eVarB1 instanceof a300.e.a) {
                int iA = djf.a(eVarB1, zD);
                StringUiText stringUiText = vch0.a;
                cjfVar = new cjf(iA, R.drawable.ic_opay_square, new ResourceUiText(R.string.common_payment_providers__ng_deposit_with_opay_sub_title__NG), z3z.a(context).a);
            } else if (eVarB1 instanceof a300.e.b) {
                int iA2 = djf.a(eVarB1, zD);
                StringUiText stringUiText2 = vch0.a;
                cjfVar = new cjf(iA2, R.drawable.ic_palmpay_square, new ResourceUiText(R.string.common_payment_providers__ng_deposit_with_palmpay_sub_title__NG), a4z.a(context).a);
            } else {
                if (!(eVarB1 instanceof a300.e.c)) {
                    uhc.a();
                    return;
                }
                int iA3 = djf.a(eVarB1, zD);
                StringUiText stringUiText3 = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.common_payment_providers__ng_deposit_with_tenn_sub_title__NG);
                j7g j7gVar = new j7g();
                Iterator it = kotlin.collections.b.k(Integer.valueOf(R.string.common_payment_providers__deposit_with_tenn_content_1__NG), Integer.valueOf(R.string.common_payment_providers__deposit_with_tenn_content_2__NG), Integer.valueOf(R.string.common_payment_providers__deposit_with_tenn_content_3__NG), Integer.valueOf(R.string.common_payment_providers__deposit_with_tenn_content_4__NG), Integer.valueOf(R.string.common_payment_providers__deposit_with_tenn_content_5__NG)).iterator();
                while (it.hasNext()) {
                    j7gVar.m(new String[]{sn5.b(context, ((Number) it.next()).intValue(), new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
                    j7gVar.a("\n");
                }
                cjfVar = new cjf(iA3, R.drawable.ic_tenn_square, resourceUiText, new q3z(j7gVar, null, null, WebSocketProtocol.PAYLOAD_SHORT).a);
            }
            mvi mviVar = this.b0;
            if (mviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            AppCompatImageView appCompatImageView = mviVar.G;
            int i = cjfVar.b;
            appCompatImageView.setImageResource(i);
            mvi mviVar2 = this.b0;
            if (mviVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mviVar2.L.setImageResource(i);
            mvi mviVar3 = this.b0;
            if (mviVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            AppCompatTextView appCompatTextView = mviVar3.H;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            ResourceUiText resourceUiText2 = cjfVar.c;
            appCompatTextView.setText(resourceUiText2.e(contextRequireContext));
            mvi mviVar4 = this.b0;
            if (mviVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            AppCompatTextView appCompatTextView2 = mviVar4.M;
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            appCompatTextView2.setText(resourceUiText2.e(contextRequireContext2));
            mvi mviVar5 = this.b0;
            if (mviVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mviVar5.I.setVisibility(0);
            mvi mviVar6 = this.b0;
            if (mviVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mviVar6.v.setImageResource(cjfVar.a);
            mvi mviVar7 = this.b0;
            if (mviVar7 != null) {
                mviVar7.J.setText(cjfVar.d);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    @Override // defpackage.g02, defpackage.s62
    public final void L0() {
        super.L0();
        mvi mviVar = this.b0;
        if (mviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(mviVar.C);
        mvi mviVar2 = this.b0;
        if (mviVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mviVar2.E.setOnClickListener(new View.OnClickListener() { // from class: myd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qyd qydVar = this.a;
                vzd vzdVarP0 = qydVar.P0();
                vzdVarP0.getClass();
                ej5.c(o8i0.d(vzdVarP0), null, null, new gzd(vzdVarP0, null), 3);
                mvi mviVar3 = qydVar.b0;
                if (mviVar3 != null) {
                    c8i0.g(mviVar3.b);
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
        });
        mvi mviVar3 = this.b0;
        if (mviVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mviVar3.F.setOnClickListener(new View.OnClickListener() { // from class: nyd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.P0().Q1(Boolean.TRUE);
            }
        });
        mvi mviVar4 = this.b0;
        if (mviVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mviVar4.K.setOnClickListener(new View.OnClickListener() { // from class: oyd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.P0().Q1(Boolean.FALSE);
            }
        });
        mvi mviVar5 = this.b0;
        if (mviVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mviVar5.b.setErrorView(mviVar5.d);
        mvi mviVar6 = this.b0;
        if (mviVar6 != null) {
            mviVar6.O.setOnClickListener(new View.OnClickListener() { // from class: pyd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qyd qydVar = this.a;
                    Function1<Boolean, Unit> function1O1 = qydVar.P0().O1();
                    Context contextRequireContext = qydVar.requireContext();
                    contextRequireContext.getClass();
                    function1O1.invoke(Boolean.valueOf(r0b.d(contextRequireContext)));
                }
            });
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.g02
    public final AmountQuickAddingButtonGroup M0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return mviVar.w;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02
    public final ComposeView O0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return mviVar.y;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public abstract vzd P0();

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return kotlin.collections.a.c(mviVar.b);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return kotlin.collections.a.c(mviVar.c);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return mviVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_deposit_e_wallet, viewGroup, false);
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
                                    i = R.id.brand_logo_image_view;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.brand_logo_image_view, viewInflate);
                                    if (appCompatImageView != null) {
                                        i = R.id.deposit_amount_quick_adding_buttons;
                                        AmountQuickAddingButtonGroup amountQuickAddingButtonGroup = (AmountQuickAddingButtonGroup) h5e.a(R.id.deposit_amount_quick_adding_buttons, viewInflate);
                                        if (amountQuickAddingButtonGroup != null) {
                                            i = R.id.deposit_banner_compose_view;
                                            ComposeView composeView = (ComposeView) h5e.a(R.id.deposit_banner_compose_view, viewInflate);
                                            if (composeView != null) {
                                                i = R.id.description_list_view;
                                                SimpleDescriptionListView simpleDescriptionListView = (SimpleDescriptionListView) h5e.a(R.id.description_list_view, viewInflate);
                                                if (simpleDescriptionListView != null) {
                                                    i = R.id.divider;
                                                    if (((LinearLayoutCompat) h5e.a(R.id.divider, viewInflate)) != null) {
                                                        i = R.id.guideline_begin;
                                                        if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                                                            i = R.id.guideline_end;
                                                            if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                                                i = R.id.hint_view;
                                                                HintView hintView = (HintView) h5e.a(R.id.hint_view, viewInflate);
                                                                if (hintView != null) {
                                                                    i = R.id.init_failed_mask;
                                                                    LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                                                    if (loadingViewNew != null) {
                                                                        i = R.id.init_mask;
                                                                        ComposeView composeView2 = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                                        if (composeView2 != null) {
                                                                            i = R.id.loading_mask;
                                                                            LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                                            if (loadingViewNew2 != null) {
                                                                                i = R.id.next;
                                                                                ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                                                                if (progressButton != null) {
                                                                                    i = R.id.pay_from_3rd_app_guide_collapsed;
                                                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) h5e.a(R.id.pay_from_3rd_app_guide_collapsed, viewInflate);
                                                                                    if (linearLayoutCompat != null) {
                                                                                        i = R.id.pay_from_3rd_app_guide_collapsed_icon_image_view;
                                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.pay_from_3rd_app_guide_collapsed_icon_image_view, viewInflate);
                                                                                        if (appCompatImageView2 != null) {
                                                                                            i = R.id.pay_from_3rd_app_guide_collapsed_title_text_view;
                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.pay_from_3rd_app_guide_collapsed_title_text_view, viewInflate);
                                                                                            if (appCompatTextView != null) {
                                                                                                i = R.id.pay_from_3rd_app_guide_container;
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.pay_from_3rd_app_guide_container, viewInflate);
                                                                                                if (constraintLayout != null) {
                                                                                                    i = R.id.pay_from_3rd_app_guide_details_text_view;
                                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.pay_from_3rd_app_guide_details_text_view, viewInflate);
                                                                                                    if (appCompatTextView2 != null) {
                                                                                                        i = R.id.pay_from_3rd_app_guide_expanded;
                                                                                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) h5e.a(R.id.pay_from_3rd_app_guide_expanded, viewInflate);
                                                                                                        if (linearLayoutCompat2 != null) {
                                                                                                            i = R.id.pay_from_3rd_app_guide_expanded_icon_image_view;
                                                                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.pay_from_3rd_app_guide_expanded_icon_image_view, viewInflate);
                                                                                                            if (appCompatImageView3 != null) {
                                                                                                                i = R.id.pay_from_3rd_app_guide_expanded_title_text_view;
                                                                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.pay_from_3rd_app_guide_expanded_title_text_view, viewInflate);
                                                                                                                if (appCompatTextView3 != null) {
                                                                                                                    i = R.id.swipe;
                                                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                                                    if (swipeRefreshLayout != null) {
                                                                                                                        i = R.id.tooltip;
                                                                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.tooltip, viewInflate);
                                                                                                                        if (appCompatImageView4 != null) {
                                                                                                                            FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                                                                                            this.b0 = new mvi(frameLayout2, clearEditText, textView, textView2, frameLayout, textView3, textView4, appCompatImageView, amountQuickAddingButtonGroup, composeView, simpleDescriptionListView, hintView, loadingViewNew, composeView2, loadingViewNew2, progressButton, linearLayoutCompat, appCompatImageView2, appCompatTextView, constraintLayout, appCompatTextView2, linearLayoutCompat2, appCompatImageView3, appCompatTextView3, swipeRefreshLayout, appCompatImageView4);
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
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return kotlin.collections.a.c(mviVar.i);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return kotlin.collections.a.c(mviVar.f);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return mviVar.z;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return mviVar.B;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return mviVar.C;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        mvi mviVar = this.b0;
        if (mviVar != null) {
            return mviVar.D;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
