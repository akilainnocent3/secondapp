package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* JADX INFO: loaded from: classes4.dex */
public class WrapGridView extends GridView {
    public WrapGridView(Context context) {
        super(context);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public WrapGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrapGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
