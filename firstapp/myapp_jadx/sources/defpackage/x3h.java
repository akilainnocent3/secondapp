package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x3h {
    public static final v3h a = new v3h();
    public static final t3h<?> b;

    static {
        w630 w630Var = w630.c;
        t3h<?> t3hVar = null;
        try {
            t3hVar = (t3h) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = t3hVar;
    }
}
