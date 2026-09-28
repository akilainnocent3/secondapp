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
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.QuickInputItemListView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm1e;", "Lg02;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m1e extends ypl {
    public nvi e0;
    public final q8i0 f0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initTradingViewModel$1$1", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = m1e.this.new a(v1bVar);
            aVar.a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            nvi nviVar = m1e.this.e0;
            if (nviVar != null) {
                nviVar.F.setEnabled(z);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initTradingViewModel$1$2", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = m1e.this.new b(v1bVar);
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
            nvi nviVar = m1e.this.e0;
            if (nviVar != null) {
                nviVar.G.setVisibility(z ? 0 : 8);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initTradingViewModel$1$3", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = m1e.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((c) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            nvi nviVar = m1e.this.e0;
            if (nviVar != null) {
                nviVar.F.setText(str);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initTradingViewModel$1$4", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<rr00, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = m1e.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(rr00 rr00Var, v1b<? super Unit> v1bVar) {
            return ((d) create(rr00Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            rr00 rr00Var = (rr00) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            m1e m1eVar = m1e.this;
            nvi nviVar = m1eVar.e0;
            if (nviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            boolean z = rr00Var instanceof rr00.b;
            nviVar.b.setEnabled(z);
            nvi nviVar2 = m1eVar.e0;
            if (nviVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            nviVar2.v.setEnabled(z);
            nvi nviVar3 = m1eVar.e0;
            if (nviVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            nviVar3.v.setLoading(rr00Var instanceof rr00.c);
            nvi nviVar4 = m1eVar.e0;
            if (nviVar4 != null) {
                nviVar4.w.setVisibility(rr00Var instanceof rr00.a ? 0 : 8);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initTradingViewModel$1$5", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<ChannelAsset.Channel, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = m1e.this.new e(v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChannelAsset.Channel channel, v1b<? super Unit> v1bVar) {
            return ((e) create(channel, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ChannelAsset.Channel channel = (ChannelAsset.Channel) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            nvi nviVar = m1e.this.e0;
            o77 o77Var = null;
            if (nviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            IconTextSelectorButton iconTextSelectorButton = nviVar.v;
            if (channel != null) {
                String channelShowName = channel.getChannelShowName();
                if (channelShowName == null) {
                    channelShowName = "";
                }
                int channelIconResId = channel.getChannelIconResId();
                String channelIconUrl = channel.getChannelIconUrl();
                o77Var = new o77(channelShowName, channelIconResId, channelIconUrl != null ? channelIconUrl : "");
            }
            p77.a(iconTextSelectorButton, o77Var);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initTradingViewModel$1$6", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = m1e.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
            return ((f) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c330 c330Var = (c330) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            m1e m1eVar = m1e.this;
            nvi nviVar = m1eVar.e0;
            if (nviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ProgressButton progressButton = nviVar.H;
            String string = m1eVar.getString(R.string.common_functions__processing_with_dot);
            string.getClass();
            progressButton.setLoadingText(string);
            b330.a(progressButton, c330Var);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initTradingViewModel$1$7", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<o200, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = m1e.this.new g(v1bVar);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o200 o200Var, v1b<? super Unit> v1bVar) {
            return ((g) create(o200Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            o200 o200Var = (o200) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            UiText uiText = o200Var.a;
            m1e m1eVar = m1e.this;
            if (uiText != null) {
                m1eVar.D0().setVisibility(0);
                HintView hintViewD0 = m1eVar.D0();
                UiText uiText2 = o200Var.a;
                Context contextRequireContext = m1eVar.requireContext();
                contextRequireContext.getClass();
                HintView.setHintInHtml$default(hintViewD0, uiText2.e(contextRequireContext), 0, 2, null);
                m1eVar.D0().setTypeColor(o200Var.b);
            } else {
                m1eVar.D0().setVisibility(8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initTradingViewModel$1$8", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public h(v1b<? super h> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = m1e.this.new h(v1bVar);
            hVar.a = ((Boolean) obj).booleanValue();
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((h) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            nvi nviVar = m1e.this.e0;
            if (nviVar != null) {
                nviVar.v.setEnabled(z);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initTradingViewModel$1$9", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = m1e.this.new i(v1bVar);
            iVar.a = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((i) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            m1e.this.H0().y1(str);
            return Unit.a;
        }
    }

    public static final class j extends qlr implements Function0<v8i0> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return m1e.this.requireActivity().getViewModelStore();
        }
    }

    public static final class k extends qlr implements Function0<cyb> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return m1e.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class l extends qlr implements Function0<r8i0.c> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return m1e.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public m1e() {
        super(R.layout.fragment_deposit_momo);
        this.c0 = false;
        this.d0 = false;
        this.f0 = new q8i0(jq40.a(r2e.class), new j(), new l(), new k());
    }

    @Override // defpackage.s62
    public final HintView D0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return nviVar.B;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        nvi nviVar = this.e0;
        if (nviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = nviVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return nviVar.I;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02, defpackage.s62
    public final void K0() {
        super.K0();
        r2e r2eVarP0 = P0();
        g1i g1iVar = new g1i(r2eVarP0.O0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(r2eVarP0.Q0, new b(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(r2eVarP0.W0, new c(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(r2eVarP0.U0, new d(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
        g1i g1iVar5 = new g1i(r2eVarP0.E0, new e(null));
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar5, lifecycle5, bVar);
        g1i g1iVar6 = new g1i(r2eVarP0.Y0, new f(null));
        s9s lifecycle6 = getLifecycle();
        lifecycle6.getClass();
        arr.a(g1iVar6, lifecycle6, bVar);
        g1i g1iVar7 = new g1i(r2eVarP0.b1, new g(null));
        s9s lifecycle7 = getLifecycle();
        lifecycle7.getClass();
        arr.a(g1iVar7, lifecycle7, bVar);
        g1i g1iVar8 = new g1i(r2eVarP0.S0, new h(null));
        s9s lifecycle8 = getLifecycle();
        lifecycle8.getClass();
        arr.a(g1iVar8, lifecycle8, bVar);
        g1i g1iVar9 = new g1i(r2eVarP0.J0, new i(null));
        s9s lifecycle9 = getLifecycle();
        lifecycle9.getClass();
        arr.a(g1iVar9, lifecycle9, bVar);
    }

    @Override // defpackage.g02, defpackage.s62
    public final void L0() {
        super.L0();
        nvi nviVar = this.e0;
        if (nviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(nviVar.D);
        nvi nviVar2 = this.e0;
        if (nviVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mla.i(nviVar2.w, new op8(-1839197755, new Function2() { // from class: e1e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m1e m1eVar = this.a;
                    boolean zA = aVar.A(m1eVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new j1e(m1eVar, i2);
                        aVar.r(objY);
                    }
                    qr00.a((Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        nvi nviVar3 = this.e0;
        if (nviVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        nviVar3.F.setOnClickListener(new View.OnClickListener() { // from class: f1e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getClass();
                lop.b(view, Boolean.FALSE);
                r2e r2eVarP0 = this.a.P0();
                r2eVarP0.P1();
                ku90<spg0> ku90Var = r2eVarP0.v;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__choose_number);
                ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__add_a_new_number);
                int i2 = vpg0.a;
                ku90Var.getClass();
                ku90Var.a(new spg0.n(resourceUiText, resourceUiText2, true, null));
            }
        });
        nvi nviVar4 = this.e0;
        if (nviVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        nviVar4.G.setOnClickedClose(new Function0() { // from class: g1e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                r2e r2eVarP0 = this.a.P0();
                ej5.c(o8i0.d(r2eVarP0), null, null, new c2e(null, r2eVarP0), 3);
                return Unit.a;
            }
        });
        nvi nviVar5 = this.e0;
        if (nviVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        nviVar5.v.setOnClickListener(new h1e(this, 0));
        nvi nviVar6 = this.e0;
        if (nviVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        nviVar6.H.setOnClickListener(new View.OnClickListener() { // from class: i1e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getClass();
                lop.b(view, Boolean.FALSE);
                r2e r2eVarP0 = this.a.P0();
                ej5.c(o8i0.d(r2eVarP0), null, null, new u1e(null, r2eVarP0), 3);
            }
        });
        nvi nviVar7 = this.e0;
        if (nviVar7 != null) {
            nviVar7.b.setErrorView(nviVar7.d);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.g02
    public final AmountQuickAddingButtonGroup M0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return nviVar.y;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02
    public final ComposeView O0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return nviVar.z;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final r2e P0() {
        return (r2e) this.f0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return kotlin.collections.a.c(nviVar.b);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return kotlin.collections.a.c(nviVar.c);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return nviVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_deposit_momo, viewGroup, false);
        int i2 = R.id.amount;
        ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, viewInflate);
        if (clearEditText != null) {
            i2 = R.id.amount_container;
            if (((FrameLayout) h5e.a(R.id.amount_container, viewInflate)) != null) {
                i2 = R.id.amount_details;
                if (((TextView) h5e.a(R.id.amount_details, viewInflate)) != null) {
                    i2 = R.id.amount_label;
                    TextView textView = (TextView) h5e.a(R.id.amount_label, viewInflate);
                    if (textView != null) {
                        i2 = R.id.amount_top_barrier;
                        if (((Barrier) h5e.a(R.id.amount_top_barrier, viewInflate)) != null) {
                            i2 = R.id.amount_warning;
                            TextView textView2 = (TextView) h5e.a(R.id.amount_warning, viewInflate);
                            if (textView2 != null) {
                                i2 = R.id.anti_interaction_mask;
                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
                                if (frameLayout != null) {
                                    i2 = R.id.balance;
                                    TextView textView3 = (TextView) h5e.a(R.id.balance, viewInflate);
                                    if (textView3 != null) {
                                        i2 = R.id.balance_label;
                                        TextView textView4 = (TextView) h5e.a(R.id.balance_label, viewInflate);
                                        if (textView4 != null) {
                                            i2 = R.id.bounty_details_layout;
                                            if (((ConstraintLayout) h5e.a(R.id.bounty_details_layout, viewInflate)) != null) {
                                                i2 = R.id.bounty_threshold_description;
                                                if (((TextView) h5e.a(R.id.bounty_threshold_description, viewInflate)) != null) {
                                                    i2 = R.id.bounty_title;
                                                    if (((TextView) h5e.a(R.id.bounty_title, viewInflate)) != null) {
                                                        i2 = R.id.channel;
                                                        IconTextSelectorButton iconTextSelectorButton = (IconTextSelectorButton) h5e.a(R.id.channel, viewInflate);
                                                        if (iconTextSelectorButton != null) {
                                                            i2 = R.id.charges_amount;
                                                            if (((TextView) h5e.a(R.id.charges_amount, viewInflate)) != null) {
                                                                i2 = R.id.charges_label;
                                                                if (((TextView) h5e.a(R.id.charges_label, viewInflate)) != null) {
                                                                    i2 = R.id.compose_phone_channel_hint;
                                                                    ComposeView composeView = (ComposeView) h5e.a(R.id.compose_phone_channel_hint, viewInflate);
                                                                    if (composeView != null) {
                                                                        i2 = R.id.deposit_amount_quick_adding_buttons;
                                                                        AmountQuickAddingButtonGroup amountQuickAddingButtonGroup = (AmountQuickAddingButtonGroup) h5e.a(R.id.deposit_amount_quick_adding_buttons, viewInflate);
                                                                        if (amountQuickAddingButtonGroup != null) {
                                                                            i2 = R.id.deposit_banner_compose_view;
                                                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.deposit_banner_compose_view, viewInflate);
                                                                            if (composeView2 != null) {
                                                                                i2 = R.id.description_list_view;
                                                                                SimpleDescriptionListView simpleDescriptionListView = (SimpleDescriptionListView) h5e.a(R.id.description_list_view, viewInflate);
                                                                                if (simpleDescriptionListView != null) {
                                                                                    i2 = R.id.guideline_begin;
                                                                                    if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                                                                                        i2 = R.id.guideline_end;
                                                                                        if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                                                                            i2 = R.id.hint_bottom_barrier;
                                                                                            if (((Barrier) h5e.a(R.id.hint_bottom_barrier, viewInflate)) != null) {
                                                                                                i2 = R.id.hint_view;
                                                                                                HintView hintView = (HintView) h5e.a(R.id.hint_view, viewInflate);
                                                                                                if (hintView != null) {
                                                                                                    i2 = R.id.init_failed_mask;
                                                                                                    LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                                                                                    if (loadingViewNew != null) {
                                                                                                        i2 = R.id.init_mask;
                                                                                                        ComposeView composeView3 = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                                                                        if (composeView3 != null) {
                                                                                                            i2 = R.id.loading_mask;
                                                                                                            LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                                                                            if (loadingViewNew2 != null) {
                                                                                                                i2 = R.id.mobile_selector;
                                                                                                                IconTextSelectorButton iconTextSelectorButton2 = (IconTextSelectorButton) h5e.a(R.id.mobile_selector, viewInflate);
                                                                                                                if (iconTextSelectorButton2 != null) {
                                                                                                                    i2 = R.id.newFeatureAlertView;
                                                                                                                    BubbleView bubbleView = (BubbleView) h5e.a(R.id.newFeatureAlertView, viewInflate);
                                                                                                                    if (bubbleView != null) {
                                                                                                                        i2 = R.id.next;
                                                                                                                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                                                                                                        if (progressButton != null) {
                                                                                                                            i2 = R.id.next_top_barrier;
                                                                                                                            if (((Barrier) h5e.a(R.id.next_top_barrier, viewInflate)) != null) {
                                                                                                                                i2 = R.id.quick_input_item_list_view;
                                                                                                                                if (((QuickInputItemListView) h5e.a(R.id.quick_input_item_list_view, viewInflate)) != null) {
                                                                                                                                    i2 = R.id.swipe;
                                                                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                                                                    if (swipeRefreshLayout != null) {
                                                                                                                                        i2 = R.id.total_receive_label;
                                                                                                                                        if (((TextView) h5e.a(R.id.total_receive_label, viewInflate)) != null) {
                                                                                                                                            FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                                                                                                            this.e0 = new nvi(frameLayout2, clearEditText, textView, textView2, frameLayout, textView3, textView4, iconTextSelectorButton, composeView, amountQuickAddingButtonGroup, composeView2, simpleDescriptionListView, hintView, loadingViewNew, composeView3, loadingViewNew2, iconTextSelectorButton2, bubbleView, progressButton, swipeRefreshLayout);
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
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.s62, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        xne0 xne0VarH0 = H0();
        g1i g1iVar = new g1i(xne0VarH0.e, new l1e(this, xne0VarH0, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(y0().v, new k1e(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return kotlin.collections.a.c(nviVar.i);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return kotlin.collections.a.c(nviVar.f);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return nviVar.A;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return nviVar.C;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return nviVar.D;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        nvi nviVar = this.e0;
        if (nviVar != null) {
            return nviVar.E;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
