package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.c;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ku5 {
    public final zt5 a;
    public final zt5 b;
    public final zt5 c;
    public final zt5 d;
    public final zt5 e;
    public final zt5 f;
    public final zt5 g;
    public final Paint h;

    public ku5(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(bbv.e(R.attr.materialCalendarStyle, context, c.class.getCanonicalName()).data, pk30.E);
        this.a = zt5.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.g = zt5.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.b = zt5.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.c = zt5.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListA = ecv.a(7, context, typedArrayObtainStyledAttributes);
        this.d = zt5.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.e = zt5.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f = zt5.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
