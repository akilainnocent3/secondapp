package com.yandex.div.core.view2.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import is.d;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ScaleDrawable extends Drawable implements Animatable {

    @l
    private final Drawable child;
    private final float scaleX;
    private final float scaleY;

    public ScaleDrawable(@l Drawable drawable, float f10, float f11) {
        this.child = drawable;
        this.scaleX = f10;
        this.scaleY = f11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.scale(this.scaleX, this.scaleY);
            this.child.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.child.getIntrinsicHeight() == -1) {
            return -1;
        }
        return d.L0(this.child.getIntrinsicHeight() * this.scaleY);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.child.getIntrinsicWidth() == -1) {
            return -1;
        }
        return d.L0(this.child.getIntrinsicWidth() * this.scaleX);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.child.getOpacity();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.child;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.child.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter) {
        this.child.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    public ScaleDrawable(@l Drawable drawable, float f10) {
        this(drawable, f10, f10);
    }
}
