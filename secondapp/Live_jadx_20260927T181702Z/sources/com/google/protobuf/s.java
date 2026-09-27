package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k
public final class s {
    private static final q<?> LITE_SCHEMA = new r();
    private static final q<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    public static q<?> full() {
        q<?> qVar = FULL_SCHEMA;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static q<?> lite() {
        return LITE_SCHEMA;
    }

    private static q<?> loadSchemaForFullRuntime() {
        try {
            return (q) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
