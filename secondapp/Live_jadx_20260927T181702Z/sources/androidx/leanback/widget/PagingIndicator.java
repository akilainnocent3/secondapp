package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class PagingIndicator extends View {
    public static final long B = 167;
    public static final long C = 417;
    public static final long D = 417;
    public static final TimeInterpolator E = new DecelerateInterpolator();
    public static final Property<d, Float> F = new a(Float.class, "alpha");
    public static final Property<d, Float> G = new b(Float.class, "diameter");
    public static final Property<d, Float> H = new c(Float.class, "translation_x");
    public final float A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d[] f12114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f12115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f12116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f12117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12118n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @k.k
    public int f12122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f12123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f12124t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AnimatorSet f12125u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AnimatorSet f12126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AnimatorSet f12127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bitmap f12128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Paint f12129y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f12130z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Property<d, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.d());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.i(f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends Property<d, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.e());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.j(f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends Property<d, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.f());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.k(f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final float f12131k = -1.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final float f12132l = 1.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final float f12133m = 1.0f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final float f12134n = -1.0f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f12135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @k.k
        public int f12136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f12137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f12138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f12139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f12140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f12141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f12142h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f12143i;

        public d() {
            this.f12143i = PagingIndicator.this.f12106b ? 1.0f : -1.0f;
        }

        public void a() {
            this.f12136b = Color.argb(Math.round(this.f12135a * 255.0f), Color.red(PagingIndicator.this.f12122r), Color.green(PagingIndicator.this.f12122r), Color.blue(PagingIndicator.this.f12122r));
        }

        public void b() {
            this.f12137c = 0.0f;
            this.f12138d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f12139e = pagingIndicator.f12107c;
            float f10 = pagingIndicator.f12108d;
            this.f12140f = f10;
            this.f12141g = f10 * pagingIndicator.A;
            this.f12135a = 0.0f;
            a();
        }

        public void c(Canvas canvas) {
            float f10 = this.f12138d + this.f12137c;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            canvas.drawCircle(f10, pagingIndicator.f12118n, this.f12140f, pagingIndicator.f12123s);
            if (this.f12135a > 0.0f) {
                PagingIndicator.this.f12124t.setColor(this.f12136b);
                PagingIndicator pagingIndicator2 = PagingIndicator.this;
                canvas.drawCircle(f10, pagingIndicator2.f12118n, this.f12140f, pagingIndicator2.f12124t);
                PagingIndicator pagingIndicator3 = PagingIndicator.this;
                Bitmap bitmap = pagingIndicator3.f12128x;
                Rect rect = pagingIndicator3.f12130z;
                float f11 = this.f12141g;
                int i10 = PagingIndicator.this.f12118n;
                canvas.drawBitmap(bitmap, rect, new Rect((int) (f10 - f11), (int) (i10 - f11), (int) (f10 + f11), (int) (i10 + f11)), PagingIndicator.this.f12129y);
            }
        }

        public float d() {
            return this.f12135a;
        }

        public float e() {
            return this.f12139e;
        }

        public float f() {
            return this.f12137c;
        }

        public void g() {
            this.f12143i = PagingIndicator.this.f12106b ? 1.0f : -1.0f;
        }

        public void h() {
            this.f12137c = 0.0f;
            this.f12138d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f12139e = pagingIndicator.f12110f;
            float f10 = pagingIndicator.f12111g;
            this.f12140f = f10;
            this.f12141g = f10 * pagingIndicator.A;
            this.f12135a = 1.0f;
            a();
        }

        public void i(float f10) {
            this.f12135a = f10;
            a();
            PagingIndicator.this.invalidate();
        }

        public void j(float f10) {
            this.f12139e = f10;
            float f11 = f10 / 2.0f;
            this.f12140f = f11;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f12141g = f11 * pagingIndicator.A;
            pagingIndicator.invalidate();
        }

        public void k(float f10) {
            this.f12137c = f10 * this.f12142h * this.f12143i;
            PagingIndicator.this.invalidate();
        }
    }

    public PagingIndicator(Context context) {
        this(context, null, 0);
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f12110f + getPaddingBottom() + this.f12113i;
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        return (this.f12108d * 2) + (this.f12112h * 2) + ((this.f12119o - 3) * this.f12109e);
    }

    private void setSelectedPage(int i10) {
        if (i10 == this.f12120p) {
            return;
        }
        this.f12120p = i10;
        a();
    }

    public final void a() {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = this.f12120p;
            float f10 = -1.0f;
            if (i11 >= i10) {
                break;
            }
            this.f12114j[i11].b();
            d dVar = this.f12114j[i11];
            if (i11 != this.f12121q) {
                f10 = 1.0f;
            }
            dVar.f12142h = f10;
            dVar.f12138d = this.f12116l[i11];
            i11++;
        }
        this.f12114j[i10].h();
        d[] dVarArr = this.f12114j;
        int i12 = this.f12120p;
        d dVar2 = dVarArr[i12];
        dVar2.f12142h = this.f12121q >= i12 ? 1.0f : -1.0f;
        dVar2.f12138d = this.f12115k[i12];
        while (true) {
            i12++;
            if (i12 >= this.f12119o) {
                return;
            }
            this.f12114j[i12].b();
            d dVar3 = this.f12114j[i12];
            dVar3.f12142h = 1.0f;
            dVar3.f12138d = this.f12117m[i12];
        }
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i10 = (paddingLeft + width) / 2;
        int i11 = this.f12119o;
        int[] iArr = new int[i11];
        this.f12115k = iArr;
        int[] iArr2 = new int[i11];
        this.f12116l = iArr2;
        int[] iArr3 = new int[i11];
        this.f12117m = iArr3;
        int i12 = 1;
        if (this.f12106b) {
            int i13 = i10 - (requiredWidth / 2);
            int i14 = this.f12108d;
            int i15 = this.f12109e;
            int i16 = this.f12112h;
            iArr[0] = ((i13 + i14) - i15) + i16;
            iArr2[0] = i13 + i14;
            iArr3[0] = ((i13 + i14) - (i15 * 2)) + (i16 * 2);
            while (i12 < this.f12119o) {
                int[] iArr4 = this.f12115k;
                int[] iArr5 = this.f12116l;
                int i17 = i12 - 1;
                int i18 = iArr5[i17];
                int i19 = this.f12112h;
                iArr4[i12] = i18 + i19;
                iArr5[i12] = iArr5[i17] + this.f12109e;
                this.f12117m[i12] = iArr4[i17] + i19;
                i12++;
            }
        } else {
            int i20 = i10 + (requiredWidth / 2);
            int i21 = this.f12108d;
            int i22 = this.f12109e;
            int i23 = this.f12112h;
            iArr[0] = ((i20 - i21) + i22) - i23;
            iArr2[0] = i20 - i21;
            iArr3[0] = ((i20 - i21) + (i22 * 2)) - (i23 * 2);
            while (i12 < this.f12119o) {
                int[] iArr6 = this.f12115k;
                int[] iArr7 = this.f12116l;
                int i24 = i12 - 1;
                int i25 = iArr7[i24];
                int i26 = this.f12112h;
                iArr6[i12] = i25 - i26;
                iArr7[i12] = iArr7[i24] - this.f12109e;
                this.f12117m[i12] = iArr6[i24] - i26;
                i12++;
            }
        }
        this.f12118n = paddingTop + this.f12111g;
        a();
    }

    public final Animator c(float f10, float f11) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, F, f10, f11);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(E);
        return objectAnimatorOfFloat;
    }

    public final Animator d(float f10, float f11) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, G, f10, f11);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(E);
        return objectAnimatorOfFloat;
    }

    public final Animator e() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, H, (-this.f12112h) + this.f12109e, 0.0f);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(E);
        return objectAnimatorOfFloat;
    }

    public final int f(TypedArray typedArray, int i10, int i11) {
        return typedArray.getColor(i10, getResources().getColor(i11));
    }

    public final int g(TypedArray typedArray, int i10, int i11) {
        return typedArray.getDimensionPixelOffset(i10, getResources().getDimensionPixelOffset(i11));
    }

    @k.h1
    public int[] getDotSelectedLeftX() {
        return this.f12116l;
    }

    @k.h1
    public int[] getDotSelectedRightX() {
        return this.f12117m;
    }

    @k.h1
    public int[] getDotSelectedX() {
        return this.f12115k;
    }

    @k.h1
    public int getPageCount() {
        return this.f12119o;
    }

    public final Bitmap h() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), s3.a.f.f128674t);
        if (this.f12106b) {
            return bitmapDecodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
    }

    public void i(int i10, boolean z10) {
        if (this.f12120p == i10) {
            return;
        }
        if (this.f12127w.isStarted()) {
            this.f12127w.end();
        }
        int i11 = this.f12120p;
        this.f12121q = i11;
        if (z10) {
            this.f12126v.setTarget(this.f12114j[i11]);
            this.f12125u.setTarget(this.f12114j[i10]);
            this.f12127w.start();
        }
        setSelectedPage(i10);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f12119o; i10++) {
            this.f12114j[i10].c(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i11));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i11);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i10));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i10);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 0;
        if (this.f12106b != z10) {
            this.f12106b = z10;
            this.f12128x = h();
            d[] dVarArr = this.f12114j;
            if (dVarArr != null) {
                for (d dVar : dVarArr) {
                    dVar.g();
                }
            }
            b();
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        setMeasuredDimension(i10, i11);
        b();
    }

    public void setArrowBackgroundColor(@k.k int i10) {
        this.f12122r = i10;
    }

    public void setArrowColor(@k.k int i10) {
        if (this.f12129y == null) {
            this.f12129y = new Paint();
        }
        this.f12129y.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(@k.k int i10) {
        this.f12123s.setColor(i10);
    }

    public void setPageCount(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The page count should be a positive integer");
        }
        this.f12119o = i10;
        this.f12114j = new d[i10];
        for (int i11 = 0; i11 < this.f12119o; i11++) {
            this.f12114j[i11] = new d();
        }
        b();
        setSelectedPage(0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12127w = animatorSet;
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s3.a.n.F1, i10, 0);
        f2.z1.E1(this, context, s3.a.n.F1, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int iG = g(typedArrayObtainStyledAttributes, s3.a.n.M1, s3.a.e.f128538c2);
        this.f12108d = iG;
        this.f12107c = iG * 2;
        int iG2 = g(typedArrayObtainStyledAttributes, s3.a.n.I1, s3.a.e.Y1);
        this.f12111g = iG2;
        int i11 = iG2 * 2;
        this.f12110f = i11;
        this.f12109e = g(typedArrayObtainStyledAttributes, s3.a.n.L1, s3.a.e.f128533b2);
        this.f12112h = g(typedArrayObtainStyledAttributes, s3.a.n.K1, s3.a.e.X1);
        int iF = f(typedArrayObtainStyledAttributes, s3.a.n.J1, s3.a.d.D);
        Paint paint = new Paint(1);
        this.f12123s = paint;
        paint.setColor(iF);
        this.f12122r = f(typedArrayObtainStyledAttributes, s3.a.n.G1, s3.a.d.B);
        if (this.f12129y == null && typedArrayObtainStyledAttributes.hasValue(s3.a.n.H1)) {
            setArrowColor(typedArrayObtainStyledAttributes.getColor(s3.a.n.H1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f12106b = resources.getConfiguration().getLayoutDirection() == 0;
        int color = resources.getColor(s3.a.d.C);
        int dimensionPixelSize = resources.getDimensionPixelSize(s3.a.e.f128528a2);
        this.f12113i = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.f12124t = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(s3.a.e.Z1);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color);
        this.f12128x = h();
        this.f12130z = new Rect(0, 0, this.f12128x.getWidth(), this.f12128x.getHeight());
        this.A = this.f12128x.getWidth() / i11;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f12125u = animatorSet2;
        animatorSet2.playTogether(c(0.0f, 1.0f), d(iG * 2, iG2 * 2), e());
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f12126v = animatorSet3;
        animatorSet3.playTogether(c(1.0f, 0.0f), d(iG2 * 2, iG * 2), e());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }
}
