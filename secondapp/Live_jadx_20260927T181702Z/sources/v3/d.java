package v3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f139956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f139957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f139958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f139959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f139960e;

    public d(int i10, float f10, float f11) {
        f10 = f10 > 1.0f ? 1.0f : f10;
        f10 = f10 < 0.0f ? 0.0f : f10;
        f11 = f11 > 1.0f ? 1.0f : f11;
        float f12 = f11 >= 0.0f ? f11 : 0.0f;
        Paint paint = new Paint();
        this.f139958c = paint;
        paint.setColor(Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10)));
        this.f139956a = f10;
        this.f139957b = f12;
        i(1.0f);
    }

    public static d b(int i10, float f10, float f11) {
        return new d(i10, f10, f11);
    }

    public static d c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(s3.a.n.f129001l0);
        int color = typedArrayObtainStyledAttributes.getColor(s3.a.n.W0, context.getResources().getColor(s3.a.d.Z));
        float fraction = typedArrayObtainStyledAttributes.getFraction(s3.a.n.U0, 1, 1, context.getResources().getFraction(s3.a.g.f128689i, 1, 0));
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(s3.a.n.V0, 1, 1, context.getResources().getFraction(s3.a.g.f128690j, 1, 1));
        typedArrayObtainStyledAttributes.recycle();
        return new d(color, fraction, fraction2);
    }

    public int a(int i10) {
        float f10 = 1.0f - this.f139960e;
        return Color.argb(Color.alpha(i10), (int) (Color.red(i10) * f10), (int) (Color.green(i10) * f10), (int) (Color.blue(i10) * f10));
    }

    public void d(Canvas canvas, View view, boolean z10) {
        Canvas canvas2;
        canvas.save();
        float left = view.getLeft() + view.getTranslationX();
        float top = view.getTop() + view.getTranslationY();
        canvas.translate(left, top);
        canvas.concat(view.getMatrix());
        canvas.translate(-left, -top);
        if (z10) {
            canvas2 = canvas;
            canvas2.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), this.f139958c);
        } else {
            canvas2 = canvas;
            canvas2.drawRect(view.getLeft() + view.getPaddingLeft(), view.getTop() + view.getPaddingTop(), view.getRight() - view.getPaddingRight(), view.getBottom() - view.getPaddingBottom(), this.f139958c);
        }
        canvas2.restore();
    }

    public int e() {
        return this.f139959d;
    }

    public float f() {
        return this.f139960e;
    }

    public Paint g() {
        return this.f139958c;
    }

    public boolean h() {
        return this.f139959d != 0;
    }

    public void i(float f10) {
        float f11 = this.f139957b;
        float f12 = f11 + (f10 * (this.f139956a - f11));
        this.f139960e = f12;
        int i10 = (int) (f12 * 255.0f);
        this.f139959d = i10;
        this.f139958c.setAlpha(i10);
    }
}
