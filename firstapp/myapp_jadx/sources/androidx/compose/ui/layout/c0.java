package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static final float a(y.a aVar, boolean z, b0[] b0VarArr, float f) {
        float f2 = Float.NaN;
        for (b0 b0Var : b0VarArr) {
            float fE = aVar.e(b0Var, Float.NaN);
            if (Float.isNaN(f2)) {
                f2 = fE;
            } else if (z == (fE > f2)) {
                f2 = fE;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }
}
