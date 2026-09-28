package com.sportybet.plugin.swipebet.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.r;

/* JADX INFO: loaded from: classes7.dex */
public class RightTrapezoidView extends View {
    public final ShapeDrawable a;

    public RightTrapezoidView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Path path = new Path();
        path.moveTo(80.0f, 0.0f);
        path.lineTo(200.0f, 0.0f);
        path.lineTo(200.0f, 80.0f);
        path.lineTo(0.0f, 80.0f);
        path.lineTo(80.0f, 0.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new PathShape(path, 200.0f, 80.0f));
        this.a = shapeDrawable;
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        shapeDrawable.getPaint().setStrokeWidth(1.0f);
        shapeDrawable.getPaint().setColor(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.a.setBounds(0, i2 - ((i * 80) / r.d.DEFAULT_DRAG_ANIMATION_DURATION), i, i2);
    }

    public void setColor(int i) {
        this.a.getPaint().setColor(i);
        invalidate();
    }
}
