package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;
import k.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends GradientDrawable {
    protected Path hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Paint f34062tq;

    public tq() {
        this.hww = new Path();
        Paint paint = new Paint(1);
        this.f34062tq = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.hww;
        if (path == null || path.isEmpty()) {
            hww(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f34062tq, 31);
        hww(canvas);
        this.f34062tq.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.hww, this.f34062tq);
        this.f34062tq.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void hww(Canvas canvas) {
        super.draw(canvas);
    }

    public void hww(int i10, int i11, int i12, int i13) {
        this.hww.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    public tq(GradientDrawable.Orientation orientation, @k int[] iArr) {
        super(orientation, iArr);
        this.hww = new Path();
        Paint paint = new Paint(1);
        this.f34062tq = paint;
        paint.setColor(-1);
    }
}
