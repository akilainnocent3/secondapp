package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rhs {
    public static final phs a;
    public static final qhs b;

    static {
        w630 w630Var = w630.c;
        phs phsVar = null;
        try {
            phsVar = (phs) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = phsVar;
        b = new qhs();
    }
}
