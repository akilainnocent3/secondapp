package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w58 {
    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        if (a(j, 12884901888L)) {
            return "Rgb";
        }
        if (a(j, 12884901889L)) {
            return "Xyz";
        }
        if (a(j, 12884901890L)) {
            return "Lab";
        }
        return a(j, 17179869187L) ? "Cmyk" : "Unknown";
    }
}
