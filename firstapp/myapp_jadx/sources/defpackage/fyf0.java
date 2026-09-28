package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class fyf0 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public fyf0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static fyf0 e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new fyf0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static fyf0 f(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new fyf0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = o0b.b(this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : gr0.a(this.a, resourceId);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable drawableC;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        zq0 zq0VarA = zq0.a();
        Context context = this.a;
        synchronized (zq0VarA) {
            drawableC = zq0VarA.a.c(resourceId, context, true);
        }
        return drawableC;
    }

    public final Typeface d(int i, int i2, jr0.a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        ThreadLocal<TypedValue> threadLocal = th50.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return th50.c(context, resourceId, typedValue2, i2, aVar, true, false);
    }

    public final void g() {
        this.b.recycle();
    }
}
