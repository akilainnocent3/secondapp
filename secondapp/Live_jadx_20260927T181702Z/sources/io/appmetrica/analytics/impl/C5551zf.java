package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5551zf extends C5346ra {
    public C5551zf(int i10) {
        super(i10);
    }

    @Override // io.appmetrica.analytics.impl.C5346ra
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(@Nullable Z z10) {
        if (z10 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z10.f96852b) + 12;
    }
}
