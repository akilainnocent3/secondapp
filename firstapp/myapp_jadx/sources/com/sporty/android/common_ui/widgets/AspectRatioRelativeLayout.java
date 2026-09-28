package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes6.dex */
public class AspectRatioRelativeLayout extends RelativeLayout {
    public float a;

    public AspectRatioRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.a), 1073741824));
    }

    public void setAspectRatio(float f) {
        this.a = f;
    }

    public AspectRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
