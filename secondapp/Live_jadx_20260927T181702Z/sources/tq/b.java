package tq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import k.k;
import k.m;
import k.t0;
import k.u;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class b extends ImageView {
    public static final int A = 0;
    public static final boolean B = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ImageView.ScaleType f137141v = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Bitmap.Config f137142w = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f137143x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f137144y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f137145z = -16777216;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f137146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f137147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f137148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f137149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f137150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f137151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f137152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f137153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f137154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f137155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BitmapShader f137156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f137157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f137158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f137159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f137160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ColorFilter f137161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f137162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f137163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f137164t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f137165u;

    /* JADX INFO: renamed from: tq.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(api = 21)
    public class C1410b extends ViewOutlineProvider {
        public C1410b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (b.this.f137165u) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            b.this.f137147c.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public b(Context context) {
        super(context);
        this.f137146b = new RectF();
        this.f137147c = new RectF();
        this.f137148d = new Matrix();
        this.f137149e = new Paint();
        this.f137150f = new Paint();
        this.f137151g = new Paint();
        this.f137152h = -16777216;
        this.f137153i = 0;
        this.f137154j = 0;
        g();
    }

    public final void c() {
        Paint paint = this.f137149e;
        if (paint != null) {
            paint.setColorFilter(this.f137161q);
        }
    }

    public final RectF d() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingLeft = getPaddingLeft() + ((width - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - iMin) / 2.0f);
        float f10 = iMin;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f10, f10 + paddingTop);
    }

    public final Bitmap e(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f137142w) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f137142w);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final boolean f(float f10, float f11) {
        return this.f137147c.isEmpty() || Math.pow((double) (f10 - this.f137147c.centerX()), 2.0d) + Math.pow((double) (f11 - this.f137147c.centerY()), 2.0d) <= Math.pow((double) this.f137160p, 2.0d);
    }

    public final void g() {
        super.setScaleType(f137141v);
        this.f137162r = true;
        setOutlineProvider(new C1410b());
        if (this.f137163s) {
            k();
            this.f137163s = false;
        }
    }

    public int getBorderColor() {
        return this.f137152h;
    }

    public int getBorderWidth() {
        return this.f137153i;
    }

    public int getCircleBackgroundColor() {
        return this.f137154j;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f137161q;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f137141v;
    }

    public final void h() {
        if (this.f137165u) {
            this.f137155k = null;
        } else {
            this.f137155k = e(getDrawable());
        }
        k();
    }

    public boolean i() {
        return this.f137164t;
    }

    public boolean j() {
        return this.f137165u;
    }

    public final void k() {
        int i10;
        if (!this.f137162r) {
            this.f137163s = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.f137155k == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.f137155k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f137156l = new BitmapShader(bitmap, tileMode, tileMode);
        this.f137149e.setAntiAlias(true);
        this.f137149e.setDither(true);
        this.f137149e.setFilterBitmap(true);
        this.f137149e.setShader(this.f137156l);
        this.f137150f.setStyle(Paint.Style.STROKE);
        this.f137150f.setAntiAlias(true);
        this.f137150f.setColor(this.f137152h);
        this.f137150f.setStrokeWidth(this.f137153i);
        this.f137151g.setStyle(Paint.Style.FILL);
        this.f137151g.setAntiAlias(true);
        this.f137151g.setColor(this.f137154j);
        this.f137158n = this.f137155k.getHeight();
        this.f137157m = this.f137155k.getWidth();
        this.f137147c.set(d());
        this.f137160p = Math.min((this.f137147c.height() - this.f137153i) / 2.0f, (this.f137147c.width() - this.f137153i) / 2.0f);
        this.f137146b.set(this.f137147c);
        if (!this.f137164t && (i10 = this.f137153i) > 0) {
            this.f137146b.inset(i10 - 1.0f, i10 - 1.0f);
        }
        this.f137159o = Math.min(this.f137146b.height() / 2.0f, this.f137146b.width() / 2.0f);
        c();
        l();
        invalidate();
    }

    public final void l() {
        float fWidth;
        float fHeight;
        this.f137148d.set(null);
        float fWidth2 = 0.0f;
        if (this.f137157m * this.f137146b.height() > this.f137146b.width() * this.f137158n) {
            fWidth = this.f137146b.height() / this.f137158n;
            fHeight = 0.0f;
            fWidth2 = (this.f137146b.width() - (this.f137157m * fWidth)) * 0.5f;
        } else {
            fWidth = this.f137146b.width() / this.f137157m;
            fHeight = (this.f137146b.height() - (this.f137158n * fWidth)) * 0.5f;
        }
        this.f137148d.setScale(fWidth, fWidth);
        Matrix matrix = this.f137148d;
        RectF rectF = this.f137146b;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        this.f137156l.setLocalMatrix(this.f137148d);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f137165u) {
            super.onDraw(canvas);
            return;
        }
        if (this.f137155k == null) {
            return;
        }
        if (this.f137154j != 0) {
            canvas.drawCircle(this.f137146b.centerX(), this.f137146b.centerY(), this.f137159o, this.f137151g);
        }
        canvas.drawCircle(this.f137146b.centerX(), this.f137146b.centerY(), this.f137159o, this.f137149e);
        if (this.f137153i > 0) {
            canvas.drawCircle(this.f137147c.centerX(), this.f137147c.centerY(), this.f137160p, this.f137150f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f137165u) {
            return super.onTouchEvent(motionEvent);
        }
        return f(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@k int i10) {
        if (i10 == this.f137152h) {
            return;
        }
        this.f137152h = i10;
        this.f137150f.setColor(i10);
        invalidate();
    }

    public void setBorderOverlay(boolean z10) {
        if (z10 == this.f137164t) {
            return;
        }
        this.f137164t = z10;
        k();
    }

    public void setBorderWidth(int i10) {
        if (i10 == this.f137153i) {
            return;
        }
        this.f137153i = i10;
        k();
    }

    public void setCircleBackgroundColor(@k int i10) {
        if (i10 == this.f137154j) {
            return;
        }
        this.f137154j = i10;
        this.f137151g.setColor(i10);
        invalidate();
    }

    public void setCircleBackgroundColorResource(@m int i10) {
        setCircleBackgroundColor(getContext().getResources().getColor(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f137161q) {
            return;
        }
        this.f137161q = colorFilter;
        c();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z10) {
        if (this.f137165u == z10) {
            return;
        }
        this.f137165u = z10;
        h();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageResource(@u int i10) {
        super.setImageResource(i10);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        k();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f137141v) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f137146b = new RectF();
        this.f137147c = new RectF();
        this.f137148d = new Matrix();
        this.f137149e = new Paint();
        this.f137150f = new Paint();
        this.f137151g = new Paint();
        this.f137152h = -16777216;
        this.f137153i = 0;
        this.f137154j = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f137171a, i10, 0);
        this.f137153i = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.b.f137174d, 0);
        this.f137152h = typedArrayObtainStyledAttributes.getColor(c.b.f137172b, -16777216);
        this.f137164t = typedArrayObtainStyledAttributes.getBoolean(c.b.f137173c, false);
        this.f137154j = typedArrayObtainStyledAttributes.getColor(c.b.f137175e, 0);
        typedArrayObtainStyledAttributes.recycle();
        g();
    }
}
