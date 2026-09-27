package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.k;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class RoundedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f133531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f133532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f133533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f133534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f133535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f133536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f133537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f133538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f133539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f133540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f133541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f133542l;

    public RoundedFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        if (this.f133540j > 0.0f) {
            setLayerType(1, null);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.f133541k = paint;
            paint.setShadowLayer(this.f133540j, 0.0f, 0.0f, this.f133539i);
        }
    }

    private Path getPath() {
        Path path = new Path();
        float f10 = this.f133531a;
        float f11 = this.f133532b;
        float f12 = this.f133534d;
        float f13 = this.f133533c;
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        RectF rectF = this.f133542l;
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f133541k != null) {
            float f10 = this.f133540j;
            RectF rectF = new RectF(f10, f10, getWidth() - this.f133540j, getHeight() - this.f133540j);
            this.f133542l = rectF;
            float f11 = this.f133531a;
            canvas.drawRoundRect(rectF, f11, f11, this.f133541k);
        }
        canvas.clipPath(getPath());
        super.dispatchDraw(canvas);
        Paint paint = this.f133537g;
        float f12 = this.f133535e;
        RectF rectF2 = this.f133538h;
        if (paint != null && rectF2 != null && f12 > 0.0f) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                paint.setColor(this.f133536f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f12);
                paint.setAntiAlias(true);
                rectF2.set(0.0f, 0.0f, width, height);
                float f13 = this.f133531a;
                canvas.drawRoundRect(rectF2, f13, f13, paint);
            }
        }
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadiusBottomLeft() {
        return this.f133533c;
    }

    public float getCornerRadiusBottomRight() {
        return this.f133534d;
    }

    public float getCornerRadiusTopLeft() {
        return this.f133531a;
    }

    public float getCornerRadiusTopRight() {
        return this.f133532b;
    }

    public void setCornerRadius(float f10) {
        a(f10, f10, f10, f10);
    }

    public void setShadowColor(@k int i10) {
        this.f133539i = i10;
        invalidate();
    }

    public void setShadowRadius(float f10) {
        boolean z10 = this.f133541k == null;
        this.f133540j = f10;
        if (z10) {
            a();
        }
        invalidate();
    }

    public void setStrokeColor(@k int i10) {
        this.f133536f = i10;
        if (this.f133537g == null) {
            this.f133537g = new Paint();
        }
        if (this.f133538h == null) {
            this.f133538h = new RectF();
        }
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f133535e = f10;
        if (this.f133537g == null) {
            this.f133537g = new Paint();
        }
        if (this.f133538h == null) {
            this.f133538h = new RectF();
        }
        invalidate();
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.f133531a = f10;
        this.f133532b = f11;
        this.f133533c = f12;
        this.f133534d = f13;
        invalidate();
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f133536f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedFrameLayout);
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_radius, 0.0f);
            this.f133531a = dimension;
            this.f133532b = dimension;
            this.f133533c = dimension;
            this.f133534d = dimension;
            if (dimension == 0.0f) {
                this.f133531a = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topLeftRadius, 0.0f);
                this.f133532b = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topRightRadius, 0.0f);
                this.f133533c = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomLeftRadius, 0.0f);
                this.f133534d = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomRightRadius, 0.0f);
            }
            this.f133539i = typedArrayObtainStyledAttributes.getColor(R.styleable.RoundedFrameLayout_bigo_ad_shadowColor, Color.parseColor("#00FFFFFF"));
            this.f133540j = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_shadowRadius, -1.0f);
            a();
        } catch (Exception unused) {
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
