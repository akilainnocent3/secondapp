package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f47519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2 f47520b;

    static {
        k2 k2Var = null;
        try {
            k2Var = (k2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f47519a = k2Var;
        f47520b = new k2();
    }
}
