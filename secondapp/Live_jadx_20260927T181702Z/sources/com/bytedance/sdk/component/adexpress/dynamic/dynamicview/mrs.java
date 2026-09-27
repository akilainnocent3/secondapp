package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class mrs extends Drawable {
    private Paint hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34052sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34053tq;
    private RectF vy;

    public mrs(int i10, int i11) {
        this.f34052sd = i10;
        this.f34053tq = i11;
        Paint paint = new Paint();
        this.hww = paint;
        paint.setColor(0);
        this.hww.setAntiAlias(true);
        this.hww.setShadowLayer(i11, 0.0f, 0.0f, -16777216);
        this.hww.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.vy;
        int i10 = this.f34052sd;
        canvas.drawRoundRect(rectF, i10, i10, this.hww);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.hww.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.f34053tq;
        this.vy = new RectF(i10 + i14, i11 + i14, i12 - i14, i13 - i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.hww.setColorFilter(colorFilter);
    }
}
