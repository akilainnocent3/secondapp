package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;
import defpackage.ecv;
import defpackage.fcv;
import defpackage.o0b;
import defpackage.pk30;
import defpackage.qy80;
import defpackage.rx80;
import defpackage.sx80;
import defpackage.tcv;

/* JADX INFO: loaded from: classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements qy80 {
    public rx80 A;
    public float B;
    public final Path C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public final sx80 d;
    public final RectF e;
    public final RectF f;
    public final Paint i;
    public final Paint v;
    public final Path w;
    public ColorStateList y;
    public fcv z;

    public class a extends ViewOutlineProvider {
        public final Rect a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.A == null) {
                return;
            }
            if (shapeableImageView.z == null) {
                shapeableImageView.z = new fcv(shapeableImageView.A);
            }
            RectF rectF = shapeableImageView.e;
            Rect rect = this.a;
            rectF.round(rect);
            shapeableImageView.z.setBounds(rect);
            shapeableImageView.z.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.d = sx80.a.a;
        this.w = new Path();
        this.J = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.v = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.e = new RectF();
        this.f = new RectF();
        this.C = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, pk30.b0, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.y = ecv.a(9, context2, typedArrayObtainStyledAttributes);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.D = dimensionPixelSize;
        this.E = dimensionPixelSize;
        this.F = dimensionPixelSize;
        this.G = dimensionPixelSize;
        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.A = rx80.d(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new a());
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.e;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        rx80 rx80Var = this.A;
        sx80 sx80Var = this.d;
        Path path = this.w;
        sx80Var.a(rx80Var, null, 1.0f, rectF, null, path);
        Path path2 = this.C;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.G;
    }

    public final int getContentPaddingEnd() {
        int i = this.I;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.D : this.F;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (this.H != Integer.MIN_VALUE || this.I != Integer.MIN_VALUE) {
            if (c() && (i2 = this.I) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && (i = this.H) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.D;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (this.H != Integer.MIN_VALUE || this.I != Integer.MIN_VALUE) {
            if (c() && (i2 = this.H) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && (i = this.I) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.F;
    }

    public final int getContentPaddingStart() {
        int i = this.H;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.F : this.D;
    }

    public int getContentPaddingTop() {
        return this.E;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public rx80 getShapeAppearanceModel() {
        return this.A;
    }

    public ColorStateList getStrokeColor() {
        return this.y;
    }

    public float getStrokeWidth() {
        return this.B;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.C, this.v);
        if (this.y == null) {
            return;
        }
        float f = this.B;
        Paint paint = this.i;
        paint.setStrokeWidth(f);
        int colorForState = this.y.getColorForState(getDrawableState(), this.y.getDefaultColor());
        if (this.B <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.w, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.J && isLayoutDirectionResolved()) {
            this.J = true;
            if (!isPaddingRelative() && this.H == Integer.MIN_VALUE && this.I == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.D) + i, (super.getPaddingTop() - this.E) + i2, (super.getPaddingRight() - this.F) + i3, (super.getPaddingBottom() - this.G) + i4);
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.E) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.G) + i4);
        this.D = c() ? i3 : i;
        this.E = i2;
        if (!c()) {
            i = i3;
        }
        this.F = i;
        this.G = i4;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // defpackage.qy80
    public void setShapeAppearanceModel(rx80 rx80Var) {
        this.A = rx80Var;
        fcv fcvVar = this.z;
        if (fcvVar != null) {
            fcvVar.setShapeAppearanceModel(rx80Var);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.y = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(o0b.b(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.B != f) {
            this.B = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
