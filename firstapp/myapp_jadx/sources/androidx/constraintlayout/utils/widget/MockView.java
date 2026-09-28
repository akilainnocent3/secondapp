package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.r;
import defpackage.wk30;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public boolean d;
    public boolean e;
    public String f;
    public final Rect i;
    public int v;
    public int w;
    public int y;
    public int z;

    public MockView(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.i = new Rect();
        this.v = Color.argb(255, 0, 0, 0);
        this.w = Color.argb(255, r.d.DEFAULT_DRAG_ANIMATION_DURATION, r.d.DEFAULT_DRAG_ANIMATION_DURATION, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        this.y = Color.argb(255, 50, 50, 50);
        this.z = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.q);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                } else if (index == 0) {
                    this.v = typedArrayObtainStyledAttributes.getColor(index, this.v);
                } else if (index == 2) {
                    this.y = typedArrayObtainStyledAttributes.getColor(index, this.y);
                } else if (index == 3) {
                    this.w = typedArrayObtainStyledAttributes.getColor(index, this.w);
                } else if (index == 5) {
                    this.e = typedArrayObtainStyledAttributes.getBoolean(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f == null) {
            try {
                this.f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i2 = this.v;
        Paint paint = this.a;
        paint.setColor(i2);
        paint.setAntiAlias(true);
        int i3 = this.w;
        Paint paint2 = this.b;
        paint2.setColor(i3);
        paint2.setAntiAlias(true);
        this.c.setColor(this.y);
        this.z = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.z);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.d) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f, f2, this.a);
            canvas2.drawLine(0.0f, f2, f, 0.0f, this.a);
            canvas2.drawLine(0.0f, 0.0f, f, 0.0f, this.a);
            canvas2.drawLine(f, 0.0f, f, f2, this.a);
            canvas2.drawLine(f, f2, 0.0f, f2, this.a);
            canvas2.drawLine(0.0f, f2, 0.0f, 0.0f, this.a);
        } else {
            canvas2 = canvas;
        }
        String str = this.f;
        if (str == null || !this.e) {
            return;
        }
        int length = str.length();
        Paint paint = this.b;
        Rect rect = this.i;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i = rect.left;
        int i2 = this.z;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas2.drawRect(rect, this.c);
        canvas2.drawText(this.f, fWidth, fHeight, paint);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.i = new Rect();
        this.v = Color.argb(255, 0, 0, 0);
        this.w = Color.argb(255, r.d.DEFAULT_DRAG_ANIMATION_DURATION, r.d.DEFAULT_DRAG_ANIMATION_DURATION, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        this.y = Color.argb(255, 50, 50, 50);
        this.z = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.i = new Rect();
        this.v = Color.argb(255, 0, 0, 0);
        this.w = Color.argb(255, r.d.DEFAULT_DRAG_ANIMATION_DURATION, r.d.DEFAULT_DRAG_ANIMATION_DURATION, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        this.y = Color.argb(255, 50, 50, 50);
        this.z = 4;
        a(context, attributeSet);
    }
}
