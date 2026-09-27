package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5318q6 implements CryptoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AESRSAEncrypter f98180a = new AESRSAEncrypter();

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider
    @oy.l
    public final Encrypter getAesRsaEncrypter() {
        return this.f98180a;
    }
}
