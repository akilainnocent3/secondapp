package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class mt50 extends ky80 {
    @Override // defpackage.ky80
    public final void h(Canvas canvas, Paint paint) {
        if (this.E != null) {
            paint.setStyle(Paint.Style.STROKE);
            int iMin = Math.min(this.E.width(), this.E.height()) / 2;
            paint.setStrokeWidth(iMin / 12);
            canvas.drawCircle(this.E.centerX(), this.E.centerY(), iMin, paint);
        }
    }
}
