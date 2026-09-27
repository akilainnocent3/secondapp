package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TextDrawable extends Drawable {

    @l
    private final RectF rect = new RectF();

    @l
    private TextDrawDelegate textDrawDelegate;

    @l
    private final SliderTextStyle textStyle;

    public TextDrawable(@l SliderTextStyle sliderTextStyle) {
        this.textStyle = sliderTextStyle;
        this.textDrawDelegate = new TextDrawDelegate(sliderTextStyle);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas) {
        this.rect.set(getBounds());
        this.textDrawDelegate.draw(canvas, this.rect.centerX(), this.rect.centerY());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.textStyle.getFontSize() + Math.abs(this.textStyle.getOffsetY()));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.rect.width() + Math.abs(this.textStyle.getOffsetX()));
    }

    public final int getOffsetY() {
        return (int) this.textStyle.getOffsetY();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public final int getTextHeight() {
        return (int) this.textStyle.getFontSize();
    }

    public final void setText(@l String str) {
        this.textDrawDelegate.setText(str);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter) {
    }
}
