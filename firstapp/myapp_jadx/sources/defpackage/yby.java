package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class yby {
    public static final a a = new a();

    public static final class a implements l54<Object, Object> {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bmy.a(str);
    }

    public static void c(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
