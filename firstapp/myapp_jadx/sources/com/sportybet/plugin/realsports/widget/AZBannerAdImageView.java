package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes7.dex */
public class AZBannerAdImageView extends AppCompatImageView {
    public float d;

    public AZBannerAdImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.d), 1073741824));
    }

    public void setBannerRatio(float f) {
        this.d = f;
    }

    public AZBannerAdImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AZBannerAdImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
