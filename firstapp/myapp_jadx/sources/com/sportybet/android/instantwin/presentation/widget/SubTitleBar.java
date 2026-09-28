package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bqe;
import defpackage.c8i0;

/* JADX INFO: loaded from: classes5.dex */
public class SubTitleBar extends ConstraintLayout {
    public final SubTitleBarTitleWithBadge F;

    public SubTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.iwqk_layout_sub_title_bar, this);
        setBackgroundColor(c8i0.c(R.color.background_type2_secondary, this));
        setPadding(bqe.a(14.0f), 0, bqe.a(14.0f), 0);
        this.F = (SubTitleBarTitleWithBadge) findViewById(R.id.title_with_badge);
    }

    public void setTitle(CharSequence charSequence, int i) {
        this.F.set(charSequence, i);
        this.F.setVisibility(0);
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, 0);
    }

    public SubTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SubTitleBar(Context context) {
        this(context, null);
    }
}
