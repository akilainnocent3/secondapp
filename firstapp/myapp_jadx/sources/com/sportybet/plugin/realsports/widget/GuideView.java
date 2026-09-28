package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GuideView extends RelativeLayout {
    public int a;
    public float b;
    public Paint c;
    public Bitmap d;
    public RectF e;
    public Canvas f;
    public List<View> i;
    public PorterDuffXfermode v;
    public int w;

    public GuideView(Context context) {
        super(context);
        this.a = -1308622848;
        this.w = 0;
        b();
    }

    public final RectF a(View view) {
        int i = this.w;
        RectF rectF = new RectF();
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            rectF.left = i2;
            rectF.top = iArr[1] - i;
            rectF.right = view.getWidth() + i2;
            rectF.bottom = view.getHeight() + (iArr[1] - i);
        }
        return rectF;
    }

    public final void b() {
        this.v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.c.setColor(this.a);
        this.c.setMaskFilter(new BlurMaskFilter(10.0f, BlurMaskFilter.Blur.INNER));
        this.e = new RectF();
        setClickable(true);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<View> list = this.i;
        if (list != null && list.size() > 0) {
            this.c.setXfermode(this.v);
            this.c.setStyle(Paint.Style.FILL);
            Iterator<View> it = this.i.iterator();
            while (it.hasNext()) {
                RectF rectFA = a(it.next());
                RectF rectF = this.e;
                rectFA.offset(-rectF.left, -rectF.top);
                this.f.drawRect(rectFA, this.c);
            }
        }
        Bitmap bitmap = this.d;
        RectF rectF2 = this.e;
        canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, (Paint) null);
        this.c.setXfermode(null);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth(this.b + 0.1f);
        RectF rectF3 = this.e;
        RectF rectF4 = new RectF();
        float f = rectF3.left;
        float f2 = this.b / 2.0f;
        rectF4.left = f - f2;
        rectF4.top = rectF3.top - f2;
        rectF4.right = rectF3.right + f2;
        rectF4.bottom = f2 + rectF3.bottom;
        canvas.drawRect(rectF4, this.c);
    }

    public void setDate(List<View> list) {
        this.i = list;
        if (list != null && !list.isEmpty()) {
            Iterator<View> it = this.i.iterator();
            while (it.hasNext()) {
                this.e.union(a(it.next()));
            }
        }
        RectF rectF = this.e;
        this.b = Math.max(Math.max(rectF.left, rectF.top), Math.max(getContext().getResources().getDisplayMetrics().widthPixels - this.e.right, getContext().getResources().getDisplayMetrics().heightPixels - this.e.bottom));
        if (this.e.width() <= 0.0f || this.e.height() <= 0.0f) {
            this.d = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        } else {
            this.d = Bitmap.createBitmap((int) this.e.width(), (int) this.e.height(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(this.d);
        this.f = canvas;
        canvas.drawColor(this.a);
    }

    public GuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1308622848;
        this.w = 0;
        b();
    }

    public GuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1308622848;
        this.w = 0;
        b();
    }
}
