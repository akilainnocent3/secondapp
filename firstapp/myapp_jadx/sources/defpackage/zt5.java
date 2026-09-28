package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class zt5 {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final rx80 f;

    public zt5(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, rx80 rx80Var, Rect rect) {
        km20.e(rect.left);
        km20.e(rect.top);
        km20.e(rect.right);
        km20.e(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = rx80Var;
    }

    public static zt5 a(Context context, int i) {
        km20.a("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, pk30.F);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListA = ecv.a(4, context, typedArrayObtainStyledAttributes);
        ColorStateList colorStateListA2 = ecv.a(9, context, typedArrayObtainStyledAttributes);
        ColorStateList colorStateListA3 = ecv.a(7, context, typedArrayObtainStyledAttributes);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rx80 rx80VarA = rx80.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new zt5(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, rx80VarA, rect);
    }

    public final void b(TextView textView) {
        fcv fcvVar = new fcv();
        fcv fcvVar2 = new fcv();
        rx80 rx80Var = this.f;
        fcvVar.setShapeAppearanceModel(rx80Var);
        fcvVar2.setShapeAppearanceModel(rx80Var);
        fcvVar.s(this.c);
        fcvVar.z(this.e);
        fcvVar.y(this.d);
        ColorStateList colorStateList = this.b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), fcvVar, fcvVar2);
        Rect rect = this.a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
