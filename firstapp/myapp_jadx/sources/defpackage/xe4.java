package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class xe4 implements nsg0<Bitmap> {
    @Override // defpackage.nsg0
    public final qg50<Bitmap> a(Context context, qg50<Bitmap> qg50Var, int i, int i2) {
        if (!erh0.i(i, i2)) {
            hb5.a(n36.a("Cannot apply transformation on width: ", i, i2, " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
            return null;
        }
        ue4 ue4Var = a.a(context).a;
        Bitmap bitmap = qg50Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(ue4Var, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? qg50Var : we4.e(ue4Var, bitmapC);
    }

    public abstract Bitmap c(ue4 ue4Var, Bitmap bitmap, int i, int i2);
}
