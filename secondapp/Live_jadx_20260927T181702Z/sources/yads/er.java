package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class er extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f148813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f148814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f148815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f148816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f148817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f148818f;

    public er(Context context, og0 og0Var) {
        super(context);
        og0Var.getClass();
        this.f148813a = og0.a(context, 34.0f);
        float fA = og0.a(context, 3.0f);
        this.f148814b = fA;
        float fA2 = og0.a(context, 20.0f);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f148815c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fA);
        paint2.setAntiAlias(true);
        this.f148816d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(fA2);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f148817e = paint3;
        this.f148818f = 40.0f;
        a();
    }

    public final void a() {
        this.f148816d.setColor(kl3.a(p1.a.f120313c, this.f148818f));
        this.f148815c.setColor(kl3.a(-1, this.f148818f));
        this.f148817e.setColor(kl3.a(p1.a.f120313c, this.f148818f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = 2;
        float f11 = this.f148813a / f10;
        canvas.drawCircle(f11, f11, f11, this.f148815c);
        canvas.drawCircle(f11, f11, f11 - (this.f148814b / f10), this.f148816d);
        float f12 = this.f148813a / f10;
        canvas.drawText(ql.a1.f122330d, f12, f12 - ((this.f148817e.ascent() + this.f148817e.descent()) / f10), this.f148817e);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) this.f148813a;
        setMeasuredDimension(i12, i12);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        super.setSelected(z10);
        this.f148818f = z10 ? 0.0f : 40.0f;
        a();
        invalidate();
    }
}
