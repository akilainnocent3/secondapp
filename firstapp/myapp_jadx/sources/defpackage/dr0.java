package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class dr0 {
    public final ImageView a;
    public dyf0 b;
    public int c = 0;

    public dr0(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        dyf0 dyf0Var;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            sdf.a(drawable);
        }
        if (drawable == null || (dyf0Var = this.b) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = zq0.b;
        jh50.h(drawable, dyf0Var, drawableState);
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = dl30.g;
        fyf0 fyf0VarF = fyf0.f(context, attributeSet, iArr, i);
        TypedArray typedArray = fyf0VarF.b;
        r6i0.o(imageView, imageView.getContext(), iArr, attributeSet, fyf0VarF.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = gr0.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                sdf.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(fyf0VarF.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(sdf.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            fyf0VarF.g();
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable drawableA = gr0.a(imageView.getContext(), i);
            if (drawableA != null) {
                sdf.a(drawableA);
            }
            imageView.setImageDrawable(drawableA);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
