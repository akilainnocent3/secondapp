package dc;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i implements tb.m<Bitmap> {
    @Override // tb.m
    @NonNull
    public final vb.v<Bitmap> b(@NonNull Context context, @NonNull vb.v<Bitmap> vVar, int i10, int i11) {
        if (!pc.o.x(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        wb.e eVarH = com.bumptech.glide.b.e(context).h();
        Bitmap bitmap = vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(eVarH, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? vVar : h.d(bitmapC, eVarH);
    }

    public abstract Bitmap c(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11);
}
