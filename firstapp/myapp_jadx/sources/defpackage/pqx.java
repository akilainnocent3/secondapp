package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pqx {
    public static final lqx a;
    public static final nqx b;

    static {
        w630 w630Var = w630.c;
        lqx lqxVar = null;
        try {
            lqxVar = (lqx) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = lqxVar;
        b = new nqx();
    }
}
