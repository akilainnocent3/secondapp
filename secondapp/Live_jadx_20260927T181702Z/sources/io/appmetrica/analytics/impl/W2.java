package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V2 f96651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GZIPCompressor f96652b;

    public W2() {
        this(new V2(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            V2 v10 = this.f96651a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            v10.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter("AES/CBC/PKCS5Padding", bytes, bArrCopyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f96652b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public W2(V2 v10, GZIPCompressor gZIPCompressor) {
        this.f96651a = v10;
        this.f96652b = gZIPCompressor;
    }
}
