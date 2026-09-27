package sg.bigo.ads.common.utils;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f133436a = false;

    public static void a(String str) {
        if (f133436a) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b() {
        return f133436a;
    }

    public static void a(boolean z10) {
        f133436a = z10;
    }

    public static boolean a() {
        return false;
    }

    public static void c() {
    }
}
