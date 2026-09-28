package defpackage;

import android.view.View;
import androidx.recyclerview.widget.f;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.BetMarketOptionType;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.LiveEventDataInPreMatch;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchMarketTitleData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData;
import com.sportybet.plugin.realsports.prematch.data.TournamentTitleData;
import com.sportybet.plugin.realsports.prematch.widget.MarketsTabs;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ej20 {
    public final MarketsTabs a;
    public final OneUpTwoUpSwitch b;
    public final OUEarlyGoalsSwitch c;
    public final View d;
    public final BubbleView e;
    public final iuy f;
    public final mjf g;
    public final npg h;
    public final xhh0 i;
    public final a8z j;
    public final muh k;
    public final bl20 l;
    public final cl20 m;
    public final dl20 n;
    public final PreMatchSportActivity.e o;
    public final PreMatchSportActivity.f p;
    public final ity q;
    public tf20 r;
    public f s;
    public String t;
    public RegularMarketRule u;
    public String v;
    public final mpe0 w;

    public ej20(MarketsTabs marketsTabs, OneUpTwoUpSwitch oneUpTwoUpSwitch, OUEarlyGoalsSwitch oUEarlyGoalsSwitch, View view, BubbleView bubbleView, iuy iuyVar, mjf mjfVar, npg npgVar, xhh0 xhh0Var, zhh0 zhh0Var, a8z a8zVar, muh muhVar, bl20 bl20Var, cl20 cl20Var, dl20 dl20Var, PreMatchSportActivity.e eVar, PreMatchSportActivity.f fVar, ity ityVar) {
        npgVar.getClass();
        a8zVar.getClass();
        muhVar.getClass();
        ityVar.getClass();
        this.a = marketsTabs;
        this.b = oneUpTwoUpSwitch;
        this.c = oUEarlyGoalsSwitch;
        this.d = view;
        this.e = bubbleView;
        this.f = iuyVar;
        this.g = mjfVar;
        this.h = npgVar;
        this.i = xhh0Var;
        this.j = a8zVar;
        this.k = muhVar;
        this.l = bl20Var;
        this.m = cl20Var;
        this.n = dl20Var;
        this.o = eVar;
        this.p = fVar;
        this.q = ityVar;
        this.w = hwr.b(new aj20());
        marketsTabs.setMarketSelected(new jyt(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x02b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:89:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c3  */
    public final void a(final Function0<Unit> function0) {
        Object obj;
        TournamentTitleData tournamentTitleData;
        String str;
        String str2;
        ej20 ej20Var = this;
        RegularMarketRule regularMarketRule = ej20Var.u;
        if (regularMarketRule == null) {
            tf20 tf20Var = ej20Var.r;
            if (tf20Var != null) {
                tf20Var.i(CollectionsKt.A0(ej20Var.b()));
                return;
            }
            return;
        }
        String str3 = regularMarketRule.a;
        List<PreMatchSectionData> listB = ej20Var.b();
        int i = 0;
        for (Object obj2 : listB) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            PreMatchSectionData preMatchSectionData = (PreMatchSectionData) obj2;
            if (Intrinsics.g(preMatchSectionData.getSelectedMarket(), regularMarketRule)) {
                str2 = str3;
            } else if (preMatchSectionData instanceof LiveEventDataInPreMatch) {
                str2 = str3;
                ej20Var.b().set(i, LiveEventDataInPreMatch.copy$default((LiveEventDataInPreMatch) preMatchSectionData, 0, regularMarketRule, null, null, null, false, null, null, false, false, false, false, false, false, false, false, null, null, 262141, null));
            } else {
                str2 = str3;
                int i3 = i;
                if (preMatchSectionData instanceof PreMatchEventData) {
                    b().set(i3, PreMatchEventData.copy$default((PreMatchEventData) preMatchSectionData, 0, regularMarketRule, null, null, null, null, null, null, 0L, false, false, null, null, false, false, false, false, false, false, false, false, null, null, 8388605, null));
                } else if (preMatchSectionData instanceof PreMatchMarketTitleData) {
                    PreMatchMarketTitleData preMatchMarketTitleData = (PreMatchMarketTitleData) preMatchSectionData;
                    RegularMarketRule regularMarketRule2 = regularMarketRule;
                    regularMarketRule = regularMarketRule2;
                    b().set(i3, preMatchMarketTitleData.copy((16383 & 1) != 0 ? preMatchMarketTitleData.viewType : 0, (16383 & 2) != 0 ? preMatchMarketTitleData.startTime : 0L, (16383 & 4) != 0 ? preMatchMarketTitleData.oddsMin : null, (16383 & 8) != 0 ? preMatchMarketTitleData.oddsMax : null, (16383 & 16) != 0 ? preMatchMarketTitleData.haveOneUpMarket : false, (16383 & 32) != 0 ? preMatchMarketTitleData.haveActiveOneUpMarket : false, (16383 & 64) != 0 ? preMatchMarketTitleData.haveTwoUpMarket : false, (16383 & 128) != 0 ? preMatchMarketTitleData.haveActiveTwoUpMarket : false, (16383 & 256) != 0 ? preMatchMarketTitleData.haveDCOneUpMarket : false, (16383 & 512) != 0 ? preMatchMarketTitleData.haveActiveDCOneUpMarket : false, (16383 & 1024) != 0 ? preMatchMarketTitleData.haveOUEarlyGoalsMarket : false, (16383 & 2048) != 0 ? preMatchMarketTitleData.haveActiveOUEarlyGoalsMarket : false, (16383 & 4096) != 0 ? preMatchMarketTitleData.selectedMarket : regularMarketRule2, (16383 & 8192) != 0 ? preMatchMarketTitleData.filteredMarketList : null));
                }
            }
            ej20Var = this;
            i = i2;
            str3 = str2;
        }
        String str4 = str3;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : listB) {
            PreMatchSectionData preMatchSectionData2 = (PreMatchSectionData) obj3;
            if (!(preMatchSectionData2 instanceof PreMatchEventData)) {
                preMatchSectionData2 = null;
            }
            PreMatchEventData preMatchEventData = (PreMatchEventData) preMatchSectionData2;
            if (preMatchEventData == null) {
                str = str4;
            } else {
                str = str4;
                if (preMatchEventData.getEvent().hasAnyOutcomeInOddsRange(str, preMatchEventData.getOddsMin(), preMatchEventData.getOddsMax())) {
                    List<Market> list = preMatchEventData.getEvent().markets;
                    ArrayList arrayListA = kw5.a(list);
                    for (Object obj4 : list) {
                        Market market = (Market) obj4;
                        if (Intrinsics.g(market.id, str) && market.status == 0) {
                            arrayListA.add(obj4);
                        }
                    }
                    preMatchEventData.setFilteredMarketList(arrayListA);
                } else {
                    preMatchEventData.setFilteredMarketList(null);
                }
                str4 = str;
            }
            arrayList.add(obj3);
            str4 = str;
        }
        int size = arrayList.size();
        long startTime = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj5 = arrayList.get(i4);
            i4++;
            PreMatchSectionData preMatchSectionData3 = (PreMatchSectionData) obj5;
            if (preMatchSectionData3 instanceof PreMatchEventData) {
                PreMatchEventData preMatchEventData2 = (PreMatchEventData) preMatchSectionData3;
                preMatchEventData2.setShowTitle(!vjt.a(startTime, preMatchEventData2.getStartTime()));
                startTime = preMatchEventData2.getStartTime();
            } else if (preMatchSectionData3 instanceof TournamentTitleData) {
                startTime = 0;
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size2 = arrayList2.size();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i7 < size2) {
            Object obj6 = arrayList2.get(i7);
            i7++;
            int i8 = i5 + 1;
            if (i5 < 0) {
                b.q();
                throw null;
            }
            PreMatchSectionData preMatchSectionData4 = (PreMatchSectionData) obj6;
            boolean z = preMatchSectionData4 instanceof TournamentTitleData;
            if (!z || i6 == i5) {
                if (i5 == arrayList2.size() - 1) {
                    if (z) {
                        TournamentTitleData tournamentTitleData2 = (TournamentTitleData) preMatchSectionData4;
                        if (tournamentTitleData2.isExpand()) {
                            arrayList2.set(i5, TournamentTitleData.copy$default(tournamentTitleData2, 0, null, null, null, 0, false, false, false, false, false, false, false, false, false, false, null, null, null, 262127, null));
                        } else if (!z) {
                            obj = arrayList2.get(i6);
                            if (!(obj instanceof TournamentTitleData)) {
                                obj = null;
                            }
                            tournamentTitleData = (TournamentTitleData) obj;
                            if (tournamentTitleData == null) {
                                arrayList2.set(i6, TournamentTitleData.copy$default(tournamentTitleData, 0, null, null, null, i5 - i6, false, false, false, false, false, false, false, false, false, false, null, null, null, 262127, null));
                            }
                        }
                    } else if (!z) {
                        obj = arrayList2.get(i6);
                        if (!(obj instanceof TournamentTitleData)) {
                            obj = null;
                        }
                        tournamentTitleData = (TournamentTitleData) obj;
                        if (tournamentTitleData == null) {
                            arrayList2.set(i6, TournamentTitleData.copy$default(tournamentTitleData, 0, null, null, null, i5 - i6, false, false, false, false, false, false, false, false, false, false, null, null, null, 262127, null));
                        }
                    }
                }
                i5 = i6;
                i6 = i5;
            } else {
                Object obj7 = arrayList2.get(i6);
                if (!(obj7 instanceof TournamentTitleData)) {
                    obj7 = null;
                }
                TournamentTitleData tournamentTitleData3 = (TournamentTitleData) obj7;
                if (tournamentTitleData3 != null) {
                    if (tournamentTitleData3.isExpand()) {
                        arrayList2.set(i6, TournamentTitleData.copy$default(tournamentTitleData3, 0, null, null, null, (i5 - i6) - 1, false, false, false, false, false, false, false, false, false, false, null, null, null, 262127, null));
                    }
                    if (i5 == arrayList2.size() - 1) {
                        TournamentTitleData tournamentTitleData4 = (TournamentTitleData) preMatchSectionData4;
                        if (tournamentTitleData4.isExpand()) {
                            arrayList2.set(i5, TournamentTitleData.copy$default(tournamentTitleData4, 0, null, null, null, 0, false, false, false, false, false, false, false, false, false, false, null, null, null, 262127, null));
                        }
                    }
                    i6 = i5;
                }
            }
            i5 = i8;
        }
        tf20 tf20Var2 = this.r;
        if (tf20Var2 != null) {
            tf20Var2.j(arrayList2, new Runnable() { // from class: dj20
                @Override // java.lang.Runnable
                public final void run() {
                    function0.invoke();
                }
            });
        }
    }

    public final List<PreMatchSectionData> b() {
        return (List) this.w.getValue();
    }

    public final void c(boolean z) {
        RegularMarketRule regularMarketRule;
        String str = this.t;
        if (str == null || (regularMarketRule = this.u) == null) {
            return;
        }
        String str2 = regularMarketRule.a;
        RegularMarketRule regularMarketRuleA = this.g.b(ckf.c, str, str2, false) ? RegularMarketRule.a(yay.a(str2, z), null) : regularMarketRule;
        if (regularMarketRuleA == null) {
            return;
        }
        f(regularMarketRule, regularMarketRuleA);
    }

    public final void d(RegularMarketRule regularMarketRule, boolean z) {
        String str = this.t;
        xhh0 xhh0Var = this.i;
        boolean zE = xhh0Var.e(regularMarketRule, str, false);
        boolean zB = this.g.b(ckf.c, this.t, regularMarketRule != null ? regularMarketRule.a : null, false);
        boolean zBooleanValue = ((Boolean) this.m.invoke()).booleanValue();
        PreMatchSportActivity.f fVar = this.p;
        View view = this.d;
        OUEarlyGoalsSwitch oUEarlyGoalsSwitch = this.c;
        OneUpTwoUpSwitch oneUpTwoUpSwitch = this.b;
        BubbleView bubbleView = this.e;
        if (!z && zE) {
            whh0 whh0VarD = xhh0Var.d(this.t, regularMarketRule != null ? regularMarketRule.a : null, false);
            yhh0 yhh0VarA = zhh0.a(whh0VarD);
            hih0.a(oneUpTwoUpSwitch, yhh0VarA.a);
            hih0.c(oneUpTwoUpSwitch, yhh0VarA.b, false, true);
            oneUpTwoUpSwitch.setVisibility(0);
            oUEarlyGoalsSwitch.setVisibility(8);
            view.setVisibility(0);
            jqu jquVar = (((Boolean) this.n.invoke()).booleanValue() || !((whh0VarD != null ? whh0VarD.a : null) == rhh0.b && whh0VarD.c.contains(phh0.a))) ? null : jqu.b;
            if (jquVar != null) {
                lqu.c(bubbleView, jquVar, null);
            }
            c8i0.o(bubbleView, jquVar != null);
            fVar.a(BetMarketOptionType.UP_MARKET, regularMarketRule);
            return;
        }
        if (z || !zB) {
            oneUpTwoUpSwitch.setVisibility(8);
            oUEarlyGoalsSwitch.setVisibility(8);
            view.setVisibility(8);
            bubbleView.setVisibility(8);
            return;
        }
        boolean zG = yay.g(regularMarketRule != null ? regularMarketRule.a : null);
        oneUpTwoUpSwitch.setVisibility(8);
        oUEarlyGoalsSwitch.setVisibility(0);
        oUEarlyGoalsSwitch.setState(zG, false, true);
        view.setVisibility(0);
        if (zBooleanValue) {
            lqu.c(bubbleView, jqu.a, null);
        }
        c8i0.o(bubbleView, zBooleanValue);
        fVar.a(BetMarketOptionType.OVER_UNDER_EARLY_GOALS, regularMarketRule);
    }

    public final void e(List<? extends PreMatchSectionData> list, boolean z, final Function0<Unit> function0) {
        list.getClass();
        tf20 tf20Var = this.r;
        if (!z) {
            if (tf20Var != null) {
                tf20Var.j(list, new Runnable() { // from class: bj20
                    @Override // java.lang.Runnable
                    public final void run() {
                        function0.invoke();
                    }
                });
            }
        } else {
            if (tf20Var != null) {
                tf20.E.clear();
                tf20.F.clear();
            }
            k48.a(b(), list);
            a(function0);
        }
    }

    public final void f(RegularMarketRule regularMarketRule, RegularMarketRule regularMarketRule2) {
        MarketsTabs marketsTabs = this.a;
        int tabCount = marketsTabs.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.g gVarK = marketsTabs.k(i);
            Object obj = gVarK != null ? gVarK.a : null;
            RegularMarketRule regularMarketRule3 = obj instanceof RegularMarketRule ? (RegularMarketRule) obj : null;
            if (Intrinsics.g(regularMarketRule3 != null ? regularMarketRule3.a : null, regularMarketRule.a)) {
                gVarK.a = regularMarketRule2;
                marketsTabs.getMarketSelected().invoke(regularMarketRule2);
                return;
            }
        }
    }
}
