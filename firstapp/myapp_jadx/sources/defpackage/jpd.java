package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Guideline;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Ljpd;", "Lg02;", "<init>", "()V", "Ljw1;", "selectedBank", "Lrw1;", "dialogState", "Lx3e;", "uiState", "Lc330;", "buttonUiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jpd extends rpl {
    public final q8i0 f0;
    public ivi g0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositBankTransferOneTimeAccountFragment$initTradingViewModel$1$1", f = "DepositBankTransferOneTimeAccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<o200, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = jpd.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o200 o200Var, v1b<? super Unit> v1bVar) {
            return ((a) create(o200Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            o200 o200Var = (o200) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            UiText uiText = o200Var.a;
            jpd jpdVar = jpd.this;
            if (uiText != null) {
                jpdVar.D0().setVisibility(0);
                HintView hintViewD0 = jpdVar.D0();
                UiText uiText2 = o200Var.a;
                Context contextRequireContext = jpdVar.requireContext();
                contextRequireContext.getClass();
                HintView.setHintInHtml$default(hintViewD0, uiText2.e(contextRequireContext), 0, 2, null);
                jpdVar.D0().setTypeColor(o200Var.b);
            } else {
                jpdVar.D0().setVisibility(8);
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return jpd.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return jpd.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return jpd.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public jpd() {
        super(0);
        this.f0 = new q8i0(jq40.a(fqd.class), new b(), new d(), new c());
    }

    @Override // defpackage.s62
    public final HintView D0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return iviVar.w;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        ivi iviVar = this.g0;
        if (iviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = iviVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return iviVar.F;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02, defpackage.s62
    public final void K0() {
        super.K0();
        g1i g1iVar = new g1i(P0().L0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
    }

    @Override // defpackage.g02, defpackage.s62
    public final void L0() {
        super.L0();
        ivi iviVar = this.g0;
        if (iviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(iviVar.A);
        ivi iviVar2 = this.g0;
        if (iviVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        iviVar2.b.setErrorView(iviVar2.d);
        ivi iviVar3 = this.g0;
        if (iviVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mla.i(iviVar3.C, new op8(-1606398004, new Function2() { // from class: sod
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(-1572068253, new epd(this.a, i), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        ivi iviVar4 = this.g0;
        if (iviVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        int i = 0;
        mla.i(iviVar4.D, new op8(1746319807, new zod(this, i), true));
        ivi iviVar5 = this.g0;
        if (iviVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mla.i(iviVar5.y, new op8(-332936067, new apd(this, i), true));
        ivi iviVar6 = this.g0;
        if (iviVar6 != null) {
            mla.i(iviVar6.E, new op8(1944622554, new Function2() { // from class: yod
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i2 = 0;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        o0z.a(null, null, null, null, null, pp8.b(-1459620469, new bpd(this.a, i2), aVar), aVar, 196608);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.g02
    public final AmountQuickAddingButtonGroup M0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return iviVar.v;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final fqd P0() {
        return (fqd) this.f0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return kotlin.collections.a.c(iviVar.b);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return kotlin.collections.a.c(iviVar.c);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return iviVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_deposit_bank_transfer_one_time_account, viewGroup, false);
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
                                    i = R.id.deposit_amount_quick_adding_buttons;
                                    AmountQuickAddingButtonGroup amountQuickAddingButtonGroup = (AmountQuickAddingButtonGroup) h5e.a(R.id.deposit_amount_quick_adding_buttons, viewInflate);
                                    if (amountQuickAddingButtonGroup != null) {
                                        i = R.id.guideline_begin;
                                        if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                                            i = R.id.guideline_end;
                                            if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                                i = R.id.hint_view;
                                                HintView hintView = (HintView) h5e.a(R.id.hint_view, viewInflate);
                                                if (hintView != null) {
                                                    i = R.id.how_to_deposit_compose_view;
                                                    ComposeView composeView = (ComposeView) h5e.a(R.id.how_to_deposit_compose_view, viewInflate);
                                                    if (composeView != null) {
                                                        i = R.id.init_failed_mask;
                                                        LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                                        if (loadingViewNew != null) {
                                                            i = R.id.init_mask;
                                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                            if (composeView2 != null) {
                                                                i = R.id.loading_mask;
                                                                LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                                if (loadingViewNew2 != null) {
                                                                    i = R.id.main_container;
                                                                    ComposeView composeView3 = (ComposeView) h5e.a(R.id.main_container, viewInflate);
                                                                    if (composeView3 != null) {
                                                                        i = R.id.promotion_banner_compose_view;
                                                                        ComposeView composeView4 = (ComposeView) h5e.a(R.id.promotion_banner_compose_view, viewInflate);
                                                                        if (composeView4 != null) {
                                                                            i = R.id.sticky_button_footer_compose_view;
                                                                            ComposeView composeView5 = (ComposeView) h5e.a(R.id.sticky_button_footer_compose_view, viewInflate);
                                                                            if (composeView5 != null) {
                                                                                i = R.id.swipe;
                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                if (swipeRefreshLayout != null) {
                                                                                    FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                                                    this.g0 = new ivi(frameLayout2, clearEditText, textView, textView2, frameLayout, textView3, textView4, amountQuickAddingButtonGroup, hintView, composeView, loadingViewNew, composeView2, loadingViewNew2, composeView3, composeView4, composeView5, swipeRefreshLayout);
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
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return kotlin.collections.a.c(iviVar.i);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return kotlin.collections.a.c(iviVar.f);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        return null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return iviVar.z;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return iviVar.A;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        ivi iviVar = this.g0;
        if (iviVar != null) {
            return iviVar.B;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
