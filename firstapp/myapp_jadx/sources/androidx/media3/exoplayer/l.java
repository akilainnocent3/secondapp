package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface l {

    public interface a {
    }

    static boolean g(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    static int k(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    int d(androidx.media3.common.a aVar);

    String getName();

    int x();
}
