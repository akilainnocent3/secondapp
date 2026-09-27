package com.bytedance.adsdk.ugeno.rs.vy;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends Drawable {

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private boolean f32636bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private Shader.TileMode f32637ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final int f32638hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final Paint f32639hv;
    private float jpb;
    private boolean khx;
    private ColorStateList mrs;
    private final Matrix nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private Shader.TileMode f32640ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final RectF f32641ok;
    private ImageView.ScaleType omn;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final Paint f32642rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final RectF f32643sd;
    private final int vgm;
    private final RectF vhb;
    private final Bitmap vy;
    private float weu;
    private final boolean[] wgt;
    private final RectF hww = new RectF();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final RectF f32644tq = new RectF();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.rs.vy.tq$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hww;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            hww = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hww[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hww[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hww[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hww[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hww[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                hww[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public tq(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f32643sd = rectF;
        this.f32641ok = new RectF();
        this.nod = new Matrix();
        this.vhb = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f32640ny = tileMode;
        this.f32637ed = tileMode;
        this.khx = true;
        this.weu = 0.0f;
        this.wgt = new boolean[]{true, true, true, true};
        this.f32636bs = false;
        this.jpb = 0.0f;
        this.mrs = ColorStateList.valueOf(-16777216);
        this.omn = ImageView.ScaleType.FIT_CENTER;
        this.vy = bitmap;
        int width = bitmap.getWidth();
        this.f32638hu = width;
        int height = bitmap.getHeight();
        this.vgm = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f32639hv = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f32642rs = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.mrs.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.jpb);
    }

    public static tq hww(Bitmap bitmap) {
        if (bitmap != null) {
            return new tq(bitmap);
        }
        return null;
    }

    public static Bitmap tq(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.khx) {
            BitmapShader bitmapShader = new BitmapShader(this.vy, this.f32640ny, this.f32637ed);
            Shader.TileMode tileMode = this.f32640ny;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f32637ed == tileMode2) {
                bitmapShader.setLocalMatrix(this.nod);
            }
            this.f32639hv.setShader(bitmapShader);
            this.khx = false;
        }
        if (this.f32636bs) {
            if (this.jpb <= 0.0f) {
                canvas.drawOval(this.f32644tq, this.f32639hv);
                return;
            } else {
                canvas.drawOval(this.f32644tq, this.f32639hv);
                canvas.drawOval(this.f32641ok, this.f32642rs);
                return;
            }
        }
        if (!hww(this.wgt)) {
            canvas.drawRect(this.f32644tq, this.f32639hv);
            if (this.jpb > 0.0f) {
                canvas.drawRect(this.f32641ok, this.f32642rs);
                return;
            }
            return;
        }
        float f10 = this.weu;
        if (this.jpb <= 0.0f) {
            canvas.drawRoundRect(this.f32644tq, f10, f10, this.f32639hv);
            hww(canvas);
        } else {
            canvas.drawRoundRect(this.f32644tq, f10, f10, this.f32639hv);
            canvas.drawRoundRect(this.f32641ok, f10, f10, this.f32642rs);
            hww(canvas);
            tq(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f32639hv.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f32639hv.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.vgm;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f32638hu;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.mrs.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.hww.set(rect);
        hww();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.mrs.getColorForState(iArr, 0);
        if (this.f32642rs.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f32642rs.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f32639hv.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f32639hv.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f32639hv.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f32639hv.setFilterBitmap(z10);
        invalidateSelf();
    }

    public static Drawable hww(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof tq) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && fc.a.a(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), hww(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapTq = tq(drawable);
        return bitmapTq != null ? new tq(bitmapTq) : drawable;
    }

    private void tq(Canvas canvas) {
        float f10;
        float f11;
        if (tq(this.wgt) || this.weu == 0.0f) {
            return;
        }
        RectF rectF = this.f32644tq;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float fWidth = rectF.width() + f12;
        float fHeight = f13 + this.f32644tq.height();
        float f14 = this.weu;
        float f15 = this.jpb / 2.0f;
        if (this.wgt[0]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine(f12 - f15, f13, f12 + f14, f10, this.f32642rs);
            canvas.drawLine(f12, f10 - f15, f12, f10 + f14, this.f32642rs);
        }
        if (!this.wgt[1]) {
            float f16 = f10;
            canvas.drawLine((fWidth - f14) - f15, f16, fWidth, f10, this.f32642rs);
            canvas.drawLine(fWidth, f16 - f15, fWidth, f16 + f14, this.f32642rs);
            fWidth = fWidth;
        }
        if (this.wgt[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f14) - f15, fHeight, fWidth + f15, fHeight, this.f32642rs);
            float f17 = fWidth;
            canvas.drawLine(f17, fHeight - f14, fWidth, fHeight, this.f32642rs);
            f11 = fHeight;
        }
        if (this.wgt[3]) {
            return;
        }
        canvas.drawLine(f12 - f15, f11, f12 + f14, f11, this.f32642rs);
        canvas.drawLine(f12, f11 - f14, f12, f11, this.f32642rs);
    }

    private void hww() {
        float fWidth;
        float fHeight;
        int i10 = AnonymousClass1.hww[this.omn.ordinal()];
        if (i10 == 1) {
            this.f32641ok.set(this.hww);
            RectF rectF = this.f32641ok;
            float f10 = this.jpb;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.nod.reset();
            this.nod.setTranslate((int) (((this.f32641ok.width() - this.f32638hu) * 0.5f) + 0.5f), (int) (((this.f32641ok.height() - this.vgm) * 0.5f) + 0.5f));
        } else if (i10 == 2) {
            this.f32641ok.set(this.hww);
            RectF rectF2 = this.f32641ok;
            float f11 = this.jpb;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.nod.reset();
            float fWidth2 = 0.0f;
            if (this.f32638hu * this.f32641ok.height() > this.f32641ok.width() * this.vgm) {
                fWidth = this.f32641ok.height() / this.vgm;
                fHeight = 0.0f;
                fWidth2 = (this.f32641ok.width() - (this.f32638hu * fWidth)) * 0.5f;
            } else {
                fWidth = this.f32641ok.width() / this.f32638hu;
                fHeight = (this.f32641ok.height() - (this.vgm * fWidth)) * 0.5f;
            }
            this.nod.setScale(fWidth, fWidth);
            Matrix matrix = this.nod;
            float f12 = this.jpb;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f12 / 2.0f), ((int) (fHeight + 0.5f)) + (f12 / 2.0f));
        } else if (i10 == 3) {
            this.nod.reset();
            float fMin = (((float) this.f32638hu) > this.hww.width() || ((float) this.vgm) > this.hww.height()) ? Math.min(this.hww.width() / this.f32638hu, this.hww.height() / this.vgm) : 1.0f;
            float fWidth3 = (int) (((this.hww.width() - (this.f32638hu * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.hww.height() - (this.vgm * fMin)) * 0.5f) + 0.5f);
            this.nod.setScale(fMin, fMin);
            this.nod.postTranslate(fWidth3, fHeight2);
            this.f32641ok.set(this.f32643sd);
            this.nod.mapRect(this.f32641ok);
            RectF rectF3 = this.f32641ok;
            float f13 = this.jpb;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.nod.setRectToRect(this.f32643sd, this.f32641ok, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.f32641ok.set(this.f32643sd);
            this.nod.setRectToRect(this.f32643sd, this.hww, Matrix.ScaleToFit.END);
            this.nod.mapRect(this.f32641ok);
            RectF rectF4 = this.f32641ok;
            float f14 = this.jpb;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.nod.setRectToRect(this.f32643sd, this.f32641ok, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.f32641ok.set(this.f32643sd);
            this.nod.setRectToRect(this.f32643sd, this.hww, Matrix.ScaleToFit.START);
            this.nod.mapRect(this.f32641ok);
            RectF rectF5 = this.f32641ok;
            float f15 = this.jpb;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.nod.setRectToRect(this.f32643sd, this.f32641ok, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.f32641ok.set(this.f32643sd);
            this.nod.setRectToRect(this.f32643sd, this.hww, Matrix.ScaleToFit.CENTER);
            this.nod.mapRect(this.f32641ok);
            RectF rectF6 = this.f32641ok;
            float f16 = this.jpb;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.nod.setRectToRect(this.f32643sd, this.f32641ok, Matrix.ScaleToFit.FILL);
        } else {
            this.f32641ok.set(this.hww);
            RectF rectF7 = this.f32641ok;
            float f17 = this.jpb;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.nod.reset();
            this.nod.setRectToRect(this.f32643sd, this.f32641ok, Matrix.ScaleToFit.FILL);
        }
        this.f32644tq.set(this.f32641ok);
        this.khx = true;
    }

    public tq tq(Shader.TileMode tileMode) {
        if (this.f32637ed != tileMode) {
            this.f32637ed = tileMode;
            this.khx = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean tq(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private void hww(Canvas canvas) {
        if (tq(this.wgt) || this.weu == 0.0f) {
            return;
        }
        RectF rectF = this.f32644tq;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f32644tq.height() + f11;
        float f12 = this.weu;
        if (!this.wgt[0]) {
            this.vhb.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.vhb, this.f32639hv);
        }
        if (!this.wgt[1]) {
            this.vhb.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.vhb, this.f32639hv);
        }
        if (!this.wgt[2]) {
            this.vhb.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.vhb, this.f32639hv);
        }
        if (this.wgt[3]) {
            return;
        }
        this.vhb.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.vhb, this.f32639hv);
    }

    public tq hww(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.weu = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.weu = 0.0f;
            }
            boolean[] zArr = this.wgt;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public tq hww(float f10) {
        this.jpb = f10;
        this.f32642rs.setStrokeWidth(f10);
        return this;
    }

    public tq hww(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.mrs = colorStateList;
        this.f32642rs.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public tq hww(boolean z10) {
        this.f32636bs = z10;
        return this;
    }

    public tq hww(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.omn != scaleType) {
            this.omn = scaleType;
            hww();
        }
        return this;
    }

    public tq hww(Shader.TileMode tileMode) {
        if (this.f32640ny != tileMode) {
            this.f32640ny = tileMode;
            this.khx = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean hww(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
