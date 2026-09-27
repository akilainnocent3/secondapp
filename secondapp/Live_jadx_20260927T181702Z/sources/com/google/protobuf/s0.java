package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k
public final class s0 {
    private static final q0 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final q0 LITE_SCHEMA = new r0();

    public static q0 full() {
        return FULL_SCHEMA;
    }

    public static q0 lite() {
        return LITE_SCHEMA;
    }

    private static q0 loadSchemaForFullRuntime() {
        try {
            return (q0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
