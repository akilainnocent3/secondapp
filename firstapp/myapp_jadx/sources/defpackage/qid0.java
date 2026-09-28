package defpackage;

import android.view.View;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBarSelectionOdds;
import com.sportybet.android.widget.seekbar.RangeSeekBar;

/* JADX INFO: loaded from: classes4.dex */
public final class qid0 implements g6i0 {
    public final MultiMakerOddsRangeSeekBarSelectionOdds a;
    public final RangeSeekBar b;
    public final RangeSeekBar c;

    public qid0(MultiMakerOddsRangeSeekBarSelectionOdds multiMakerOddsRangeSeekBarSelectionOdds, RangeSeekBar rangeSeekBar, RangeSeekBar rangeSeekBar2) {
        this.a = multiMakerOddsRangeSeekBarSelectionOdds;
        this.b = rangeSeekBar;
        this.c = rangeSeekBar2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
