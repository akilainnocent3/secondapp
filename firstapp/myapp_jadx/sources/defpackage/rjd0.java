package defpackage;

import android.view.View;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import com.sportybet.plugin.realsports.event.widget.SliderMarketPanel;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class rjd0 implements g6i0 {
    public final SliderMarketPanel a;
    public final OutcomeButton b;
    public final RangeSeekBar c;

    public rjd0(SliderMarketPanel sliderMarketPanel, OutcomeButton outcomeButton, RangeSeekBar rangeSeekBar) {
        this.a = sliderMarketPanel;
        this.b = outcomeButton;
        this.c = rangeSeekBar;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
