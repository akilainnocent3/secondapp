package x0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f144022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f144023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f144024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f144025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f144026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f144027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f144028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f144029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f144030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f144031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f144032l;

    public c(Context context) {
        super(context);
        this.f144022b = new Paint();
        this.f144023c = new Paint();
        this.f144024d = new Paint();
        this.f144025e = true;
        this.f144026f = true;
        this.f144027g = null;
        this.f144028h = new Rect();
        this.f144029i = Color.argb(255, 0, 0, 0);
        this.f144030j = Color.argb(255, 200, 200, 200);
        this.f144031k = Color.argb(255, 50, 50, 50);
        this.f144032l = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.c.Cc);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == l.c.Ec) {
                    this.f144027g = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == l.c.Hc) {
                    this.f144025e = typedArrayObtainStyledAttributes.getBoolean(index, this.f144025e);
                } else if (index == l.c.Dc) {
                    this.f144029i = typedArrayObtainStyledAttributes.getColor(index, this.f144029i);
                } else if (index == l.c.Fc) {
                    this.f144031k = typedArrayObtainStyledAttributes.getColor(index, this.f144031k);
                } else if (index == l.c.Gc) {
                    this.f144030j = typedArrayObtainStyledAttributes.getColor(index, this.f144030j);
                } else if (index == l.c.Ic) {
                    this.f144026f = typedArrayObtainStyledAttributes.getBoolean(index, this.f144026f);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f144027g == null) {
            try {
                this.f144027g = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f144022b.setColor(this.f144029i);
        this.f144022b.setAntiAlias(true);
        this.f144023c.setColor(this.f144030j);
        this.f144023c.setAntiAlias(true);
        this.f144024d.setColor(this.f144031k);
        this.f144032l = Math.round(this.f144032l * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f144025e) {
            width--;
            height--;
            float f10 = width;
            float f11 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f10, f11, this.f144022b);
            canvas2.drawLine(0.0f, f11, f10, 0.0f, this.f144022b);
            canvas2.drawLine(0.0f, 0.0f, f10, 0.0f, this.f144022b);
            canvas2.drawLine(f10, 0.0f, f10, f11, this.f144022b);
            canvas2.drawLine(f10, f11, 0.0f, f11, this.f144022b);
            canvas2.drawLine(0.0f, f11, 0.0f, 0.0f, this.f144022b);
        } else {
            canvas2 = canvas;
        }
        String str = this.f144027g;
        if (str == null || !this.f144026f) {
            return;
        }
        this.f144023c.getTextBounds(str, 0, str.length(), this.f144028h);
        float fWidth = (width - this.f144028h.width()) / 2.0f;
        float fHeight = ((height - this.f144028h.height()) / 2.0f) + this.f144028h.height();
        this.f144028h.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f144028h;
        int i10 = rect.left;
        int i11 = this.f144032l;
        rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
        canvas2.drawRect(this.f144028h, this.f144024d);
        canvas2.drawText(this.f144027g, fWidth, fHeight, this.f144023c);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144022b = new Paint();
        this.f144023c = new Paint();
        this.f144024d = new Paint();
        this.f144025e = true;
        this.f144026f = true;
        this.f144027g = null;
        this.f144028h = new Rect();
        this.f144029i = Color.argb(255, 0, 0, 0);
        this.f144030j = Color.argb(255, 200, 200, 200);
        this.f144031k = Color.argb(255, 50, 50, 50);
        this.f144032l = 4;
        a(context, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f144022b = new Paint();
        this.f144023c = new Paint();
        this.f144024d = new Paint();
        this.f144025e = true;
        this.f144026f = true;
        this.f144027g = null;
        this.f144028h = new Rect();
        this.f144029i = Color.argb(255, 0, 0, 0);
        this.f144030j = Color.argb(255, 200, 200, 200);
        this.f144031k = Color.argb(255, 50, 50, 50);
        this.f144032l = 4;
        a(context, attributeSet);
    }
}
