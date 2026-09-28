package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class kn7 {
    public static final void a(final int i, a aVar, final d dVar, final String str) {
        str.getClass();
        b bVarI = aVar.i(-917614281);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | 48;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            dVar = d.a.b;
            q75.a(j.e(dVar, 1.0f), null, false, pp8.b(1428949409, new gn7(str, 0), bVarI), bVarI, 3072, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str) { // from class: hn7
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;

                {
                    this.a = str;
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kn7.a(qj40.a(1), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }
}
