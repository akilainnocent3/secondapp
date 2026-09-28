package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ao7 implements qx80 {
    public static final ao7 a = new ao7();

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        float fC = yw90.c(j) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
        return new b9z.c(bys.c(pk40.b(0L, j), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
    }
}
