package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsHeaderView;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBarSelectionOdds;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBarTotalOdds;

/* JADX INFO: loaded from: classes4.dex */
public final class pid0 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final MultiMakerOddsHeaderView d;
    public final MultiMakerOddsRangeSeekBarSelectionOdds e;
    public final MultiMakerOddsRangeSeekBarTotalOdds f;

    public pid0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, MultiMakerOddsHeaderView multiMakerOddsHeaderView, MultiMakerOddsRangeSeekBarSelectionOdds multiMakerOddsRangeSeekBarSelectionOdds, MultiMakerOddsRangeSeekBarTotalOdds multiMakerOddsRangeSeekBarTotalOdds) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = multiMakerOddsHeaderView;
        this.e = multiMakerOddsRangeSeekBarSelectionOdds;
        this.f = multiMakerOddsRangeSeekBarTotalOdds;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
