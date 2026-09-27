package com.yandex.div.internal.widget.slider;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import k.q0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SliderDrawDelegate {
    private int viewportHeight;
    private int viewportWidth;

    private final int calculateBottom(Drawable drawable) {
        return getCenterY() + (drawable.getIntrinsicHeight() / 2);
    }

    private final int calculateTop(Drawable drawable) {
        return getCenterY() - (drawable.getIntrinsicHeight() / 2);
    }

    private final int getCenterY() {
        return this.viewportHeight / 2;
    }

    public final void drawInactiveTrack(@l Canvas canvas, @m Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, calculateTop(drawable), this.viewportWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawOnPosition(@l Canvas canvas, @m Drawable drawable, int i10) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i10 - intrinsicWidth, calculateTop(drawable), i10 + intrinsicWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawThumb(@l Canvas canvas, int i10, @m Drawable drawable, int i11, @m TextDrawable textDrawable) {
        drawOnPosition(canvas, drawable, i10);
        if (textDrawable != null) {
            textDrawable.setText(String.valueOf(i11));
            drawOnPosition(canvas, textDrawable, i10);
        }
    }

    public final void drawTrackPart(@l Canvas canvas, @m Drawable drawable, @q0 int i10, @q0 int i11) {
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, calculateTop(drawable), i11, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void onMeasure(int i10, int i11) {
        this.viewportWidth = i10;
        this.viewportHeight = i11;
    }
}
