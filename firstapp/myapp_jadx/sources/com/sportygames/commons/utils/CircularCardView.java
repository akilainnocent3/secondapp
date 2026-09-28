package com.sportygames.commons.utils;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public class CircularCardView extends CardView {
    public CircularCardView(Context context) {
        super(context);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        setMeasuredDimension(measuredHeight, measuredHeight);
        setRadius(measuredHeight / 2);
    }

    public CircularCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
