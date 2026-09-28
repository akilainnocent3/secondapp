package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes7.dex */
public final class pi60 {
    public static final qyd0 a = new qyd0(new ki60());

    public static final float a(int i, int i2, a aVar) {
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        mmd mmdVar = (mmd) aVar.O(kna.h);
        Configuration configuration = (Configuration) aVar.O(AndroidCompositionLocals_androidKt.a);
        boolean zD = ((((i2 & 14) ^ 6) > 4 && aVar.d(i)) || (i2 & 6) == 4) | aVar.d(configuration.screenWidthDp) | aVar.d(configuration.screenHeightDp) | aVar.c(configuration.fontScale) | aVar.c(mmdVar.getDensity()) | aVar.c(mmdVar.y1());
        Object objY = aVar.y();
        if (zD || objY == a.C0041a.a) {
            objY = new g7f(mmdVar.v1(context.getResources().getDimension(i)));
            aVar.r(objY);
        }
        return ((g7f) objY).a;
    }

    public static final long b(int i, int i2, a aVar) {
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        mmd mmdVar = (mmd) aVar.O(kna.h);
        Configuration configuration = (Configuration) aVar.O(AndroidCompositionLocals_androidKt.a);
        boolean zD = ((((i2 & 14) ^ 6) > 4 && aVar.d(i)) || (i2 & 6) == 4) | aVar.d(configuration.screenWidthDp) | aVar.d(configuration.screenHeightDp) | aVar.c(configuration.fontScale) | aVar.c(mmdVar.getDensity()) | aVar.c(mmdVar.y1());
        Object objY = aVar.y();
        if (zD || objY == a.C0041a.a) {
            objY = new omf0(mmdVar.g0(context.getResources().getDimension(i)));
            aVar.r(objY);
        }
        return ((omf0) objY).a;
    }

    public static final imf0 c(imf0 imf0Var, int i, a aVar) {
        imf0Var.getClass();
        long jB = b(i, 6, aVar);
        return imf0.b(imf0Var, 0L, jB, null, null, null, 0L, null, null, null, 0, jB, null, null, 16646141);
    }
}
