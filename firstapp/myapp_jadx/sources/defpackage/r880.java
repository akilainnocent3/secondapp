package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r880 {
    public static final ob80<q880> a = new ob80<>("SelectionHandleInfo");

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
