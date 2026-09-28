package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class wo9 {
    public static final op8 a = new op8(-962805098, new uo9(), false);
    public static final /* synthetic */ int b = 0;

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
