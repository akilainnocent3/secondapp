package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes7.dex */
public final class oka {
    public static final d a(int i, a aVar, d dVar, String str) {
        dVar.getClass();
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        boolean z = (((i & 112) ^ 48) > 32 && aVar.M(str)) || (i & 48) == 32;
        Object objY = aVar.y();
        if (z || objY == a.C0041a.a) {
            objY = context.getPackageName() + ":id/" + str;
            aVar.r(objY);
        }
        return androidx.compose.ui.platform.d.a(dVar, (String) objY);
    }
}
