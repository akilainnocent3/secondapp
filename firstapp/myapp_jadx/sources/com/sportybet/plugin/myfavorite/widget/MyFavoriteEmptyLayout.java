package com.sportybet.plugin.myfavorite.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class MyFavoriteEmptyLayout extends LinearLayout {
    public TextView a;

    public MyFavoriteEmptyLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.pick_my_favourites);
    }

    public void setPickMyFavouritesOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public MyFavoriteEmptyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyFavoriteEmptyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
