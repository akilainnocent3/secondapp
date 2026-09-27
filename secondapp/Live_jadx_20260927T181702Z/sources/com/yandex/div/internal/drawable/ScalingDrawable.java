package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ms.u;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ScalingDrawable extends Drawable {
    private boolean isDirtyRect;

    @m
    private Bitmap originalBitmap;

    @m
    private Picture originalPicture;
    private float xTranslate;
    private float yTranslate;

    @l
    private ScaleType customScaleType = ScaleType.NO_SCALE;

    @l
    private AlignmentHorizontal alignmentHorizontal = AlignmentHorizontal.LEFT;

    @l
    private AlignmentVertical alignmentVertical = AlignmentVertical.TOP;

    @l
    private final Paint paint = new Paint(3);

    @l
    private Matrix thumbTransformMatrix = new Matrix();
    private float xScale = 1.0f;
    private float yScale = 1.0f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum AlignmentHorizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum AlignmentVertical {
        TOP,
        CENTER,
        BOTTOM
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum ScaleType {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.NO_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlignmentHorizontal.values().length];
            try {
                iArr2[AlignmentHorizontal.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlignmentHorizontal.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AlignmentVertical.values().length];
            try {
                iArr3[AlignmentVertical.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AlignmentVertical.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private final void reset() {
        this.isDirtyRect = true;
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    @Override // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas) {
        int width;
        int height;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        canvas.save();
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null) {
            width = bitmap.getWidth();
        } else {
            Picture picture = this.originalPicture;
            width = picture != null ? picture.getWidth() : 0;
        }
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 != null) {
            height = bitmap2.getHeight();
        } else {
            Picture picture2 = this.originalPicture;
            height = picture2 != null ? picture2.getHeight() : 0;
        }
        if (height <= 0 || width <= 0) {
            Bitmap bitmap3 = this.originalBitmap;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, this.thumbTransformMatrix, this.paint);
            }
            Picture picture3 = this.originalPicture;
            if (picture3 != null) {
                canvas.drawPicture(picture3);
            }
            canvas.restore();
            return;
        }
        if (this.isDirtyRect) {
            float fWidth = getBounds().width();
            float fHeight = getBounds().height();
            float f15 = width;
            this.xScale = fWidth / f15;
            float f16 = height;
            this.yScale = fHeight / f16;
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.customScaleType.ordinal()];
            if (i11 == 1) {
                float fT = u.t(this.xScale, this.yScale);
                this.xScale = fT;
                this.yScale = fT;
            } else if (i11 == 2) {
                float fA = u.A(this.xScale, this.yScale);
                this.xScale = fA;
                this.yScale = fA;
            } else if (i11 == 3) {
                this.xScale = 1.0f;
                this.yScale = 1.0f;
            }
            float f17 = f15 * this.xScale;
            float f18 = f16 * this.yScale;
            int i12 = WhenMappings.$EnumSwitchMapping$1[this.alignmentHorizontal.ordinal()];
            float f19 = 0.0f;
            if (i12 != 1) {
                if (i12 != 2) {
                    f12 = 0.0f;
                } else {
                    f10 = fWidth - f17;
                    f11 = this.xScale;
                }
                this.xTranslate = f12;
                i10 = WhenMappings.$EnumSwitchMapping$2[this.alignmentVertical.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        f13 = fHeight - f18;
                        f14 = this.yScale;
                    }
                    this.yTranslate = f19;
                    this.isDirtyRect = false;
                } else {
                    f13 = (fHeight - f18) / 2;
                    f14 = this.yScale;
                }
                f19 = f13 / f14;
                this.yTranslate = f19;
                this.isDirtyRect = false;
            } else {
                f10 = (fWidth - f17) / 2;
                f11 = this.xScale;
            }
            f12 = f10 / f11;
            this.xTranslate = f12;
            i10 = WhenMappings.$EnumSwitchMapping$2[this.alignmentVertical.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    f13 = fHeight - f18;
                    f14 = this.yScale;
                }
                this.yTranslate = f19;
                this.isDirtyRect = false;
            } else {
                f13 = (fHeight - f18) / 2;
                f14 = this.yScale;
            }
            f19 = f13 / f14;
            this.yTranslate = f19;
            this.isDirtyRect = false;
        }
        canvas.scale(this.xScale, this.yScale);
        canvas.translate(this.xTranslate, this.yTranslate);
        Bitmap bitmap4 = this.originalBitmap;
        if (bitmap4 != null) {
            canvas.drawBitmap(bitmap4, this.thumbTransformMatrix, this.paint);
        }
        Picture picture4 = this.originalPicture;
        if (picture4 != null) {
            canvas.drawPicture(picture4);
        }
        canvas.restore();
    }

    @l
    public final AlignmentHorizontal getAlignmentHorizontal() {
        return this.alignmentHorizontal;
    }

    @l
    public final AlignmentVertical getAlignmentVertical() {
        return this.alignmentVertical;
    }

    @l
    public final ScaleType getCustomScaleType() {
        return this.customScaleType;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@l Rect rect) {
        super.onBoundsChange(rect);
        reset();
    }

    public final void setAlignmentHorizontal(@l AlignmentHorizontal alignmentHorizontal) {
        this.alignmentHorizontal = alignmentHorizontal;
    }

    public final void setAlignmentVertical(@l AlignmentVertical alignmentVertical) {
        this.alignmentVertical = alignmentVertical;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    public final void setBitmap(@l Bitmap bitmap) {
        this.originalBitmap = bitmap;
        this.originalPicture = null;
        reset();
    }

    public final void setCustomScaleType(@l ScaleType scaleType) {
        this.customScaleType = scaleType;
    }

    public final void setPicture(@l Picture picture) {
        this.originalPicture = picture;
        this.originalBitmap = null;
        reset();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter) {
    }
}
