package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class pou {
    public static final lou a;
    public static final nou b;

    static {
        lou louVar = null;
        try {
            louVar = (lou) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = louVar;
        b = new nou();
    }
}
