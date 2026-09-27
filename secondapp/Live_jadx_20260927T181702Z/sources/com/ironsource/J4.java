package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class J4 implements Me<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f59295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f59296b;

    public J4(@oy.l String encryptedResponse, @oy.l String descriptionKey) {
        kotlin.jvm.internal.m0.p(encryptedResponse, "encryptedResponse");
        kotlin.jvm.internal.m0.p(descriptionKey, "descriptionKey");
        this.f59295a = encryptedResponse;
        this.f59296b = descriptionKey;
    }

    @Override // com.ironsource.Me
    @oy.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String value = N9.b(this.f59296b, this.f59295a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        kotlin.jvm.internal.m0.o(value, "value");
        return value;
    }
}
