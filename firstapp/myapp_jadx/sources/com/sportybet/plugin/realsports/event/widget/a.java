package com.sportybet.plugin.realsports.event.widget;

import com.sportybet.android.widget.seekbar.RangeSeekBar;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.SliderRangeData;
import com.sportybet.plugin.realsports.event.BaseEventDetailMarketListAdapter;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.oxc;
import defpackage.rjd0;
import defpackage.voy;
import defpackage.zch0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements voy {
    public final /* synthetic */ SliderMarketPanel a;
    public final /* synthetic */ rjd0 b;

    public a(SliderMarketPanel sliderMarketPanel, rjd0 rjd0Var) {
        this.a = sliderMarketPanel;
        this.b = rjd0Var;
    }

    @Override // defpackage.voy
    public final void a(RangeSeekBar rangeSeekBar, float f, float f2) {
        Object next;
        SliderMarketPanel.b bVar;
        rjd0 rjd0Var = this.b;
        CharSequence[] tickMarkTextArray = rjd0Var.c.getTickMarkTextArray();
        double d = f;
        int i = SliderMarketPanel.O;
        SliderMarketPanel sliderMarketPanel = this.a;
        sliderMarketPanel.J = tickMarkTextArray[sliderMarketPanel.E(d)].toString();
        double d2 = f2;
        sliderMarketPanel.K = rjd0Var.c.getTickMarkTextArray()[sliderMarketPanel.E(d2)].toString();
        String str = sliderMarketPanel.G.desc;
        if (str != null && (bVar = sliderMarketPanel.L) != null) {
            ((BaseEventDetailMarketListAdapter.a) bVar).a.put(str, new SliderRangeData(sliderMarketPanel.E(d), sliderMarketPanel.E(d2), false));
        }
        List<Outcome> list = sliderMarketPanel.G.outcomes;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.g(((Outcome) next).desc, sliderMarketPanel.J + "-" + sliderMarketPanel.K)) {
                    break;
                }
            } while (!Intrinsics.g(sliderMarketPanel.J, sliderMarketPanel.K));
            if (((Outcome) next) != null) {
                boolean zG = Intrinsics.g(sliderMarketPanel.J, sliderMarketPanel.K);
                String strA = sliderMarketPanel.J;
                if (!zG) {
                    strA = oxc.a(strA, "-", sliderMarketPanel.K);
                }
                sliderMarketPanel.F(sliderMarketPanel.H, strA);
                return;
            }
        }
        OutcomeButton outcomeButton = sliderMarketPanel.F.b;
        outcomeButton.setTextOnAndOff(zch0.h(outcomeButton.getContext()));
        outcomeButton.setChecked(false);
        outcomeButton.setEnabled(false);
    }

    @Override // defpackage.voy
    public final void b(RangeSeekBar rangeSeekBar) {
    }
}
