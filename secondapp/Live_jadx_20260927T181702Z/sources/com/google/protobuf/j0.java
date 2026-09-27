package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k
public final class j0 {
    private static final h0 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final h0 LITE_SCHEMA = new i0();

    public static h0 full() {
        return FULL_SCHEMA;
    }

    public static h0 lite() {
        return LITE_SCHEMA;
    }

    private static h0 loadSchemaForFullRuntime() {
        try {
            return (h0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
