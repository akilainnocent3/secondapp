package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wd40 {
    public static final void a(final float f, final int i, a aVar, final d dVar) {
        b bVarI = aVar.i(-1262064869);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | 48;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(dVar, 1.0f), 160.0f), ya5.a.i(new Pair[]{new Pair(Float.valueOf(0.0f), new j58(j58.l)), new Pair(Float.valueOf(0.25f), new j58(r58.b(855638016))), new Pair(Float.valueOf(0.6f), new j58(r58.d(2566914048L))), new Pair(Float.valueOf(1.0f), new j58(r58.d(4278190080L)))}, 14), null, 0.0f, 6), bVarI, 0);
            f = 160.0f;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, i, dVar) { // from class: vd40
                public final /* synthetic */ d a;
                public final /* synthetic */ float b;

                {
                    this.a = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wd40.a(this.b, iA, (a) obj, this.a);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, float f, float f2, a aVar, final int i) {
        final float f3;
        final float f4;
        b bVarI = aVar.i(313237331);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | 432;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarI = j.i(j.g(dVar, 1.0f), 60.0f);
            f4 = 0.6f;
            List listK = kotlin.collections.b.k(new j58(r58.e(0.0f, 0.0f, 0.0f, 0.6f, 16)), new j58(j58.l));
            float f5 = (4 & 14) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            int i3 = (14 & 8) != 0 ? 0 : 2;
            g75.a(androidx.compose.foundation.a.a(dVarI, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), i3), null, 0.0f, 6), bVarI, 0);
            f3 = 60.0f;
        } else {
            bVarI.G();
            f3 = f;
            f4 = f2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f3, f4, i) { // from class: ud40
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wd40.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
