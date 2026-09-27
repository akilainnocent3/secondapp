package androidx.leanback.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class HorizontalGridView extends i {
    public boolean A;
    public boolean B;
    public Paint C;
    public Bitmap D;
    public LinearGradient E;
    public int F;
    public int G;
    public Bitmap H;
    public LinearGradient I;
    public int J;
    public int K;
    public final Rect L;

    public HorizontalGridView(Context context) {
        this(context, null);
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.H;
        if (bitmap == null || bitmap.getWidth() != this.J || this.H.getHeight() != getHeight()) {
            this.H = Bitmap.createBitmap(this.J, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.H;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.D;
        if (bitmap == null || bitmap.getWidth() != this.F || this.D.getHeight() != getHeight()) {
            this.D = Bitmap.createBitmap(this.F, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.D;
    }

    public final boolean A() {
        if (!this.A) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (this.f12642b.T(getChildAt(i10)) < getPaddingLeft() - this.G) {
                return true;
            }
        }
        return false;
    }

    public final void B() {
        if (this.A || this.B) {
            setLayerType(2, null);
            setWillNotDraw(false);
        } else {
            setLayerType(0, null);
            setWillNotDraw(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        boolean zA = A();
        boolean z10 = z();
        if (!zA) {
            this.D = null;
        }
        if (!z10) {
            this.H = null;
        }
        if (!zA && !z10) {
            super.draw(canvas);
            return;
        }
        int paddingLeft = this.A ? (getPaddingLeft() - this.G) - this.F : 0;
        int width = this.B ? (getWidth() - getPaddingRight()) + this.K + this.J : getWidth();
        int iSave = canvas.save();
        canvas.clipRect((this.A ? this.F : 0) + paddingLeft, 0, width - (this.B ? this.J : 0), getHeight());
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        Canvas canvas2 = new Canvas();
        Rect rect = this.L;
        rect.top = 0;
        rect.bottom = getHeight();
        if (zA && this.F > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int iSave2 = canvas2.save();
            canvas2.clipRect(0, 0, this.F, getHeight());
            float f10 = -paddingLeft;
            canvas2.translate(f10, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(iSave2);
            this.C.setShader(this.E);
            canvas2.drawRect(0.0f, 0.0f, this.F, getHeight(), this.C);
            Rect rect2 = this.L;
            rect2.left = 0;
            rect2.right = this.F;
            canvas.translate(paddingLeft, 0.0f);
            Rect rect3 = this.L;
            canvas.drawBitmap(tempBitmapLow, rect3, rect3, (Paint) null);
            canvas.translate(f10, 0.0f);
        }
        if (!z10 || this.J <= 0) {
            return;
        }
        Bitmap tempBitmapHigh = getTempBitmapHigh();
        tempBitmapHigh.eraseColor(0);
        canvas2.setBitmap(tempBitmapHigh);
        int iSave3 = canvas2.save();
        canvas2.clipRect(0, 0, this.J, getHeight());
        canvas2.translate(-(width - this.J), 0.0f);
        super.draw(canvas2);
        canvas2.restoreToCount(iSave3);
        this.C.setShader(this.I);
        canvas2.drawRect(0.0f, 0.0f, this.J, getHeight(), this.C);
        Rect rect4 = this.L;
        rect4.left = 0;
        int i10 = this.J;
        rect4.right = i10;
        canvas.translate(width - i10, 0.0f);
        Rect rect5 = this.L;
        canvas.drawBitmap(tempBitmapHigh, rect5, rect5, (Paint) null);
        canvas.translate(-(width - this.J), 0.0f);
    }

    @SuppressLint({"GetterSetterNames"})
    public final boolean getFadingLeftEdge() {
        return this.A;
    }

    public final int getFadingLeftEdgeLength() {
        return this.F;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.G;
    }

    @SuppressLint({"GetterSetterNames"})
    public final boolean getFadingRightEdge() {
        return this.B;
    }

    public final int getFadingRightEdgeLength() {
        return this.J;
    }

    public final int getFadingRightEdgeOffset() {
        return this.K;
    }

    public final void setFadingLeftEdge(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            if (!z10) {
                this.D = null;
            }
            invalidate();
            B();
        }
    }

    public final void setFadingLeftEdgeLength(int i10) {
        if (this.F != i10) {
            this.F = i10;
            if (i10 != 0) {
                this.E = new LinearGradient(0.0f, 0.0f, this.F, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                this.E = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i10) {
        if (this.G != i10) {
            this.G = i10;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            if (!z10) {
                this.H = null;
            }
            invalidate();
            B();
        }
    }

    public final void setFadingRightEdgeLength(int i10) {
        if (this.J != i10) {
            this.J = i10;
            if (i10 != 0) {
                this.I = new LinearGradient(0.0f, 0.0f, this.J, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
            } else {
                this.I = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i10) {
        if (this.K != i10) {
            this.K = i10;
            invalidate();
        }
    }

    public void setNumRows(int i10) {
        this.f12642b.B1(i10);
        requestLayout();
    }

    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(d2.c.f12433m) != null) {
            setRowHeight(typedArray.getLayoutDimension(d2.c.f12433m, 0));
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    public void y(Context context, AttributeSet attributeSet) {
        h(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d2.c.f12431k);
        f2.z1.E1(this, context, d2.c.f12431k, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        setRowHeight(typedArrayObtainStyledAttributes);
        setNumRows(typedArrayObtainStyledAttributes.getInt(d2.c.f12432l, 1));
        typedArrayObtainStyledAttributes.recycle();
        B();
        Paint paint = new Paint();
        this.C = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final boolean z() {
        if (!this.B) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.f12642b.U(getChildAt(childCount)) > (getWidth() - getPaddingRight()) + this.K) {
                return true;
            }
        }
        return false;
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C = new Paint();
        this.L = new Rect();
        this.f12642b.setOrientation(0);
        y(context, attributeSet);
    }

    public void setRowHeight(int i10) {
        this.f12642b.G1(i10);
        requestLayout();
    }
}
