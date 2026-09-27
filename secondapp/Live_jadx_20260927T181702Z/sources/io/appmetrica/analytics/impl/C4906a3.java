package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4906a3 extends N2 {
    public C4906a3(int i10, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i10, str, publicLogger);
    }

    @k.h1(otherwise = 3)
    public final int b() {
        return this.f96189a;
    }

    @Override // io.appmetrica.analytics.impl.Mn
    @Nullable
    public final byte[] a(@Nullable byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i10 = this.f96189a;
            if (length > i10) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                this.f96191c.warning("\"%s\" %s exceeded limit of %d bytes", this.f96190b, bArr, Integer.valueOf(this.f96189a));
                return bArr2;
            }
        }
        return bArr;
    }

    @NonNull
    @k.h1(otherwise = 3)
    public final String a() {
        return this.f96190b;
    }
}
