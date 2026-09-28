package com.sportygames.roulette.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.kf9;

/* JADX INFO: loaded from: classes4.dex */
public class RConstraintLayout extends ConstraintLayout {
    public View F;
    public View G;

    public RConstraintLayout(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (size2 > 0 && size > 0) {
            if (this.F == null) {
                this.F = findViewById(R.id.pan);
                this.G = findViewById(R.id.chips);
            }
            View view = this.F;
            if (view != null && this.G != null) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = (size2 / 2) - getResources().getDimensionPixelSize(R.dimen.sg_rut_three);
                int iA = size - kf9.a(getContext(), 450);
                int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                View view2 = this.F;
                if (iA < i3) {
                    view2.setPadding(0, iA - i3, 0, 0);
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = iA;
                } else {
                    view2.setPadding(0, 0, 0, 0);
                    int iA2 = ((iA - ((ViewGroup.MarginLayoutParams) layoutParams).height) - kf9.a(getContext(), 70)) / 2;
                    View view3 = this.G;
                    if (iA2 > 0) {
                        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) view3.getLayoutParams())).topMargin = (iA2 * 6) / 10;
                        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.G.getLayoutParams())).bottomMargin = (iA2 * 14) / 10;
                    } else {
                        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) view3.getLayoutParams())).topMargin = 0;
                        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.G.getLayoutParams())).bottomMargin = 0;
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public RConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
