package com.sportygames.sportyherov2.utils;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.vs50;

/* JADX INFO: loaded from: classes8.dex */
public class PercentageCropImageView extends ImageView {
    public PercentageCropImageView(Context context) {
        super(context);
    }

    public final void a() {
        Drawable drawable;
        float fA;
        float f;
        if (getScaleType() != ImageView.ScaleType.MATRIX || (drawable = getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = new Matrix();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float fA2 = 0.0f;
        if (intrinsicWidth * height > width * intrinsicHeight) {
            f = height / intrinsicHeight;
            fA2 = vs50.a(intrinsicWidth, f, width, 0.5f);
            fA = 0.0f;
        } else {
            float f2 = width / intrinsicWidth;
            fA = vs50.a(intrinsicHeight, f2, height, 0.0f);
            f = f2;
        }
        matrix.setScale(f, f);
        matrix.postTranslate((int) (fA2 + 0.5f), (int) (fA + 0.5f));
        setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        a();
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        a();
    }

    public PercentageCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentageCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
