package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Ltmj0;", "Lj82;", "<init>", "()V", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus;", "state", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tmj0 extends y7m {
    public yyi a0;
    public final q8i0 b0;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawMomoFragment$initTradingViewModel$1$1", f = "WithdrawMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = tmj0.this.new a(v1bVar);
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
            yyi yyiVar = tmj0.this.a0;
            if (yyiVar != null) {
                yyiVar.D.setText(str);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawMomoFragment$initTradingViewModel$1$2", f = "WithdrawMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<rr00, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = tmj0.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(rr00 rr00Var, v1b<? super Unit> v1bVar) {
            return ((b) create(rr00Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            rr00 rr00Var = (rr00) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            tmj0 tmj0Var = tmj0.this;
            yyi yyiVar = tmj0Var.a0;
            if (yyiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            boolean z = rr00Var instanceof rr00.b;
            yyiVar.b.setEnabled(z);
            yyi yyiVar2 = tmj0Var.a0;
            if (yyiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yyiVar2.v.setEnabled(z);
            yyi yyiVar3 = tmj0Var.a0;
            if (yyiVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yyiVar3.v.setLoading(rr00Var instanceof rr00.c);
            yyi yyiVar4 = tmj0Var.a0;
            if (yyiVar4 != null) {
                yyiVar4.w.setVisibility(rr00Var instanceof rr00.a ? 0 : 8);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawMomoFragment$initTradingViewModel$1$3", f = "WithdrawMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<ChannelAsset.Channel, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = tmj0.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChannelAsset.Channel channel, v1b<? super Unit> v1bVar) {
            return ((c) create(channel, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ChannelAsset.Channel channel = (ChannelAsset.Channel) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yyi yyiVar = tmj0.this.a0;
            o77 o77Var = null;
            if (yyiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            IconTextSelectorButton iconTextSelectorButton = yyiVar.v;
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

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawMomoFragment$initTradingViewModel$1$4", f = "WithdrawMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = tmj0.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
            return ((d) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c330 c330Var = (c330) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yyi yyiVar = tmj0.this.a0;
            if (yyiVar != null) {
                b330.a(yyiVar.E, c330Var);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawMomoFragment$initTradingViewModel$1$5", f = "WithdrawMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = tmj0.this.new e(v1bVar);
            eVar.a = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((e) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yyi yyiVar = tmj0.this.a0;
            if (yyiVar != null) {
                yyiVar.v.setEnabled(z);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawMomoFragment$initTradingViewModel$1$6", f = "WithdrawMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = tmj0.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((f) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            tmj0.this.H0().y1(str);
            return Unit.a;
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return tmj0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return tmj0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class i extends qlr implements Function0<r8i0.c> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return tmj0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public tmj0() {
        super(R.layout.fragment_withdraw_momo);
        this.Y = false;
        this.Z = false;
        this.b0 = new q8i0(jq40.a(dnj0.class), new g(), new i(), new h());
    }

    @Override // defpackage.s62
    public final HintView D0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.z;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        yyi yyiVar = this.a0;
        if (yyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = yyiVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.F;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82, defpackage.s62
    public final void K0() {
        super.K0();
        dnj0 dnj0VarP0 = P0();
        g1i g1iVar = new g1i(dnj0VarP0.A0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(dnj0VarP0.H0, new b(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(dnj0VarP0.F0, new c(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(dnj0VarP0.C0, new d(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
        g1i g1iVar5 = new g1i(dnj0VarP0.z0, new e(null));
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar5, lifecycle5, bVar);
        g1i g1iVar6 = new g1i(dnj0VarP0.x0, new f(null));
        s9s lifecycle6 = getLifecycle();
        lifecycle6.getClass();
        arr.a(g1iVar6, lifecycle6, bVar);
    }

    @Override // defpackage.j82, defpackage.s62
    public final void L0() {
        super.L0();
        yyi yyiVar = this.a0;
        if (yyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(yyiVar.B);
        yyi yyiVar2 = this.a0;
        if (yyiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mla.i(yyiVar2.w, new op8(688484447, new Function2() { // from class: nmj0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final tmj0 tmj0Var = this.a;
                    boolean zA = aVar.A(tmj0Var);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: qmj0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                dnj0 dnj0VarP0 = tmj0Var.P0();
                                UserPhone userPhone = (UserPhone) dnj0VarP0.y0.a.getValue();
                                if (userPhone != null) {
                                    jvd0 jvd0Var = dnj0VarP0.I0;
                                    if (jvd0Var != null) {
                                        jvd0Var.cancel((CancellationException) null);
                                    }
                                    dnj0VarP0.I0 = ej5.c(o8i0.d(dnj0VarP0), null, null, new xmj0(dnj0VarP0, userPhone, null), 3);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    qr00.a((Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        yyi yyiVar3 = this.a0;
        if (yyiVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        yyiVar3.v.setOnClickListener(new View.OnClickListener() { // from class: omj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getClass();
                lop.b(view, Boolean.FALSE);
                dnj0 dnj0VarP0 = this.a.P0();
                Object value = dnj0VarP0.D0.a.getValue();
                lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                List<ChannelAsset.Channel> list = cVar != null ? (List) cVar.a : null;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (ChannelAsset.Channel channel : list) {
                        ChannelAsset.Channel channel2 = (ChannelAsset.Channel) dnj0VarP0.F0.getValue();
                        aoe0.h hVarC = coe0.c(channel, channel2 != null ? channel2.getChannelSendName() : null);
                        if (hVarC != null) {
                            arrayList.add(hVarC);
                        }
                    }
                    wwd0 wwd0Var = dnj0VarP0.U;
                    wne0 wne0Var = new wne0(14, arrayList);
                    wwd0Var.getClass();
                    wwd0Var.k(null, wne0Var);
                    ku90<spg0> ku90Var = dnj0VarP0.v;
                    int i2 = vpg0.a;
                    ku90Var.getClass();
                    ku90Var.a(new spg0.m(false));
                }
            }
        });
        yyi yyiVar4 = this.a0;
        if (yyiVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        yyiVar4.E.setOnClickListener(new View.OnClickListener() { // from class: pmj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tmj0 tmj0Var = this.a;
                yyi yyiVar5 = tmj0Var.a0;
                if (yyiVar5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                lop.b(yyiVar5.b, Boolean.FALSE);
                dnj0 dnj0VarP0 = tmj0Var.P0();
                ej5.c(o8i0.d(dnj0VarP0), null, null, new wmj0(null, dnj0VarP0), 3);
            }
        });
        yyi yyiVar5 = this.a0;
        if (yyiVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        yyiVar5.b.setErrorView(yyiVar5.d);
        yyi yyiVar6 = this.a0;
        if (yyiVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        yyiVar6.D.setEnabled(false);
        yyiVar6.I.setAspectRatio(0.17777778f);
        yyi yyiVar7 = this.a0;
        if (yyiVar7 != null) {
            mla.i(yyiVar7.H, new op8(1688231304, new stf(this), true));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.j82
    public final TextView O0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.G;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final TextView P0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.J;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final TextView Q0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.K;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final View R0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.L;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final dnj0 P0() {
        return (dnj0) this.b0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return kotlin.collections.a.c(yyiVar.b);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return kotlin.collections.a.c(yyiVar.c);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_withdraw_momo, viewGroup, false);
        int i2 = R.id.amount;
        ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, viewInflate);
        if (clearEditText != null) {
            i2 = R.id.amount_container;
            if (((FrameLayout) h5e.a(R.id.amount_container, viewInflate)) != null) {
                i2 = R.id.amount_label;
                TextView textView = (TextView) h5e.a(R.id.amount_label, viewInflate);
                if (textView != null) {
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
                                    i2 = R.id.channel;
                                    IconTextSelectorButton iconTextSelectorButton = (IconTextSelectorButton) h5e.a(R.id.channel, viewInflate);
                                    if (iconTextSelectorButton != null) {
                                        i2 = R.id.compose_phone_channel_hint;
                                        ComposeView composeView = (ComposeView) h5e.a(R.id.compose_phone_channel_hint, viewInflate);
                                        if (composeView != null) {
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
                                                                    ComposeView composeView2 = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                                    if (composeView2 != null) {
                                                                        i2 = R.id.loading_mask;
                                                                        LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                                        if (loadingViewNew2 != null) {
                                                                            i2 = R.id.mobile_selector;
                                                                            IconTextSelectorButton iconTextSelectorButton2 = (IconTextSelectorButton) h5e.a(R.id.mobile_selector, viewInflate);
                                                                            if (iconTextSelectorButton2 != null) {
                                                                                i2 = R.id.next;
                                                                                ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                                                                if (progressButton != null) {
                                                                                    i2 = R.id.swipe;
                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                    if (swipeRefreshLayout != null) {
                                                                                        i2 = R.id.wh_tax_description;
                                                                                        TextView textView5 = (TextView) h5e.a(R.id.wh_tax_description, viewInflate);
                                                                                        if (textView5 != null) {
                                                                                            i2 = R.id.withdraw_alert_hint;
                                                                                            ComposeView composeView3 = (ComposeView) h5e.a(R.id.withdraw_alert_hint, viewInflate);
                                                                                            if (composeView3 != null) {
                                                                                                i2 = R.id.withdraw_banner;
                                                                                                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) h5e.a(R.id.withdraw_banner, viewInflate);
                                                                                                if (aspectRatioImageView != null) {
                                                                                                    i2 = R.id.withdrawable_balance;
                                                                                                    TextView textView6 = (TextView) h5e.a(R.id.withdrawable_balance, viewInflate);
                                                                                                    if (textView6 != null) {
                                                                                                        i2 = R.id.withdrawable_balance_label;
                                                                                                        TextView textView7 = (TextView) h5e.a(R.id.withdrawable_balance_label, viewInflate);
                                                                                                        if (textView7 != null) {
                                                                                                            i2 = R.id.withdrawable_help;
                                                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.withdrawable_help, viewInflate);
                                                                                                            if (appCompatImageView != null) {
                                                                                                                FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                                                                                this.a0 = new yyi(frameLayout2, clearEditText, textView, textView2, frameLayout, textView3, textView4, iconTextSelectorButton, composeView, simpleDescriptionListView, hintView, loadingViewNew, composeView2, loadingViewNew2, iconTextSelectorButton2, progressButton, swipeRefreshLayout, textView5, composeView3, aspectRatioImageView, textView6, textView7, appCompatImageView);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.j82, defpackage.s62, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        g1i g1iVar = new g1i(H0().e, new smj0(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(y0().v, new rmj0(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return kotlin.collections.a.c(yyiVar.i);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return kotlin.collections.a.c(yyiVar.f);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final AspectRatioImageView r0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.I;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.y;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.A;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.B;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        yyi yyiVar = this.a0;
        if (yyiVar != null) {
            return yyiVar.C;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
