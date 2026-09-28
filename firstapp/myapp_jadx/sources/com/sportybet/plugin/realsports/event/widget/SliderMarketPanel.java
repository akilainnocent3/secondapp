package com.sportybet.plugin.realsports.event.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.SliderOutcomeData;
import com.sportybet.plugin.realsports.data.SliderRangeData;
import com.sportybet.plugin.realsports.event.BaseEventDetailMarketListAdapter;
import com.sportybet.plugin.realsports.event.widget.SliderMarketPanel;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.iu2;
import defpackage.l48;
import defpackage.rjd0;
import defpackage.ycv;
import defpackage.zch0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/sportybet/plugin/realsports/event/widget/SliderMarketPanel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Liu2$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/plugin/realsports/data/Market;", AnalyticsParam.MARKET_PARAM_MARKET, "Lcom/sportybet/plugin/realsports/data/Event;", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "Lcom/sportybet/plugin/realsports/event/widget/SliderMarketPanel$b;", "marketDelegate", "", "setMarketData", "(Lcom/sportybet/plugin/realsports/data/Market;Lcom/sportybet/plugin/realsports/data/Event;Lcom/sportybet/plugin/realsports/event/widget/SliderMarketPanel$b;)V", "Lcom/sportybet/plugin/realsports/event/widget/SliderMarketPanel$a;", "listener", "setOnOutcomeClickListener", "(Lcom/sportybet/plugin/realsports/event/widget/SliderMarketPanel$a;)V", "", "", "params", "setSliderStepView", "(Ljava/util/List;)V", "b", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SliderMarketPanel extends ConstraintLayout implements iu2.b {
    public static final /* synthetic */ int O = 0;
    public final rjd0 F;
    public Market G;
    public Event H;
    public final LinkedHashMap I;
    public String J;
    public String K;
    public b L;
    public a M;
    public String N;

    public interface a {
        void onChildViewClick(View view, Selection selection, boolean z);
    }

    public interface b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderMarketPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.spr_slider_market_panel, this);
        int i2 = R.id.outcome_btn;
        OutcomeButton outcomeButton = (OutcomeButton) h5e.a(R.id.outcome_btn, this);
        if (outcomeButton != null) {
            i2 = R.id.range_slider;
            RangeSeekBar rangeSeekBar = (RangeSeekBar) h5e.a(R.id.range_slider, this);
            if (rangeSeekBar != null) {
                final rjd0 rjd0Var = new rjd0(this, outcomeButton, rangeSeekBar);
                this.F = rjd0Var;
                this.G = new Market();
                this.H = new Event();
                this.I = new LinkedHashMap();
                this.J = "";
                this.K = "";
                this.N = "0-1";
                outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: r0a0
                    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = SliderMarketPanel.O;
                        Object tag = view.getTag();
                        if (tag != null) {
                            if (!(tag instanceof Selection)) {
                                tag = null;
                            }
                            Selection selection = (Selection) tag;
                            if (selection == null) {
                                return;
                            }
                            OutcomeButton outcomeButton2 = rjd0Var.b;
                            if (!iu2.t(selection.a, selection.b, selection.c, outcomeButton2.isChecked(), false, null, 16368)) {
                                if (kni0.m()) {
                                    iu2.r(outcomeButton2.getContext());
                                } else {
                                    if (iu2.l()) {
                                        qz3.p(outcomeButton2.getContext());
                                    }
                                    if (iu2.f(selection)) {
                                        qz3.m(outcomeButton2.getContext());
                                    } else {
                                        Event event = selection.a;
                                        event.getClass();
                                        if (iu2.g(event)) {
                                            qz3.m(outcomeButton2.getContext());
                                        }
                                    }
                                }
                            }
                            SliderMarketPanel.a aVar = this.a.M;
                            if (aVar != null) {
                                aVar.onChildViewClick(outcomeButton2, selection, outcomeButton2.isChecked());
                            }
                        }
                    }
                });
                rangeSeekBar.setOnRangeChangedListener(new com.sportybet.plugin.realsports.event.widget.a(this, rjd0Var));
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void setSliderStepView(List<String> params) {
        if (params.isEmpty()) {
            return;
        }
        RangeSeekBar rangeSeekBar = this.F.c;
        rangeSeekBar.setSteps(params.size() - 1);
        rangeSeekBar.setTickMarkTextArray((CharSequence[]) params.toArray(new String[0]));
    }

    @Override // iu2.a
    public final void C() {
        this.F.b.d();
    }

    public final int E(double d) {
        return ycv.a(d / (100.0d / ((double) this.F.c.getSteps())));
    }

    public final void F(Event event, String str) {
        OutcomeButton outcomeButton = this.F.b;
        LinkedHashMap linkedHashMap = this.I;
        SliderOutcomeData sliderOutcomeData = (SliderOutcomeData) linkedHashMap.get(str);
        if (sliderOutcomeData != null) {
            Market market = this.G;
            Outcome outcome = sliderOutcomeData.getOutcome();
            outcomeButton.setVisibility(0);
            if (market.status == 0) {
                outcomeButton.setEnabled(outcome.isActive == 1);
                if (outcomeButton.isEnabled()) {
                    String str2 = outcome.odds;
                    str2.getClass();
                    outcomeButton.setOdds(str2);
                    if (outcome.flag != 0) {
                        String str3 = outcome.desc;
                        str3.getClass();
                        this.N = str3;
                    }
                    int i = outcome.flag;
                    if (i == 1) {
                        outcomeButton.g();
                    } else if (i == 2) {
                        outcomeButton.c();
                    }
                    if (!Intrinsics.g(this.N, outcome.desc)) {
                        outcomeButton.a();
                    }
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        ((SliderOutcomeData) ((Map.Entry) it.next()).getValue()).getOutcome().flag = 0;
                    }
                    outcomeButton.setChecked(iu2.n(event, market, outcome));
                } else {
                    outcomeButton.setTextOnAndOff(zch0.h(outcomeButton.getContext()));
                    outcomeButton.setChecked(false);
                    outcomeButton.setEnabled(false);
                    outcome.flag = 0;
                }
            } else {
                outcomeButton.setText(zch0.h(outcomeButton.getContext()));
                outcomeButton.setEnabled(false);
            }
            outcomeButton.setTag(sliderOutcomeData.getSelection());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        iu2.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        iu2.q(this);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setMarketData(Market market, Event event, b marketDelegate) {
        Pair pair;
        Object next;
        String str;
        market.getClass();
        event.getClass();
        marketDelegate.getClass();
        this.G = market;
        this.H = event;
        this.L = marketDelegate;
        List<String> list = market.parameters;
        list.getClass();
        setSliderStepView(list);
        for (Outcome outcome : market.outcomes) {
            this.I.put(outcome.desc, new SliderOutcomeData(outcome, new Selection(event, market, outcome)));
        }
        List<Outcome> list2 = market.outcomes;
        list2.getClass();
        RangeSeekBar rangeSeekBar = this.F.c;
        double steps = 100.0d / ((double) rangeSeekBar.getSteps());
        String str2 = this.G.desc;
        str2.getClass();
        HashMap<String, SliderRangeData> map = ((BaseEventDetailMarketListAdapter.a) marketDelegate).a;
        SliderRangeData sliderRangeData = map.get(str2);
        if (sliderRangeData == null) {
            sliderRangeData = new SliderRangeData();
        }
        if (sliderRangeData.getFirstLaunch()) {
            String str3 = "0-1";
            F(this.H, "0-1");
            if (!list2.isEmpty() && list2.size() >= 2) {
                if (list2.get(1).isActive == 1) {
                    str = list2.get(1).desc;
                    if (str == null) {
                        str = "0-1";
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (((Outcome) obj).isActive == 1) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            String str4 = ((Outcome) next).odds;
                            str4.getClass();
                            Double dH = kotlin.text.b.h(str4);
                            double dDoubleValue = dH != null ? dH.doubleValue() : Double.MAX_VALUE;
                            do {
                                Object next2 = it.next();
                                String str5 = ((Outcome) next2).odds;
                                str5.getClass();
                                Double dH2 = kotlin.text.b.h(str5);
                                double dDoubleValue2 = dH2 != null ? dH2.doubleValue() : Double.MAX_VALUE;
                                if (Double.compare(dDoubleValue, dDoubleValue2) > 0) {
                                    next = next2;
                                    dDoubleValue = dDoubleValue2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Outcome outcome2 = (Outcome) next;
                    if (outcome2 == null || (str = outcome2.desc) == null) {
                        str = "0-1";
                    }
                }
                String str6 = str.length() > 0 ? str : null;
                if (str6 != null) {
                    str3 = str6;
                }
            }
            String strP = c.p(str3, "+", "", false);
            if (StringsKt.M(strP, "-", false)) {
                List listSplit$default = StringsKt__StringsKt.split$default(strP, new String[]{"-"}, false, 0, 6, null);
                ArrayList arrayList2 = new ArrayList(l48.r(listSplit$default, 10));
                Iterator it2 = listSplit$default.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                }
                pair = new Pair(arrayList2.get(0), arrayList2.get(1));
            } else {
                pair = new Pair(Integer.valueOf(Integer.parseInt(strP)), Integer.valueOf(Integer.parseInt(strP)));
            }
            SliderRangeData sliderRangeData2 = new SliderRangeData(((Number) pair.a).intValue(), ((Number) pair.b).intValue(), false, 4, null);
            String str7 = this.G.desc;
            str7.getClass();
            map.put(str7, SliderRangeData.copy$default(sliderRangeData2, 0, 0, false, 3, null));
            sliderRangeData = sliderRangeData2;
        }
        rangeSeekBar.setProgress((float) (((double) sliderRangeData.getLeft()) * steps), (float) (((double) sliderRangeData.getRight()) * steps));
    }

    public final void setOnOutcomeClickListener(a listener) {
        listener.getClass();
        this.M = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderMarketPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderMarketPanel(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ SliderMarketPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
