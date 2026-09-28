package com.sportygames.sportysoccer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public class TutorialBallsLayout extends LinearLayout {
    public ImageView a;
    public ImageView b;
    public ImageView c;

    public TutorialBallsLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.ball1);
        this.b = (ImageView) findViewById(R.id.ball2);
        this.c = (ImageView) findViewById(R.id.ball3);
    }

    public TutorialBallsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TutorialBallsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
