package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yii0 {
    public static final void a(String str, a aVar, final int i) {
        final String str2;
        b bVarI = aVar.i(-1082848366);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            str2 = str;
            mw90.a(str2, null, c.a(j.g(d.a.b, 1.0f), 1.6143497f), null, null, d0b.a.d, null, bVarI, (i2 & 14) | 1573296, 1976);
        } else {
            str2 = str;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str2, i) { // from class: xii0
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    yii0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
