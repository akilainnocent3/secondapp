package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnClickListener f12212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f12213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f12214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f12215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f12216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f12217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f12221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f12222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f12223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArgbEvaluator f12226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f12227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f12228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f12229s;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f12230d = 0.15f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @k.k
        public int f12231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @k.k
        public int f12232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @k.k
        public int f12233c;

        public a(@k.k int i10) {
            this(i10, i10);
        }

        public static int a(int i10) {
            return Color.argb((int) ((Color.alpha(i10) * 0.85f) + 38.25f), (int) ((Color.red(i10) * 0.85f) + 38.25f), (int) ((Color.green(i10) * 0.85f) + 38.25f), (int) ((Color.blue(i10) * 0.85f) + 38.25f));
        }

        public a(@k.k int i10, @k.k int i11) {
            this(i10, i11, 0);
        }

        public a(@k.k int i10, @k.k int i11, @k.k int i12) {
            this.f12231a = i10;
            this.f12232b = i11 == i10 ? a(i10) : i11;
            this.f12233c = i12;
        }
    }

    public SearchOrbView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(SearchOrbView searchOrbView, ValueAnimator valueAnimator) {
        searchOrbView.getClass();
        searchOrbView.setSearchOrbZ(valueAnimator.getAnimatedFraction());
    }

    public static /* synthetic */ void b(SearchOrbView searchOrbView, ValueAnimator valueAnimator) {
        searchOrbView.getClass();
        searchOrbView.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public void c(boolean z10) {
        float f10 = z10 ? this.f12218h : 1.0f;
        this.f12213c.animate().scaleX(f10).scaleY(f10).setDuration(this.f12220j).start();
        g(z10, this.f12220j);
        d(z10);
    }

    public void d(boolean z10) {
        this.f12224n = z10;
        h();
    }

    public void e(float f10) {
        this.f12214d.setScaleX(f10);
        this.f12214d.setScaleY(f10);
    }

    @Deprecated
    public void f(@k.k int i10, @k.k int i11) {
        setOrbColors(new a(i10, i11, 0));
    }

    public final void g(boolean z10, int i10) {
        if (this.f12228r == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f12228r = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.f12229s);
        }
        if (z10) {
            this.f12228r.start();
        } else {
            this.f12228r.reverse();
        }
        this.f12228r.setDuration(i10);
    }

    public float getFocusedZoom() {
        return this.f12218h;
    }

    public int getLayoutResourceId() {
        return s3.a.j.f128818a0;
    }

    @k.k
    public int getOrbColor() {
        return this.f12217g.f12231a;
    }

    public a getOrbColors() {
        return this.f12217g;
    }

    public Drawable getOrbIcon() {
        return this.f12216f;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.f12223m;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f12223m = null;
        }
        if (this.f12224n && this.f12225o) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f12226p, Integer.valueOf(this.f12217g.f12231a), Integer.valueOf(this.f12217g.f12232b), Integer.valueOf(this.f12217g.f12231a));
            this.f12223m = valueAnimatorOfObject;
            valueAnimatorOfObject.setRepeatCount(-1);
            this.f12223m.setDuration(this.f12219i * 2);
            this.f12223m.addUpdateListener(this.f12227q);
            this.f12223m.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12225o = true;
        h();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f12212b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f12225o = false;
        h();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        c(z10);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f12212b = onClickListener;
    }

    public void setOrbColor(int i10) {
        setOrbColors(new a(i10, i10, 0));
    }

    public void setOrbColors(a aVar) {
        this.f12217g = aVar;
        this.f12215e.setColorFilter(aVar.f12233c);
        if (this.f12223m == null) {
            setOrbViewColor(this.f12217g.f12231a);
        } else {
            d(true);
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.f12216f = drawable;
        this.f12215e.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i10) {
        if (this.f12214d.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.f12214d.getBackground()).setColor(i10);
        }
    }

    public void setSearchOrbZ(float f10) {
        View view = this.f12214d;
        float f11 = this.f12221k;
        f2.z1.J2(view, f11 + (f10 * (this.f12222l - f11)));
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s3.a.c.f128450n2);
    }

    @SuppressLint({"CustomViewStyleable"})
    public SearchOrbView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12226p = new ArgbEvaluator();
        this.f12227q = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.widget.l2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchOrbView.b(this.f12779b, valueAnimator);
            }
        };
        this.f12229s = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.widget.m2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchOrbView.a(this.f12808b, valueAnimator);
            }
        };
        Resources resources = context.getResources();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.f12213c = viewInflate;
        this.f12214d = viewInflate.findViewById(s3.a.h.f128710e2);
        ImageView imageView = (ImageView) viewInflate.findViewById(s3.a.h.H0);
        this.f12215e = imageView;
        this.f12218h = context.getResources().getFraction(s3.a.g.f128688h, 1, 1);
        this.f12219i = context.getResources().getInteger(s3.a.i.F);
        this.f12220j = context.getResources().getInteger(s3.a.i.G);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(s3.a.e.f128639w3);
        this.f12222l = dimensionPixelSize;
        this.f12221k = context.getResources().getDimensionPixelSize(s3.a.e.C3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s3.a.n.L2, i10, 0);
        f2.z1.E1(this, context, s3.a.n.L2, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(s3.a.n.O2);
        setOrbIcon(drawable == null ? resources.getDrawable(s3.a.f.f128670p) : drawable);
        int color = typedArrayObtainStyledAttributes.getColor(s3.a.n.N2, resources.getColor(s3.a.d.f128512n));
        setOrbColors(new a(color, typedArrayObtainStyledAttributes.getColor(s3.a.n.M2, color), typedArrayObtainStyledAttributes.getColor(s3.a.n.P2, 0)));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        f2.z1.J2(imageView, dimensionPixelSize);
    }
}
