package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gm20 {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        hb5.a(str);
    }

    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bmy.a(str);
    }
}
