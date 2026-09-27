package com.cleveradssolutions.mediation;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@dr.o(message = "Use new MediationAd implementation")
public final class q extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@oy.l String key) {
        super("ID not found with key " + key);
        m0.p(key, "key");
    }

    @Override // java.lang.Throwable
    @oy.l
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
