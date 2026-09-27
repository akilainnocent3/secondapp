package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends tq {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Bitmap f34049sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Rect f34050tq = new Rect();
    private final Paint vy = new Paint(1);

    public hww(Bitmap bitmap, tq tqVar) {
        this.f34049sd = bitmap;
        if (tqVar != null) {
            this.hww = tqVar.hww;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tq
    public void hww(Canvas canvas) {
        canvas.drawBitmap(this.f34049sd, this.f34050tq, getBounds(), this.vy);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.f34049sd.getWidth();
        int height = this.f34049sd.getHeight();
        this.f34050tq.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.f34050tq;
                int i10 = (width - iWidth) / 2;
                rect2.left = i10;
                rect2.right = i10 + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.f34050tq;
                int i11 = (height - iHeight) / 2;
                rect3.top = i11;
                rect3.bottom = i11 + iHeight;
                return;
            }
            return;
        }
        float f10 = iHeight;
        float f11 = f10 * 1.0f;
        float f12 = height;
        float f13 = f11 / f12;
        float f14 = iWidth;
        float f15 = 1.0f * f14;
        float f16 = width;
        if (Math.max(f13, f15 / f16) > f13) {
            int i12 = (int) ((f11 / f14) * f16);
            Rect rect4 = this.f34050tq;
            int i13 = (height - i12) / 2;
            rect4.top = i13;
            rect4.bottom = i13 + i12;
            return;
        }
        int i14 = (int) ((f15 / f10) * f12);
        Rect rect5 = this.f34050tq;
        int i15 = (width - i14) / 2;
        rect5.left = i15;
        rect5.right = i15 + i14;
    }
}
