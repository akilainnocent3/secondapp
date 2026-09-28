package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class d35 {
    public static final d a(d dVar, float f, long j, qx80 qx80Var) {
        return b(dVar, f, new soa0(j), qx80Var);
    }

    public static final d b(d dVar, float f, ya5 ya5Var, qx80 qx80Var) {
        return dVar.n(new BorderModifierNodeElement(f, ya5Var, qx80Var));
    }

    public static final long c(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
