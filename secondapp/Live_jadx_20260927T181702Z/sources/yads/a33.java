package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a33 extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f146635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f146636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f146638d;

    public a33(@oy.l Context context) {
        super(context);
        this.f146635a = new Rect();
        this.f146636b = new Paint();
        this.f146637c = kl3.a(getContext(), 1.0f);
        this.f146638d = kl3.a(getContext(), 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iA = kl3.a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f146636b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f146637c);
        paint.setColor(iA);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i10 = 0; i10 < lineCount; i10++) {
            int lineBounds = getLineBounds(i10, this.f146635a);
            int lineStart = layout.getLineStart(i10);
            int lineEnd = layout.getLineEnd(i10);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal) + layout.getPrimaryHorizontal(lineEnd - 1);
            float f10 = lineBounds + this.f146638d;
            canvas.drawLine(primaryHorizontal, f10, primaryHorizontal2, f10, paint);
        }
        super.onDraw(canvas);
    }
}
