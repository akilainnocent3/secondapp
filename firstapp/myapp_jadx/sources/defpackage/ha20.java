package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import eightbitlab.com.blurview.BlurView;

/* JADX INFO: loaded from: classes8.dex */
public final class ha20 implements fg4 {
    public final eg4 b;
    public ng4 c;
    public Bitmap d;
    public final BlurView e;
    public int f;
    public final ViewGroup g;
    public boolean k;
    public ColorDrawable l;
    public float a = 16.0f;
    public final int[] h = new int[2];
    public final int[] i = new int[2];
    public final a j = new a();

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ha20.this.c();
            return true;
        }
    }

    public ha20(BlurView blurView, ViewGroup viewGroup, int i, eg4 eg4Var) {
        this.g = viewGroup;
        this.e = blurView;
        this.f = i;
        this.b = eg4Var;
        if (eg4Var instanceof o750) {
            ((o750) eg4Var).f = blurView.getContext();
        }
        a(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    public final void a(int i, int i2) {
        e(true);
        eg4 eg4Var = this.b;
        eg4Var.getClass();
        float f = i2;
        int iCeil = (int) Math.ceil(f / 6.0f);
        BlurView blurView = this.e;
        if (iCeil != 0) {
            float f2 = i;
            double d = f2 / 6.0f;
            if (((int) Math.ceil(d)) != 0) {
                blurView.setWillNotDraw(false);
                int iCeil2 = (int) Math.ceil(d);
                int i3 = iCeil2 % 64;
                if (i3 != 0) {
                    iCeil2 = (iCeil2 - i3) + 64;
                }
                int iCeil3 = (int) Math.ceil(f / (f2 / iCeil2));
                eg4Var.a();
                this.d = Bitmap.createBitmap(iCeil2, iCeil3, Bitmap.Config.ARGB_8888);
                this.c = new ng4(this.d);
                this.k = true;
                c();
                return;
            }
        }
        blurView.setWillNotDraw(true);
    }

    public final fg4 b(int i) {
        if (this.f != i) {
            this.f = i;
            this.e.invalidate();
        }
        return this;
    }

    public final void c() {
        if (this.k) {
            ColorDrawable colorDrawable = this.l;
            if (colorDrawable == null) {
                this.d.eraseColor(0);
            } else {
                colorDrawable.draw(this.c);
            }
            this.c.save();
            ViewGroup viewGroup = this.g;
            int[] iArr = this.h;
            viewGroup.getLocationOnScreen(iArr);
            BlurView blurView = this.e;
            int[] iArr2 = this.i;
            blurView.getLocationOnScreen(iArr2);
            int i = iArr2[0] - iArr[0];
            int i2 = iArr2[1] - iArr[1];
            float height = blurView.getHeight() / this.d.getHeight();
            float width = blurView.getWidth() / this.d.getWidth();
            this.c.translate((-i) / width, (-i2) / height);
            this.c.scale(1.0f / width, 1.0f / height);
            viewGroup.draw(this.c);
            this.c.restore();
            this.d = this.b.c(this.d, this.a);
        }
    }

    @Override // defpackage.fg4
    public final boolean d(Canvas canvas) {
        if (this.k) {
            if (canvas instanceof ng4) {
                return false;
            }
            BlurView blurView = this.e;
            float height = blurView.getHeight() / this.d.getHeight();
            float width = blurView.getWidth() / this.d.getWidth();
            canvas.save();
            canvas.scale(width, height);
            this.b.b(canvas, this.d);
            canvas.restore();
            int i = this.f;
            if (i != 0) {
                canvas.drawColor(i);
            }
        }
        return true;
    }

    @Override // defpackage.fg4
    public final void destroy() {
        e(false);
        this.b.destroy();
        this.k = false;
    }

    @Override // defpackage.fg4
    public final fg4 e(boolean z) {
        ViewGroup viewGroup = this.g;
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        a aVar = this.j;
        viewTreeObserver.removeOnPreDrawListener(aVar);
        if (z) {
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
        return this;
    }

    @Override // defpackage.fg4
    public final void f() {
        BlurView blurView = this.e;
        a(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }
}
