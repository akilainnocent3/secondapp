package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w3h {
    public static final u3h a = new u3h();
    public static final s3h<?> b;

    static {
        s3h<?> s3hVar = null;
        try {
            s3hVar = (s3h) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = s3hVar;
    }
}
