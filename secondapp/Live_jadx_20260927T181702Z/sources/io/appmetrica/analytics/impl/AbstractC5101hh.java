package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC5101hh implements InterfaceC5126ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final DataSendingRestrictionController f97517a;

    public AbstractC5101hh(@NonNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.f97517a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5126ih
    public boolean a(@Nullable Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
