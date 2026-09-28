package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class yn7 extends jkd0 {
    @Override // defpackage.jkd0
    public final void h(Canvas canvas) {
        for (int i = 0; i < j(); i++) {
            hkd0 hkd0VarI = i(i);
            int iSave = canvas.save();
            canvas.rotate((i * 360) / j(), getBounds().centerX(), getBounds().centerY());
            hkd0VarI.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.jkd0, defpackage.hkd0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = hkd0.a(rect);
        int iWidth = (int) (((((double) rectA.width()) * 3.141592653589793d) / 3.5999999046325684d) / ((double) j()));
        int iCenterX = rectA.centerX() - iWidth;
        int iCenterX2 = rectA.centerX() + iWidth;
        for (int i = 0; i < j(); i++) {
            hkd0 hkd0VarI = i(i);
            int i2 = rectA.top;
            hkd0VarI.f(iCenterX, i2, iCenterX2, (iWidth * 2) + i2);
        }
    }
}
