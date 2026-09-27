package x0;

import android.annotation.SuppressLint;
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
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.l;
import f2.f0;
import java.util.Objects;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e extends View implements w0.e {
    public static final String W = "MotionLabel";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f144040a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f144041b0 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f144042c0 = 3;
    public boolean A;
    public float B;
    public float C;
    public float D;
    public Drawable E;
    public Matrix F;
    public Bitmap G;
    public BitmapShader H;
    public Matrix I;
    public float J;
    public float K;
    public float L;
    public float M;
    public Paint N;
    public int O;
    public Rect P;
    public Paint Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextPaint f144043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Path f144044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f144046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f144047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f144048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f144049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewOutlineProvider f144050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f144051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f144052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f144053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f144054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f144055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f144056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f144057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f144058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rect f144059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f144060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f144061t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f144062u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f144063v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f144064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Layout f144065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f144066y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f144067z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = e.this.getWidth();
            int height = e.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * e.this.f144048g) / 2.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, e.this.getWidth(), e.this.getHeight(), e.this.f144049h);
        }
    }

    public e(Context context) {
        super(context);
        this.f144043b = new TextPaint();
        this.f144044c = new Path();
        this.f144045d = 65535;
        this.f144046e = 65535;
        this.f144047f = false;
        this.f144048g = 0.0f;
        this.f144049h = Float.NaN;
        this.f144052k = 48.0f;
        this.f144053l = Float.NaN;
        this.f144056o = 0.0f;
        this.f144057p = "Hello World";
        this.f144058q = true;
        this.f144059r = new Rect();
        this.f144060s = 1;
        this.f144061t = 1;
        this.f144062u = 1;
        this.f144063v = 1;
        this.f144066y = 8388659;
        this.f144067z = 0;
        this.A = false;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = new Paint();
        this.O = 0;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        g(context, null);
    }

    private float getHorizontalOffset() {
        float f10 = Float.isNaN(this.f144053l) ? 1.0f : this.f144052k / this.f144053l;
        TextPaint textPaint = this.f144043b;
        String str = this.f144057p;
        return (((((Float.isNaN(this.C) ? getMeasuredWidth() : this.C) - getPaddingLeft()) - getPaddingRight()) - (f10 * textPaint.measureText(str, 0, str.length()))) * (this.L + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f10 = Float.isNaN(this.f144053l) ? 1.0f : this.f144052k / this.f144053l;
        Paint.FontMetrics fontMetrics = this.f144043b.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.D) ? getMeasuredHeight() : this.D) - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((measuredHeight - ((f11 - f12) * f10)) * (1.0f - this.M)) / 2.0f) - (f10 * f12);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(m.a.b.J0, typedValue, true);
        TextPaint textPaint = this.f144043b;
        int i10 = typedValue.data;
        this.f144045d = i10;
        textPaint.setColor(i10);
    }

    @Override // w0.e
    public void a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 + 0.5f);
        this.B = f10 - i10;
        int i11 = (int) (f12 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f13 + 0.5f);
        int i14 = (int) (0.5f + f11);
        int i15 = i13 - i14;
        float f14 = f12 - f10;
        this.C = f14;
        float f15 = f13 - f11;
        this.D = f15;
        d(f10, f11, f12, f13);
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.A) {
            if (this.P == null) {
                this.Q = new Paint();
                this.P = new Rect();
                this.Q.set(this.f144043b);
                this.R = this.Q.getTextSize();
            }
            this.C = f14;
            this.D = f15;
            Paint paint = this.Q;
            String str = this.f144057p;
            paint.getTextBounds(str, 0, str.length(), this.P);
            int iWidth = this.P.width();
            float fHeight = this.P.height() * 1.3f;
            float f16 = (f14 - this.f144061t) - this.f144060s;
            float f17 = (f15 - this.f144063v) - this.f144062u;
            float f18 = iWidth;
            if (f18 * f17 > fHeight * f16) {
                this.f144043b.setTextSize((this.R * f16) / f18);
            } else {
                this.f144043b.setTextSize((this.R * f17) / fHeight);
            }
            if (this.f144047f || !Float.isNaN(this.f144053l)) {
                f(Float.isNaN(this.f144053l) ? 1.0f : this.f144052k / this.f144053l);
            }
        }
    }

    public final void d(float f10, float f11, float f12, float f13) {
        if (this.I == null) {
            return;
        }
        this.C = f12 - f10;
        this.D = f13 - f11;
        k();
    }

    public Bitmap e(Bitmap bitmap, int i10) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i11 = 0; i11 < i10 && width >= 32 && height >= 32; i11++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    public void f(float f10) {
        if (this.f144047f || f10 != 1.0f) {
            this.f144044c.reset();
            String str = this.f144057p;
            int length = str.length();
            this.f144043b.getTextBounds(str, 0, length, this.f144059r);
            this.f144043b.getTextPath(str, 0, length, 0.0f, 0.0f, this.f144044c);
            if (f10 != 1.0f) {
                Log.v(W, w0.c.f() + " scale " + f10);
                Matrix matrix = new Matrix();
                matrix.postScale(f10, f10);
                this.f144044c.transform(matrix);
            }
            Rect rect = this.f144059r;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f144058q = false;
        }
    }

    public final void g(Context context, AttributeSet attributeSet) {
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.c.f8585gd);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == l.c.f8686md) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == l.c.f8720od) {
                    this.f144064w = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == l.c.f8788sd) {
                    this.f144053l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f144053l);
                } else if (index == l.c.f8602hd) {
                    this.f144052k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f144052k);
                } else if (index == l.c.f8635jd) {
                    this.f144054m = typedArrayObtainStyledAttributes.getInt(index, this.f144054m);
                } else if (index == l.c.f8619id) {
                    this.f144055n = typedArrayObtainStyledAttributes.getInt(index, this.f144055n);
                } else if (index == l.c.f8652kd) {
                    this.f144045d = typedArrayObtainStyledAttributes.getColor(index, this.f144045d);
                } else if (index == l.c.f8754qd) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f144049h);
                    this.f144049h = dimension;
                    setRound(dimension);
                } else if (index == l.c.f8771rd) {
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f144048g);
                    this.f144048g = f10;
                    setRoundPercent(f10);
                } else if (index == l.c.f8669ld) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == l.c.f8737pd) {
                    this.f144067z = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == l.c.f8890yd) {
                    this.f144046e = typedArrayObtainStyledAttributes.getInt(index, this.f144046e);
                    this.f144047f = true;
                } else if (index == l.c.f8907zd) {
                    this.f144056o = typedArrayObtainStyledAttributes.getDimension(index, this.f144056o);
                    this.f144047f = true;
                } else if (index == l.c.f8805td) {
                    this.E = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f144047f = true;
                } else if (index == l.c.f8822ud) {
                    this.S = typedArrayObtainStyledAttributes.getFloat(index, this.S);
                } else if (index == l.c.f8839vd) {
                    this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                } else if (index == l.c.Ad) {
                    this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                } else if (index == l.c.Bd) {
                    this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                } else if (index == l.c.f8856wd) {
                    this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                } else if (index == l.c.f8873xd) {
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                } else if (index == l.c.Ed) {
                    this.J = typedArrayObtainStyledAttributes.getDimension(index, this.J);
                } else if (index == l.c.Fd) {
                    this.K = typedArrayObtainStyledAttributes.getDimension(index, this.K);
                } else if (index == l.c.Dd) {
                    this.O = typedArrayObtainStyledAttributes.getInt(index, this.O);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        j();
        i();
    }

    public float getRound() {
        return this.f144049h;
    }

    public float getRoundPercent() {
        return this.f144048g;
    }

    public float getScaleFromTextSize() {
        return this.f144053l;
    }

    public float getTextBackgroundPanX() {
        return this.S;
    }

    public float getTextBackgroundPanY() {
        return this.T;
    }

    public float getTextBackgroundRotate() {
        return this.V;
    }

    public float getTextBackgroundZoom() {
        return this.U;
    }

    public int getTextOutlineColor() {
        return this.f144046e;
    }

    public float getTextPanX() {
        return this.L;
    }

    public float getTextPanY() {
        return this.M;
    }

    public float getTextureHeight() {
        return this.J;
    }

    public float getTextureWidth() {
        return this.K;
    }

    public Typeface getTypeface() {
        return this.f144043b.getTypeface();
    }

    public final void h(String str, int i10, int i11) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i11);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i10 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i10 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i10 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i11 <= 0) {
            this.f144043b.setFakeBoldText(false);
            this.f144043b.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typefaceCreate, i11);
            setTypeface(typefaceDefaultFromStyle);
            int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
            this.f144043b.setFakeBoldText((i12 & 1) != 0);
            this.f144043b.setTextSkewX((i12 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void i() {
        this.f144060s = getPaddingLeft();
        this.f144061t = getPaddingRight();
        this.f144062u = getPaddingTop();
        this.f144063v = getPaddingBottom();
        h(this.f144064w, this.f144055n, this.f144054m);
        this.f144043b.setColor(this.f144045d);
        this.f144043b.setStrokeWidth(this.f144056o);
        this.f144043b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f144043b.setFlags(128);
        setTextSize(this.f144052k);
        this.f144043b.setAntiAlias(true);
    }

    public final void j() {
        if (this.E != null) {
            this.I = new Matrix();
            int intrinsicWidth = this.E.getIntrinsicWidth();
            int intrinsicHeight = this.E.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.K) ? 128 : (int) this.K;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.J) ? 128 : (int) this.J;
            }
            if (this.O != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.G = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.G);
            this.E.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.E.setFilterBitmap(true);
            this.E.draw(canvas);
            if (this.O != 0) {
                this.G = e(this.G, 4);
            }
            Bitmap bitmap = this.G;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.H = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void k() {
        float f10 = Float.isNaN(this.S) ? 0.0f : this.S;
        float f11 = Float.isNaN(this.T) ? 0.0f : this.T;
        float f12 = Float.isNaN(this.U) ? 1.0f : this.U;
        float f13 = Float.isNaN(this.V) ? 0.0f : this.V;
        this.I.reset();
        float width = this.G.getWidth();
        float height = this.G.getHeight();
        float f14 = Float.isNaN(this.K) ? this.C : this.K;
        float f15 = Float.isNaN(this.J) ? this.D : this.J;
        float f16 = f12 * (width * f15 < height * f14 ? f14 / width : f15 / height);
        this.I.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f14 - f17;
        float f19 = f16 * height;
        float f20 = f15 - f19;
        if (!Float.isNaN(this.J)) {
            f20 = this.J / 2.0f;
        }
        if (!Float.isNaN(this.K)) {
            f18 = this.K / 2.0f;
        }
        this.I.postTranslate((((f10 * f18) + f14) - f17) * 0.5f, (((f11 * f20) + f15) - f19) * 0.5f);
        this.I.postRotate(f13, f14 / 2.0f, f15 / 2.0f);
        this.H.setLocalMatrix(this.I);
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        boolean zIsNaN = Float.isNaN(this.f144053l);
        float f10 = zIsNaN ? 1.0f : this.f144052k / this.f144053l;
        this.C = i12 - i10;
        this.D = i13 - i11;
        if (this.A) {
            if (this.P == null) {
                this.Q = new Paint();
                this.P = new Rect();
                this.Q.set(this.f144043b);
                this.R = this.Q.getTextSize();
            }
            Paint paint = this.Q;
            String str = this.f144057p;
            paint.getTextBounds(str, 0, str.length(), this.P);
            int iWidth = this.P.width();
            int iHeight = (int) (this.P.height() * 1.3f);
            float f11 = (this.C - this.f144061t) - this.f144060s;
            float f12 = (this.D - this.f144063v) - this.f144062u;
            if (zIsNaN) {
                float f13 = iWidth;
                float f14 = iHeight;
                if (f13 * f12 > f14 * f11) {
                    this.f144043b.setTextSize((this.R * f11) / f13);
                } else {
                    this.f144043b.setTextSize((this.R * f12) / f14);
                }
            } else {
                float f15 = iWidth;
                float f16 = iHeight;
                f10 = f15 * f12 > f16 * f11 ? f11 / f15 : f12 / f16;
            }
        }
        if (this.f144047f || !zIsNaN) {
            d(i10, i11, i12, i13);
            f(f10);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        float f10 = Float.isNaN(this.f144053l) ? 1.0f : this.f144052k / this.f144053l;
        super.onDraw(canvas);
        if (!this.f144047f && f10 == 1.0f) {
            canvas.drawText(this.f144057p, this.B + this.f144060s + getHorizontalOffset(), this.f144062u + getVerticalOffset(), this.f144043b);
            return;
        }
        if (this.f144058q) {
            f(f10);
        }
        if (this.F == null) {
            this.F = new Matrix();
        }
        if (!this.f144047f) {
            float horizontalOffset = this.f144060s + getHorizontalOffset();
            float verticalOffset = this.f144062u + getVerticalOffset();
            this.F.reset();
            this.F.preTranslate(horizontalOffset, verticalOffset);
            this.f144044c.transform(this.F);
            this.f144043b.setColor(this.f144045d);
            this.f144043b.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f144043b.setStrokeWidth(this.f144056o);
            canvas.drawPath(this.f144044c, this.f144043b);
            this.F.reset();
            this.F.preTranslate(-horizontalOffset, -verticalOffset);
            this.f144044c.transform(this.F);
            return;
        }
        this.N.set(this.f144043b);
        this.F.reset();
        float horizontalOffset2 = this.f144060s + getHorizontalOffset();
        float verticalOffset2 = this.f144062u + getVerticalOffset();
        this.F.postTranslate(horizontalOffset2, verticalOffset2);
        this.F.preScale(f10, f10);
        this.f144044c.transform(this.F);
        if (this.H != null) {
            this.f144043b.setFilterBitmap(true);
            this.f144043b.setShader(this.H);
        } else {
            this.f144043b.setColor(this.f144045d);
        }
        this.f144043b.setStyle(Paint.Style.FILL);
        this.f144043b.setStrokeWidth(this.f144056o);
        canvas.drawPath(this.f144044c, this.f144043b);
        if (this.H != null) {
            this.f144043b.setShader(null);
        }
        this.f144043b.setColor(this.f144046e);
        this.f144043b.setStyle(Paint.Style.STROKE);
        this.f144043b.setStrokeWidth(this.f144056o);
        canvas.drawPath(this.f144044c, this.f144043b);
        this.F.reset();
        this.F.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f144044c.transform(this.F);
        this.f144043b.set(this.N);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.A = false;
        this.f144060s = getPaddingLeft();
        this.f144061t = getPaddingRight();
        this.f144062u = getPaddingTop();
        this.f144063v = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f144043b;
            String str = this.f144057p;
            textPaint.getTextBounds(str, 0, str.length(), this.f144059r);
            if (mode != 1073741824) {
                size = (int) (this.f144059r.width() + 0.99999f);
            }
            size += this.f144060s + this.f144061t;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f144043b.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f144062u + this.f144063v + fontMetricsInt;
            }
        } else if (this.f144067z != 0) {
            this.A = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i10) {
        if ((i10 & f0.f82337d) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        if (i10 != this.f144066y) {
            invalidate();
        }
        this.f144066y = i10;
        int i11 = i10 & 112;
        if (i11 == 48) {
            this.M = -1.0f;
        } else if (i11 != 80) {
            this.M = 0.0f;
        } else {
            this.M = 1.0f;
        }
        int i12 = i10 & f0.f82337d;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.L = 0.0f;
                        return;
                    }
                }
            }
            this.L = 1.0f;
            return;
        }
        this.L = -1.0f;
    }

    @t0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f144049h = f10;
            float f11 = this.f144048g;
            this.f144048g = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f144049h != f10;
        this.f144049h = f10;
        if (f10 != 0.0f) {
            if (this.f144044c == null) {
                this.f144044c = new Path();
            }
            if (this.f144051j == null) {
                this.f144051j = new RectF();
            }
            if (this.f144050i == null) {
                b bVar = new b();
                this.f144050i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f144051j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f144044c.reset();
            Path path = this.f144044c;
            RectF rectF = this.f144051j;
            float f12 = this.f144049h;
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
        boolean z10 = this.f144048g != f10;
        this.f144048g = f10;
        if (f10 != 0.0f) {
            if (this.f144044c == null) {
                this.f144044c = new Path();
            }
            if (this.f144051j == null) {
                this.f144051j = new RectF();
            }
            if (this.f144050i == null) {
                a aVar = new a();
                this.f144050i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f144048g) / 2.0f;
            this.f144051j.set(0.0f, 0.0f, width, height);
            this.f144044c.reset();
            this.f144044c.addRoundRect(this.f144051j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f10) {
        this.f144053l = f10;
    }

    public void setText(CharSequence charSequence) {
        this.f144057p = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f10) {
        this.S = f10;
        k();
        invalidate();
    }

    public void setTextBackgroundPanY(float f10) {
        this.T = f10;
        k();
        invalidate();
    }

    public void setTextBackgroundRotate(float f10) {
        this.V = f10;
        k();
        invalidate();
    }

    public void setTextBackgroundZoom(float f10) {
        this.U = f10;
        k();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.f144045d = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f144046e = i10;
        this.f144047f = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f10) {
        this.f144056o = f10;
        this.f144047f = true;
        if (Float.isNaN(f10)) {
            this.f144056o = 1.0f;
            this.f144047f = false;
        }
        invalidate();
    }

    public void setTextPanX(float f10) {
        this.L = f10;
        invalidate();
    }

    public void setTextPanY(float f10) {
        this.M = f10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f144052k = f10;
        TextPaint textPaint = this.f144043b;
        if (!Float.isNaN(this.f144053l)) {
            f10 = this.f144053l;
        }
        textPaint.setTextSize(f10);
        f(Float.isNaN(this.f144053l) ? 1.0f : this.f144052k / this.f144053l);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f10) {
        this.J = f10;
        k();
        invalidate();
    }

    public void setTextureWidth(float f10) {
        this.K = f10;
        k();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (Objects.equals(this.f144043b.getTypeface(), typeface)) {
            return;
        }
        this.f144043b.setTypeface(typeface);
        if (this.f144065x != null) {
            this.f144065x = null;
            requestLayout();
            invalidate();
        }
    }

    public e(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144043b = new TextPaint();
        this.f144044c = new Path();
        this.f144045d = 65535;
        this.f144046e = 65535;
        this.f144047f = false;
        this.f144048g = 0.0f;
        this.f144049h = Float.NaN;
        this.f144052k = 48.0f;
        this.f144053l = Float.NaN;
        this.f144056o = 0.0f;
        this.f144057p = "Hello World";
        this.f144058q = true;
        this.f144059r = new Rect();
        this.f144060s = 1;
        this.f144061t = 1;
        this.f144062u = 1;
        this.f144063v = 1;
        this.f144066y = 8388659;
        this.f144067z = 0;
        this.A = false;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = new Paint();
        this.O = 0;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        g(context, attributeSet);
    }

    public e(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f144043b = new TextPaint();
        this.f144044c = new Path();
        this.f144045d = 65535;
        this.f144046e = 65535;
        this.f144047f = false;
        this.f144048g = 0.0f;
        this.f144049h = Float.NaN;
        this.f144052k = 48.0f;
        this.f144053l = Float.NaN;
        this.f144056o = 0.0f;
        this.f144057p = "Hello World";
        this.f144058q = true;
        this.f144059r = new Rect();
        this.f144060s = 1;
        this.f144061t = 1;
        this.f144062u = 1;
        this.f144063v = 1;
        this.f144066y = 8388659;
        this.f144067z = 0;
        this.A = false;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = new Paint();
        this.O = 0;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        g(context, attributeSet);
    }
}
