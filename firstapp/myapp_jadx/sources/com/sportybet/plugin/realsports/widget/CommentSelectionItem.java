package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public class CommentSelectionItem extends ConstraintLayout {
    public TextView F;
    public TextView G;
    public ImageView H;

    public CommentSelectionItem(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.F = (TextView) findViewById(R.id.title);
        this.G = (TextView) findViewById(R.id.sub_title);
        this.H = (ImageView) findViewById(R.id.item_check_img);
    }

    public void setSelection(boolean z) {
        ImageView imageView = this.H;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
    }

    public CommentSelectionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CommentSelectionItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
