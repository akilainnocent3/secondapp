package io.appmetrica.analytics.impl;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class M9 implements H8 {
    @Override // io.appmetrica.analytics.impl.H8
    public final A8 a(Q5 q10) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.H8
    public final byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public final J8 a() {
        return J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
