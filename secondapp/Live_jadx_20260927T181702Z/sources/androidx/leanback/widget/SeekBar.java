package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public final class SeekBar extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f12234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f12235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f12236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f12237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f12238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f12239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f12240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f12248p;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static abstract class a {
        public abstract boolean a();

        public abstract boolean b();
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12234b = new RectF();
        this.f12235c = new RectF();
        this.f12236d = new RectF();
        Paint paint = new Paint(1);
        this.f12237e = paint;
        Paint paint2 = new Paint(1);
        this.f12238f = paint2;
        Paint paint3 = new Paint(1);
        this.f12239g = paint3;
        Paint paint4 = new Paint(1);
        this.f12240h = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(p1.a.f120313c);
        paint4.setColor(-1);
        this.f12246n = context.getResources().getDimensionPixelSize(s3.a.e.T2);
        this.f12247o = context.getResources().getDimensionPixelSize(s3.a.e.R2);
        this.f12245m = context.getResources().getDimensionPixelSize(s3.a.e.S2);
    }

    public final void a() {
        int i10 = isFocused() ? this.f12247o : this.f12246n;
        int width = getWidth();
        int height = getHeight();
        int i11 = (height - i10) / 2;
        RectF rectF = this.f12236d;
        int i12 = this.f12246n;
        float f10 = i11;
        float f11 = height - i11;
        rectF.set(i12 / 2, f10, width - (i12 / 2), f11);
        int i13 = isFocused() ? this.f12245m : this.f12246n / 2;
        float f12 = width - (i13 * 2);
        float f13 = (this.f12241i / this.f12243k) * f12;
        RectF rectF2 = this.f12234b;
        int i14 = this.f12246n;
        rectF2.set(i14 / 2, f10, (i14 / 2) + f13, f11);
        this.f12235c.set(this.f12234b.right, f10, (this.f12246n / 2) + ((this.f12242j / this.f12243k) * f12), f11);
        this.f12244l = i13 + ((int) f13);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f12243k;
    }

    public int getProgress() {
        return this.f12241i;
    }

    public int getSecondProgress() {
        return this.f12242j;
    }

    public int getSecondaryProgressColor() {
        return this.f12237e.getColor();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = isFocused() ? this.f12245m : this.f12246n / 2;
        canvas.drawRoundRect(this.f12236d, f10, f10, this.f12239g);
        RectF rectF = this.f12235c;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f10, f10, this.f12237e);
        }
        canvas.drawRoundRect(this.f12234b, f10, f10, this.f12238f);
        canvas.drawCircle(this.f12244l, getHeight() / 2, f10, this.f12240h);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        a();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        a aVar = this.f12248p;
        if (aVar != null) {
            if (i10 == 4096) {
                return aVar.b();
            }
            if (i10 == 8192) {
                return aVar.a();
            }
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAccessibilitySeekListener(a aVar) {
        this.f12248p = aVar;
    }

    public void setActiveBarHeight(int i10) {
        this.f12247o = i10;
        a();
    }

    public void setActiveRadius(int i10) {
        this.f12245m = i10;
        a();
    }

    public void setBarHeight(int i10) {
        this.f12246n = i10;
        a();
    }

    public void setMax(int i10) {
        this.f12243k = i10;
        a();
    }

    public void setProgress(int i10) {
        int i11 = this.f12243k;
        if (i10 > i11) {
            i10 = i11;
        } else if (i10 < 0) {
            i10 = 0;
        }
        this.f12241i = i10;
        a();
    }

    public void setProgressColor(int i10) {
        this.f12238f.setColor(i10);
    }

    public void setSecondaryProgress(int i10) {
        int i11 = this.f12243k;
        if (i10 > i11) {
            i10 = i11;
        } else if (i10 < 0) {
            i10 = 0;
        }
        this.f12242j = i10;
        a();
    }

    public void setSecondaryProgressColor(int i10) {
        this.f12237e.setColor(i10);
    }
}
