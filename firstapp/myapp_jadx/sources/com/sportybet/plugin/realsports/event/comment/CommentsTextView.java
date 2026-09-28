package com.sportybet.plugin.realsports.event.comment;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;
import defpackage.g9i0;
import defpackage.gr0;
import defpackage.iwh0;
import defpackage.r6i0;
import defpackage.rk30;
import defpackage.zch0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CommentsTextView extends AppCompatTextView {
    public final int v;
    public boolean w;

    public CommentsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.i, i, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        this.w = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        setSelected(this.w);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = getCompoundDrawables()[0];
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth() + getCompoundDrawablePadding() + ((int) getPaint().measureText(getText().toString().trim()));
            canvas.save();
            canvas.translate((getWidth() - intrinsicWidth) / 2, 0.0f);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        this.w = z;
        int i = this.v;
        if (!z) {
            setTextColor(getContext().getColor(R.color.text_type1_primary));
            Drawable drawableA = iwh0.a(getContext(), i, getContext().getColor(R.color.text_type1_primary));
            drawableA.setBounds(0, 0, zch0.a(getContext(), 16), zch0.a(getContext(), 16));
            setCompoundDrawables(drawableA, null, null, null);
            Drawable drawableA2 = gr0.a(getContext(), R.drawable.spr_shape_bg_prematch_event);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            setBackground(drawableA2);
            return;
        }
        int color = getContext().getColor(R.color.absolute_type1);
        setTextColor(color);
        Drawable drawableA3 = iwh0.a(getContext(), i, color);
        drawableA3.setBounds(0, 0, zch0.a(getContext(), 16), zch0.a(getContext(), 16));
        setCompoundDrawables(drawableA3, null, null, null);
        Drawable drawableA4 = gr0.a(getContext(), R.drawable.spr_shape_bg_prematch_event_selected);
        WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
        setBackground(drawableA4);
    }

    public CommentsTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommentsTextView(Context context) {
        this(context, null);
    }
}
