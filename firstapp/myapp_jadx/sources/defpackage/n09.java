package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n09 {
    public static final op8 a = new op8(175041128, new m09(), false);
    public static final /* synthetic */ int b = 0;

    public static final long a(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = jsg0.c;
        return jFloatToRawIntBits;
    }
}
