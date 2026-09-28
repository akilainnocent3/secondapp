package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.sportybet.android.gp.tz.R;
import defpackage.axh;
import defpackage.wk30;
import defpackage.zzc;
import java.util.Objects;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements axh {
    public int A;
    public int B;
    public float C;
    public String D;
    public boolean E;
    public final Rect F;
    public int G;
    public int H;
    public int I;
    public int J;
    public String K;
    public int L;
    public int M;
    public boolean N;
    public float O;
    public float P;
    public float Q;
    public Drawable R;
    public Matrix S;
    public Bitmap T;
    public BitmapShader U;
    public Matrix V;
    public float W;
    public final TextPaint a;
    public float a0;
    public Path b;
    public float b0;
    public int c;
    public float c0;
    public int d;
    public final Paint d0;
    public boolean e;
    public int e0;
    public float f;
    public Rect f0;
    public Paint g0;
    public float h0;
    public float i;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public ViewOutlineProvider v;
    public RectF w;
    public float y;
    public float z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            int width = motionLabel.getWidth();
            int height = motionLabel.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionLabel.f) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.i);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.e = false;
        this.f = 0.0f;
        this.i = Float.NaN;
        this.y = 48.0f;
        this.z = Float.NaN;
        this.C = 0.0f;
        this.D = "Hello World";
        this.E = true;
        this.F = new Rect();
        this.G = 1;
        this.H = 1;
        this.I = 1;
        this.J = 1;
        this.L = 8388659;
        this.M = 0;
        this.N = false;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.b0 = 0.0f;
        this.c0 = 0.0f;
        this.d0 = new Paint();
        this.e0 = 0;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        this.k0 = Float.NaN;
        this.l0 = Float.NaN;
        c(context, null);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.z) ? 1.0f : this.y / this.z;
        String str = this.D;
        return ((this.b0 + 1.0f) * ((((Float.isNaN(this.P) ? getMeasuredWidth() : this.P) - getPaddingLeft()) - getPaddingRight()) - (this.a.measureText(str, 0, str.length()) * f))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.z) ? 1.0f : this.y / this.z;
        Paint.FontMetrics fontMetrics = this.a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.Q) ? getMeasuredHeight() : this.Q) - getPaddingTop()) - getPaddingBottom();
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((1.0f - this.c0) * (measuredHeight - ((f2 - f3) * f))) / 2.0f) - (f * f3);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i = typedValue.data;
        this.c = i;
        this.a.setColor(i);
    }

    @Override // defpackage.axh
    public final void a(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.O = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.P = f5;
        float f6 = f4 - f2;
        this.Q = f6;
        if (this.V != null) {
            this.P = f5;
            this.Q = f6;
            d();
        }
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.N) {
            Rect rect = this.f0;
            TextPaint textPaint = this.a;
            if (rect == null) {
                this.g0 = new Paint();
                this.f0 = new Rect();
                this.g0.set(textPaint);
                this.h0 = this.g0.getTextSize();
            }
            this.P = f5;
            this.Q = f6;
            Paint paint = this.g0;
            String str = this.D;
            paint.getTextBounds(str, 0, str.length(), this.f0);
            int iWidth = this.f0.width();
            float fHeight = this.f0.height() * 1.3f;
            float f7 = (f5 - this.H) - this.G;
            float f8 = (f6 - this.J) - this.I;
            float f9 = iWidth;
            float f10 = f9 * f8;
            float f11 = fHeight * f7;
            float f12 = this.h0;
            if (f10 > f11) {
                textPaint.setTextSize((f12 * f7) / f9);
            } else {
                textPaint.setTextSize((f12 * f8) / fHeight);
            }
            if (this.e || !Float.isNaN(this.z)) {
                b(Float.isNaN(this.z) ? 1.0f : this.y / this.z);
            }
        }
    }

    public final void b(float f) {
        if (this.e || f != 1.0f) {
            this.b.reset();
            String str = this.D;
            int length = str.length();
            TextPaint textPaint = this.a;
            Rect rect = this.F;
            textPaint.getTextBounds(str, 0, length, rect);
            textPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.b);
            if (f != 1.0f) {
                Log.v("MotionLabel", zzc.a() + " scale " + f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.b.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.E = false;
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        Typeface typefaceCreate;
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wk30.u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 5) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == 7) {
                    this.K = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 11) {
                    this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.z);
                } else if (index == 0) {
                    this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.y);
                } else if (index == 2) {
                    this.A = typedArrayObtainStyledAttributes.getInt(index, this.A);
                } else if (index == 1) {
                    this.B = typedArrayObtainStyledAttributes.getInt(index, this.B);
                } else if (index == 3) {
                    this.c = typedArrayObtainStyledAttributes.getColor(index, this.c);
                } else if (index == 9) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    this.i = dimension;
                    setRound(dimension);
                } else if (index == 10) {
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    this.f = f;
                    setRoundPercent(f);
                } else if (index == 4) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == 8) {
                    this.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 17) {
                    this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
                    this.e = true;
                } else if (index == 18) {
                    this.C = typedArrayObtainStyledAttributes.getDimension(index, this.C);
                    this.e = true;
                } else if (index == 12) {
                    this.R = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.e = true;
                } else if (index == 13) {
                    this.i0 = typedArrayObtainStyledAttributes.getFloat(index, this.i0);
                } else if (index == 14) {
                    this.j0 = typedArrayObtainStyledAttributes.getFloat(index, this.j0);
                } else if (index == 19) {
                    this.b0 = typedArrayObtainStyledAttributes.getFloat(index, this.b0);
                } else if (index == 20) {
                    this.c0 = typedArrayObtainStyledAttributes.getFloat(index, this.c0);
                } else if (index == 15) {
                    this.l0 = typedArrayObtainStyledAttributes.getFloat(index, this.l0);
                } else if (index == 16) {
                    this.k0 = typedArrayObtainStyledAttributes.getFloat(index, this.k0);
                } else if (index == 23) {
                    this.W = typedArrayObtainStyledAttributes.getDimension(index, this.W);
                } else if (index == 24) {
                    this.a0 = typedArrayObtainStyledAttributes.getDimension(index, this.a0);
                } else if (index == 22) {
                    this.e0 = typedArrayObtainStyledAttributes.getInt(index, this.e0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.R != null) {
            this.V = new Matrix();
            int intrinsicWidth = this.R.getIntrinsicWidth();
            int intrinsicHeight = this.R.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.a0) ? 128 : (int) this.a0;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.W) ? 128 : (int) this.W;
            }
            if (this.e0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.T = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.T);
            this.R.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.R.setFilterBitmap(true);
            this.R.draw(canvas);
            if (this.e0 != 0) {
                Bitmap bitmap = this.T;
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i2 = 0; i2 < 4 && width >= 32 && height >= 32; i2++) {
                    width /= 2;
                    height /= 2;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                }
                this.T = bitmapCreateScaledBitmap;
            }
            Bitmap bitmap2 = this.T;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.U = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.G = getPaddingLeft();
        this.H = getPaddingRight();
        this.I = getPaddingTop();
        this.J = getPaddingBottom();
        String str = this.K;
        int i3 = this.B;
        int i4 = this.A;
        TextPaint textPaint = this.a;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i4);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
            }
            textPaint.setColor(this.c);
            textPaint.setStrokeWidth(this.C);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setFlags(128);
            setTextSize(this.y);
            textPaint.setAntiAlias(true);
        }
        typefaceCreate = null;
        if (i3 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i3 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i3 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i4 > 0) {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typefaceCreate, i4);
            setTypeface(typefaceDefaultFromStyle);
            int i5 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i4;
            textPaint.setFakeBoldText((i5 & 1) != 0);
            textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        }
        textPaint.setColor(this.c);
        textPaint.setStrokeWidth(this.C);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.y);
        textPaint.setAntiAlias(true);
    }

    public final void d() {
        float f = Float.isNaN(this.i0) ? 0.0f : this.i0;
        float f2 = Float.isNaN(this.j0) ? 0.0f : this.j0;
        float f3 = Float.isNaN(this.k0) ? 1.0f : this.k0;
        float f4 = Float.isNaN(this.l0) ? 0.0f : this.l0;
        this.V.reset();
        float width = this.T.getWidth();
        float height = this.T.getHeight();
        float f5 = Float.isNaN(this.a0) ? this.P : this.a0;
        float f6 = Float.isNaN(this.W) ? this.Q : this.W;
        float f7 = f3 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.V.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.W)) {
            f11 = this.W / 2.0f;
        }
        if (!Float.isNaN(this.a0)) {
            f9 = this.a0 / 2.0f;
        }
        this.V.postTranslate((((f * f9) + f5) - f8) * 0.5f, (((f2 * f11) + f6) - f10) * 0.5f);
        this.V.postRotate(f4, f5 / 2.0f, f6 / 2.0f);
        this.U.setLocalMatrix(this.V);
    }

    public float getRound() {
        return this.i;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getScaleFromTextSize() {
        return this.z;
    }

    public float getTextBackgroundPanX() {
        return this.i0;
    }

    public float getTextBackgroundPanY() {
        return this.j0;
    }

    public float getTextBackgroundRotate() {
        return this.l0;
    }

    public float getTextBackgroundZoom() {
        return this.k0;
    }

    public int getTextOutlineColor() {
        return this.d;
    }

    public float getTextPanX() {
        return this.b0;
    }

    public float getTextPanY() {
        return this.c0;
    }

    public float getTextureHeight() {
        return this.W;
    }

    public float getTextureWidth() {
        return this.a0;
    }

    public Typeface getTypeface() {
        return this.a.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.z);
        float f = zIsNaN ? 1.0f : this.y / this.z;
        this.P = i3 - i;
        this.Q = i4 - i2;
        if (this.N) {
            Rect rect = this.f0;
            TextPaint textPaint = this.a;
            if (rect == null) {
                this.g0 = new Paint();
                this.f0 = new Rect();
                this.g0.set(textPaint);
                this.h0 = this.g0.getTextSize();
            }
            Paint paint = this.g0;
            String str = this.D;
            paint.getTextBounds(str, 0, str.length(), this.f0);
            int iWidth = this.f0.width();
            int iHeight = (int) (this.f0.height() * 1.3f);
            float f2 = (this.P - this.H) - this.G;
            float f3 = (this.Q - this.J) - this.I;
            if (zIsNaN) {
                float f4 = iWidth;
                float f5 = f4 * f3;
                float f6 = iHeight;
                float f7 = f6 * f2;
                float f8 = this.h0;
                if (f5 > f7) {
                    textPaint.setTextSize((f8 * f2) / f4);
                } else {
                    textPaint.setTextSize((f8 * f3) / f6);
                }
            } else {
                float f9 = iWidth;
                float f10 = iHeight;
                f = f9 * f3 > f10 * f2 ? f2 / f9 : f3 / f10;
            }
        }
        if (this.e || !zIsNaN) {
            float f11 = i;
            float f12 = i2;
            float f13 = i3;
            float f14 = i4;
            if (this.V != null) {
                this.P = f13 - f11;
                this.Q = f14 - f12;
                d();
            }
            b(f);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.z) ? 1.0f : this.y / this.z;
        super.onDraw(canvas);
        boolean z = this.e;
        TextPaint textPaint = this.a;
        if (!z && f == 1.0f) {
            canvas.drawText(this.D, this.O + this.G + getHorizontalOffset(), this.I + getVerticalOffset(), textPaint);
            return;
        }
        if (this.E) {
            b(f);
        }
        if (this.S == null) {
            this.S = new Matrix();
        }
        if (!this.e) {
            float horizontalOffset = this.G + getHorizontalOffset();
            float verticalOffset = this.I + getVerticalOffset();
            this.S.reset();
            this.S.preTranslate(horizontalOffset, verticalOffset);
            this.b.transform(this.S);
            textPaint.setColor(this.c);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.C);
            canvas.drawPath(this.b, textPaint);
            this.S.reset();
            this.S.preTranslate(-horizontalOffset, -verticalOffset);
            this.b.transform(this.S);
            return;
        }
        Paint paint = this.d0;
        paint.set(textPaint);
        this.S.reset();
        float horizontalOffset2 = this.G + getHorizontalOffset();
        float verticalOffset2 = this.I + getVerticalOffset();
        this.S.postTranslate(horizontalOffset2, verticalOffset2);
        this.S.preScale(f, f);
        this.b.transform(this.S);
        if (this.U != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.U);
        } else {
            textPaint.setColor(this.c);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.C);
        canvas.drawPath(this.b, textPaint);
        if (this.U != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.d);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.C);
        canvas.drawPath(this.b, textPaint);
        this.S.reset();
        this.S.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.b.transform(this.S);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.N = false;
        this.G = getPaddingLeft();
        this.H = getPaddingRight();
        this.I = getPaddingTop();
        this.J = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            String str = this.D;
            int length = str.length();
            TextPaint textPaint = this.a;
            Rect rect = this.F;
            textPaint.getTextBounds(str, 0, length, rect);
            if (mode != 1073741824) {
                size = (int) (rect.width() + 0.99999f);
            }
            size += this.G + this.H;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (textPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.I + this.J + fontMetricsInt;
            }
        } else if (this.M != 0) {
            this.N = true;
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.L) {
            invalidate();
        }
        this.L = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.c0 = -1.0f;
        } else if (i2 != 80) {
            this.c0 = 0.0f;
        } else {
            this.c0 = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.b0 = 0.0f;
                        return;
                    }
                }
            }
            this.b0 = 1.0f;
            return;
        }
        this.b0 = -1.0f;
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
            if (this.b == null) {
                this.b = new Path();
            }
            if (this.w == null) {
                this.w = new RectF();
            }
            if (this.v == null) {
                b bVar = new b();
                this.v = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.w.set(0.0f, 0.0f, getWidth(), getHeight());
            this.b.reset();
            Path path = this.b;
            RectF rectF = this.w;
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
            if (this.b == null) {
                this.b = new Path();
            }
            if (this.w == null) {
                this.w = new RectF();
            }
            if (this.v == null) {
                a aVar = new a();
                this.v = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f) / 2.0f;
            this.w.set(0.0f, 0.0f, width, height);
            this.b.reset();
            this.b.addRoundRect(this.w, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.z = f;
    }

    public void setText(CharSequence charSequence) {
        this.D = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.i0 = f;
        d();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.j0 = f;
        d();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.l0 = f;
        d();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.k0 = f;
        d();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.d = i;
        this.e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.C = f;
        this.e = true;
        if (Float.isNaN(f)) {
            this.C = 1.0f;
            this.e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.b0 = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.c0 = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.y = f;
        if (!Float.isNaN(this.z)) {
            f = this.z;
        }
        this.a.setTextSize(f);
        b(Float.isNaN(this.z) ? 1.0f : this.y / this.z);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.W = f;
        d();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.a0 = f;
        d();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.a;
        if (Objects.equals(textPaint.getTypeface(), typeface)) {
            return;
        }
        textPaint.setTypeface(typeface);
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.e = false;
        this.f = 0.0f;
        this.i = Float.NaN;
        this.y = 48.0f;
        this.z = Float.NaN;
        this.C = 0.0f;
        this.D = "Hello World";
        this.E = true;
        this.F = new Rect();
        this.G = 1;
        this.H = 1;
        this.I = 1;
        this.J = 1;
        this.L = 8388659;
        this.M = 0;
        this.N = false;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.b0 = 0.0f;
        this.c0 = 0.0f;
        this.d0 = new Paint();
        this.e0 = 0;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        this.k0 = Float.NaN;
        this.l0 = Float.NaN;
        c(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.e = false;
        this.f = 0.0f;
        this.i = Float.NaN;
        this.y = 48.0f;
        this.z = Float.NaN;
        this.C = 0.0f;
        this.D = "Hello World";
        this.E = true;
        this.F = new Rect();
        this.G = 1;
        this.H = 1;
        this.I = 1;
        this.J = 1;
        this.L = 8388659;
        this.M = 0;
        this.N = false;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.b0 = 0.0f;
        this.c0 = 0.0f;
        this.d0 = new Paint();
        this.e0 = 0;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        this.k0 = Float.NaN;
        this.l0 = Float.NaN;
        c(context, attributeSet);
    }
}
