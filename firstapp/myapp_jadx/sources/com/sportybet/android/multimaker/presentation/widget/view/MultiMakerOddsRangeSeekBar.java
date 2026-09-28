package com.sportybet.android.multimaker.presentation.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import defpackage.voy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/sportybet/android/multimaker/presentation/widget/view/MultiMakerOddsRangeSeekBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "min", "max", "", "setRange", "(FF)V", AnalyticsParam.DATA_LOWER, "upper", "setProgress", "(FLjava/lang/Float;)V", "Lvoy;", "listener", "setOnRangeChangedListener", "(Lvoy;)V", "Lcom/sportybet/android/widget/seekbar/RangeSeekBar;", "getSeekBar", "()Lcom/sportybet/android/widget/seekbar/RangeSeekBar;", "seekBar", "getDisabledSeekBarHolder", "disabledSeekBarHolder", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class MultiMakerOddsRangeSeekBar extends ConstraintLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiMakerOddsRangeSeekBar(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public abstract RangeSeekBar getDisabledSeekBarHolder();

    public abstract RangeSeekBar getSeekBar();

    public final void setOnRangeChangedListener(voy listener) {
        listener.getClass();
        getSeekBar().setOnRangeChangedListener(listener);
    }

    public final void setProgress(float lower, Float upper) {
        if (upper != null) {
            getSeekBar().setProgress(lower, upper.floatValue());
            getDisabledSeekBarHolder().setProgress(lower, upper.floatValue());
        } else {
            getSeekBar().setProgress(lower);
            getDisabledSeekBarHolder().setProgress(lower);
        }
    }

    public final void setRange(float min, float max) {
        if (getSeekBar().getMinProgress() == min && getSeekBar().getMaxProgress() == max) {
            return;
        }
        getSeekBar().setRange(min, max);
        getDisabledSeekBarHolder().setRange(min, max);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiMakerOddsRangeSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiMakerOddsRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    public /* synthetic */ MultiMakerOddsRangeSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
