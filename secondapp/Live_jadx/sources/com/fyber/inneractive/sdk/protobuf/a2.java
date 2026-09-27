package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f47432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f47433b;

    static {
        z1 z1Var = null;
        try {
            z1Var = (z1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f47432a = z1Var;
        f47433b = new z1();
    }
}
