package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class tix {
    public static final hjx a(vkx[] vkxVarArr, a aVar) {
        mr10.c(new vkx[0], aVar);
        final Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        Object[] objArrCopyOf = Arrays.copyOf(vkxVarArr, vkxVarArr.length);
        uv60 uv60Var = new uv60(new g7j(context, 1), new h0t());
        boolean zA = aVar.A(context);
        Object objY = aVar.y();
        if (zA || objY == a.C0041a.a) {
            objY = new Function0() { // from class: thx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    hjx hjxVar = new hjx(context);
                    igx igxVar = hjxVar.b;
                    igxVar.t.a(new sga());
                    igxVar.t.a(new vle());
                    return hjxVar;
                }
            };
            aVar.r(objY);
        }
        hjx hjxVar = (hjx) o350.c(objArrCopyOf, uv60Var, (Function0) objY, aVar, 0);
        for (vkx vkxVar : vkxVarArr) {
            hjxVar.b.t.a(vkxVar);
        }
        return hjxVar;
    }
}
