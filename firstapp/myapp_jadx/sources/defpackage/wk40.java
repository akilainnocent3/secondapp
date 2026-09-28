package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class wk40 extends ky80 {
    @Override // defpackage.ky80
    public final void h(Canvas canvas, Paint paint) {
        Rect rect = this.E;
        if (rect != null) {
            canvas.drawRect(rect, paint);
        }
    }
}
