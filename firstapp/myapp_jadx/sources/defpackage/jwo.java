package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jwo {
    public static final long a(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }
}
