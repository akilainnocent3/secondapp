package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.BetHistoryCalendarActivity;
import com.sportybet.android.bethistory.presentation.dialog.BetDialogResult;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import o540.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lo540;", "Landroidx/fragment/app/Fragment;", "Lj9j;", "Lexi;", "<init>", "()V", "Lfr2;", "filterBarState", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o540 extends e1m implements j9j, exi {
    public jrm A;
    public h330 B;
    public pxi C;
    public w540 F;
    public boolean G;
    public Float H;
    public bc6 I;
    public final ee<pm7> J;
    public final ee<Intent> K;
    public com.sporty.android.common.uievent.e i;
    public iym v;
    public y8j w;
    public uqm y;
    public hc40 z;
    public final String f = "RealBetHistoryFragment";
    public final q8i0 D = new q8i0(jq40.a(d740.class), new b(), new d(), new c());
    public final q8i0 E = new q8i0(jq40.a(rws.class), new e(), new g(), new f());

    @c0d(c = "com.sportybet.android.bethistory.presentation.fragment.RealBetHistoryFragment$remixBetLauncher$1$1", f = "RealBetHistoryFragment.kt", l = {659}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = z;
            this.e = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return o540.this.new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            o540 o540Var = o540.this;
            if (i == 0) {
                uj50.b(obj);
                hc40 hc40Var = o540Var.z;
                if (hc40Var == null) {
                    Intrinsics.n("rebetRemixCombineAnTestHelper");
                    throw null;
                }
                nas nasVarA = ebs.a(o540Var.getLifecycle());
                this.a = 1;
                obj = hc40Var.g(nasVarA, this.c, this.d, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            rws rwsVarO0 = o540Var.o0();
            g08 g08Var = g08.REMIX_BET_RECOMMENDED_CODES;
            rws.y1(rwsVarO0, this.e, g08Var, (lws) obj, 12);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return o540.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return o540.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return o540.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return o540.this.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return o540.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return o540.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public o540() {
        ee<pm7> eeVarRegisterForActivityResult = registerForActivityResult(new BetHistoryCalendarActivity.a(), new ud() { // from class: l440
            @Override // defpackage.ud
            public final void a(Object obj) {
                qm7 qm7Var = (qm7) obj;
                qm7Var.getClass();
                boolean zEquals = qm7Var.equals(qm7.a.a);
                o540 o540Var = this.a;
                if (zEquals) {
                    bc6 bc6Var = o540Var.I;
                    if (bc6Var != null) {
                        if (bc6Var.p() instanceof bzx) {
                            zi50.a aVar = zi50.b;
                            bc6Var.resumeWith(null);
                            return;
                        } else {
                            itf0.a aVar2 = itf0.a;
                            aVar2.q(MyLog.TAG_COMMON);
                            aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
                if (qm7Var instanceof qm7.c) {
                    bc6 bc6Var2 = o540Var.I;
                    if (bc6Var2 != null) {
                        qm7.c cVar = (qm7.c) qm7Var;
                        Range range = new Range(new Date(cVar.a), new Date(cVar.b));
                        if (bc6Var2.p() instanceof bzx) {
                            zi50.a aVar3 = zi50.b;
                            bc6Var2.resumeWith(range);
                            return;
                        } else {
                            itf0.a aVar4 = itf0.a;
                            aVar4.q(MyLog.TAG_COMMON);
                            aVar4.n("Continuation not active, resume not perform.", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
                if (qm7Var.equals(qm7.b.a)) {
                    bc6 bc6Var3 = o540Var.I;
                    if (bc6Var3 != null) {
                        Object value = e1i.b(o540Var.q0().Q).a.getValue();
                        if (bc6Var3.p() instanceof bzx) {
                            zi50.a aVar5 = zi50.b;
                            bc6Var3.resumeWith(value);
                            return;
                        } else {
                            itf0.a aVar6 = itf0.a;
                            aVar6.q(MyLog.TAG_COMMON);
                            aVar6.n("Continuation not active, resume not perform.", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
                if (!qm7Var.equals(qm7.d.a)) {
                    uhc.a();
                    return;
                }
                bc6 bc6Var4 = o540Var.I;
                if (bc6Var4 != null) {
                    Object value2 = e1i.b(o540Var.q0().Q).a.getValue();
                    if (bc6Var4.p() instanceof bzx) {
                        zi50.a aVar7 = zi50.b;
                        bc6Var4.resumeWith(value2);
                    } else {
                        itf0.a aVar8 = itf0.a;
                        aVar8.q(MyLog.TAG_COMMON);
                        aVar8.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
                Intent intent = new Intent(o540Var.requireContext(), (Class<?>) PrevBetHistoryActivity.class);
                intent.putExtra("SETTLED", 1);
                yrh0.s(o540Var.requireContext(), intent, true);
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.J = eeVarRegisterForActivityResult;
        ee<Intent> eeVarRegisterForActivityResult2 = registerForActivityResult(new ce(), new ud() { // from class: m440
            @Override // defpackage.ud
            public final void a(Object obj) {
                Intent intent;
                String stringExtra;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.a != -1 || (intent = activityResult.b) == null || (stringExtra = intent.getStringExtra("extra_remix_bet_share_code")) == null || stringExtra.length() == 0) {
                    return;
                }
                o540 o540Var = this.a;
                uqm uqmVar = o540Var.y;
                if (uqmVar == null) {
                    Intrinsics.n("accountHelper");
                    throw null;
                }
                String userId = uqmVar.getUserId();
                if (userId == null) {
                    userId = "";
                }
                String str = userId;
                jrm jrmVar = o540Var.A;
                if (jrmVar != null) {
                    ej5.c(ebs.a(o540Var.getLifecycle()), null, null, o540Var.new a(str, !jrmVar.U().isEmpty(), stringExtra, null), 3);
                } else {
                    Intrinsics.n("betItem");
                    throw null;
                }
            }
        });
        eeVarRegisterForActivityResult2.getClass();
        this.K = eeVarRegisterForActivityResult2;
    }

    public static final void u0(o540 o540Var, qm2 qm2Var, String str, Bundle bundle) {
        bbj0 bbj0Var;
        z2z z2zVar;
        bundle.getClass();
        BetDialogResult betDialogResult = Build.VERSION.SDK_INT >= 33 ? (BetDialogResult) bundle.getParcelable(AnalyticsParam.EVENT_PARAM_RESULT, BetDialogResult.class) : (BetDialogResult) bundle.getParcelable(AnalyticsParam.EVENT_PARAM_RESULT);
        boolean z = betDialogResult instanceof BetDialogResult.Won;
        if (z || (betDialogResult instanceof BetDialogResult.Lost) || (betDialogResult instanceof BetDialogResult.Void)) {
            if (z) {
                bbj0Var = bbj0.b;
            } else if (betDialogResult instanceof BetDialogResult.Lost) {
                bbj0Var = bbj0.c;
            } else {
                bbj0Var = betDialogResult instanceof BetDialogResult.Void ? bbj0.d : bbj0.a;
            }
            wwd0 wwd0Var = o540Var.q0().M;
            wwd0Var.getClass();
            wwd0Var.k(null, bbj0Var);
            gym.a(o540Var.p0(), hn2.a);
            return;
        }
        boolean z2 = betDialogResult instanceof BetDialogResult.Settled;
        if (z2 || (betDialogResult instanceof BetDialogResult.Unsettled)) {
            if (z2) {
                z2zVar = z2z.SETTLED;
            } else {
                z2zVar = betDialogResult instanceof BetDialogResult.Unsettled ? z2z.UNSETTLED : z2z.ALL;
            }
            o540Var.q0().x1(z2zVar);
            gym.a(o540Var.p0(), jn2.a);
            return;
        }
        if (betDialogResult != null) {
            uhc.a();
            return;
        }
        int iOrdinal = qm2Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            } else {
                o540Var.q0().x1(z2z.ALL);
                gym.a(o540Var.p0(), jn2.a);
                return;
            }
        }
        d740 d740VarQ0 = o540Var.q0();
        bbj0 bbj0Var2 = bbj0.a;
        wwd0 wwd0Var2 = d740VarQ0.M;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bbj0Var2);
        gym.a(o540Var.p0(), hn2.a);
    }

    @Override // defpackage.exi
    public final void B(boolean z) {
        this.G = z;
        if (z) {
            r0();
        }
        if (isAdded()) {
            if (z) {
                q0().y.e(true);
                v0();
            } else {
                q0().y.e(false);
            }
            if (z) {
                return;
            }
            q0().y.c();
        }
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final void m0() {
        Float f2 = this.H;
        if (f2 != null) {
            final float fFloatValue = f2.floatValue();
            pxi pxiVar = this.C;
            if (pxiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            final ConstraintLayout constraintLayout = pxiVar.a;
            constraintLayout.getClass();
            pxi pxiVar2 = this.C;
            if (pxiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            final BubbleView bubbleView = pxiVar2.i;
            bubbleView.post(new Runnable() { // from class: k440
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintLayout constraintLayout2 = constraintLayout;
                    int width = constraintLayout2.getWidth();
                    BubbleView bubbleView2 = bubbleView;
                    int width2 = bubbleView2.getWidth();
                    if (width == 0 || width2 == 0) {
                        return;
                    }
                    int[] iArr = new int[2];
                    constraintLayout2.getLocationInWindow(iArr);
                    float f3 = (fFloatValue - iArr[0]) - (width2 / 2.0f);
                    float f4 = width - width2;
                    float f5 = f4 / 2.0f;
                    float f6 = 12.0f * this.getResources().getDisplayMetrics().density;
                    float f7 = f4 - f6;
                    bubbleView2.setTranslationX((f7 < f6 ? f5 : f.d(f3, f6, f7)) - f5);
                }
            });
        }
    }

    public final ArrayList n0() {
        RecyclerView.d0 d0VarQ;
        ArrayList arrayList = new ArrayList();
        pxi pxiVar = this.C;
        if (pxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView.o layoutManager = pxiVar.v.getLayoutManager();
        if (layoutManager != null) {
            int iK = layoutManager.K();
            for (int i = 0; i < iK; i++) {
                View viewJ = layoutManager.J(i);
                if (viewJ != null) {
                    pxi pxiVar2 = this.C;
                    if (pxiVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    d0VarQ = pxiVar2.v.Q(viewJ);
                } else {
                    d0VarQ = null;
                }
                z640 z640Var = d0VarQ instanceof z640 ? (z640) d0VarQ : null;
                if (z640Var != null) {
                    arrayList.add(z640Var);
                }
            }
        }
        return arrayList;
    }

    public final rws o0() {
        return (rws) this.E.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return new FrameLayout(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        q0().y.e(false);
        q0().y.c();
        if (this.C != null) {
            s0();
        }
        h330 h330Var = this.B;
        if (h330Var != null) {
            h330Var.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Object value;
        super.onResume();
        if (this.C != null) {
            d740 d740VarQ0 = q0();
            at2 at2Var = d740VarQ0.b;
            Long lQ = at2Var.q();
            Long lI = at2Var.i();
            if (lQ != null && lI != null) {
                long jLongValue = lI.longValue();
                long jLongValue2 = lQ.longValue();
                if (jLongValue2 > jLongValue) {
                    wwd0 wwd0Var = d740VarQ0.F;
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, Long.valueOf(jLongValue2)));
                }
            }
            d740 d740VarQ1 = q0();
            ej5.c(o8i0.d(d740VarQ1), null, null, new l740(null, d740VarQ1), 3);
        }
        if (this.G) {
            q0().y.e(true);
            v0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        r0();
    }

    public final iym p0() {
        iym iymVar = this.v;
        if (iymVar != null) {
            return iymVar;
        }
        Intrinsics.n("openTelemetryLogger");
        throw null;
    }

    public final d740 q0() {
        return (d740) this.D.getValue();
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [r440] */
    public final void r0() {
        if (this.C == null && this.G) {
            View view = getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null) {
                return;
            }
            int i = 0;
            View viewInflate = getLayoutInflater().inflate(R.layout.fragment_real_bet_history_order, viewGroup, false);
            viewGroup.addView(viewInflate);
            int i2 = R.id.anti_interaction_mask;
            View viewA = h5e.a(R.id.anti_interaction_mask, viewInflate);
            if (viewA != null) {
                i2 = R.id.bottom_action_bar;
                Group group = (Group) h5e.a(R.id.bottom_action_bar, viewInflate);
                if (group != null) {
                    i2 = R.id.btn_close;
                    ImageView imageView = (ImageView) h5e.a(R.id.btn_close, viewInflate);
                    if (imageView != null) {
                        i2 = R.id.btn_delete;
                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.btn_delete, viewInflate);
                        if (progressButton != null) {
                            i2 = R.id.compose_filter_bar;
                            if (((ComposeView) h5e.a(R.id.compose_filter_bar, viewInflate)) != null) {
                                int i3 = R.id.empty_data_view;
                                TextView textView = (TextView) h5e.a(R.id.empty_data_view, viewInflate);
                                if (textView != null) {
                                    i3 = R.id.init_failed_mask;
                                    LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                    if (loadingViewNew != null) {
                                        i3 = R.id.newFeatureFilterView;
                                        BubbleView bubbleView = (BubbleView) h5e.a(R.id.newFeatureFilterView, viewInflate);
                                        if (bubbleView != null) {
                                            i3 = R.id.recycler_view;
                                            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, viewInflate);
                                            if (recyclerView != null) {
                                                i3 = R.id.swipe_refresh_layout;
                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_refresh_layout, viewInflate);
                                                if (swipeRefreshLayout != null) {
                                                    final pxi pxiVar = new pxi((ConstraintLayout) viewInflate, viewA, group, imageView, progressButton, textView, loadingViewNew, bubbleView, recyclerView, swipeRefreshLayout);
                                                    this.C = pxiVar;
                                                    View view2 = getView();
                                                    ComposeView composeView = view2 != null ? (ComposeView) view2.findViewById(R.id.compose_filter_bar) : null;
                                                    int i4 = 1;
                                                    if (composeView != null) {
                                                        composeView.setContent(new op8(-1227981665, new Function2() { // from class: c440
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj, Object obj2) {
                                                                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                                                                int iIntValue = ((Integer) obj2).intValue();
                                                                int i5 = 1;
                                                                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                    final o540 o540Var = this;
                                                                    fr2 fr2Var = (fr2) n95.b(o540Var.q0().U, aVar).getValue();
                                                                    boolean zA = aVar.A(o540Var);
                                                                    Object objY = aVar.y();
                                                                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                                                                    if (zA || objY == c0042a) {
                                                                        e540 e540Var = new e540(1, o540Var, o540.class, "onBetResultFilterCenterXChanged", "onBetResultFilterCenterXChanged(F)V", 0);
                                                                        aVar.r(e540Var);
                                                                        objY = e540Var;
                                                                    }
                                                                    chp chpVar = (chp) objY;
                                                                    boolean zA2 = aVar.A(o540Var);
                                                                    Object objY2 = aVar.y();
                                                                    if (zA2 || objY2 == c0042a) {
                                                                        objY2 = new Function0() { // from class: n440
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                qm2 qm2Var = qm2.b;
                                                                                o540 o540Var2 = o540Var;
                                                                                o540Var2.t0(qm2Var);
                                                                                gym.a(o540Var2.p0(), kn2.a);
                                                                                return Unit.a;
                                                                            }
                                                                        };
                                                                        aVar.r(objY2);
                                                                    }
                                                                    Function0 function0 = (Function0) objY2;
                                                                    boolean zA3 = aVar.A(o540Var);
                                                                    Object objY3 = aVar.y();
                                                                    if (zA3 || objY3 == c0042a) {
                                                                        objY3 = new Function0() { // from class: o440
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                qm2 qm2Var = qm2.a;
                                                                                o540 o540Var2 = o540Var;
                                                                                o540Var2.t0(qm2Var);
                                                                                gym.a(o540Var2.p0(), in2.a);
                                                                                return Unit.a;
                                                                            }
                                                                        };
                                                                        aVar.r(objY3);
                                                                    }
                                                                    Function0 function1 = (Function0) objY3;
                                                                    boolean zA4 = aVar.A(o540Var);
                                                                    Object objY4 = aVar.y();
                                                                    if (zA4 || objY4 == c0042a) {
                                                                        objY4 = new mn3(o540Var, i5);
                                                                        aVar.r(objY4);
                                                                    }
                                                                    Function0 function2 = (Function0) objY4;
                                                                    boolean zA5 = aVar.A(o540Var);
                                                                    pxi pxiVar2 = pxiVar;
                                                                    boolean zA6 = zA5 | aVar.A(pxiVar2);
                                                                    Object objY5 = aVar.y();
                                                                    if (zA6 || objY5 == c0042a) {
                                                                        objY5 = new h4r(i5, o540Var, pxiVar2);
                                                                        aVar.r(objY5);
                                                                    }
                                                                    Function0 function3 = (Function0) objY5;
                                                                    boolean zA7 = aVar.A(o540Var);
                                                                    Object objY6 = aVar.y();
                                                                    if (zA7 || objY6 == c0042a) {
                                                                        objY6 = new on3(o540Var, i5);
                                                                        aVar.r(objY6);
                                                                    }
                                                                    er2.a(fr2Var, new bmh(function0, function1, function2, function3, (Function0) objY6, (Function1) chpVar), aVar, 0);
                                                                } else {
                                                                    aVar.G();
                                                                }
                                                                return Unit.a;
                                                            }
                                                        }, true));
                                                    }
                                                    bubbleView.setOnClickedClose(new Function0() { // from class: d440
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            pxiVar.i.setVisibility(8);
                                                            d740 d740VarQ0 = this.q0();
                                                            ej5.c(o8i0.d(d740VarQ0), null, null, new i740(null, d740VarQ0), 3);
                                                            return Unit.a;
                                                        }
                                                    });
                                                    viewA.setOnClickListener(new e440());
                                                    imageView.setOnClickListener(new View.OnClickListener() { // from class: f440
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view3) {
                                                            this.a.q0().A1(null);
                                                        }
                                                    });
                                                    progressButton.setOnClickListener(new View.OnClickListener() { // from class: g440
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view3) {
                                                            d740 d740VarQ0 = this.a.q0();
                                                            ej5.c(o8i0.d(d740VarQ0), null, null, new g740(null, d740VarQ0), 3);
                                                        }
                                                    });
                                                    recyclerView.o0(0);
                                                    y8j y8jVar = this.w;
                                                    if (y8jVar == null) {
                                                        Intrinsics.n("fullStoryCommonManager");
                                                        throw null;
                                                    }
                                                    this.F = new w540(y8jVar, new h440(this, 0), new q8h(this, 1), new i440(this, 0), new j440(this, i), new wcm(this, 1), new c4r(this, i4), new Function1() { // from class: r440
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            z640 z640Var = (z640) obj;
                                                            z640Var.getClass();
                                                            ArrayList arrayListN0 = this.a.n0();
                                                            int size = arrayListN0.size();
                                                            int i5 = 0;
                                                            while (i5 < size) {
                                                                Object obj2 = arrayListN0.get(i5);
                                                                i5++;
                                                                z640 z640Var2 = (z640) obj2;
                                                                if (!Intrinsics.g(z640Var2, z640Var)) {
                                                                    z640Var2.b(true);
                                                                }
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, new t440(this));
                                                    final yp40 yp40Var = new yp40();
                                                    final yp40 yp40Var2 = new yp40();
                                                    yp40Var2.a = true;
                                                    w540 w540Var = this.F;
                                                    if (w540Var == null) {
                                                        Intrinsics.n("realBetHistoryAdapter");
                                                        throw null;
                                                    }
                                                    w540Var.i(new Function1() { // from class: u440
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            CharSequence charSequenceE;
                                                            y78 y78Var = (y78) obj;
                                                            y78Var.getClass();
                                                            pxi pxiVar2 = pxiVar;
                                                            SwipeRefreshLayout swipeRefreshLayout2 = pxiVar2.w;
                                                            TextView textView2 = pxiVar2.e;
                                                            LoadingViewNew loadingViewNew2 = pxiVar2.f;
                                                            hxs hxsVar = y78Var.a;
                                                            hxs.b bVar = hxs.b.b;
                                                            swipeRefreshLayout2.setRefreshing(Intrinsics.g(hxsVar, bVar));
                                                            boolean z = hxsVar instanceof hxs.c;
                                                            yp40 yp40Var3 = yp40Var2;
                                                            final o540 o540Var = this;
                                                            if (z) {
                                                                if (yp40Var3.a) {
                                                                    pxiVar2.v.post(new Runnable() { // from class: p440
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            o540Var.v0();
                                                                        }
                                                                    });
                                                                    yp40Var3.a = false;
                                                                }
                                                                w540 w540Var2 = o540Var.F;
                                                                if (w540Var2 == null) {
                                                                    Intrinsics.n("realBetHistoryAdapter");
                                                                    throw null;
                                                                }
                                                                c8i0.o(textView2, w540Var2.getItemCount() == 0);
                                                                loadingViewNew2.setVisibility(8);
                                                            } else if (hxsVar instanceof hxs.a) {
                                                                Throwable th = ((hxs.a) hxsVar).b;
                                                                textView2.setVisibility(8);
                                                                loadingViewNew2.setVisibility(0);
                                                                if (th instanceof SprThrowable) {
                                                                    charSequenceE = ((SprThrowable) th).getE();
                                                                } else {
                                                                    ResourceUiText resourceUiText = vch0.b;
                                                                    Context contextRequireContext = o540Var.requireContext();
                                                                    contextRequireContext.getClass();
                                                                    charSequenceE = resourceUiText.e(contextRequireContext);
                                                                }
                                                                loadingViewNew2.c(charSequenceE);
                                                            } else {
                                                                if (!Intrinsics.g(hxsVar, bVar)) {
                                                                    uhc.a();
                                                                    return null;
                                                                }
                                                                yp40Var.a = true;
                                                                yp40Var3.a = true;
                                                            }
                                                            return Unit.a;
                                                        }
                                                    });
                                                    w540 w540Var2 = this.F;
                                                    if (w540Var2 == null) {
                                                        Intrinsics.n("realBetHistoryAdapter");
                                                        throw null;
                                                    }
                                                    Function0<Unit> function0 = new Function0() { // from class: v440
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            yp40 yp40Var3 = yp40Var;
                                                            if (yp40Var3.a) {
                                                                w540 w540Var3 = this.F;
                                                                if (w540Var3 == null) {
                                                                    Intrinsics.n("realBetHistoryAdapter");
                                                                    throw null;
                                                                }
                                                                if (w540Var3.getItemCount() > 0) {
                                                                    pxiVar.v.o0(0);
                                                                    yp40Var3.a = false;
                                                                }
                                                            }
                                                            return Unit.a;
                                                        }
                                                    };
                                                    v01<T> v01Var = w540Var2.b;
                                                    v01Var.getClass();
                                                    v01Var.h.f.add(function0);
                                                    y340 y340Var = new y340(new w440(this, i), new x440(this, i));
                                                    w540 w540Var3 = this.F;
                                                    if (w540Var3 == null) {
                                                        Intrinsics.n("realBetHistoryAdapter");
                                                        throw null;
                                                    }
                                                    w540Var3.i(new oqz(y340Var));
                                                    recyclerView.setAdapter(new androidx.recyclerview.widget.f(w540Var3, y340Var));
                                                    recyclerView.k(new f540(this));
                                                    swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: y440
                                                        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                                                        public final void i() {
                                                            w540 w540Var4 = this.a.F;
                                                            if (w540Var4 != null) {
                                                                w540Var4.b.h.d();
                                                            } else {
                                                                Intrinsics.n("realBetHistoryAdapter");
                                                                throw null;
                                                            }
                                                        }
                                                    });
                                                    loadingViewNew.setOnClickListener(new View.OnClickListener() { // from class: z440
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view3) {
                                                            w540 w540Var4 = this.a.F;
                                                            if (w540Var4 != null) {
                                                                w540Var4.b.h.e();
                                                            } else {
                                                                Intrinsics.n("realBetHistoryAdapter");
                                                                throw null;
                                                            }
                                                        }
                                                    });
                                                    Context contextRequireContext = requireContext();
                                                    contextRequireContext.getClass();
                                                    this.B = new h330(contextRequireContext);
                                                    g1i g1iVar = new g1i(e1i.a(q0().B), new g540(this, null));
                                                    s9s lifecycle = getLifecycle();
                                                    lifecycle.getClass();
                                                    s9s.b bVar = s9s.b.d;
                                                    arr.a(g1iVar, lifecycle, bVar);
                                                    g1i g1iVar2 = new g1i(e1i.a(q0().C), new h540(this, null));
                                                    s9s lifecycle2 = getLifecycle();
                                                    lifecycle2.getClass();
                                                    arr.a(g1iVar2, lifecycle2, bVar);
                                                    g1i g1iVar3 = new g1i(q0().G, new i540(this, null));
                                                    s9s lifecycle3 = getLifecycle();
                                                    lifecycle3.getClass();
                                                    arr.a(g1iVar3, lifecycle3, bVar);
                                                    g1i g1iVar4 = new g1i(q0().R, new j540(this, null));
                                                    s9s lifecycle4 = getLifecycle();
                                                    lifecycle4.getClass();
                                                    arr.a(g1iVar4, lifecycle4, bVar);
                                                    g1i g1iVar5 = new g1i(e1i.b(q0().J), new k540(this, null));
                                                    s9s lifecycle5 = getLifecycle();
                                                    lifecycle5.getClass();
                                                    arr.a(g1iVar5, lifecycle5, bVar);
                                                    g1i g1iVar6 = new g1i(e1i.b(q0().I), new l540(this, null));
                                                    s9s lifecycle6 = getLifecycle();
                                                    lifecycle6.getClass();
                                                    arr.a(g1iVar6, lifecycle6, bVar);
                                                    g1i g1iVar7 = new g1i(e1i.b(q0().M), new m540(this, null));
                                                    s9s lifecycle7 = getLifecycle();
                                                    lifecycle7.getClass();
                                                    arr.a(g1iVar7, lifecycle7, bVar);
                                                    g1i g1iVar8 = new g1i(q0().W, new n540(this, null));
                                                    s9s lifecycle8 = getLifecycle();
                                                    lifecycle8.getClass();
                                                    arr.a(g1iVar8, lifecycle8, bVar);
                                                    g1i g1iVar9 = new g1i(o0().e, new a540(this, null));
                                                    s9s lifecycle9 = getLifecycle();
                                                    lifecycle9.getClass();
                                                    arr.a(g1iVar9, lifecycle9, bVar);
                                                    g1i g1iVar10 = new g1i(o0().i, new b540(this, null));
                                                    s9s lifecycle10 = getLifecycle();
                                                    lifecycle10.getClass();
                                                    arr.a(g1iVar10, lifecycle10, bVar);
                                                    g1i g1iVar11 = new g1i(o0().w, new c540(this, null));
                                                    s9s lifecycle11 = getLifecycle();
                                                    lifecycle11.getClass();
                                                    arr.a(g1iVar11, lifecycle11, bVar);
                                                    g1i g1iVar12 = new g1i(new f1i(o0().z), new d540(this, null));
                                                    s9s lifecycle12 = getLifecycle();
                                                    lifecycle12.getClass();
                                                    arr.a(g1iVar12, lifecycle12, bVar);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i3;
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        }
    }

    public final void s0() {
        ArrayList arrayListN0 = n0();
        int size = arrayListN0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListN0.get(i);
            i++;
            ((z640) obj).b(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.fragment.app.FragmentManager] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void t0(final qm2 qm2Var) {
        BetDialogResult betDialogResult;
        ?? bVar;
        FragmentManager supportFragmentManager;
        getParentFragmentManager().n0("bet_status_result_details", this, new qxi() { // from class: s440
            @Override // defpackage.qxi
            public final void a(String str, Bundle bundle) {
                o540.u0(this.a, qm2Var, str, bundle);
            }
        });
        int iOrdinal = qm2Var.ordinal();
        if (iOrdinal == 0) {
            betDialogResult = ((fgj0) q0().T.a.getValue()).c;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            betDialogResult = ((rm80) q0().S.a.getValue()).e;
        }
        lq2 lq2Var = lq2.a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        lq2Var.getClass();
        try {
            zi50.a aVar = zi50.b;
            Context contextB = dvi.b(contextRequireContext);
            androidx.fragment.app.e eVar = contextB instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) contextB : null;
            if (eVar != null) {
                supportFragmentManager = eVar.getSupportFragmentManager();
            } else {
                bVar = 0;
            }
            if ((bVar != 0 ? bVar.H("BetStatusAndResultDialog") : null) != null) {
                bVar = supportFragmentManager;
                bVar = supportFragmentManager;
                itf0.a aVar2 = itf0.a;
                aVar2.q("BetStatusAndResultDialog");
                aVar2.a("a dialog is already on the screen", new Object[0]);
                bVar = 0;
            }
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        bVar = supportFragmentManager;
        bVar = supportFragmentManager;
        FragmentManager fragmentManager = (FragmentManager) (bVar instanceof zi50.b ? 0 : bVar);
        if (fragmentManager != null) {
            com.sportybet.android.bethistory.presentation.dialog.a aVar4 = new com.sportybet.android.bethistory.presentation.dialog.a();
            aVar4.b = qm2Var;
            aVar4.c = betDialogResult;
            if (aVar4.a != null) {
                aVar4.j0();
            }
            aVar4.show(fragmentManager, "BetStatusAndResultDialog");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v0() {
        int iMin;
        if (this.F == null) {
            return;
        }
        pxi pxiVar = this.C;
        if (pxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView.o layoutManager = pxiVar.v.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iF1 = linearLayoutManager.f1();
        int iG1 = linearLayoutManager.g1();
        if (iF1 < 0 || iG1 < 0) {
            return;
        }
        w540 w540Var = this.F;
        if (w540Var == null) {
            Intrinsics.n("realBetHistoryAdapter");
            throw null;
        }
        int itemCount = w540Var.getItemCount();
        if (itemCount == 0 || iF1 > (iMin = Math.min(iG1, itemCount - 1))) {
            return;
        }
        while (true) {
            w540 w540Var2 = this.F;
            if (w540Var2 == null) {
                Intrinsics.n("realBetHistoryAdapter");
                throw null;
            }
            v01<T> v01Var = w540Var2.b;
            mi10 mi10Var = (mi10) v01Var.g.get();
            t640 t640Var = (t640) (mi10Var != null ? g9e0.d(mi10Var, iF1) : v01Var.h.d.e(iF1));
            if (t640Var != null && t640Var.C) {
                d740 d740VarQ0 = q0();
                String str = t640Var.a;
                str.getClass();
                ej5.c(o8i0.d(d740VarQ0), null, null, new t740(d740VarQ0, str, null), 3);
            }
            if (iF1 == iMin) {
                return;
            } else {
                iF1++;
            }
        }
    }
}
