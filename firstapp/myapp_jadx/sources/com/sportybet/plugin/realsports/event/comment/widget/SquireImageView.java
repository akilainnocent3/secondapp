package com.sportybet.plugin.realsports.event.comment.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes7.dex */
public class SquireImageView extends AppCompatImageView {
    public SquireImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    public SquireImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SquireImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
