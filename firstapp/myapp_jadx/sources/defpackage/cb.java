package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class cb {
    public static final cb a = new cb();

    public static boolean a(String str) {
        if (str != null) {
            return ogx.a("^[a-zA-Z0-9]{4,15}$", str);
        }
        return false;
    }
}
