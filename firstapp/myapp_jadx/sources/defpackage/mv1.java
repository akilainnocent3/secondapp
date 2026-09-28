package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* JADX INFO: loaded from: classes4.dex */
public final class mv1 {
    public static final int[] a = {0, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1};
    public static final ShapeDrawable[] b = new ShapeDrawable[3];

    public static ShapeDrawable a(Context context, int i) {
        int i2 = a[i];
        ShapeDrawable[] shapeDrawableArr = b;
        if (shapeDrawableArr[0] == null) {
            shapeDrawableArr[0] = b(context, Color.parseColor("#0d9737"));
            shapeDrawableArr[1] = b(context, Color.parseColor("#e41827"));
            shapeDrawableArr[2] = b(context, -16777216);
        }
        return shapeDrawableArr[i2];
    }

    public static ShapeDrawable b(Context context, int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(kf9.a(context, 22));
        shapeDrawable.setIntrinsicHeight(kf9.a(context, 22));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }
}
