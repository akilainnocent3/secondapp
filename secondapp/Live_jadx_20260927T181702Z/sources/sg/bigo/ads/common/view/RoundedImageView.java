package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import k.k;

/* JADX INFO: loaded from: classes7.dex */
public class RoundedImageView extends ImageView implements sg.bigo.ads.common.view.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f133543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f133544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f133545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f133546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f133547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f133548f;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    private void a() {
        if (getOutlineProvider() instanceof sg.bigo.ads.common.view.b.b) {
            return;
        }
        super.setOutlineProvider(new sg.bigo.ads.common.view.b.b());
    }

    private RectF getImageRectF() {
        float fMin;
        float fMin2;
        float fMax;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Drawable drawable = getDrawable();
        float f10 = 0.0f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float[] fArr = new float[9];
            Matrix imageMatrix = getImageMatrix();
            if (imageMatrix != null && !imageMatrix.isIdentity()) {
                imageMatrix.getValues(fArr);
            }
            float f11 = fArr[2];
            float f12 = fArr[5];
            float f13 = fArr[0];
            float f14 = fArr[4];
            float fMax2 = Float.isNaN(f11) ? 0.0f : Math.max(0.0f, f11);
            fMax = Float.isNaN(f12) ? 0.0f : Math.max(0.0f, f12);
            fMin = Math.min(((Float.isNaN(f13) || f13 <= 0.0f) ? intrinsicWidth : intrinsicWidth * f13) + fMax2, measuredWidth);
            fMin2 = Math.min(((Float.isNaN(f14) || f14 <= 0.0f) ? intrinsicHeight : intrinsicHeight * f14) + fMax, measuredHeight);
            f10 = fMax2;
        } else {
            fMin = measuredWidth;
            fMin2 = measuredHeight;
            fMax = 0.0f;
        }
        return new RectF(f10, fMax, fMin, fMin2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Path clipPath = getClipPath();
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        super.draw(canvas);
        RectF imageRectF = getImageRectF();
        if (this.f133547e > 0.0f && !imageRectF.isEmpty()) {
            Paint paint = new Paint();
            paint.setColor(this.f133548f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f133547e);
            paint.setAntiAlias(true);
            float f10 = this.f133543a;
            canvas.drawRoundRect(imageRectF, f10, f10, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // sg.bigo.ads.common.view.b.a
    public Path getClipPath() {
        RectF imageRectF = getImageRectF();
        if (Float.isNaN(this.f133543a) || Float.isNaN(this.f133544b) || Float.isNaN(this.f133546d) || Float.isNaN(this.f133545c) || imageRectF == null || imageRectF.isEmpty()) {
            return null;
        }
        Path path = new Path();
        float[] fArr = new float[8];
        float f10 = Float.isNaN(this.f133543a) ? 0.0f : this.f133543a;
        fArr[0] = f10;
        fArr[1] = f10;
        float f11 = Float.isNaN(this.f133544b) ? 0.0f : this.f133544b;
        fArr[2] = f11;
        fArr[3] = f11;
        float f12 = Float.isNaN(this.f133546d) ? 0.0f : this.f133546d;
        fArr[4] = f12;
        fArr[5] = f12;
        float f13 = Float.isNaN(this.f133545c) ? 0.0f : this.f133545c;
        fArr[6] = f13;
        fArr[7] = f13;
        path.addRoundRect(imageRectF, fArr, Path.Direction.CW);
        return path;
    }

    public void setCornerRadius(float f10) {
        a(f10, f10, f10, f10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        a();
    }

    public void setStrokeColor(@k int i10) {
        this.f133548f = i10;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f133547e = f10;
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        a();
    }

    public RoundedImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.f133543a = f10;
        this.f133544b = f11;
        this.f133545c = f12;
        this.f133546d = f13;
        invalidate();
    }

    public RoundedImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f133543a = Float.NaN;
        this.f133544b = Float.NaN;
        this.f133545c = Float.NaN;
        this.f133546d = Float.NaN;
        this.f133548f = -1;
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
    }
}
