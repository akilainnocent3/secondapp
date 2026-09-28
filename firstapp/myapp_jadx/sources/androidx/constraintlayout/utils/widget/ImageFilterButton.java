package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.gr0;
import defpackage.wk30;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public LayerDrawable A;
    public boolean B;
    public Drawable C;
    public Drawable D;
    public float E;
    public float F;
    public float G;
    public float H;
    public final ImageFilterView.c d;
    public float e;
    public float f;
    public float i;
    public Path v;
    public ViewOutlineProvider w;
    public RectF y;
    public final Drawable[] z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            int width = imageFilterButton.getWidth();
            int height = imageFilterButton.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterButton.f) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.i);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.d = new ImageFilterView.c();
        this.e = 0.0f;
        this.f = 0.0f;
        this.i = Float.NaN;
        this.z = new Drawable[2];
        this.B = true;
        this.C = null;
        this.D = null;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        a(context, null);
    }

    private void setOverlay(boolean z) {
        this.B = z;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.C = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 4) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 13) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 12) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 3) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.B));
                } else if (index == 5) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.E));
                } else if (index == 6) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.F));
                } else if (index == 7) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.H));
                } else if (index == 8) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.G));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.D = drawable;
            Drawable drawable2 = this.C;
            Drawable[] drawableArr = this.z;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.D = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.D = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.D = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.C.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.A = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.e * 255.0f));
            if (!this.B) {
                this.A.getDrawable(0).setAlpha((int) ((1.0f - this.e) * 255.0f));
            }
            super.setImageDrawable(this.A);
        }
    }

    public final void b() {
        if (Float.isNaN(this.E) && Float.isNaN(this.F) && Float.isNaN(this.G) && Float.isNaN(this.H)) {
            return;
        }
        float f = Float.isNaN(this.E) ? 0.0f : this.E;
        float f2 = Float.isNaN(this.F) ? 0.0f : this.F;
        float f3 = Float.isNaN(this.G) ? 1.0f : this.G;
        float f4 = Float.isNaN(this.H) ? 0.0f : this.H;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f) + width) - f6) * 0.5f, ((((height - f7) * f2) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void c() {
        if (Float.isNaN(this.E) && Float.isNaN(this.F) && Float.isNaN(this.G) && Float.isNaN(this.H)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            b();
        }
    }

    public float getContrast() {
        return this.d.f;
    }

    public float getCrossfade() {
        return this.e;
    }

    public float getImagePanX() {
        return this.E;
    }

    public float getImagePanY() {
        return this.F;
    }

    public float getImageRotate() {
        return this.H;
    }

    public float getImageZoom() {
        return this.G;
    }

    public float getRound() {
        return this.i;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getSaturation() {
        return this.d.e;
    }

    public float getWarmth() {
        return this.d.g;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        b();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = gr0.a(getContext(), i).mutate();
        this.C = drawableMutate;
        Drawable drawable = this.D;
        Drawable[] drawableArr = this.z;
        drawableArr[0] = drawable;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.A = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setBrightness(float f) {
        ImageFilterView.c cVar = this.d;
        cVar.d = f;
        cVar.a(this);
    }

    public void setContrast(float f) {
        ImageFilterView.c cVar = this.d;
        cVar.f = f;
        cVar.a(this);
    }

    public void setCrossfade(float f) {
        this.e = f;
        if (this.z != null) {
            if (!this.B) {
                this.A.getDrawable(0).setAlpha((int) ((1.0f - this.e) * 255.0f));
            }
            this.A.getDrawable(1).setAlpha((int) (this.e * 255.0f));
            super.setImageDrawable(this.A);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.C == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.D = drawableMutate;
        Drawable[] drawableArr = this.z;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.C;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.A = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setImagePanX(float f) {
        this.E = f;
        c();
    }

    public void setImagePanY(float f) {
        this.F = f;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.C == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = gr0.a(getContext(), i).mutate();
        this.D = drawableMutate;
        Drawable[] drawableArr = this.z;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.C;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.A = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setImageRotate(float f) {
        this.H = f;
        c();
    }

    public void setImageZoom(float f) {
        this.G = f;
        c();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.i = f;
            float f2 = this.f;
            this.f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.i != f;
        this.i = f;
        if (f != 0.0f) {
            if (this.v == null) {
                this.v = new Path();
            }
            if (this.y == null) {
                this.y = new RectF();
            }
            if (this.w == null) {
                b bVar = new b();
                this.w = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.y.set(0.0f, 0.0f, getWidth(), getHeight());
            this.v.reset();
            Path path = this.v;
            RectF rectF = this.y;
            float f3 = this.i;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f != f;
        this.f = f;
        if (f != 0.0f) {
            if (this.v == null) {
                this.v = new Path();
            }
            if (this.y == null) {
                this.y = new RectF();
            }
            if (this.w == null) {
                a aVar = new a();
                this.w = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f) / 2.0f;
            this.y.set(0.0f, 0.0f, width, height);
            this.v.reset();
            this.v.addRoundRect(this.y, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.c cVar = this.d;
        cVar.e = f;
        cVar.a(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.c cVar = this.d;
        cVar.g = f;
        cVar.a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ImageFilterView.c();
        this.e = 0.0f;
        this.f = 0.0f;
        this.i = Float.NaN;
        this.z = new Drawable[2];
        this.B = true;
        this.C = null;
        this.D = null;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        a(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ImageFilterView.c();
        this.e = 0.0f;
        this.f = 0.0f;
        this.i = Float.NaN;
        this.z = new Drawable[2];
        this.B = true;
        this.C = null;
        this.D = null;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        a(context, attributeSet);
    }
}
