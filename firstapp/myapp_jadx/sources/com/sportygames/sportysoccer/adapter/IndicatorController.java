package com.sportygames.sportysoccer.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public class IndicatorController extends LinearLayout {
    public int a;

    public IndicatorController(Context context) {
        super(context);
    }

    public final void a(int i) {
        int i2 = 0;
        while (i2 < this.a) {
            int i3 = i2 == i ? R.drawable.sg_ic_appintro_indicator_selected : R.drawable.sg_ic_appintro_indicator_unselected;
            if (getChildAt(i2) instanceof ImageView) {
                ((ImageView) getChildAt(i2)).setImageDrawable(getContext().getDrawable(i3));
            }
            i2++;
        }
    }
}
