package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.rk30;
import defpackage.sn5;

/* JADX INFO: loaded from: classes6.dex */
public class CommonTitleBar extends LinearLayout {
    public TextView a;
    public ImageButton b;

    public CommonTitleBar(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        View.inflate(context, R.layout.spr_common_title_bar, this);
        setBackgroundColor(getContext().getColor(R.color.brand_primary));
        this.a = (TextView) findViewById(R.id.back_title);
        this.b = (ImageButton) findViewById(R.id.back_icon);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        a(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.k);
        try {
            String strA = sn5.a(0, context, typedArrayObtainStyledAttributes);
            if (!TextUtils.isEmpty(strA)) {
                setTitle(strA);
            }
            setTitleMaxLines(typedArrayObtainStyledAttributes.getInt(2, 1));
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                setTitleLineSpacing(typedArrayObtainStyledAttributes.getDimension(1, 0.0f));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ImageButton getBackBtn() {
        return this.b;
    }

    public void setTitle(int i) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void setTitleLineSpacing(float f) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setLineSpacing(f, 1.0f);
        }
    }

    public void setTitleMaxLines(int i) {
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        textView.setSingleLine(i == 1);
        if (i > 1) {
            this.a.setMaxLines(i);
            this.a.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, attributeSet);
    }
}
