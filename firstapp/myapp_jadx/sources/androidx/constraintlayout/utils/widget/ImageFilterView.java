package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.gr0;
import defpackage.wk30;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {
    public ViewOutlineProvider A;
    public RectF B;
    public final Drawable[] C;
    public LayerDrawable D;
    public float E;
    public float F;
    public float G;
    public float H;
    public final c d;
    public boolean e;
    public Drawable f;
    public Drawable i;
    public float v;
    public float w;
    public float y;
    public Path z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            int width = imageFilterView.getWidth();
            int height = imageFilterView.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterView.w) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), imageFilterView.y);
        }
    }

    public static class c {
        public final float[] a = new float[20];
        public final ColorMatrix b = new ColorMatrix();
        public final ColorMatrix c = new ColorMatrix();
        public float d = 1.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = 1.0f;

        public final void a(ImageView imageView) {
            boolean z;
            float f;
            float fLog;
            float fPow;
            float f2;
            float fLog2;
            ColorMatrix colorMatrix = this.b;
            colorMatrix.reset();
            float f3 = this.e;
            char c = 16;
            char c2 = 15;
            char c3 = 14;
            char c4 = '\r';
            char c5 = '\f';
            char c6 = 11;
            float[] fArr = this.a;
            boolean z2 = true;
            if (f3 != 1.0f) {
                float f4 = 1.0f - f3;
                float f5 = 0.2999f * f4;
                float f6 = 0.587f * f4;
                float f7 = f4 * 0.114f;
                fArr[0] = f5 + f3;
                fArr[1] = f6;
                fArr[2] = f7;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f5;
                fArr[6] = f6 + f3;
                fArr[7] = f7;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f5;
                fArr[11] = f6;
                fArr[12] = f7 + f3;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix.set(fArr);
                z = true;
            } else {
                z = false;
            }
            float f8 = this.f;
            ColorMatrix colorMatrix2 = this.c;
            if (f8 != 1.0f) {
                colorMatrix2.setScale(f8, f8, f8, 1.0f);
                colorMatrix.postConcat(colorMatrix2);
                z = true;
            }
            float f9 = this.g;
            if (f9 != 1.0f) {
                if (f9 <= 0.0f) {
                    f9 = 0.01f;
                }
                float f10 = (5000.0f / f9) / 100.0f;
                f = 1.0f;
                if (f10 > 66.0f) {
                    double d = f10 - 60.0f;
                    fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                    fLog = ((float) Math.pow(d, 0.07551485300064087d)) * 288.12216f;
                } else {
                    fLog = (((float) Math.log(f10)) * 99.4708f) - 161.11957f;
                    fPow = 255.0f;
                }
                if (f10 >= 1115947008) {
                    f2 = 305.0448f;
                    fLog2 = 255.0f;
                } else if (f10 > 19.0f) {
                    f2 = 305.0448f;
                    fLog2 = (((float) Math.log(f10 - 10.0f)) * 138.51773f) - 305.0448f;
                } else {
                    f2 = 305.0448f;
                    fLog2 = 0.0f;
                }
                float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
                float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
                float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
                float fLog3 = (((float) Math.log(50.0d)) * 99.4708f) - 161.11957f;
                c5 = '\f';
                float fLog4 = (((float) Math.log(40.0d)) * 138.51773f) - f2;
                float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
                float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
                float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
                fArr[0] = fMin / fMin4;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = fMin2 / fMin5;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[c6] = 0.0f;
                fArr[12] = fMin6;
                fArr[c4] = 0.0f;
                fArr[c3] = 0.0f;
                fArr[c2] = 0.0f;
                fArr[c] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
                z = true;
            } else {
                f = 1.0f;
                c = 16;
                c2 = 15;
                c3 = 14;
                c4 = '\r';
                c6 = 11;
            }
            float f11 = this.d;
            if (f11 != f) {
                fArr[0] = f11;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = f11;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[c6] = 0.0f;
                fArr[c5] = f11;
                fArr[c4] = 0.0f;
                fArr[c3] = 0.0f;
                fArr[c2] = 0.0f;
                fArr[c] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new c();
        this.e = true;
        this.f = null;
        this.i = null;
        this.v = 0.0f;
        this.w = 0.0f;
        this.y = Float.NaN;
        this.C = new Drawable[2];
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        c(context, attributeSet);
    }

    private void setOverlay(boolean z) {
        this.e = z;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 4) {
                    this.v = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 13) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 12) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 3) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 2) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.e));
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
            this.i = drawable;
            Drawable drawable2 = this.f;
            Drawable[] drawableArr = this.C;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.i = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.i = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.i = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.f.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.D = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.v * 255.0f));
            if (!this.e) {
                this.D.getDrawable(0).setAlpha((int) ((1.0f - this.v) * 255.0f));
            }
            super.setImageDrawable(this.D);
        }
    }

    public final void d() {
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

    public final void e() {
        if (Float.isNaN(this.E) && Float.isNaN(this.F) && Float.isNaN(this.G) && Float.isNaN(this.H)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    public float getBrightness() {
        return this.d.d;
    }

    public float getContrast() {
        return this.d.f;
    }

    public float getCrossfade() {
        return this.v;
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
        return this.y;
    }

    public float getRoundPercent() {
        return this.w;
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
        d();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f = drawableMutate;
        Drawable drawable2 = this.i;
        Drawable[] drawableArr = this.C;
        drawableArr[0] = drawable2;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.D = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.v);
    }

    public void setAltImageResource(int i) {
        Drawable drawableA = gr0.a(getContext(), i);
        this.f = drawableA;
        setAltImageDrawable(drawableA);
    }

    public void setBrightness(float f) {
        c cVar = this.d;
        cVar.d = f;
        cVar.a(this);
    }

    public void setContrast(float f) {
        c cVar = this.d;
        cVar.f = f;
        cVar.a(this);
    }

    public void setCrossfade(float f) {
        this.v = f;
        if (this.C != null) {
            if (!this.e) {
                this.D.getDrawable(0).setAlpha((int) ((1.0f - this.v) * 255.0f));
            }
            this.D.getDrawable(1).setAlpha((int) (this.v * 255.0f));
            super.setImageDrawable(this.D);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.i = drawableMutate;
        Drawable[] drawableArr = this.C;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.D = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.v);
    }

    public void setImagePanX(float f) {
        this.E = f;
        e();
    }

    public void setImagePanY(float f) {
        this.F = f;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = gr0.a(getContext(), i).mutate();
        this.i = drawableMutate;
        Drawable[] drawableArr = this.C;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.D = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.v);
    }

    public void setImageRotate(float f) {
        this.H = f;
        e();
    }

    public void setImageZoom(float f) {
        this.G = f;
        e();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.y = f;
            float f2 = this.w;
            this.w = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.y != f;
        this.y = f;
        if (f != 0.0f) {
            if (this.z == null) {
                this.z = new Path();
            }
            if (this.B == null) {
                this.B = new RectF();
            }
            if (this.A == null) {
                b bVar = new b();
                this.A = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.B.set(0.0f, 0.0f, getWidth(), getHeight());
            this.z.reset();
            Path path = this.z;
            RectF rectF = this.B;
            float f3 = this.y;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.w != f;
        this.w = f;
        if (f != 0.0f) {
            if (this.z == null) {
                this.z = new Path();
            }
            if (this.B == null) {
                this.B = new RectF();
            }
            if (this.A == null) {
                a aVar = new a();
                this.A = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.w) / 2.0f;
            this.B.set(0.0f, 0.0f, width, height);
            this.z.reset();
            this.z.addRoundRect(this.B, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        c cVar = this.d;
        cVar.e = f;
        cVar.a(this);
    }

    public void setWarmth(float f) {
        c cVar = this.d;
        cVar.g = f;
        cVar.a(this);
    }

    public ImageFilterView(Context context) {
        super(context);
        this.d = new c();
        this.e = true;
        this.f = null;
        this.i = null;
        this.v = 0.0f;
        this.w = 0.0f;
        this.y = Float.NaN;
        this.C = new Drawable[2];
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new c();
        this.e = true;
        this.f = null;
        this.i = null;
        this.v = 0.0f;
        this.w = 0.0f;
        this.y = Float.NaN;
        this.C = new Drawable[2];
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        c(context, attributeSet);
    }
}
