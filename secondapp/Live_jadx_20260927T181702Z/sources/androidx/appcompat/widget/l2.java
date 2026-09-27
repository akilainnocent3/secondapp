package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f7215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f7216c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(21)
    public static class a {
        @k.t
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @k.t
        public static int b(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public l2(Context context, TypedArray typedArray) {
        this.f7214a = context;
        this.f7215b = typedArray;
    }

    public static l2 E(Context context, int i10, int[] iArr) {
        return new l2(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static l2 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new l2(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static l2 G(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new l2(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean A(int i10, TypedValue typedValue) {
        return this.f7215b.getValue(i10, typedValue);
    }

    public TypedArray B() {
        return this.f7215b;
    }

    public boolean C(int i10) {
        return this.f7215b.hasValue(i10);
    }

    public int D() {
        return this.f7215b.length();
    }

    public TypedValue H(int i10) {
        return this.f7215b.peekValue(i10);
    }

    public void I() {
        this.f7215b.recycle();
    }

    public boolean a(int i10, boolean z10) {
        return this.f7215b.getBoolean(i10, z10);
    }

    @k.t0(21)
    public int b() {
        return a.a(this.f7215b);
    }

    public int c(int i10, int i11) {
        return this.f7215b.getColor(i10, i11);
    }

    public ColorStateList d(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f7215b.hasValue(i10) || (resourceId = this.f7215b.getResourceId(i10, 0)) == 0 || (colorStateListA = n.a.a(this.f7214a, resourceId)) == null) ? this.f7215b.getColorStateList(i10) : colorStateListA;
    }

    public float e(int i10, float f10) {
        return this.f7215b.getDimension(i10, f10);
    }

    public int f(int i10, int i11) {
        return this.f7215b.getDimensionPixelOffset(i10, i11);
    }

    public int g(int i10, int i11) {
        return this.f7215b.getDimensionPixelSize(i10, i11);
    }

    public Drawable h(int i10) {
        int resourceId;
        return (!this.f7215b.hasValue(i10) || (resourceId = this.f7215b.getResourceId(i10, 0)) == 0) ? this.f7215b.getDrawable(i10) : n.a.b(this.f7214a, resourceId);
    }

    public Drawable i(int i10) {
        int resourceId;
        if (!this.f7215b.hasValue(i10) || (resourceId = this.f7215b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return u.b().d(this.f7214a, resourceId, true);
    }

    public float j(int i10, float f10) {
        return this.f7215b.getFloat(i10, f10);
    }

    @Nullable
    public Typeface k(@k.d1 int i10, int i11, @Nullable h1.i.f fVar) {
        int resourceId = this.f7215b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f7216c == null) {
            this.f7216c = new TypedValue();
        }
        return h1.i.k(this.f7214a, resourceId, this.f7216c, i11, fVar);
    }

    public float l(int i10, int i11, int i12, float f10) {
        return this.f7215b.getFraction(i10, i11, i12, f10);
    }

    public int m(int i10) {
        return this.f7215b.getIndex(i10);
    }

    public int n() {
        return this.f7215b.getIndexCount();
    }

    public int o(int i10, int i11) {
        return this.f7215b.getInt(i10, i11);
    }

    public int p(int i10, int i11) {
        return this.f7215b.getInteger(i10, i11);
    }

    public int q(int i10, int i11) {
        return this.f7215b.getLayoutDimension(i10, i11);
    }

    public int r(int i10, String str) {
        return this.f7215b.getLayoutDimension(i10, str);
    }

    public String s(int i10) {
        return this.f7215b.getNonResourceString(i10);
    }

    public String t() {
        return this.f7215b.getPositionDescription();
    }

    public int u(int i10, int i11) {
        return this.f7215b.getResourceId(i10, i11);
    }

    public Resources v() {
        return this.f7215b.getResources();
    }

    public String w(int i10) {
        return this.f7215b.getString(i10);
    }

    public CharSequence x(int i10) {
        return this.f7215b.getText(i10);
    }

    public CharSequence[] y(int i10) {
        return this.f7215b.getTextArray(i10);
    }

    public int z(int i10) {
        return a.b(this.f7215b, i10);
    }
}
