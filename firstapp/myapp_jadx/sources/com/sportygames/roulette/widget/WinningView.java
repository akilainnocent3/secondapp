package com.sportygames.roulette.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class WinningView extends RelativeLayout {
    public ImageView a;
    public TextView b;

    public WinningView(Context context) {
        super(context);
    }

    public TextView getWinView() {
        return this.b;
    }

    public ImageView getWinViewBackground() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.win_bg);
        this.b = (TextView) findViewById(R.id.win);
    }

    public WinningView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WinningView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
