package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qou {
    public static final mou a;
    public static final oou b;

    static {
        w630 w630Var = w630.c;
        mou mouVar = null;
        try {
            mouVar = (mou) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = mouVar;
        b = new oou();
    }
}
