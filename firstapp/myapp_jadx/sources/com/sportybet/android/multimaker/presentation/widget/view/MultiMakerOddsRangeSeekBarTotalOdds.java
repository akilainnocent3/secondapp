package com.sportybet.android.multimaker.presentation.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.tid0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/sportybet/android/multimaker/presentation/widget/view/MultiMakerOddsRangeSeekBarTotalOdds;", "Lcom/sportybet/android/multimaker/presentation/widget/view/MultiMakerOddsRangeSeekBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/android/widget/seekbar/RangeSeekBar;", "getSeekBar", "()Lcom/sportybet/android/widget/seekbar/RangeSeekBar;", "seekBar", "getDisabledSeekBarHolder", "disabledSeekBarHolder", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MultiMakerOddsRangeSeekBarTotalOdds extends MultiMakerOddsRangeSeekBar {
    public final tid0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiMakerOddsRangeSeekBarTotalOdds(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.spr_multi_maker_total_odds, this);
        int i2 = R.id.total_range_slider;
        RangeSeekBar rangeSeekBar = (RangeSeekBar) h5e.a(R.id.total_range_slider, this);
        if (rangeSeekBar != null) {
            i2 = R.id.total_range_slider_fake;
            RangeSeekBar rangeSeekBar2 = (RangeSeekBar) h5e.a(R.id.total_range_slider_fake, this);
            if (rangeSeekBar2 != null) {
                this.F = new tid0(this, rangeSeekBar, rangeSeekBar2);
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBar
    public RangeSeekBar getDisabledSeekBarHolder() {
        return this.F.c;
    }

    @Override // com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBar
    public RangeSeekBar getSeekBar() {
        return this.F.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiMakerOddsRangeSeekBarTotalOdds(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiMakerOddsRangeSeekBarTotalOdds(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ MultiMakerOddsRangeSeekBarTotalOdds(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
