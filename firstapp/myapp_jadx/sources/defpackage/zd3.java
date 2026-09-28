package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.League;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zd3 extends saj implements Function1<hqc, Unit> {
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(hqc hqcVar) {
        ArrayList arrayListL;
        hqc hqcVar2 = hqcVar;
        hqcVar2.getClass();
        yd3 yd3Var = (yd3) this.receiver;
        yd3Var.getClass();
        if (hqcVar2 instanceof lqc) {
            yd3Var.n0(0);
        } else if (hqcVar2 instanceof nqc) {
            T t = ((nqc) hqcVar2).a;
            t.getClass();
            Round round = (Round) t;
            League league = new League("fake_league_id_my_events", sn5.d(yd3Var, R.string.page_instant_virtual__my_events, new Object[0]), "");
            if (((n4p) yd3Var.s0()).H()) {
                arrayListL = b.l(league);
            } else {
                List<League> list = round.leagues;
                if (list.contains(league)) {
                    list = null;
                }
                if (list != null) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.add(0, league);
                    arrayListL = arrayList;
                } else {
                    arrayListL = null;
                }
            }
            yd3Var.G = arrayListL;
            LinkedHashMap linkedHashMap = yd3Var.H;
            String str = league.leagueId;
            str.getClass();
            linkedHashMap.put(str, round.events);
            yvi yviVar = yd3Var.B;
            if (yviVar != null) {
                TabLayout tabLayout = yviVar.e.b;
                tabLayout.n();
                if (((n4p) yd3Var.s0()).H()) {
                    tabLayout.setSelectedTabIndicatorHeight(0);
                    ViewParent parent = tabLayout.getParent();
                    LinearLayout linearLayout = parent instanceof LinearLayout ? (LinearLayout) parent : null;
                    if (linearLayout != null) {
                        linearLayout.setGravity(8388611);
                    }
                    ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
                    layoutParams.getClass();
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 8388611;
                    tabLayout.setLayoutParams(layoutParams2);
                } else {
                    tabLayout.setSelectedTabIndicatorHeight(zch0.a(yd3Var.requireContext(), 4));
                }
                Iterable<League> iterable = yd3Var.G;
                if (iterable == null) {
                    iterable = m2g.a;
                }
                for (League league2 : iterable) {
                    TabLayout.g gVarL = tabLayout.l();
                    gVarL.e(league2.name);
                    tabLayout.b(gVarL);
                }
            }
            yd3Var.q0("fake_league_id_my_events");
            yd3Var.p0(round.events);
            BigDecimal totalReturn = round.getTotalReturn();
            totalReturn.getClass();
            psm psmVar = yd3Var.J;
            if (psmVar == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            String str2 = psmVar.b() + bjb0.L(totalReturn, Locale.US);
            yvi yviVar2 = yd3Var.B;
            if (yviVar2 != null) {
                yviVar2.d.setDescriptionText(sn5.d(yd3Var, R.string.page_instant_virtual__total_win_with_stake, str2));
            }
            ((gqf0) yd3Var.F.getValue()).a.m(round);
            if (yd3Var.isAdded() && !yd3Var.isDetached() && !yd3Var.isRemoving()) {
                List<TicketInRound> list2 = round.tickets;
                list2.getClass();
                Iterator<T> it = list2.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((TicketInRound) it.next()).totalReturn;
                }
                if (j > 0) {
                    FragmentManager childFragmentManager = yd3Var.getChildFragmentManager();
                    childFragmentManager.getClass();
                    if (childFragmentManager.H("TAG_INSTANT_WIN_WINNING_DIALOG_FRAGMENT") == null) {
                        String strC = ((n4p) yd3Var.s0()).c();
                        BigDecimal bigDecimalDivide = new BigDecimal(j).divide(heo.a, 2, RoundingMode.HALF_UP);
                        bigDecimalDivide.getClass();
                        fro froVar = new fro(strC, bigDecimalDivide, yd3Var.t0());
                        dro droVar = new dro();
                        droVar.setArguments(vj5.a(new Pair("ARG_INPUT", froVar)));
                        droVar.show(childFragmentManager, "TAG_INSTANT_WIN_WINNING_DIALOG_FRAGMENT");
                    }
                }
            }
        } else if (hqcVar2 instanceof kqc) {
            yd3Var.m0();
        }
        return Unit.a;
    }
}
