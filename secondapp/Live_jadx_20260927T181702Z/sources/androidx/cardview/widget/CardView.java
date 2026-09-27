package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e0.b;
import e0.d;
import e0.e;
import k.k;
import k.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f7505i = {R.attr.colorBackground};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f7506j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f7511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f7512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f7513h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f7514a;

        public a() {
        }

        @Override // e0.d
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f7512g.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f7511f;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // e0.d
        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // e0.d
        public void c(int i10, int i11) {
            CardView cardView = CardView.this;
            if (i10 > cardView.f7509d) {
                CardView.super.setMinimumWidth(i10);
            }
            CardView cardView2 = CardView.this;
            if (i11 > cardView2.f7510e) {
                CardView.super.setMinimumHeight(i11);
            }
        }

        @Override // e0.d
        public void d(Drawable drawable) {
            this.f7514a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // e0.d
        public Drawable e() {
            return this.f7514a;
        }

        @Override // e0.d
        public boolean f() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // e0.d
        public View g() {
            return CardView.this;
        }
    }

    static {
        b bVar = new b();
        f7506j = bVar;
        bVar.j();
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f7506j.h(this.f7513h);
    }

    public float getCardElevation() {
        return f7506j.k(this.f7513h);
    }

    @q0
    public int getContentPaddingBottom() {
        return this.f7511f.bottom;
    }

    @q0
    public int getContentPaddingLeft() {
        return this.f7511f.left;
    }

    @q0
    public int getContentPaddingRight() {
        return this.f7511f.right;
    }

    @q0
    public int getContentPaddingTop() {
        return this.f7511f.top;
    }

    public float getMaxCardElevation() {
        return f7506j.n(this.f7513h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f7508c;
    }

    public float getRadius() {
        return f7506j.i(this.f7513h);
    }

    public boolean getUseCompatPadding() {
        return this.f7507b;
    }

    public void h(@q0 int i10, @q0 int i11, @q0 int i12, @q0 int i13) {
        this.f7511f.set(i10, i11, i12, i13);
        f7506j.b(this.f7513h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        e eVar = f7506j;
        if (eVar instanceof b) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.d(this.f7513h)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.l(this.f7513h)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(@k int i10) {
        f7506j.o(this.f7513h, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f7506j.a(this.f7513h, f10);
    }

    public void setMaxCardElevation(float f10) {
        f7506j.f(this.f7513h, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f7510e = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f7509d = i10;
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f7508c) {
            this.f7508c = z10;
            f7506j.m(this.f7513h);
        }
    }

    public void setRadius(float f10) {
        f7506j.c(this.f7513h, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f7507b != z10) {
            this.f7507b = z10;
            f7506j.e(this.f7513h);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, d0.a.C0758a.f77407g);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        f7506j.o(this.f7513h, colorStateList);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f7511f = rect;
        this.f7512g = new Rect();
        a aVar = new a();
        this.f7513h = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d0.a.e.f77424a, i10, d0.a.d.f77421b);
        if (typedArrayObtainStyledAttributes.hasValue(d0.a.e.f77427d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(d0.a.e.f77427d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f7505i);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(d0.a.b.f77414b);
            } else {
                color = getResources().getColor(d0.a.b.f77413a);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(d0.a.e.f77428e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(d0.a.e.f77429f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(d0.a.e.f77430g, 0.0f);
        this.f7507b = typedArrayObtainStyledAttributes.getBoolean(d0.a.e.f77432i, false);
        this.f7508c = typedArrayObtainStyledAttributes.getBoolean(d0.a.e.f77431h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(d0.a.e.f77433j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(d0.a.e.f77435l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(d0.a.e.f77437n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(d0.a.e.f77436m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(d0.a.e.f77434k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f7509d = typedArrayObtainStyledAttributes.getDimensionPixelSize(d0.a.e.f77425b, 0);
        this.f7510e = typedArrayObtainStyledAttributes.getDimensionPixelSize(d0.a.e.f77426c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f7506j.g(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
