package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w3g0 {
    public static final long a = a.a(0, 0, 0, 0);
    public static final /* synthetic */ int b = 0;

    public static final class a {
        public static long a(int i, int i2, int i3, int i4) {
            return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
        }
    }
}
