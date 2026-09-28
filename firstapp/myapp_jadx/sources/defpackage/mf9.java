package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class mf9 {
    public static final op8 a = new op8(1858504256, new lf9(), false);

    public static Object a(Object obj, String str) {
        try {
            return Class.forName(str).getDeclaredMethod("getNoop", null).invoke(null, null);
        } catch (Exception unused) {
            return obj;
        }
    }
}
