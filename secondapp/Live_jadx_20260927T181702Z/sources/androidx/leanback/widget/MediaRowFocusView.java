package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY})
class MediaRowFocusView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f12100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f12101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12102d;

    public MediaRowFocusView(Context context) {
        super(context);
        this.f12101c = new RectF();
        this.f12100b = a(context);
    }

    public final Paint a(Context context) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(s3.a.d.J));
        return paint;
    }

    public int b() {
        return this.f12102d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f12102d = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        this.f12101c.set(0.0f, -height2, getWidth(), getHeight() + height2);
        RectF rectF = this.f12101c;
        int i10 = this.f12102d;
        canvas.drawRoundRect(rectF, i10, i10, this.f12100b);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12101c = new RectF();
        this.f12100b = a(context);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12101c = new RectF();
        this.f12100b = a(context);
    }
}
