package com.sportybet.plugin.realsports.promotion;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.iwh0;

/* JADX INFO: loaded from: classes7.dex */
public class GetGiftsPanel extends RelativeLayout {
    public GetGiftsPanel(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        View.inflate(context, R.layout.spr_promotion_pop_win_get_gifts, this);
        ((ImageView) findViewById(R.id.get_gifts_close)).setImageDrawable(iwh0.a(context, R.drawable.spr_ic_close_black_24dp, Color.parseColor("#9ca0ab")));
    }

    public GetGiftsPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public GetGiftsPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
