package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class wdw {
    public static final qyd0 a = new qyd0(new b2d(1));
    public static final qyd0 b = new qyd0(new d2d(1));

    static {
        hwr.b(new f38());
    }

    public static final float a(a aVar) {
        return ((Number) aVar.O(b)).floatValue() * ((vdw) aVar.O(a)).a;
    }

    public static final float b(int i, float f, boolean z, boolean z2) {
        float f2;
        float f3;
        if (i <= 0) {
            return 0.0f;
        }
        float f4 = 40.0f * f;
        float f5 = 6.0f * f;
        float f6 = 12.0f * f;
        float f7 = z2 ? 0.0f : f * 4.0f;
        if (z) {
            f2 = (f * 56.0f) + f4 + f7;
            int i2 = i - 1;
            f3 = ((i2 >= 0 ? i2 : 0) * f5) + ((i2 < 0 ? 0 : i2) * f4);
        } else {
            f2 = i * f4;
            int i3 = i - 1;
            f3 = (i3 >= 0 ? i3 : 0) * f5;
        }
        return ((f3 + f2) * 1.02f) + f6;
    }

    public static final long c(int i, a aVar) {
        aVar.N(-470900735);
        long jN = ((mmd) aVar.O(kna.h)).N(a(aVar) * i);
        aVar.H();
        return jN;
    }

    public static final vdw d(a aVar) {
        int i = ((Configuration) aVar.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
        boolean zD = aVar.d(i);
        Object objY = aVar.y();
        if (zD || objY == a.C0041a.a) {
            objY = new vdw(f.d(i / 360.0f, 1.0f, 1.4f));
            aVar.r(objY);
        }
        return (vdw) objY;
    }
}
