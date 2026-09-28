package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class oqx {
    public static final kqx a;
    public static final mqx b;

    static {
        kqx kqxVar = null;
        try {
            kqxVar = (kqx) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = kqxVar;
        b = new mqx();
    }
}
