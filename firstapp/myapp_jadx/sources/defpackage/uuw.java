package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class uuw {
    public static final toe0 a = new toe0("NO_OWNER");
    public static t8d0 b;

    public static tuw a() {
        return new tuw(false);
    }

    public static int b(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2 || (i2 & 2) == 0) {
                    }
                } else if ((i2 & 1) == 0) {
                }
            }
            return i4;
        }
        return i;
    }
}
