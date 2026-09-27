package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class C8 implements StateSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StateSerializer f95674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AESEncrypter f95675b;

    public C8(@NonNull StateSerializer<Object> stateSerializer, @NonNull AESEncrypter aESEncrypter) {
        this.f95674a = stateSerializer;
        this.f95675b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return this.f95674a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final byte[] toByteArray(@NonNull Object obj) {
        try {
            return this.f95675b.encrypt(this.f95674a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object toState(@NonNull byte[] bArr) throws IOException {
        try {
            return this.f95674a.toState(this.f95675b.decrypt(bArr));
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
