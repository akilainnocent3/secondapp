package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r7f {
    public static final boolean a(q7f q7fVar, long j) {
        if (!q7fVar.a.C) {
            return false;
        }
        iln ilnVar = pkd.f(q7fVar).U.c;
        if (!ilnVar.j0.C) {
            return false;
        }
        long jI0 = ilnVar.i0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jI0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI0 & 4294967295L));
        long j2 = q7fVar.G;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }
}
