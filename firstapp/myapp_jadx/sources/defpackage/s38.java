package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class s38 {
    public static final /* synthetic */ int a = 0;

    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            bmy.a(wga.a(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            bmy.a(aya.b(obj, "null value in entry: ", "=null"));
        }
    }

    public static void b(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }
}
