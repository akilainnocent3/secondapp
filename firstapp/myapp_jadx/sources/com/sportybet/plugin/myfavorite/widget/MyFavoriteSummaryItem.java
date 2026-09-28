package com.sportybet.plugin.myfavorite.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class MyFavoriteSummaryItem extends RelativeLayout {
    public View a;
    public TextView b;
    public TextView c;

    public MyFavoriteSummaryItem(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.root);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.description);
    }

    public void setAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setDescription(String str) {
        this.c.setText(str);
    }

    public void setTitle(String str) {
        this.b.setText(str);
    }

    public MyFavoriteSummaryItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyFavoriteSummaryItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
