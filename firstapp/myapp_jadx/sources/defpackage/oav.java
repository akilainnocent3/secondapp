package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oav {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(1248137076);
        if (bVarI.q(i & 1, i != 0)) {
            d dVarE = j.e(d.a.b, 1.0f);
            List listK = kotlin.collections.b.k(new j58(j58.l), new j58(j58.c(0.85f, j58.b)));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            ty0.a(bVarI, androidx.compose.foundation.a.a(dVarE, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) == 0 ? 2 : 0), null, 0.0f, 6));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new aj8(i, 1);
        }
    }
}
