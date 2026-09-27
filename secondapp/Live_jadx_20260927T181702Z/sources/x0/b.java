package x0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.l;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f143997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f143998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f143999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f144000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f144001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f144002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f144003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Path f144004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewOutlineProvider f144005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RectF f144006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable[] f144007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LayerDrawable f144008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f144009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f144010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f144011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f144012q;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = b.this.getWidth();
            int height = b.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * b.this.f144002g) / 2.0f);
        }
    }

    /* JADX INFO: renamed from: x0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C1516b extends ViewOutlineProvider {
        public C1516b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, b.this.getWidth(), b.this.getHeight(), b.this.f144003h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f144015a = new float[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ColorMatrix f144016b = new ColorMatrix();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorMatrix f144017c = new ColorMatrix();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f144018d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f144019e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f144020f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f144021g = 1.0f;

        public final void a(float f10) {
            float[] fArr = this.f144015a;
            fArr[0] = f10;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f10;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public final void b(float f10) {
            float f11 = 1.0f - f10;
            float f12 = 0.2999f * f11;
            float f13 = 0.587f * f11;
            float f14 = f11 * 0.114f;
            float[] fArr = this.f144015a;
            fArr[0] = f12 + f10;
            fArr[1] = f13;
            fArr[2] = f14;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f12;
            fArr[6] = f13 + f10;
            fArr[7] = f14;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f12;
            fArr[11] = f13;
            fArr[12] = f14 + f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void c(ImageView imageView) {
            boolean z10;
            this.f144016b.reset();
            float f10 = this.f144019e;
            boolean z11 = true;
            if (f10 != 1.0f) {
                b(f10);
                this.f144016b.set(this.f144015a);
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = this.f144020f;
            if (f11 != 1.0f) {
                this.f144017c.setScale(f11, f11, f11, 1.0f);
                this.f144016b.postConcat(this.f144017c);
                z10 = true;
            }
            float f12 = this.f144021g;
            if (f12 != 1.0f) {
                d(f12);
                this.f144017c.set(this.f144015a);
                this.f144016b.postConcat(this.f144017c);
                z10 = true;
            }
            float f13 = this.f144018d;
            if (f13 != 1.0f) {
                a(f13);
                this.f144017c.set(this.f144015a);
                this.f144016b.postConcat(this.f144017c);
            } else {
                z11 = z10;
            }
            if (z11) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f144016b));
            } else {
                imageView.clearColorFilter();
            }
        }

        public final void d(float f10) {
            float fLog;
            float fPow;
            float fLog2;
            if (f10 <= 0.0f) {
                f10 = 0.01f;
            }
            float f11 = (5000.0f / f10) / 100.0f;
            if (f11 > 66.0f) {
                double d10 = f11 - 60.0f;
                fPow = ((float) Math.pow(d10, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d10, 0.07551485300064087d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f11)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f11 < 66.0f) {
                fLog2 = f11 > 19.0f ? (((float) Math.log(f11 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                fLog2 = 255.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f144015a;
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
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public b(Context context) {
        super(context);
        this.f143997b = new c();
        this.f143998c = true;
        this.f143999d = null;
        this.f144000e = null;
        this.f144001f = 0.0f;
        this.f144002g = 0.0f;
        this.f144003h = Float.NaN;
        this.f144007l = new Drawable[2];
        this.f144009n = Float.NaN;
        this.f144010o = Float.NaN;
        this.f144011p = Float.NaN;
        this.f144012q = Float.NaN;
        e(context, null);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.c.Y8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f143999d = typedArrayObtainStyledAttributes.getDrawable(l.c.Z8);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == l.c.f8530d9) {
                    this.f144001f = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == l.c.f8682m9) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == l.c.f8665l9) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == l.c.f8513c9) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == l.c.f8496b9) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == l.c.f8631j9) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == l.c.f8648k9) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == l.c.f8615i9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f143998c));
                } else if (index == l.c.f8547e9) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f144009n));
                } else if (index == l.c.f8564f9) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f144010o));
                } else if (index == l.c.f8581g9) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f144012q));
                } else if (index == l.c.f8598h9) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f144011p));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f144000e = drawable;
            if (this.f143999d == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f144000e = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f144007l;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f144000e = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f144007l;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f144000e = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f144007l[1] = this.f143999d.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f144007l);
            this.f144008m = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f144001f * 255.0f));
            if (!this.f143998c) {
                this.f144008m.getDrawable(0).setAlpha((int) ((1.0f - this.f144001f) * 255.0f));
            }
            super.setImageDrawable(this.f144008m);
        }
    }

    private void f() {
        if (Float.isNaN(this.f144009n) && Float.isNaN(this.f144010o) && Float.isNaN(this.f144011p) && Float.isNaN(this.f144012q)) {
            return;
        }
        float f10 = Float.isNaN(this.f144009n) ? 0.0f : this.f144009n;
        float f11 = Float.isNaN(this.f144010o) ? 0.0f : this.f144010o;
        float f12 = Float.isNaN(this.f144011p) ? 1.0f : this.f144011p;
        float f13 = Float.isNaN(this.f144012q) ? 0.0f : this.f144012q;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f14 = f12 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f14, f14);
        float f15 = intrinsicWidth * f14;
        float f16 = f14 * intrinsicHeight;
        matrix.postTranslate((((f10 * (width - f15)) + width) - f15) * 0.5f, (((f11 * (height - f16)) + height) - f16) * 0.5f);
        matrix.postRotate(f13, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void g() {
        if (Float.isNaN(this.f144009n) && Float.isNaN(this.f144010o) && Float.isNaN(this.f144011p) && Float.isNaN(this.f144012q)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            f();
        }
    }

    private void setOverlay(boolean z10) {
        this.f143998c = z10;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f143997b.f144018d;
    }

    public float getContrast() {
        return this.f143997b.f144020f;
    }

    public float getCrossfade() {
        return this.f144001f;
    }

    public float getImagePanX() {
        return this.f144009n;
    }

    public float getImagePanY() {
        return this.f144010o;
    }

    public float getImageRotate() {
        return this.f144012q;
    }

    public float getImageZoom() {
        return this.f144011p;
    }

    public float getRound() {
        return this.f144003h;
    }

    public float getRoundPercent() {
        return this.f144002g;
    }

    public float getSaturation() {
        return this.f143997b.f144019e;
    }

    public float getWarmth() {
        return this.f143997b.f144021g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        f();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f143999d = drawableMutate;
        Drawable[] drawableArr = this.f144007l;
        drawableArr[0] = this.f144000e;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f144007l);
        this.f144008m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f144001f);
    }

    public void setAltImageResource(int i10) {
        Drawable drawableB = n.a.b(getContext(), i10);
        this.f143999d = drawableB;
        setAltImageDrawable(drawableB);
    }

    public void setBrightness(float f10) {
        c cVar = this.f143997b;
        cVar.f144018d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        c cVar = this.f143997b;
        cVar.f144020f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.f144001f = f10;
        if (this.f144007l != null) {
            if (!this.f143998c) {
                this.f144008m.getDrawable(0).setAlpha((int) ((1.0f - this.f144001f) * 255.0f));
            }
            this.f144008m.getDrawable(1).setAlpha((int) (this.f144001f * 255.0f));
            super.setImageDrawable(this.f144008m);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f143999d == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f144000e = drawableMutate;
        Drawable[] drawableArr = this.f144007l;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f143999d;
        LayerDrawable layerDrawable = new LayerDrawable(this.f144007l);
        this.f144008m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f144001f);
    }

    public void setImagePanX(float f10) {
        this.f144009n = f10;
        g();
    }

    public void setImagePanY(float f10) {
        this.f144010o = f10;
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f143999d == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable drawableMutate = n.a.b(getContext(), i10).mutate();
        this.f144000e = drawableMutate;
        Drawable[] drawableArr = this.f144007l;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f143999d;
        LayerDrawable layerDrawable = new LayerDrawable(this.f144007l);
        this.f144008m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f144001f);
    }

    public void setImageRotate(float f10) {
        this.f144012q = f10;
        g();
    }

    public void setImageZoom(float f10) {
        this.f144011p = f10;
        g();
    }

    @t0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f144003h = f10;
            float f11 = this.f144002g;
            this.f144002g = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f144003h != f10;
        this.f144003h = f10;
        if (f10 != 0.0f) {
            if (this.f144004i == null) {
                this.f144004i = new Path();
            }
            if (this.f144006k == null) {
                this.f144006k = new RectF();
            }
            if (this.f144005j == null) {
                C1516b c1516b = new C1516b();
                this.f144005j = c1516b;
                setOutlineProvider(c1516b);
            }
            setClipToOutline(true);
            this.f144006k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f144004i.reset();
            Path path = this.f144004i;
            RectF rectF = this.f144006k;
            float f12 = this.f144003h;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @t0(21)
    public void setRoundPercent(float f10) {
        boolean z10 = this.f144002g != f10;
        this.f144002g = f10;
        if (f10 != 0.0f) {
            if (this.f144004i == null) {
                this.f144004i = new Path();
            }
            if (this.f144006k == null) {
                this.f144006k = new RectF();
            }
            if (this.f144005j == null) {
                a aVar = new a();
                this.f144005j = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f144002g) / 2.0f;
            this.f144006k.set(0.0f, 0.0f, width, height);
            this.f144004i.reset();
            this.f144004i.addRoundRect(this.f144006k, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        c cVar = this.f143997b;
        cVar.f144019e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        c cVar = this.f143997b;
        cVar.f144021g = f10;
        cVar.c(this);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f143997b = new c();
        this.f143998c = true;
        this.f143999d = null;
        this.f144000e = null;
        this.f144001f = 0.0f;
        this.f144002g = 0.0f;
        this.f144003h = Float.NaN;
        this.f144007l = new Drawable[2];
        this.f144009n = Float.NaN;
        this.f144010o = Float.NaN;
        this.f144011p = Float.NaN;
        this.f144012q = Float.NaN;
        e(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f143997b = new c();
        this.f143998c = true;
        this.f143999d = null;
        this.f144000e = null;
        this.f144001f = 0.0f;
        this.f144002g = 0.0f;
        this.f144003h = Float.NaN;
        this.f144007l = new Drawable[2];
        this.f144009n = Float.NaN;
        this.f144010o = Float.NaN;
        this.f144011p = Float.NaN;
        this.f144012q = Float.NaN;
        e(context, attributeSet);
    }
}
