package defpackage;

import android.view.ViewConfiguration;
import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class zdb0 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final h4d a(a aVar) {
        mmd mmdVar = (mmd) aVar.O(kna.h);
        boolean zC = aVar.c(mmdVar.getDensity());
        Object objY = aVar.y();
        if (zC || objY == a.C0041a.a) {
            objY = new i4d(new ydb0(mmdVar));
            aVar.r(objY);
        }
        return (h4d) objY;
    }
}
