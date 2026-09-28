package com.sportybet.plugin.realsports.betorder.calendar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import defpackage.czc;

/* JADX INFO: loaded from: classes7.dex */
public class MonthView extends FrameLayout {
    public a a;

    public static class a extends RecyclerView {
        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final void onMeasure(int i, int i2) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.calendar_date_grid_max_width);
            if (dimensionPixelSize > 0) {
                int mode = View.MeasureSpec.getMode(i);
                i = mode == 0 ? View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), dimensionPixelSize), mode);
            }
            int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.calendar_date_grid_max_height);
            if (dimensionPixelSize2 > 0) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i2 = mode2 == 0 ? View.MeasureSpec.makeMeasureSpec(dimensionPixelSize2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), dimensionPixelSize2), mode2);
            }
            super.onMeasure(i, i2);
        }
    }

    public MonthView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        a aVar = new a(getContext());
        this.a = aVar;
        aVar.setHasFixedSize(true);
        this.a.setNestedScrollingEnabled(false);
        a aVar2 = this.a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        aVar2.setLayoutParams(layoutParams);
        getContext();
        this.a.setLayoutManager(new GridLayoutManager(7));
        addView(this.a);
    }

    public czc getAdapter() {
        return (czc) this.a.getAdapter();
    }

    public void setAdapter(czc czcVar) {
        this.a.setAdapter(czcVar);
    }

    public MonthView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MonthView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
