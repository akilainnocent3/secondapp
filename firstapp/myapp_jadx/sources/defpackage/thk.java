package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class thk extends Drawable implements xhk.b, Animatable {
    public final a a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int i;
    public boolean v;
    public Paint w;
    public Rect y;
    public ArrayList z;

    public thk() {
        throw null;
    }

    public thk(a aVar) {
        this.e = true;
        this.i = -1;
        this.a = aVar;
    }

    @Override // xhk.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        xhk xhkVar = this.a.a;
        xhk.a aVar = xhkVar.i;
        if ((aVar != null ? aVar.e : -1) == xhkVar.a.l.c - 1) {
            this.f++;
        }
        int i = this.i;
        if (i == -1 || this.f < i) {
            return;
        }
        stop();
        ArrayList arrayList = this.z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((zd0) this.z.get(i2)).a(this);
            }
        }
    }

    public final void b(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            hb5.a("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
            return;
        }
        if (i != 0) {
            this.i = i;
            return;
        }
        int i2 = this.a.a.a.l.l;
        int i3 = 1;
        if (i2 != -1) {
            i3 = i2 == 0 ? 0 : 1 + i2;
        }
        this.i = i3 != 0 ? i3 : -1;
    }

    public final void c() {
        gm20.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        xhk xhkVar = this.a.a;
        if (xhkVar.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.b) {
            return;
        }
        this.b = true;
        ArrayList arrayList = xhkVar.c;
        if (xhkVar.j) {
            ib5.a("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            ib5.a("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !xhkVar.f) {
            xhkVar.f = true;
            xhkVar.j = false;
            xhkVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.v) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            Rect rect = this.y;
            if (rect == null) {
                rect = new Rect();
                this.y = rect;
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, rect);
            this.v = false;
        }
        xhk xhkVar = this.a.a;
        xhk.a aVar = xhkVar.i;
        Bitmap bitmap = aVar != null ? aVar.i : xhkVar.l;
        Rect rect2 = this.y;
        if (rect2 == null) {
            rect2 = new Rect();
            this.y = rect2;
        }
        Paint paint = this.w;
        if (paint == null) {
            paint = new Paint(2);
            this.w = paint;
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.v = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.w;
        if (paint == null) {
            paint = new Paint(2);
            this.w = paint;
        }
        paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.w;
        if (paint == null) {
            paint = new Paint(2);
            this.w = paint;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        gm20.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.d);
        this.e = z;
        if (!z) {
            this.b = false;
            xhk xhkVar = this.a.a;
            ArrayList arrayList = xhkVar.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                xhkVar.f = false;
            }
        } else if (this.c) {
            c();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c = true;
        this.f = 0;
        if (this.e) {
            c();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c = false;
        this.b = false;
        xhk xhkVar = this.a.a;
        ArrayList arrayList = xhkVar.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            xhkVar.f = false;
        }
    }

    public static final class a extends Drawable.ConstantState {
        public final xhk a;

        public a(xhk xhkVar) {
            this.a = xhkVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new thk(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new thk(this);
        }
    }
}
