package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.cruxlab.sectionedrecyclerview.lib.b;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.live.data.UpcomingOutcomeMeta;
import com.sportybet.plugin.realsports.live.data.UpcomingSpinnerMeta;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class djh0 extends b<com.cruxlab.sectionedrecyclerview.lib.a.b, zih0> {
    public final /* synthetic */ vfh0 e;
    public final mjf f;
    public final hkf g;
    public final xhh0 h;
    public final a8z i;
    public final muh j;
    public final ity k;
    public final ArrayList l;
    public final ArrayList m;
    public iqs n;
    public jqs o;
    public nps p;
    public gqs q;
    public final LinkedHashMap r;
    public boolean s;
    public int t;
    public sih0 u;
    public mfb0 v;
    public RegularMarketRule w;
    public final fjh0 x;

    public static final class a {
        public a() {
        }
    }

    public djh0(LivePageActivity livePageActivity, uqm uqmVar, mjf mjfVar, hkf hkfVar, xhh0 xhh0Var, zhh0 zhh0Var, a8z a8zVar, muh muhVar, ity ityVar) {
        uqmVar.getClass();
        ityVar.getClass();
        this.e = new vfh0(livePageActivity, "live/upcoming");
        this.f = mjfVar;
        this.g = hkfVar;
        this.h = xhh0Var;
        this.i = a8zVar;
        this.j = muhVar;
        this.k = ityVar;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.r = new LinkedHashMap();
        this.t = -1;
        this.x = new fjh0(this, uqmVar);
    }

    @Override // com.cruxlab.sectionedrecyclerview.lib.a
    public final int a() {
        return this.m.size();
    }

    @Override // com.cruxlab.sectionedrecyclerview.lib.a
    public final short b(int i) {
        if (i < 0) {
            return (short) -1;
        }
        ArrayList arrayList = this.m;
        if (i < arrayList.size()) {
            return (short) ((jpc) arrayList.get(i)).a();
        }
        return (short) -1;
    }

    /* JADX WARN: Code duplicated, block: B:243:0x0545  */
    /* JADX WARN: Code duplicated, block: B:245:0x0549  */
    /* JADX WARN: Code duplicated, block: B:248:0x0555  */
    /* JADX WARN: Code duplicated, block: B:250:0x0564  */
    /* JADX WARN: Code duplicated, block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e1  */
    @Override // com.cruxlab.sectionedrecyclerview.lib.a
    public final void f(com.cruxlab.sectionedrecyclerview.lib.a.b bVar, int i) {
        int i2;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        String strB;
        int i3;
        Iterator it;
        int i4;
        int i5;
        String str;
        boolean z;
        int iMax;
        String str2;
        String str3;
        int i6;
        com.cruxlab.sectionedrecyclerview.lib.a.b bVar2 = bVar;
        bVar2.getClass();
        short sB = b(i);
        final RegularMarketRule regularMarketRule = this.w;
        if (regularMarketRule == null) {
            return;
        }
        String str4 = regularMarketRule.a;
        ArrayList arrayList = this.m;
        boolean z2 = false;
        if (sB != 2) {
            if (sB != 8) {
                if (sB != 9) {
                    return;
                }
                if (!(bVar2 instanceof iih0)) {
                    bVar2 = null;
                }
                iih0 iih0Var = (iih0) bVar2;
                if (iih0Var != null) {
                    mfb0 mfb0Var = this.v;
                    whh0 whh0VarC = this.h.c(this.w, mfb0Var != null ? mfb0Var.getId() : null, false);
                    if ((whh0VarC != null ? whh0VarC.b : null) != phh0.a) {
                        if ((whh0VarC != null ? whh0VarC.b : null) == phh0.b) {
                            if (n(whh0VarC) == avy.b) {
                                z2 = true;
                            }
                        } else if (yay.f(this.w)) {
                            z2 = this.s;
                        }
                    } else if (n(whh0VarC) == avy.a) {
                        z2 = true;
                    }
                    iih0Var.b.b.G(z2 ? R.string.common_functions__no_game : R.string.common_feedback__no_available_filtered_games);
                    return;
                }
                return;
            }
            if (!(bVar2 instanceof cjh0)) {
                bVar2 = null;
            }
            final cjh0 cjh0Var = (cjh0) bVar2;
            if (cjh0Var != null) {
                mpe0 mpe0Var = cjh0Var.e;
                mpe0 mpe0Var2 = cjh0Var.d;
                Object obj = arrayList.get(i);
                obj.getClass();
                rru rruVar = (rru) obj;
                fjh0 fjh0Var = cjh0Var.c;
                tjd0 tjd0Var = cjh0Var.b;
                if (i == 0) {
                    RelativeLayout relativeLayout = tjd0Var.e;
                    relativeLayout.getClass();
                    c8i0.k(0, relativeLayout);
                    return;
                }
                RelativeLayout relativeLayout2 = tjd0Var.e;
                relativeLayout2.getClass();
                c8i0.k(-2, relativeLayout2);
                TextView textView = tjd0Var.b;
                ListenableSpinner listenableSpinner = tjd0Var.v;
                textView.setText(bwf0.c(rruVar.a, fjh0Var.a()));
                if (regularMarketRule.c) {
                    listenableSpinner.setVisibility(0);
                    listenableSpinner.setOnItemSelectedListener(null);
                    ((eru) mpe0Var.getValue()).clear();
                    ((eru) mpe0Var.getValue()).addAll(fjh0Var.c());
                    str4.getClass();
                    listenableSpinner.setSelection(fjh0Var.b(str4));
                    listenableSpinner.setOnItemSelectedListener(new fpy() { // from class: bjh0
                        @Override // android.widget.AdapterView.OnItemSelectedListener
                        public final void onItemSelected(AdapterView adapterView, View view, int i7, long j) {
                            fjh0 fjh0Var2 = cjh0Var.c;
                            String str5 = regularMarketRule.a;
                            str5.getClass();
                            fjh0Var2.d(i7, str5);
                        }
                    });
                    Object obj2 = ((List) mpe0Var2.getValue()).get(0);
                    obj2.getClass();
                    ((View) obj2).setVisibility(8);
                    i6 = 1;
                } else {
                    listenableSpinner.setVisibility(8);
                    i6 = 0;
                }
                String[] strArr = regularMarketRule.d;
                strArr.getClass();
                for (String str5 : strArr) {
                    ((TextView) ((List) mpe0Var2.getValue()).get(i6)).setText(str5);
                    Object obj3 = ((List) mpe0Var2.getValue()).get(i6);
                    obj3.getClass();
                    ((View) obj3).setVisibility(0);
                    i6++;
                }
                while (i6 < ((List) mpe0Var2.getValue()).size()) {
                    Object obj4 = ((List) mpe0Var2.getValue()).get(i6);
                    obj4.getClass();
                    ((View) obj4).setVisibility(8);
                    i6++;
                }
                return;
            }
            return;
        }
        if (!(bVar2 instanceof qih0)) {
            bVar2 = null;
        }
        final qih0 qih0Var = (qih0) bVar2;
        if (qih0Var == null) {
            return;
        }
        lty ltyVar = qih0Var.h;
        mpe0 mpe0Var3 = qih0Var.i;
        Object obj5 = arrayList.get(i);
        obj5.getClass();
        final ing ingVar = (ing) obj5;
        a aVar = qih0Var.c;
        ajh0 ajh0Var = qih0Var.d;
        Context context = qih0Var.f;
        sjd0 sjd0Var = qih0Var.b;
        ltyVar.a();
        qih0Var.e.a(ltyVar, ingVar.a, regularMarketRule, null);
        LinearLayout linearLayout = sjd0Var.i;
        AppCompatImageView appCompatImageView = sjd0Var.J;
        AppCompatImageView appCompatImageView2 = sjd0Var.L;
        ImageView imageView = sjd0Var.D;
        TextView textView2 = sjd0Var.c;
        linearLayout.setTag(ingVar.a);
        sjd0Var.E.setVisibility(!ingVar.c ? 0 : 8);
        imageView.setVisibility(nkd0.a.a.a(ingVar.a) ? 0 : 8);
        context.getClass();
        int iA = fug0.a(hug0.a, context);
        if (iA == 0) {
            i2 = R.drawable.spr_sport_sim_label;
        } else if (iA == 1) {
            i2 = R.drawable.spr_sport_sim_label_sw;
        } else if (iA == 2) {
            i2 = R.drawable.spr_sport_sim_label_es_mx;
        } else if (iA == 3) {
            i2 = R.drawable.spr_sport_sim_label_pt_br;
        } else if (iA == 4) {
            i2 = R.drawable.spr_sport_sim_label;
        } else {
            if (iA != 5) {
                uhc.a();
                return;
            }
            i2 = R.drawable.spr_sport_sim_label_fr_fr;
        }
        imageView.setImageDrawable(gr0.a(context, i2));
        sjd0Var.B.setVisibility(ingVar.a.oddsBoost ? 0 : 8);
        sjd0Var.N.setVisibility(ingVar.a.topTeam ? 0 : 8);
        sjd0Var.O.setVisibility(b3.S(ingVar.a.eventId) ? 0 : 8);
        appCompatImageView2.setVisibility(ingVar.a.showStats() ? 0 : 8);
        appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: kih0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ajh0 ajh0Var2 = qih0Var.d;
                if (ajh0Var2 != null) {
                    Event event = ingVar.a;
                    event.getClass();
                    ajh0Var2.a(event);
                }
            }
        });
        sjd0Var.M.setText(bwf0.a.s(ingVar.a.estimateStartTime, false));
        Event event = ingVar.a;
        if (event.gameId != null) {
            sjd0Var.f.setText(b3.P(event));
        }
        int i7 = ingVar.a.commentsNum;
        TextView textView3 = sjd0Var.d;
        textView3.setText(sn5.b(context, R.string.live__comment_count, String.valueOf(Math.min(i7, 999))));
        textView3.setVisibility(i7 > 0 ? 0 : 8);
        if (ingVar.v || (str2 = ingVar.f) == null || str2.length() == 0 || (str3 = ingVar.i) == null || str3.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(sn5.b(context, R.string.app_common__league_title, ingVar.f, ingVar.i));
            textView2.setVisibility(0);
        }
        sjd0Var.e.setText(ingVar.a.homeTeamName);
        sjd0Var.b.setText(ingVar.a.awayTeamName);
        sjd0Var.v.setText(b3.M(ingVar.a));
        sjd0Var.K.setVisibility(ingVar.a.hasLiveStream() ? 0 : 8);
        sjd0Var.H.setVisibility(ingVar.d ? 0 : 8);
        boolean z3 = regularMarketRule.c;
        List<Market> marketList = ingVar.a.getMarketList(str4);
        List<String> specifierList = ingVar.a.getSpecifierList(marketList);
        if (ajh0Var == null || (bigDecimal = ajh0Var.e().a) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        if (ajh0Var == null || (bigDecimal2 = ajh0Var.e().b) == null) {
            bigDecimal2 = BigDecimal.ZERO;
        }
        if (z3) {
            str4.getClass();
            aVar.getClass();
            strB = ingVar.b(str4, djh0.this.e.e(str4), bigDecimal, bigDecimal2);
        } else {
            strB = null;
        }
        Market market = ingVar.a.getMarket(str4, strB);
        ListenableSpinner listenableSpinner2 = sjd0Var.F;
        if (z3) {
            str4.getClass();
            specifierList.getClass();
            listenableSpinner2.setTag(new UpcomingSpinnerMeta(i, str4, specifierList));
            u8z u8zVar = (u8z) mpe0Var3.getValue();
            Event event2 = ingVar.a;
            event2.getClass();
            marketList.getClass();
            u8zVar.f(event2, marketList);
            ((u8z) mpe0Var3.getValue()).clear();
            ((u8z) mpe0Var3.getValue()).addAll(tru.i(specifierList));
            if (strB != null) {
                z = false;
                iMax = Math.max(specifierList.indexOf(strB), 0);
            } else {
                z = false;
                iMax = 0;
            }
            listenableSpinner2.setSelection(iMax, z);
            listenableSpinner2.setVisibility((market == null || specifierList.isEmpty()) ? 8 : 0);
        } else {
            listenableSpinner2.setVisibility(8);
        }
        boolean zIsEmpty = specifierList.isEmpty();
        Event event3 = ingVar.a;
        event3.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        if (z3) {
            List<OutcomeButton> list = qih0Var.g;
            if (list == null) {
                Intrinsics.n("buttons");
                throw null;
            }
            c8i0.f(list.get(0));
        }
        int length = (z3 ? 1 : 0) + regularMarketRule.d.length;
        while (true) {
            List<OutcomeButton> list2 = qih0Var.g;
            if (list2 == null) {
                Intrinsics.n("buttons");
                throw null;
            }
            if (length >= list2.size()) {
                if (!(z3 && (market == null || zIsEmpty)) && (z3 || market != null)) {
                    if (market != null) {
                        List<Outcome> list3 = market.outcomes;
                        list3.getClass();
                        Iterator it2 = list3.iterator();
                        int i8 = z3 ? 1 : 0;
                        while (it2.hasNext()) {
                            Outcome outcome = (Outcome) it2.next();
                            List<OutcomeButton> list4 = qih0Var.g;
                            if (list4 == null) {
                                Intrinsics.n("buttons");
                                throw null;
                            }
                            OutcomeButton outcomeButton = list4.get(i8);
                            outcome.getClass();
                            outcomeButton.b();
                            outcomeButton.setVisibility(0);
                            if (market.status == 0) {
                                outcomeButton.setEnabled(outcome.isActive == 1);
                                if (outcomeButton.isEnabled()) {
                                    String str6 = outcome.odds;
                                    str6.getClass();
                                    outcomeButton.setOdds(str6);
                                    String str7 = outcome.odds;
                                    str7.getClass();
                                    outcomeButton.setActivated(zog.i(str7, bigDecimal, bigDecimal2));
                                    aVar.getClass();
                                    djh0 djh0Var = djh0.this;
                                    z7z z7zVarA = djh0Var.i.a(event3, market, outcome);
                                    String str8 = outcome.odds;
                                    str8.getClass();
                                    it = it2;
                                    kuh.c(outcomeButton, z7zVarA, str8, sjd0Var.a, true, 16);
                                    i4 = i8;
                                    ltyVar.a.a(!(z7zVarA instanceof z7z.c));
                                    z7zVarA.getClass();
                                    if (z7zVarA instanceof z7z.b) {
                                        djh0Var.j.a(apg.b(event3, market), brg.LIVE_PAGE);
                                    }
                                } else {
                                    it = it2;
                                    i4 = i8;
                                    outcomeButton.setTextOnAndOff(zch0.h(context));
                                }
                                int i9 = outcome.flag;
                                if (i9 == 1) {
                                    outcomeButton.g();
                                    outcome.flag = 0;
                                } else if (i9 == 2) {
                                    outcomeButton.c();
                                    outcome.flag = 0;
                                }
                                outcomeButton.setChecked(iu2.n(event3, market, outcome));
                                outcomeButton.setTag(new UpcomingOutcomeMeta(new Selection(event3, market, outcome), false, false, 6, null));
                            } else {
                                it = it2;
                                i4 = i8;
                                outcomeButton.setText(zch0.h(context));
                                outcomeButton.setEnabled(false);
                            }
                            it2 = it;
                            i8 = i4 + 1;
                        }
                        i3 = 0;
                        while (true) {
                            List<OutcomeButton> list5 = qih0Var.g;
                            if (list5 == null) {
                                Intrinsics.n("buttons");
                                throw null;
                            }
                            if (i8 >= list5.size()) {
                                break;
                            }
                            List<OutcomeButton> list6 = qih0Var.g;
                            if (list6 == null) {
                                Intrinsics.n("buttons");
                                throw null;
                            }
                            c8i0.f(list6.get(i8));
                            i8++;
                        }
                    }
                    if (ingVar.a.hasGift()) {
                        i5 = i3;
                    } else {
                        i5 = 8;
                    }
                    appCompatImageView.setVisibility(i5);
                    if (appCompatImageView.getVisibility() == 0) {
                        LinkedHashSet linkedHashSet = mlk.a;
                        str = ingVar.a.eventId;
                        str.getClass();
                        if (mlk.b(str)) {
                            f00 f00Var = vgb0.a;
                            vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_SHOWN);
                            return;
                        }
                        return;
                    }
                    return;
                }
                int length2 = regularMarketRule.d.length;
                if (z3) {
                    length2++;
                }
                for (int i10 = 0; i10 < length2; i10++) {
                    List<OutcomeButton> list7 = qih0Var.g;
                    if (list7 == null) {
                        Intrinsics.n("buttons");
                        throw null;
                    }
                    OutcomeButton outcomeButton2 = list7.get(i10);
                    c8i0.n(outcomeButton2);
                    outcomeButton2.setTextOnAndOff(zch0.h(context));
                    outcomeButton2.setEnabled(false);
                    outcomeButton2.setChecked(false);
                }
                i3 = 0;
                if (ingVar.a.hasGift()) {
                    i5 = i3;
                } else {
                    i5 = 8;
                }
                appCompatImageView.setVisibility(i5);
                if (appCompatImageView.getVisibility() == 0) {
                    LinkedHashSet linkedHashSet2 = mlk.a;
                    str = ingVar.a.eventId;
                    str.getClass();
                    if (mlk.b(str)) {
                        f00 f00Var2 = vgb0.a;
                        vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_SHOWN);
                        return;
                    }
                    return;
                }
                return;
            }
            List<OutcomeButton> list8 = qih0Var.g;
            if (list8 == null) {
                Intrinsics.n("buttons");
                throw null;
            }
            c8i0.f(list8.get(length));
            length++;
        }
    }

    @Override // com.cruxlab.sectionedrecyclerview.lib.a
    public final com.cruxlab.sectionedrecyclerview.lib.a.b g(ViewGroup viewGroup, short s) {
        viewGroup.getClass();
        if (s == 2) {
            return new qih0(sjd0.a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), new a(), this.n, this.k);
        }
        if (s == 8) {
            return new cjh0(tjd0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_sport_event_market_title, viewGroup, false)), this.x);
        }
        if (s != 9) {
            return null;
        }
        View viewA = dzc.a(viewGroup, R.layout.spr_highlight_loading, viewGroup, false);
        if (viewA != null) {
            LoadingView loadingView = (LoadingView) viewA;
            return new iih0(new whd0(loadingView, loadingView));
        }
        bmy.a("rootView");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0234  */
    /* JADX WARN: Code duplicated, block: B:117:0x023c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0253  */
    /* JADX WARN: Code duplicated, block: B:128:0x0262  */
    /* JADX WARN: Code duplicated, block: B:136:0x0282  */
    /* JADX WARN: Code duplicated, block: B:138:0x028c  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:241:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0141 A[SYNTHETIC] */
    @Override // com.cruxlab.sectionedrecyclerview.lib.b
    public final void i(com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a abstractC0185a) {
        int i;
        Object obj;
        Object obj2;
        int i2;
        boolean z;
        boolean z2;
        gqs gqsVar;
        jqu jquVar;
        aos aosVar;
        boolean zA;
        int size;
        int i3;
        int i4;
        Object obj3;
        int i5;
        RegularMarketRule regularMarketRule;
        TabLayout.g gVarL;
        final zih0 zih0Var = (zih0) abstractC0185a;
        zih0Var.getClass();
        mpe0 mpe0Var = zih0Var.i;
        mpe0 mpe0Var2 = zih0Var.h;
        final RegularMarketRule regularMarketRule2 = this.w;
        if (regularMarketRule2 != null) {
            String str = regularMarketRule2.a;
            Object objV = CollectionsKt.V(this.t, this.m);
            rru rruVar = objV instanceof rru ? (rru) objV : null;
            fjh0 fjh0Var = zih0Var.d;
            hkf hkfVar = zih0Var.c;
            final sih0 sih0Var = zih0Var.b;
            tjd0 tjd0Var = sih0Var.e;
            OneUpTwoUpSwitch oneUpTwoUpSwitch = sih0Var.y;
            LinearLayout linearLayout = sih0Var.v;
            View view = sih0Var.b;
            OUEarlyGoalsSwitch oUEarlyGoalsSwitch = sih0Var.z;
            BubbleView bubbleView = sih0Var.c;
            TabLayout tabLayout = sih0Var.d;
            RelativeLayout relativeLayout = tjd0Var.a;
            if (rruVar == null) {
                relativeLayout.getClass();
                relativeLayout.setVisibility(8);
            } else {
                ListenableSpinner listenableSpinner = tjd0Var.v;
                relativeLayout.getClass();
                relativeLayout.setVisibility(0);
                tjd0Var.b.setText(bwf0.c(rruVar.a, fjh0Var.a()));
                if (regularMarketRule2.c) {
                    listenableSpinner.setVisibility(0);
                    listenableSpinner.setOnItemSelectedListener(null);
                    ((eru) mpe0Var.getValue()).clear();
                    ((eru) mpe0Var.getValue()).addAll(fjh0Var.c());
                    str.getClass();
                    listenableSpinner.setSelection(fjh0Var.b(str));
                    listenableSpinner.setOnItemSelectedListener(new fpy() { // from class: tih0
                        @Override // android.widget.AdapterView.OnItemSelectedListener
                        public final void onItemSelected(AdapterView adapterView, View view2, int i6, long j) {
                            fjh0 fjh0Var2 = zih0Var.d;
                            String str2 = regularMarketRule2.a;
                            str2.getClass();
                            fjh0Var2.d(i6, str2);
                        }
                    });
                    Object obj4 = ((List) mpe0Var2.getValue()).get(0);
                    obj4.getClass();
                    ((View) obj4).setVisibility(8);
                    i = 1;
                } else {
                    listenableSpinner.setVisibility(8);
                    i = 0;
                }
                String[] strArr = regularMarketRule2.d;
                strArr.getClass();
                for (String str2 : strArr) {
                    ((TextView) ((List) mpe0Var2.getValue()).get(i)).setText(str2);
                    Object obj5 = ((List) mpe0Var2.getValue()).get(i);
                    obj5.getClass();
                    ((View) obj5).setVisibility(0);
                    i++;
                }
                while (i < ((List) mpe0Var2.getValue()).size()) {
                    Object obj6 = ((List) mpe0Var2.getValue()).get(i);
                    obj6.getClass();
                    ((View) obj6).setVisibility(8);
                    i++;
                }
            }
            rih0 rih0Var = zih0Var.e;
            String strC = rih0Var != null ? rih0Var.c() : null;
            AppCompatImageView appCompatImageView = sih0Var.i;
            if (strC != null) {
                appCompatImageView.setVisibility(8);
                linearLayout.setVisibility(0);
                sih0Var.w.setText(strC);
            } else {
                appCompatImageView.setVisibility(0);
                linearLayout.setVisibility(8);
            }
            int tabCount = tabLayout.getTabCount();
            ArrayList arrayList = this.l;
            if (tabCount != arrayList.size()) {
                tabLayout.setTag(0);
                tabLayout.n();
                size = arrayList.size();
                i3 = 0;
                i4 = 0;
                while (i4 < size) {
                    obj3 = arrayList.get(i4);
                    i4++;
                    i5 = i3 + 1;
                    if (i3 >= 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    regularMarketRule = (RegularMarketRule) obj3;
                    hkfVar.getClass();
                    RegularMarketRule regularMarketRuleD = hkf.d(regularMarketRule);
                    gVarL = tabLayout.l();
                    gVarL.a = regularMarketRule;
                    tabLayout.getContext();
                    HashSet hashSet = tru.a;
                    gVarL.e(regularMarketRuleD.b);
                    tabLayout.b(gVarL);
                    if (Intrinsics.g(regularMarketRule.a, str)) {
                        tabLayout.setTag(Integer.valueOf(i3));
                        gVarL.b();
                    }
                    i3 = i5;
                }
            } else {
                int tabCount2 = tabLayout.getTabCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= tabCount2) {
                        int tabCount3 = tabLayout.getTabCount();
                        for (int i7 = 0; i7 < tabCount3; i7++) {
                            TabLayout.g gVarK = tabLayout.k(i7);
                            if (gVarK != null && (obj = gVarK.a) != null) {
                                if (!(obj instanceof RegularMarketRule)) {
                                    obj = null;
                                }
                                RegularMarketRule regularMarketRule3 = (RegularMarketRule) obj;
                                if (regularMarketRule3 != null && Intrinsics.g(regularMarketRule3.a, str)) {
                                    tabLayout.setTag(Integer.valueOf(i7));
                                    tabLayout.setScrollPosition(i7, 0.0f, true);
                                }
                            }
                        }
                    } else {
                        TabLayout.g gVarK2 = tabLayout.k(i6);
                        if (gVarK2 != null && (obj2 = gVarK2.a) != null) {
                            if (!(obj2 instanceof RegularMarketRule)) {
                                obj2 = null;
                            }
                            RegularMarketRule regularMarketRule4 = (RegularMarketRule) obj2;
                            if (regularMarketRule4 != null) {
                                String str3 = regularMarketRule4.a;
                                str3.getClass();
                                String str4 = ((RegularMarketRule) arrayList.get(i6)).a;
                                str4.getClass();
                                if (str3.equals(str4)) {
                                    i2 = tabCount2;
                                } else {
                                    hkfVar.getClass();
                                    if (!str3.equals(str4)) {
                                        if (str3.equals(str4)) {
                                            i2 = tabCount2;
                                        } else {
                                            boolean z3 = str3.equals("1") && str4.equals("60200");
                                            boolean z4 = str3.equals("60200") && str4.equals("1");
                                            i2 = tabCount2;
                                            boolean z5 = str3.equals("1") && str4.equals("60100");
                                            boolean z6 = str3.equals("60100") && str4.equals("1");
                                            if (z3 || z4 || z5 || z6) {
                                            }
                                        }
                                        boolean z7 = str3.equals("1") && str4.equals("60210");
                                        boolean z8 = str3.equals("60210") && str4.equals("1");
                                        if (!z7 && !z8) {
                                            if (!str3.equals(str4)) {
                                                slc.a.getClass();
                                                String str5 = slc.b;
                                                boolean z9 = str3.equals(str5) && str4.equals(slc.d);
                                                boolean z10 = str3.equals(slc.d) && str4.equals(str5);
                                                if (!z9 && !z10) {
                                                    if (str3.equals(str4)) {
                                                        cby.a.getClass();
                                                        if (str3.equals("18")) {
                                                            z = false;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (str3.equals("60180")) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (z) {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            } else if (str3.equals(str4)) {
                                                cby.a.getClass();
                                                if (str3.equals("18") || !str4.equals("60180")) {
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                                if (str3.equals("60180") || !str4.equals("18")) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                if (z || z2) {
                                                }
                                            }
                                        }
                                    }
                                }
                                i6++;
                                tabCount2 = i2;
                            }
                        }
                        tabLayout.setTag(0);
                        tabLayout.n();
                        size = arrayList.size();
                        i3 = 0;
                        i4 = 0;
                        while (i4 < size) {
                            obj3 = arrayList.get(i4);
                            i4++;
                            i5 = i3 + 1;
                            if (i3 >= 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            regularMarketRule = (RegularMarketRule) obj3;
                            hkfVar.getClass();
                            RegularMarketRule regularMarketRuleD2 = hkf.d(regularMarketRule);
                            gVarL = tabLayout.l();
                            gVarL.a = regularMarketRule;
                            tabLayout.getContext();
                            HashSet hashSet2 = tru.a;
                            gVarL.e(regularMarketRuleD2.b);
                            tabLayout.b(gVarL);
                            if (Intrinsics.g(regularMarketRule.a, str)) {
                                tabLayout.setTag(Integer.valueOf(i3));
                                gVarL.b();
                            }
                            i3 = i5;
                        }
                    }
                }
            }
            mfb0 mfb0Var = this.v;
            String id = mfb0Var != null ? mfb0Var.getId() : null;
            xhh0 xhh0Var = this.h;
            boolean zE = xhh0Var.e(regularMarketRule2, id, false);
            mfb0 mfb0Var2 = this.v;
            whh0 whh0VarC = xhh0Var.c(regularMarketRule2, mfb0Var2 != null ? mfb0Var2.getId() : null, false);
            ckf ckfVar = ckf.c;
            mfb0 mfb0Var3 = this.v;
            String id2 = mfb0Var3 != null ? mfb0Var3.getId() : null;
            mjf mjfVar = this.f;
            boolean zB = mjfVar.b(ckfVar, id2, str, false);
            yhh0 yhh0VarA = zhh0.a(whh0VarC);
            boolean z11 = this.s;
            if (zE) {
                gqs gqsVar2 = this.q;
                if (gqsVar2 != null) {
                    LivePageActivity livePageActivity = gqsVar2.a;
                    int i8 = LivePageActivity.b0;
                    zA = ((sn20) livePageActivity.J.getValue()).a.a("dc_one_up_switch_hint_displayed");
                } else {
                    zA = true;
                }
                boolean z12 = (whh0VarC != null ? whh0VarC.a : null) == rhh0.b && whh0VarC.c.contains(phh0.a);
                if (zA || !z12) {
                    jquVar = null;
                } else {
                    jquVar = jqu.b;
                }
            } else if (zB) {
                mfb0 mfb0Var4 = this.v;
                String id3 = mfb0Var4 != null ? mfb0Var4.getId() : null;
                RegularMarketRule regularMarketRule5 = this.w;
                if (mjfVar.b(ckfVar, id3, regularMarketRule5 != null ? regularMarketRule5.a : null, false) && (gqsVar = this.q) != null) {
                    LivePageActivity livePageActivity2 = gqsVar.a;
                    xss xssVar = livePageActivity2.Q;
                    boolean z13 = (xssVar == null || (aosVar = xssVar.G) == null || aosVar.f.getVisibility() != 0) ? false : true;
                    boolean zA2 = ((sn20) livePageActivity2.J.getValue()).a.a("market_early_goals_switch_hint_displayed");
                    if (z13 || zA2) {
                        jquVar = null;
                    } else {
                        jquVar = jqu.a;
                    }
                } else {
                    jquVar = null;
                }
            } else {
                jquVar = null;
            }
            if (zE) {
                hih0.a(oneUpTwoUpSwitch, yhh0VarA.a);
                hih0.c(oneUpTwoUpSwitch, yhh0VarA.b, false, true);
                oneUpTwoUpSwitch.setVisibility(0);
                oUEarlyGoalsSwitch.setVisibility(8);
                view.setVisibility(0);
                if (jquVar != null) {
                    lqu.c(bubbleView, jquVar, null);
                }
                c8i0.o(bubbleView, jquVar != null);
                return;
            }
            if (!zB) {
                oneUpTwoUpSwitch.setVisibility(8);
                oUEarlyGoalsSwitch.setVisibility(8);
                view.setVisibility(8);
                bubbleView.setVisibility(8);
                return;
            }
            oneUpTwoUpSwitch.setVisibility(8);
            oUEarlyGoalsSwitch.setState(z11, false, true);
            oUEarlyGoalsSwitch.setVisibility(0);
            view.setVisibility(0);
            if (jquVar != null) {
                lqu.c(bubbleView, jquVar, new Function0() { // from class: wih0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Context context = sih0Var.a.getContext();
                        context.getClass();
                        gby.c(context);
                        return Unit.a;
                    }
                });
            }
            c8i0.o(bubbleView, jquVar != null);
        }
    }

    @Override // com.cruxlab.sectionedrecyclerview.lib.b
    public final com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a j(ViewGroup viewGroup) {
        View viewA = u540.a(viewGroup, R.layout.upcoming_header_item, viewGroup, false);
        int i = R.id.barrier_switch_start;
        if (((Barrier) h5e.a(R.id.barrier_switch_start, viewA)) != null) {
            i = R.id.market_option_divider;
            View viewA2 = h5e.a(R.id.market_option_divider, viewA);
            if (viewA2 != null) {
                i = R.id.market_option_feature_alert;
                BubbleView bubbleView = (BubbleView) h5e.a(R.id.market_option_feature_alert, viewA);
                if (bubbleView != null) {
                    i = R.id.market_option_guideline_end;
                    if (((Guideline) h5e.a(R.id.market_option_guideline_end, viewA)) != null) {
                        i = R.id.market_tab;
                        TabLayout tabLayout = (TabLayout) h5e.a(R.id.market_tab, viewA);
                        if (tabLayout != null) {
                            i = R.id.market_title;
                            View viewA3 = h5e.a(R.id.market_title, viewA);
                            if (viewA3 != null) {
                                tjd0 tjd0VarA = tjd0.a(viewA3);
                                i = R.id.odds_filter_clear_btn;
                                ImageView imageView = (ImageView) h5e.a(R.id.odds_filter_clear_btn, viewA);
                                if (imageView != null) {
                                    i = R.id.odds_filter_expand_btn;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.odds_filter_expand_btn, viewA);
                                    if (appCompatImageView != null) {
                                        i = R.id.odds_filter_info_container;
                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.odds_filter_info_container, viewA);
                                        if (linearLayout != null) {
                                            i = R.id.odds_filter_value_tv;
                                            TextView textView = (TextView) h5e.a(R.id.odds_filter_value_tv, viewA);
                                            if (textView != null) {
                                                i = R.id.one_up_two_up_switch;
                                                OneUpTwoUpSwitch oneUpTwoUpSwitch = (OneUpTwoUpSwitch) h5e.a(R.id.one_up_two_up_switch, viewA);
                                                if (oneUpTwoUpSwitch != null) {
                                                    i = R.id.ou_early_goals_switch;
                                                    OUEarlyGoalsSwitch oUEarlyGoalsSwitch = (OUEarlyGoalsSwitch) h5e.a(R.id.ou_early_goals_switch, viewA);
                                                    if (oUEarlyGoalsSwitch != null) {
                                                        i = R.id.title;
                                                        TextView textView2 = (TextView) h5e.a(R.id.title, viewA);
                                                        if (textView2 != null) {
                                                            sih0 sih0Var = new sih0((ConstraintLayout) viewA, viewA2, bubbleView, tabLayout, tjd0VarA, imageView, appCompatImageView, linearLayout, textView, oneUpTwoUpSwitch, oUEarlyGoalsSwitch, textView2);
                                                            this.u = sih0Var;
                                                            return new zih0(sih0Var, this.g, this.x, this.o, this.p, this.q);
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
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i)));
        return null;
    }

    public final void l(List<? extends ing> list) {
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ing) it.next()).e.clear();
        }
        k48.a(this.m, m(list, this.w));
        c();
    }

    public final ArrayList m(List list, RegularMarketRule regularMarketRule) {
        mfb0 mfb0Var = this.v;
        List listB = this.g.b(mfb0Var != null ? mfb0Var.getId() : null, regularMarketRule != null ? regularMarketRule.a : null, list, true, false);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listB) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            ing ingVar = (ing) obj;
            if (ingVar.c || i == 0) {
                arrayList.add(new rru(ingVar.a.estimateStartTime));
            }
            arrayList.add(ingVar);
            i = i2;
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new c2g());
        }
        return arrayList;
    }

    public final avy n(whh0 whh0Var) {
        rhh0 rhh0Var;
        avy avyVar;
        return (whh0Var == null || (rhh0Var = whh0Var.a) == null || (avyVar = (avy) this.r.get(rhh0Var)) == null) ? avy.c : avyVar;
    }

    public final void o(RegularMarketRule regularMarketRule, RegularMarketRule regularMarketRule2) {
        String str = regularMarketRule2.a;
        String str2 = regularMarketRule.a;
        if (Intrinsics.g(str, str2)) {
            return;
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, Intrinsics.g(((RegularMarketRule) arrayList.get(i)).a, str2) ? regularMarketRule2 : (RegularMarketRule) arrayList.get(i));
        }
    }

    public final void p(mfb0 mfb0Var, RegularMarketRule regularMarketRule, List<? extends ing> list, List<? extends ing> list2) {
        String strA;
        String str = regularMarketRule.a;
        list.getClass();
        list2.getClass();
        this.e.b(regularMarketRule, list, false);
        boolean z = !this.l.isEmpty();
        if (z == this.d) {
            h();
        } else {
            k(z);
        }
        String id = mfb0Var.getId();
        xhh0 xhh0Var = this.h;
        boolean zE = xhh0Var.e(regularMarketRule, id, false);
        boolean zB = this.f.b(ckf.c, mfb0Var.getId(), str, false);
        whh0 whh0VarC = xhh0Var.c(regularMarketRule, mfb0Var.getId(), false);
        if (zE) {
            regularMarketRule = xhh0Var.b(n(whh0VarC), regularMarketRule, mfb0Var.getId(), false);
        } else if (zB) {
            boolean z2 = this.s;
            if (yay.h(str) && str != null && (strA = yay.a(str, z2)) != null) {
                regularMarketRule = RegularMarketRule.a(strA, null);
            }
        }
        this.v = mfb0Var;
        this.w = regularMarketRule;
        k48.a(this.m, m(list2, regularMarketRule));
        c();
    }
}
