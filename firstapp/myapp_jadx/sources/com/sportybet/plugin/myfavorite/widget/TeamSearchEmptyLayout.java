package com.sportybet.plugin.myfavorite.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class TeamSearchEmptyLayout extends LinearLayout {
    public TextView a;

    public TeamSearchEmptyLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.message);
    }

    public void setText(int i) {
        this.a.setText(i);
    }

    public TeamSearchEmptyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TeamSearchEmptyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setText(String str) {
        this.a.setText(str);
    }
}
