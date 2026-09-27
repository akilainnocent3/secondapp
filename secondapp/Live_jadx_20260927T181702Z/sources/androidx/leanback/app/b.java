package androidx.leanback.app;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String A = "androidx.leanback.app.b";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f11176v = "BackgroundManager";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f11177w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f11178x = 255;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f11179y = 500;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f11180z = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f11181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f11182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f11183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f11184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.leanback.app.a f11186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11187g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f11191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ValueAnimator f11194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f11195o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f11198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Animator.AnimatorListener f11200t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f11201u;

    /* JADX INFO: renamed from: androidx.leanback.app.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0069b implements ValueAnimator.AnimatorUpdateListener {
        public C0069b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            b bVar = b.this;
            int i10 = bVar.f11196p;
            if (i10 != -1) {
                bVar.f11195o.c(i10, iIntValue);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f11206f = "BackgroundContinuity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final boolean f11207g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static c f11208h = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable f11210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WeakReference<Drawable.ConstantState> f11213e;

        public c() {
            e();
        }

        public static c c() {
            c cVar = f11208h;
            cVar.f11211c++;
            return cVar;
        }

        public int a() {
            return this.f11209a;
        }

        public Drawable b() {
            return this.f11210b;
        }

        public Drawable d(Context context, int i10) {
            Drawable.ConstantState constantState;
            WeakReference<Drawable.ConstantState> weakReference = this.f11213e;
            Drawable drawableNewDrawable = (weakReference == null || this.f11212d != i10 || (constantState = weakReference.get()) == null) ? null : constantState.newDrawable();
            if (drawableNewDrawable != null) {
                return drawableNewDrawable;
            }
            Drawable drawable = f1.d.getDrawable(context, i10);
            this.f11213e = new WeakReference<>(drawable.getConstantState());
            this.f11212d = i10;
            return drawable;
        }

        public final void e() {
            this.f11209a = 0;
            this.f11210b = null;
        }

        public void f(int i10) {
            this.f11209a = i10;
            this.f11210b = null;
        }

        public void g(Drawable drawable) {
            this.f11210b = drawable;
        }

        public void h() {
            int i10 = this.f11211c;
            if (i10 <= 0) {
                throw new IllegalStateException("Can't unref, count " + this.f11211c);
            }
            int i11 = i10 - 1;
            this.f11211c = i11;
            if (i11 == 0) {
                e();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends Drawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f11214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11215b;

        public d(Resources resources, Bitmap bitmap) {
            this(resources, bitmap, null);
        }

        public Bitmap a() {
            return this.f11214a.f11216a;
        }

        @Override // android.graphics.drawable.Drawable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a getConstantState() {
            return this.f11214a;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            a aVar = this.f11214a;
            if (aVar.f11216a == null) {
                return;
            }
            if (aVar.f11218c.getAlpha() < 255 && this.f11214a.f11218c.getColorFilter() != null) {
                throw new IllegalStateException("Can't draw with translucent alpha and color filter");
            }
            a aVar2 = this.f11214a;
            canvas.drawBitmap(aVar2.f11216a, aVar2.f11217b, aVar2.f11218c);
        }

        @Override // android.graphics.drawable.Drawable
        public ColorFilter getColorFilter() {
            return this.f11214a.f11218c.getColorFilter();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public Drawable mutate() {
            if (!this.f11215b) {
                this.f11215b = true;
                this.f11214a = new a(this.f11214a);
            }
            return this;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            mutate();
            if (this.f11214a.f11218c.getAlpha() != i10) {
                this.f11214a.f11218c.setAlpha(i10);
                invalidateSelf();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            mutate();
            this.f11214a.f11218c.setColorFilter(colorFilter);
            invalidateSelf();
        }

        public d(Resources resources, Bitmap bitmap, Matrix matrix) {
            this.f11214a = new a(bitmap, matrix);
        }

        public d(a aVar) {
            this.f11214a = aVar;
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends Drawable.ConstantState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bitmap f11216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Matrix f11217b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Paint f11218c;

            public a(Bitmap bitmap, Matrix matrix) {
                Paint paint = new Paint();
                this.f11218c = paint;
                this.f11216a = bitmap;
                this.f11217b = matrix == null ? new Matrix() : matrix;
                paint.setFilterBitmap(true);
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public int getChangingConfigurations() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public Drawable newDrawable() {
                return new d(this);
            }

            public a(a aVar) {
                Paint paint = new Paint();
                this.f11218c = paint;
                this.f11216a = aVar.f11216a;
                this.f11217b = aVar.f11217b != null ? new Matrix(aVar.f11217b) : new Matrix();
                if (aVar.f11218c.getAlpha() != 255) {
                    paint.setAlpha(aVar.f11218c.getAlpha());
                }
                if (aVar.f11218c.getColorFilter() != null) {
                    paint.setColorFilter(aVar.f11218c.getColorFilter());
                }
                paint.setFilterBitmap(true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Drawable f11219b;

        public e(Drawable drawable) {
            this.f11219b = drawable;
        }

        public void a() {
            Drawable drawable;
            b bVar = b.this;
            if (bVar.f11192l) {
                if (bVar.n() == null && (drawable = this.f11219b) != null) {
                    b.this.f11195o.d(s3.a.h.f128723i, drawable);
                    b bVar2 = b.this;
                    bVar2.f11195o.c(bVar2.f11196p, 0);
                }
                b.this.f11194n.setDuration(500L);
                b.this.f11194n.start();
            }
        }

        public final void b() {
            b bVar = b.this;
            if (bVar.f11195o == null) {
                return;
            }
            f fVarN = bVar.n();
            if (fVarN != null) {
                if (b.this.A(this.f11219b, fVarN.a())) {
                    return;
                }
                b bVar2 = b.this;
                bVar2.f11195o.a(s3.a.h.f128723i, bVar2.f11181a);
                b.this.f11195o.d(s3.a.h.f128727j, fVarN.a());
            }
            a();
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
            b.this.f11198r = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g extends d {
        public g(Resources resources) {
            super(resources, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends LayerDrawable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f[] f11223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WeakReference<b> f11226e;

        public h(b bVar, Drawable[] drawableArr) {
            super(drawableArr);
            this.f11224c = 255;
            this.f11226e = new WeakReference<>(bVar);
            int length = drawableArr.length;
            this.f11223b = new f[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.f11223b[i10] = new f(drawableArr[i10]);
            }
        }

        public void a(int i10, Context context) {
            for (int i11 = 0; i11 < getNumberOfLayers(); i11++) {
                if (getId(i11) == i10) {
                    this.f11223b[i11] = null;
                    if (getDrawable(i11) instanceof g) {
                        return;
                    }
                    super.setDrawableByLayerId(i10, b.e(context));
                    return;
                }
            }
        }

        public int b(int i10) {
            for (int i11 = 0; i11 < getNumberOfLayers(); i11++) {
                if (getId(i11) == i10) {
                    return i11;
                }
            }
            return -1;
        }

        public void c(int i10, int i11) {
            f fVar = this.f11223b[i10];
            if (fVar != null) {
                fVar.f11221a = i11;
                invalidateSelf();
            }
        }

        public f d(int i10, Drawable drawable) {
            super.setDrawableByLayerId(i10, drawable);
            for (int i11 = 0; i11 < getNumberOfLayers(); i11++) {
                if (getId(i11) == i10) {
                    this.f11223b[i11] = new f(drawable);
                    invalidateSelf();
                    return this.f11223b[i11];
                }
            }
            return null;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Drawable drawableA;
            int i10;
            int i11;
            int i12 = 0;
            while (true) {
                f[] fVarArr = this.f11223b;
                if (i12 >= fVarArr.length) {
                    return;
                }
                f fVar = fVarArr[i12];
                if (fVar != null && (drawableA = fVar.a()) != null) {
                    int iD = l1.d.d(drawableA);
                    int i13 = this.f11224c;
                    if (i13 < 255) {
                        i11 = i13 * iD;
                        i10 = 1;
                    } else {
                        i10 = 0;
                        i11 = iD;
                    }
                    int i14 = this.f11223b[i12].f11221a;
                    if (i14 < 255) {
                        i11 *= i14;
                        i10++;
                    }
                    if (i10 == 0) {
                        drawableA.draw(canvas);
                    } else {
                        if (i10 == 1) {
                            i11 /= 255;
                        } else if (i10 == 2) {
                            i11 /= 65025;
                        }
                        try {
                            this.f11225d = true;
                            drawableA.setAlpha(i11);
                            drawableA.draw(canvas);
                            drawableA.setAlpha(iD);
                            this.f11225d = false;
                        } catch (Throwable th2) {
                            this.f11225d = false;
                            throw th2;
                        }
                    }
                }
                i12++;
            }
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getAlpha() {
            return this.f11224c;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            if (this.f11225d) {
                return;
            }
            super.invalidateDrawable(drawable);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public Drawable mutate() {
            Drawable drawableMutate = super.mutate();
            int numberOfLayers = getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                f[] fVarArr = this.f11223b;
                f fVar = fVarArr[i10];
                if (fVar != null) {
                    fVarArr[i10] = new f(fVar, getDrawable(i10));
                }
            }
            return drawableMutate;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            if (this.f11224c != i10) {
                this.f11224c = i10;
                invalidateSelf();
                b bVar = this.f11226e.get();
                if (bVar != null) {
                    bVar.y();
                }
            }
        }

        @Override // android.graphics.drawable.LayerDrawable
        public boolean setDrawableByLayerId(int i10, Drawable drawable) {
            return d(i10, drawable) != null;
        }
    }

    public b(Activity activity) {
        a aVar = new a();
        this.f11200t = aVar;
        C0069b c0069b = new C0069b();
        this.f11201u = c0069b;
        this.f11181a = activity;
        this.f11184d = c.c();
        this.f11188h = this.f11181a.getResources().getDisplayMetrics().heightPixels;
        this.f11189i = this.f11181a.getResources().getDisplayMetrics().widthPixels;
        this.f11182b = new Handler();
        r3.a aVar2 = new r3.a();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        this.f11194n = valueAnimatorOfInt;
        valueAnimatorOfInt.addListener(aVar);
        valueAnimatorOfInt.addUpdateListener(c0069b);
        valueAnimatorOfInt.setInterpolator(aVar2);
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.windowBackground});
        this.f11185e = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        f(activity);
    }

    public static Drawable e(Context context) {
        return new g(context.getResources());
    }

    public static b p(Activity activity) {
        b bVarA;
        androidx.leanback.app.a aVar = (androidx.leanback.app.a) activity.getFragmentManager().findFragmentByTag(A);
        return (aVar == null || (bVarA = aVar.a()) == null) ? new b(activity) : bVarA;
    }

    public boolean A(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable2 != null) {
            if (drawable == drawable2) {
                return true;
            }
            if ((drawable instanceof d) && (drawable2 instanceof d) && ((d) drawable).a().sameAs(((d) drawable2).a())) {
                return true;
            }
            if ((drawable instanceof ColorDrawable) && (drawable2 instanceof ColorDrawable) && ((ColorDrawable) drawable).getColor() == ((ColorDrawable) drawable2).getColor()) {
                return true;
            }
        }
        return false;
    }

    public void B(boolean z10) {
        this.f11187g = z10;
    }

    public void C(Bitmap bitmap) {
        Matrix matrix = null;
        if (bitmap == null) {
            F(null);
            return;
        }
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return;
        }
        if (bitmap.getWidth() != this.f11189i || bitmap.getHeight() != this.f11188h) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = this.f11188h;
            int i11 = width * i10;
            int i12 = this.f11189i;
            float f10 = i11 > i12 * height ? i10 / height : i12 / width;
            int iMax = Math.max(0, (width - Math.min((int) (i12 / f10), width)) / 2);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(f10, f10);
            matrix2.preTranslate(-iMax, 0.0f);
            matrix = matrix2;
        }
        F(new d(this.f11181a.getResources(), bitmap, matrix));
    }

    public void D(@k.k int i10) {
        this.f11184d.f(i10);
        this.f11190j = i10;
        this.f11191k = null;
        if (this.f11195o == null) {
            return;
        }
        G(k());
    }

    public void F(Drawable drawable) {
        this.f11184d.g(drawable);
        this.f11191k = drawable;
        if (this.f11195o == null) {
            return;
        }
        if (drawable == null) {
            G(k());
        } else {
            G(drawable);
        }
    }

    public final void G(Drawable drawable) {
        if (!this.f11192l) {
            throw new IllegalStateException("Must attach before setting background drawable");
        }
        e eVar = this.f11198r;
        if (eVar != null) {
            if (A(drawable, eVar.f11219b)) {
                return;
            }
            this.f11182b.removeCallbacks(this.f11198r);
            this.f11198r = null;
        }
        this.f11198r = new e(drawable);
        this.f11199s = true;
        y();
    }

    public void H(int i10) {
        this.f11185e = i10;
    }

    public final void I() {
        int iA = this.f11184d.a();
        Drawable drawableB = this.f11184d.b();
        this.f11190j = iA;
        this.f11191k = drawableB == null ? null : drawableB.getConstantState().newDrawable().mutate();
        J();
    }

    public final void J() {
        if (this.f11192l) {
            u();
            Drawable drawable = this.f11191k;
            if (drawable == null) {
                this.f11195o.d(s3.a.h.f128723i, k());
            } else {
                this.f11195o.d(s3.a.h.f128723i, drawable);
            }
            this.f11195o.a(s3.a.h.f128727j, this.f11181a);
        }
    }

    public void a(Window window) {
        c(window.getDecorView());
    }

    public void b(View view) {
        c(view);
        this.f11181a.getWindow().getDecorView().setBackground(Build.VERSION.SDK_INT >= 26 ? null : new ColorDrawable(0));
    }

    public void c(View view) {
        if (this.f11192l) {
            throw new IllegalStateException("Already attached to " + this.f11183c);
        }
        this.f11183c = view;
        this.f11192l = true;
        I();
    }

    public void d() {
        F(null);
    }

    public final void f(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = A;
        androidx.leanback.app.a aVar = (androidx.leanback.app.a) fragmentManager.findFragmentByTag(str);
        if (aVar == null) {
            aVar = new androidx.leanback.app.a();
            activity.getFragmentManager().beginTransaction().add(aVar, str).commit();
        } else if (aVar.a() != null) {
            throw new IllegalStateException("Created duplicated BackgroundManager for same activity, please use getInstance() instead");
        }
        aVar.b(this);
        this.f11186f = aVar;
    }

    public h g(LayerDrawable layerDrawable) {
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i10 = 0; i10 < numberOfLayers; i10++) {
            drawableArr[i10] = layerDrawable.getDrawable(i10);
        }
        h hVar = new h(this, drawableArr);
        for (int i11 = 0; i11 < numberOfLayers; i11++) {
            hVar.setId(i11, layerDrawable.getId(i11));
        }
        return hVar;
    }

    public void h() {
        z();
        this.f11183c = null;
        this.f11192l = false;
        c cVar = this.f11184d;
        if (cVar != null) {
            cVar.h();
            this.f11184d = null;
        }
    }

    @k.k
    public final int i() {
        return this.f11190j;
    }

    @Deprecated
    public Drawable j() {
        return f1.d.getDrawable(this.f11181a, s3.a.d.f128500b);
    }

    public Drawable k() {
        return this.f11190j != 0 ? new ColorDrawable(this.f11190j) : r();
    }

    @Deprecated
    public Drawable l() {
        return null;
    }

    public Drawable m() {
        return this.f11191k;
    }

    public f n() {
        h hVar = this.f11195o;
        if (hVar == null) {
            return null;
        }
        return hVar.f11223b[this.f11196p];
    }

    public f o() {
        h hVar = this.f11195o;
        if (hVar == null) {
            return null;
        }
        return hVar.f11223b[this.f11197q];
    }

    public final long q() {
        return Math.max(0L, (this.f11193m + 500) - System.currentTimeMillis());
    }

    public final Drawable r() {
        int i10 = this.f11185e;
        Drawable drawableD = i10 != -1 ? this.f11184d.d(this.f11181a, i10) : null;
        return drawableD == null ? e(this.f11181a) : drawableD;
    }

    public boolean s() {
        return this.f11192l;
    }

    public boolean t() {
        return this.f11187g;
    }

    public final void u() {
        if (this.f11195o != null) {
            return;
        }
        h hVarG = g((LayerDrawable) f1.d.getDrawable(this.f11181a, s3.a.f.f128657c).mutate());
        this.f11195o = hVarG;
        this.f11196p = hVarG.b(s3.a.h.f128723i);
        this.f11197q = this.f11195o.b(s3.a.h.f128727j);
        if (this.f11183c.getBackground() != null) {
            this.f11195o.setAlpha(this.f11183c.getBackground().getAlpha());
        }
        this.f11183c.setBackground(this.f11195o);
    }

    public void v() {
        J();
    }

    public void w() {
        y();
    }

    public void x() {
        if (t()) {
            z();
        }
    }

    public void y() {
        if (this.f11198r == null || !this.f11199s || this.f11194n.isStarted() || !this.f11186f.isResumed() || this.f11195o.getAlpha() < 255) {
            return;
        }
        long jQ = q();
        this.f11193m = System.currentTimeMillis();
        this.f11182b.postDelayed(this.f11198r, jQ);
        this.f11199s = false;
    }

    public void z() {
        e eVar = this.f11198r;
        if (eVar != null) {
            this.f11182b.removeCallbacks(eVar);
            this.f11198r = null;
        }
        if (this.f11194n.isStarted()) {
            this.f11194n.cancel();
        }
        h hVar = this.f11195o;
        if (hVar != null) {
            hVar.a(s3.a.h.f128723i, this.f11181a);
            this.f11195o.a(s3.a.h.f128727j, this.f11181a);
            this.f11195o = null;
        }
        this.f11191k = null;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Drawable f11222b;

        public f(Drawable drawable) {
            this.f11221a = 255;
            this.f11222b = drawable;
        }

        public Drawable a() {
            return this.f11222b;
        }

        public void b(int i10) {
            ((ColorDrawable) this.f11222b).setColor(i10);
        }

        public f(f fVar, Drawable drawable) {
            this.f11221a = 255;
            this.f11222b = drawable;
            this.f11221a = fVar.f11221a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f11202b = new RunnableC0068a();

        /* JADX INFO: renamed from: androidx.leanback.app.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC0068a implements Runnable {
            public RunnableC0068a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.y();
            }
        }

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            h hVar = bVar.f11195o;
            if (hVar != null) {
                hVar.a(s3.a.h.f128727j, bVar.f11181a);
            }
            b.this.f11182b.post(this.f11202b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Deprecated
    public void E(Drawable drawable) {
    }
}
