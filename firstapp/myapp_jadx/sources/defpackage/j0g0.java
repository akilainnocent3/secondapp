package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class j0g0 extends fcv implements hff0.b {
    public CharSequence W;
    public final Context X;
    public final Paint.FontMetrics Y;
    public final hff0 Z;
    public final a a0;
    public final Rect b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public boolean g0;
    public int h0;
    public int i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            j0g0 j0g0Var = j0g0.this;
            j0g0Var.i0 = i9;
            view.getWindowVisibleDisplayFrame(j0g0Var.b0);
        }
    }

    public j0g0(Context context, int i) {
        super(context, null, 0, i);
        this.Y = new Paint.FontMetrics();
        hff0 hff0Var = new hff0(this);
        this.Z = hff0Var;
        this.a0 = new a();
        this.b0 = new Rect();
        this.j0 = 1.0f;
        this.k0 = 1.0f;
        this.l0 = 0.5f;
        this.m0 = 0.5f;
        this.n0 = 1.0f;
        this.X = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = hff0Var.a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float E() {
        int i;
        Rect rect = this.b0;
        if (((rect.right - getBounds().right) - this.i0) - this.f0 < 0) {
            i = ((rect.right - getBounds().right) - this.i0) - this.f0;
        } else {
            if (((rect.left - getBounds().left) - this.i0) + this.f0 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.i0) + this.f0;
        }
        return i;
    }

    public final ily F() {
        float f = -E();
        float fWidth = (float) ((((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.h0))) / 2.0d);
        return new ily(new ppu(this.h0), Math.min(Math.max(f, -fWidth), fWidth));
    }

    @Override // defpackage.fcv, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fE = E();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.h0)) - ((double) this.h0)));
        canvas.scale(this.j0, this.k0, (getBounds().width() * this.l0) + getBounds().left, (getBounds().height() * this.m0) + getBounds().top);
        canvas.translate(fE, f);
        super.draw(canvas);
        if (this.W == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            hff0 hff0Var = this.Z;
            TextPaint textPaint = hff0Var.a;
            Paint.FontMetrics fontMetrics = this.Y;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (hff0Var.g != null) {
                textPaint.drawableState = getState();
                hff0Var.g.d(this.X, hff0Var.a, hff0Var.b);
                textPaint.setAlpha((int) (this.n0 * 255.0f));
            }
            CharSequence charSequence = this.W;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.Z.a.getTextSize(), this.e0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.c0 * 2;
        CharSequence charSequence = this.W;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.Z.a(charSequence.toString())), this.d0);
    }

    @Override // defpackage.fcv, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.g0) {
            rx80.a aVarH = this.b.a.h();
            aVarH.k = F();
            setShapeAppearanceModel(aVarH.a());
        }
    }
}
