package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class a54 {
    public static final Object a(wbp wbpVar, String str, wdp wdpVar, tae taeVar) {
        wbpVar.getClass();
        str.getClass();
        return new sep(wbpVar, wdpVar, str, taeVar.getDescriptor()).z(taeVar);
    }

    public static final int b(float f, int i, float[] fArr) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }
}
