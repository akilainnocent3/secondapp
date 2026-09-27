package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Sj extends AbstractC5101hh {
    public Sj(@NonNull F6 f10) {
        super(f10);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5101hh, io.appmetrica.analytics.impl.InterfaceC5126ih
    public final boolean a(@Nullable Boolean bool) {
        return !this.f97517a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
