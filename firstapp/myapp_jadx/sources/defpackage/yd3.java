package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import com.sportybet.android.instantwin.presentation.kickoff.betresult.BetResultAdapter;
import com.sportybet.android.instantwin.presentation.showoff.model.InstantVirtualShowOffType;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsInput;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyd3;", "Lk12;", "Ldro$a;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yd3 extends pml implements dro.a {
    public yvi B;
    public final BetResultAdapter C = new BetResultAdapter(Boolean.FALSE);
    public final q8i0 D;
    public final q8i0 E;
    public final q8i0 F;
    public ArrayList G;
    public final LinkedHashMap H;
    public jlo I;
    public psm J;
    public n4p K;
    public rdd0 L;
    public w9c0 M;
    public cmo N;
    public ie3 O;
    public jh2 P;

    public static final class a implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return yd3.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return yd3.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return yd3.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? yd3.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class f extends qlr implements Function0<Fragment> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return yd3.this;
        }
    }

    public static final class g extends qlr implements Function0<w8i0> {
        public final /* synthetic */ f a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.a = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class h extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class i extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
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

    public static final class j extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? yd3.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class k extends qlr implements Function0<Fragment> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return yd3.this;
        }
    }

    public static final class l extends qlr implements Function0<w8i0> {
        public final /* synthetic */ k a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class m extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class n extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ttr ttrVar) {
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

    public yd3() {
        f fVar = new f();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new g(fVar));
        this.D = new q8i0(jq40.a(dz50.class), new h(ttrVarA), new j(ttrVarA), new i(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new l(new k()));
        this.E = new q8i0(jq40.a(ktg.class), new m(ttrVarA2), new e(ttrVarA2), new n(ttrVarA2));
        this.F = new q8i0(jq40.a(gqf0.class), new b(), new d(), new c());
        this.H = new LinkedHashMap();
    }

    @Override // dro.a
    public final void k() {
        r0().e = null;
        yy50.a.m(new jqc());
        ktg ktgVar = (ktg) this.E.getValue();
        ktgVar.c.X(((n4p) s0()).c());
        u0();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_iwqk_bet_result, (ViewGroup) null, false);
        int i2 = R.id.action_bar;
        ActionBar actionBar = (ActionBar) h5e.a(R.id.action_bar, viewInflate);
        if (actionBar != null) {
            i2 = R.id.bet_result_list;
            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.bet_result_list, viewInflate);
            if (recyclerView != null) {
                i2 = R.id.commonbutton_bet_result_right_button;
                CommonButton commonButton = (CommonButton) h5e.a(R.id.commonbutton_bet_result_right_button, viewInflate);
                if (commonButton != null) {
                    i2 = R.id.constraintlayout_bet_result_bottom_buttons;
                    if (((ConstraintLayout) h5e.a(R.id.constraintlayout_bet_result_bottom_buttons, viewInflate)) != null) {
                        i2 = R.id.fragment_container;
                        if (((FrameLayout) h5e.a(R.id.fragment_container, viewInflate)) != null) {
                            i2 = R.id.league_tab_bar;
                            View viewA = h5e.a(R.id.league_tab_bar, viewInflate);
                            if (viewA != null) {
                                TabLayout tabLayout = (TabLayout) h5e.a(R.id.league_tab, viewA);
                                if (tabLayout == null) {
                                    bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(R.id.league_tab)));
                                    return null;
                                }
                                u4p u4pVar = new u4p((LinearLayout) viewA, tabLayout);
                                i2 = R.id.show_off_button;
                                Button button = (Button) h5e.a(R.id.show_off_button, viewInflate);
                                if (button != null) {
                                    i2 = R.id.show_off_coin;
                                    ImageView imageView = (ImageView) h5e.a(R.id.show_off_coin, viewInflate);
                                    if (imageView != null) {
                                        i2 = R.id.show_off_description;
                                        if (((TextView) h5e.a(R.id.show_off_description, viewInflate)) != null) {
                                            i2 = R.id.show_off_divider;
                                            if (((MaterialDivider) h5e.a(R.id.show_off_divider, viewInflate)) != null) {
                                                i2 = R.id.show_off_group;
                                                Group group = (Group) h5e.a(R.id.show_off_group, viewInflate);
                                                if (group != null) {
                                                    i2 = R.id.show_off_layout;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.show_off_layout, viewInflate);
                                                    if (constraintLayout != null) {
                                                        i2 = R.id.show_off_title;
                                                        if (((TextView) h5e.a(R.id.show_off_title, viewInflate)) != null) {
                                                            i2 = R.id.textview_bet_result_left_button;
                                                            TextView textView = (TextView) h5e.a(R.id.textview_bet_result_left_button, viewInflate);
                                                            if (textView != null) {
                                                                i2 = R.id.ticket_details;
                                                                TextView textView2 = (TextView) h5e.a(R.id.ticket_details, viewInflate);
                                                                if (textView2 != null) {
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                    this.B = new yvi(constraintLayout2, actionBar, recyclerView, commonButton, u4pVar, button, imageView, group, constraintLayout, textView, textView2);
                                                                    constraintLayout2.getClass();
                                                                    return constraintLayout2;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.B = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strI0;
        view.getClass();
        super.onViewCreated(view, bundle);
        yvi yviVar = this.B;
        if (yviVar != null) {
            ActionBar actionBar = yviVar.b;
            cmo cmoVar = this.N;
            if (cmoVar == null) {
                Intrinsics.n("instantWinSportRepo");
                throw null;
            }
            Integer numB = cmoVar.b(((n4p) s0()).c());
            LayoutInflater.Factory factoryRequireActivity = requireActivity();
            xzf0 xzf0Var = factoryRequireActivity instanceof xzf0 ? (xzf0) factoryRequireActivity : null;
            String str = (xzf0Var == null || (strI0 = xzf0Var.i0()) == null) ? "" : strI0;
            boolean z = numB != null;
            be3 be3Var = new be3(this);
            LayoutInflater.Factory factoryRequireActivity2 = requireActivity();
            xzf0 xzf0Var2 = factoryRequireActivity2 instanceof xzf0 ? (xzf0) factoryRequireActivity2 : null;
            if (xzf0Var2 != null) {
                xzf0Var2.E0(actionBar, str, true, z, true, be3Var);
            }
            if (numB != null) {
                actionBar.setSportsIcon(numB.intValue());
            }
            TabLayout tabLayout = yviVar.e.b;
            tabLayout.setTabGravity(0);
            tabLayout.setTabMode(0);
            tabLayout.setSelectedTabIndicatorHeight(zch0.a(requireContext(), 4));
            tabLayout.setSelectedTabIndicatorColor(c8i0.c(R.color.brand_secondary, tabLayout));
            tabLayout.a(new ce3(this));
            yviVar.w.setOnClickListener(new de3(new cq40(), this));
            yviVar.f.setOnClickListener(new ee3(new cq40(), this));
            ImageView imageView = yviVar.i;
            m9n m9nVarA = qw90.a(imageView.getContext());
            nan.a aVar = new nan.a(imageView.getContext());
            aVar.c = "https://s.sporty.net/cms/iv_show_off_coin_b5057df082.png";
            abn.f(aVar, imageView);
            m9nVarA.a(aVar.a());
            yviVar.c.setAdapter(this.C);
            TextView textView = yviVar.y;
            textView.setText(sn5.c(textView, R.string.page_instant_virtual__view_details, new Object[0]));
            textView.setOnClickListener(new View.OnClickListener() { // from class: vd3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    yd3 yd3Var = this.a;
                    yvi yviVar2 = yd3Var.B;
                    if (yviVar2 == null) {
                        return;
                    }
                    TextView textView2 = yviVar2.y;
                    TextView textView3 = yviVar2.z;
                    TabLayout tabLayout2 = yviVar2.e.b;
                    Fragment fragmentH = yd3Var.getChildFragmentManager().H("TAG_TICKET_DETAIL_FRAGMENT");
                    if (yd3Var.getChildFragmentManager().L() >= 1 && (fragmentH instanceof eqf0)) {
                        yd3Var.getChildFragmentManager().Y();
                        tabLayout2.setVisibility(0);
                        textView3.setVisibility(8);
                        textView2.setText(sn5.d(yd3Var, R.string.page_instant_virtual__view_details, new Object[0]));
                        return;
                    }
                    eqf0 eqf0Var = new eqf0();
                    FragmentManager childFragmentManager = yd3Var.getChildFragmentManager();
                    childFragmentManager.getClass();
                    a aVar2 = new a(childFragmentManager);
                    aVar2.f(R.id.fragment_container, eqf0Var, "TAG_TICKET_DETAIL_FRAGMENT");
                    aVar2.c("TAG_TICKET_DETAIL_FRAGMENT");
                    aVar2.d();
                    textView3.setVisibility(0);
                    tabLayout2.setVisibility(4);
                    textView2.setText(sn5.d(yd3Var, R.string.page_instant_virtual__game_result, new Object[0]));
                }
            });
            CommonButton commonButton = yviVar.d;
            commonButton.setText(sn5.c(commonButton, R.string.page_instant_virtual__next_round, new Object[0]));
            commonButton.setDescriptionText("");
            commonButton.setOnClickListener(new View.OnClickListener() { // from class: wd3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    yd3 yd3Var = this.a;
                    yd3Var.r0().e = null;
                    yy50.a.m(new jqc());
                    ktg ktgVar = (ktg) yd3Var.E.getValue();
                    ktgVar.c.X(((n4p) yd3Var.s0()).c());
                    yd3Var.u0();
                }
            });
        }
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        r0().f.f(viewLifecycleOwner, new a(new zd3(1, this, yd3.class, "handleRoundState", "handleRoundState(Lcom/sportybet/android/common/DataState;)V", 0)));
        ((ktg) this.E.getValue()).d.f(viewLifecycleOwner, new a(new ae3(1, this, yd3.class, "handleEventsResultState", "handleEventsResultState(Lcom/sportybet/android/common/DataState;)V", 0)));
        rdd0 rdd0Var = this.L;
        if (rdd0Var != null) {
            rdd0Var.a(new a5o.h0(((n4p) s0()).c()), k00.d);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    public final void p0(List<EventInRound> list) {
        ie3 ie3Var = this.O;
        if (ie3Var == null) {
            Intrinsics.n("betsResultItemCreator");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.C.setList(ie3Var.a(contextRequireContext, r0().x1(), ((n4p) s0()).F(), list));
    }

    public final void q0(String str) {
        yvi yviVar = this.B;
        if (yviVar != null) {
            yviVar.v.setVisibility((Intrinsics.g(str, "fake_league_id_my_events") && t0()) ? 0 : 8);
        }
    }

    public final dz50 r0() {
        return (dz50) this.D.getValue();
    }

    public final tlo s0() {
        n4p n4pVar = this.K;
        if (n4pVar != null) {
            return n4pVar;
        }
        Intrinsics.n("sharedData");
        throw null;
    }

    public final boolean t0() {
        Round roundX1 = r0().x1();
        if (roundX1 == null) {
            return false;
        }
        List<TicketInRound> list = roundX1.tickets;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        for (TicketInRound ticketInRound : list) {
            List<Bet> list2 = ticketInRound.bets;
            if (list2 != null && list2.size() == 1 && ((Bet) CollectionsKt.T(ticketInRound.bets)).hit) {
                return ((n4p) s0()).G();
            }
        }
        return false;
    }

    @Override // dro.a
    public final void u() {
        v0();
    }

    public final void u0() {
        String strC = ((n4p) s0()).c();
        jh2 jh2Var = this.P;
        if (jh2Var == null) {
            Intrinsics.n("betBuilderModeManager");
            throw null;
        }
        boolean zB = jh2Var.B(strC);
        if (!((n4p) s0()).H()) {
            InstantWinInput instantWinInput = new InstantWinInput(strC, null, null, zB);
            jlo jloVar = this.I;
            if (jloVar == null) {
                Intrinsics.n("instantWinRouter");
                throw null;
            }
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            startActivity(jloVar.l(contextRequireContext, instantWinInput));
            return;
        }
        SportyLegendsInput sportyLegendsInput = new SportyLegendsInput(null, strC, zB);
        jlo jloVar2 = this.I;
        if (jloVar2 == null) {
            Intrinsics.n("instantWinRouter");
            throw null;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        startActivity(jloVar2.b(contextRequireContext2, sportyLegendsInput));
        w9c0 w9c0Var = this.M;
        if (w9c0Var != null) {
            w9c0Var.c(v9c0.l.a);
        } else {
            Intrinsics.n("sportyLegendsAnalyticsTracker");
            throw null;
        }
    }

    public final void v0() {
        Round roundD = ((gqf0) this.F.getValue()).a.d();
        if (roundD == null) {
            return;
        }
        InstantVirtualShowOffType.RoundWithCompleteInfo roundWithCompleteInfo = new InstantVirtualShowOffType.RoundWithCompleteInfo(roundD);
        String strC = ((n4p) s0()).c();
        q5o q5oVar = new q5o();
        q5oVar.setArguments(vj5.a(new Pair("ARG_TYPE", roundWithCompleteInfo), new Pair("ARG_SPORT_ID", strC)));
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        q5oVar.show(childFragmentManager, "TAG_INSTANT_VIRTUAL_SHOW_OFF_DIALOG_FRAGMENT");
    }
}
