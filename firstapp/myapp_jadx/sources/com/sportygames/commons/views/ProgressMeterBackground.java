package com.sportygames.commons.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportygames/commons/views/ProgressMeterBackground;", "Landroid/view/View;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressMeterBackground extends View {
    public final float a;
    public Bitmap b;
    public final Paint c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ProgressMeterBackground(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.a = -0.315f;
        this.b = BitmapFactory.decodeResource(context.getResources(), R.drawable.progress_background);
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        canvas.getClass();
        super.onDraw(canvas);
        try {
            if (getWidth() == 0 || getHeight() == 0 || (bitmap = this.b) == null || bitmap.getHeight() == 0) {
                return;
            }
            float width = getWidth() * this.a;
            int height = getHeight();
            int height2 = bitmap.getHeight();
            float dimension = getResources().getDimension(R.dimen._4sdp);
            Context context = getContext();
            context.getClass();
            canvas.drawBitmap(bitmap, width, ((height / 2) - (height2 * 0.37f)) - TypedValue.applyDimension(1, dimension, context.getResources().getDisplayMetrics()), this.c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0 || size2 == 0) {
            return;
        }
        setMeasuredDimension(size, size2);
        try {
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                int i3 = (int) (((double) size) * 1.2d);
                this.b = Bitmap.createScaledBitmap(bitmap, i3, (bitmap.getHeight() * i3) / bitmap.getWidth(), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressMeterBackground(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressMeterBackground(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressMeterBackground(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
