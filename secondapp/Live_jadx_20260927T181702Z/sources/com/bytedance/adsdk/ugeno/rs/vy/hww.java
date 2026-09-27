package com.bytedance.adsdk.ugeno.rs.vy;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.hww.ok;
import com.bytedance.adsdk.ugeno.hww.vgm;
import com.bytedance.adsdk.ugeno.vy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends ImageView implements IAnimation, vgm {

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    static final /* synthetic */ boolean f32622tq = true;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private ImageView.ScaleType f32623bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private boolean f32624ed;
    private ok hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private Drawable f32625hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final float[] f32626hv;
    private Shader.TileMode jpb;
    private boolean khx;
    private Shader.TileMode mrs;
    private boolean nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private boolean f32627ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f32628ok;
    private vy omn;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private ColorFilter f32629rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f32630sd;
    private ColorStateList vgm;
    private Drawable vhb;
    private int weu;
    private int wgt;
    public static final Shader.TileMode hww = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] vy = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.rs.vy.hww$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hww;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            hww = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hww[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hww[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hww[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hww[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hww[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                hww[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public hww(Context context) {
        super(context);
        this.f32626hv = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.vgm = ColorStateList.valueOf(-16777216);
        this.f32628ok = 0.0f;
        this.f32629rs = null;
        this.nod = false;
        this.f32627ny = false;
        this.f32624ed = false;
        this.khx = false;
        Shader.TileMode tileMode = hww;
        this.jpb = tileMode;
        this.mrs = tileMode;
        this.hnv = new ok(this);
    }

    private Drawable hww() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.weu;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.weu, e10);
                this.weu = 0;
            }
        }
        return tq.hww(drawable);
    }

    private void sd() {
        hww(this.vhb, this.f32623bs);
    }

    private Drawable tq() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.wgt;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.wgt, e10);
                this.wgt = 0;
            }
        }
        return tq.hww(drawable);
    }

    private void vy() {
        Drawable drawable = this.vhb;
        if (drawable == null || !this.nod) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.vhb = drawableMutate;
        if (this.f32627ny) {
            drawableMutate.setColorFilter(this.f32629rs);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vy vyVar = this.omn;
        if (vyVar != null) {
            vyVar.tq(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.vgm.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.vgm;
    }

    public float getBorderRadius() {
        return this.hnv.hww();
    }

    public float getBorderWidth() {
        return this.f32628ok;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f10 : this.f32626hv) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.hww.vgm
    public float getRipple() {
        return this.f32630sd;
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getRubIn() {
        return this.hnv.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f32623bs;
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getShine() {
        return this.hnv.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getStretch() {
        return this.hnv.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.jpb;
    }

    public Shader.TileMode getTileModeY() {
        return this.mrs;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vy vyVar = this.omn;
        if (vyVar != null) {
            vyVar.vgm();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vy vyVar = this.omn;
        if (vyVar != null) {
            vyVar.ok();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        vy vyVar = this.omn;
        if (vyVar != null) {
            vyVar.hww(canvas, this);
            this.omn.hww(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.omn;
        if (vyVar != null) {
            vyVar.hww(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        vy vyVar = this.omn;
        if (vyVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrHww = vyVar.hww(i10, i11);
            super.onMeasure(iArrHww[0], iArrHww[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        vy vyVar = this.omn;
        if (vyVar != null) {
            vyVar.tq(i10, i11, i12, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.f32625hu = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f32625hu = drawable;
        hww(true);
        super.setBackgroundDrawable(this.f32625hu);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (this.wgt != i10) {
            this.wgt = i10;
            Drawable drawableTq = tq();
            this.f32625hu = drawableTq;
            setBackgroundDrawable(drawableTq);
        }
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        ok okVar = this.hnv;
        if (okVar != null) {
            okVar.hww(f10);
        }
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f32629rs != colorFilter) {
            this.f32629rs = colorFilter;
            this.f32627ny = true;
            this.nod = true;
            vy();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        hww(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) {
        float dimension = getResources().getDimension(i10);
        hww(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.weu = 0;
        this.vhb = tq.hww(bitmap);
        sd();
        super.setImageDrawable(this.vhb);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.weu = 0;
        this.vhb = tq.hww(drawable);
        sd();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.weu != i10) {
            this.weu = i10;
            this.vhb = hww();
            sd();
            super.setImageDrawable(this.vhb);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.f32624ed = z10;
        sd();
        hww(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.f32630sd = f10;
        ok okVar = this.hnv;
        if (okVar != null) {
            okVar.tq(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        ok okVar = this.hnv;
        if (okVar != null) {
            okVar.hv(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f32622tq && scaleType == null) {
            throw new AssertionError();
        }
        if (this.f32623bs != scaleType) {
            this.f32623bs = scaleType;
            int i10 = AnonymousClass1.hww[scaleType.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            sd();
            hww(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        ok okVar = this.hnv;
        if (okVar != null) {
            okVar.sd(f10);
        }
    }

    public void setStretch(float f10) {
        ok okVar = this.hnv;
        if (okVar != null) {
            okVar.vy(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.jpb == tileMode) {
            return;
        }
        this.jpb = tileMode;
        sd();
        hww(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.mrs == tileMode) {
            return;
        }
        this.mrs = tileMode;
        sd();
        hww(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.vgm.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.vgm = colorStateList;
        sd();
        hww(false);
        if (this.f32628ok > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.f32628ok == f10) {
            return;
        }
        this.f32628ok = f10;
        sd();
        hww(false);
        invalidate();
    }

    private void hww(boolean z10) {
        if (this.khx) {
            if (z10) {
                this.f32625hu = tq.hww(this.f32625hu);
            }
            hww(this.f32625hu, ImageView.ScaleType.FIT_XY);
        }
    }

    private void hww(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof tq) {
            tq tqVar = (tq) drawable;
            tqVar.hww(scaleType).hww(this.f32628ok).hww(this.vgm).hww(this.f32624ed).hww(this.jpb).tq(this.mrs);
            float[] fArr = this.f32626hv;
            if (fArr != null) {
                tqVar.hww(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            vy();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                hww(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public void hww(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f32626hv;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        sd();
        hww(false);
        invalidate();
    }

    public void hww(vy vyVar) {
        this.omn = vyVar;
    }
}
