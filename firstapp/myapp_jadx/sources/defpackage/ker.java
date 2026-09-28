package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class ker {
    public static final void a(d dVar, a aVar, int i) {
        dVar.getClass();
        b bVarI = aVar.i(184674312);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            float fD = r8j0.c(q8j0.a.a(bVarI).f, bVarI).d();
            long j = j58.b;
            f4c f4cVar = xkf.a;
            Pair[] pairArr = new Pair[17];
            for (int i3 = 0; i3 < 17; i3++) {
                float f = i3 / 16.0f;
                pairArr[i3] = new Pair(Float.valueOf(f), new j58(j58.c((1.0f - f4cVar.a(f)) * 0.5f, j)));
            }
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(dVar, 1.0f), fD * 3.0f), ya5.a.i((Pair[]) Arrays.copyOf(pairArr, 17), 14), null, 0.0f, 6), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new kz3(dVar, i);
        }
    }
}
