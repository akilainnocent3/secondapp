package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface Ba extends SimpleAdvertisingIdGetter, InterfaceC5209lm {
    @oy.l
    AdvertisingIdsHolder a();

    @oy.l
    AdvertisingIdsHolder a(@oy.l Hi hi2);

    @Override // io.appmetrica.analytics.impl.InterfaceC5209lm
    /* synthetic */ void a(@NonNull C5080gm c5080gm);

    void b(boolean z10);

    void c(boolean z10);

    @oy.l
    AdvertisingIdsHolder getIdentifiers();

    void init();
}
